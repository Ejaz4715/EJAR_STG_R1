package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.SendContractForApprovalPageObjects;
import sa.ejar.web.objects.pre_condition.LoginPageObjects;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.getWebElement;
import static org.apache.commons.io.file.PathUtils.deleteFile;

public class SendContractForApprovalPage {

    public void verifyContractStepsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.contractStepsPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.contractStepsPage()));
        logger.addScreenshot("User Navigate To ' خطوات العقد' Page");
    }

    public void verifyPreviewContractSectionIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.previewContractSection(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.previewContractSection()));
        logger.addScreenshot("User Navigate To ' معاينة العقد' Section");
    }


    public void clickOnDownloadDraftCopyButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.downloadDraftCopyBTN(), 40 );
        Browser.click(SendContractForApprovalPageObjects.downloadDraftCopyBTN());
    }
    public void verifyPreviewBrokerageAgreementSectionIsDisplayed()  {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.previewBrokerageAgreementSection(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.previewBrokerageAgreementSection()));
        logger.addScreenshot("User Navigate To ' معاينة اتفاقية الوساطة' Section");
    }
    public  void clickOnAddButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.addBTN(), 40 );
        Browser.click(SendContractForApprovalPageObjects.addBTN());
    }
    public void verifyAgreementScopePageIsDisplayed()  {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.agreementScopePage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.agreementScopePage()));
        logger.addScreenshot("User Navigate To 'نطاق الإتفاقية' Page");
    }
    public void clickOnEditButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.editBTN(), 40 );
        Browser.click(SendContractForApprovalPageObjects.editBTN());
    }
    public void clickAddAnAdditionalTermsButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.addAnAdditionalTermsBTN(), 40 );
        Browser.click(SendContractForApprovalPageObjects.addAnAdditionalTermsBTN());
    }
    public void verifyAdditionalTermsPageIsDisplayed()  {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.additionalTermsPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.additionalTermsPage()));
        logger.addScreenshot("User Navigate To 'بنود وشروط إضافية' Page");
    }

    public void verifyAdditionalTermsSwitchButtonIsEnabled()  {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.additionalTermsSwitchBTN(), 20);
        Assert.assertTrue(Browser.isElementEnabled(SendContractForApprovalPageObjects.additionalTermsSwitchBTN()));
        logger.addScreenshot("The 'بنود وشروط إضافية' Switch Button is Disabled");
    }
    public void clickAdditionalTermsSwitchButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.additionalTermsSwitchBTN(), 40 );
            Browser.click(SendContractForApprovalPageObjects.additionalTermsSwitchBTN());
    }

    public void verifyAddAnotherAdditionalTermsPopupWindowIsDisplayed()  {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.addAnotherAdditionalTermsPopupWindow(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.addAnotherAdditionalTermsPopupWindow()));
        logger.addScreenshot("The 'إضافة بند آخر' Popup Window is Displayed");
    }
    public void clickOnAddAnotherAdditionalTermsButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.addAnotherAdditionalTermsBTN(), 40 );
        Browser.click(SendContractForApprovalPageObjects.addAnotherAdditionalTermsBTN());
    }
    public void enterAdditionalTerms(String additionalTerms) throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.additionalTermsTextarea(), 20);
        Browser.setText(SendContractForApprovalPageObjects.additionalTermsTextarea(), additionalTerms);

    }
    public void verifyAdditionalTermsHasBeenEntered(String enteredAdditionalTerms) throws Exception {
        WebElement additionalTerms = getWebElement(SendContractForApprovalPageObjects.additionalTermsTextarea());
        String text = additionalTerms.getAttribute("value");
        Assert.assertEquals(text, enteredAdditionalTerms);
        Browser.logger.addScreenshot("The additional terms has been entered");

    }
    public void verifyEnteredAdditionalTerms(String enteredAdditionalTerms) throws Exception {
        WebElement additionalTerms = getWebElement(SendContractForApprovalPageObjects.theEnteredAdditionalTerms());
        String text = additionalTerms.getText();
        Assert.assertEquals(text, enteredAdditionalTerms);
        Browser.logger.addScreenshot("The additional terms has been entered");

    }
    public void verifyAddAnotherAdditionalErrorMessageIsDisplayed(String errorMsgContent)  {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.addAnotherAdditionalTermsErrorMsg(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.addAnotherAdditionalTermsErrorMsg()));
        WebElement error = getWebElement(SendContractForApprovalPageObjects.addAnotherAdditionalTermsErrorMsgContent());
        String text = error.getText();
        Assert.assertEquals(text, errorMsgContent);
        logger.addScreenshot("The 'فشل التحقق من الصحة' error message is Disabled");
    }

    public void verifyEnteredAdditionalTermsIsRemoved()  {
        Browser.waitUntilInvisibilityOfElement(SendContractForApprovalPageObjects.theEnteredAdditionalTermsRemoved(),20);
        Assert.assertTrue(Browser.isElementNotPresent(SendContractForApprovalPageObjects.theEnteredAdditionalTermsRemoved()));
        logger.addScreenshot("The Entered additional terms is Removed");
    }

    public void clickOnConfirmTermsAndConditionsButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.confirmTermsAndConditionsBTN(), 40 );
        Browser.click(SendContractForApprovalPageObjects.confirmTermsAndConditionsBTN());
    }

    public void clickOnContinueToPayingFeesButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.continueToPayingFeesBTN(), 40 );
        Browser.click(SendContractForApprovalPageObjects.continueToPayingFeesBTN());
    }

    public void verifyPayingEjarFeesSectionIsDisplayed()  {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.payingEjarFeesSection(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.payingEjarFeesSection()));
        logger.addScreenshot("The (دفع رسوم إيجار) section is Displayed");
        Browser.waitForSeconds(1);
    }

    public void verifyContractSentMessageIsDisplayed()  {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.contractSentMsg(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.contractSentMsg()));
        logger.addScreenshot("The (تم إرسال العقد للطرفين) message is Displayed");
    }
    public void verifyContractApprovalStepsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.contractApprovalStepsPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.contractApprovalStepsPage()));
        logger.addScreenshot("User Navigate To 'خطوات الموافقة على العقد' page");
    }

    public void clickOnLetUsStartButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.lestUsStartBTN(), 40 );
        Browser.click(SendContractForApprovalPageObjects.lestUsStartBTN());
    }

    public void clickOnDownloadButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.downloadBTN(), 40);
        Browser.click(SendContractForApprovalPageObjects.downloadBTN());
    }
    public void verifyReviewTheContractPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.reviewTheContractPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.reviewTheContractPage()));
        logger.addScreenshot("User Navigate To ' مراجعة معلومات العقد ' page");
    }

    public void verifyRejectTheContractPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.rejectTheContractPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.rejectTheContractPage()));
        logger.addScreenshot("User Navigate To ' لماذا ترغب بالرفض' page");
    }

    public void enterRejectionReason(String rejectReason) throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.rejectionReasonTextarea(), 20);
        Browser.setText(SendContractForApprovalPageObjects.rejectionReasonTextarea(), rejectReason);
        logger.addScreenshot("Rejection Reason : " + rejectReason);

    }
    public void clickOnRejectTheContractButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.rejectTheContractBTN(), 40 );
        Browser.click(SendContractForApprovalPageObjects.rejectTheContractBTN());
    }
    public void verifyRejectTheContractButtonIsEnabled() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.rejectTheContractBTN(), 20);
        Assert.assertTrue(Browser.isElementEnabled(SendContractForApprovalPageObjects.rejectTheContractBTN()));
        logger.addScreenshot("The (رفض العقد) is enabled");
    }

    public void verifyRejectTheContractButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.rejectTheContractBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(SendContractForApprovalPageObjects.rejectTheContractBTN()));
        logger.addScreenshot("The (رفض العقد) is Disabled");
    }

    public void verifyRejectionContractReasonHasBeenEntered(String enteredRejectReason) throws Exception {
        WebElement reason = getWebElement(SendContractForApprovalPageObjects.rejectionReasonTextarea());
        String text = reason.getAttribute("value");
        Assert.assertEquals(text, enteredRejectReason);
        Browser.logger.addScreenshot("The rejection reason has been entered");

    }

    public void verifyIdentityVerificationPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.identityVerification(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.identityVerification()));
        logger.addScreenshot("The user navigate to (التحقق من الهوية) page");
    }
    public void enterVerificationCode(String OTP) throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getVerificationCode(), 20);
        Browser.setText(LoginPageObjects.getVerificationCode(), OTP);
        logger.addScreenshot("The OTP code has been entered");

    }
    public void verifyVerificationCodeIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getVerificationCode(), 20);
    }

    public void verifyOTPErrorMessageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.wrongOTPMsg(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.wrongOTPMsg()));
        logger.addScreenshot("The OTP code has been entered with wrong number");
    }

    public void clickOnIdentityVerificationButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.identityVerificationBTN(), 40 );
        Browser.click(SendContractForApprovalPageObjects.identityVerificationBTN());
    }

    public void verifyIdentityVerificationButtonIsEnabled() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.identityVerificationBTN(), 20);
        Assert.assertTrue(Browser.isElementEnabled(SendContractForApprovalPageObjects.identityVerificationBTN()));
        logger.addScreenshot("The (التحقق من الهوية) is enabled");
    }

    public void verifyIdentityVerificationButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.identityVerificationBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(SendContractForApprovalPageObjects.identityVerificationBTN()));
        logger.addScreenshot("The (التحقق من الهوية) is Disabled");
    }

    public void verifyRejectionSubmittedMessageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.rejectionSubmittedMsg(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.rejectionSubmittedMsg()));
        logger.addScreenshot("The (تم إرسال الرفض) message is displayed");
    }


    public void verifyApprovedSubmittedMessageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.ApprovedSubmittedMsg(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.ApprovedSubmittedMsg()));
        logger.addScreenshot("The (تمت الموافقة بنجاح) message is displayed");
    }


    public void verifyReviewAgreementPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.reviewAgreementPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.reviewAgreementPage()));
        logger.addScreenshot("User Navigate To ' مراجعة اتفاقية الوساطة ' page");
    }

    public void verifyApprovalDisclaimerPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.approvalDisclaimerPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.approvalDisclaimerPage()));
        logger.addScreenshot("User Navigate To ' إخلاء مسؤولية' page");
    }

    public void clickOnSubmitContractApprovalButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.submitContractApprovalBTN(), 40 );
        Browser.click(SendContractForApprovalPageObjects.submitContractApprovalBTN());
    }

    public void verifySubmitContractApprovalButtonIsEnabled() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.submitContractApprovalBTN(), 20);
        Assert.assertTrue(Browser.isElementEnabled(SendContractForApprovalPageObjects.submitContractApprovalBTN()));
        logger.addScreenshot("The (إرسال الموافقة على العقد) is enabled");
    }

    public void verifySubmitContractApprovalButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.submitContractApprovalBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(SendContractForApprovalPageObjects.submitContractApprovalBTN()));
        logger.addScreenshot("The (إرسال الموافقة على العقد) is Disabled");
    }

    public void clickOnAgreeToTheAboveCheckbox() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.agreeToTheAboveCheckbox(), 40 );
        Browser.click(SendContractForApprovalPageObjects.agreeToTheAboveCheckbox());
    }
    public void verifyApprovalConfirmedMessageIsDisplayed()  {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.approvalConfirmedMsg(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.approvalConfirmedMsg()));
        logger.addScreenshot("The (تمت الموافقة) message is Displayed");
    }
}
