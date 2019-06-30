import org.junit.Assert;
import org.junit.Test;

public class TestSubMenuApiTesting extends TestBrowser {

    String expectedResult = "API Automated Testing for Testers and Developers | Katalon Studio";

    @Test
    public void testApiTesting() {
        mainPage.clickApiTesting();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult, driver.getTitle());
    }
}
