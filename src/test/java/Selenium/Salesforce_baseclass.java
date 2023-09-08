package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Salesforce_baseclass {
    public static WebDriver driver;

    public static void chromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);

    }
    public static void maximizeWindowAndSync(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public static void loginUrl(){
        driver.get("https://login.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("sureshkumar.narpavi@gmail.com");
        driver.findElement(By.id("password")).sendKeys("$Narpavi3$");
        driver.findElement(By.id("Login")).click();
    }

    public static void legalEntity(){
        driver.findElement(By.className("slds-icon-waffle")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement legal = driver.findElement(By.xpath("//p[contains(text(),'Legal Entities')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", legal);
        js.executeScript("arguments[0].click();", legal);
        WebElement dropdown = driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/parent::a//lightning-primitive-icon"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/parent::a//lightning-primitive-icon")))).click();
//        js.executeScript("arguments[0].click();", dropdown);
        WebElement newLegalEntity = driver.findElement(By.xpath("//span[text()='New Legal Entity']/ancestor::a"));
        js.executeScript("arguments[0].click();", newLegalEntity);
    }

}
