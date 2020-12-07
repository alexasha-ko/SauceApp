package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webpages.CartPage;
import webpages.HomePage;
import webpages.LoginPage;
import java.util.concurrent.TimeUnit;

public class TestCartPage {
    WebDriver driver;
    LoginPage objLogin;
    HomePage objHomePage;
    CartPage objCartPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/index.html");
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
