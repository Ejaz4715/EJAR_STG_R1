package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.TerminateContractPageObjects;

import static com.testcrew.manager.PDFReportManager.logger;
import static sa.ejar.web.pages.CommonMethodsPage.selectFromList;

public class TerminateContractPage {
    public void verifyTerminationStepsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.terminationStepsPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(TerminateContractPageObjects.terminationStepsPage()));
        logger.addScreenshot("User Navigate To ' طلب الإنهاء' Page");
    }

    public void verifyTheRequestTerminationPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.requestTerminationText(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(TerminateContractPageObjects.requestTerminationText()));
        logger.addScreenshot("User Navigate To ' طلب الإنهاء' Page");
    }

    public void verifyTheContractsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.theContractPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(TerminateContractPageObjects.theContractPage()));
        logger.addScreenshot("User Navigate Back To 'العقود' Page");
    }


    public void selectRequestingParty() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.requestingPartyDDL(), 20);
        selectFromList("المؤجر", TerminateContractPageObjects.requestingPartyDDL());
        selectFromList("المستأجر", TerminateContractPageObjects.requestingPartyDDL());
        logger.addScreenshot("The Requesting Party Is Selected");
    }
    public void selectOneRequestingParty(String party) throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.requestingPartyDDL(), 20);
        selectFromList(party, TerminateContractPageObjects.requestingPartyDDL());
        logger.addScreenshot("The Requesting Party Is Selected");
    }

    public void clickOnRequiredTerminationDateIconButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.calendarIconOFDateRequiredToTerminateTheContract(), 20);
        Browser.click(TerminateContractPageObjects.calendarIconOFDateRequiredToTerminateTheContract());
        logger.addScreenshot("The Calendar Icon Button Is Clicked And Displays The Pop Up Calendar");
    }

    public void selectTerminationReason() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.terminationReasonDDL(), 20);
        selectFromList("عدم الرغبة في متابعة العقد", TerminateContractPageObjects.terminationReasonDDL());
        selectFromList("أخرى", TerminateContractPageObjects.terminationReasonDDL());
        logger.addScreenshot("The Termination Reason Is Selected");
    }
    public void selectOneTerminationReason(String reason) throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.terminationReasonDDL(), 20);
        selectFromList(reason, TerminateContractPageObjects.terminationReasonDDL());
        logger.addScreenshot("The Termination Reason Is Selected");
    }

    public void enterTerminationReason(String reason) throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.terminationReasonTXT(), 20);
        Browser.setText(TerminateContractPageObjects.terminationReasonTXT(),reason);
        logger.addScreenshot("The text has been entered");
    }
    public void verifyTheConfirmationMessageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.confirmationMsg(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(TerminateContractPageObjects.confirmationMsg()));
        logger.addScreenshot("Pop up (رسالة تأكيد) window is displayed");
    }

    public void verifyTheFinancialSettlementSectionIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.financialSettlementSection(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(TerminateContractPageObjects.financialSettlementSection()));
        logger.addScreenshot("The (تسوية مالية) section is displayed");
    }
    public void selectAllPaymentsSettledRadioButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.allPaymentsSettledRadioBTN(), 20);
        Browser.click(TerminateContractPageObjects.allPaymentsSettledRadioBTN());
        logger.addScreenshot("The (تسوية جميع المدفوعات) Is Selected ");
    }
    public void selectTenantFinalPaymentRadioButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.tenantFinalPaymentRadioBTN(), 20);
        Browser.click(TerminateContractPageObjects.tenantFinalPaymentRadioBTN());
        logger.addScreenshot("The (الدفعة النهائية للمستأجر) Is Selected ");
    }
    public void enterPaymentAmount(String amount) throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.paymentAmountTXT(), 20);
        Browser.setText(TerminateContractPageObjects.paymentAmountTXT(),amount);
        logger.addScreenshot("The amount has been entered");
    }
    public void enterPaymentDueDate(String date) throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.paymentDueDateTXT(), 20);
        Browser.setText(TerminateContractPageObjects.paymentDueDateTXT(),date);
        logger.addScreenshot("The date has been entered");
    }
    public void verifyThePaymentDateErrorMessageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.validationFailedTXT(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(TerminateContractPageObjects.validationFailedTXT()));
        logger.addScreenshot("The (يجب أن يكون تاريخ الاستحقاق الدفع قبل تاريخ السريان) error message is displayed");
    }

    public void clickOnConfirmRequestTheTerminationButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.confirmRequestTheTerminationBTN(), 20);
        Browser.click(TerminateContractPageObjects.confirmRequestTheTerminationBTN());

    }
    public void verifyTheTerminationSummarySectionIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.terminationSummarySection(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(TerminateContractPageObjects.terminationSummarySection()));
        logger.addScreenshot("The (ملخص الإنهاء) section is displayed");
    }
    public void verifyTheTerminationDetailsSectionIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.terminationDetailsSection(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(TerminateContractPageObjects.terminationDetailsSection()));
        logger.addScreenshot("The (تفاصيل الإنهاء) section is displayed");
    }
    public void verifyTheTerminationRequestSuccessfullySend() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.terminationRequestDoneMessage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(TerminateContractPageObjects.terminationRequestDoneMessage()));
        logger.addScreenshot("The (تم تقديم طلب الإنهاء) successfully ");
    }

    public void verifyTheRequestWaitingForApproval(String expected) throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.partyApprovalMessage(), 40);
        String actual = Browser.getText(TerminateContractPageObjects.partyApprovalMessage());
        Assert.assertEquals(actual, expected);
        Browser.logger.addScreenshot("The message is displayed");
    }
    public void verifyTheRequestsIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.theRequestsPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(TerminateContractPageObjects.theRequestsPage()));
        logger.addScreenshot("The (الطلبات) is displayed ");
    }

    public void assertRequestsAreAppearing() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.theRequestsList(), 40);
        boolean status = Browser.isElementDisplayed(TerminateContractPageObjects.theRequestsList());
        Assert.assertTrue(status, "Requests are not displayed");
        Browser.logger.addScreenshot("All available requests are displayed");
    }

    public void verifyTheRequestingPartyIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.requestingPartyDDL(), 20);
        Assert.assertTrue(Browser.isElementDisabled(TerminateContractPageObjects.requestingPartyDDL()));
        logger.addScreenshot("The User not able to select (الطرف الطالب للإنهاء)");
    }
}

