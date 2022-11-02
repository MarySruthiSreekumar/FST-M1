import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Activity1 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net");
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

    @Test
    public void test(){
        String title = driver.getTitle();
        System.out.println("Title of the page: "+title);
        Assert.assertEquals(title,"Training Support");
        WebElement aboutUs = driver.findElement(By.linkText("About Us"));
        aboutUs.click();
        String newTitle = driver.getTitle();
        System.out.println("Title of the page: "+newTitle);
        Assert.assertEquals(newTitle,"About Training Support");

    }
}
