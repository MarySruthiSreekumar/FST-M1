import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class ='ui celled striped table']/tbody/tr"));
        List<WebElement> cols = driver.findElements(By.xpath("//table[@class ='ui celled striped table']/tbody/tr[1]/td"));
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[@class ='ui celled striped table']/tbody/tr[3]/td"));
        WebElement secondColumn = driver.findElement(By.xpath("//table[@class ='ui celled striped table']/tbody/tr[2]/td[2]"));

        //printing number of columns and rows
        System.out.println("Number of rows: " + rows.size());
        System.out.println("Number of columns: " + cols.size());

        //print the all the cell values of the third row of the table
        for (WebElement column : thirdRow
        ) {
            System.out.println("Value in Third row : " + column.getText());
        }

        //print the cell value at the second row and second column
        System.out.println("cell value at the second row and second column: " + secondColumn.getText());

        driver.close();

    }
}
