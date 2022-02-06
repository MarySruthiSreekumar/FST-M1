import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        //open browser
        driver.get("https://training-support.net/selenium/dynamic-controls");

        String title = driver.getTitle();
        System.out.println("Title of the page: "+title);

        WebElement text = driver.findElement(By.xpath("//input[@id = 'input-text']"));
        System.out.println("Is text field Enabled: "+text.isEnabled());
        WebElement enableText = driver.findElement(By.id("toggleInput"));
        enableText.click();
        System.out.println("Is text field Enabled: "+text.isEnabled());
        driver.close();
    }
}
