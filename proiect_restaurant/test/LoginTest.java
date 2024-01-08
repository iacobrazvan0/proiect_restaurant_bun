/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Razvan Iacob
 */
import dao.UserDao;
import model.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    // Testează funcționalitatea de login corectă
    @Test
    public void testLoginWithCorrectCredentials() {
        // Simulează acțiunea de login
        User user = UserDao.login("razvaniacob0@gmail.con", "1234");

        // Verifică dacă utilizatorul returnat nu este null și dacă status-ul este "true"
        assertNotNull(user);
        assertEquals("true", user.getStatus());
    }

    // Testează funcționalitatea de login cu credențiale incorecte
    @Test
    public void testLoginWithIncorrectCredentials() {
        // Simulează acțiunea de login
        User user = UserDao.login("wrong@example.com", "wrongpassword");

        // Verifică dacă utilizatorul returnat este null (înseamnă că loginul a eșuat)
        assertNull(user);
    }

    // Poți adăuga și alte teste pentru a verifica alte scenarii de login
}
