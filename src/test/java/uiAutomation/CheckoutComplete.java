package uiAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutComplete extends BaseSeleniumPage {

    @FindBy(xpath = "//span[@class='title']")
    private static WebElement title;

    @FindBy(id = "back-to-products")
    private WebElement backHomeButton;

    public CheckoutComplete() {
        PageFactory.initElements(driver, this);
    }
    public static String getTitle() {
        return title.getText();
    }

    public ProductsPage backToProductsPage() {
        backHomeButton.click();
        return new ProductsPage();
    }
}


