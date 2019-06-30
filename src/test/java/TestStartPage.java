import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPage;
import pageObject.MainPage;

import java.util.concurrent.TimeUnit;

public class TestStartPage extends TestBrowser {

    @Test
    public void startPage() throws InterruptedException {


        mainPage.clickSupport();
        mainPage.clickTraining();
        mainPage.clickSearchFieldIcon();
        mainPage.clickGitIcon();
        mainPage.clickAboutUs();
        mainPage.clickPartners();
        mainPage.clickLinkBlog();
        mainPage.clickLinkCaseStudies();
        mainPage.clickSignOut();
    }
}
