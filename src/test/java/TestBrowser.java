import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPage;
import pageObject.MainPage;

import java.util.concurrent.TimeUnit;

public class TestBrowser {

    protected LoginPage loginPage;
    protected MainPage mainPage;
    protected ChromeDriver driver;
    protected JavascriptExecutor js;

    @Before
    public void createBrowser(){
        System.getProperty("webdriver.chrome.driver","src/main/java/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
        driver.get("https://www.katalon.com");
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
