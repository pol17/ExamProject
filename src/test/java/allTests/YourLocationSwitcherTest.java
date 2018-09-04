package allTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import parentTest.ParentTest;
import static org.junit.Assert.assertTrue;

public class YourLocationSwitcherTest extends ParentTest {

    @Test
    public void YourLocationSwitcherTest() {
        WebElement switcher = webDriver.findElement(By.xpath(".//div[@class='desk__lang-switcher']"));
        WebElement countryDropDown = webDriver.findElement(By.xpath(".//select[@onchange='postCountry(this.value)' and @class='desk__selector__select']"));
        WebElement chooseSwedenInDropDown = webDriver.findElement(By.xpath(".//*[@id='vapp']/header/nav/div[4]/div[1]/div[2]/div/div[1]/div[2]/select/option[text()='Sweden']"));

        Actions action = new Actions(webDriver);
        action.moveToElement(switcher).moveToElement(countryDropDown)
                .click().pause(3000).perform();
        Select chooseSweden = new Select(chooseSwedenInDropDown);
        chooseSweden.selectByVisibleText("Sweden");
//        webDriver.findElement(By.xpath(".//*[@id='vapp']/header/nav/div[4]/div[1]/div[2]/div/div[1]/div[2]/select/option[text()='Sweden']")).click();
//        chooseSweden.click();

//                action.moveToElement(chooseSweden)
//                .click()
//                .build().perform();
//        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h2[contains(text(),'Sweden')]")));

        WebElement inscription = webDriver.findElement(By.xpath("//h2[contains(text(),'Sweden')]"));
        webDriverWait.until(ExpectedConditions.visibilityOf(inscription));
        assertTrue(actions.isElementDisplayed(inscription));
    }
}
