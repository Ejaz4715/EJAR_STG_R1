package sa.ejar.web.pages;

import com.testcrew.manager.TestDataManager;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;

import sa.ejar.web.objects.SendContractForApprovalPageObjects;
import sa.ejar.web.objects.TerminateContractPageObjects;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.precondition.LoginPageObjects;

import java.io.File;
import java.time.LocalDate;
import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.*;

public class CommonMethodsPage {

    /**
     * Click on Contracts Button
     */
    public static void clickContractsBtn() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 60);
        if (Browser.isElementPresent(LoginPageObjects.assessementUnitpopup())) {
            Browser.click(LoginPageObjects.assessementUnitpopup());
        }
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

    /**
     * Click on filter button
     */
    public static void clickFilterBtn() throws Exception {

        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.filterBtnOnViewAllContractsPage(), 20);
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
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.cancelBTN(), 20);
        click(CommonMethodsPageObjects.cancelBTN());
    }

    public static void checkTheContractsPage() throws Exception {
        waitUntilVisibilityOfElement(TerminateContractPageObjects.theContractPage(), 20);
        Assert.assertTrue(isElementDisabled(TerminateContractPageObjects.theContractPage()));
        logger.addScreenshot("User Navigate Back To 'العقود' Page");
    }

    public static void clickOnBackButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.backBTN(), 20);
        click(CommonMethodsPageObjects.backBTN());
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
     * @param list - option to be selected
     * @param element - list object
     * */
    public static void selectFromList(String list, By element) throws Exception {
        waitUntilVisibilityOfElement(element, 30);
        List<WebElement> selectList = driver.findElements(element);
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(list)) {
                listName.click();
            }
        }
    }

    public static void clickRejectReasonRadioButtons() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectReasonRadioBTNs(), 30);
        List<WebElement> selectList = driver.findElements(CommonMethodsPageObjects.rejectReasonRadioBTNs());
        for (WebElement listName : selectList) {
            listName.click();
            listName.isSelected();
        }
    }

    public static void assertContractsAreAppearing() {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.ContractsList(), 40);
        boolean status = isElementDisplayed(CommonMethodsPageObjects.ContractsList());
        Assert.assertTrue(status, "Contracts are not displayed");
        logger.addScreenshot("All available contracts are displayed");
    }

    /**
     * Verify the searched contract is displayed on Contracts page
     * @param contractNumber - Contract to be searched
     * */
    public static void verifySearchedContractIsDisplayed(String contractNumber) {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.ContractNumberOfSearchedContract(), 40);
        if (isElementDisplayed(CommonMethodsPageObjects.ContractNumberOfSearchedContract())) {
            String actualContractNumber = getText(CommonMethodsPageObjects.ContractNumberOfSearchedContract());
            boolean status = false;
            if (contractNumber.contains(actualContractNumber)) {
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
     * @param requestNumber - Request to be searched
     * */
    public static void verifySearchedRequestIsDisplayed(String requestNumber) throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.requestNumberOfSearchedRequest(), 40);
        if (isElementDisplayed(CommonMethodsPageObjects.requestNumberOfSearchedRequest())) {
            String actualRequestNumber = getText(CommonMethodsPageObjects.requestNumberOfSearchedRequest());
            boolean status = false;
            if (requestNumber.contains(actualRequestNumber)) {
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
        click(CommonMethodsPageObjects.KebabMenuButton());
    }
    /**
     * Select an option from Kebab menu
     * @param option - Option to be selected
     * */
    public static void KebabMenuOptions(String option) {
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
        Assert.assertTrue(status, option + "option is not available");
        logger.addScreenshot("");
    }

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
        Assert.assertEquals(actual, expected);
        logger.addScreenshot("The message is displayed");
    }

    public static void verifyValueIsEntered(String value, By element) {
        waitUntilVisibilityOfElement(element, 40);
        String val = getWebElement(element).getAttribute("value");
        Assert.assertTrue(val.contains(value), "Value has been entered");
    }

    public static void verifyValueIsNotEntered(String value, By element) {
        waitUntilVisibilityOfElement(element, 40);
        String val = getWebElement(element).getAttribute("value");
        Assert.assertFalse(val.contains(value), "Value is not entered");
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

    /** validate any error message under input/text fields
     * @param errorMsg - Message to be validated
     * @param element - Message object
     * */
    public static void errorMessage(String errorMsg, By element) {
        waitUntilVisibilityOfElement(element, 40);
        String text = getText(element);
        String[] textSplit = text.split(" ");
        text = textSplit[0] + textSplit[1] + textSplit[2];
        boolean status = false;
        if (text.contains(errorMsg)) {
            status = true;
        }
        Assert.assertTrue(status, errorMsg + "error message is not same/displayed");
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
        Assert.assertTrue(status, amount + "total amount is not the same");
        logger.addScreenshot("");
    }

    /**
     * Validate equivalent date is displayed in Hijri/Gregorian format under date input field
     * @param dateType - Format of date (Hijri or Gregorian)
     * */
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
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Assert.assertTrue(isElementEnabled(CommonMethodsPageObjects.confirmAndSubmitBTN()));
        logger.addScreenshot("The (تأكيد وإرسال) button is enabled/clickable");
    }

    public static void UploadAttachment(String filePath, By element) {
        waitUntilVisibilityOfElement(element, 40);
        String path = System.getProperty("user.dir") + filePath;
        setText(element, path);
    }

    public static void checkOneAttachmentIsAdded(By element) {
        waitUntilVisibilityOfElement(element, 40);
        Assert.assertTrue(isElementDisplayed(element), "Attachment is not uploaded");
    }

    public static void checkMultipleAttachmentsAreAdded(By element) {
        waitUntilVisibilityOfElement(element, 40);
        List<WebElement> elements = getWebElements(element);
        int index = 1;
        for (WebElement ele : elements) {
            Assert.assertTrue(ele.isDisplayed(), "Attachment " + index + " is displayed");
        }
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

    public static void getFilesNames(String folderPath) {
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
                    logger.addScreenshot("The file has been downloaded " + file.getName());
                }
            }
        }
    }

    public static void ClickOnAttachment(String action) {
        emptyDownloadsFolder(System.getProperty("user.dir") + "\\src\\main\\downloads");
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.ViewOrDownloadAttachmentButtons(), 40);
        List<WebElement> buttons = getWebElements(CommonMethodsPageObjects.ViewOrDownloadAttachmentButtons());
        if (action.equalsIgnoreCase("view")) {
            buttons.get(1).click();
        } else if (action.equalsIgnoreCase("download")) {
            buttons.get(2).click();
        }
    }


    public static String getURLOfCurrentTab() {
        return driver.getCurrentUrl();
    }

    public static void verifyNewTabIsOpened() {
        String newURL = driver.getCurrentUrl();
        String oldURL = getURLOfCurrentTab();
        boolean status = false;
        if (!(newURL.equalsIgnoreCase(oldURL))) {
            status = true;
        }
        Assert.assertTrue(status, "New tab is opened");
        logger.addScreenshot("Attachment is displayed in new browser tab");
    }


    public static void verifyAttachmentHasBeenDownloaded() {
        getFilesNames(System.getProperty("user.dir") + "\\src\\main\\downloads");
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
        Assert.assertEquals(actualStatus, expectedStatus, "Status does not match");
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
        if (expectedStatus.contains(actualStatus)) {
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
     * @param contractNumber - searched contract
     * */
    public static void verifySearchedContractIsDisplayedForInvoices(String contractNumber) throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.allContractInvoices(), 40);
        if (isElementDisplayed(CommonMethodsPageObjects.allContractInvoices())) {
            String actualContractNumber = getText(CommonMethodsPageObjects.allContractInvoices());
            boolean status = false;
            if (contractNumber.contains(actualContractNumber)) {
                status = true;
            }
            Assert.assertTrue(status, "Searched Contract is not displayed");
            logger.addScreenshot("Searched contract is displayed");
        } else {
            logger.addScreenshot("Searched contract is not displayed");
        }
    }

    public static void clickOnNewInvoice() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.newContractInvoice(), 20);
        click(CommonMethodsPageObjects.newContractInvoice());
        waitForSeconds(1);
        logger.addScreenshot("New invoice details is displayed");
    }


    public static void newAmountForContractInvoice(String amount) throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.newAmountForContractInvoice(), 40);
        String text = getText(CommonMethodsPageObjects.newAmountForContractInvoice());
        String newAmount = text.split(" ")[2];
        boolean status = false;

        if (newAmount.contains(amount)) {
            status = true;

        }
        Assert.assertTrue(status, amount + "the amount is not the same");
        logger.addScreenshot("");
    }

    public static void clickOnRemoveButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.removeBTN(), 20);
        click(CommonMethodsPageObjects.removeBTN());
    }

    public static void clickOnConfirmAndSubmitButton() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        click(CommonMethodsPageObjects.confirmAndSubmitBTN());
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
        logger.addScreenshot("Province is selected");

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
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.ratingBTN(), 30);
        List<WebElement> rateList = driver.findElements(CommonMethodsPageObjects.ratingBTN());
        for (WebElement rate : rateList) {
            rate.click();

        }
    }

    public static void verifyTheSurveyIsSuccessfullySubmittedDisplayed() throws Exception {
        waitUntilVisibilityOfElement(CommonMethodsPageObjects.successfulSurveySubmittedMsg(), 20);
        Assert.assertTrue(isElementDisplayed(CommonMethodsPageObjects.successfulSurveySubmittedMsg()));
        logger.addScreenshot("The 'تم تقديم الرد' is displayed");
    }

    public static void clickOnYesRadioButtons() throws Exception {
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
     * @param errorMsg - message needs to be validated
     * */
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
        waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.identityVerificationBTN(), 40 );
        Assert.assertTrue(isElementDisabled(SendContractForApprovalPageObjects.identityVerificationBTN()), "Button is not disabled");
        logger.addScreenshot("");
    }

    /**
    * Verify the contract status of different versions
    * @param contractStatus - Expected status
    * */
    public static void verifyStatusOfContract(String contractStatus) throws Exception {
        executeJSScroll(450);
        waitForSeconds(1);
        boolean status = false;
        String actualStatus = "";
        waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        List <WebElement> list = getWebElements(AddResidentialContractPageObjects.contractStatus());
        for (WebElement w : list){
            actualStatus = w.getText();
            if (actualStatus.contains(contractStatus)){
                status = true;
                break;
            }
        }
        Assert.assertTrue(status, "Contract status is not same");
        waitForSeconds(1);
        logger.addScreenshot("Contract Status : " + actualStatus);
    }
}
