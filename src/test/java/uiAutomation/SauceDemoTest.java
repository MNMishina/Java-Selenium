package uiAutomation;

import org.junit.Assert;
import org.junit.Test;
import readProperties.ConfigProvider;

public class SauceDemoTest extends BaseSeleniumTest {
    @Test
    public void goShopping() {
        LoginPage loginPage = new LoginPage();
        loginPage.authorization(ConfigProvider.STANDARD_USER_USERNAME, ConfigProvider.STANDARD_USER_PASSWORD)
                .addProductsToCart()
                .checkout()
                .inputCustomerInfo(TestData.TEST_FIRST_NAME, TestData.TEST_LAST_NAME, TestData.TEST_POSTAL_CODE)
                .finishCheckout()
                .backToProductsPage();

        Assert.assertEquals("Products", CheckoutComplete.getTitle());
    }
}
