import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id ='sortableTable']/tbody/tr"));
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id ='sortableTable']/tbody/tr[1]/td"));
        WebElement cellvalue_2_2 = driver.findElement(By.xpath("//table[@id ='sortableTable']/tbody/tr[2]/td[2]"));
        WebElement nameColumn = driver.findElement(By.xpath("//table[@id ='sortableTable']/thead/tr[1]/th[1]"));
        WebElement footer = driver.findElement(By.xpath("//table[@id ='sortableTable']/tfoot/tr"));
        System.out.println("cell value at 2Row 2Col: "+cellvalue_2_2.getText());
        nameColumn.click();

        WebElement cellvalue_2_2after = driver.findElement(By.xpath("//table[@id ='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("cell value at 2Row 2Col: "+cellvalue_2_2after.getText());
        System.out.println(footer.getText());

    }
}
