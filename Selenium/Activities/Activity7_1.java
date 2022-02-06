import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);
        WebElement userName = driver.findElement(By.xpath("//input[@type ='text']"));
        WebElement password = driver.findElement(By.xpath("//input[@type ='password']"));
        WebElement submit = driver.findElement(By.xpath("//button[@type ='submit']"));
        userName.sendKeys("admin");
        password.sendKeys("password");
        submit.click();
        WebElement message = driver.findElement(By.xpath("//div[@id ='action-confirmation']"));
        System.out.println("Message displayed : "+message.getText());
        driver.close();
    }
}
