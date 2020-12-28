package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.CapabilitiesGenerator;
import webpages.CartPage;
import webpages.HomePage;
import webpages.LoginPage;


public class TestCartPage extends BaseTest{
    WebDriver driver;
    LoginPage objLogin;
    HomePage objHomePage;
    CartPage objCartPage;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
    }

    @Test
    public void testVerificationCartPageElements() {
        objLogin = new LoginPage(driver);
        objLogin.loginToSauceApp("standard_user", "secret_sauce");

        objHomePage = new HomePage(driver);
        objHomePage.addToBasket();
        objHomePage.navigateToBasket();

        objCartPage = new CartPage(driver);

        objCartPage.checkRemoveButtonIsDisplayed();
        objCartPage.checkCartQuantityButtonIsDisplayed();
        objCartPage.checkCheckoutButtonIsDisplayed();
        objCartPage.checkContinueShoppingButtonIsDisplayed();
        objCartPage.clickOnRemoveButton();
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }
}
