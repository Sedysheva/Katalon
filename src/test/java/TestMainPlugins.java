import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestMainPlugins extends TestBrowser {

    String expectedResult = "Katalon Store - Explore Plugins for Katalon Studio";

    @Test
    public void testPlugins() throws InterruptedException {
        mainPage.clickPlugins();
        mainPage.switchToNewPage();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
