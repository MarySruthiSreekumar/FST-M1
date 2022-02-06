import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_3 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://training-support.net/selenium/drag-drop");
        System.out.println("Title of the page : " +driver.getTitle());
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));
        Action ballMovement = actions.dragAndDrop(ball,drop).build();
        ballMovement.perform();
        WebElement dropzone1 = driver.findElement(By.xpath("//div[@id='droppable']/p"));
        System.out.println("Dropzone 1: " +dropzone1.getText());
        WebElement dropzone2 = driver.findElement(By.xpath("//div[@id='dropzone2']/p"));
        if(dropzone1.getText().equals("Dropped!"))
        {
            Action moveTo = actions.dragAndDrop(drop,drop2).build();
            moveTo.perform();

            System.out.println("Dropzone 2 : "+dropzone2.getText());

        }
        if(dropzone2.getText().equals("Dropped!"))
        {
            driver.close();
        }



    }
}
