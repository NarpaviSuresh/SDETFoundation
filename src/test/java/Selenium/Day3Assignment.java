package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class Day3Assignment {

    @Test
    public void day3Assignment() {
        //disable popup
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        // driver initiation
        WebDriver driver = new ChromeDriver(options);
        //window maximize
        driver.manage().window().maximize();
        //synchronization
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // enter the url
        driver.get("https://login.salesforce.com");
        // entering the user name and password
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.id("password")).sendKeys("Leaf$1234");
        driver.findElement(By.id("Login")).click();

        driver.findElement(By.className("slds-icon-waffle")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement dash = driver.findElement(By.xpath("//p[contains(text(),'Campaigns')]"));
        js.executeScript("arguments[0].scrollIntoView(true);",dash);
        js.executeScript("arguments[0].click();", dash);

        driver.findElement(By.xpath("//div[@title='New']")).click();
        driver.findElement(By.xpath("//input[@type='text' and @maxlength='80']")).sendKeys("Bootcamp");
        driver.findElement(By.xpath("//input[@data-interactive-lib-uid='8']")).click();
        List<WebElement> dates = driver.findElements(By.xpath("//td[@aria-selected='true']/ancestor::tbody/child::tr/td"));
        for (int i = 0; i < dates.size() ; i++) {
            WebElement temp = dates.get(i);
            if(temp.getAttribute("aria-selected").equalsIgnoreCase("true")){
                dates.get(i+1).click();
                break;
            }

        }
        driver.findElement(By.xpath("//div[@data-aura-rendered-by='2216:0']//input[@type='text']")).click();
        List<WebElement> enddate = driver.findElements(By.xpath("//span[@data-aura-rendered-by='1707:0']/ancestor::tbody/child::tr/td"));
        for (int i = 0; i < enddate.size(); i++) {
            WebElement temp = dates.get(i);
            if(temp.getAttribute("aria-selected").equalsIgnoreCase("true")){
                dates.get(i+2).click();
            }
        }
        driver.findElement(By.xpath("//span[@data-aura-rendered-by='2654:0']")).click();
        Assert.assertEquals(true, driver.findElement(By.xpath("//lightning-formatted-text[normalize-space()='Gokul']")).isDisplayed());
        driver.quit();

    }
}
