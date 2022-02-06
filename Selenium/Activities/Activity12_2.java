import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        System.out.println("title of the page: "+driver.getTitle());
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        WebElement header1 = driver.findElement(By.className("content"));
        System.out.println("Header of Frame 1: "+header1.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(1);
        WebElement header2 = driver.findElement(By.className("content"));
        System.out.println("Header of Frame 2: "+header2.getText());
        driver.close();

    }
}

