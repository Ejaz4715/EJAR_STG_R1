package sa.ejar.web.pages;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
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
        CommonMethodsPage.errorMessage("أقصى قيمة هي", RevokeContractPageObjects.ExecutionOrderDateErrorMessage());
        logger.addScreenshot("");
    }

    public void clickOnCalenderIcon() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.CalenderIcon(), 40);
        Browser.click(RevokeContractPageObjects.CalenderIcon());
    }

    public void verifyCalenderIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.CalenderPopUp(), 40);
        Browser.click(RevokeContractPageObjects.CalenderPopUp());

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
        CommonMethodsPage.errorMessage("حجم الملف أكبر من المسموح به. أقصى حجم للملف يجب أن لا يتعدى 20 ميغابت" ,
                RevokeContractPageObjects.ErrorMessageForLargeFile());
        logger.addScreenshot("");
    }

    public void verifyNextButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.NextButton(), 40);
        Assert.assertTrue(Browser.isElementDisabled(RevokeContractPageObjects.NextButton()), "Button is not disabled and user is able to continue");
        logger.addScreenshot("");


    }

    public void checkAllPaymentSettledRadioButtonIsSelected() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.allPaymentsSettledRadioBTN(), 40);
        Assert.assertTrue(Browser.isElementSelected(TerminateContractPageObjects.allPaymentsSettledRadioBTN()), "All Payment Settled button is not selected");
        logger.addScreenshot("");
    }

    public void checkRequestDetailsPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.RequestDetailsSection(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RevokeContractPageObjects.RequestDetailsSection()), "The Request Details page is not displayed");
        logger.addScreenshot("");

    }

    public void clickOnConfirmRevokeContractButton() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.ConfirmRevokeContratButton(), 40);
        Browser.click(RevokeContractPageObjects.ConfirmRevokeContratButton());

    }

    public void getReqNum() {
        String request = CommonMethodsPage.getRequestNumber(RevokeContractPageObjects.RequestNumberText());
        TestDataManager.addDependantGlobalTestData("Revoke", "ReqNum", request);
        TestDataManager.writeDependantGlobalTestData("Revoke");
    }
}
