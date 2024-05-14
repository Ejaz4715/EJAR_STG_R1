package sa.ejar.web.pages;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import sa.ejar.web.objects.ChangeLessor_LessorRepPageObjects;
import sa.ejar.web.objects.CommonMethodsPageObjects;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.isElementDisplayed;

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
        logger.addScreenshot("");
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
        Assert.assertTrue(isElementDisplayed(ChangeLessor_LessorRepPageObjects.NextBTN()));
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
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.IdTypeRadioInput(), 40 );
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
}
