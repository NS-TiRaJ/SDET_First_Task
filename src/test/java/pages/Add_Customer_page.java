package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Customer_page {

    public  Add_Customer_page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement FirstName_input;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement LastName_input;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    private WebElement PostCode_input;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement addCustomer_button;



    @Step
    public void add_customer(String FN,String LN,String PC){
        FirstName_input.sendKeys(FN);
        LastName_input.sendKeys(LN);
        PostCode_input.sendKeys(PC);
        addCustomer_button.click();

    }

}
