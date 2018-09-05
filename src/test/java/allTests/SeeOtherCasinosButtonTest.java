package allTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import parentTest.ParentTest;
import static org.junit.Assert.assertTrue;

public class SeeOtherCasinosButtonTest extends ParentTest {

    @Test
    public void SeeOtherCasinosButtonTest() {
        webDriver.findElement(By.xpath("//span[contains(text(),'See other casinos')]")).click();
        WebElement inscription = webDriver.findElement(By.xpath("//h1[contains(text(),'Online Casino Reviews and Ratings')]"));
        webDriverWait.until(ExpectedConditions.visibilityOf(inscription));
        assertTrue(actions.isElementDisplayed(inscription));
    }
}
