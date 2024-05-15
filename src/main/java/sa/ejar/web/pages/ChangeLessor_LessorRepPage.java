package sa.ejar.web.pages;

import com.testcrew.base.WebBaseTest;
import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.ChangeLessor_LessorRepPageObjects;
import sa.ejar.web.objects.CommonMethodsPageObjects;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.*;

public class ChangeLessor_LessorRepPage {
    public String getContractNumber() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.FirstContractNumber(), 40);
        Browser.waitForSeconds(2);
        String text = Browser.getText(ChangeLessor_LessorRepPageObjects.FirstContractNumber());
        String contractNum = text.substring(1);
        return contractNum;
    }
    public void getContractNumAddRep(){
        String contractNum = getContractNumber();
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "Contract_Number_addRep", contractNum);
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
    }

    public void getContractNumChangeRep(){
        String contractNum = getContractNumber();
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "Contract_Number_updateRep", contractNum);
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
    }
    public void getContractNumRemoveRep(){
        String contractNum = getContractNumber();
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "Contract_Number_removeRep", contractNum);
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
    }
    public void getContractNumChangeLessor(){
        String contractNum = getContractNumber();
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "Contract_Number_changeLessor", contractNum);
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
    }

    public void selectActiveContractFromStatusDropdown(String reqStatus) {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.ContractStatusDropdown(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.ContractStatusDropdown());
        List<WebElement> statusList = Browser.getWebElements(ChangeLessor_LessorRepPageObjects.ContractStatusDropdownOptions());
        for (WebElement status : statusList){
            if (status.getText().contains(reqStatus)){
                status.click();
                break;
            }
        }
        logger.addScreenshot("");
    }

    public String getContractVersionFromPDF() throws IOException {
        String filePath = driver.getCurrentUrl();
        URL url = new URL(filePath);
        InputStream iStream = url.openStream();
        BufferedInputStream bfStream = new BufferedInputStream(iStream);
        PDDocument document = PDDocument.load(bfStream);
        PDFTextStripper stripper = new PDFTextStripper();
        int chr = stripper.getText(document).indexOf("Contract No.");
        String contactVersion = stripper.getText(document).substring(chr, chr + 31);
        return contactVersion;
    }

    public void getContractVersionAddRep() throws IOException {
        String contactVersion = getContractVersionFromPDF();
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "Contract_Version_addRep", contactVersion.strip());
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
    }
    public void getContractVersionChangeRep() throws IOException {
        String contactVersion = getContractVersionFromPDF();
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "Contract_Version_updateRep", contactVersion.strip());
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
    }

    public void getContractVersionRemoveRep() throws IOException {
        String contactVersion = getContractVersionFromPDF();
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "Contract_Version_removeRep", contactVersion.strip());
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
    }

    public void getContractVersionChangeLessor() throws IOException {
        String contactVersion = getContractVersionFromPDF();
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "Contract_Version_changeLessor", contactVersion.strip());
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
    }

    public void compareContractVersionFromPDF(String oldVersion) throws IOException {
        String filePath = driver.getCurrentUrl();
        URL url = new URL(filePath);
        InputStream iStream = url.openStream();
        BufferedInputStream bfStream = new BufferedInputStream(iStream);
        PDDocument document = PDDocument.load(bfStream);
        PDFTextStripper stripper = new PDFTextStripper();
        int chr = stripper.getText(document).indexOf("Contract No.");
        String contactVersion = stripper.getText(document).substring(chr, chr + 31);
        Assert.assertFalse(contactVersion.equalsIgnoreCase(oldVersion), "The old version is (" +oldVersion+ ") and new version is ("+contactVersion+")");
    }

    public void clickOnPropertiesTab() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyTab(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.PropertyTab());
    }

    public void clickOnViewOwnerShipDocumentsOption() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.ViewOwnerShipDocumentsOption(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.ViewOwnerShipDocumentsOption());
    }

    public void verifyOwnerShipDocumentPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.OwnerShipDocumentPageTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.OwnerShipDocumentPageTitle()));
        logger.addScreenshot("");
    }

    public void enterOwnerShipDocumentNumberInSearchField(String deedNumber) {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.OwnershipDocumentSearchField(), 40);
        Browser.setText(ChangeLessor_LessorRepPageObjects.OwnershipDocumentSearchField(), deedNumber);
    }

    /**
     * Verify the searched deed number is displayed on OwnerShip Documents page
     * @param expectedDeedNumber - Contract number to be validated
     */
    public void verifySearchedOwnershipDocumentIsDisplayed(String expectedDeedNumber) {
        Browser.waitForSeconds(1);
        if (Browser.isElementDisplayed(CommonMethodsPageObjects.SearchedDeedNumber())) {
            String actualDeedNumber = Browser.getText(CommonMethodsPageObjects.SearchedDeedNumber());
            boolean status = false;
            if (actualDeedNumber.contains(expectedDeedNumber)) {
                status = true;
            }
            Assert.assertTrue(status, "Searched deed number is not displayed");
            logger.addScreenshot("Searched deed number is displayed");
        } else {
            logger.addScreenshot("Searched deed number is not displayed");
        }
    }


    /**
     * Method to select radio button for change lessor rep page
     * @param lessorRep - Radio button to be selected
     * */
    public void selectChangeLessorRepRadioButtons(String lessorRep) {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.changLessorRepRadioBTNs(), 30);
        List<WebElement> radioButtonsList = Browser.getWebElements(ChangeLessor_LessorRepPageObjects.changLessorRepRadioBTNs());
        for (WebElement listRadioButtons : radioButtonsList) {
            String getListName = listRadioButtons.getText();
            if (getListName.contains(lessorRep)) {
                listRadioButtons.click();
                break;
            }
        }
    }

    public void getReqNum() {
        String request = CommonMethodsPage.getRequestNumber(ChangeLessor_LessorRepPageObjects.requestNumber());
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "RequestNumber", request);
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
    }

    public void checkRequestChangeCurrentLessorRepPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.requestChangeCurrentLessorRepPage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.requestChangeCurrentLessorRepPage()));
        WebBaseTest.logger.addScreenshot("");
    }

    public void checkChangeLessorPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.changeLessorPage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.changeLessorPage()));
        WebBaseTest.logger.addScreenshot("");
    }

    public void checkRequestChangeLessorPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.requestChangeLessorPage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.requestChangeLessorPage()));
        WebBaseTest.logger.addScreenshot("");
    }

    public void checkRequestUpdateCurrentLessorRepPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.requestUpdateCurrentLessorRepPage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.requestUpdateCurrentLessorRepPage()));
        WebBaseTest.logger.addScreenshot("");
    }

    public void checkAddNewLessorRepPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.addNewLessorRepPage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.addNewLessorRepPage()));
        WebBaseTest.logger.addScreenshot("");
    }

    public void checkRemoveCurrentLessorRepPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.removeCurrentLessorRepPage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.removeCurrentLessorRepPage()));
        WebBaseTest.logger.addScreenshot("");
    }

    public void verifyRejectChangeRequestButtonIsEnabled() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.rejectChangeRequestBTN(), 20);
        Assert.assertTrue(Browser.isElementEnabled(ChangeLessor_LessorRepPageObjects.rejectChangeRequestBTN()));
        logger.addScreenshot("The (رفض طلب التغيير) is enabled");
    }

    public void verifyRejectChangeRequestButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.rejectChangeRequestBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(ChangeLessor_LessorRepPageObjects.rejectChangeRequestBTN()));
        logger.addScreenshot("The (رفض طلب التغيير) is disabled");
    }

    public void clickOnRejectChangeRequestButton() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.rejectChangeRequestBTN(), 20);
        Browser.click(ChangeLessor_LessorRepPageObjects.rejectChangeRequestBTN());
    }

    public void checkReviewChangeRequestSectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.reviewChangeRequestSection(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.reviewChangeRequestSection()));
        logger.addScreenshot("");
    }

    public void verifyRejectionSubmittedMessageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.rejectMsg(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.rejectMsg()));
        logger.addScreenshot("The (تم تقديم الرفض) page is displayed");
    }

    public void checkContractsAndAgreementsSectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.contractsAndAgreementsSection(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.contractsAndAgreementsSection()));
        logger.addScreenshot("");
    }

    public void checkIBANInfoSectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.IBANInfoSection(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.IBANInfoSection()));
        logger.addScreenshot("");
    }

    public void checkEditIBANInfoPopupWindowIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.editIBANInfoPopupWindow(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.editIBANInfoPopupWindow()));
        logger.addScreenshot("");
    }

    public void clickOnAddNewIbanButton() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.addNewIbanBTN(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.addNewIbanBTN());
    }

    public void checkAddNewIBANPopupWindowIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.addNewIBANPopupWindow(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.addNewIBANPopupWindow()));
        logger.addScreenshot("");
    }

    public void checkDeclarationAndConfirmationSectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.declarationAndConfirmationSection(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.declarationAndConfirmationSection()));
        logger.addScreenshot("");
    }

    public void checkConfirmApprovalButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.confirmApprovalBTN(), 40);
        Assert.assertTrue(Browser.isElementDisabled(ChangeLessor_LessorRepPageObjects.confirmApprovalBTN()));
        logger.addScreenshot("");
    }

    public void checkConfirmApprovalButtonIsEnabled() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.confirmApprovalBTN(), 40);
        Assert.assertTrue(Browser.isElementEnabled(ChangeLessor_LessorRepPageObjects.confirmApprovalBTN()));
        logger.addScreenshot("");
    }

    public void clickOnConfirmApprovalButton() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.confirmApprovalBTN(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.confirmApprovalBTN());
    }

    /**
     * Method to validate the radio button is selected for change lessor rep
     * @param opt - Expected option text to be selected
     * */
    public void verifyTheRadioButtonIsSelected(String opt) {
        List<WebElement> radioButtonsList = Browser.getWebElements(ChangeLessor_LessorRepPageObjects.selectedRadioButton());
        String optionText = "";
        for (WebElement listRadioButtons : radioButtonsList) {
            if (listRadioButtons.isSelected()) {
                optionText = listRadioButtons.getAttribute("value");
                break;
            }
        }
        optionText = switch (optionText) {
            case "add" -> "إضافة ممثل المؤجر الجديد";
            case "change" -> "تعديل ممثل المؤجر الحالي";
            case "remove" -> "إزالة ممثل المؤجر الحالي";
            default -> optionText;
        };
        Assert.assertTrue(optionText.contains(opt), "The selected button is (" + optionText + ") and expected is (" + opt + ")");
        logger.addScreenshot("");
    }

    /**
     * Method to validate the new section is displayed under the radio buttons for the selected option
     * @param expectedTitle - Expected title of the section
     * */
    public void verifyNewSectionIsAppearingWithSameTitleAsSelectedRadioOption(String expectedTitle) {
        List<WebElement> titleList = Browser.getWebElements(ChangeLessor_LessorRepPageObjects.ChangeLessorSelectedOptionSection());
        String optionText = "";
        for (WebElement title : titleList) {
            optionText = title.getText();
            if (title.isDisplayed() && optionText.contains(expectedTitle)) {
                break;
            }
        }
        Assert.assertTrue(optionText.contains(expectedTitle), "The expected title is (" + optionText + ") and expected is (" + expectedTitle + ")");
        logger.addScreenshot("");
    }

    public void verifyCloseButtonIsDisplayed() {
        boolean status = false;
        if (Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.NextBTN())
                || Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.NextBTN2())
                || Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.NextBTN3())){
            status = true;
        }
        Assert.assertTrue(status, "Button is not displayed");
        logger.addScreenshot("");
    }

    public void verifyPopupMessage(String s) {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PopupMessage(), 40);
        String text = Browser.getText(ChangeLessor_LessorRepPageObjects.PopupMessage());
        Assert.assertTrue(text.contains(s), "Actual message is (" +text+ ") and expected message is (" +s+ ")");
        logger.addScreenshot("");
    }

    public void clickOnGotoServiceButton() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.GotoServiceButton(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.GotoServiceButton());
    }

    public void verifyIdTypeRadioButtonIsSelected(String expectedType) {
        List <WebElement> radioList =  Browser.getWebElements(ChangeLessor_LessorRepPageObjects.IdTypeRadioInput());
        String actualType = "";
        for (WebElement btn : radioList){
            if (btn.isSelected()){
                actualType = btn.getAttribute("value");
                break;
            }
        }
        actualType = switch (actualType) {
            case "national_id" -> "هوية وطنية";
            case "vip_resident_id" -> "إقامة مميزة";
            case "resident_id" -> "هوية مقيم";
            case "gcc_id" -> "هوية مواطني دول مجلس التعاون الخليجي";
            case "passport" -> "جواز سفر";
            case "other" -> "أخرى";
            default -> actualType;
        };
        Assert.assertTrue(actualType.contains(expectedType), "Actual selected button is (" +actualType+ ") an expected is (" +expectedType+ ")");
        logger.addScreenshot("");
    }

    public void clickOnIdTypeRadioButton(String idType) {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.IdTypeRadioButtons(), 40 );
        List <WebElement> radioList =  Browser.getWebElements(ChangeLessor_LessorRepPageObjects.IdTypeRadioButtons());
        for (WebElement btn : radioList){
            if (btn.getText().contains(idType)){
                btn.click();
                break;
            }
        }
    }

    public void checkLessorLessorRepChangedSuccessfullyMessageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.lessorLessorRepChangedSuccessfullyMsg(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.lessorLessorRepChangedSuccessfullyMsg()));
        logger.addScreenshot("");
    }

    public void checkManageOwnershipDocumentPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.manageOwnershipDocumentPage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.manageOwnershipDocumentPage()));
        logger.addScreenshot("");
    }

    public void clickOnLessorRepKebabButton() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.lessorRepKebabBTN(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.lessorRepKebabBTN());
    }
    public void clickOnLessorKebabButton() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.lessorKebabBTN(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.lessorKebabBTN());
    }
    public void clickOnLessorRepEditButton() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.lessorRepEditBTN(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.lessorRepEditBTN());
    }

    public void checkAddAnIndividualPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.addAnIndividualPage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.addAnIndividualPage()));
        logger.addScreenshot("");
    }

    public void verifyTheNationalIDSameAsDisplayed(String expectedID) {
        Browser.waitForSeconds(1);
        if (Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.nationalIDTXT())) {
            String actualID = Browser.getText(ChangeLessor_LessorRepPageObjects.nationalIDTXT());
            boolean status = false;
            if (actualID.contains(expectedID)) {
                status = true;
            }
            Assert.assertTrue(status, "The national ID number is not the same");
            logger.addScreenshot("The national ID number is the same");
        } else {
            logger.addScreenshot("The national ID number is not the same");
        }
    }


    public void checkLessorRepIsRemoved() {
        Assert.assertTrue(Browser.isElementNotPresent(ChangeLessor_LessorRepPageObjects.lessorRepIcon()));
        WebBaseTest.logger.addScreenshot("");
    }

    public void clickOnAddNewRepresentationDocumentLink() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.AddNewRepresentationDocumentLink(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.AddNewRepresentationDocumentLink());
    }

    public void clickOnDocumentTypeDropdown() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.DocumentTypeDropdown(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.DocumentTypeDropdown());
    }

    public void verifyDocumentTypeIsSelected(String expectedType) {
        WebElement documentType = getWebElement(ChangeLessor_LessorRepPageObjects.DocumentTypeDropdown());
        String t = documentType.getAttribute("value");
        String text = t.toLowerCase();
        if (text.contains("other")) {
            text = "أخرى";
        }
        Assert.assertEquals(text, expectedType);
        logger.addScreenshot("Document type Selected");
    }

    public void enterIssueDate(String issueDate) {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.IssueDateInputField(), 40);
        Browser.setText(ChangeLessor_LessorRepPageObjects.IssueDateInputField(), issueDate);
    }

    public void enterExpiryDate(String expiryDate) {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.ExpiryDateInputField(), 40);
        Browser.setText(ChangeLessor_LessorRepPageObjects.ExpiryDateInputField(), expiryDate);
        new RevokeContractPage().clickOnCalenderIcon();
    }


    public void enterNameInIssueByField(String name) {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.IssueByInputField(), 40);
        Browser.setText(ChangeLessor_LessorRepPageObjects.IssueByInputField(), name);
    }

    public void enterDocumentName(String documentName) {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.LegalDocumentNameInput(), 40);
        Browser.setText(ChangeLessor_LessorRepPageObjects.LegalDocumentNameInput(), documentName);
    }

    public void enterDocumentIssuePlace(String documentIssuePlace) {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.DocumentIssuePlaceInput(), 40);
        Browser.setText(ChangeLessor_LessorRepPageObjects.DocumentIssuePlaceInput(), documentIssuePlace);
    }

    public void clickOnAddButton() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.AddButton(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.AddButton());
    }

    public void getRequestNumberFromPopup(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String text = getText(element);
        int index = text.indexOf("#");
        String newText = text.substring(index);
        String reqNum = newText.split(" ")[0];
        TestDataManager.addDependantGlobalTestData("ChangeLessor","RequestNumber", reqNum);
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");

    }

    public void clickOnNextButton(By element) {
        Browser.waitUntilVisibilityOfElement(element, 50);
        Browser.click(element);
    }

    public void clickOnCloseButton(By element) {
        Browser.waitUntilVisibilityOfElement(element, 50);
        Browser.click(element);
    }
}
