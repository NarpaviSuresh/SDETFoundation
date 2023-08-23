package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class SalesForceAssignment {

    @Test
    public void salesForceAssignment() throws InterruptedException, AWTException {
        // Chrome options to overcome notifications popup
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browser", "Chrome");
//        caps.setCapability("browser_version", "75.0");
//        caps.setCapability("os", "Windows");
//        caps.setCapability("os_version", "10");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
//        caps.setCapability(ChromeOptions.CAPABILITY, options);

        // instantiating Driver
        WebDriver driver = new ChromeDriver(options);
        // Maximize window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // open the url
        driver.get("https://login.salesforce.com");
        // entering the user name and password
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.id("password")).sendKeys("Leaf$1234");
        driver.findElement(By.id("Login")).click();


        driver.findElement(By.className("slds-icon-waffle")).click();

        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();

        driver.findElement(By.xpath("//p[text()='Sales']")).click();

        WebElement accounts = driver.findElement(By.xpath("//a[@title='Accounts']//span[1]"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",accounts);


        driver.findElement(By.xpath("//div[@title='New']")).click();

        driver.findElement(By.xpath("(//input[@part='input'])[2]")).sendKeys("Suresh Kumar");

        driver.findElement(By.xpath("//button[text()='Save']")).click();
    }
}
