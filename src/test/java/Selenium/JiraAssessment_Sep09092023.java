package Selenium;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class JiraAssessment_Sep09092023 {
    public static WebDriver driver;
    @BeforeTest
    public void setUp() {

        //Handle the popups

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);

        //window maximize and sync
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // load the url with username and password
        driver.get("https://api-training.atlassian.net/");
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com");
        driver.findElement(By.xpath("//span[text()='Continue']")).click();
        driver.findElement(By.id("password")).sendKeys("India@123");
        driver.findElement(By.id("login-submit")).click();

    }

    @Test
    public void jiraAssessment(){

        // clicking SDET 5 project
        driver.findElement(By.xpath("//p[text()='SDET-5']")).click();

        // Create
        driver.findElement(By.xpath("//span[text()='Create']")).click();

        //Summary
        driver.findElement(By.id("summary-field")).sendKeys("Summary to be Entered");

        //Create
        driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();

        //Backlog
        driver.findElement(By.xpath("//span[text()='Backlog']")).click();

        driver.findElement (By.xpath("//a[@href='/browse/SDET-64'])[2]")).click();

        String text = driver.findElement(By.xpath("//h1[text()='summ']")).getText();

        Assert.assertEquals("Summary to be Entered",text);
    }
}
