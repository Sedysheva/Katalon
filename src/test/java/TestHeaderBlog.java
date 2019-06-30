import org.junit.Assert;
import org.junit.Test;

public class TestHeaderBlog extends TestBrowser {

    String expectedResult = "Blog | Katalon Studio";

    @Test
    public void testBlog() throws InterruptedException {
        mainPage.clickLinkBlog();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult,driver.getTitle());
    }
}
