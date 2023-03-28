package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tools.Webdriver;

public class Main_manager_page {

    public String pageUrl ="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager";

    private Webdriver driver;

    @FindBy(xpath = "//html/body/div/div/div[2]/div/div[1]/button[1]")//
    private WebElement addCustomerButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/button[2]")//
    private WebElement OpenAccountButton;

    @FindBy(xpath = "//html/body/div/div/div[2]/div/div[1]/button[3]")//
    private WebElement CustomersButton;

    public  Main_manager_page(Webdriver driver){
        this.driver = driver;
    }

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
