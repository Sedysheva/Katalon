import org.junit.Assert;
import org.junit.Test;

public class TestSubMenuKatalonRecorder extends TestBrowser {

    String expectedResult = "Katalon Automation Recorder - Powerful Selenium IDE to record, debug, play tests in any browser";

    @Test
    public void testKatalonRecorder() {
        mainPage.clickKatalonRecorder();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
