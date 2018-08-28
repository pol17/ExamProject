package allTests;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import parentTest.ParentTest;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginWindowTest extends ParentTest {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
    }

    @Test
    public void loginPopUp(){
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        webDriver.get("baseUrl");

        webDriver.findElement(By.xpath(".//span[contains(text(),'Login')]")).click();
        webDriver.findElement(By.xpath(".//p[contains(text(),'LOGIN')]")).isDisplayed();
//        logger.info("?");

        checkAC("is PopUp is not present", homePage.isLoginPopUpPresent(), true);

/*        Assert.assertTrue("PopUp is not present",
                isPopUpPresent());*/
    }

/*    @After
    public void tearDown(){
        webDriver.quit();
    }*/

/*    private boolean isPopUpPresent(){
        try {
            return webDriver.findElement(
                    By.xpath(".//*[@class='pull-left image']//img[@class='img-circle']"))
                    .isDisplayed();
        } catch (Exception e){
            return false;*//*
        }
    }*/
}
