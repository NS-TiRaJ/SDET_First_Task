package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tools.Webdriver;

public class Main_manager_page {

    public Main_manager_page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public String pageUrl ="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager";

    private Webdriver driver;

    @FindBy(xpath = "//button[@ng-class='btnClass1']")//
    private WebElement addCustomerButton;

    @FindBy(xpath = "//button[@ng-class='btnClass2']")//
    private WebElement OpenAccountButton;

    @FindBy(xpath = "//button[@ng-class='btnClass3']")//
    private WebElement CustomersButton;

    @Step
    public  void Add_Customer(){
        addCustomerButton.click();
    }

    @Step
    public void OpenAccount(){
        OpenAccountButton.click();
    }
    @Step
    public void Customer(){
        CustomersButton.click();
    }

}
