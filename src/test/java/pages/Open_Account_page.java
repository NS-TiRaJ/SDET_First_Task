package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Open_Account_page {

    public Open_Account_page(WebDriver driver){PageFactory.initElements(driver,this);
    };

    @FindBy(xpath = "//select[@id='userSelect']")
    private WebElement CustomerName;

    @FindBy(xpath = "//select[@id='currency']")
    private WebElement Currency;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement SubmitButton;

    public void Add_account_to_customer(String text) {
        CustomerName.click();
        Select CustomerSelect = new Select(CustomerName);
        CustomerSelect.selectByVisibleText(text);
        Currency.click();
        Select CurrencySelect = new Select(Currency);
        CurrencySelect.selectByVisibleText("Dollar");
        SubmitButton.click();
    }

}
