/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

/**
 *
 * @author Razvan Iacob
 */
public class ConnectionProvider {

    public static Connection getCon(){
        try{
          
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            return DriverManager.getConnection("jdbc:mysql://localhost:10906/proiect_facultate_restaurant", "root", "");
        }
        catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }
}
