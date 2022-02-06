import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //open browser
        driver.get("https://www.training-support.net/selenium/target-practice");
        String title = driver.getTitle();
        System.out.println("Title of the page : "+title);

        //Find the third header on the page
        WebElement thirdHeader = driver.findElement(By.xpath("//h3[@id ='third-header']"));

        //Find the fifth header on the page and get it's 'colour' CSS Property
        WebElement fifthHeader = driver.findElement(By.xpath("//h5[contains(@class,'green')]"));

        //Find the violet button on the page and print all the class attribute values
        WebElement violetButton = driver.findElement(By.xpath("//button[@class = 'ui violet button']"));

        //Find the grey button on the page with Absolute XPath
        WebElement greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));

        System.out.println("Text on third header :" +thirdHeader.getText());
        System.out.println("Css colour of fifth header :" +fifthHeader.getCssValue("color"));
        System.out.println("Class attribute value of violet button :" +violetButton.getAttribute("class"));
        System.out.println("Text in Grey button : "+greyButton.getText());

        driver.close();



    }
}
