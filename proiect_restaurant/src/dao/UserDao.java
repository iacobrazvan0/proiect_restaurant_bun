/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Razvan Iacob
 */
public class UserDao {

    public static void save(User user) {
        String query = "insert into users(name,email,mobileNumber,adress,password,status) values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getAdress() + "','" + user.getPassword() + "','false')";
        DbOperations.setDataOrDelete(query, "Registered Succesfully! Wait for Admin Approval!");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from users where email='" + email + "'and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from users where email = '" + email + "'");
            while (rs.next()) {
                user = new User();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void update(String email, String newPassword) {
        String query = "update users set password= '" + newPassword + "' where email = '" + email + "'";
        DbOperations.setDataOrDelete(query, "Password Changed Succesfully");
    }
    
    public static ArrayList<User> getAllRecords(String email){
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from users where email like '%"+email+"%'");
            while (rs.next()) {
                User user =new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNumber(rs.getString("mobileNumber"));
                user.setAdress(rs.getString("adress"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static void changeStatus(String email,String status){
        String query = "update users set status= '"+status+"' where email = '"+email+"'";
        DbOperations.setDataOrDelete(query, "Status changed succesfully");
    }
}
