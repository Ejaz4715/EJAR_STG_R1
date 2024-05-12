package sa.ejar.web.pages;

import com.testcrew.api.UnirestAPI;
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
        for (WebElement status : statusList){
            if (status.getText().contains(reqStatus)){
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
        Browser.click(By.xpath("//span[contains(text(),'عرض جميع وثائق الملكية')]"));
    }

    public void clickOnViewOwnerShipDocumentsOption() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.ViewOwnerShipDocumentsOption(), 40);
        Browser.click(ChangeLessor_LessorRepPageObjects.ViewOwnerShipDocumentsOption());
    }

    public void verifyOwnerShipDocumentPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.OwnerShipDocumentPageTitle(), 40);
        Assert.assertTrue(Browser.isElementDisabled(ChangeLessor_LessorRepPageObjects.OwnerShipDocumentPageTitle()));
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
}
