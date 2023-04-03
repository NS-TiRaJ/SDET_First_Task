package tests;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AddCustomerPage;
import pages.MainManagerPage;
import pages.OpenAccountPage;
import tools.Webdriver;

import java.time.Duration;

public class FifthTestCase {
    WebDriver driver = Webdriver.getChromeDriver();
    MainManagerPage mainManagerPage = new MainManagerPage(driver);
    AddCustomerPage addCustomer = new AddCustomerPage(driver);
    OpenAccountPage openAccountPage = new OpenAccountPage(driver);
    @BeforeTest
    public void befTest(){
        driver.get(mainManagerPage.pageUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mainManagerPage.addCustomer();
        addCustomer.addCustomerInfo("test","test","test");
        driver.switchTo().alert().accept();
        mainManagerPage.openAccount();
    }
    @Test
    @Description("Открытие счета у нового клиента")
    public void openAccount(){
        openAccountPage.addAccountToCustomer("test test");
        driver.switchTo().alert().accept();
        mainManagerPage.customers();
    }
    @AfterTest
    public void closeDriver(){driver.close();}
}
