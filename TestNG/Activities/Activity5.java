import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity5 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass(groups = {"HeaderTest", "ButtonTest"})
    public void beforeClass() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @AfterClass(groups = {"HeaderTest", "ButtonTest"})
    public void afterClass() {
        driver.close();
    }

    @Test
    public void pageTitle() {
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);
        Assert.assertEquals(title, "Target Practice");
    }

    @Test(groups = {"HeaderTest"})
    public void thirdHeader() {
        String thirdHeader = driver.findElement(By.id("third-header")).getText();
        System.out.println("Third Header text: " + thirdHeader);
        Assert.assertEquals(thirdHeader, "Third header");

    }

    @Test(groups = {"HeaderTest"})
    public void fifthHeader() {
        WebElement fifth_header = driver.findElement(By.xpath("//h5[@class='ui green header']"));
        String color = fifth_header.getCssValue("color");
        System.out.println("Color of fifth header: " + color);
        Assert.assertEquals(color, "rgb(33, 186, 69)");

    }

    @Test(groups = {"ButtonTest"})
    public void buttonOlive() {
        String buttonOlive = driver.findElement(By.xpath("//button[@class='ui olive button']")).getText();
        System.out.println("Text in Olive button: " + buttonOlive);
        Assert.assertEquals(buttonOlive, "Olive");

    }

    @Test(groups = {"ButtonTest"})
    public void thirdRowFirstButton() {
        String thirdRowButton = driver.findElement(By.xpath("//div[@class='column'][2]/div[3]/button[1]")).getCssValue("color");
        System.out.println("Color of third Row fisrt Button: " + thirdRowButton);
        Assert.assertEquals(thirdRowButton, "rgb(255, 255, 255)");
    }
}
