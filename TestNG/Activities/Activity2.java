import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");

    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
    @Test
    public void test01(){
        String title = driver.getTitle();
        System.out.println("Title of the Page: "+title);
        Assert.assertEquals(title,"Target Practice");
    }

    @Test
    public void test02(){
        String black = driver.findElement(By.className("black")).getText();
        Assert.assertEquals(black,"Blue");

    }
    @Test(enabled = false)
    public void test03(){
        System.out.println("Skip Test");

    }
    @Test
    public void test04() throws SkipException{
        String condition = "Skip Test";
        if(condition.equals("Skip Test"))
        {
            throw new SkipException("Skipping - This is not ready for testing ");
        } else {
            System.out.println("This test is not skipped");
        }

    }


}
