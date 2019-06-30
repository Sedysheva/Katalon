import org.junit.Assert;
import org.junit.Test;

public class TestDocsMenuWhatsNew extends TestBrowser {

    String expectedResult = "What's new";

    @Test
    public void testWhatsNew() throws InterruptedException {
        mainPage.clickWhatsNew();
        mainPage.switchToNewPage();
        System.out.println(mainPage.getWhatsNewText());
        Assert.assertEquals(expectedResult,mainPage.getWhatsNewText());
    }
}
