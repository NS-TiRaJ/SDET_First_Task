package tests;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Add_Customer_page;
import pages.Customers_page;
import pages.Main_manager_page;
import pages.Open_Account_page;
import tools.Webdriver;

import java.time.Duration;

public class FifthTestCase {
    WebDriver driver = Webdriver.getChromeDriver();
    Main_manager_page mainManagerPage = new Main_manager_page(driver);
    Add_Customer_page add = new Add_Customer_page(driver);
    Open_Account_page open_account_page = new Open_Account_page(driver);
    @BeforeTest
    public void bef_test(){
        driver.get(mainManagerPage.pageUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mainManagerPage.Add_Customer();
        add.add_customer("test","test","test");
        driver.switchTo().alert().accept();
        mainManagerPage.OpenAccount();
    }
    @Test
    @Description("Открытие счета у нового клиента")
    public void Open_Account(){
        open_account_page.Add_account_to_customer("test test");
        driver.switchTo().alert().accept();
    }
    @AfterTest
    public void Close_driver(){driver.close();}
}
