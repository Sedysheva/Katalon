import org.junit.Assert;
import org.junit.Test;

public class TestHeaderCaseStudies extends TestBrowser {

    String expectedResult = "Case Studies | Katalon Studio";

    @Test
    public void testCaseStudies() throws InterruptedException {
        mainPage.clickLinkCaseStudies();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
