package allTests;

import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import parentTest.ParentTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static pages.ParentPage.baseUrl;

public class LoginWindowTest extends ParentTest {

    @Test
    public void LoginWindowTest() {
        webDriver.findElement(By.xpath(".//span[contains(text(),'Login')]")).click();
        WebElement inscription = webDriver.findElement(By.xpath(".//p[contains(text(),'LOGIN')]"));
        webDriverWait.until(ExpectedConditions.visibilityOf(inscription));
        assertTrue(actions.isElementDisplayed(inscription));

    }
}
