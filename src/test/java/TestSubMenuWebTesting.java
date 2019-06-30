import org.junit.Assert;
import org.junit.Test;

public class TestSubMenuWebTesting extends TestBrowser {

    String expectedResult = "Complete Web Automation Testing Solution | Katalon Studio";

    @Test
    public void testWebTesting() {
        mainPage.clickWebTesting();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult, driver.getTitle());
    }
}
