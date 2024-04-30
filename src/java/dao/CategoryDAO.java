/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Category;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;
import java.sql.*;


public class CategoryDAO extends DBConnection{
    private Connection db;
    
    
    public void createCategory(Category c) {
        try{
           Statement st=this.getDb().createStatement();
           String query="insert into Category(title,created) values('"+c.getTitle()+"','"+c.getCreated()+"')";
           st.executeUpdate(query);

        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void update(Category c){
        try{
           Statement st=this.getDb().createStatement();
           String query="UPDATE Category SET title = ?, updated = ? WHERE id = ?";
           st.executeUpdate(query);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void delete(Category c){
        try{
            Statement st=this.getDb().createStatement();
            String query="delete from Category where id="+c.getId();
            int r=st.executeUpdate(query);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Category> getCategoryList(){
       List<Category> Categorylist=new ArrayList<>();
       
       try{
           Statement st=this.getDb().createStatement();
           String query="select * from Category";
           ResultSet rs=st.executeQuery(query);
           while(rs.next()){
              Categorylist.add(new Category(rs.getLong("id"),
                      rs.getString("title"),
                      rs.getTimestamp("created"),
                      rs.getTimestamp("updated")));
           }
       }
       catch(Exception ex){
           System.out.println(ex.getMessage());
       }
       return Categorylist;
    }
    
    
    public Connection getDb() {
        if(this.db==null){
            this.db=this.getconnection();
        }
        return db;
    }

    public void setDb(Connection db) {
        this.db = db;
    }    
}
