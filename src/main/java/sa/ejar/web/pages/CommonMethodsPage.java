package sa.ejar.web.pages;

import com.testcrew.manager.TestDataManager;
import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.SendContractForApprovalPageObjects;
import sa.ejar.web.objects.TerminateContractPageObjects;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.precondition.LoginPageObjects;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.LocalDate;
import sa.ejar.web.pages.precondition.LoginPage;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.*;

public class CommonMethodsPage {

    /**
     * Click on Contracts Button
     */
    public static void clickContractsBtn() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.contractButton(), 60);
        Browser.click(LoginPageObjects.contractButton());
        logger.addScreenshot("Clicked on Contracts button");
    }

    /**
     * Click on View Contracts option
     */
    public static void selectViewAllContractsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.viewAllContractsButton(), 20);
        Browser.click(LoginPageObjects.viewAllContractsButton());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Navigate to View All Contracts page");
    }

    public static void clickOnTheRequestsTabButton() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 60);
        if (Browser.isElementPresent(LoginPageObjects.assessementUnitpopup())) {
            Browser.click(LoginPageObjects.assessementUnitpopup());
        }
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.theRequestTab(), 60);
        Browser.click(CommonMethodsPageObjects.theRequestTab());
        logger.addScreenshot("Clicked on Requests button");
    }

    public static void clickOnViewAllRequestsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.viewAllTheRequests(), 20);
        Browser.click(CommonMethodsPageObjects.viewAllTheRequests());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Navigate to View All Requests page");
    }

    public static void clickOnRevokeContractRequestButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.RevokeContractRequestOption(), 20);
        Browser.click(CommonMethodsPageObjects.RevokeContractRequestOption());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Navigate to Revoke Contract Request page");
    }

    public static void clickOnRentalIncidentRequestButton() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.RentalIncidentRequestOption(), 20);
        Browser.click(CommonMethodsPageObjects.RentalIncidentRequestOption());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Navigate to Rental Incident Request page");
    }

    /**
     * Click on filter button
     */
    public static void clickFilterBtn() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.filterBtnOnViewAllContractsPage(), 40);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.filterBtnOnViewAllContractsPage());
        logger.addScreenshot("Clicked on filter button");
    }

    public static void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
        Browser.waitUntilPresenceOfElement(AddResidentialContractPageObjects.searchContractNumberInputField(), 20);
        Browser.setText(AddResidentialContractPageObjects.searchContractNumberInputField(), contractNumber);
        Browser.waitForSeconds(1);
        logger.addScreenshot("Entered Contract Number in search input field");
    }

    public static void enterRequestNumberInRequestSearchInputField(String requestNumber) throws Exception {
        waitUntilPresenceOfElement(CommonMethodsPageObjects.requestNumberTXT(), 20);
        setText(CommonMethodsPageObjects.requestNumberTXT(), requestNumber);
        waitForSeconds(1);
        logger.addScreenshot("Entered Request Number in search input field");
    }

    public static void clickOnNextButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        click(CommonMethodsPageObjects.nextBTN());
    }

    public static void verifyNextButtonIsEnabled() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        Assert.assertTrue(isElementEnabled(CommonMethodsPageObjects.nextBTN()), "Button is not enabled");
        logger.addScreenshot("");
    }

    public static void clickOnCancelButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.cancelBTN(), 40);
        Browser.waitForSeconds(2);
        click(CommonMethodsPageObjects.cancelBTN());
    }

    public static void clickOnCancelPopUpButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.cancelPopUpBTN(), 20);
        Browser.click(CommonMethodsPageObjects.cancelPopUpBTN());
    }

    public static void clickOnConfirmPopUpButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmPopUpBTN(), 20);
        Browser.click(CommonMethodsPageObjects.confirmPopUpBTN());
    }

    public static void checkTheContractsPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.theContractPage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(TerminateContractPageObjects.theContractPage()));
        logger.addScreenshot("User Navigate Back To 'العقود' Page");
    }

    public static void clickOnBackButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.backBTN(), 40);
        Browser.waitForSeconds(2);
        Browser.click(CommonMethodsPageObjects.backBTN());
    }

    public static void clickOnConfirmButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmBTN(), 20);
        click(CommonMethodsPageObjects.confirmBTN());
    }

    public static void clickOnCloseButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.closeBTN(), 20);
        click(CommonMethodsPageObjects.closeBTN());
    }

    public static void clickOnEditButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.editBTN(), 20);
        click(CommonMethodsPageObjects.editBTN());
    }

    public static void clickOnDeleteIconButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.deleteIconBTN(), 20);
        click(CommonMethodsPageObjects.deleteIconBTN());
    }

    /**
     * Select an option from the list
     *
     * @param option  - option to be selected
     * @param element - list object
     */
    public static void selectFromList(String option, By element) throws Exception {
        Browser.waitUntilVisibilityOfElement(element, 30);
        List<WebElement> selectList = driver.findElements(element);
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(option)) {
                listName.click();
            }
        }
    }

    /**
     * Check mark every checkbox in approval
     */
    public static void selectCheckboxesOfSendApproveContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.sendForApprovalCheckboxes(), 30);
        List<WebElement> checkBoxes = driver.findElements(SendContractForApprovalPageObjects.sendForApprovalCheckboxes());
        for (WebElement checkbox : checkBoxes) {
            Thread.sleep(500);
            checkbox.click();
            Thread.sleep(1000);
        }
    }

    public static void clickRejectReasonRadioButtons() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectReasonRadioBTNs(), 30);
        List<WebElement> selectList = driver.findElements(CommonMethodsPageObjects.rejectReasonRadioBTNs());
        for (WebElement listName : selectList) {
            listName.click();
            listName.isSelected();
        }
    }

    public static void assertContractsAreAppearing() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ContractsList(), 40);
        boolean status = isElementDisplayed(CommonMethodsPageObjects.ContractsList());
        Assert.assertTrue(status, "Contracts are not displayed");
        logger.addScreenshot("All available contracts are displayed");
    }

    /**
     * Verify the searched contract is displayed on Contracts page
     *
     * @param expectedContractNumber - Contract number to be validated
     */
    public static void verifySearchedContractIsDisplayed(String expectedContractNumber) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.ContractNumberOfSearchedContract(), 40);
        if (isElementDisplayed(CommonMethodsPageObjects.ContractNumberOfSearchedContract())) {
            String actualContractNumber = getText(CommonMethodsPageObjects.ContractNumberOfSearchedContract());
            boolean status = false;
            if (actualContractNumber.contains(expectedContractNumber)) {
                status = true;
            }
            Assert.assertTrue(status, "Searched Contract is not displayed");
            logger.addScreenshot("Searched contract is displayed");
        } else {
            logger.addScreenshot("Searched contract is not displayed");
        }
    }

    /**
     * Verify the searched request is displayed on Requests page
     *
     * @param expectedRequestNumber - Request number to be validated
     */
    public static void verifySearchedRequestIsDisplayed(String expectedRequestNumber) throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.requestNumberOfSearchedRequest(), 40);
        if (isElementDisplayed(CommonMethodsPageObjects.requestNumberOfSearchedRequest())) {
            String actualRequestNumber = getText(CommonMethodsPageObjects.requestNumberOfSearchedRequest());
            boolean status = false;
            if (actualRequestNumber.contains(expectedRequestNumber)) {
                status = true;
            }
            Assert.assertTrue(status, "Searched Request is not displayed");
            logger.addScreenshot("Searched Request is displayed");
        } else {
            logger.addScreenshot("Searched Request is not displayed");
        }
    }

    public static void clickOnKebabMenuButton() {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuButton(), 40);
        Browser.waitForSeconds(2);
        click(CommonMethodsPageObjects.KebabMenuButton());
    }

    /**
     * Validate an option is displayed in Kebab menu
     *
     * @param option - Option to be validated
     */
    public static void KebabMenuOptions(String option) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuOptions(), 40);
        Browser.waitForSeconds(3);
        List<WebElement> kebabOptions = getWebElements(CommonMethodsPageObjects.KebabMenuOptions());
        boolean status = false;
        for (WebElement opt : kebabOptions) {
            String optText = opt.getText();
            if (optText.contains(option)) {
                status = true;
                break;
            }
        }
        Assert.assertTrue(status, option + "option is not available");
        logger.addScreenshot("");
    }

    /**
     * Select an option from Kebab menu
     * @param option - Option to be selected
     */
    public static void ClickOnKebabMenuOption(String option) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuOptions(), 40);
        List<WebElement> kebabOptions = getWebElements(CommonMethodsPageObjects.KebabMenuOptions());
        for (WebElement opt : kebabOptions) {
            String optText = opt.getText();
            if (optText.contains(option)) {
                opt.click();
                break;
            }
        }
    }

    public static void TerminateOptions(String option) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.TerminateOptions(), 40);
        List<WebElement> kebabOptions = getWebElements(CommonMethodsPageObjects.TerminateOptions());
        boolean status = false;
        for (WebElement opt : kebabOptions) {
            String optText = opt.getText();
            if (optText.contains(option)) {
                status = true;
                break;
            }
        }
        Assert.assertTrue(status, option + "option is not available");
        logger.addScreenshot("");
    }

    public static void ClickOnTerminateOption(String option) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.TerminateOptions(), 40);
        List<WebElement> kebabOptions = getWebElements(CommonMethodsPageObjects.TerminateOptions());
        for (WebElement opt : kebabOptions) {
            String optText = opt.getText();
            if (optText.contains(option)) {
                opt.click();
                break;
            }
        }
    }

    public static void ClickOnViewContractOption(String option) throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.viewContractOptionBTN(), 40);
        List<WebElement> kebabOptions = getWebElements(CommonMethodsPageObjects.viewContractOptionBTN());
        for (WebElement opt : kebabOptions) {
            String optText = opt.getText();
            if (optText.contains(option)) {
                opt.click();
                break;
            }
        }
    }

    public static void ClickOnAcceptTerminateOption(String option) throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.acceptTerminationOptionBTN(), 40);
        List<WebElement> kebabOptions = getWebElements(CommonMethodsPageObjects.acceptTerminationOptionBTN());
        for (WebElement opt : kebabOptions) {
            String optText = opt.getText();
            if (optText.contains(option)) {
                opt.click();
                break;
            }
        }
    }

    public static void verifyPopUpAlertAfterCancelIsDisplayed(String expected) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.PopUpAlertAfterCancel(), 40);
        String actual = getText(CommonMethodsPageObjects.PopUpAlertAfterCancel());
        Assert.assertTrue((actual.contains(expected)), "Pop up message is different");
        logger.addScreenshot("The message is displayed");
    }

    /**
     * Method to check if the value has been entered in Input Field
     *
     * @param value   - Value to be validated
     * @param element - Locator of Input Field
     */
    public static void verifyValueIsEntered(String value, By element) {
        waitUntilVisibilityOfElement(element, 40);
        String val = getWebElement(element).getAttribute("value");
        Assert.assertTrue(val.contains(value), "Value is not entered");
    }

    /**
     * Method to check if the value is NOT entered in Input Field
     *
     * @param value   - Value to be validated
     * @param element - Locator of Input Field
     */
    public static void verifyValueIsNotEntered(String value, By element) {
        waitUntilVisibilityOfElement(element, 40);
        String val = getWebElement(element).getAttribute("value");
        Assert.assertFalse(val.contains(value), "Value is entered");
    }

    /**
     * Method to validate the displayed value
     *
     * @param value   - Value to be validated
     * @param element - Locator of Input Field
     */
    public static void verifyValueIsDisplayed(String value, By element) {
        waitUntilVisibilityOfElement(element, 40);
        String val = getWebElement(element).getText();
        Assert.assertTrue(val.contains(value), "Actual value (" + val +") does not match with expected value (" +value+ ")" );
        logger.addScreenshot("");
    }


    /**
     * Method to get current date and to change the date to future or past
     *
     * @param reqYear  - required year (Negative value to get to any previous years and positive for future)
     * @param reqMonth - required month (Negative value to get to any previous months and positive for future)
     * @param reqDay   - required day (Negative value to get to any previous days and positive for future)
     */
    public static String getCurrentDate(int reqYear, int reqMonth, int reqDay) {
        String currentDate = LocalDate.now().toString();
        String[] arrDate = currentDate.split("-");
        String year = String.valueOf(Integer.parseInt(arrDate[0]) + reqYear);
        String month = String.valueOf(Integer.parseInt(arrDate[1]) + reqMonth);
        String day = String.valueOf(Integer.parseInt(arrDate[2]) + reqDay);
        if (!(month.length() == 2)) {
            month = 0 + month;
        }
        if (!(day.length() == 2)) {
            day = 0 + day;
        }
        return year + month + day;
    }

    /**
     * validate any error message under input/text fields
     *
     * @param errorMsg - Message to be validated
     * @param element  - Message object
     */
    public static void errorMessage(String errorMsg, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String text = getText(element);
        String[] textSplit = text.split(" ");
        text = textSplit[0] + textSplit[1] + textSplit[2];
        boolean status = false;
        if (text.contains(errorMsg)) {
            status = true;
        }
        System.out.println(text);
        Assert.assertTrue(status, errorMsg + " error message is not same/displayed");
        logger.addScreenshot("");
    }


    /**
     * validate any error message for invalid attachment
     *
     * @param errorMsg - Message to be validated
     * @param element  - Message object
     */
    public static void errorMessageFoAttachments(String errorMsg, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String text = getText(element);
        boolean status = false;
        if (text.contains(errorMsg)) {
            status = true;
        }
        System.out.println(text);
        Assert.assertTrue(status, errorMsg + " error message is not same/displayed");
        logger.addScreenshot("");
    }

    public static void totalAmount(String amount, By element) {
        waitUntilVisibilityOfElement(element, 40);
        String text = getText(element);
        String[] textSplit = text.split(" ");
        text = textSplit[0];
        boolean status = false;

        if (text.contains(amount)) {
            status = true;

        }

        Assert.assertTrue(status, "Expected (" + text + ") value is not the same as actual (" + amount + ") value");
        logger.addScreenshot("");
    }

    /**
     * Validate equivalent date is displayed in Hijri/Gregorian format under date input field
     *
     * @param dateType - Format of date (Hijri or Gregorian)
     */
    public static void verifyEquivalentDateIsDisplayed(String dateType) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.equivalentDateHint(), 20);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.equivalentDateHint()));
        logger.addScreenshot("Equivalent " + dateType + " date is displayed");
    }

    public static void verifyTheNextButtonIsDisabled() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        Assert.assertTrue(isElementDisabled(CommonMethodsPageObjects.nextBTN()));
        logger.addScreenshot("The (التالي) button is not enabled/clickable");
    }

    public static void verifyTheConfirmAndSubmitButtonIsDisabled() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Assert.assertTrue(isElementDisabled(CommonMethodsPageObjects.confirmAndSubmitBTN()));
        logger.addScreenshot("The (تأكيد وإرسال) button is not enabled/clickable");
    }

    public static void verifyTheConfirmAndSubmitButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Assert.assertTrue(isElementEnabled(CommonMethodsPageObjects.confirmAndSubmitBTN()));
        logger.addScreenshot("The (تأكيد وإرسال) button is enabled/clickable");
    }

    public static void UploadAttachment(String filePath, By element) {
        String path = System.getProperty("user.dir") + filePath;
        WebElement ele = Browser.getWebElement(element);
        ele.sendKeys(path);
    }

    public static void checkOneAttachmentIsAdded(By element) {
        waitUntilVisibilityOfElement(element, 40);
        Assert.assertTrue(isElementDisplayed(element), "Attachment is not uploaded");
    }

    public static void checkOneAttachmentNotAdded(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        Assert.assertTrue(Browser.isElementDisplayed(element), "Attachment is uploaded");
    }

    public static void checkMultipleAttachmentsAreAdded(By element) {
        waitUntilVisibilityOfElement(element, 40);
        List<WebElement> elements = getWebElements(element);
        int index = 1;
        for (WebElement ele : elements) {
            Assert.assertTrue(ele.isDisplayed(), "Attachment " + index + " is displayed");
        }
    }


    public static void ClickOnAttachment(String action) throws AWTException {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.ViewOrDownloadAttachmentButtons(), 40);
        List<WebElement> buttons = getWebElements(CommonMethodsPageObjects.ViewOrDownloadAttachmentButtons());
        if (buttons.size() > 1) {
            if (action.equalsIgnoreCase("view")) {
                Browser.waitForSeconds(1);
                buttons.get(1).click();
            } else if (action.equalsIgnoreCase("download")) {
                buttons.get(0).click();
                enterDownloadPath();
            }
        } else {
            Browser.waitForSeconds(1);
            buttons.get(0).click();
        }
    }

    public static void enterDownloadPath() throws AWTException {
        emptyDownloadsFolder(System.getProperty("user.dir") + "\\src\\main\\resources\\downloads");
        TCRobot robot = new TCRobot();
        Browser.waitForSeconds(2);
        robot.setText(setDownloadPath());
        Browser.waitForSeconds(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        Browser.waitForSeconds(2);
    }

    public static void verifyAttachmentHasBeenDownloaded() {
        ArrayList<String> filenames = getFilesNames(System.getProperty("user.dir") + "\\src\\main\\resources\\downloads");
        boolean status = false;
        if (!(filenames.isEmpty())) {
            status = true;
        }
        Assert.assertTrue(status, "File is not downloaded");
    }

    public static void emptyDownloadsFolder(String folderPath) {
        File folder = new File(folderPath);
        // Check if the provided path is a directory
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("The provided path is not a directory.");
        }
        // List the contents of the directory
        File[] files = folder.listFiles();
        if (files != null) {
            // Iterate through the files and delete them
            for (File file : files) {
                if (file.isFile()) {
                    // If it's a file, delete it
                    file.delete();
                }
            }
        }
    }

    public static ArrayList<String> getFilesNames(String folderPath) {
        ArrayList<String> filenames = new ArrayList<>();
        File folder = new File(folderPath);

        // Check if the provided path is a directory
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("The provided path is not a directory.");
        }
        // List the contents of the directory
        File[] files = folder.listFiles();
        if (files != null) {
            // Iterate through the files and print their names
            for (File file : files) {
                if (file.isFile()) {
                    // If it's a file, print its name
                    filenames.add(file.getName());
                }
            }
        }
        return filenames;
    }

    public static void verifyNewTabIsOpened() {
        Browser.waitForSeconds(2);
        Set<String> tabs = driver.getWindowHandles();
        String[] arrayTabs = tabs.toArray(new String[0]);
        driver.switchTo().window(arrayTabs[0]);
        String oldURL = driver.getCurrentUrl();
        driver.switchTo().window(arrayTabs[1]);
        String newURL = driver.getCurrentUrl();
        boolean status = false;
        if (!(newURL.equalsIgnoreCase(oldURL))) {
            status = true;
        }
        Assert.assertTrue(status, "New tab is not opened");
        logger.addScreenshot("Attachment is displayed in new browser tab");
    }

    public static void verifySuccessPopUpIsDisplayed() {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.SuccessPopUPTitle(), 40);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.SuccessPopUPTitle()), "Success Pop up is not displayed");
        logger.addScreenshot("");
    }

    public static void verifyConfirmPopUpIsDisplayedAfterApproveRequest() {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.ConfirmationPopUpTitle(), 40);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.ConfirmationPopUpTitle()), "Confirmation Pop up is not displayed");
        logger.addScreenshot("");
    }

    public static void verifyConfirmPopUpIsDisplayedAfterRejectRequest() {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.ReasonOfRejectPopUpTitle(), 40);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.ReasonOfRejectPopUpTitle()), "Reason of rejection Pop up is not displayed");
        logger.addScreenshot("");
    }


    public static String getRequestNumber(By element) {
        waitUntilVisibilityOfElement(element, 40);
        String text = getText(element);
        int index = text.indexOf("#");
        String newText = text.substring(index);
        String reqNum = newText.split(" ")[1];
        return reqNum;
    }

    public static void getReqNumBo() throws Exception {
        String request = CommonMethodsPage.getRequestNumber(CommonMethodsPageObjects.requestNumber());
        TestDataManager.addDependantGlobalTestData("Terminate", "ReqNumBo", request);
        TestDataManager.writeDependantGlobalTestData("Terminate");
    }

    public static void getReqNumLessor() throws Exception {
        String request = CommonMethodsPage.getRequestNumber(CommonMethodsPageObjects.requestNumber());
        TestDataManager.addDependantGlobalTestData("Terminate", "ReqNumLessor", request);
        TestDataManager.writeDependantGlobalTestData("Terminate");
    }

    public static void getReqNumTenant() throws Exception {
        String request = CommonMethodsPage.getRequestNumber(CommonMethodsPageObjects.requestNumber());
        TestDataManager.addDependantGlobalTestData("Terminate", "ReqNumTenant", request);
        TestDataManager.writeDependantGlobalTestData("Terminate");
    }

    public static void checkRequestsPageIsDisplayed(String requestType) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.RequestPageTitle(), 40);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.RequestPageTitle()), requestType + "request page is not displayed");
        logger.addScreenshot(requestType + "request page is displayed");
    }

    public static void checkRequestStatus(String expectedStatus) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.RequestStatus(), 40);
        String actualStatus = getText(CommonMethodsPageObjects.RequestStatus());
        Assert.assertTrue(actualStatus.contains(expectedStatus), "Status does not match");
        logger.addScreenshot("Request status is: " + actualStatus);
    }

    public static void clickOnApproveBTN() {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.ApproveBTN(), 40);
        click(CommonMethodsPageObjects.ApproveBTN());
    }

    public static void clickOnSubmitForApprovalBTN() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.submitForApprovalBTN(), 40);
        click(CommonMethodsPageObjects.submitForApprovalBTN());
    }

    public static void clickOnRejectBTN() {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.RejectBTN(), 40);
        click(CommonMethodsPageObjects.RejectBTN());
    }

    public static void verifyNewInvoiceDateIsSameAsEnteredInRequest(String expectedDate) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.PaymentDueDateOnInvoice(), 40);
        String actualDate = getText(CommonMethodsPageObjects.PaymentDueDateOnInvoice());
        String[] splitDate = actualDate.split("-");
        actualDate = splitDate[0] + splitDate[1] + splitDate[2];
        Assert.assertEquals(actualDate, expectedDate, "Dates are not same ");
        logger.addScreenshot("");
    }

    public static void verifyInvoiceStatus(String invoice, String expectedStatus, By element) {
        waitUntilVisibilityOfElement(element, 40);
        String actualStatus = getText(element);
        boolean status = false;
        if (actualStatus.contains(expectedStatus)) {
            status = true;
        }
        Assert.assertTrue(status, invoice + " has different status");
        logger.addScreenshot(invoice + " has status " + actualStatus);
    }

    public static void verifyReviewTheContractPageIsDisplayed() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.reviewTheContractPage(), 20);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.reviewTheContractPage()));
        logger.addScreenshot("User Navigate To 'مراجعة العقد' Page");
    }

    public static void clickOnRejectButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectBTN(), 20);
        click(CommonMethodsPageObjects.rejectBTN());

    }

    public static void verifyRejectReasonPageIsDisplayed() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectReasonText(), 20);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.rejectReasonText()));
        logger.addScreenshot("User Navigate To 'لماذا تريد الرفض؟' Page");
    }

    public static void enterRejectionReasonNote(String rejectReason) throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectionReasonNote(), 20);
        setText(CommonMethodsPageObjects.rejectionReasonNote(), rejectReason);

    }

    public static void verifyRejectionReasonNoteHasBeenEntered(String enteredRejectReason) throws Exception {
        WebElement reason = getWebElement(CommonMethodsPageObjects.rejectionReasonNote());
        String text = reason.getAttribute("value");
        Assert.assertEquals(text, enteredRejectReason);
        logger.addScreenshot("The rejection reason has been entered");

    }

    public static void verifyRejectionSubmittedPageIsDisplayed() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectionSubmittedMessage(), 20);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.rejectionSubmittedMessage()));
        logger.addScreenshot("User Navigate To 'تم تقديم الرفض' Page");
    }

    public static void clickOnTheFinancialTabButton() throws Exception {
        waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 60);
        if (isElementPresent(LoginPageObjects.assessementUnitpopup())) {
            click(LoginPageObjects.assessementUnitpopup());
        }
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.financialTab(), 60);
        click(CommonMethodsPageObjects.financialTab());
        logger.addScreenshot("Clicked on Financial button");
    }

    public static void clickOnViewAllInvoicesButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.allInvoicesBTN(), 20);
        click(CommonMethodsPageObjects.allInvoicesBTN());
        waitForSeconds(1);
        logger.addScreenshot("Navigate to View All Invoices page");
    }

    public static void verifyContractsInvoicesIsPageIsDisplayed() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.contractsInvoices(), 20);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.contractsInvoices()));
        logger.addScreenshot("User Navigate To 'فواتير العقود' Page");
    }

    public static void enterContractNumber(String contractNum) throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.contractsNumber(), 20);
        setText(CommonMethodsPageObjects.contractsNumber(), contractNum);

    }


    /**
     * Verify searched contract number is displayed in invoices page
     *
     * @param expectedContractNumber - searched contract to be validated
     */
    public static void verifySearchedContractIsDisplayedForInvoices(String expectedContractNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.allContractInvoices(), 40);
        Browser.waitForSeconds(3);
        if (Browser.isElementDisplayed(CommonMethodsPageObjects.allContractInvoices())) {
            String actualContractNumber = Browser.getText(CommonMethodsPageObjects.allContractInvoices());
            boolean status = false;
            if (actualContractNumber.contains(expectedContractNumber)) {

                status = true;
            }


            Assert.assertTrue(status, "Searched Contract is not displayed");
            logger.addScreenshot("Searched contract is displayed");
        } else {
            logger.addScreenshot("Searched contract is not displayed");
        }
    }

    public static void clickOnNewInvoice() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.newContractInvoice(), 20);
        Browser.waitForSeconds(3);
        Browser.click(CommonMethodsPageObjects.newContractInvoice());
        Browser.waitForSeconds(1);
        logger.addScreenshot("New invoice details is displayed");
    }


    public static void newAmountForContractInvoice(String amount) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.newAmountForContractInvoice(), 40);
        String text = getText(CommonMethodsPageObjects.newAmountForContractInvoice());
        String newAmount = text.split(" ")[2];
        boolean status = false;

        if (newAmount.contains(amount)) {
            status = true;

        }
        Assert.assertTrue(status, amount + "the amount is not the same");
        logger.addScreenshot("");
    }

    /**
     * Check the user role and change if it is not same as required
     *
     * @param User - required user role ('مؤجر', 'مستأجر', 'مدير مكتب الوساطة')
     */
    public static void changeUserRole(String User) throws Exception {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.RoleName(), 40);
        String RoleName = Browser.getText(CommonMethodsPageObjects.RoleName());
        boolean status = false;
        if (!(RoleName.contains(User))) {
            Browser.click(CommonMethodsPageObjects.RoleName());
            Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.UserIdentityList(), 30);
            List<WebElement> UserRoleList = Browser.getWebElements(CommonMethodsPageObjects.UserIdentityList());
            for (WebElement opt : UserRoleList) {
                String optText = opt.getText();
                if (optText.contains(User)) {
                    opt.click();
                    status = true;
                    break;
                }
            }
            Assert.assertTrue(status, UserRoleList + "User Role is not available");
            new LoginPage().closeExploreEjarPopUp();
        }
        //logger.addScreenshot("The role has been changed to " + User);
    }

    public static void clickOnRemoveButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.removeBTN(), 20);
        click(CommonMethodsPageObjects.removeBTN());
    }

    public static void clickOnConfirmAndSubmitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Browser.waitUntilElementToBeClickable(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Browser.click(CommonMethodsPageObjects.confirmAndSubmitBTN());
    }

    public static void clickOnDisclaimerCheckbox() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.disclaimerCheckbox(), 20);
        click(CommonMethodsPageObjects.disclaimerCheckbox());
    }

    public static void enterPhoneNumber(String phoneNumber) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.PhoneNumberInputField(), 40);
        clearText(CommonMethodsPageObjects.PhoneNumberInputField());
        setText(CommonMethodsPageObjects.PhoneNumberInputField(), phoneNumber);
    }

    public static void enterEmail(String email) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.EmailInputField(), 40);
        clearText(CommonMethodsPageObjects.EmailInputField());
        setText(CommonMethodsPageObjects.EmailInputField(), email);
    }

    public static void clickOnRegionDropdownMenu() {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.RegionDropdown(), 40);
        click(CommonMethodsPageObjects.RegionDropdown());
    }

    public static void selectRegion(String tenantRegion) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.RegionDropdownOptions(), 40);
        selectDropdownByValue(CommonMethodsPageObjects.RegionDropdownOptions(), tenantRegion);
        logger.addScreenshot("Region is selected");
    }

    public static void clickOnCityDropdown() {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.CityDropdown(), 40);
        click(CommonMethodsPageObjects.CityDropdown());
    }

    public static void SelectCity(String tenantCity) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.CitySearchBar(), 40);
        setText(CommonMethodsPageObjects.CitySearchBar(), tenantCity);
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.CityName(), 40);
        click(CommonMethodsPageObjects.CityName());
        logger.addScreenshot(tenantCity + " city is selected");
    }

    public static void enterPostalCode(String postalCode) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.PostalCodeInput(), 40);
        clearText(CommonMethodsPageObjects.PostalCodeInput());
        setText(CommonMethodsPageObjects.PostalCodeInput(), postalCode);
        logger.addScreenshot(postalCode + " postal code is entered");
    }

    public static void enterStreetName(String street) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.StreetNameInput(), 40);
        clearText(CommonMethodsPageObjects.StreetNameInput());
        setText(CommonMethodsPageObjects.StreetNameInput(), street);
        logger.addScreenshot(street + " street name is entered");
    }

    public static void enterBuildingNumber(String buildingNum) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.BuildingNumberInput(), 40);
        clearText(CommonMethodsPageObjects.BuildingNumberInput());
        setText(CommonMethodsPageObjects.BuildingNumberInput(), buildingNum);
        logger.addScreenshot(buildingNum + " street name is entered");

    }

    public static void enterAdditionalNumber(String additionalNum) throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.AdditionalNumberInput(), 40);
        clearText(CommonMethodsPageObjects.AdditionalNumberInput());
        setText(CommonMethodsPageObjects.AdditionalNumberInput(), additionalNum);
        logger.addScreenshot(additionalNum + " street name is entered");
    }

    public static void clickOnSubmitButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.submitBTN(), 20);
        click(CommonMethodsPageObjects.submitBTN());
    }

    public static void verifyTheSurveyIsDisplayed() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.ratingBTN(), 20);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.ratingBTN()));
        logger.addScreenshot("The 'التقييم والاستبيان' is displayed");
    }

    public static void clickRatingButtons() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ratingBTN(), 30);
        if (Browser.isElementDisplayed(CommonMethodsPageObjects.newRadioBTN())) {
            Browser.click(CommonMethodsPageObjects.newRadioBTN());
        }
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ratingBTN(), 30);
        List<WebElement> rateList = driver.findElements(CommonMethodsPageObjects.ratingBTN());
        for (WebElement rate : rateList) {
            rate.click();

        }
    }

    public static void verifyTheSurveyIsSuccessfullySubmittedDisplayed() {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.successfulSurveySubmittedMsg(), 20);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.successfulSurveySubmittedMsg()));
        logger.addScreenshot("The 'تم تقديم الرد' is displayed");
    }

    public static void clickOnYesRadioButtons() {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.yesRadioBTN(), 30);
        List<WebElement> selectList = driver.findElements(CommonMethodsPageObjects.yesRadioBTN());
        for (WebElement listName : selectList) {
            listName.click();
        }
    }

    public static void verifyConfirmButtonIsDisabled() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmBTN(), 20);
        Assert.assertTrue(isElementDisabled(CommonMethodsPageObjects.confirmBTN()));
        logger.addScreenshot("The (تأكيد) button is disabled");
    }

    public static void verifyNextButtonIsDisabled() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        Assert.assertTrue(isElementDisabled(CommonMethodsPageObjects.nextBTN()));
        logger.addScreenshot("The (التالي) button is disabled");
    }

    public static void enterCRNumberInputField(String crNumber) {
        waitUntilPresenceOfElement(CommonMethodsPageObjects.CRNumberInput(), 20);
        setText(CommonMethodsPageObjects.CRNumberInput(), crNumber);
        logger.addScreenshot("Enter CR number input field");
    }

    /**
     * Validate error message
     *
     * @param errorMsg - message needs to be validated
     */
    public static void errorCRMessage(String errorMsg) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.errorCRNumberMsg(), 40);
        String text = getText(CommonMethodsPageObjects.errorCRNumberMsg());
        boolean status = false;
        if (text.contains(errorMsg)) {
            status = true;

        }
        Assert.assertTrue(status, errorMsg + "error message is not the same");
        logger.addScreenshot("");

    }

    public static void verifyOTPPopIsDisplayed() throws Exception {
        waitUntilVisibilityOfElement(LoginPageObjects.getVerificationCode(), 20);
        Assert.assertTrue(isElementDisplayed(LoginPageObjects.getVerificationCode()));
        logger.addScreenshot("OTP pop up is displayed");
    }

    public static void checkVerifyIdentityButtonIsDisabled() {
        waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.identityVerificationBTN(), 40);
        Assert.assertTrue(isElementDisabled(SendContractForApprovalPageObjects.identityVerificationBTN()), "Button is not disabled");
        logger.addScreenshot("");
    }

    public static void checkVerifyIdentityButtonIsPresent() {
        waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.identityVerificationBTN(), 10);
        Assert.assertTrue(isElementDisplayed(SendContractForApprovalPageObjects.identityVerificationBTN()), "Button is not present");
        logger.addScreenshot("VerifyIdentityButtonFromOTPPopupIsNotPresent");
    }

    public static void clickOnVerifyIdentityButton() {
        waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.identityVerificationBTN(), 10);
        Assert.assertTrue(isElementDisplayed(SendContractForApprovalPageObjects.identityVerificationBTN()), "Button is not present");
        click(SendContractForApprovalPageObjects.identityVerificationBTN());
        logger.addScreenshot("VerifyIdentityButtonFromOTPPopupIsNotPresent");
    }

    /**
     * Verify the contract status of different versions
     *
     * @param contractStatus - Expected status
     */
    public static void verifyStatusOfContract(String contractStatus) throws Exception {
        executeJSScroll(450);
        waitForSeconds(1);
        boolean status = false;
        String actualStatus = "";
        waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        List<WebElement> list = getWebElements(AddResidentialContractPageObjects.contractStatus());
        for (WebElement w : list) {
            actualStatus = w.getText();
            if (actualStatus.contains(contractStatus)) {
                status = true;
                break;
            }
        }
        Assert.assertTrue(status, "Contract status is not same");
        waitForSeconds(1);
        logger.addScreenshot("Contract Status : " + actualStatus);
    }

    public static void clickOnSendBTN() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.SendBTN(), 20);
        Browser.click(CommonMethodsPageObjects.SendBTN());
        Browser.waitForSeconds(1);
    }

    public static void assertFilterPopupIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.filterPopup(), 20);
        Browser.isElementDisplayed(CommonMethodsPageObjects.filterPopup());
        logger.addScreenshot(" ");
    }

    public static void checkSendForApprovalButtonIsEnabled() throws Exception {
        waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.sendForApprovalBTN(), 40);
        Assert.assertTrue(isElementEnabled(SendContractForApprovalPageObjects.sendForApprovalBTN()), "Button is not enabled");
        logger.addScreenshot("");
    }

    public static void SendForApprovalBTN() throws Exception {
        waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.sendForApprovalBTN(), 40);
        Browser.click(SendContractForApprovalPageObjects.sendForApprovalBTN());
        logger.addScreenshot("");
    }

    public static void clickOnLetUsStartButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.lestUsStartBTN(), 40);
        Browser.click(SendContractForApprovalPageObjects.lestUsStartBTN());
    }

    public static void clickOnDownloadDraftCopy() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.downloadDraftCopyBTN(), 40);
        Browser.click(SendContractForApprovalPageObjects.downloadDraftCopyBTN());
        Browser.waitForSeconds(12);
        logger.addScreenshot("Draft Copy download successfully");
    }


    public static void scrollToElement(By element) throws Exception {
        if (Browser.isElementPresent(element)) {
            Browser.executeJSScrollIntoView(element);
        }
    }

    public static void verifyContractStatusIsWaitingEjarFee() throws Exception {
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(1);
        String[] expectedStatus = {"Waiting Ejar Fee", "انتظار رسوم منصة إيجار"};
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        Browser.waitForSeconds(2);
        String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }
        Browser.logger.addScreenshot("");
    }

    public static void PDFValidation(String ContractNumber, String Message) throws IOException, IOException {
        //Open the downloaded PDF file and verify its contents
        String home = System.getProperty("user.home");
        String path = "file:///" + home + "\\Downloads\\" + ContractNumber + ".pdf";
        System.out.println(path);
        URL url = new URL(path);
        //Create Input Stream Object to save the Stream of pdf file using OpenStream
        InputStream iStream = url.openStream();
        //Create Buffered Input Stream object to pass InputStream class object reference
        BufferedInputStream bfStream = new BufferedInputStream(iStream);
        // Create a PDF document object.
        PDDocument document = PDDocument.load(bfStream);
        // Get the first page of the document.
        //PDPage doc = document.getPage(0);
        // Create a PDFTextStripper object.
        PDFTextStripper stripper = new PDFTextStripper();
        // Strip the text from the page.
        int chr = stripper.getText(document).indexOf("Contract No.");
        String contactVersion = stripper.getText(document).substring(chr, chr + 31);
        System.out.println(contactVersion);
        logger.addScreenshot("");
        // Validate the text.
        Assert.assertTrue(contactVersion.contains(Message));
    }

    /**
     * Method to get request number from requests page
     *
     * @param element - Object of request number text
     */
    public static String getRequestNumberFromRequestPage(By element) {
        String text = getText(element);
        return text.split("#")[1];
    }

    public static String setDownloadPath() {
        String fileName = "test_attachment";
        String downloadPath = System.getProperty("user.dir") + "\\src\\main\\resources\\downloads\\" + fileName;
        return downloadPath;
    }


    /**
     * Select an option from Kebab menu
     *
     * @param option - Option to be selected
     */
    public static void KebabMenuOptionNotDisplayed(String option) {
        Browser.waitForSeconds(2);
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuOptions(), 40);
        List<WebElement> kebabOptions = getWebElements(CommonMethodsPageObjects.KebabMenuOptions());
        boolean status = false;
        for (WebElement opt : kebabOptions) {
            String optText = opt.getText();
            if (optText.contains(option)) {
                status = true;
                break;
            }
        }
        Assert.assertFalse(status, option + "option is available");
        logger.addScreenshot("");
    }

    /**
     * Give true if expect the invalid otp error message to be present
     *
     * @param isPresent - give true if you expect the invalid OTP message to be present
     */
    public static void verifyInvalidOTPErrorMessagePresentStatus(boolean isPresent) {
        Assert.assertEquals(Browser.isElementDisplayed(CommonMethodsPageObjects.invalidOTPErrorMsg()),
                isPresent, "Invalid OTP Error Message Status is not expected.");
    }

    public static void clickOnSearchButton() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.SearchButton(), 40);
        Browser.click(CommonMethodsPageObjects.SearchButton());
    }


    public static void selectOwnershipDocumentDropdownList(String ownership, By element) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ownershipDocumentDDL(), 40);
        Browser.click(CommonMethodsPageObjects.ownershipDocumentDDL());
        selectFromList(ownership, element);
        logger.addScreenshot("Ownership document is selected");
    }

    public static void verifyOwnershipDocumentIsSelected(String selectedOwnershipDocument) throws Exception {
        WebElement requesterCategory = getWebElement(CommonMethodsPageObjects.ownershipDocumentDDL());
        String t = requesterCategory.getAttribute("value");
        String text = t.toLowerCase();
        if (text.contains("electronic_title_deed")) {
            text = "صك ملكية إلكتروني";
        } else if (text.contains("paper_title_deed")) {
            text = "صك ملكية ورقي";
        } else if (text.contains("hojjat")) {
            text = "حجة استحكام";
        } else if (text.contains("real_estate_registry_title_deed")) {
            text = "صك السجل العقاري";
        } else if (text.contains("other")) {
            text = "أخرى";
        }
        Assert.assertEquals(text, selectedOwnershipDocument);
        logger.addScreenshot("The (وثيقة ملكية) Is Selected");
    }

    public static void enterOwnershipDocumentNumberInputField(String ownershipDocumentNumber) {
        waitUntilPresenceOfElement(CommonMethodsPageObjects.ownershipDocumentNumberTXT(), 20);
        setText(CommonMethodsPageObjects.ownershipDocumentNumberTXT(), ownershipDocumentNumber);
    }


    public static void enterReleaseDateInputField(String releaseDate) {
        waitUntilPresenceOfElement(CommonMethodsPageObjects.releaseDateTXT(), 20);
        setText(CommonMethodsPageObjects.releaseDateTXT(), releaseDate);
    }

    public static void verifyOwnerIdInputFieldIsNotDisplayed() {
        Assert.assertTrue(isElementNotPresent(CommonMethodsPageObjects.ownerIdTXT()), "Input filed is not displayed");
        logger.addScreenshot("");
    }

    public static void verifyLegalDocumentTypeNameInputFieldIsNotDisplayed() {
        Assert.assertTrue(isElementNotPresent(CommonMethodsPageObjects.legalDocumentTypeNameTXT()), "Input filed is not displayed");
        logger.addScreenshot("");
    }


    public static void verifyTheSelectedOwnershipDocumentInfoIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.selectedOwnershipDocumentInfo(), 40);
        Assert.assertTrue(isElementPresent(CommonMethodsPageObjects.selectedOwnershipDocumentInfo()), "ownership document info is displayed");
        logger.addScreenshot("");
    }

    public static void verifyAddNewOwnershipDocumentAlertMessageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.addNewOwnershipDocumentAlertMsg(), 40);
        Assert.assertTrue(isElementPresent(CommonMethodsPageObjects.addNewOwnershipDocumentAlertMsg()));
        logger.addScreenshot("");
    }

    public static void selectExistingOwnershipDocument() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.selectedOwnershipDocumentInfo(), 20);
        Browser.click(CommonMethodsPageObjects.selectedOwnershipDocumentInfo());
    }

    public static void verifyTheExistingOwnershipDocumentIsSelected() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.selectedOwnershipDocumentInfo(), 20);
        Assert.assertTrue(isElementSelected(CommonMethodsPageObjects.selectedOwnershipDocumentInfoRadioBTN()));
        logger.addScreenshot("");
    }

    public static void verifyAddPropertyButtonIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.addPropertyBTN(), 40);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.addPropertyBTN()));
        logger.addScreenshot("");
    }

    public static void verifySelectUnitPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.selectUnitPage(), 40);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.selectUnitPage()));
        logger.addScreenshot("");
    }

    public static void clickOnDeleteIconButtonForAttachment() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.deleteIconForAttachment(), 20);
        Browser.click(CommonMethodsPageObjects.deleteIconForAttachment());
    }

    public static void verifyTheAttachmentIsRemoved() {
        Browser.waitUntilInvisibilityOfElement(CommonMethodsPageObjects.removedAttachment(), 40);
        Assert.assertTrue(isElementNotPresent(CommonMethodsPageObjects.removedAttachment()));
        logger.addScreenshot("");
    }

    public static void clickOnSendRequestButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.sendRequestBTN(), 20);
        Browser.click(CommonMethodsPageObjects.sendRequestBTN());
    }

    public static void verifySendRequestButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.sendRequestBTN(), 40);
        Assert.assertTrue(isElementDisabled(CommonMethodsPageObjects.sendRequestBTN()));
        logger.addScreenshot("");
    }


}