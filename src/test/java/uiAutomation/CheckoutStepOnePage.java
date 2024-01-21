package uiAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOnePage extends BaseSeleniumPage {
    @FindBy(name = "firstName")
    private WebElement firstNameField;

    @FindBy(name = "lastName")
    private WebElement lastNameField;

    @FindBy(name = "postalCode")
    private WebElement postalCodeField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    public CheckoutStepOnePage() {
        PageFactory.initElements(driver, this);
    }
    public CheckoutStepTwoPage inputCustomerInfo(String firstName, String lastName, Integer postalCode) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        postalCodeField.sendKeys(postalCode.toString());
        continueButton.click();
        return new CheckoutStepTwoPage();
    }
}
