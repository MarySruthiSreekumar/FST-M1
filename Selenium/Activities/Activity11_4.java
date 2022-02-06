import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Title of the page: " +driver.getTitle());
        String parentHandle = driver.getWindowHandle();
        System.out.println("Handle of the page: "+parentHandle);
        WebElement clickable = driver.findElement(By.linkText("Click Me!"));
        clickable.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);

        for (String handle:handles
             ) {
            if (!handle.equals(parentHandle))
            {
                driver.switchTo().window(handle);

            }
        }
        String secondHandle = driver.getWindowHandle();
        System.out.println("New Tab title: "+driver.getTitle());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        String header = driver.findElement(By.className("content")).getText();
        System.out.println("Header of New Tab: "+header);
        WebElement openTab = driver.findElement(By.id("actionButton"));
        openTab.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        Set<String> handlesNew = driver.getWindowHandles();
        for (String handle:handlesNew)
        {
            if(!(handle.equals(parentHandle) && handle.equals(secondHandle)))
            {
                driver.switchTo().window(handle);
            }
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        System.out.println("New Second Tab title: "+driver.getTitle());
        String header2 = driver.findElement(By.className("content")).getText();
        System.out.println("Header of New Tab: "+header2);
        driver.quit();


    }
}
