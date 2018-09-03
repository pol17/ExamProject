package allTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import parentTest.ParentTest;
import static org.junit.Assert.assertTrue;

public class GermanLocalisationSwitcherTest extends ParentTest {

    @Test
    public void GermanLocalisationSwitcherTest() {
        webDriver.findElement(By.xpath(".//footer//div[2]//nav//ul[3]//li[5]//a[@href='/de/']")).click();
        WebElement inscription = webDriver.findElement(By.xpath(".//span[contains(text(),'Anmelden')]"));
        webDriverWait.until(ExpectedConditions.visibilityOf(inscription));
        assertTrue(actions.isElementDisplayed(inscription));
    }
}
