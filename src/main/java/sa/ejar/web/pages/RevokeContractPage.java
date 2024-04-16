package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.RevokeContractPageObjects;

import static com.testcrew.base.WebBaseTest.logger;

public class RevokeContractPage {

    public void verifyRevokeContractPageIsDisplayed(){
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.RevokeContractPageHeading(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RevokeContractPageObjects.RevokeContractPageHeading()));
        logger.addScreenshot("");
    }

    public void checkRevokeContractRequestPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.RevokeContractRequestPageHeading(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RevokeContractPageObjects.RevokeContractRequestPageHeading()));
        logger.addScreenshot("");
    }
}
