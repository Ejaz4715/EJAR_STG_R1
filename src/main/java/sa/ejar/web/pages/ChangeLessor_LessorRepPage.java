package sa.ejar.web.pages;

import com.testcrew.base.WebBaseTest;
import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.NHCWebApplication;
import sa.ejar.web.objects.ChangeLessor_LessorRepPageObjects;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.RentalIncidentsPageObjects;
import sa.ejar.web.objects.SendContractForApprovalPageObjects;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.driver;
import static sa.ejar.web.pages.CommonMethodsPage.KebabMenuOptions;
import static sa.ejar.web.pages.CommonMethodsPage.selectFromList;

public class ChangeLessor_LessorRepPage {
    public void getContractNumber() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.FirstContractNumber(), 40);
        String contractNum = Browser.getText(ChangeLessor_LessorRepPageObjects.FirstContractNumber());
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "Contract_Number", contractNum);
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
    }

    public void selectActiveContractFromStatusDropdown(String reqStatus) {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.ContractStatusDropdown(), 40);
        List<WebElement> statusList = Browser.getWebElements(ChangeLessor_LessorRepPageObjects.ContractStatusDropdown());
        for (WebElement status : statusList) {
            if (status.getText().contains(reqStatus)) {
                status.click();
                break;
            }
        }
        logger.addScreenshot("");
    }

    public void getContractVersionFromPDF(String ContractNumber) throws IOException {
        String home = System.getProperty("user.home");
        String path = "file:///" + home + "\\Downloads\\" + ContractNumber + ".pdf";
        System.out.println(path);
        URL url = new URL(path);
        InputStream iStream = url.openStream();
        BufferedInputStream bfStream = new BufferedInputStream(iStream);
        PDDocument document = PDDocument.load(bfStream);
        PDFTextStripper stripper = new PDFTextStripper();
        int chr = stripper.getText(document).indexOf("Contract No.");
        String contactVersion = stripper.getText(document).substring(chr, chr + 31);
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "Contract_Version", contactVersion);
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
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
     *
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

    public static void selectChangeLessorRepRadioButtons(String lessorRep) throws Exception {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.changLessorRepRadioBTNs(), 30);
        List<WebElement> radioButtonsList = driver.findElements(ChangeLessor_LessorRepPageObjects.changLessorRepRadioBTNs());
        for (WebElement listRadioButtons : radioButtonsList) {
            String getListName = listRadioButtons.getText();
            if (getListName.contains(lessorRep)) {
                listRadioButtons.click();
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

    public void checkAddNewLessorRepPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.addNewLessorRepPage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.addNewLessorRepPage()));
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

    public void verifyRejectionSubmittedMessageIsDisplayed() throws Exception {
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
}
