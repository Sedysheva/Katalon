import org.junit.Assert;
import org.junit.Test;

public class TestHeaderWebinars extends TestBrowser {

    String expectedResult = "Automation Testing Webinars | Katalon Studio";

    @Test
    public void testWebinars() throws InterruptedException {
        mainPage.clickLinkWebinars();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
