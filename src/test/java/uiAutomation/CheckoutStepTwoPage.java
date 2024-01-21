package uiAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwoPage extends BaseSeleniumPage {
    @FindBy(className = "summary_info")
    private WebElement totalAmount;

    @FindBy(id = "finish")
    private WebElement finishButton;

    public CheckoutStepTwoPage() {
        PageFactory.initElements(driver, this);
    }
    public String getAmount() {
        return totalAmount.getText();
    }
    public CheckoutComplete finishCheckout() {
        finishButton.click();
        return new CheckoutComplete();
    }
}
