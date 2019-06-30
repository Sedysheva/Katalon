package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    ChromeDriver driver;

    public LoginPage(ChromeDriver driver) {
        this.driver=driver;
    }

    public void login() throws InterruptedException {
        WebElement username = driver.findElement(By.id("user_email"));
        username.sendKeys("farelka_15@yahoo.com");
        WebElement password = driver.findElement(By.id("user_pass"));
        password.sendKeys("Norway2803");
        WebElement buttonLogin = driver.findElement(By.id("login-btn"));
        buttonLogin.click();
        TimeUnit.SECONDS.sleep(3);
    }


}
