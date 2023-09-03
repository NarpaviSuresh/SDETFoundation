package Selenium;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Salesforce_tc001 extends Salesforce_baseclass {

    @BeforeMethod
    public void setUp() {
        chromeOptions();
        maximizeWindowAndSync();
        loginUrl();
    }

    @Test()
    public void verifyingLegalEntityName() {
        driver.findElement(By.className("slds-icon-waffle")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement legal = driver.findElement(By.xpath("//p[contains(text(),'Legal Entities')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", legal);
        js.executeScript("arguments[0].click();", legal);
        WebElement dropdown = driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/parent::a//lightning-primitive-icon"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/parent::a//lightning-primitive-icon")))).click();
//        js.executeScript("arguments[0].click();", dropdown);
        WebElement newLegalEntity = driver.findElement(By.xpath("//span[text()='New Legal Entity']/ancestor::a"));
        js.executeScript("arguments[0].click();", newLegalEntity);
        WebElement name = driver.findElement(By.xpath("//label[text()='Name']/following::input"));
        js.executeScript("arguments[0].value='Sales Force Automation By Suresh Kumar';", name);
//        wait.until(ExpectedConditions.
//        WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@name='SaveEdit']")))).click();
//        js.executeScript("arguments[0].click();",save);
        String legalentityName = driver.findElement(By.xpath("//lightning-formatted-text[contains(text(),'Suresh Kumar')]")).getText();
        Assert.assertEquals("Sales Force Automation By Suresh Kumar", legalentityName);
    }

    @Test(enabled = true)
    public void editLegalEntity() throws InterruptedException {
        driver.findElement(By.className("slds-icon-waffle")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement legal = driver.findElement(By.xpath("//p[contains(text(),'Legal Entities')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", legal);
        js.executeScript("arguments[0].click();", legal);
        WebElement dropdown = driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/parent::a//lightning-primitive-icon"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/parent::a//lightning-primitive-icon")))).click();
//        js.executeScript("arguments[0].click();", dropdown);

        WebElement searchLegalEntity = driver.findElement(By.xpath("//input[@part='input']"));
        searchLegalEntity.sendKeys("Sales Force Automation By Suresh Kumar");
        searchLegalEntity.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        //cliking the dropdwown
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//table//tr//td[5]//a")))).click();
//        WebElement dropdown1 = driver.findElement(By.xpath("//div[@class='branding-actions actionMenu']"));
//        js.executeScript("arguments[0].click();",dropdown1);
        // edit option
        WebElement edit = driver.findElement(By.xpath("//div[@title='Edit']/parent::a"));
        js.executeScript("arguments[0].click();", edit);
        WebElement companyName = driver.findElement(By.xpath("//label[text()='Company Name']/following::input"));
        js.executeScript("arguments[0].value='PayPal';", companyName);
        WebElement description = driver.findElement(By.xpath("//label[text()='Description']/..//textarea"));
        js.executeScript("arguments[0].value='SalesForce';", description);
        WebElement status = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']"));
        js.executeScript("arguments[0].click();", status);

        WebElement active = driver.findElement(By.xpath("//span[@title='Active']"));
        js.executeScript("arguments[0].click();", active);

        WebElement save = driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']"));
        js.executeScript("arguments[0].click();", save);
        Thread.sleep(6000);
        js.executeScript("location.reload();");
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//table//tr//td[5]//a")))).click();        // edit option
        WebElement edit1 = driver.findElement(By.xpath("//div[@title='Edit']/parent::a"));
        js.executeScript("arguments[0].click();", edit1);
        WebElement verifyActive = driver.findElement(By.xpath("(//span[text()='Active'])[1]"));
        String text = verifyActive.getText();
        Assert.assertEquals(text, "Active");
    }

    @Test
    public void legalEntityNameAlertCheck() {
        driver.findElement(By.className("slds-icon-waffle")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement legal = driver.findElement(By.xpath("//p[contains(text(),'Legal Entities')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", legal);
        js.executeScript("arguments[0].click();", legal);
        WebElement dropdown = driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/parent::a//lightning-primitive-icon"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/parent::a//lightning-primitive-icon")))).click();
        WebElement newLegalEntity = driver.findElement(By.xpath("//span[text()='New Legal Entity']/ancestor::a"));
        js.executeScript("arguments[0].click();", newLegalEntity);
        WebElement companyName = driver.findElement(By.xpath("//label[text()='Company Name']/following::input"));
        js.executeScript("arguments[0].value='PayPal';", companyName);
        WebElement description = driver.findElement(By.xpath("//label[text()='Description']/..//textarea"));
        js.executeScript("arguments[0].value='SalesForce';", description);
        WebElement status = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']"));
        js.executeScript("arguments[0].click();", status);

        WebElement active = driver.findElement(By.xpath("//span[@title='Active']"));
        js.executeScript("arguments[0].click();", active);

        WebElement save = driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']"));
        js.executeScript("arguments[0].click();", save);

        WebElement alertMessage = driver.findElement(By.xpath("//div[contains(text(),'Complete this')]"));
        String text = alertMessage.getText();
        Assert.assertEquals(text, "Complete this field.");
    }

    @Test(enabled = true)
    public void legalEntitiesAscendingOrderCheck() {
        driver.findElement(By.className("slds-icon-waffle")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement legal = driver.findElement(By.xpath("//p[contains(text(),'Legal Entities')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", legal);
        js.executeScript("arguments[0].click();", legal);
        WebElement sort = driver.findElement(By.xpath("//span[@class='slds-truncate' and @title='Last Modified Date']"));
        js.executeScript("arguments[0].click();", sort);
        js.executeScript("arguments[0].click();", sort);
        WebElement table = driver.findElement(By.xpath("//table[@class='slds-table forceRecordLayout slds-table--header-fixed slds-table--edit slds-table--bordered resizable-cols slds-table--resizable-cols uiVirtualDataTable')]"));

    }
    @Test(dependsOnMethods = "Selenium.Salesforce_tc001.verifyingLegalEntityName")
    public void deleteLegalEntity() throws InterruptedException {
        driver.findElement(By.className("slds-icon-waffle")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement legal = driver.findElement(By.xpath("//p[contains(text(),'Legal Entities')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", legal);
        js.executeScript("arguments[0].click();", legal);
        WebElement dropdown = driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/parent::a//lightning-primitive-icon"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'Legal Entities')]/parent::a//lightning-primitive-icon")))).click();
//        js.executeScript("arguments[0].click();", dropdown);

        WebElement searchLegalEntity = driver.findElement(By.xpath("//input[@part='input']"));
        searchLegalEntity.sendKeys("Sales Force Automation By Suresh Kumar");
        searchLegalEntity.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        //cliking the dropdwown
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//table//tr//td[5]//a")))).click();
//        WebElement dropdown1 = driver.findElement(By.xpath("//div[@class='branding-actions actionMenu']"));
//        js.executeScript("arguments[0].click();",dropdown1);
        // Delete option
        WebElement delete = driver.findElement(By.xpath("//div[@title='Delete']/parent::a"));
        js.executeScript("arguments[0].click();", delete);
        WebElement legalEntitydelete = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        js.executeScript("arguments[0].click();", legalEntitydelete);
        Thread.sleep(10000);
        driver.navigate().refresh();

        try {
            searchLegalEntity.sendKeys("Sales Force Automation By Suresh Kumar");
        }catch(StaleElementReferenceException e) {
            WebElement searchLegalEntity2 = driver.findElement(By.xpath("//input[@part='input']"));
        }

        WebElement searchLegalEntity1 = driver.findElement(By.xpath("//input[@part='input']"));
        searchLegalEntity1.sendKeys("Sales Force Automation By Suresh Kumar");
        searchLegalEntity1.sendKeys(Keys.ENTER);
        String text = driver.findElement(By.xpath("//span[contains(text(),'No items to')]")).getText();
        Assert.assertEquals(text,"No items to display.");
    }

    @Test
    public void createNewServiceAppointments() throws InterruptedException {
                    driver.findElement(By.className("slds-icon-waffle")).click();
            driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement serviceAppointments = driver.findElement(By.xpath("//p[contains(text(),'Service Appointments')]"));
            js.executeScript("arguments[0].scrollIntoView(true);", serviceAppointments);
            js.executeScript("arguments[0].click();", serviceAppointments);
            WebElement newButton = driver.findElement(By.xpath("//div[@title='New']"));
            js.executeScript("arguments[0].click();", newButton);
            WebElement description = driver.findElement(By.xpath("(//textarea[@role='textbox'])[1]"));
            description.sendKeys("Creating Service Appointments");
            driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']")).click();
            driver.findElement(By.xpath("//span[text()='New Account']")).click();
            WebElement accountName = driver.findElement(By.xpath("//input[@data-interactive-lib-uid='43']"));
            accountName.sendKeys("Narpavi");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//button[@title='Save'])[2]")))).click();
            Thread.sleep(5000);
            String text = driver.findElement(By.xpath("//span[text()='Narpavi']")).getText();
            Assert.assertEquals("Narpavi", text);
            driver.findElement(By.xpath("(//a[@class='datePicker-openIcon display'])[1]")).click();
            driver.findElement(By.xpath("//td[contains(@class,'slds-is-today slds-is-selected')]//span[1]")).click();
            driver.findElement(By.xpath("(//a[@class='datePicker-openIcon display'])[2]")).click();
            List<WebElement> futureDate = driver.findElements(By.xpath("//td[@class='slds-is-today slds-is-selected uiDayInMonthCell']//ancestor::tbody/child::tr/td"));
            for (int i = 0; i < futureDate.size(); i++) {
                WebElement date = futureDate.get(i);
                if (date.getAttribute("aria-selected").equalsIgnoreCase("true")) {
                    futureDate.get(i + 5).click();
                    break;
                }
            }
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']")))).click();
            String appointNo = driver.findElement(By.xpath("//span[contains(text(),'SA-')]")).getText();
            System.out.println(appointNo);

            String detailSection = driver.findElement(By.xpath("//span[text()='Details']")).getText();
            Assert.assertEquals("Details", detailSection);


    }

//    @Test(dependsOnMethods = "Selenium.Salesforce_tc001.createNewServiceAppointments")
    @Test
    public void cancelAppointment(){
        driver.findElement(By.className("slds-icon-waffle")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement serviceAppointments = driver.findElement(By.xpath("//p[contains(text(),'Service Appointments')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", serviceAppointments);
        js.executeScript("arguments[0].click();", serviceAppointments);
        driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']//span")).click();
        WebElement cancelServiceAppointment = driver.findElement(By.xpath("//a[@title='Cancel Service Appointment']"));
        if(cancelServiceAppointment.isDisplayed()){
            cancelServiceAppointment.click();
        }
        else{
            driver.findElement(By.xpath("//table/tbody/tr[2]/td[6]/span/div")).click();

        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Confirm Cancellation']")))).click();
        String text = driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell'])[2]")).getText();
        Assert.assertEquals("Cancelled",text);

    }
}




