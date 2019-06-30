import org.junit.Assert;
import org.junit.Test;

public class TestCompanyMenuPartners extends TestBrowser {

    String expectedResult = "Partners and Contributors | Katalon Studio";

    @Test
    public void testPartners() throws InterruptedException {
        mainPage.clickPartners();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
