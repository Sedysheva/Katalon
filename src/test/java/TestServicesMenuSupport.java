import org.junit.Assert;
import org.junit.Test;

public class TestServicesMenuSupport extends TestBrowser {

    String expectedResult = "Support Service Pricing";

    @Test
    public void testSupport() throws InterruptedException {
        mainPage.clickSupport();
        System.out.println(mainPage.getSupportText());
        Assert.assertEquals(expectedResult,mainPage.getSupportText());
    }
}
