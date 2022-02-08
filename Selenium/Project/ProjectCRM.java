package crmproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class ProjectCRM {
   WebDriver driver;
   WebDriverWait wait;
   @BeforeMethod(alwaysRun = true)
   @Parameters({"url"})
   public void beforeMethod(String url){
       driver = new FirefoxDriver();
       driver.get(url);
       wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   }

   @Test(priority = 0)
   public void getTitleOfWebsite(){
      String title = driver.getTitle();
      Assert.assertEquals(title,"SuiteCRM");
   }

   @Test (priority = 1)
   public void getUrlOfHeaderImage(){
      String headerImageUrl = driver.findElement(By.xpath("//img[@alt='SuiteCRM']")).getAttribute("src");
      System.out.println("URL of the header image is : "+headerImageUrl);
   }

   @Test(priority = 2)
   public void getCopyrightText(){
      String copyRightText = driver.findElement(By.xpath("//div[@class='p_login_bottom']/a")).getText();
      System.out.println("First Copyright Message: "+copyRightText);
   }

   @Test(priority = 3)
   @Parameters({"username","password"})
   public void logIn(String username, String password){
      WebElement usernamefield = driver.findElement(By.id("user_name"));
      WebElement passwordfield =  driver.findElement(By.id("username_password"));
      WebElement login = driver.findElement(By.xpath("//input[@name ='Login']"));
       usernamefield.sendKeys(username);
       passwordfield.sendKeys(password);
      login.click();
      String homepageTitle = driver.getCurrentUrl();
      Assert.assertEquals(homepageTitle,"https://alchemy.hguy.co/crm/index.php?module=Home&action=index");
   }

   @Test (dependsOnMethods ={"logIn"},priority = 4)
   @Parameters({"username","password"})
   public void navigationMenuColor(String username, String password){
       logIn(username, password);
      WebElement navigation = driver.findElement(By.xpath("//nav[@role='navigation']"));
      String backgroundColor = navigation.getCssValue("background-color");
      System.out.println("Color of the navigation menu: "+backgroundColor);
   }

   @Test (dependsOnMethods ={"logIn"},priority = 5)
   @Parameters({"username","password"})
   public void menuChecking(String username, String password){
       logIn(username, password);
      WebElement activities = driver.findElement(By.xpath("//div[@id='toolbar']/ul/li[5]"));
      Assert.assertTrue(activities.isEnabled());

   }

   @Test (dependsOnMethods ={"logIn"},priority = 6)
   @Parameters({"username","password"})
   public void additionalInfo(String username, String password){
       logIn(username, password);
      WebElement sales = driver.findElement(By.xpath("//div[@class ='desktop-toolbar']/ul/li[2]/span[2]/a"));
      sales.click();
      WebElement lead = driver.findElement(By.xpath("//div[@class ='desktop-toolbar']/ul/li[2]/span[2]/ul/li[5]/a"));
      lead.click();
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='list-view-rounded-corners']/table/tbody")));
      WebElement additionalInfo = driver.findElement(By.xpath("//div[@class='list-view-rounded-corners']/table/tbody/tr[1]/td[10]"));
      wait.until(ExpectedConditions.elementToBeClickable(additionalInfo));
      additionalInfo.click();
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id ='ui-id-5']/span")));
      String message = driver.findElement(By.xpath("//div[@id ='ui-id-5']/span")).getText();
      System.out.println("Phone number of Lead: "+message);
   }

   @Test (dependsOnMethods ={"logIn"},priority = 7)
   @Parameters({"username","password"})
    public void transverseTable(String username, String password){
       logIn(username, password);
       WebElement sales = driver.findElement(By.xpath("//div[@class ='desktop-toolbar']/ul/li[2]/span[2]/a"));
       sales.click();
       WebElement account = driver.findElement(By.xpath("//div[@class ='desktop-toolbar']/ul/li[2]/span[2]/ul/li[2]/a"));
       account.click();
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='list-view-rounded-corners']/table/tbody/tr[1]/td")));
       WebElement names = driver.findElement(By.xpath("//div[@class='list-view-rounded-corners']/table/tbody/tr[1]/td[3]/b/a"));
       wait.until(ExpectedConditions.visibilityOf(names));
       for(int i=1;i<11;i+=2){
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='list-view-rounded-corners']/table/tbody/tr["+i+"]/td[3]/b/a")));
           WebElement name = driver.findElement(By.xpath("//div[@class='list-view-rounded-corners']/table/tbody/tr["+i+"]/td[3]/b/a"));
           System.out.println(name.getText());
       }

   }
    @Test (dependsOnMethods ={"logIn"},priority = 8)
    @Parameters({"username","password"})
    public void transverseLeadTable(String username, String password){
        logIn(username, password);
        WebElement sales = driver.findElement(By.xpath("//div[@class ='desktop-toolbar']/ul/li[2]/span[2]/a"));
        sales.click();
        WebElement lead = driver.findElement(By.xpath("//div[@class ='desktop-toolbar']/ul/li[2]/span[2]/ul/li[5]/a"));
        lead.click();
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='list-view-rounded-corners']/table/tbody")));
       WebElement leadNames = driver.findElement(By.xpath("//div[@class='list-view-rounded-corners']/table/tbody/tr[1]/td[3]/b/a"));
       wait.until(ExpectedConditions.visibilityOf(leadNames));
        for(int i=1;i<=10;i++)
        {
            WebElement name = driver.findElement(By.xpath("//div[@class='list-view-rounded-corners']/table/tbody/tr["+i+"]/td[3]/b/a"));
            WebElement user = driver.findElement(By.xpath("//div[@class='list-view-rounded-corners']/table/tbody/tr["+i+"]/td[8]/a"));
            System.out.println("Name: " +name.getText() +"  User: " +user.getText());
        }



    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        driver.close();
    }


}
