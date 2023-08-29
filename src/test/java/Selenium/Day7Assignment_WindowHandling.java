package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Day7Assignment_WindowHandling {

    @Test
    public void windowHandling() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        // driver initiation
        WebDriver driver = new ChromeDriver(options);
        //window maximize
        driver.manage().window().maximize();
        //synchronization
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://login.salesforce.com");

        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.id("password")).sendKeys("Leaf$1234");
        driver.findElement(By.id("Login")).click();

        driver.findElement(By.xpath("//span[contains(text(),'Learn More')]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> childwindow=new ArrayList<String>(windowHandles);

        driver.switchTo().window(childwindow.get(1));
        driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();

        System.out.println("Child window Title "+driver.getTitle());

//
        driver.close();
        String title1 = driver.switchTo().window(childwindow.get(0)).getTitle();
        System.out.println("Home Page title "+ title1);
        driver.quit();

    }
}
