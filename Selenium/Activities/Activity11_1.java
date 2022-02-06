import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of the pAge: " +driver.getTitle());
        WebElement simpleAlert = driver.findElement(By.id("simple"));
        simpleAlert.click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Simple Alert message: "+alert.getText());
        alert.accept();
        driver.close();

    }
}
