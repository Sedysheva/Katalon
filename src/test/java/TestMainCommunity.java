import org.junit.Assert;
import org.junit.Test;

public class TestMainCommunity extends TestBrowser{

    String expectedResult = "Katalon Community";

    @Test
    public void testCommunity() throws InterruptedException {
        mainPage.clickCommunity();
        mainPage.switchToNewPage();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
