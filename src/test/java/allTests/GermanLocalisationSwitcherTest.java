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
        webDriver.findElement(By.xpath("//*[@id=\"vapp\"]/section/footer/div/div[6]/li/a[1]")).click();
        WebElement inscription = webDriver.findElement(By.xpath("//*[@id=\"vapp\"]/content/div/div/div/main/div/div/div[1]/div[2]/div/h1"));
        webDriverWait.until(ExpectedConditions.visibilityOf(inscription));
        assertTrue(actions.isElementDisplayed(inscription));
    }
}
