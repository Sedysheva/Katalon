import org.junit.Assert;
import org.junit.Test;

public class TestDocsMenuManuals extends TestBrowser {

    String expectedResult = "Manuals";

    @Test
    public void testManuals() throws InterruptedException {
        mainPage.clickManuals();
        mainPage.switchToNewPage();
        System.out.println(mainPage.getManualsText());
        Assert.assertEquals(expectedResult,mainPage.getManualsText());
    }
}
