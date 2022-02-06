import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        WebElement multiSelect = driver.findElement(By.id("multi-select"));
        Select select = new Select(multiSelect);
        if(select.isMultiple()){
            select.selectByVisibleText("Javascript");
            select.selectByValue("node");
            select.selectByIndex(4);
            select.selectByIndex(5);
            select.selectByIndex(6);
            select.deselectByValue("node");
            select.deselectByIndex(7);
            System.out.println("First Selected option : " +select.getFirstSelectedOption().getText());

            List <WebElement> optionselected = select.getAllSelectedOptions();
            for (WebElement option:optionselected
                 ) {
                System.out.println("Options Selected: " +option.getText());
            }

            select.deselectAll();
            driver.close();



        }

    }
}
