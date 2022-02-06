import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Title of the webpage : " +driver.getTitle());
        //locating the link using id
        System.out.println(driver.findElement(By.id("about-link")).getText());

        //locating the link using classname
       System.out.println(driver.findElement(By.className("green")).getText());

        //locating the link using linkText
        System.out.println(driver.findElement(By.linkText("About Us")).getText());

        //locating the link using cssSelector
       System.out.println(driver.findElement(By.cssSelector("a#about-link")).getText());

        driver.close();

    }
}
