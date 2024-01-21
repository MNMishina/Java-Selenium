package uiAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseSeleniumPage {
    @FindBy(id = "remove-sauce-labs-onesie")
    private WebElement removeOnesieButton;

    @FindBy(name = "checkout")
    private WebElement checkoutButton;
    public CartPage() {
        PageFactory.initElements(driver, this);
    }
    public CheckoutStepOnePage checkout() {
        removeOnesieButton.click();
        checkoutButton.click();
        return new CheckoutStepOnePage();
    }
}
