import org.junit.Assert;
import org.junit.Test;

public class TestDocsMenuVideos extends TestBrowser {

    String expectedResult = "Videos";

    @Test
    public void testVideos() throws InterruptedException {
        mainPage.clickVideos();
        mainPage.switchToNewPage();
        System.out.println(mainPage.getVideosText());
        Assert.assertEquals(expectedResult,mainPage.getVideosText());
    }
}
