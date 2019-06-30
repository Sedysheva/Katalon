import org.junit.Assert;
import org.junit.Test;

public class TestSubMenuKatalonAnalytics extends TestBrowser {

    String expectedResult = "Katalon Analytics: Level Up the Automation Test Reports";

    @Test
    public void testKatalonAnalytics() {
        mainPage.clickKatalonAnalytics();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult, driver.getTitle());
    }
}
