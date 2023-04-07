package tests;

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

public class ThirdTestCase {
    WebDriver driver = Webdriver.getChromeDriver();
    MainManagerPage mainManagerPage = new MainManagerPage(driver);
    AddCustomerPage addCustomer = new AddCustomerPage(driver);
    CustomersPage customersPage = new CustomersPage(driver);
    @BeforeTest
    public void bef_test(){
        driver.get(mainManagerPage.pageUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    @Description ("Поиск клиента")
    public  void  CustomerSearch(){
        mainManagerPage.addCustomer();
        addCustomer.addCustomerInfo("test","test","test");
        driver.switchTo().alert().accept();
        mainManagerPage.customers();
        customersPage.searchCustomer("Albus");
    }
    @AfterTest
    public void closeDriver(){driver.close();}
}
