package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Sep29_seleniumtask {
    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/table.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        WebElement table = driver.findElement(By.xpath("//*[@id='form:j_idt89']/div[2]/div/table"));
        System.out.println(table);
        WebElement headerrow = table.findElement(By.xpath(".//tr"));
        System.out.println(headerrow.toString());
        List<WebElement> headerCells = headerrow.findElements(By.xpath(".//th"));

        for (WebElement headerCell : headerCells) {
            System.out.println(headerCell.getText());

            }

        List<WebElement> rows = table.findElements(By.xpath(".//tr"));
        for (WebElement row : rows) {
            String status = row.findElement(By.xpath("//*[@id=\"form:j_idt89:j_idt102\"]/span[1]")).getText();
            if (status.equals("New") || status.equals("Qualified")) {
                List<WebElement> cells = row.findElements(By.xpath(".//td"));
                for (WebElement cell : cells) {
                    System.out.println(cell.getText());
                }
            }

        }


    }
}
