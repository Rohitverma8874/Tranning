package com.training.test1.dao;

import java.util.*;

import com.training.test1.model.Product;

import java.sql.*;  
  
public class ProductDaoimpl {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","India123");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Product e){  
        int status=0;  
        try{  
            Connection con=ProductDaoimpl.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into product(name,type) values (?,?)");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getType());  
           
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
}