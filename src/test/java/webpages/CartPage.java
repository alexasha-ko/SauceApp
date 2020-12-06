package webpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//button[contains(text(),'REMOVE')]")
    WebElement removeButton;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueShoppingButton;
    @FindBy(xpath = "//a[contains(text(),'CHECKOUT')]")
    WebElement checkoutButton;
    @FindBy(xpath = "//div[@class='cart_quantity']")
    WebElement cartQuantity;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkRemoveButtonIsDisplayed() {
        removeButton.isDisplayed();
    }

    public void checkContinueShoppingButtonIsDisplayed() {
        continueShoppingButton.isDisplayed();
    }

    public void checkCheckoutButtonIsDisplayed() {
        checkoutButton.isDisplayed();
    }

    public void checkCartQuantityButtonIsDisplayed() {
        cartQuantity.isDisplayed();
    }

    public void clickOnRemoveButton() {
        removeButton.click();
    }
}
