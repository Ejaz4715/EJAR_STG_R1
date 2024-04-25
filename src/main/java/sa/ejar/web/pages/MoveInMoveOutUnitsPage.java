package sa.ejar.web.pages;

import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.MoveInMoveOutUnitsPageObjects;
import sa.ejar.web.objects.RevokeContractPageObjects;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;

import static com.testcrew.base.WebBaseTest.logger;

public class MoveInMoveOutUnitsPage {
    public void closeMoveInOutPopup() {
        Browser.waitForSeconds(3);
        if (Browser.isElementPresent(MoveInMoveOutUnitsPageObjects.closeMoveInOutPopUp())) {
            Browser.click(MoveInMoveOutUnitsPageObjects.closeMoveInOutPopUp());
        }
    }

    public void selectYesRadioBTN() {
        Browser.waitUntilPresenceOfElement(MoveInMoveOutUnitsPageObjects.selectYesRadioBTN(), 10);
        Browser.click(MoveInMoveOutUnitsPageObjects.selectYesRadioBTN());
        Browser.waitForSeconds(2);
    }

    public void selectNoRadioBTN() {
        Browser.waitUntilPresenceOfElement(MoveInMoveOutUnitsPageObjects.selectNoRadioBTN(), 15);
        Browser.click(MoveInMoveOutUnitsPageObjects.selectNoRadioBTN());
        Browser.waitForSeconds(2);
    }

    public void checkNoteTextAreaIsDisplayed() {
        Assert.assertTrue(Browser.isElementPresent(MoveInMoveOutUnitsPageObjects.NoteTextareaInput()), "Note text area is not visible");
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
        WebElement UploadFile = Browser.getWebElement(By.xpath("(//input[@type='file'])"));
        UploadFile.sendKeys(filepath);
        Browser.waitForSeconds(1);
    }


    public void verifyAttachmentIsUploaded() {
        CommonMethodsPage.checkOneAttachmentIsAdded(RevokeContractPageObjects.AttachmentIcon());
        logger.addScreenshot("");
    }

    public void verifyAttachmentIsRemoved() {
        Assert.assertTrue(Browser.isElementNotPresent(RevokeContractPageObjects.AttachmentIcon()));
        logger.addScreenshot("");
    }

    public void verifyAttachmentsAreUploaded() {
        CommonMethodsPage.checkMultipleAttachmentsAreAdded(RevokeContractPageObjects.AttachmentIcon());
        logger.addScreenshot("");
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
        logger.addScreenshot("");
    }

    public void ViewMoveInDetails() {
        Browser.waitUntilPresenceOfElement(MoveInMoveOutUnitsPageObjects.ViewDetails(), 20);
        Browser.click(MoveInMoveOutUnitsPageObjects.ViewDetails());
    }

    public void verifyNavigateToViewUnitMoveInDetails() {
        Browser.waitUntilVisibilityOfElement(MoveInMoveOutUnitsPageObjects.ContractHeading(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(MoveInMoveOutUnitsPageObjects.ContractHeading()));
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void confirmMoveInUnit() {
        Browser.waitUntilVisibilityOfElement(MoveInMoveOutUnitsPageObjects.ConfirmMoveInBTN(), 40);
        Browser.click(MoveInMoveOutUnitsPageObjects.ConfirmMoveInBTN());
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
        String MoveInStatus = Browser.getText(MoveInMoveOutUnitsPageObjects.TenantResponse());
        Assert.assertTrue(MoveInStatus.contains(Response));
        logger.addScreenshot("Tenant Move In Response is : " + MoveInStatus);
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

    public void clickOnDownloadBTN() throws AWTException {
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(300);
        if (Browser.isElementPresent(MoveInMoveOutUnitsPageObjects.DownloadPDFBTN())) {
            Browser.click(MoveInMoveOutUnitsPageObjects.DownloadPDFBTN());
            Browser.waitForSeconds(4);

        }
    }
}