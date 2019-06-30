import org.junit.Assert;
import org.junit.Test;

public class TestSubMenuEnvironments extends TestBrowser {

    @Test
    public void testEnvironments() throws InterruptedException {
        String expectedResult = "Environments";

        mainPage.clickEnvironments();
        System.out.println(mainPage.getEnvironmentsText());
        Assert.assertEquals(expectedResult,mainPage.getEnvironmentsText());
    }
}
