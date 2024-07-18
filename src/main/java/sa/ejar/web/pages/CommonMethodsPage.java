package sa.ejar.web.pages;

import com.testcrew.manager.TestDataManager;
import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import sa.ejar.web.objects.*;
import sa.ejar.web.objects.ChangeLessor_LessorRepPageObjects;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.SendContractForApprovalPageObjects;
import sa.ejar.web.objects.TerminateContractPageObjects;
import sa.ejar.web.objects.pre_condition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.pre_condition.LoginPageObjects;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import sa.ejar.web.pages.pre_condition.LoginPage;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;
import java.util.Set;
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

    public static void clickOnRevokeContractRequestButton() {
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
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.requestNumberTXT(), 20);
        Browser.setText(CommonMethodsPageObjects.requestNumberTXT(), requestNumber);
        Browser.waitForSeconds(1);
        logger.addScreenshot("Entered Request Number in search input field");
    }

    public static void clickOnNextButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        Browser.waitUntilElementToBeClickable(CommonMethodsPageObjects.nextBTN(), 20);
        Browser.click(CommonMethodsPageObjects.nextBTN());
    }

    public static void verifyNextButtonIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        Assert.assertTrue(Browser.isElementEnabled(CommonMethodsPageObjects.nextBTN()), "Button is not enabled");
        logger.addScreenshot("");
    }

    public static void clickOnCancelButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.cancelBTN(), 40);
        Browser.waitForSeconds(2);
        Browser.click(CommonMethodsPageObjects.cancelBTN());
    }

    public static void clickOnCancelPopUpButton() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.cancelPopUpBTN(), 20);
        Browser.click(CommonMethodsPageObjects.cancelPopUpBTN());
    }

    public static void clickOnConfirmPopUpButton() {
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
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmBTN(), 20);
        Browser.click(CommonMethodsPageObjects.confirmBTN());
//        Browser.waitForSeconds(2);
//        if(Browser.isElementPresent(CommonMethodsPageObjects.confirmBTN())) {
//            Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmBTN(), 20);
//            Browser.click(CommonMethodsPageObjects.confirmBTN());
//        }
    }

    public static void clickOnCloseButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.closeBTN(), 20);
        Browser.click(CommonMethodsPageObjects.closeBTN());
    }

    public static void clickOnEditButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.editBTN(), 20);
        Browser.click(CommonMethodsPageObjects.editBTN());
    }

    public static void clickOnDeleteIconButton() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.deleteIconBTN(), 20);
        Browser.click(CommonMethodsPageObjects.deleteIconBTN());
    }

    /**
     * Select an option from the list
     *
     * @param option  - option to be selected
     * @param element - list object
     */
    public static void selectFromList(String option, By element) throws Exception {
        Browser.waitUntilVisibilityOfElement(element, 30);
        List<WebElement> selectList = Browser.getWebElements(element);
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
        Browser.waitForSeconds(3);
        if (Browser.isElementPresent(SendContractForApprovalPageObjects.sendForApprovalCheckboxes())) {
            Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.sendForApprovalCheckboxes(), 30);
            List<WebElement> checkBoxes = Browser.getWebElements(SendContractForApprovalPageObjects.sendForApprovalCheckboxes());
            Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
            for (WebElement checkbox : checkBoxes) {
                WebDriverWait wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(100));
                wait.until(ExpectedConditions.visibilityOf(checkbox));
                wait.until(ExpectedConditions.elementToBeClickable(checkbox));
                checkbox.click();
            }
        }
    }

    public static void clickRejectReasonRadioButtons() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectReasonRadioBTNs(), 30);
        List<WebElement> selectList = Browser.getWebElements(CommonMethodsPageObjects.rejectReasonRadioBTNs());
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

    /**
     * Verify the searched contract is displayed on Contracts page
     *
     * @param expectedContractNumber - Contract number to be validated
     */
    public static void verifySearchedContractIsDisplayed(String expectedContractNumber) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ContractNumberOfSearchedContract(), 40);
        if (Browser.isElementDisplayed(CommonMethodsPageObjects.ContractNumberOfSearchedContract())) {
            String actualContractNumber = Browser.getText(CommonMethodsPageObjects.ContractNumberOfSearchedContract());
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
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.requestNumberOfSearchedRequest(), 40);
        if (Browser.isElementDisplayed(CommonMethodsPageObjects.requestNumberOfSearchedRequest())) {
            String actualRequestNumber = Browser.getText(CommonMethodsPageObjects.requestNumberOfSearchedRequest());
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
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuButton(), 40);
        Browser.waitForSeconds(2);
        Browser.click(CommonMethodsPageObjects.KebabMenuButton());
    }

    /**
     * Validate an option is displayed in Kebab menu
     *
     * @param option - Option to be validated
     */
    public static void KebabMenuOptions(String option) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuOptions(), 40);
        CommonMethodsPage.scrollToElement(CommonMethodsPageObjects.KebabMenuOptions());
        Browser.waitForSeconds(1);
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

    public static void checkKebabMenuOptionsIsNotVisible(String option) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuOptions(), 40);
        CommonMethodsPage.scrollToElement(CommonMethodsPageObjects.KebabMenuOptions());
        Browser.waitForSeconds(1);
        List<WebElement> kebabOptions = Browser.getWebElements(CommonMethodsPageObjects.KebabMenuOptions());
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
     * Validate an option is NOT displayed in Kebab menu
     *
     * @param option - Option to be validated
     */
    public static void VerifyKebabMenuOptionIsNotPresent(String option) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuOptions(), 40);
        CommonMethodsPage.scrollToElement(CommonMethodsPageObjects.KebabMenuOptions());
        Browser.waitForSeconds(1);
        List<WebElement> kebabOptions = Browser.getWebElements(CommonMethodsPageObjects.KebabMenuOptions());
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
     * Select an option from Kebab menu
     *
     * @param option - Option to be selected
     */
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

    public static void ClickOnViewContractOption(String option) {
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

    public static void ClickOnAcceptTerminateOption(String option) {
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
        Browser.waitUntilVisibilityOfElement(element, 40);
        String val = Browser.getWebElement(element).getAttribute("value");
        Assert.assertTrue(val.contains(value), "Value is not entered");
    }

    /**
     * Method to check if the value is NOT entered in Input Field
     *
     * @param value   - Value to be validated
     * @param element - Locator of Input Field
     */
    public static void verifyValueIsNotEntered(String value, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String val = Browser.getWebElement(element).getAttribute("value");
        Assert.assertFalse(val.contains(value), "Value is entered");
    }

    /**
     * Method to validate the displayed value
     *
     * @param value   - Value to be validated
     * @param element - Locator of Input Field
     */
    public static void verifyValueIsDisplayed(String value, By element) {
        Browser.waitUntilVisibilityOfElement(element,40);
        String val = Browser.getWebElement(element).getText();
        Assert.assertTrue(val.contains(value), "Actual value (" + val + ") does not match with expected value (" + value + ")");
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
        LocalDate currentDate = LocalDate.now();
        if (reqYear > 0) {
            currentDate = currentDate.plusYears(reqYear);
        } else if (reqYear < 0) {
            reqYear = Math.abs(reqYear);
            currentDate = currentDate.minusYears(reqYear);
        }
        if (reqMonth > 0) {
            currentDate = currentDate.plusMonths(reqMonth);
        } else if (reqMonth < 0) {
            reqMonth = Math.abs(reqMonth);
            currentDate = currentDate.minusMonths(reqMonth);
        }
        if (reqDay > 0) {
            currentDate = currentDate.plusDays(reqDay);
        } else if (reqDay < 0) {
            reqDay = Math.abs(reqDay);
            currentDate = currentDate.minusDays(reqDay);
        }
        String year = String.valueOf(currentDate.getYear());
        String month = String.format("%02d", currentDate.getMonthValue());
        String day = String.format("%02d", currentDate.getDayOfMonth());
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
        String text = Browser.getText(element);
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
     * @param element  - Message Locator
     */
    public static void errorMessageFoAttachments(String errorMsg, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String text = Browser.getText(element);
        boolean status = false;
        if (text.contains(errorMsg)) {
            status = true;
        }
        Assert.assertTrue(status, errorMsg + " error message is not same/displayed");
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

        Assert.assertTrue(status, "Expected (" + text + ") value is not the same as actual (" + amount + ") value");
        logger.addScreenshot("");
    }

    /**
     * Validate equivalent date is displayed in Hijri/Gregorian format under date input field
     *
     * @param dateType - Format of date (Hijri or Gregorian)
     */
    public static void verifyEquivalentDateIsDisplayed(String dateType) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.equivalentDateHint(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.equivalentDateHint()));
        logger.addScreenshot("Equivalent " + dateType + " date is displayed");
    }

    public static void verifyTheNextButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.nextBTN()));
        logger.addScreenshot("The (التالي) button is not enabled/clickable");
    }

    public static void verifyTheConfirmAndSubmitButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.confirmAndSubmitBTN()));
        logger.addScreenshot("The (تأكيد وإرسال) button is not enabled/clickable");
    }

    public static void verifyTheConfirmAndSubmitButtonIsEnabled() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Browser.waitUntilElementToBeClickable(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Assert.assertTrue(Browser.isElementEnabled(CommonMethodsPageObjects.confirmAndSubmitBTN()));
        logger.addScreenshot("The (تأكيد وإرسال) button is enabled/clickable");
    }

    public static void UploadAttachment(String filePath, By element) {
        String path = System.getProperty("user.dir") + filePath;
        WebElement ele = Browser.getWebElement(element);
        ele.sendKeys(path);
    }

    public static void checkOneAttachmentIsAdded(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        Assert.assertTrue(Browser.isElementDisplayed(element), "Attachment is not uploaded");
    }

    public static void checkOneAttachmentNotAdded(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        Assert.assertTrue(Browser.isElementDisplayed(element), "Attachment is uploaded");
    }

    public static void checkMultipleAttachmentsAreAdded(By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        List<WebElement> elements = Browser.getWebElements(element);
        int index = 1;
        for (WebElement ele : elements) {
            Assert.assertTrue(ele.isDisplayed(), "Attachment " + index + " is displayed");
        }
    }


    public static void ClickOnAttachment(String action) throws AWTException {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ViewOrDownloadAttachmentButtons(), 40);
        Browser.executeJSScrollIntoView(RevokeContractPageObjects.AttachmentIcon());
        List<WebElement> buttons = Browser.getWebElements(CommonMethodsPageObjects.ViewOrDownloadAttachmentButtons());
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
        boolean b = false;
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
                    b = file.delete();
                }
            }
        }
        System.out.println("File is not deleted -> "+b);
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
        int size = 0;
        Set<String> tabs = Browser.driver.getWindowHandles();
        String[] arrayTabs = tabs.toArray(new String[0]);
        while (size < 2) {
            tabs = Browser.driver.getWindowHandles();
            arrayTabs = tabs.toArray(new String[0]);
            size = arrayTabs.length;
        }
        Browser.driver.switchTo().window(arrayTabs[0]);
        String oldURL = Browser.driver.getCurrentUrl();
        Browser.driver.switchTo().window(arrayTabs[1]);
        String newURL = Browser.driver.getCurrentUrl();
        boolean status = false;
        if (!(newURL.equalsIgnoreCase(oldURL))) {
            status = true;
        }
        Assert.assertTrue(status, "New tab is not opened");
        logger.addScreenshot("Attachment is displayed in new browser tab");
    }

    public static void closeNewTab() {
        int size = 0;
        Set<String> tabs = Browser.driver.getWindowHandles();
        String[] arrayTabs = tabs.toArray(new String[0]);
        while (size < 2) {
            tabs = Browser.driver.getWindowHandles();
            arrayTabs = tabs.toArray(new String[0]);
            size = arrayTabs.length;
        }
        Browser.driver.switchTo().window(arrayTabs[1]);
        Browser.driver.close();
        Browser.driver.switchTo().window(arrayTabs[0]);
        Browser.waitForSeconds(2);
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
        return newText.split(" ")[1];
    }

    public static void getReqNumBo() {
        String request = CommonMethodsPage.getRequestNumber(CommonMethodsPageObjects.requestNumber());
        TestDataManager.addDependantGlobalTestData("Terminate", "ReqNumBo", request);
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
        Assert.assertTrue(actualStatus.contains(expectedStatus), "Status does not match");
        logger.addScreenshot("Request status is: " + actualStatus);
    }

    public static void clickOnApproveBTN() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ApproveBTN(), 40);
        Browser.click(CommonMethodsPageObjects.ApproveBTN());
    }

    public static void clickOnSubmitForApprovalBTN() {
        Browser.waitUntilPresenceOfElement(AddResidentialContractPageObjects.StepsList(), 50);
        List<WebElement> list = Browser.getWebElements(AddResidentialContractPageObjects.StepsList());
        while (list.size() < 5) {
            list = Browser.getWebElements(AddResidentialContractPageObjects.StepsList());
            Browser.waitForSeconds(1);
        }
        while (Browser.isElementPresent(ManualRenewalPageObjects.WarningClass())) {
            Browser.waitForSeconds(1);
        }
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.submitForApprovalBTN(), 40);
        Browser.click(CommonMethodsPageObjects.submitForApprovalBTN());
    }

    public static void clickOnRejectBTN() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.RejectBTN(), 40);
        Browser.click(CommonMethodsPageObjects.RejectBTN());
    }

    public static void clickOnVerifyBTN() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.verifyBTN(), 40);
        Browser.click(CommonMethodsPageObjects.verifyBTN());
    }

    public static void verifyNewInvoiceDateIsSameAsEnteredInRequest(String expectedDate) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.PaymentDueDateOnInvoice(), 40);
        String actualDate = Browser.getText(CommonMethodsPageObjects.PaymentDueDateOnInvoice());
        String[] splitDate = actualDate.split("-");
        actualDate = splitDate[0] + splitDate[1] + splitDate[2];
        Assert.assertEquals(actualDate, expectedDate, "Dates are not same ");
        logger.addScreenshot("");
    }

    public static void verifyInvoiceStatus(String invoice, String expectedStatus, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String actualStatus = Browser.getText(element);
        boolean status = false;
        if (actualStatus.contains(expectedStatus)) {
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

    public static void verifyRejectReasonPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectReasonText(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.rejectReasonText()));
        logger.addScreenshot("User Navigate To 'لماذا تريد الرفض؟' Page");
    }

    public static void enterRejectionReasonNote(String rejectReason) throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectionReasonNote(), 20);
        Browser.setText(CommonMethodsPageObjects.rejectionReasonNote(), rejectReason);

    }

    public static void verifyRejectionReasonNoteHasBeenEntered(String enteredRejectReason) {
        WebElement reason = Browser.getWebElement(CommonMethodsPageObjects.rejectionReasonNote());
        String text = reason.getAttribute("value");
        Assert.assertEquals(text, enteredRejectReason);
        logger.addScreenshot("The rejection reason has been entered");

    }

    public static void verifyRejectionSubmittedPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.rejectionSubmittedMessage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.rejectionSubmittedMessage()));
        logger.addScreenshot("User Navigate To 'تم تقديم الرفض' Page");
    }

    public static void clickOnTheFinancialTabButton() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 60);
        if (Browser.isElementPresent(LoginPageObjects.assessementUnitpopup())) {
            Browser.click(LoginPageObjects.assessementUnitpopup());
        }
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.financialTab(), 60);
        Browser.click(CommonMethodsPageObjects.financialTab());
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
        String text = Browser.getText(CommonMethodsPageObjects.newAmountForContractInvoice());
        String newAmount = text.split(" ")[2];
        boolean status = false;
        if (newAmount.contains(amount)) {
            status = true;
        }
        Assert.assertTrue(status, "The actual amount is" + newAmount + " and expected amount is " + amount);
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
            Assert.assertTrue(status, UserRoleList + " User Role is not available");
            new LoginPage().closeExploreEjarPopUp();
        }
    }

    public static void clickOnRemoveButton() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.removeBTN(), 20);
        Browser.click(CommonMethodsPageObjects.removeBTN());
    }

    public static void clickOnConfirmAndSubmitButton() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Browser.waitUntilElementToBeClickable(CommonMethodsPageObjects.confirmAndSubmitBTN(), 20);
        Browser.click(CommonMethodsPageObjects.confirmAndSubmitBTN());
    }

    public static void clickOnDisclaimerCheckbox() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.disclaimerCheckbox(), 20);
        Browser.click(CommonMethodsPageObjects.disclaimerCheckbox());
    }

    public static void enterPhoneNumber(String phoneNumber) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.PhoneNumberInputField(), 40);
        Browser.clearText(CommonMethodsPageObjects.PhoneNumberInputField());
        Browser.setText(CommonMethodsPageObjects.PhoneNumberInputField(), phoneNumber);
    }

    public static void enterEmail(String email) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.EmailInputField(), 40);
        Browser.clearText(CommonMethodsPageObjects.EmailInputField());
        Browser.setText(CommonMethodsPageObjects.EmailInputField(), email);
    }

    public static void clickOnRegionDropdownMenu() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.RegionDropdown(), 40);
        Browser.click(CommonMethodsPageObjects.RegionDropdown());
    }

    public static void selectRegion(String tenantRegion) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.RegionDropdownOptions(), 40);
        Browser.selectDropdownByValue(CommonMethodsPageObjects.RegionDropdownOptions(), tenantRegion);
        logger.addScreenshot("Region is selected");
    }

    public static void clickOnCityDropdown() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.CityDropdown(), 40);
        Browser.click(CommonMethodsPageObjects.CityDropdown());
    }

    public static void SelectCity(String tenantCity) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.CitySearchBar(), 40);
        Browser.setText(CommonMethodsPageObjects.CitySearchBar(), tenantCity);
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.CityName(), 40);
        Browser.click(CommonMethodsPageObjects.CityName());
        logger.addScreenshot(tenantCity + " city is selected");
    }

    public static void enterPostalCode(String postalCode) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.PostalCodeInput(), 40);
        Browser.clearText(CommonMethodsPageObjects.PostalCodeInput());
        Browser.setText(CommonMethodsPageObjects.PostalCodeInput(), postalCode);
        logger.addScreenshot(postalCode + " postal code is entered");
    }

    public static void enterStreetName(String street) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.StreetNameInput(), 40);
        Browser.clearText(CommonMethodsPageObjects.StreetNameInput());
        Browser.setText(CommonMethodsPageObjects.StreetNameInput(), street);
        logger.addScreenshot(street + " street name is entered");
    }

    public static void enterBuildingNumber(String buildingNum) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.BuildingNumberInput(), 40);
        Browser.clearText(CommonMethodsPageObjects.BuildingNumberInput());
        Browser.setText(CommonMethodsPageObjects.BuildingNumberInput(), buildingNum);
        logger.addScreenshot(buildingNum + " street name is entered");

    }

    public static void enterAdditionalNumber(String additionalNum) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.AdditionalNumberInput(), 40);
        Browser.clearText(CommonMethodsPageObjects.AdditionalNumberInput());
        Browser.setText(CommonMethodsPageObjects.AdditionalNumberInput(), additionalNum);
        logger.addScreenshot(additionalNum + " street name is entered");
    }

    public static void clickOnSubmitButton() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.submitBTN(), 40);
        Browser.click(CommonMethodsPageObjects.submitBTN());
    }

    public static void verifyTheSurveyIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ratingBTN(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.ratingBTN()));
        logger.addScreenshot("The 'التقييم والاستبيان' is displayed");
    }

    public static void clickRatingButtons() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ratingBTN(), 100);
        if (Browser.isElementPresent(CommonMethodsPageObjects.newRadioBTN())) {
            Browser.click(CommonMethodsPageObjects.newRadioBTN());
        }

        List<WebElement> rateList = Browser.driver.findElements(CommonMethodsPageObjects.ratingBTN());
        for (WebElement rate : rateList) {
            rate.click();
        }
    }

    public static void verifyTheSurveyIsSuccessfullySubmittedDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.successfulSurveySubmittedMsg(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.successfulSurveySubmittedMsg()));
        logger.addScreenshot("The 'تم تقديم الرد' is displayed");
    }

    public static void clickOnYesRadioButtons() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.yesRadioBTN(), 30);
        List<WebElement> selectList = Browser.driver.findElements(CommonMethodsPageObjects.yesRadioBTN());
        for (WebElement listName : selectList) {
            listName.click();
        }
    }

    public static void verifyConfirmButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.confirmBTN()));
        logger.addScreenshot("The (تأكيد) button is disabled");
    }

    public static void verifyNextButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.nextBTN()));
        logger.addScreenshot("The (التالي) button is disabled");
    }

    public static void verifyCloseButtonIsNotDisplayed() {
        boolean status = false;
        if (Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.closeBTN()) ||
                Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.closeBTN2()) ||
                Browser.isElementDisplayed(ChangeLessor_LessorRepPageObjects.closeBTN3())) {
            status = true;
        }
        Assert.assertFalse(status, "Buttons is displayed");
        logger.addScreenshot("");
    }

    public static void enterCRNumberInputField(String crNumber) {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.CRNumberInput(), 20);
        Browser.setText(CommonMethodsPageObjects.CRNumberInput(), crNumber);
        logger.addScreenshot("Enter CR number input field");
    }

    /**
     * Validate error message
     *
     * @param errorMsg - message needs to be validated
     */
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

    public static void verifyOTPPopIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getVerificationCode(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(LoginPageObjects.getVerificationCode()));
        logger.addScreenshot("OTP pop up is displayed");
    }

    public static void checkVerifyIdentityButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.identityVerificationBTN(), 40);
        Assert.assertTrue(Browser.isElementDisabled(SendContractForApprovalPageObjects.identityVerificationBTN()), "Button is not disabled");
        logger.addScreenshot("");
    }

    public static void checkVerifyIdentityButtonIsPresent() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.identityVerificationBTN(), 10);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.identityVerificationBTN()), "Button is not present");
        logger.addScreenshot("VerifyIdentityButtonFromOTPPopupIsNotPresent");
    }

    public static void clickOnVerifyIdentityButton() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.identityVerificationBTN(), 10);
        Assert.assertTrue(Browser.isElementDisplayed(SendContractForApprovalPageObjects.identityVerificationBTN()), "Button is not present");
        Browser.click(SendContractForApprovalPageObjects.identityVerificationBTN());
        logger.addScreenshot("");
    }

    /**
     * Verify the contract status of different versions
     *
     * @param contractStatus - Expected status
     */
    public static void verifyStatusOfContract(String contractStatus) throws Exception {
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(1);
        boolean status = false;
        String actualStatus = "";
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        List<WebElement> list = Browser.getWebElements(AddResidentialContractPageObjects.contractStatus());
        for (WebElement w : list) {
            actualStatus = w.getText();
            if (actualStatus.contains(contractStatus)) {
                status = true;
                break;
            }
        }
        Assert.assertTrue(status, "Contract status is not same");
        Browser.waitForSeconds(1);
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
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.sendForApprovalBTN(), 40);
        Assert.assertTrue(Browser.isElementEnabled(SendContractForApprovalPageObjects.sendForApprovalBTN()), "Button is not enabled");
        logger.addScreenshot("");
    }

    public static void checkSendForApprovalButtonIsNotVisible() throws Exception {
        Browser.waitForSeconds(4);
        Assert.assertFalse(Browser.isElementPresent(SendContractForApprovalPageObjects.sendForApprovalBTN()), "Button is not enabled");
        logger.addScreenshot("");
    }

    public static void SendForApprovalBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.sendForApprovalBTN(), 40);
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


    public static void scrollToElement(By element) {
        if (Browser.isElementPresent(element)) {
            Browser.executeJSScrollIntoView(element);
        }
        Browser.waitForSeconds(2);
    }


    public static void verifyContractStatus(String expectedStatus) throws Exception {
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(1);
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.contractStatus(), 35);
        Browser.waitForSeconds(2);
        boolean status = false;
        String actualStatus = Browser.getWebElement(ManualRenewalPageObjects.contractStatus()).getText();
        if (actualStatus.contains(expectedStatus)) {
            status = true;
        }
        Assert.assertTrue(status, "The actual status of contract is (" +actualStatus+") and expected ("+expectedStatus);
        Browser.logger.addScreenshot("");
    }

    public static void PDFValidation(String ContractNumber, String Message) throws IOException {
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
        String text = Browser.getText(element);
        return text.split("#")[1];
    }

    public static String setDownloadPath() {
        String fileName = "test_attachment";
        return System.getProperty("user.dir") + "\\src\\main\\resources\\downloads\\" + fileName;
    }

    /**
     * Select an option from Kebab menu
     *
     * @param option - Option to be selected
     */
    public static void KebabMenuOptionNotDisplayed(String option) {
        Browser.waitForSeconds(2);
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
        Assert.assertFalse(status, option + "option is available");
        logger.addScreenshot("");
    }

    /**
     * Give true if expect the invalid otp error message to be present
     *
     * @param isPresent - give true if you expect the invalid OTP message to be present
     */
    public static void verifyInvalidOTPErrorMessagePresentStatus(boolean isPresent) {
        Assert.assertEquals(Browser.isElementDisplayed(CommonMethodsPageObjects.invalidOTPErrorMsg()), isPresent, "Invalid OTP Error Message Status is not expected.");
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

    public static void verifyOwnershipDocumentIsSelected(String selectedOwnershipDocument) {
        WebElement requesterCategory = Browser.getWebElement(CommonMethodsPageObjects.ownershipDocumentDDL());
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
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.ownershipDocumentNumberTXT(), 20);
        Browser.setText(CommonMethodsPageObjects.ownershipDocumentNumberTXT(), ownershipDocumentNumber);
    }


    public static void enterReleaseDateInputField(String releaseDate) {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.releaseDateTXT(), 20);
        Browser.setText(CommonMethodsPageObjects.releaseDateTXT(), releaseDate);
    }

    public static void verifyOwnerIdInputFieldIsNotDisplayed() {
        Assert.assertTrue(Browser.isElementNotPresent(CommonMethodsPageObjects.ownerIdTXT()), "Input filed is not displayed");
        logger.addScreenshot("");
    }

    public static void verifyLegalDocumentTypeNameInputFieldIsNotDisplayed() {
        Assert.assertTrue(Browser.isElementNotPresent(CommonMethodsPageObjects.legalDocumentTypeNameTXT()), "Input filed is not displayed");
        logger.addScreenshot("");
    }


    public static void verifyTheSelectedOwnershipDocumentInfoIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.selectedOwnershipDocumentInfo(), 40);
        Assert.assertTrue(Browser.isElementPresent(CommonMethodsPageObjects.selectedOwnershipDocumentInfo()), "ownership document info is displayed");
        logger.addScreenshot("");
    }

    public static void verifyAddNewOwnershipDocumentAlertMessageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.addNewOwnershipDocumentAlertMsg(), 40);
        Assert.assertTrue(Browser.isElementPresent(CommonMethodsPageObjects.addNewOwnershipDocumentAlertMsg()));
        logger.addScreenshot("");
    }

    public static void selectExistingOwnershipDocument() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.selectedOwnershipDocumentInfo(), 20);
        Browser.click(CommonMethodsPageObjects.selectedOwnershipDocumentInfo());
    }

    public static void verifyTheExistingOwnershipDocumentIsSelected() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.selectedOwnershipDocumentInfo(), 20);
        Assert.assertTrue(Browser.isElementSelected(CommonMethodsPageObjects.selectedOwnershipDocumentInfoRadioBTN()));
        logger.addScreenshot("");
    }

    public static void verifyAddPropertyButtonIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.addPropertyBTN(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.addPropertyBTN()));
        logger.addScreenshot("");
    }

    public static void verifySelectUnitPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.selectUnitPage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.selectUnitPage()));
        logger.addScreenshot("");
    }

    public static void clickOnDeleteIconButtonForAttachment() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.deleteIconForAttachment(), 20);
        Browser.click(CommonMethodsPageObjects.deleteIconForAttachment());
    }

    public static void verifyTheAttachmentIsRemoved() {
        Browser.waitUntilInvisibilityOfElement(CommonMethodsPageObjects.removedAttachment(), 40);
        Assert.assertTrue(Browser.isElementNotPresent(CommonMethodsPageObjects.removedAttachment()));
        logger.addScreenshot("");
    }

    public static void clickOnSendRequestButton() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.sendRequestBTN(), 20);
        Browser.waitForSeconds(1);
        Browser.click(CommonMethodsPageObjects.sendRequestBTN());
    }

    public static void verifySendRequestButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.sendRequestBTN(), 40);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.sendRequestBTN()));
        logger.addScreenshot("");
    }


    public static void enterOwnershipReferenceInSearchField(String ownershipNumber) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ownershipReferenceSearchField(), 40);
        Browser.setText(CommonMethodsPageObjects.ownershipReferenceSearchField(), ownershipNumber);
    }

    public static void clickOnDownloadContractCopy() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.DownloadContractCopyButton(), 40);
        Browser.click(CommonMethodsPageObjects.DownloadContractCopyButton());
        Browser.waitForSeconds(5);
    }

    public static void verifySearchedContractIsNotDisplayed() {
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(1);
        String actualResult = Browser.getText(CommonMethodsPageObjects.ContractResultOfSearchedContract());
        Assert.assertTrue(actualResult.contains("لم يتم العثور على عقود! يرجى إضافة عقود جديدة."));
        logger.addScreenshot("No Result Found");

    }


    public static void verifyTheRejectButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.rejectTheContractBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(SendContractForApprovalPageObjects.rejectTheContractBTN()));
        logger.addScreenshot("The (رفض العقد) button is not enabled/clickable");
    }

    public static void verifyTotalNoOfContractsCardIsVisible() {
        Assert.assertTrue(Browser.isElementPresent(By.xpath("//app-card-value//p[text()='إجمالي عدد العقود']")));
        logger.addScreenshot("Total Number of Contracts Card Is Visible");
        Browser.waitForSeconds(1);
    }


    public static void verifyTheVerifyIdentityButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(SendContractForApprovalPageObjects.identityVerificationBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(SendContractForApprovalPageObjects.identityVerificationBTN()));
        logger.addScreenshot("The ( رفض العقد ) button is not enabled/clickable");
        Browser.waitForSeconds(1);
    }


      public static void contractInformationCheckbox() throws  Exception {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.contractInfoLabel(),20);
        Browser.click(CommonMethodsPageObjects.contractInfoLabel());
        Browser.click(CommonMethodsPageObjects.contractInformationCheckbox());
        logger.addScreenshot("Contract Information Checkbox is clickable");
    }

    public static void lessorCheckbox() {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.lessorLabel(), 20);
        Browser.click(CommonMethodsPageObjects.lessorLabel());
        Browser.executeJSScroll(600);
        Browser.click(CommonMethodsPageObjects.lessorCheckboxes1());
        Browser.click(CommonMethodsPageObjects.lessorCheckboxes2());
        logger.addScreenshot("Lessor Checkboxes are clickable");
    }

    public static void tenantsCheckbox() {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.tenantLabel(), 20);
        Browser.click(CommonMethodsPageObjects.tenantLabel());
        Browser.click(CommonMethodsPageObjects.tenantCheckbox());
        logger.addScreenshot("Tenant Checkbox is clickable");
    }

    public static void propertyDetailsCheckbox() {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.propertyLabel(), 50);
        Browser.click(CommonMethodsPageObjects.propertyLabel());
        Browser.executeJSScroll(800);
        Browser.waitForSeconds(10);
        Browser.click(CommonMethodsPageObjects.propertyDetailsCheckbox());
        logger.addScreenshot("Property Details Checkbox is clickable");
    }

    public static void unitDetailsCheckbox() {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.unitLabel(), 40);
        Browser.click(CommonMethodsPageObjects.unitLabel());
        Browser.executeJSScroll(600);
        Browser.click(CommonMethodsPageObjects.unitDetailsCheckbox());
        logger.addScreenshot("Unit Details Checkbox is clickable");
    }

    public static void financialTermsCheckbox() {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.financialLabel(), 20);
        Browser.click(CommonMethodsPageObjects.financialLabel());
        Browser.click(CommonMethodsPageObjects.financialTermsCheckbox());
        logger.addScreenshot("Financial Terms Checkbox is clickable");
    }

    public static void termsConditionsCheckbox() {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.termsConditionsLabel(), 20);
        Browser.click(CommonMethodsPageObjects.termsConditionsLabel());
        Browser.click(CommonMethodsPageObjects.termsConditionsCheckbox());
        logger.addScreenshot("Terms & Conditions Checkbox is clickable");
    }

    public static void capturedDocumentsCheckbox() {
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.documentsLabel(), 20);
        Browser.click(CommonMethodsPageObjects.documentsLabel());
        Browser.executeJSScroll(300);
        Browser.click(CommonMethodsPageObjects.capturedDocumentsCheckbox());
        logger.addScreenshot("Captured Documents Checkbox is clickable");
    }

    public static void assertEditButtonNotVisible() {
        Assert.assertFalse(Browser.isElementPresent(CommonMethodsPageObjects.editBTN()));
    }

    public static void neviagteToManageOffice() throws Exception {
        Browser.click(CommonMethodsPageObjects.RoleName());
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.manageAccountButton(), 20);
        Browser.click(LoginPageObjects.manageAccountButton());
    }

    public static void verifyAccountSettingsPageIsDisplayed() {
        Assert.assertTrue(Browser.isElementPresent(CommonMethodsPageObjects.AccountSettingsHeading()));
        logger.addScreenshot("'Account Settings' page is displayed");
    }

    public static void selectWalletFromAccountSettings() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.wallet(), 20);
        Browser.click(LoginPageObjects.wallet());
        logger.addScreenshot("Wallet details is displayed");
    }

    public static void inputContractNumberInContractSearchField(String Contract) {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.ContractNumberInput(), 20);
        Browser.setText(LoginPageObjects.ContractNumberInput(), Contract);
        logger.addScreenshot("Input Contract Number");
    }

    public static void selectDescription() {
        Browser.waitForSeconds(1);
        Browser.selectDropdownByVisibleText(LoginPageObjects.descriptionDropDownList(), "مبلغ الضمان المحجوز");
    }

    public static void verifySecurityAmountReservedIsDisplayed() {
        Browser.waitForSeconds(1);
        CommonMethodsPage.scrollToElement(LoginPageObjects.SecurityAmountReserved());
        Browser.waitForSeconds(1);
        Assert.assertTrue(Browser.isElementPresent(LoginPageObjects.SecurityAmountReserved()));
        logger.addScreenshot("The 'مبلغ الضمان المحجوز' is displayed");
    }

    public static void navigateToViewUnitForms() {
        Browser.click(CommonMethodsPageObjects.UnitForms());
        logger.addScreenshot("");
        Browser.click(CommonMethodsPageObjects.ViewUnitForms());
        logger.addScreenshot("Neviagte to 'نماذج الوحدة' page");
    }

    public static void verifySubmitRequestIsDisabled() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitRequestInChangeTenantCommercialActivity(), 20);
        Assert.assertTrue(Browser.isElementDisabled(ChangeTenantActivityPageObjects.submitRequestInChangeTenantCommercialActivity()));
        logger.addScreenshot("The (تقديم الطلب) button is disabled");
        Browser.waitForSeconds(1);
    }
}
