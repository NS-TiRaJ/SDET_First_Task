package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class OpenAccountPage {

    public OpenAccountPage(WebDriver driver){PageFactory.initElements(driver,this);
    };

    @FindBy(xpath = "//select[@id='userSelect']")
    private WebElement customerName;

    @FindBy(xpath = "//select[@id='currency']")
    private WebElement currency;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    public void addAccountToCustomer(String CusName) {
        customerName.click();
        Select CustomerSelect = new Select(customerName);
        CustomerSelect.selectByVisibleText(CusName);
        currency.click();
        Select CurrencySelect = new Select(currency);
        CurrencySelect.selectByVisibleText("Dollar");
        submitButton.click();
    }

}
