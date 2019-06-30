import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class TestSubMenuIntegrations extends TestBrowser {

    String expectedResult = "Integrations";

    @Test
    public void testIntegrations() throws InterruptedException {
        mainPage.clickIntegrations();
        System.out.println(mainPage.getIntegrationsText());
        Assert.assertEquals(expectedResult,mainPage.getIntegrationsText());
    }
}
