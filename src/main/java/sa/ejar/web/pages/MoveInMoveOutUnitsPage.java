package sa.ejar.web.pages;

import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.MoveInMoveOutUnitsPageObjects;
import sa.ejar.web.objects.RevokeContractPageObjects;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;
import java.util.Map;

import static com.testcrew.base.WebBaseTest.logger;

public class MoveInMoveOutUnitsPage {
    public void closeMoveInOutPopup() {
        Browser.waitUntilPresenceOfElement(MoveInMoveOutUnitsPageObjects.closeMoveInOutPopUp(),20);
        if (Browser.isElementPresent(MoveInMoveOutUnitsPageObjects.closeMoveInOutPopUp())) {
            Browser.click(MoveInMoveOutUnitsPageObjects.closeMoveInOutPopUp());
        }
    }

    public void selectYesRadioBTN() {
        Browser.waitUntilPresenceOfElement(MoveInMoveOutUnitsPageObjects.selectYesRadioBTN(), 10);
        Browser.click(MoveInMoveOutUnitsPageObjects.selectYesRadioBTN());
        logger.addScreenshot("radio button ('نعم') is displayed and clickable");
        Browser.waitForSeconds(2);
    }

    public void selectNoRadioBTN() {
        Browser.waitUntilPresenceOfElement(MoveInMoveOutUnitsPageObjects.selectNoRadioBTN(), 15);
        Browser.click(MoveInMoveOutUnitsPageObjects.selectNoRadioBTN());
        logger.addScreenshot("radio button ('لا') is displayed and clickable");
        Browser.waitForSeconds(2);
    }

    public void checkNoteTextAreaIsDisplayed() {
        Assert.assertTrue(Browser.isElementPresent(MoveInMoveOutUnitsPageObjects.NoteTextareaInput()), "Note text area is not visible");
        logger.addScreenshot(" The 'الملاحظات' text area is displayed");
    }

    public void fillBadConditionReason() {
        Browser.setText(MoveInMoveOutUnitsPageObjects.NoteTextareaInput(), "Test This Text Area");
        Browser.waitForSeconds(1);
    }

    public void uploadRequiredDocuments(String pdfAttachment) {
        CommonMethodsPage.UploadAttachment(pdfAttachment, MoveInMoveOutUnitsPageObjects.UploadDocumentsInput());
    }

    public void uploadFile(String File) {
        String CURRENT_DIR = System.getProperty("user.dir");
        String filepath = Paths.get(CURRENT_DIR, "src", "main", "resources") + "\\" + File;
        WebElement UploadFile = Browser.getWebElement(RevokeContractPageObjects.UploadDocumentsInput());
        UploadFile.sendKeys(filepath);
    }


    public void verifyAttachmentIsUploaded() {
        CommonMethodsPage.checkOneAttachmentIsAdded(RevokeContractPageObjects.AttachmentIcon());
        logger.addScreenshot("File is uploaded");
    }

    public void verifyAttachmentIsRemoved() {
        Assert.assertTrue(Browser.isElementNotPresent(RevokeContractPageObjects.AttachmentIcon()));
        logger.addScreenshot("Files is removed");
    }

    public void verifyAttachmentsAreUploaded() {
        CommonMethodsPage.checkMultipleAttachmentsAreAdded(RevokeContractPageObjects.AttachmentIcon());
        logger.addScreenshot("Multiple files are uploaded");
    }

    public void verifyAttachmentErrorMsg(String ErrMsg) {
        CommonMethodsPage.checkOneAttachmentNotAdded(RevokeContractPageObjects.ErrorMsg());
        String ErrorMsg = Browser.getText(RevokeContractPageObjects.ErrorMsg());
        Assert.assertTrue(ErrorMsg.contains(ErrMsg));
        logger.addScreenshot("");
    }
    public void deleteUploadedFile() {
        Browser.waitForSeconds(2);
        if (Browser.isElementPresent(MoveInMoveOutUnitsPageObjects.deleteUploadDocumentBTN())) {
            Browser.click(MoveInMoveOutUnitsPageObjects.deleteUploadDocumentBTN());
            Assert.assertTrue(Browser.isElementNotPresent(MoveInMoveOutUnitsPageObjects.deleteUploadDocumentBTN()), "Delete button is visible");
        }
    }

    public void clickOnDoItLaterBTN() {
        Browser.waitForSeconds(2);
        if (Browser.isElementPresent(MoveInMoveOutUnitsPageObjects.DoItLaterBTN())) {
            Browser.click(MoveInMoveOutUnitsPageObjects.DoItLaterBTN());
        }
    }

    public void checkAlertMessage() {
        Browser.waitForSeconds(2);
        Assert.assertTrue(Browser.isElementPresent(MoveInMoveOutUnitsPageObjects.AlertMessage()), "Alert Message is not visible");
        String Message = Browser.getText(MoveInMoveOutUnitsPageObjects.AlertMessage());
        Assert.assertTrue(Message.contains("في حال عدم تأكيد النموذج خلال مدة"));
    }

    public void verifyReturnToUnitMoveInForm() {
        Browser.waitUntilVisibilityOfElement(MoveInMoveOutUnitsPageObjects.MoveInHeading(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(MoveInMoveOutUnitsPageObjects.MoveInHeading()));
        logger.addScreenshot("User return back to 'نموذج تأكيد استلام/تسليم الوحدة'");
    }

    public void ViewMoveInDetails() {
        Browser.waitUntilPresenceOfElement(MoveInMoveOutUnitsPageObjects.ViewDetails(), 20);
        Browser.click(MoveInMoveOutUnitsPageObjects.ViewDetails());
    }

    public void verifyNavigateToViewUnitMoveInDetails() {
        Browser.waitUntilVisibilityOfElement(MoveInMoveOutUnitsPageObjects.ContractHeading(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(MoveInMoveOutUnitsPageObjects.ContractHeading()));
        logger.addScreenshot("Unit move in details is displayed");
        Browser.waitForSeconds(2);
    }

    public void confirmMoveInUnit() {
        Browser.waitUntilVisibilityOfElement(MoveInMoveOutUnitsPageObjects.ConfirmMoveInBTN(), 40);
        Browser.click(MoveInMoveOutUnitsPageObjects.ConfirmMoveInBTN());
        logger.addScreenshot("The 'نموذج تأكيد استلام/تسليم الوحدة' is displayed");
        Browser.waitForSeconds(2);
    }

    public void verifyStatusOfMoveInUnit(String Status) {
        Browser.waitUntilVisibilityOfElement(MoveInMoveOutUnitsPageObjects.MoveInStatus(), 40);
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(1);
        String MoveInStatus = Browser.getText(MoveInMoveOutUnitsPageObjects.MoveInStatus());
        Assert.assertTrue(MoveInStatus.contains(Status));
        logger.addScreenshot("Lessor Move In Status is : " + MoveInStatus);
    }

    public void VerifyTenantResponse(String Response) {
        Browser.waitUntilVisibilityOfElement(MoveInMoveOutUnitsPageObjects.TenantResponse(), 40);
        Browser.executeJSScroll(600);
        Browser.waitForSeconds(1);
        String TenantResponse = Browser.getText(MoveInMoveOutUnitsPageObjects.TenantResponse());
        Assert.assertTrue(TenantResponse.contains(Response));
        logger.addScreenshot("Tenant Move In Response is : " + Response);
    }

    public void VerifyLessorResponse(String Response) {
        Browser.waitUntilVisibilityOfElement(MoveInMoveOutUnitsPageObjects.LessorResponse(), 40);
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(1);
        String MoveInStatus = Browser.getText(MoveInMoveOutUnitsPageObjects.LessorResponse());
        Assert.assertTrue(MoveInStatus.contains(Response));
        logger.addScreenshot("Lessor Move In Response is : " + MoveInStatus);
    }

    public void clickOnDisplayBTN() throws AWTException {
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(300);
        if (Browser.isElementPresent(MoveInMoveOutUnitsPageObjects.DisplayBTN())) {
            Browser.click(MoveInMoveOutUnitsPageObjects.DisplayBTN());
            Browser.waitForSeconds(2);
            TCRobot robot = new TCRobot();
            robot.keyPress(KeyEvent.VK_ENTER);
            Browser.waitForSeconds(2);
        }
    }

    public void clickOnDownloadBTN(){
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(300);
        if (Browser.isElementPresent(MoveInMoveOutUnitsPageObjects.DownloadPDFBTN())) {
            Browser.click(MoveInMoveOutUnitsPageObjects.DownloadPDFBTN());
            Browser.waitForSeconds(4);
            logger.addScreenshot("Copy of move in model is displayed");
        }
    }

//    public void uploadAttachment(String File) throws Exception {
//        Browser.waitForSeconds(3);
//        Browser.click(MoveInMoveOutUnitsPageObjects.clickOnUploadBTN());
//        Browser.waitForSeconds(2);
//        robotFiles(File);
//    }

    public void uploadAttachment(String File) throws Exception {
        new MoveInMoveOutUnitsPage().uploadFile(File);
    }

    public void increaseDamageAmountFromMoveOutForm(){
        Browser.waitUntilVisibilityOfElement(MoveInMoveOutUnitsPageObjects.increaseDamageAmount(), 40);
        for(int i = 0 ; i<4 ;i++)
        {
            Browser.click(MoveInMoveOutUnitsPageObjects.increaseDamageAmount());
        }
        logger.addScreenshot("Amount after increasing");
    }

    public void decreaseDamageAmountFromMoveOutForm(){
        Browser.waitUntilVisibilityOfElement(MoveInMoveOutUnitsPageObjects.increaseDamageAmount(), 40);
        for(int i = 0 ; i<4 ;i++)
        {
            Browser.click(MoveInMoveOutUnitsPageObjects.decreaseDamageAmount());
        }
        logger.addScreenshot("Amount after decreasing");
    }

    public void assertInvalidValueErrorMsgIsDisplayed(Map<String ,String > data) {
        Browser.waitUntilVisibilityOfElement(MoveInMoveOutUnitsPageObjects.InvalidValueErrorMsg(), 40);
        String Msg = Browser.getText(MoveInMoveOutUnitsPageObjects.InvalidValueErrorMsg());
        Assert.assertTrue(Msg.contains(data.get("DamageAmount")));
        logger.addScreenshot("Error Message : " + Msg);
    }

    public void verifySecurityAmountIsVisibleInViewUnitMoveInOutFormPage(Map<String ,String > data) {
        Browser.waitUntilVisibilityOfElement(MoveInMoveOutUnitsPageObjects.SecurityDamageAmount(), 40);
        String Msg = Browser.getText(MoveInMoveOutUnitsPageObjects.SecurityDamageAmount());
        Assert.assertTrue(Msg.contains(data.get("DamageAmount")));
        logger.addScreenshot("Security Amount : " + Msg);
    }
}