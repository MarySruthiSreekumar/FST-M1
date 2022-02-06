import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String title = driver.getTitle();
        System.out.println("Title of the page: "+title);
        WebElement checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        WebElement removeCheckbox = driver.findElement(By.id("toggleCheckbox"));
        removeCheckbox.click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        removeCheckbox.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        driver.close();
    }
}
