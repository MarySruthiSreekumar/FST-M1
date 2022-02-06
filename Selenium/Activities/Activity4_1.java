import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("Title of the page : " +title);
        WebElement aboutLink = driver.findElement(By.xpath("//a[@id = 'about-link']"));
        aboutLink.click();
        String newTitle = driver.getTitle();
        System.out.println("New title of the page : " +newTitle);
    }
}
