import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SauceAppVerifications {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/index.html");
        WebElement inputLogin = driver.findElement(By.id("user-name"));
        inputLogin.sendKeys("standard_user");
        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }
    @Test
    public void findCataloguePictures() {
        // to find item's picture
        driver.findElement(By.xpath("(//a/img)[1]"));
        driver.findElement(By.xpath("(//a/img)[2]"));
        driver.findElement(By.xpath("(//a/img)[3]"));
        driver.findElement(By.xpath("(//a/img)[4]"));
        driver.findElement(By.xpath("(//a/img)[5]"));
        driver.findElement(By.xpath("(//a/img)[6]"));
    }
    @Test
    public void checkPrices(){
        // to find prices
        driver.findElement(By.xpath("//div[text() = '29.99']"));
        driver.findElement(By.xpath("//div[text() = '9.99']"));
        driver.findElement(By.xpath("(//div[text() = '15.99'])[1]"));
        driver.findElement(By.xpath("//div[text() = '49.99']"));
        driver.findElement(By.xpath("//div[text() = '7.99']"));
        driver.findElement(By.xpath("(//div[text() = '15.99'])[2]"));
    }
    @Test
    public void checkAddButtons(){
        // to find buttons "ADD TO CART"
        driver.findElement(By.xpath("(//button[text() = 'ADD TO CART'])[1]"));
        driver.findElement(By.xpath("(//button[text() = 'ADD TO CART'])[2]"));
        driver.findElement(By.xpath("(//button[text() = 'ADD TO CART'])[3]"));
        driver.findElement(By.xpath("(//button[text() = 'ADD TO CART'])[4]"));
        driver.findElement(By.xpath("(//button[text() = 'ADD TO CART'])[5]"));
        driver.findElement(By.xpath("(//button[text() = 'ADD TO CART'])[6]"));
    }
    @Test
    public void checkSortingButton(){
        //to find A-Z button
        driver.findElement(By.xpath("//select"));
    }
    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
