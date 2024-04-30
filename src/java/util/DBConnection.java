/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.sql.*;
public abstract class DBConnection {
    
    public Connection getconnection(){
        Connection con=null;
        
        try{
            //driver class'a tanıt
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/cms", "postgres", "123456");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
