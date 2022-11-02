import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Iterator;

public class Activity7 {
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
    public void afterClass() {
        driver.close();
    }

    @DataProvider(name = "Authentication")
    public Object[][] credentials(){
        return new Object[][]{{"admin","password"}};
    }

    @Test(dataProvider = "Authentication")
    public void loginForm(String username, String password){
        WebElement user = driver.findElement(By.id("username"));
        WebElement pwd = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.xpath("//div[@id='dynamic-attributes-form']/div/button"));
        user.sendKeys(username);
        pwd.sendKeys(password);
        login.click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);
        Assert.assertEquals(message, "Welcome Back, admin");
    }
}
