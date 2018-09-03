package allTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import parentTest.ParentTest;

import static org.junit.Assert.assertTrue;

public class LoginWindowTest extends ParentTest {

    @Test
    public void LoginWindowTest() {
        webDriver.findElement(By.xpath(".//span[contains(text(),'Login')]")).click();
        WebElement inscription = webDriver.findElement(By.xpath(".//p[contains(text(),'LOGIN')]"));
        webDriverWait.until(ExpectedConditions.visibilityOf(inscription));
        assertTrue(actions.isElementDisplayed(inscription));
    }
}
