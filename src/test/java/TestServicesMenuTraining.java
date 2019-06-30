import org.junit.Assert;
import org.junit.Test;

public class TestServicesMenuTraining extends TestBrowser {

    String expectedResult = "Katalon Training Services";

    @Test
    public void testTraining() throws InterruptedException {
        mainPage.clickTraining();
        System.out.println(mainPage.getTrainingText());
        Assert.assertEquals(expectedResult,mainPage.getTrainingText());
    }
}
