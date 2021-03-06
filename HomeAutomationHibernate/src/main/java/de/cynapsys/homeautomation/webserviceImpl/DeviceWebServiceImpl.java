/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cynapsys.homeautomation.webserviceImpl;

import de.cynapsys.homeautomation.entity.Device;
import de.cynapsys.homeautomation.service.DeviceService;
import de.cynapsys.homeautomation.serviceImpl.DeviceServiceImpl;
import de.cynapsys.homeautomation.webservice.DeviceWebService;
import java.util.ArrayList;
import javax.jws.WebService;
/**
 *
 * @author mouadh
 */
@WebService(endpointInterface = "de.cynapsys.homeautomation.webservice.DeviceWebService")
public class DeviceWebServiceImpl implements DeviceWebService{

    
//        ClassPathXmlApplicationContext cpx; 
//        DeviceService deviceService; 
//        
//        
    DeviceService deviceService = new DeviceServiceImpl();
//        
//        
//    public DeviceWebServiceImpl() {
//        
//        cpx = new ClassPathXmlApplicationContext("classpath:config/spring-config.xml");
//        deviceService = cpx.getBean(DeviceService.class);
//        
//    }

    @Override
    public ArrayList<Device> getAllDevices() {
        return (ArrayList)deviceService.getAllDevices();
    }

    @Override
    public Device getDeviceByID(Long deviceID) {
        return (Device) deviceService.getDeviceById(deviceID);
    }

    @Override
    public int getValue(Long deviceID) {
        Device device = getDeviceByID(deviceID);
        return device.getCurrentValue();
    }

    @Override
    public boolean setValue(Long deviceID, int value) {
        try{
            Device device = getDeviceByID(deviceID);
            device.setCurrentValue(value);
            deviceService.updateDevice(device);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    public Long addDevice(Device device) {
        return deviceService.addDevice(device);
    }

    @Override
    public boolean deleteDevice(Long deviceID) {

           return deviceService.deleteDevice(deviceID);

    }

    @Override
    public boolean updateDevice(Device device) {

         return   deviceService.updateDevice(device);

    }
    
}
