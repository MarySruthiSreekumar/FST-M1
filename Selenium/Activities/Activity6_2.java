import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/ajax");
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);
        WebElement changeContent = driver.findElement(By.xpath("//button[@class ='ui violet button']"));
        changeContent.click();
        WebElement text = driver.findElement(By.xpath("//div[@id ='ajax-content']/h1"));
        wait.until(ExpectedConditions.textToBePresentInElement(text, "HELLO!"));
        System.out.println("Message appears : " + text.getText());
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id ='ajax-content']/h3"), "I'm late!"));
        WebElement subtext = driver.findElement(By.xpath("//div[@id ='ajax-content']/h3"));
        System.out.println("Message appears : " + subtext.getText());
        driver.close();
    }
}
