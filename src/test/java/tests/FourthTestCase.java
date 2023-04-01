package tests;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Customers_page;
import pages.Main_manager_page;
import tools.Webdriver;
import java.time.Duration;

public class FourthTestCase {
    WebDriver driver = Webdriver.getChromeDriver();
    Main_manager_page mainManagerPage = new Main_manager_page(driver);
    Customers_page customers_page = new Customers_page(driver);
    @BeforeTest
    public void bef_test(){
        driver.get(mainManagerPage.pageUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    @Description ("Поиск несуществующего клиента")
    public  void  CustomerSearch(){
        mainManagerPage.Customer();
        customers_page.Search_Customer("Lord Voldemort");
    }
    @AfterTest
    public void Close_driver(){driver.close();}
}
