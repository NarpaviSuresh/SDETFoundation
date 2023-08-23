package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day6Assignment {

/*

 Day_6
 Assignment

1.Launch the url:
https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm
2.Click Try It Button
3.Click OK/Cancel in the alert
4.Confirm the action is performed correctly by verifying the text !!



Hint
*Switch to the frame

*Then click Try It with xpath
*Switch to the alert and Enter your name in alert box
*Then perform accept / dismiss
*
Get the text using id
*
Verify the text based on the action
 */
    @Test
    public void day6() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        // driver initiation
        WebDriver driver = new ChromeDriver(options);
        //window maximize
        driver.manage().window().maximize();
        //synchronization
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // enter the url
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement text = driver.findElement(By.xpath("//p[text()='You pressed OK!']"));
        String text1 = text.getText();
        System.out.println(text1);
        if(text1.equalsIgnoreCase("You pressed OK!")){
            System.out.println("Text verified");
        }
        else{
            System.out.println("Text is not verified");
        }

    }


}
