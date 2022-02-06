import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.Keys.*;

public class Activity10_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        WebElement keyValue = driver.findElement(By.id("keyPressed"));
        System.out.println("Title of the webpage : " +driver.getTitle());
        Action keyaction = actions
               // .keyDown(SHIFT)
                .sendKeys("S")
              //  .keyUp(SHIFT)
                .build();
        keyaction.perform();
        System.out.println("Key Pressed : "+keyValue.getText());
        Action copyAction = actions.keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        copyAction.perform();
        System.out.println("Key Pressed : "+keyValue.getText());
        driver.close();



    }
}
