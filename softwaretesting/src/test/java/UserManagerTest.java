import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserManagerTest {

    @Test
    public void testLoginSuccess() {
        UserManager userManager = new UserManager();
        assertTrue(userManager.login("username", "password"));
    }

    @Test
    public void testLoginFailure() {
        UserManager userManager = new UserManager();
        assertFalse(userManager.login("", ""));
    }

    @Test
    public void testRegister() {
        UserManager userManager = new UserManager();
        assertTrue(userManager.register("newUser", "newPass"));
    }
}
