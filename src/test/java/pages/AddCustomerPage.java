package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

    public AddCustomerPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@ng-model='fName']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@ng-model='lName']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@ng-model='postCd']")
    private WebElement postCodeInput;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement addCustomerButton;

    @Step
    public void addCustomerInfo(String FN,String LN,String PC){
        firstNameInput.sendKeys(FN);
        lastNameInput.sendKeys(LN);
        postCodeInput.sendKeys(PC);
        addCustomerButton.click();

    }

}
