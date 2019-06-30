import org.junit.Assert;
import org.junit.Test;

public class TestDocsMenuTutorials extends TestBrowser {

        String expectedResult = "Tutorials";

        @Test
        public void testTutorials() throws InterruptedException {
            mainPage.clickTutorials();
            mainPage.switchToNewPage();
            System.out.println(mainPage.getTutorialsText());
            Assert.assertEquals(expectedResult,mainPage.getTutorialsText());
        }
}
