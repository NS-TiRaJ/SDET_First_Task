package tests;

import io.qameta.allure.Epic;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Add_Customer_page;
import pages.Customers_page;
import pages.Main_manager_page;
import tools.Webdriver;

import java.util.concurrent.TimeUnit;

@Epic("test")
public class FirstTestCase {
    WebDriver driver = Webdriver.getChromeDriver();
    Main_manager_page mainManagerPage = new Main_manager_page(driver);
    Add_Customer_page add = new Add_Customer_page(driver);
    Customers_page customers_page = new Customers_page(driver);
@BeforeTest
    public void bef_test(){
        driver.get(mainManagerPage.pageUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    @Description("Добавление нового клиета")
    public void addNewCustomer(){
    mainManagerPage.Add_Customer();
    add.add_customer("test","test","test");
    driver.switchTo().alert().accept();
    }

}
