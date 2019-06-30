import org.junit.Assert;
import org.junit.Test;

public class TestSignOut extends TestBrowser {

    String expectedResult = "Login";

    @Test
    public void testSignOut() throws InterruptedException {
        mainPage.goLogin();
        loginPage.login();
        mainPage.clickSignOut();
        System.out.println(mainPage.getSignOutLogText());
        Assert.assertEquals("Login",mainPage.getSignOutLogText());
    }
}
