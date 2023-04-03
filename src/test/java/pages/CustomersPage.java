package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage {

    public CustomersPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    };
    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    private WebElement searchInput;

    @FindBy(xpath = "//a[@ng-click=\"sortType = 'fName'; sortReverse = !sortReverse\"]")
    private WebElement firsNameSortButton;

    @Step
    public void searchCustomer(String Data){
        searchInput.click();
        searchInput.sendKeys(Data);
    }

    @Step
    public void sortByFirstName(){
        firsNameSortButton.click();
        firsNameSortButton.click();
    }

}
