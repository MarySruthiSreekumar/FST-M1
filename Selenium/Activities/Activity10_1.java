import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title of the webpage : " +driver.getTitle());
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));


        cube.click();
        WebElement cubevalue = driver.findElement(By.xpath("//div[@class ='active']/h1"));
        System.out.println("Left click :" +cubevalue.getText());

        actions.doubleClick(cube).perform();
        cubevalue = driver.findElement(By.xpath("//div[@class ='active']/h1"));
        System.out.println("Double click:" +cubevalue.getText());

        actions.contextClick(cube).perform();
        cubevalue = driver.findElement(By.xpath("//div[@class ='active']/h1"));
        System.out.println("Context click :" +cubevalue.getText());


    }
}
