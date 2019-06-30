import org.junit.Assert;
import org.junit.Test;

public class TestSubMenuSolutions extends TestBrowser {

    @Test
    public void testSolutions() throws InterruptedException {
        String expectedResult = "Solutions";

            mainPage.clickSolutions();
            System.out.println(mainPage.getSolutionsText());
            Assert.assertEquals(expectedResult,mainPage.getSolutionsText());
        }
    }
