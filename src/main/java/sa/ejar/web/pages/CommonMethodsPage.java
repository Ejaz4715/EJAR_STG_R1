package sa.ejar.web.pages;

import com.testcrew.manager.PDFReportManager;
import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.RentalIncidentsPageObjects;
import sa.ejar.web.objects.TerminateContractPageObjects;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.precondition.LoginPageObjects;

import java.io.File;
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
//            Browser.waitForSeconds(3);
            Browser.click(LoginPageObjects.assessementUnitpopup());
        }
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.contractButton(), 60);
//        Browser.waitForSeconds(5);
        Browser.click(LoginPageObjects.contractButton());
//        Browser.waitForSeconds(2);
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
//            Browser.waitForSeconds(3);
            Browser.click(LoginPageObjects.assessementUnitpopup());
        }
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.theRequestTab(), 60);
//        Browser.waitForSeconds(5);
        Browser.click(CommonMethodsPageObjects.theRequestTab());
//        Browser.waitForSeconds(2);
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


    /**
     * Click on filter button
     *
     * @param contractNumber - Contract number
     */
    public static void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
        Browser.waitUntilPresenceOfElement(AddResidentialContractPageObjects.searchContractNumberInputField(), 20);
//        Browser.waitForSeconds(3);
        Browser.setText(AddResidentialContractPageObjects.searchContractNumberInputField(), contractNumber);
        Browser.waitForSeconds(1);
        logger.addScreenshot("Entered Contract Number in search input field");
    }

    public static void enterRequestNumberInRequestSearchInputField(String requestNumber) throws Exception {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.requestNumberTXT(), 20);
//        Browser.waitForSeconds(3);
        Browser.setText(CommonMethodsPageObjects.requestNumberTXT(), requestNumber);
        Browser.waitForSeconds(1);
        logger.addScreenshot("Entered Request Number in search input field");
    }

    public static void clickOnNextButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        Browser.click(CommonMethodsPageObjects.nextBTN());
    }

    public static void clickOnCancelButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.cancelBTN(), 20);
        Browser.click(CommonMethodsPageObjects.cancelBTN());
    }

    public static void checkTheContractsPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.theContractPage(), 20);
        Assert.assertTrue(Browser.isElementDisabled(TerminateContractPageObjects.theContractPage()));
        PDFReportManager.logger.addScreenshot("User Navigate Back To 'العقود' Page");
    }

    public static void clickOnBackButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.backBTN(), 20);
        Browser.click(CommonMethodsPageObjects.backBTN());
    }

    public static void clickOnConfirmButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmBTN(), 20);
        Browser.click(CommonMethodsPageObjects.confirmBTN());
    }

    public static void clickOnCloseButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.closeBTN(), 20);
        Browser.click(CommonMethodsPageObjects.closeBTN());
    }
    public static void clickOnEditButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.editBTN(), 20);
        Browser.click(CommonMethodsPageObjects.editBTN());
    }
    public static void clickOnDeleteIconButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.deleteIconBTN(), 20);
        Browser.click(CommonMethodsPageObjects.deleteIconBTN());
    }

    public static void selectFromList(String list, By element) throws Exception {
        Browser.waitUntilVisibilityOfElement(element, 30);
        List<WebElement> selectList = driver.findElements(element);
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(list)) {
                listName.click();


            }
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
        boolean status = Browser.isElementDisplayed(CommonMethodsPageObjects.ContractsList());
        Assert.assertTrue(status, "Contracts are not displayed");
        logger.addScreenshot("All available contracts are displayed");
    }

    public static void verifySearchedContractIsDisplayed(String expectedContractNumber) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ContractNumberOfSearchedContract(), 40);
        if (Browser.isElementDisplayed(CommonMethodsPageObjects.ContractNumberOfSearchedContract())) {
            String actualContractNumber = Browser.getText(CommonMethodsPageObjects.ContractNumberOfSearchedContract());
            boolean status = false;
            if (expectedContractNumber.contains(actualContractNumber)) {
                status = true;
            }
            Assert.assertTrue(status, "Searched Contract is not displayed");
            logger.addScreenshot("Searched contract is displayed");
        } else {
            logger.addScreenshot("Searched contract is not displayed");
        }
    }

    public static void verifySearchedRequestIsDisplayed(String expectedRequestNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.requestNumberOfSearchedRequest(), 40);
        if (Browser.isElementDisplayed(CommonMethodsPageObjects.requestNumberOfSearchedRequest())) {
            String actualRequestNumber = Browser.getText(CommonMethodsPageObjects.requestNumberOfSearchedRequest());
            boolean status = false;
            if (expectedRequestNumber.contains(actualRequestNumber)) {
                status = true;
            }
            Assert.assertTrue(status, "Searched Request is not displayed");
            logger.addScreenshot("Searched Request is displayed");
        } else {
            logger.addScreenshot("Searched Request is not displayed");
        }
    }


    public static void clickOnKebabMenuButton() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuButton(), 40);
        Browser.click(CommonMethodsPageObjects.KebabMenuButton());
    }

    public static void KebabMenuOptions(String option) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuOptions(), 40);
        List<WebElement> kebabOptions = Browser.getWebElements(CommonMethodsPageObjects.KebabMenuOptions());
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
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuOptions(), 40);
        List<WebElement> kebabOptions = Browser.getWebElements(CommonMethodsPageObjects.KebabMenuOptions());
        for (WebElement opt : kebabOptions) {
            String optText = opt.getText();
            if (optText.contains(option)) {
                opt.click();
                break;
            }
        }
    }

    public static void TerminateOptions(String option) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.TerminateOptions(), 40);
        List<WebElement> kebabOptions = Browser.getWebElements(CommonMethodsPageObjects.TerminateOptions());
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
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.TerminateOptions(), 40);
        List<WebElement> kebabOptions = Browser.getWebElements(CommonMethodsPageObjects.TerminateOptions());
        for (WebElement opt : kebabOptions) {
            String optText = opt.getText();
            if (optText.contains(option)) {
                opt.click();
                break;
            }
        }
    }
    public static void ClickOnViewContractOption(String option) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.viewContractOptionBTN(), 40);
        List<WebElement> kebabOptions = Browser.getWebElements(CommonMethodsPageObjects.viewContractOptionBTN());
        for (WebElement opt : kebabOptions) {
            String optText = opt.getText();
            if (optText.contains(option)) {
                opt.click();
                break;
            }
        }
    }

    public static void ClickOnAcceptTerminateOption(String option) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.acceptTerminationOptionBTN(), 40);
        List<WebElement> kebabOptions = Browser.getWebElements(CommonMethodsPageObjects.acceptTerminationOptionBTN());
        for (WebElement opt : kebabOptions) {
            String optText = opt.getText();
            if (optText.contains(option)) {
                opt.click();
                break;
            }
        }
    }

    public static void verifyPopUpAlertAfterCancelIsDisplayed(String expected) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.PopUpAlertAfterCancel(), 40);
        String actual = Browser.getText(CommonMethodsPageObjects.PopUpAlertAfterCancel());
        Assert.assertEquals(actual, expected);
        logger.addScreenshot("The message is displayed");
    }

    public static void verifyValueIsEntered(String value, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String val = Browser.getWebElement(element).getAttribute("value");
        Assert.assertTrue(val.contains(value), "Value has been entered");
    }


    /**
     * Method to get current date and to change the date to future and past
     *
     * @param reqYear  - required year (Negative value to get to any previous years and positive for future)
     * @param reqMonth - required month (Negative value to get to any previous months and positive for future)
     * @param reqDay   - required day (Negative value to get to any previous days and positive for future)
     */
    public static String getCurrentDate(int reqYear, int reqMonth, int reqDay) {
        String currentDate = java.time.LocalDate.now().toString();
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

    public static void errorMessage(String errorMsg, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String text = Browser.getText(element);
        String[] textSplit = text.split(" ");
        text = textSplit[0] + textSplit[1] + textSplit[2];
        boolean status = false;
        if (text.contains(errorMsg)) {
            status = true;

        }
        Assert.assertTrue(status, errorMsg + "error message is not the same");
        logger.addScreenshot("");
    }


    public static void totalAmount(String amount, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String text = Browser.getText(element);
        String[] textSplit = text.split(" ");
        text = textSplit[0];
        boolean status = false;

        if (text.contains(amount)) {
            status = true;

        }
        Assert.assertTrue(status, amount + "total amount is not the same");
        logger.addScreenshot("");
    }

    public static void verifyHijriDateIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.hijriDate(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.hijriDate()));
        logger.addScreenshot("Equivalent Hijri date is displayed");
    }

    public static void verifyTheNextButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.nextBTN()));
        logger.addScreenshot("The (التالي) button is not enabled/clickable");
    }

    public static void verifyTheConfirmAndSubmitButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.confirmAndSubmitBTN()));
        logger.addScreenshot("The (تأكيد وإرسال) button is not enabled/clickable");
    }

    public static void verifyTheConfirmAndSubmitButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Assert.assertTrue(Browser.isElementEnabled(CommonMethodsPageObjects.confirmAndSubmitBTN()));
        logger.addScreenshot("The (تأكيد وإرسال) button is enabled/clickable");
    }

    public static void UploadAttachment(String filePath, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String path = System.getProperty("user.dir") + filePath;
        Browser.setText(element, path);
    }

    public static void checkOneAttachmentIsAdded(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        Assert.assertTrue(Browser.isElementDisplayed(element), "Attachment is not uploaded");
    }

    public static void checkMultipleAttachmentsAreAdded(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        List<WebElement> elements = Browser.getWebElements(element);
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
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ViewOrDownloadAttachmentButtons(), 40);
        List<WebElement> buttons = Browser.getWebElements(CommonMethodsPageObjects.ViewOrDownloadAttachmentButtons());
        if (action.equalsIgnoreCase("view")) {
            buttons.get(1).click();
        } else if (action.equalsIgnoreCase("download")) {
            buttons.get(1).click();
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
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.SuccessPopUPTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.SuccessPopUPTitle()), "Success Pop up is not displayed");
        logger.addScreenshot("");
    }

    public static void verifyConfirmPopUpIsDisplayedAfterApproveRequest() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ConfirmationPopUpTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.ConfirmationPopUpTitle()), "Confirmation Pop up is not displayed");
        logger.addScreenshot("");
    }

    public static void verifyConfirmPopUpIsDisplayedAfterRejectRequest() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ReasonOfRejectPopUpTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.ReasonOfRejectPopUpTitle()), "Reason of rejection Pop up is not displayed");
        logger.addScreenshot("");
    }



    public static String getRequestNumber(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String text = Browser.getText(element);
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
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.RequestPageTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.RequestPageTitle()), requestType + "request page is not displayed");
        logger.addScreenshot(requestType + "request page is displayed");
    }

    public static void checkRequestStatus(String expectedStatus) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.RequestStatus(), 40);
        String actualStatus = Browser.getText(CommonMethodsPageObjects.RequestStatus());
        Assert.assertEquals(actualStatus, expectedStatus, "Status does not match");
        logger.addScreenshot("Request status is: " + actualStatus);
    }

    public static void clickOnApproveBTN() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ApproveBTN(), 40);
        Browser.click(CommonMethodsPageObjects.ApproveBTN());
    }

    public static void clickOnSubmitForApprovalBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.submitForApprovalBTN(), 40);
        Browser.click(CommonMethodsPageObjects.submitForApprovalBTN());
    }

    public static void clickOnRejectBTN() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.RejectBTN(), 40 );
        Browser.click(CommonMethodsPageObjects.RejectBTN());
    }

    public static void verifyNewInvoiceDateIsSameAsEnteredInRequest(String expectedDate) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.PaymentDueDateOnInvoice(), 40);
        String actualDate = Browser.getText(CommonMethodsPageObjects.PaymentDueDateOnInvoice());
        String [] splitDate = actualDate.split("-");
        actualDate = splitDate[0] +  splitDate[1] + splitDate[2];
        Assert.assertEquals(actualDate, expectedDate, "Dates are not same ");
        logger.addScreenshot("");
    }

    public static void verifyInvoiceStatus(String invoice, String expectedStatus, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String actualStatus = Browser.getText(element);
        boolean status = false;
        if (expectedStatus.contains(actualStatus)){
            status = true;
        }
        Assert.assertTrue(status, invoice + " has different status");
        logger.addScreenshot(invoice + " has status " + actualStatus);
    }
    public static void verifyReviewTheContractPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.reviewTheContractPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.reviewTheContractPage()));
        logger.addScreenshot("User Navigate To 'مراجعة العقد' Page");
    }

    public static void clickOnRejectButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectBTN(), 20);
        Browser.click(CommonMethodsPageObjects.rejectBTN());

    }

    public static void verifyRejectReasonPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectReasonText(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.rejectReasonText()));
        logger.addScreenshot("User Navigate To 'لماذا تريد الرفض؟' Page");
    }

    public static void enterRejectionReasonNote(String rejectReason) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectionReasonNote(), 20);
        Browser.setText(CommonMethodsPageObjects.rejectionReasonNote(), rejectReason);

    }

    public static void verifyRejectionReasonNoteHasBeenEntered(String enteredRejectReason) throws Exception {
        WebElement reason = getWebElement(CommonMethodsPageObjects.rejectionReasonNote());
        String text = reason.getAttribute("value");
        Assert.assertEquals(text, enteredRejectReason);
        logger.addScreenshot("The rejection reason has been entered");

    }

    public static void verifyRejectionSubmittedPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectionSubmittedMessage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.rejectionSubmittedMessage()));
        logger.addScreenshot("User Navigate To 'تم تقديم الرفض' Page");
    }
    public static void clickOnTheFinancialTabButton() throws Exception {
             Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 60);
        if (Browser.isElementPresent(LoginPageObjects.assessementUnitpopup())) {
//            Browser.waitForSeconds(3);
            Browser.click(LoginPageObjects.assessementUnitpopup());
        }
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.financialTab(), 60);
//        Browser.waitForSeconds(5);
        Browser.click(CommonMethodsPageObjects.financialTab());
//        Browser.waitForSeconds(2);
        logger.addScreenshot("Clicked on Financial button");
    }

    public static void clickOnViewAllInvoicesButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.allInvoicesBTN(), 20);
        Browser.click(CommonMethodsPageObjects.allInvoicesBTN());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Navigate to View All Invoices page");
    }

    public static void verifyContractsInvoicesIsPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.contractsInvoices(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.contractsInvoices()));
        logger.addScreenshot("User Navigate To 'فواتير العقود' Page");
    }

    public static void enterContractNumber(String contractNum) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.contractsNumber(), 20);
        Browser.setText(CommonMethodsPageObjects.contractsNumber(), contractNum);

    }

    public static void verifySearchedContractIsDisplayedForInvoices(String expectedContractNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.allContractInvoices(), 40);
        if (Browser.isElementDisplayed(CommonMethodsPageObjects.allContractInvoices())) {
            String actualContractNumber = Browser.getText(CommonMethodsPageObjects.allContractInvoices());
            boolean status = false;
            if (expectedContractNumber.contains(actualContractNumber)) {
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
        Browser.click(CommonMethodsPageObjects.newContractInvoice());
        Browser.waitForSeconds(1);
        logger.addScreenshot("New invoice details is displayed");
    }


    public static void newAmountForContractInvoice(String amount) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.newAmountForContractInvoice(), 40);
        String text = Browser.getText(CommonMethodsPageObjects.newAmountForContractInvoice());
        String newAmount = text.split(" ")[2];
        boolean status = false;

        if (newAmount.contains(amount)) {
            status = true;

        }
        Assert.assertTrue(status, amount + "the amount is not the same");
        logger.addScreenshot("");
    }
    public static void clickOnRemoveButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.removeBTN(), 20);
        Browser.click(CommonMethodsPageObjects.removeBTN());
    }
    public static void clickOnConfirmAndSubmitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Browser.click(CommonMethodsPageObjects.confirmAndSubmitBTN());
    }
    public static void clickOnDisclaimerCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.disclaimerCheckbox(), 20);
        Browser.click(CommonMethodsPageObjects.disclaimerCheckbox());
    }

    public static void clickOnSubmitButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.submitBTN(), 20);
        Browser.click(CommonMethodsPageObjects.submitBTN());
    }

    public static void verifyTheSurveyIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ratingBTN(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.ratingBTN()));
        logger.addScreenshot("The 'التقييم والاستبيان' is displayed");
    }

    public static void clickRatingButtons() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ratingBTN(), 30);
        List<WebElement> rateList = driver.findElements(CommonMethodsPageObjects.ratingBTN());
        for (WebElement rate : rateList) {
            rate.click();

        }
    }

    public static void verifyTheSurveyIsSuccessfullySubmittedDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.successfulSurveySubmittedMsg(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.successfulSurveySubmittedMsg()));
        logger.addScreenshot("The 'تم تقديم الرد' is displayed");
    }

    public static void clickOnYesRadioButtons() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.yesRadioBTN(), 30);
        List<WebElement> selectList = driver.findElements(CommonMethodsPageObjects.yesRadioBTN());
        for (WebElement listName : selectList) {
            listName.click();
        }
    }

    public static void verifyConfirmButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.confirmBTN()));
        logger.addScreenshot("The (تأكيد) button is disabled");
    }
    public static void verifyNextButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.nextBTN()));
        logger.addScreenshot("The (التالي) button is disabled");
    }

    public static void enterCRNumberInputField(String crNumber) throws Exception {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.CRNumberInput(), 20);
        Browser.setText(CommonMethodsPageObjects.CRNumberInput(), crNumber);
        logger.addScreenshot("Enter CR number input field");
    }

    public static void errorCRMessage(String errorMsg) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.errorCRNumberMsg(), 40);
        String text = Browser.getText(CommonMethodsPageObjects.errorCRNumberMsg());
        boolean status = false;
        if (text.contains(errorMsg)) {
            status = true;

        }
        Assert.assertTrue(status, errorMsg + "error message is not the same");
        logger.addScreenshot("");
    }
}
