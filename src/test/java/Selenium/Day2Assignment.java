package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Day2Assignment {

    @Test
    public void day2Assignment() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
//        setUpBeforeTestCase();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://login.salesforce.com");

        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.id("password")).sendKeys("Leaf$1234");
        driver.findElement(By.id("Login")).click();



        driver.findElement(By.className("slds-icon-waffle")).click();

        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();


//        String parid = driver.getWindowHandle();
//        Set<String> windowHandles = driver.getWindowHandles();
//        for (String window : windowHandles) {
//            if (!parid.equals(window)) {
//                driver.switchTo().window(window);
//            }
//        }
//        WebElement search = driver.findElement(By.xpath("//input[@class='slds-input']"));
//        search.sendKeys("DashBoards");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement dash = driver.findElement(By.xpath("//p[contains(text(),'Dashboards')]"));
        js.executeScript("arguments[0].scrollIntoView(true);",dash);
        js.executeScript("arguments[0].click();", dash);

//        WebElement dash = driver.findElement(By.xpath("//p[contains(text(),'Dash')]"));
        WebElement dashbaord = driver.findElement(By.xpath("//div[@title='New Dashboard']"));

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click();", dashbaord);

        String parid1 = driver.getWindowHandle();
        Set<String> windowHandles1 = driver.getWindowHandles();
        for (String window : windowHandles1) {
            if (!parid1.equals(window)) {
                driver.switchTo().window(window);
            }
        }
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='dashboard']")));
        driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("SalesFore Automation By Suresh Kumar");

        driver.findElement(By.xpath("//button[@id='submitBtn']")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        //button[contains(text(),'Save')]
    }
}
