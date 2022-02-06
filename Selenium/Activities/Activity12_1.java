import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/iframes");
        System.out.println("Title of the page: "+driver.getTitle());
        driver.switchTo().frame(0);
        String header = driver.findElement(By.className("content")).getText();
        System.out.println("Header of Iframe: "+header);
        WebElement actionButton = driver.findElement(By.id("actionButton"));
        System.out.println("Button Text: "+actionButton.getText());
        System.out.println("Colour of Action button: "+actionButton.getCssValue("background-color"));
        actionButton.click();
        actionButton = driver.findElement(By.id("actionButton"));
        System.out.println("Button Text: "+actionButton.getText());
        System.out.println("Colour of Action button: "+actionButton.getCssValue("background-color"));

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement header2 = driver.findElement(By.className("content"));
        System.out.println("Header of Iframe: "+header2.getText());

        header2.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

        WebElement actionButton2 = driver.findElement(By.id("actionButton"));
        System.out.println("Button Text: "+actionButton2.getText());
        System.out.println("Colour of Action button: "+actionButton2.getCssValue("background-color"));
        actionButton2.click();
        actionButton2 = driver.findElement(By.id("actionButton"));
        System.out.println("Button Text: "+actionButton2.getText());
        System.out.println("Colour of Action button: "+actionButton2.getCssValue("background-color"));
        driver.close();

    }
}
