package sa.ejar.web.pages;

import com.testcrew.base.WebBaseTest;
import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.RentalIncidentsPageObjects;
import sa.ejar.web.objects.RevokeContractPageObjects;

import java.time.Duration;
import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.*;
import static com.testcrew.web.Browser.getText;
import static sa.ejar.web.pages.CommonMethodsPage.selectFromList;

public class RentalIncidentsPage {

    public void clickOnRentalIncidentTab() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.rentalIncidentTab(), 40);
        Browser.click(RentalIncidentsPageObjects.rentalIncidentTab());
    }

    public void clickOnNewRentalIncidentButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.newRentalIncidentBTN(), 40);
        Browser.click(RentalIncidentsPageObjects.newRentalIncidentBTN());
    }

    public void selectRequesterType(String requesterType) throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterTypeDDL(), 20);
        selectFromList(requesterType, RentalIncidentsPageObjects.requesterTypeDDLOption());

    }

    public void verifyRequesterTypeIsSelected(String selectedRequesterType) {
        WebElement requesterType = getWebElement(RentalIncidentsPageObjects.requesterTypeDDL());
        String t = requesterType.getAttribute("value");
        String text = t.toLowerCase();
        if (text.contains("lessor")) {
            text = "مؤجر";
        } else if (text.contains("tenant")) {
            text = "مستأجر";
        }
        Assert.assertEquals(text, selectedRequesterType);
        logger.addScreenshot("The (صفة مقدم الطلب) Is Selected");

    }

    public void selectRequesterCategory(String requesterType) throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterCategoryDDL(), 20);
        selectFromList(requesterType, RentalIncidentsPageObjects.requesterCategoryDDLOption());

    }

    public void verifyRequesterCategoryIsSelected(String selectedRequesterCategory) {
        WebElement requesterCategory = getWebElement(RentalIncidentsPageObjects.requesterCategoryDDL());
        String t = requesterCategory.getAttribute("value");
        String text = t.toLowerCase();
        if (text.contains("individual")) {
            text = "فرد";
        } else if (text.contains("organization")) {
            text = "منشأة";
        }
        Assert.assertEquals(text, selectedRequesterCategory);
        logger.addScreenshot("The (فئة مقدم الطلب) Is Selected");
    }

    public void clickOnRequesterRoleRadioButtons(String requesterRole) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterRoleRadioBTNs(), 40);
        List<WebElement> requester = Browser.getWebElements(RentalIncidentsPageObjects.requesterRoleRadioBTNs());
        int i;
        for (i = 0; i <= requester.size(); i++) {
            String optText = requester.get(i).getText();
            if (optText.contains(requesterRole)) {
                requester.get(i).click();
                break;
            }
        }
        logger.addScreenshot("The (إختر صفة مقدم الطلب) radio button is selected");
    }

    public void clickOnAddRequesterInfoButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.addRequesterInfoBTN(), 40);
        Browser.click(RentalIncidentsPageObjects.addRequesterInfoBTN());
    }

    public void verifyTheAddRequesterInfoPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.addRequesterInfoPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.addRequesterInfoPage()));
        logger.addScreenshot("The (إضافة بيانات مقدم الطلب) page is displayed");
    }

    public void verifyNewRentalIncidentPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.newRentalIncidentPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.newRentalIncidentPage()));
        logger.addScreenshot("The (تسجيل واقعة ايجارية جديدة) page is displayed");
    }

    public void verifyRequesterCategoryDropdownListIsDisabled() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterCategoryDDL(), 20);
        Assert.assertTrue(Browser.isElementDisabled(RentalIncidentsPageObjects.requesterCategoryDDL()));
        logger.addScreenshot("The (فئة مقدم الطلب) dropdown list is disabled");
    }


    public void verifyAddRequesterInfoButtonIsNotDisplayed() {
        Assert.assertTrue(Browser.isElementNotPresent(RentalIncidentsPageObjects.addRequesterInfoBTN()));
        logger.addScreenshot("The (بيانات مقدم الطلب) button is not displayed");
    }

    public void clearPhoneNumber() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.phoneNumberInput(), 20);
        WebElement ele = Browser.getWebElement(RentalIncidentsPageObjects.phoneNumberInput());
        ele.click();
        ele.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
    }

    public void verifyRequesterInfoIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterInfo(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.requesterInfo()));
        logger.addScreenshot("The (بيانات مقدم الطلب) is displayed");
    }

    public void verifyRequesterInfoIsRemoved() {
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.requesterInfo(), 20);
        Assert.assertTrue(Browser.isElementNotPresent(RentalIncidentsPageObjects.requesterInfo()));
        logger.addScreenshot("The (بيانات مقدم الطلب) is removed");
    }

    public void clickOnAddAbstainingPartyInfoButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.AddAbstainingPartyInfoButton(), 40);
        Browser.click(RentalIncidentsPageObjects.AddAbstainingPartyInfoButton());
    }

    public void clickOnOrganizationRadioButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.organizationRadioBTN(), 40);
        Browser.click(RentalIncidentsPageObjects.organizationRadioBTN());
    }

    public void verifyOrganizationInfoSectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.organizationInfoSection(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.organizationInfoSection()));
        logger.addScreenshot("");
    }

    public void clickOnContinueToRepresentativeInfoButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.continueToRepresentativeInfoBTN(), 40);
        Browser.click(RentalIncidentsPageObjects.continueToRepresentativeInfoBTN());
    }

    public void clickOnAddOwnershipDocumentLinkButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.addOwnershipDocumentLinkBTN(), 40);
        Browser.click(RentalIncidentsPageObjects.addOwnershipDocumentLinkBTN());
    }

    public void verifyAddOwnershipDocumentLinkButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.addOwnershipDocumentLinkBTN(), 40);
        boolean b = false;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        if (wait.until(ExpectedConditions.elementToBeClickable(RentalIncidentsPageObjects.addOwnershipDocumentLinkBTN())) == null) {
            b = true;
        }
        Assert.assertFalse(b, "Link is clickable");
        logger.addScreenshot("");
    }

    public void verifyOwnershipDocumentIdentificationSectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.ownershipDocumentIdentificationSection(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.ownershipDocumentIdentificationSection()));
        logger.addScreenshot("");
    }

    public void verifyOrganizationIdentificationSectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.organizationIdentificationSection(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.organizationIdentificationSection()));
        logger.addScreenshot("");
    }

    public void verifyAddAbstainingPartyButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.AddAbstainingPartyInfoButton(), 40);
        Assert.assertTrue(Browser.isElementDisabled(RentalIncidentsPageObjects.AddAbstainingPartyInfoButton()), "Abstaining party info button is enabled");
        logger.addScreenshot("");
    }

    public void verifyAddAbstainingPartyButtonIsEnabled() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.AddAbstainingPartyInfoButton(), 40);
        Assert.assertTrue(Browser.isElementEnabled(RentalIncidentsPageObjects.AddAbstainingPartyInfoButton()));
        logger.addScreenshot("");
    }

    public void verifyAbstainerRole(String abstainerRole) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.AbstainerRole(), 40);
        String actualRole = Browser.getText(RentalIncidentsPageObjects.AbstainerRole());
        Assert.assertTrue(actualRole.contains(abstainerRole), "Abstainer role is not " + abstainerRole);
        logger.addScreenshot("");
    }

    public void verifyAbstainingPartyInfoSectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.AbstainingPartyInfoSection(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.AbstainingPartyInfoSection()),
                "Abstaining party information section is not displayed");
        logger.addScreenshot("");
    }

    public void verifyIdentificationAbstainingPartyIdSectionSectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.IdentificationAbstainingPartyIdSection(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.IdentificationAbstainingPartyIdSection()),
                "Identification Abstaining party ID information section is not displayed");
        logger.addScreenshot("");
    }

    public void verifyAbstainingPartyInformationIsAdded() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.AbstainingPartyInformation(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.AbstainingPartyInformation()),
                "Abstaining information is not added");
        logger.addScreenshot("");
    }

    public void verifyAbstainingPartyInformationIsDeleted() {
        Assert.assertFalse(Browser.isElementPresent(RentalIncidentsPageObjects.AbstainingPartyInformation()),
                "Abstaining party information has been deleted");
        logger.addScreenshot("");
    }

    public void clickOnEditButtonOnAbstainingPartyInfoSection() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.EditButtonOnAbstainingPartyInfoSection(), 40);
        Browser.click(RentalIncidentsPageObjects.EditButtonOnAbstainingPartyInfoSection());
    }

    public void clickOnDeleteButtonOnAbstainingPartyInfoSection() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.DeleteButtonOnAbstainingPartyInfoSection(), 40);
        Browser.click(RentalIncidentsPageObjects.DeleteButtonOnAbstainingPartyInfoSection());
    }

    public void verifyContractPeriodSectionIsNotDisplayed() {
        Assert.assertFalse(Browser.isElementPresent(RentalIncidentsPageObjects.ContractPeriodSectionTitle()));
        logger.addScreenshot("Contract Period section is not displayed");
    }

    public void verifyContractPeriodDateInputFieldIsNotClickable() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.ContractPeriodDateInputField(), 40);
        boolean status = false;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        if (wait.until(ExpectedConditions.elementToBeClickable(RentalIncidentsPageObjects.ContractPeriodDateInputField())) == null) {
            status = true;
        }
        Assert.assertFalse(status, "Contract period date input field is Enabled/Clickable");
        logger.addScreenshot("Contract period date input field is disabled");
    }

    public void clickOnContractTypeDropDown() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.ContractTypeDropDown(), 40);
        Browser.click(RentalIncidentsPageObjects.ContractTypeDropDown());
    }

    public void verifyContractTypeIsSelected(String selectedContractType) {
        WebElement contractType = Browser.getWebElement(RentalIncidentsPageObjects.ContractTypeDropDown());
        String t = contractType.getAttribute("value");
        String text = t.toLowerCase();
        if (text.contains("residential")) {
            text = "سكني";
        } else if (text.contains("commercial")) {
            text = "تجاري";
        } else if (text.contains("agricultural")) {
            text = "زراعي";
        } else if (text.contains("industrial")) {
            text = "صناعي";
        }
        Assert.assertEquals(text, selectedContractType, "Selected contract type is not same");
        logger.addScreenshot("The " + text + " contract type is selected");
    }

    public void clickOnContractPeriodDateInput() {
        Browser.waitUntilElementToBeClickable(RentalIncidentsPageObjects.ContractPeriodDateInputField(), 40);
        Browser.click(RentalIncidentsPageObjects.ContractPeriodDateInputField());
    }

    public void verifyCalenderIsNotDisplayed() {
        Assert.assertFalse(Browser.isElementPresent(RevokeContractPageObjects.CalenderIcon()), "Calender icon displayed");
        WebBaseTest.logger.addScreenshot("");
    }

    public void enterAnnualRent(String rent) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.AnnualRentInputField(), 40);
        Browser.clearText(RentalIncidentsPageObjects.AnnualRentInputField());
        Browser.setText(RentalIncidentsPageObjects.AnnualRentInputField(), rent);
    }

    public void enterDays(String day) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.DaysInputField(), 40);
        WebElement ele = Browser.getWebElement(RentalIncidentsPageObjects.DaysInputField());
        ele.click();
        ele.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        ele.sendKeys(day);
    }

    public void enterBORegistrationNumber(String crNumber) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.BORegistrationInputField(), 40);
        Browser.setText(RentalIncidentsPageObjects.BORegistrationInputField(), crNumber);
    }

    public void verifyPopUpErrorMessages(String expectedMessage) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        WebElement error = Browser.getWebElement(RentalIncidentsPageObjects.PopUpErrorMessage());
        String errorMessage = error.getText();
        Assert.assertTrue(errorMessage.contains(expectedMessage),
                "Actual Error message (" + errorMessage + ") does not match with expected (" + expectedMessage + ") messages");
        logger.addScreenshot("");
    }

    public void verifyAddOwnershipDocumentInfoIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.assertOwnershipDocument(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.assertOwnershipDocument()));
        logger.addScreenshot("");
    }

    public void verifyReleaseDateInputFieldIsDisabled() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.releaseDateTXT(), 40);
        boolean b = false;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        if (wait.until(ExpectedConditions.elementToBeClickable(CommonMethodsPageObjects.releaseDateTXT())) == null) {
            b = true;
        }
        Assert.assertFalse(b, "Input filed is not disabled");
        logger.addScreenshot("");
    }

    public void verifyOwnershipDocumentInputFieldIsDisabled() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ownershipDocumentNumberTXT(), 40);
        boolean b = false;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        if (wait.until(ExpectedConditions.elementToBeClickable(CommonMethodsPageObjects.ownershipDocumentNumberTXT())) == null) {
            b = true;
        }
        Assert.assertFalse(b, "Input filed is not disabled");
        logger.addScreenshot("");
    }

    public void verifyDifferentAttachmentFormatNotUploaded() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.differentFormatAttachment(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.differentFormatAttachment()));
        logger.addScreenshot("");
    }

    public void clickOnApproveOfDeclarationCheckbox() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.approveOfDeclarationCheckbox(), 40);
        Browser.click(RentalIncidentsPageObjects.approveOfDeclarationCheckbox());
    }

    public void verifyApproveOfDeclarationCheckboxIsSelected() {
        Assert.assertTrue(Browser.isElementSelected(RentalIncidentsPageObjects.approveOfDeclarationCheckboxSelected()));
        logger.addScreenshot("");
    }

    public void clickOnReasonRefusalRadioButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.reasonRefusalRadioBTN(), 40);
        Browser.click(RentalIncidentsPageObjects.reasonRefusalRadioBTN());
    }

    public void getRequestNumberRentalIncidentForApproval() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.rentalIncidentRequestNumber(), 40);
        String request = getText(RentalIncidentsPageObjects.rentalIncidentRequestNumber());
        TestDataManager.addDependantGlobalTestData("RentalIncident", "ReqNum_Approve", request);
        TestDataManager.writeDependantGlobalTestData("RentalIncident");
        logger.addScreenshot("");
    }

    public void getRequestNumberRentalIncidentForReject() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.rentalIncidentRequestNumber(), 40);
        String request = getText(RentalIncidentsPageObjects.rentalIncidentRequestNumber());
        TestDataManager.addDependantGlobalTestData("RentalIncident", "ReqNum_Reject", request);
        TestDataManager.writeDependantGlobalTestData("RentalIncident");
        logger.addScreenshot("");
    }

    public void getRequestNumberRentalIncidentForUpdate() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.rentalIncidentRequestNumber(), 40);
        String request = getText(RentalIncidentsPageObjects.rentalIncidentRequestNumber());
        TestDataManager.addDependantGlobalTestData("RentalIncident", "ReqNum_Update", request);
        TestDataManager.writeDependantGlobalTestData("RentalIncident");
        logger.addScreenshot("");
    }

    public void selectAvailableUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.availableUnit(), 40);
        WebElement btn = Browser.getWebElement(CommonMethodsPageObjects.nextBTN());
        while (!(btn.isEnabled())) {
            List<WebElement> ListOfUnitStatus = Browser.driver.findElements(RentalIncidentsPageObjects.availableUnit());
            for (WebElement y : ListOfUnitStatus) {
                String getUnitStatus = y.getText();
                if (getUnitStatus.contains("متاحة")) {
                    y.click();
                    break;
                }
            }
            if (btn.isEnabled()) {
                break;
            } else {
                Browser.click(By.xpath("(//button[@class='btn btn-sm btn-outline-primary icon-container'])[2]"));
            }
        }
    }

    public void verifyIDNumberOfPersonWriteTheContractInputIsNotDisplayed() {
        Browser.executeJSScroll(200);
        Assert.assertFalse(Browser.isElementPresent(RentalIncidentsPageObjects.IDNumberOfPersonWriteTheContractInput()));
        logger.addScreenshot("");
    }

    public void verifyPhoneNumberOfPersonWriteTheContractInputIsNotDisplayed() {
        Browser.executeJSScroll(200);
        Assert.assertFalse(Browser.isElementPresent(RentalIncidentsPageObjects.PhoneNumberOfPersonWriteTheContractInput()));
        logger.addScreenshot("");
    }

    public void enterIdNumberOfPersonWriteTheContract(String personId) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.IDNumberOfPersonWriteTheContractInput(), 40);
        Browser.setText(RentalIncidentsPageObjects.IDNumberOfPersonWriteTheContractInput(), personId);
    }

    public void enterPhoneNumberOfPersonWriteTheContract(String personPhoneNumber) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.PhoneNumberOfPersonWriteTheContractInput(), 40);
        Browser.setText(RentalIncidentsPageObjects.PhoneNumberOfPersonWriteTheContractInput(), personPhoneNumber);
    }

    public void verifyRejectTheRequestPopUpIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.rejectTheRequestPopUp(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.rejectTheRequestPopUp()));
        logger.addScreenshot("");
    }

    public void verifyConfirmButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmBTN(), 40);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.confirmBTN()));
        logger.addScreenshot("");
    }

    public void enterRejectReason(String rejectReason) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.rejectReasonTextarea(), 40);
        Browser.setText(RentalIncidentsPageObjects.rejectReasonTextarea(), rejectReason);
    }

    public void verifyRejectConfirmationMessageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.rejectConfirmationMsg(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.rejectConfirmationMsg()));
        logger.addScreenshot("");
    }

    public void checkRentalIncidentRequestPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.RentalIncidentRequestPageHeading(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RevokeContractPageObjects.RentalIncidentRequestPageHeading()));
        WebBaseTest.logger.addScreenshot("");
    }

    public void enterRequestNumber(String requestNumber) {
        waitUntilPresenceOfElement(CommonMethodsPageObjects.RequestNumberInputField(), 20);
        setText(CommonMethodsPageObjects.RequestNumberInputField(), requestNumber);
        waitForSeconds(1);
        logger.addScreenshot("Entered Request Number in search input field");
    }

    public void checkRentalIncidentRequestStatus(String expectedStatus) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.RentalIncidentRequestStatus(), 40);
        String status = Browser.getText(RentalIncidentsPageObjects.RentalIncidentRequestStatus());
        Assert.assertTrue(status.contains(expectedStatus),
                "Actual request status (" + status + ") does not match with expected (" + expectedStatus + ") status");
        logger.addScreenshot("Request status is (" + status + ")");
    }

    public void clickOnSendToLegalAuthoritiesButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.SendToLegalAuthoritiesBTN(), 40);
        Browser.click(RentalIncidentsPageObjects.SendToLegalAuthoritiesBTN());
    }

    public void verifySendToLegalAuthoritiesPopUpIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.SendToLegalAuthoritiesPopUp(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.SendToLegalAuthoritiesPopUp()));
        logger.addScreenshot("");
    }

    public void clickOnViewAttachment() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.ViewAttachmentButton(), 40);
        Browser.click(RentalIncidentsPageObjects.ViewAttachmentButton());
    }

    public void enterCommentInPopup(String comment) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.CommentTextareaOnPopup(), 40);
        Browser.setText(RentalIncidentsPageObjects.CommentTextareaOnPopup(), comment);
    }

    public void verifySendRequestButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.SendRequestButton(), 40);
        Assert.assertTrue(Browser.isElementDisabled(RentalIncidentsPageObjects.SendRequestButton()), "Button is not disabled");
        logger.addScreenshot("");
    }

    public void clickOnSendRequestButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.SendRequestButton(), 40);
        Browser.click(RentalIncidentsPageObjects.SendRequestButton());
    }

    public void clickOnReviewedByLegalAuthorityButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.ReviewedByLegalAuthorityButton(), 40);
        Browser.click(RentalIncidentsPageObjects.ReviewedByLegalAuthorityButton());
    }

    public void clickOnApproveRequestButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.ApproveRequestButton(), 40);
        Browser.click(RentalIncidentsPageObjects.ApproveRequestButton());
    }

    public void clickOnApproveButtonOnPopUp() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.ApproveButtonOnPopup(), 40);
        Browser.click(RentalIncidentsPageObjects.ApproveButtonOnPopup());
    }

    public void verifyUpdateAndResubmitButtonIsEnabled() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.UpdateAndResubmitButton(), 40);
        Assert.assertTrue(Browser.isElementEnabled(RentalIncidentsPageObjects.UpdateAndResubmitButton()));
    }

    public void clickOnConfirmTheRejectionButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.confirmTheRejectionBTN(), 40);
        Browser.click(RentalIncidentsPageObjects.confirmTheRejectionBTN());
    }

    public void clickOnRegisterUnilateralContract() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.registerUnilateralContract(), 40);
        Browser.click(RentalIncidentsPageObjects.registerUnilateralContract());
    }

    public void clickOnRentalIncidentInquiryButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.rentalIncidentInquiryBTN(), 40);
        Browser.click(RentalIncidentsPageObjects.rentalIncidentInquiryBTN());
    }

    public void checkRentalIncidentInquiryPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.rentalIncidentInquiryTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.rentalIncidentInquiryTitle()));
        WebBaseTest.logger.addScreenshot("");
    }

    public void checkVerifyButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.verifyBTN(), 40);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.verifyBTN()));
        WebBaseTest.logger.addScreenshot("");
    }

    public void checkWarningPopupIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.warningPopup(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.warningPopup()));
        WebBaseTest.logger.addScreenshot("");
    }

    public void checkRequestDetailsPageDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requestDetailsPage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.requestDetailsPage()));
        WebBaseTest.logger.addScreenshot("");
    }

    public void clickOnKebabButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.kebabBTN(), 40);
        Browser.click(RentalIncidentsPageObjects.kebabBTN());
    }

    public void clickOnUpdateAndResubmitButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.UpdateAndResubmitButton(), 40);
        Browser.click(RentalIncidentsPageObjects.UpdateAndResubmitButton());
    }

    public void verifyCheckBoxesAreClickAble() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.CheckBoxesForUpdateAndResubmitPopup(), 40);
        List<WebElement> chckBoxList = Browser.getWebElements(RentalIncidentsPageObjects.CheckBoxesForUpdateAndResubmitPopup());
        boolean status = true;
        for (WebElement checkbox : chckBoxList) {
            if (!(checkbox.isEnabled())) {
                status = false;
                break;
            }
        }
        Assert.assertTrue(status, "All the checkboxes are not clickable");
    }

    public void clickOnCheckboxes() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.CheckBoxesForUpdateAndResubmitPopup(), 40);
        List<WebElement> chckBoxList = Browser.getWebElements(RentalIncidentsPageObjects.CheckBoxesForUpdateAndResubmitPopup());
        for (WebElement checkbox : chckBoxList) {
            checkbox.click();
        }
    }

    public void checkRequestUpdateCountIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.RequestUpdateCount(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.RequestUpdateCount()));
        logger.addScreenshot("");
    }

    public void verifyAdminCommentIsVisibleForUpdateRequest(String expectedComment) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.AdminComment(), 40);
        String actualComment = Browser.getText(RentalIncidentsPageObjects.AdminComment());
        Assert.assertTrue(actualComment.contains(expectedComment),
                "Actual comment (" + actualComment + ") does not match with expected comment (" + expectedComment + ")");
        logger.addScreenshot("");
    }
}
