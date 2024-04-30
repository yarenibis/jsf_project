/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.CategoryDAO;
import entity.Category;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.sql.Timestamp;

@Named(value = "CategoryBean")
@SessionScoped
public class CategoryBean implements Serializable {

    private CategoryDAO dao;
    private Category entitiy;
    private List<Category> Categorylist;
    public CategoryBean() {
    }

    
    public void create(){
        this.entitiy.setCreated(new Timestamp(System.currentTimeMillis()));
        this.getDao().createCategory(this.entitiy);
        
    }
    
    public void update(){
        
    }
    
    public void delete(Category c){
        this.getDao().delete(c);
    }
    
    
    public CategoryDAO getDao() {
        if(this.dao==null){
            this.dao=new CategoryDAO();
        }
        return dao;
    }

    public void setDao(CategoryDAO dao) {
        this.dao = dao;
    }

    public Category getEntitiy() {
        if(this.entitiy==null){
            this.entitiy=new Category();
        }
        return entitiy;
    }

    public void setEntitiy(Category entitiy) {
        this.entitiy = entitiy;
    }

    public List<Category> getCategorylist() {
      this.Categorylist=this.getDao().getCategoryList();
        return Categorylist;
    }

    public void setCategorylist(List<Category> Categorylist) {
        this.Categorylist = Categorylist;
    }
    
    
    
}
