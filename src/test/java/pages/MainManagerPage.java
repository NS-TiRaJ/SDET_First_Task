package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tools.Webdriver;

public class MainManagerPage {

    public MainManagerPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public String pageUrl ="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager";
    private Webdriver driver;

    @FindBy(xpath = "//button[@ng-click='addCust()']")//
    private WebElement addCustomerButton;

    @FindBy(xpath = "//button[@ng-click='openAccount()']")//
    private WebElement openAccountButton;

    @FindBy(xpath = "//button[@ng-click='showCust()']")//
    private WebElement customersButton;

    @Step
    public  void addCustomer(){
        addCustomerButton.click();
    }

    @Step
    public void openAccount(){
        openAccountButton.click();
    }
    @Step
    public void customers(){
        customersButton.click();
    }

}
