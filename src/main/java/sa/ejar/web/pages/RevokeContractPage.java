package sa.ejar.web.pages;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.RevokeContractPageObjects;
import sa.ejar.web.objects.TerminateContractPageObjects;

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

    public void verifyGreaterExecutionDateErrorMessage() {
        CommonMethodsPage.errorMessage("أقصى", RevokeContractPageObjects.ExecutionOrderDateErrorMessage());
        logger.addScreenshot("");
    }

    public void clickOnCalenderIcon() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.CalenderIcon(), 40);
        Assert.assertTrue(Browser.isElementEnabled(RevokeContractPageObjects.CalenderIcon()), "Calender icon is not clickable");
        Browser.click(RevokeContractPageObjects.CalenderIcon());
    }

    public void verifyCalenderIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.CalenderPopUp(), 40);
        Browser.click(RevokeContractPageObjects.CalenderPopUp());
        logger.addScreenshot("");

    }

    public void enterNotesText(String note) {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.NoteInputField(), 40);
        Browser.setText(RevokeContractPageObjects.NoteInputField(), note);
    }

    public void verifyNoteIsTextEntered(String note) {
        CommonMethodsPage.verifyValueIsEntered(note, RevokeContractPageObjects.NoteInputField());
        logger.addScreenshot("");
    }

    public void verifyHijriDateIsDisplayedUnderExecutionOrderDate() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.HijriDateUnderExecutionOrderDate(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RevokeContractPageObjects.HijriDateUnderExecutionOrderDate()), "Hijri Date is not displayed");
    }

    public void uploadRequiredDocuments(String pdfAttachment) {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.NoteInputField(), 40);
        Browser.executeJSScroll(1000);
        Browser.waitForSeconds(2);
        CommonMethodsPage.UploadAttachment(pdfAttachment, RevokeContractPageObjects.UploadDocumentsInput());
    }

    public void verifyAttachmentIsUploaded() {
        CommonMethodsPage.checkOneAttachmentIsAdded(RevokeContractPageObjects.AttachmentIcon());
        logger.addScreenshot("");
    }

    public void verifyAttachmentsAreUploaded() {
        CommonMethodsPage.checkMultipleAttachmentsAreAdded(RevokeContractPageObjects.AttachmentIcon());
        logger.addScreenshot("");
    }

    public void verifyErrorMessageIsDisplayedForLargeFile() {
        CommonMethodsPage.errorMessageFoAttachments("حجم الملف أكبر من المسموح به. أقصى حجم للملف يجب أن لا يتعدى 20 ميغابت" ,
                RevokeContractPageObjects.ErrorMessageForLargeFile());
        logger.addScreenshot("");
    }

    public void verifyNextButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.NextButton(), 40);
        Assert.assertTrue(Browser.isElementDisabled(RevokeContractPageObjects.NextButton()), "Button is not disabled and user is able to continue");
        logger.addScreenshot("");


    }

    public void checkAllPaymentSettledRadioButtonIsSelected() throws Exception {
        WebElement ele = Browser.getWebElement(TerminateContractPageObjects.allPaymentsSettledRadioInput());
        Assert.assertTrue(ele.isSelected(), "All Payment Settled button is not selected");
        logger.addScreenshot("");
    }
    public void checkTenantFinalPaymentRadioButtonIsSelected() throws Exception {
        WebElement ele = Browser.getWebElement(TerminateContractPageObjects.tenantFinalPaymentsSettledRadioInput());
        Assert.assertTrue(ele.isSelected(), "All Payment Settled button is not selected");
        logger.addScreenshot("");
    }


    public void checkRequestDetailsPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.RequestDetailsSection(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RevokeContractPageObjects.RequestDetailsSection()), "The Request Details page is not displayed");
        logger.addScreenshot("");

    }

    public void clickOnConfirmRevokeContractButton() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.ConfirmRevokeContractButton(), 40);
        Browser.click(RevokeContractPageObjects.ConfirmRevokeContractButton());

    }

    public void getReqNumApprove() {
        String request = CommonMethodsPage.getRequestNumberFromRequestPage(RevokeContractPageObjects.RequestNumberText());
        TestDataManager.addDependantGlobalTestData("Revoke", "ReqNum_Approval", request);
        TestDataManager.writeDependantGlobalTestData("Revoke");
    }

    public void getReqNumReject() {
        String request = CommonMethodsPage.getRequestNumberFromRequestPage(RevokeContractPageObjects.RequestNumberText());
        TestDataManager.addDependantGlobalTestData("Revoke", "ReqNum_Rejection", request);
        TestDataManager.writeDependantGlobalTestData("Revoke");
    }

    public void getReqNumApproveWithPayment() {
        String request = CommonMethodsPage.getRequestNumberFromRequestPage(RevokeContractPageObjects.RequestNumberText());
        TestDataManager.addDependantGlobalTestData("Revoke", "ReqNum_Approval_With_Payment", request);
        TestDataManager.writeDependantGlobalTestData("Revoke");
    }


    public void clickOnViewButtonOnRequest() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.ViewButtonOnRequest(), 40);
        Browser.click(RevokeContractPageObjects.ViewButtonOnRequest());
        logger.addScreenshot("");
    }

    public void clickOnUnAssignButton() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.UnAssignButton(), 40);
        Browser.click(RevokeContractPageObjects.UnAssignButton());
    }


    public void enterRejectionReason(String rejectReason) {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.RejectReasonTextarea(), 40);
        Browser.setText(RevokeContractPageObjects.RejectReasonTextarea(), rejectReason);
    }

    public void verifyRejectionReasonHasBeenEntered(String rejectReason) {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.RejectReasonTextarea(), 40);
        WebElement ele = Browser.getWebElement(RevokeContractPageObjects.RejectReasonTextarea());
        String text = ele.getAttribute("value");
        Assert.assertEquals(text, rejectReason, "Text is not entered");
        logger.addScreenshot("");
    }

    public void verifyRejectButtonIsDisabledOnPopUp() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.RejectBTNOnPopUp(), 40);
        Assert.assertTrue(Browser.isElementDisabled(RevokeContractPageObjects.RejectBTNOnPopUp()), "Button is not disabled");
    }

    public void clickOnRejectButtonOnPopUp() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.RejectBTNOnPopUp(), 40);
        Browser.click(RevokeContractPageObjects.RejectBTNOnPopUp());
    }

    public void clickOnCancelButtonOnRevokeRequestPage() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.cancelBTNOnRequestTPage(), 40);
        Browser.click(RevokeContractPageObjects.cancelBTNOnRequestTPage());
    }
}
