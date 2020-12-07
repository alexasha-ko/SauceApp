package webpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "user-name")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login-button")
    WebElement login;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String standard_user) {
        userName.sendKeys("standard_user");
    }

    public void setPassword(String secret_sauce) {
        password.sendKeys("secret_sauce");
    }

    public void clickLogin() {
        login.click();
    }

    public void loginToSauceApp(String standard_user,String secret_sauce){
        this.setUserName(standard_user);
        this.setPassword(secret_sauce);
        this.clickLogin();
    }
}
