package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customers_page {

    public Customers_page(WebDriver driver){
        PageFactory.initElements(driver,this);
    };
    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    private WebElement Search_input;

    @FindBy(xpath = "//html/body/div/div/div[2]/div/div[2]/div/div/table/thead/tr/td[1]/a")
    private WebElement FirsName_SortButton;

    @Step
    public void Search_Customer(String Data){
        Search_input.click();
        Search_input.sendKeys(Data);
    }

    @Step
    public void SortByFirstName(){
        FirsName_SortButton.click();
        FirsName_SortButton.click();
    }

}
