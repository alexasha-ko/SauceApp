package webpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "(//button[text() = 'ADD TO CART'])[1]")
    WebElement addItemOne;
    @FindBy(xpath = "(//button[text() = 'ADD TO CART'])[2]")
    WebElement addItemTwo;
    @FindBy(css = "#shopping_cart_container > a > svg > path")
    WebElement basket;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addToBasket() {
        addItemOne.click();
        addItemTwo.click();
    }

    public void navigateToBasket() {
        basket.click();
    }
}
