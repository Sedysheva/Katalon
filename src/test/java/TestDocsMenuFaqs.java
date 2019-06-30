import org.junit.Assert;
import org.junit.Test;

public class TestDocsMenuFaqs extends TestBrowser {

    String expectedResult = "FAQs";

    @Test
    public void testFaqs() throws InterruptedException {
        mainPage.clickFaqs();
        mainPage.switchToNewPage();
        System.out.println(mainPage.getFaqsText());
        Assert.assertEquals(expectedResult,mainPage.getFaqsText());
    }
}
