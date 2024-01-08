/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proiect_restaurant;
import static dao.tables.setupDatabaseTables;
import javax.swing.JOptionPane;
/**
 *
 * @author Razvan Iacob
 */
public class Proiect_restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            setupDatabaseTables();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        // Apelați metoda main a clasei Signup
        Signup.main(new String[]{});
        
    }
    
}
