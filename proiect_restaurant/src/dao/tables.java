/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Razvan Iacob
 */
public class tables {
    public static void setupDatabaseTables(){
        try{
            String userTable = "CREATE TABLE IF NOT EXISTS users ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(200),"
                    + "email VARCHAR(200) UNIQUE,"
                    + "mobileNumber VARCHAR(10),"
                    + "adress VARCHAR(200),"
                    + "password VARCHAR(200),"
                    + "status VARCHAR(20))";
            String adminDetails = "insert into users(name,email,mobileNumber,adress,password,status) values('Admin','admin@gmail.com','1234567890','Romania','admin','true')";
            String categoryTable = "create table if not exists category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String productTable = "create table if not exists product(id int AUTO_INCREMENT primary key, name varchar(200),category varchar(200), price varchar(200))";
            String billTable = "create table if not exists bill(id int primary key,name varchar(200), mobileNumber varchar(200), email varchar(200), date varchar(50), total varchar(200), createdBy varchar(200))";

            DbOperations.setDataOrDelete(userTable, "User Table Created Succesfully");
            DbOperations.setDataOrDelete(adminDetails, " Admin Details added Succesfully");
            DbOperations.setDataOrDelete(categoryTable, " Category Table created Succesfully");
            DbOperations.setDataOrDelete(productTable, " Product Table created Succesfully");
            DbOperations.setDataOrDelete(billTable, " Bill Table created Succesfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
