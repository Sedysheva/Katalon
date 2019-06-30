import org.junit.Assert;
import org.junit.Test;

public class TestHeaderGitIcon extends TestBrowser {

    String expectedResult = "Katalon Studio";

    @Test
    public void testGitIcon() throws InterruptedException {
        mainPage.clickGitIcon();
        mainPage.switchToNewPage();
        System.out.println(mainPage.getGitText());
        Assert.assertEquals(expectedResult,mainPage.getGitText());
    }
}
