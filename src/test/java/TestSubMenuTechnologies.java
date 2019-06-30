import org.junit.Assert;
import org.junit.Test;

public class TestSubMenuTechnologies extends TestBrowser {

    String expectedResult = "Technologies";

    @Test
    public void testTechnologies() {
        mainPage.clickTechnologies();
        System.out.println(mainPage.getTechnologiesText());
        Assert.assertEquals(expectedResult,mainPage.getTechnologiesText());
    }
}
