package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day4Assignment {

    @Test
    public void dropDown(){
        //disable popup
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        // driver initiation
        WebDriver driver = new ChromeDriver(options);
        //window maximize
        driver.manage().window().maximize();
        //synchronization
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        // enter the url
        driver.get("https://login.salesforce.com");
        // entering the user name and password
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.id("password")).sendKeys("Leaf$1234");
        driver.findElement(By.id("Login")).click();

        driver.findElement(By.className("slds-icon-waffle")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        // Type Content on the Search box
        driver.findElement(By.xpath("//input[@class='slds-input' and @id='input-126']")).sendKeys("Content");
// Click the Content Link
        driver.findElement(By.xpath("//div[@class='slds-app-launcher__tile-body slds-truncate']")).click();
        //Click on Chatter Tab
        WebElement chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
        js.executeScript("arguments[0].click();",chatter);
        String title = driver.getTitle();
        if(title.contains("chatter")){
            System.out.println("Chatter Page is displayed");
        }
        driver.findElement(By.xpath("//span[text()='Question']")).click();

        driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys("What is the advantage of learning SDET");
        driver.findElement(By.xpath("//div[@class='ql-editor ql-blank slds-rich-text-area__content slds-text-color_weak slds-grow']")).sendKeys("Hi");
        driver.findElement(By.xpath("//button[@title='Click, or press Ctrl+Enter']")).click();
        String t="What is the advantage of learning SDET";
        if ( driver.getPageSource().contains("What is the advantage of learning SDET")){

            System.out.println("Text: " + t + " is present. ");
        } else {
            System.out.println("Text: " + t + " is not present. ");
        }
        driver.close();



    }
}
