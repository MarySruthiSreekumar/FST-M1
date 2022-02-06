import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Activity12_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("title of the page: "+driver.getTitle());
        WebElement signIn = driver.findElement(By.className("orange"));
        Actions actions = new Actions(driver);
        Action tooltip = actions.moveToElement(signIn).pause(Duration.ofSeconds(1)).build();
        tooltip.perform();
        System.out.println("Tooltip Text : "+signIn.getAttribute("data-tooltip"));
        signIn.click();
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement submit = driver.findElement(By.xpath("//div[@id='dynamic-attributes-form']/div/button"));
        username.sendKeys("admin");
        password.sendKeys("password");
        submit.click();
        WebElement message = driver.findElement(By.id("action-confirmation"));
        System.out.println("Message displayed: "+message.getText());
        driver.close();

    }
}
