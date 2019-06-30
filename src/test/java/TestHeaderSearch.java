import org.junit.Assert;
import org.junit.Test;

public class TestHeaderSearch extends TestBrowser {

    String expectedResult = "";

    @Test
    public void testSearch() throws InterruptedException {
        mainPage.clickSearchFieldIcon();
        System.out.println(mainPage.getSearchText());
        //Assert.assertEquals(expectedResult,mainPage.getSearchText());
    }
}
