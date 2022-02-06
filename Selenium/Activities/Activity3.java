import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        //Webdriver instance
        WebDriver driver = new FirefoxDriver();

        //open the browser
        driver.get("https://training-support.net/selenium/simple-form");

        //Getting the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the Page is : " + title);

        //Using findElement() with id() to find the text fields
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement contactNumber = driver.findElement(By.id("number"));
        WebElement submit = driver.findElement(By.className("green"));

        //Enter the values
        firstName.sendKeys("Sruthi");
        lastName.sendKeys("Sreekumar");
        email.sendKeys("test@gmail.com");
        contactNumber.sendKeys("8022154821");

        //submit the form
        submit.click();
        Thread.sleep(2000);
        driver.close();


    }
}
