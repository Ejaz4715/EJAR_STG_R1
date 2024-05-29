package sa.ejar.web.pages;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import sa.ejar.web.objects.ChangeTenantActivityPageObjects;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.*;
import static sa.ejar.web.pages.CommonMethodsPage.selectFromList;
public class ChangeTenantActivityPage {


    public void getPartiesDetails(){
        ChangeTenantActivityPage.getLessorName();
        ChangeTenantActivityPage.getTenantName();
        ChangeTenantActivityPage.getTenantRepresentativeName();
        ChangeTenantActivityPage.getLessorID();
        ChangeTenantActivityPage.getTenantID();
        ChangeTenantActivityPage.getTenantRepresentativeID();
    }
    public static void verifySubmitRequestPopupForNewTenantActivity() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitRequestPopupMsgInChangeTenantCommercialActivity(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeTenantActivityPageObjects.submitRequestPopupMsgInChangeTenantCommercialActivity()),
                "Submit request popup is Incorrect!");
        logger.addScreenshot("Submit Request Popup is displayed");
    }

    public static void checkRequestWaitingForSevenDaysMessage() {
        Assert.assertTrue(Browser.isElementDisplayed(ChangeTenantActivityPageObjects.requestWaitingForSevenDaysMessage()));
        logger.addScreenshot("");
    }


    public void assertRequestDetails(String requestId, String requestType, String contractNumber, String Date) {
        String requestID = Browser.getText(ChangeTenantActivityPageObjects.requestID());
        String rID = requestID.replace("#", "");
        Assert.assertEquals(requestId, rID, "request ID does not matching");
        String contractNumberNew = Browser.getText(ChangeTenantActivityPageObjects.contractNumber()).replace("#", "");
        Assert.assertEquals(contractNumberNew, contractNumber, "contract number is not matching");
        String requestTypeNew = Browser.getText(ChangeTenantActivityPageObjects.requestType());
        Assert.assertEquals(requestTypeNew, requestType, "request type does not matching");
        Assert.assertEquals(CommonMethodsPage.getCurrentDate(0, 0, 0),Date,"Date is not matching");
        logger.addScreenshot(" ");
    }

    public void assertInvalidRequest() {
        String noResult = Browser.getText(ChangeTenantActivityPageObjects.noResultMessage());
        Assert.assertEquals(noResult, "حاليا ، ليس لديك أي طلب", "Text is not correct");
        logger.addScreenshot(" ");
    }

    public void selectStatus(String status) throws Exception {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.statusDropdown(), 40);
        click(ChangeTenantActivityPageObjects.statusDropdown());
        selectFromList(status, ChangeTenantActivityPageObjects.statusOptions());
        logger.addScreenshot(" ");
    }

    public void selectRequestType(String requestType) throws Exception {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.requestTypeDropdown(), 40);
        click(ChangeTenantActivityPageObjects.requestTypeDropdown());
        selectFromList(requestType, ChangeTenantActivityPageObjects.requestTypeOptions());
        logger.addScreenshot(" ");
    }

    public void assertCreatedDateAndIssuedByOnRequestDetails(String issuedByLessor, String issuedByTenantRep) {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.createdDate(), 40);
        Browser.isElementDisplayed(ChangeTenantActivityPageObjects.createdDate());
        String issued = Browser.getText(ChangeTenantActivityPageObjects.issuedBy());
        System.out.println(issuedByLessor.replace(" · المؤجر", ""));
        System.out.println(issuedByTenantRep.replace(" · ممثل المستأجر", ""));
        Assert.assertTrue(issued.contains(issuedByLessor.replace(" · المؤجر", ""))
                        || issued.contains(issuedByTenantRep.replace(" · ممثل المستأجر", "")),
                "issued by is not displayed");
        logger.addScreenshot("Change tenant activity issued by : " + issued);
    }

    public void enterTextInNewTenantActivityTextBox(String text) {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.newTenantActivityTextBox(), 40);
        Browser.setText(ChangeTenantActivityPageObjects.newTenantActivityTextBox(), text);
        logger.addScreenshot(" ");
    }

    public void removeTextInNewTenantActivityTextBox() {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.newTenantActivityTextBox(), 40);
        Browser.clearText(ChangeTenantActivityPageObjects.newTenantActivityTextBox());
        logger.addScreenshot(" ");
    }

    public void assertSubmitButtonIsEnabled() {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitButton(), 40);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.submitButton());
        logger.addScreenshot(" ");
    }

    public void assertSubmitButtonIsDisabled() {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitButton(), 40);
        Browser.isElementDisabled(ChangeTenantActivityPageObjects.submitButton());
        logger.addScreenshot(" ");
    }

    public void clickOnSubmitButton() {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitButton(), 40);
        Browser.click(ChangeTenantActivityPageObjects.submitButton());
        logger.addScreenshot(" ");
    }


    public void clickOnViewRequestButton() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.viewRequestButton(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.viewRequestButton());
        Browser.click(ChangeTenantActivityPageObjects.viewRequestButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("neviagte to ( خطوات الموافقة على تغيير النشاط ) page");
    }

    public void clickOnLetsStartButton() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.letsStartButton(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.letsStartButton());
        Browser.click(ChangeTenantActivityPageObjects.letsStartButton());

    }

    public void clickOnOldTenantActivity() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.oldTenantActivity(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.oldTenantActivity());
        Browser.click(ChangeTenantActivityPageObjects.oldTenantActivity());
        Browser.waitForSeconds(1);
    }

    public void assertOldTenantDescriptionDetails(String description) {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.oldTenantActivityDescription(), 6);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.oldTenantActivityDescription());
        Assert.assertEquals(Browser.getText(ChangeTenantActivityPageObjects.oldTenantActivityDescription()), description, "Old Tenant description is not matched");
        Browser.waitForSeconds(1);
    }

    public void clickOnNewTenantActivity() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.newTenantActivity(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.newTenantActivity());
        Browser.click(ChangeTenantActivityPageObjects.newTenantActivity());
        Browser.waitForSeconds(1);
    }

    public void assertNewTenantDescriptionDetails(String description) {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.newTenantActivityDescriptionInReviewChangedTenantActivityPage(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.newTenantActivityDescriptionInReviewChangedTenantActivityPage());
        Assert.assertEquals(Browser.getText(ChangeTenantActivityPageObjects.newTenantActivityDescriptionInReviewChangedTenantActivityPage())
                , description, "New tenant description is not matched");
        logger.addScreenshot("New tenant description is visible");
    }

    public void clickBackButton() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.backButton(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.backButton());
        Browser.click(ChangeTenantActivityPageObjects.backButton());
    }

    public void scrollToNewTenantActivity() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.bottomNewTenantActivity(), 20);
        Browser.executeJSScrollIntoView(ChangeTenantActivityPageObjects.bottomNewTenantActivity());
    }

    public void assertApproveTenantActivity() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.approveTenantActivity(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeTenantActivityPageObjects.approveTenantActivity()));
        logger.addScreenshot("The 'الموافقة على نشاط المستأجر' page is displayed");
        Browser.waitForSeconds(1);
    }

    public void assertReviewChangedTenantActivity() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.reviewChangeTenantActivity(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeTenantActivityPageObjects.reviewChangeTenantActivity()));
        logger.addScreenshot("The 'مراجعة تغيير نشاط المستأجر ' page is displayed");
        Browser.waitForSeconds(1);
    }

    public void verifySubmitApprovalButtonDisabled(boolean isDisabled) {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitApprovalButton(), 20);
        Assert.assertEquals(Browser.isElementDisabled(ChangeTenantActivityPageObjects.submitApprovalButton()), isDisabled);
        logger.addScreenshot("The ' إرسال الموافقة ' button is disabled");
    }

    public void verifySubmitApprovalButtonEnabled(boolean isEnabled) {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitApprovalButton(), 20);
        Assert.assertEquals(Browser.isElementEnabled(ChangeTenantActivityPageObjects.submitApprovalButton()), isEnabled);
        logger.addScreenshot("The ' إرسال الموافقة ' button is enabled");
    }

    public static String addNewTenantActivityDescription(String newTenantActivityDescription) {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.newTenantActivityDescription(), 10);
        CommonMethodsPage.scrollToElement(ChangeTenantActivityPageObjects.newTenantActivityDescription());
        Browser.waitForSeconds(2);
        Browser.isElementDisplayed(ChangeTenantActivityPageObjects.newTenantActivityDescription());
        setText(ChangeTenantActivityPageObjects.newTenantActivityDescription(), newTenantActivityDescription);
        String NewDes = Browser.getAttributeValue(ChangeTenantActivityPageObjects.newTenantActivityDescription(), "value");
        Browser.waitForSeconds(1);
        logger.addScreenshot("Entered new tenant activity description");
        return NewDes;
    }

    public static void deleteNewTenantActivityDescription(String newTenantActivityDescription) {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.newTenantActivityDescription(), 10);
        CommonMethodsPage.scrollToElement(ChangeTenantActivityPageObjects.newTenantActivityDescription());
        Browser.waitForSeconds(2);
        Browser.isElementDisplayed(ChangeTenantActivityPageObjects.newTenantActivityDescription());
        setText(ChangeTenantActivityPageObjects.newTenantActivityDescription(), newTenantActivityDescription);
        Browser.waitForSeconds(1);
        Browser.clearText(ChangeTenantActivityPageObjects.newTenantActivityDescription());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Delete new tenant activity description input");
    }

    public static void clickOnSubmitRequest() {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitRequestInChangeTenantCommercialActivity(), 10);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.submitRequestInChangeTenantCommercialActivity());
        click(ChangeTenantActivityPageObjects.submitRequestInChangeTenantCommercialActivity());
        Browser.waitForSeconds(1);
        logger.addScreenshot("The ' إرسال الموافقة ' button is clickable");
    }

    public static void checkRequestNumberHasAlphaNumeric() {
        String requestPopupTitle = Browser.getText(ChangeTenantActivityPageObjects.requestTitle());
        Pattern pattern = Pattern.compile("#([A-Za-z0-9]+)");
        Matcher matcher = pattern.matcher(requestPopupTitle);

        if (matcher.find()) {
            String extractedString = matcher.group(1);
            System.out.println("Extracted substring: " + extractedString);

            if (extractedString.matches("[A-Za-z0-9]+")) {
                System.out.println("The extracted substring is alphanumeric!");
            } else {
                Assert.fail("The extracted substring is not alphanumeric!");
            }
        } else {
            Assert.fail("The request title doesn't have alpha numeric!");
        }
    }

    public static void verifyRequestContainEightAlphaNumeric() {
        String ReqNum = ChangeTenantActivityPage.getRequestNumber();
        int ReqNumber = ReqNum.length();
        Assert.assertEquals(ReqNumber,8);
    }

    public void verifyChangeTenantActivityPageHeaderIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.changeTenantActivityPageHeader(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeTenantActivityPageObjects.changeTenantActivityPageHeader()), "Change Tenant Activity page header is not displayed");
        logger.addScreenshot(" ");
    }

    public void assertContractNumberInPageHeader(String contractNumber) {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.contractNumberHeader(), 20);
        String contractNumberNew = Browser.getText(ChangeTenantActivityPageObjects.contractNumberHeader()).replace("#", "");
        Assert.assertEquals(contractNumberNew, contractNumber, "contract number is not matching");
        logger.addScreenshot(" ");
    }

    public static void assertContractParties(Map<String, String> data) {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivityParties"));
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.contractParties(), 40);
        String CurrentLessorName = Browser.getText(ChangeTenantActivityPageObjects.getLessorName());
        String CurrentTenantName = Browser.getText(ChangeTenantActivityPageObjects.getTenantName());
        String CurrentTenantRepresentativeName = Browser.getText(ChangeTenantActivityPageObjects.getTenantRepresentativeName());
        String CurrentLessorID = Browser.getText(ChangeTenantActivityPageObjects.getLessorID());
        String CurrentTenantID = Browser.getText(ChangeTenantActivityPageObjects.getTenantID());
        String CurrentTenantRepresentativeID = Browser.getText(ChangeTenantActivityPageObjects.getTenantRepresentativeID());
        Assert.assertTrue(data.get("LessorName").contains(CurrentLessorName));
        Assert.assertTrue(data.get("TenantName").contains(CurrentTenantName));
        Assert.assertTrue(data.get("TenantRepresentativeName").contains(CurrentTenantRepresentativeName));
        Assert.assertTrue(data.get("LessorID").contains(CurrentLessorID));
        Assert.assertTrue(data.get("TenantID").contains(CurrentTenantID));
        Assert.assertTrue(data.get("TenantRepresentativeID").contains(CurrentTenantRepresentativeID));
        logger.addScreenshot("Contract parties are displayed in 'تغيير نشاط المستأجر التجاري' page");
    }

    public void assertOldTenantActivityHeadingOnChangeTenantActivityPage() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.oldTenantActivityHeadingOnChangeTenantActivityPage(), 40);
        Browser.isElementDisplayed(ChangeTenantActivityPageObjects.oldTenantActivityHeadingOnChangeTenantActivityPage());
        logger.addScreenshot(" ");
    }

    public void assertOldTenantActivityDescriptionOnChangeTenantActivityPage() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.oldTenantActivityDescriptionOnChangeTenantActivityPage(), 40);
        Browser.isElementDisplayed(ChangeTenantActivityPageObjects.oldTenantActivityDescriptionOnChangeTenantActivityPage());
        logger.addScreenshot("");
    }

    public void getOldTenantActivityDescriptionOnChangeTenantActivityPage() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.oldTenantDescription(), 40);
        String OldDescription = driver.findElement(ChangeTenantActivityPageObjects.oldTenantDescription()).getAttribute("value");
        logger.addScreenshot("");
        Assert.assertEquals("Test", OldDescription);
    }

    public static String getRequestNumber() {
        Browser.waitForSeconds(2);
        String number = Browser.getWebElement(ChangeTenantActivityPageObjects.requestTitle()).getText();
        return number.substring(16, 24);
    }

    public static String verifyIssueDate() {
        String IssueDate = Browser.getText(ChangeTenantActivityPageObjects.issueDate());
        String replaceDate1 = IssueDate.replace("تم الإنشاء في ", "");
        String ExpectedIssueDate = replaceDate1.replace("-", "");
        logger.addScreenshot("Issue Date : " + IssueDate);
        return ExpectedIssueDate;
    }

    public static void getLessorName() {
        CommonMethodsPage.scrollToElement(ChangeTenantActivityPageObjects.getLessorName());
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.getLessorName(), 20);
        String LessorName = Browser.getText(ChangeTenantActivityPageObjects.getLessorName());
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivityParties", "LessorName",LessorName);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivityParties");
    }

    public static void getTenantName() {
        String TenantName = Browser.getText(ChangeTenantActivityPageObjects.getTenantName());
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivityParties", "TenantName",TenantName);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivityParties");
    }

    public static void getTenantRepresentativeName() {
        String TenantRepresentativeName = Browser.getText(ChangeTenantActivityPageObjects.getTenantRepresentativeName());
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivityParties", "TenantRepresentativeName",TenantRepresentativeName);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivityParties");

    }

    public static void getLessorID() {
        String LessorId = Browser.getText(ChangeTenantActivityPageObjects.getLessorID());
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivityParties", "LessorID",LessorId);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivityParties");
    }

    public static void getTenantID() {
        String TenantId = Browser.getText(ChangeTenantActivityPageObjects.getTenantID());
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivityParties", "TenantID",TenantId);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivityParties");
    }

    public static void getTenantRepresentativeID() {
        String TenantRepresentativeId = Browser.getText(ChangeTenantActivityPageObjects.getTenantRepresentativeID());
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivityParties", "TenantRepresentativeID",TenantRepresentativeId);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivityParties");
    }

    public void checkRequestsPageIsDisplayed() {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.RequestPageTitle(), 40);
        Assert.assertTrue(isElementDisplayed(ChangeTenantActivityPageObjects.RequestPageTitle()), "request page is not displayed");
        logger.addScreenshot("The ' الطلبات ' page is displayed");
    }

    public void assertTenantActivityApprovalStepsPageIsDisplayed() {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.TenantActivityApprovalStepsHeading(), 20);
        Assert.assertTrue(isElementDisplayed(ChangeTenantActivityPageObjects.TenantActivityApprovalStepsHeading()));
        logger.addScreenshot("User neviagte back to ( خطوات الموافقة على تغيير النشاط ) page");
    }

    public void clickOnIAgreeToTheAboveCheckBox() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.IAgreeToTheAboveCheckBox(), 10);
        Browser.click(ChangeTenantActivityPageObjects.IAgreeToTheAboveCheckBox());
        logger.addScreenshot("The 'أقر بالموافقة على المذكور أعلاه' checkbox is clickable");
    }

    public void clickOnSubmitApprovalBTN() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitApprovalButton(), 20);
        Browser.click(ChangeTenantActivityPageObjects.submitApprovalButton());
        logger.addScreenshot("The 'إرسال الموافقة ' button is clickable");
    }

    public void rejectTenantActivityBTN() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.rejectTenantActivityBTN(), 20);
        Browser.click(ChangeTenantActivityPageObjects.rejectTenantActivityBTN());
        logger.addScreenshot("The ' رفض نشاط المستأجر ' button is clickable");
    }

    public void clickOnRejectBTN() {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectBTN(), 20);
        click(CommonMethodsPageObjects.rejectBTN());
        logger.addScreenshot("The ' رفض ' button is clickable");
    }

    public void assertConfirmApprovalMessageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.confirmApprovalMsg(), 20);
        String SuccessfulMsg = Browser.getText(ChangeTenantActivityPageObjects.confirmApprovalMsg());
        Assert.assertTrue(SuccessfulMsg.contains("تم إرسال الموفقة"));
        logger.addScreenshot("Message : " + SuccessfulMsg);
        Browser.waitForSeconds(1);
        System.out.println(SuccessfulMsg);
    }

    public void assertConfirmRejectMessageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.confirmRejectMsg(), 20);
        String SuccessfulMsg = Browser.getText(ChangeTenantActivityPageObjects.confirmRejectMsg());
        Assert.assertTrue(SuccessfulMsg.contains("تم تقديم الرفض"));
        logger.addScreenshot("Message : " + SuccessfulMsg);
        Browser.waitForSeconds(1);
        System.out.println(SuccessfulMsg);
    }

    public void assertRejectTenantActivityPageIsDisplayed() {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.RejectTenantActivityHeading(), 20);
        Assert.assertTrue(isElementDisplayed(ChangeTenantActivityPageObjects.RejectTenantActivityHeading()));
        logger.addScreenshot("User neviagte to ' رفض نشاط المستأجر' page");
    }

    public void clickOnCancelButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.cancelBTN(), 40);
        waitForSeconds(2);
        click(CommonMethodsPageObjects.cancelBTN());
        logger.addScreenshot("The 'إلغاء' Button is clickable");
    }

    public String getContractVersionFromPDF(String ContractNumber) throws IOException {
        String home = System.getProperty("user.home");
        String path = "file:///" + home + "\\Downloads\\" + ContractNumber + ".pdf";
        System.out.println(path);
        URL url = new URL(path);
        InputStream iStream = url.openStream();
        BufferedInputStream bfStream = new BufferedInputStream(iStream);
        PDDocument document = PDDocument.load(bfStream);
        PDFTextStripper stripper = new PDFTextStripper();
        int chr = stripper.getText(document).indexOf("Contract No.");
        String contactVersion = stripper.getText(document).substring(chr, chr + 34);
        String CurrentVersion = contactVersion.replace("Contract No. " + ContractNumber + " / ", "").replaceAll("[\n\r]", "").replaceAll(" ", "");
        logger.addScreenshot("The contract version is : "+ CurrentVersion);
        System.out.println(CurrentVersion);
        return CurrentVersion;
}

    public static String getNewTenantActivityCommercialFromPDF(String ContractNumber) throws IOException {
        String home = System.getProperty("user.home");
        String path = "file:///" + home + "\\Downloads\\" + ContractNumber + ".pdf";
        System.out.println(path);
        URL url = new URL(path);
        InputStream iStream = url.openStream();
        BufferedInputStream bfStream = new BufferedInputStream(iStream);
        PDDocument document = PDDocument.load(bfStream);
        PDFTextStripper stripper = new PDFTextStripper();
        stripper.setStartPage(3);
        int chr = stripper.getText(document).indexOf("Commercial Activities");
        String TenantActivityCommercial = stripper.getText(document).substring(chr, chr + 319);
        String NewTenantActivityCommercial = TenantActivityCommercial.substring(317,319);
        logger.addScreenshot("New Tenant Activity Commercial is : "+ NewTenantActivityCommercial);
        System.out.println(NewTenantActivityCommercial);
        Browser.waitForSeconds(2);
        return NewTenantActivityCommercial;
    }

    public void deleteDownloadFile(String ContractNumber){
        String home = System.getProperty("user.home");
        File file = new File( home + "\\Downloads\\" + ContractNumber + ".pdf");
        try {
            Thread.sleep(10000);
            Path filePath = Paths.get(file.toURI());
            Files.delete(filePath);
            System.out.println("File deleted");
        } catch (IOException | InterruptedException ioException) {
            ioException.printStackTrace();
        }
    }

    public void assertContractVersionIsIncreased(Map<String,String>data,String ActualContractVersion){
        Browser.waitForSeconds(1);
        Assert.assertNotEquals(ActualContractVersion,
                data.get("Contract_Version_Change_Tenant_Activity"),
                "Contract version is matching.");
    }

    public void assertNewTenantDescriptionIsVisible(Map<String,String>data,String ActualContractVersion){
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        Assert.assertEquals(ActualContractVersion,
                data.get("NewTenantActivityDescription"),
                "New tenant activity commercial is not updated/not matching.");
    }
}
