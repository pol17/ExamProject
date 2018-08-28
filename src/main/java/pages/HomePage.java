package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    @FindBy(xpath = ".//p[contains(text(),'LOGIN')]")
    private WebElement loginPopUp;

    public HomePage(WebDriver webDriver) {
        super(webDriver, "/");
    }

    public boolean isLoginPopUpPresent() {
        return actionsWithOurElements.isElementDisplayed(loginPopUp);
    }

    public boolean isSubmitButtonPresent() {
        try {
            return webDriver.findElement(
                    By.tagName("button"))
                    .isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

//    public void clickOnMenuDictionary() {
//        actionsWithOurElements.clickOnElement(menuDictionary);
//    }

//    public void clickOnSubMenuSpares() {
//        actionsWithOurElements.clickOnElement(subMenuSpare);
    }
//}