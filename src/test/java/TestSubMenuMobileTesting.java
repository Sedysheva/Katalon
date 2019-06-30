import org.junit.Assert;
import org.junit.Test;

public class TestSubMenuMobileTesting extends TestBrowser {

    String expectedResult = "Best Testing Tool for Mobile Web, iOS & Android Apps";

    @Test
    public void testMobileTesting() {
        mainPage.clickMobileTesting();
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedResult, driver.getTitle());
    }
}
