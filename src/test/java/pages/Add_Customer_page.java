package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Customer_page {


    @FindBy(xpath = "//html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")
    private WebElement FirstName_input;

    @FindBy(xpath = "//html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")
    private WebElement LastName_input;

    @FindBy(xpath = "//html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")
    private WebElement PostCode_input;

    @FindBy(xpath = "//html/body/div/div/div[2]/div/div[2]/div/div/form/button")
    private WebElement addCustomer_button;

    @Step
    public void add_customer(String FN,String LN,String PC){
        FirstName_input.sendKeys(FN);
        LastName_input.sendKeys(LN);
        PostCode_input.sendKeys(PC);
        addCustomer_button.click();
    }

}
