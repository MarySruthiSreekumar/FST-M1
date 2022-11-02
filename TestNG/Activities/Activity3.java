import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Activity3 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void beforeClass() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
    @Test
    public void loginForm(){
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.xpath("//button[@type ='submit']"));
        username.sendKeys("admin");
        password.sendKeys("password");
        login.click();
        String  message = driver.findElement(By.id("action-confirmation")).getText();

        Assert.assertEquals(message,"Welcome Back, admin");



    }
}
