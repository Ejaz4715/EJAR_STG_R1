package sa.ejar.web.pages;

import com.testcrew.manager.PDFReportManager;
import com.testcrew.web.Browser;
import org.checkerframework.common.value.qual.ArrayLenRange;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.TerminateContractPageObjects;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.precondition.LoginPageObjects;

import java.util.List;

import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.logger;

public class CommonMethodsPage {

    /**
     * Click on Contracts Button
     */
    public void clickContractsBtn() throws Exception {
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
    public void selectViewAllContractsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.viewAllContractsButton(), 20);
        Browser.click(LoginPageObjects.viewAllContractsButton());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Navigate to View All Contracts page");
    }

    /**
     * Click on filter button
     */
    public void clickFilterBtnOnViewAllContractsPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.filterBtnOnViewAllContractsPage(), 20);
        Browser.click(AddResidentialContractPageObjects.filterBtnOnViewAllContractsPage());
        logger.addScreenshot("Clicked on filter button");
    }


    /**
     * Click on filter button
     *
     * @param contractNumber - Contract number
     */
    public void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
        Browser.waitUntilPresenceOfElement(AddResidentialContractPageObjects.searchContractNumberInputField(), 20);
//        Browser.waitForSeconds(3);
        Browser.setText(AddResidentialContractPageObjects.searchContractNumberInputField(), contractNumber);
        Browser.waitForSeconds(1);
        logger.addScreenshot("Entered Contract Number in search input field");
    }

    public void clickOnNextButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        Browser.click(CommonMethodsPageObjects.nextBTN());
    }

    public void clickOnCancelButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.cancelBTN(), 20);
        Browser.click(CommonMethodsPageObjects.cancelBTN());
    }

    public void checkTheContractsPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.theContractPage(),20);
        Assert.assertTrue(Browser.isElementDisabled(TerminateContractPageObjects.theContractPage()));
        PDFReportManager.logger.addScreenshot("User Navigate Back To 'العقود' Page");
    }

    public void clickOnBackButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.backBTN(), 20);
        Browser.click(CommonMethodsPageObjects.backBTN());
    }

    public void clickOnConfirmButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmBTN(), 20);
        Browser.click(CommonMethodsPageObjects.confirmBTN());
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

    public void assertContractsAreAppearing() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ContractsList(), 40);
        boolean status = Browser.isElementDisplayed(CommonMethodsPageObjects.ContractsList());
        Assert.assertTrue(status, "Contracts are not displayed");
        logger.addScreenshot("All available contracts are displayed");
    }

    public void verifySearchedContractIsDisplayed(String expectedContractNumber) {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ContractNumberOfSearchedContract(), 40);
        if (Browser.isElementDisplayed(CommonMethodsPageObjects.ContractNumberOfSearchedContract())) {
            String actualContractNumber = Browser.getText(CommonMethodsPageObjects.ContractsList());
            Assert.assertEquals(actualContractNumber, expectedContractNumber, "Searched Contract is not displayed");
            logger.addScreenshot("Searched contract is displayed");
        } else {
            logger.addScreenshot("Searched contract is not displayed");
        }
    }


    public void clickOnKebabMenuButton() {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuButton(), 40);
        Browser.click(CommonMethodsPageObjects.KebabMenuButton());
    }

    public void KebabMenuOptions(String option) {
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

    public void ClickOnKebabMenuOption(String option) {
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

    public void TerminateOptions(String option) {
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

    public void ClickOnTerminateOption(String option) {
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

    public void verifyPopUpAlertAfterCancelIsDisplayed(String expected) {
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
     * @param reqYear - required year (Negative value to get to any previous years and positive for future)
     * @param reqMonth - required month (Negative value to get to any previous months and positive for future)
     * @param reqDay - required day (Negative value to get to any previous days and positive for future)
     * */
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
    public void errorMessage(String errorMsg, By element) {
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
    public void totalAmount(String errorMsg, By element) {
        Browser.waitUntilVisibilityOfElement(element, 40);
        String text = Browser.getText(element);
        String[] textSplit = text.split(" ");
        text = textSplit[1];
        boolean status = false;

        if (text.contains(errorMsg)) {
            status = true;

        }
        Assert.assertTrue(status, errorMsg + "total amount is not the same");
        logger.addScreenshot("");
    }

    public void verifyHijriDateIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.hijriDate(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.hijriDate()));
        logger.addScreenshot("Equivalent Hijri date is displayed");
    }

    public void verifyTheNextButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.nextBTN()));
        logger.addScreenshot("The (التالي) button is not enabled/clickable");
    }
}
