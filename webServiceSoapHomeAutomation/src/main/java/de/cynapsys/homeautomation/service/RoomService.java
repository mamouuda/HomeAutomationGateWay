/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cynapsys.homeautomation.service;

import de.cynapsys.homeautomation.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author mouadh
 */
public interface RoomService extends JpaRepository <Room, Long> {
    
}
