package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.ejar.web.objects.RevokeContractPageObjects;

import static com.testcrew.base.WebBaseTest.logger;
import static sa.ejar.web.pages.CommonMethodsPage.verifyValueIsEntered;

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

    public void enterExecutionOrderNumber(String executionOrderNumber) {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.ExecutionOrderNumberInput(), 40);
        Browser.setText(RevokeContractPageObjects.ExecutionOrderNumberInput(), executionOrderNumber);
    }

    public void checkExecutionOrderNumberIsEntered(String executionOrderNumber) {
        verifyValueIsEntered(executionOrderNumber, RevokeContractPageObjects.ExecutionOrderNumberInput());
        logger.addScreenshot("");
    }

    public void enterExecutionOrderDate(String executionOrderDate) {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.ExecutionOrderDateInput(), 40);
        Browser.setText(RevokeContractPageObjects.ExecutionOrderDateInput(), executionOrderDate);
    }

    public void checkExecutionOrderDateIsEntered(String executionOrderDate) {
        verifyValueIsEntered(executionOrderDate, RevokeContractPageObjects.ExecutionOrderDateInput());
        logger.addScreenshot("");
    }
}
