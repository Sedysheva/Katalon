import org.junit.Assert;
import org.junit.Test;

public class TestLogin extends TestBrowser{

    @Test
    public void testLogin() throws InterruptedException {
        mainPage.goLogin();
        loginPage.login();
        System.out.println(mainPage.getSignOutText());
        Assert.assertEquals("Sign out",mainPage.getSignOutText());
    }
}
