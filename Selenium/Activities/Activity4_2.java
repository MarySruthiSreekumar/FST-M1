import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        //open browser
        driver.get(" https://www.training-support.net/selenium/simple-form");
        //Get the title of the page using
        String title = driver.getTitle();
        System.out.println("Title of the page : " +title);
        //find elements of the page using xpath
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        WebElement email = driver.findElement(By.xpath("//input[@type = 'email']"));
        WebElement contactNumber = driver.findElement(By.xpath("//input[@id = 'number']"));
        WebElement message = driver.findElement(By.xpath("//textarea[@rows = '2']"));
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));

        //entering values in the form

        firstName.sendKeys("Sruthi");
        lastName.sendKeys("Sreekumar");
        email.sendKeys("test@gmail.com");
        contactNumber.sendKeys("9002015154");
        message.sendKeys("This is just a sample form filling using xpath locators");
        Thread.sleep(2000);

        //submitting the form
        submit.click();
        //closing the browser
        driver.close();




    }
}
