package uiAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BaseSeleniumPage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addBackpackButton;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement addJacketButton;

    @FindBy(name = "add-to-cart-sauce-labs-onesie")
    private WebElement addOnesieButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement cartIconLink;

    public ProductsPage() {
        PageFactory.initElements(driver, this);
    }
    public CartPage addProductsToCart() {
        addBackpackButton.click();
        addJacketButton.click();
        addOnesieButton.click();
        cartIconLink.click();
        return new CartPage();
    }
}

