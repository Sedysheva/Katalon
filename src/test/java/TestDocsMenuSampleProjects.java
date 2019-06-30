import org.junit.Assert;
import org.junit.Test;

public class TestDocsMenuSampleProjects extends TestBrowser {

    String expectedResult = "Home | Katalon Docs";

    @Test
    public void testSampleProjects() throws InterruptedException {
        mainPage.clickSampleProjects();
        mainPage.switchToNewPage();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
