import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        WebElement dropdown = driver.findElement(By.id("single-select"));
        WebElement optionSelected = driver.findElement(By.id("single-value"));

        //Create a new Select class object with the WebElement
        Select select = new Select(dropdown);

        //select options using different select methods
        select.selectByVisibleText("Option 2");
        System.out.println("Option Selected is : "+optionSelected.getText());
        select.selectByIndex(3);
        System.out.println("Option Selected is : "+optionSelected.getText());
        select.selectByValue("4");
        System.out.println("Option Selected is : "+optionSelected.getText());

        //get all the options in the dropdown
        List <WebElement> options = select.getOptions();
        for (WebElement option:options
             ) {
            System.out.println("options available: " +option.getText());
        }
        driver.close();



    }
}
