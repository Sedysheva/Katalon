import org.junit.Assert;
import org.junit.Test;

public class TestCompanyMenuAboutUs extends TestBrowser {

    String expectedResult = "About Us | Katalon Studio";

    @Test
    public void testAboutUs() throws InterruptedException {
        mainPage.clickAboutUs();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
