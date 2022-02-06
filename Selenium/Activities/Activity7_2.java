import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);
        WebElement username = driver.findElement(By.xpath("//div[@id ='dynamic-attributes-content']/div/div[3]/div/div/div[1]/input"));
        WebElement password = driver.findElement(By.xpath("//div[@id ='dynamic-attributes-content']/div/div[3]/div/div/div[2]/input"));
        WebElement confirmPassword = driver.findElement(By.xpath("//div[@id ='dynamic-attributes-content']/div/div[3]/div/div/div[3]/input"));
        WebElement email = driver.findElement(By.xpath("//input[@type ='email']"));
        WebElement signUp = driver.findElement(By.xpath("//div[@id ='dynamic-attributes-content']/div/div[3]/div/div/button"));
        username.sendKeys("Sruthi");
        password.sendKeys("password");
        confirmPassword.sendKeys("password");
        email.sendKeys("test@gmail.com");
        signUp.click();
        WebElement message = driver.findElement(By.xpath("//div[@id ='action-confirmation']"));
        System.out.println("Message Appear on Screen : "+message.getText());


    }
}
