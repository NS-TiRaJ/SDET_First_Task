package tests;

import io.qameta.allure.Epic;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AddCustomerPage;
import pages.CustomersPage;
import pages.MainManagerPage;
import tools.Webdriver;

import java.time.Duration;

@Epic("test")
public class FirstTestCase {
    WebDriver driver = Webdriver.getChromeDriver();
    MainManagerPage mainManagerPage = new MainManagerPage(driver);
    AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
    @BeforeTest
    public void befTest(){
        driver.get(mainManagerPage.pageUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    @Description("Добавление нового клиета")
    public void addNewCustomer(){
    mainManagerPage.addCustomer();
    addCustomerPage.addCustomerInfo("test","test","test");
    driver.switchTo().alert().accept();
    mainManagerPage.customers();
    }
    @AfterTest
    public void closeDriver(){driver.close();}
}
