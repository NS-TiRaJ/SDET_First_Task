package tests;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CustomersPage;
import pages.MainManagerPage;
import tools.Webdriver;
import java.time.Duration;

public class FourthTestCase {
    WebDriver driver = Webdriver.getChromeDriver();
    MainManagerPage mainManagerPage = new MainManagerPage(driver);
    CustomersPage customersPage = new CustomersPage(driver);
    @BeforeTest
    public void befTest(){
        driver.get(mainManagerPage.pageUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    @Description ("Поиск несуществующего клиента")
    public  void  customerSearch(){
        mainManagerPage.customers();
        customersPage.searchCustomer("Lord Voldemort");
    }
    @AfterTest
    public void closeDriver(){driver.close();}
}
