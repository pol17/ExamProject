package parentTest;

import io.qameta.allure.Step;
import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static pages.ParentPage.baseUrl;

public class ParentTest {
    protected WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    protected HomePage homePage;
    String browser = System.getProperty("browser");
    protected WebDriverWait webDriverWait;
    protected ActionsWithOurElements actions;


    @Before
    public void setUp() {
        initDriver(browser);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, 5000);
        homePage = new HomePage(webDriver);
        actions = new ActionsWithOurElements(webDriver);
        webDriver.get(baseUrl);

    }

    private void initDriver(String browserName) {
        if (browserName == null || browserName.equals("chrome")) {
            logger.info("Chrome will be started");
            File file = new File("./src/drivers/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            webDriver = new ChromeDriver();
            logger.info("Chrome is started");
        }
        else {
            logger.error("Can't init driver");
            Assert.fail("Can't init driver");
        }
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    //метод Acceptance Criteria
    @Step
    protected void checkAC(String message, boolean actual, boolean expected) {
        if (actual != expected) {
            logger.error("AC failed: " + message);
            {
                Assert.assertEquals(message, expected, actual);
            }
        }
    }
}