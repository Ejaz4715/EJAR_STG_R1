package sa.ejar.web.pages;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.ChangeLessor_LessorRepPageObjects;

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

}
