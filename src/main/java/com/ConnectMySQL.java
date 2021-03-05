/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class ConnectMySQL {
    public static String driver = "com.mysql.jdbc.Driver"; 
    public static String url = "jdbc:mysql://localhost:3306";
    public static String username = "root";
    public static String password = "1234";
    
    
    public static void readAllUser(){
        
        try {

        Class.forName(driver);
        Connection con =  (Connection) DriverManager.getConnection(url, username, password);
        
        Statement smt = (Statement) con.createStatement();
        String sql = "SELECT * FROM edpserver.amphures";
        ResultSet rs = smt.executeQuery(sql);
        
            while(rs.next()){
               int id = rs.getInt("AMPHUR_ID");
               String company = rs.getString("AMPHUR_NAME");
               String phone = rs.getString("AMPHUR_NAME_ENG");
               
                System.out.println("ID :: "+ id + "::CompanyName :: " +company+ ":: PHONE :: " +phone);
            }
        
        }catch(Exception e){
            e.printStackTrace();
            
        }
      
    }
    
    public static void main(String[] args){
        
        readAllUser();
  
    }
    

}