import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of the pAge: " +driver.getTitle());
        WebElement promptAlert = driver.findElement(By.id("prompt"));
        promptAlert.click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert message: "+alert.getText());
        alert.sendKeys("Yes, you are!");
        alert.accept();
        driver.close();
    }
}
