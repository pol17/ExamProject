package allTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import parentTest.ParentTest;
import static org.junit.Assert.assertTrue;
import static pages.ParentPage.baseUrl;

public class ClosedCasinoTest extends ParentTest {

    @Test
    public void ClosedCasinoTest() {
//        webDriver.get("https://holymolycasinos.com/casino/casibon-casino-review");
        String additionalUrl = new String(("casino/casibon-casino-review"));
        webDriver.get(baseUrl+additionalUrl);
        WebElement inscription = webDriver.findElement(By.xpath("//button//span[contains(text(),'Closed')]"));
        webDriverWait.until(ExpectedConditions.visibilityOf(inscription));
        assertTrue(actions.isElementDisplayed(inscription));
    }
}
