/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cynapsys.homeautomation.webserviceImpl;

import de.cynapsys.homeautomation.entity.Category;
import de.cynapsys.homeautomation.service.CategoryService;
import de.cynapsys.homeautomation.serviceImpl.CategoryServiceImpl;
import de.cynapsys.homeautomation.webservice.CategoryWebService;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.jws.WebService;

/**
 *
 * @author mouadh
 */
@WebService(endpointInterface = "de.cynapsys.homeautomation.webservice.CategoryWebService")
public class CategoryWebServiceImpl implements CategoryWebService {

    
        
    CategoryService categoryService = new CategoryServiceImpl();

        

    @Override
    public ArrayList<Category> getAllCategories() {
        return (ArrayList) categoryService.getAllCategories();
    }

    @Override
    public Category getCategoryByID(Long CategoryID) {
        return categoryService.getCategoryById(CategoryID);
    }

    @Override
    public Long addCategory(Category category) {
        return categoryService.addCategory(category);
    }

    @Override
    public boolean deleteCategory(Long CategoryID) {
            return categoryService.deleteCategory(CategoryID);
    }

    @Override
    public boolean updateCategory(Category category) {


            return categoryService.updateCategory(category);

    }

}
