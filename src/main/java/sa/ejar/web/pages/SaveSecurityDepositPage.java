package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import lombok.extern.flogger.Flogger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.SaveSecurityDepositPageObjects;

import java.util.List;

import static com.testcrew.web.Browser.logger;

public class SaveSecurityDepositPage {


    public void clickOnUserProfile() {
        Browser.waitUntilVisibilityOfElement(SaveSecurityDepositPageObjects.UserProfile(), 40 );
        Browser.click(SaveSecurityDepositPageObjects.UserProfile());
    }

    public void clickOnWallet() {
        Browser.waitUntilVisibilityOfElement(SaveSecurityDepositPageObjects.WalletOption(), 40 );
        Browser.click(SaveSecurityDepositPageObjects.WalletOption());
    }

    public void verifySecurityAmountReservedDescriptionIsDisplayed(String expectedDesc) {
        Browser.waitUntilVisibilityOfElement(SaveSecurityDepositPageObjects.ListOfDesc(), 40);
        List<WebElement> list = Browser.getWebElements(SaveSecurityDepositPageObjects.ListOfDesc());
        boolean b = false;
        for(WebElement w : list){
            if(w.getText().contains(expectedDesc)){
                b = true;
                break;
            }
        }
        Assert.assertTrue(b, "Expected description is not displayed for the selected contract");
    }

    public void verifySecurityAmountReservedIsSameAsContract(String expectedDepositAmount) {
        Browser.waitUntilVisibilityOfElement(SaveSecurityDepositPageObjects.DepositAmount(), 40);
        WebElement ele = Browser.getWebElement(SaveSecurityDepositPageObjects.DepositAmount());
        String actualAmount = ele.getText();
        Assert.assertTrue(actualAmount.contains(expectedDepositAmount), "Expected amount is ( " + expectedDepositAmount + " ) and actual amount is ( " + actualAmount);
        logger.addScreenshot("The amount is " +actualAmount);
    }

    public void clickOnManageAccount() {
        Browser.waitUntilVisibilityOfElement(SaveSecurityDepositPageObjects.manageOffice(), 40 );
        Browser.click(SaveSecurityDepositPageObjects.manageOffice());
    }

    public void verifySecurityAmountInMoveInForm(String amount) {
        Browser.waitUntilVisibilityOfElement(SaveSecurityDepositPageObjects.SecurityAmountInMoveInForm(), 40 );
        String actualAmount = Browser.getText(SaveSecurityDepositPageObjects.SecurityAmountInMoveInForm());
        Assert.assertTrue(actualAmount.contains(amount), "Actual amount in the form is ( " +actualAmount + " ) and expected amount is (" +amount );
        logger.addScreenshot("The amount in form is "+actualAmount);
    }

    public void enterDamageAmount(String damageAmount) {
        Browser.waitUntilVisibilityOfElement(SaveSecurityDepositPageObjects.damageAmountInput(), 40 );
        Browser.setText(SaveSecurityDepositPageObjects.damageAmountInput(), damageAmount);
    }
}
