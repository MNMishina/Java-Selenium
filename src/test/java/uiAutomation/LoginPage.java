package uiAutomation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

public class LoginPage extends BaseSeleniumPage {
    @FindBy(id = "user-name")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;

    public LoginPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public ProductsPage authorization(String usernameValue, String passwordValue) {
        usernameField.sendKeys(usernameValue);
        passwordField.sendKeys(passwordValue, Keys.ENTER);
        return new ProductsPage();
    }
}
