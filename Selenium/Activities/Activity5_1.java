import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        //open browser
        driver.get("https://training-support.net/selenium/dynamic-controls");

        String title = driver.getTitle();
        System.out.println("Title of the page: "+title);

        WebElement checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        System.out.println("Is checkbox displayed: "+checkbox.isDisplayed());
        WebElement removeCheckbox = driver.findElement(By.id("toggleCheckbox"));
        removeCheckbox.click();
        System.out.println("Is checkbox displayed: "+checkbox.isDisplayed());
        driver.close();

    }
}
