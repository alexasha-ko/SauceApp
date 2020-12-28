package tests;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.CapabilitiesGenerator;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod(description = "Opening Chrome Driver")
    public void createDriver(ITestContext context) {
        try {
            driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
        } catch (SessionNotCreatedException ex) {

        }

    }

    @AfterMethod (alwaysRun = true)
    public void closeDriver() {
        if(driver != null) {
            driver.quit();
        }
    }
}