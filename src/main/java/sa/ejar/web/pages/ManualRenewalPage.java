package sa.ejar.web.pages;

import com.testcrew.base.WebBaseTest;
import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.ManualRenewalPageObjects;
import java.util.List;
import java.util.Map;
import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.*;
import static sa.ejar.web.pages.CommonMethodsPage.clickOnKebabMenuButton;

public class ManualRenewalPage {

    public void verifyReadyForRenewalCardIsVisible() {
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.readyForRenewalCard(), 20);
        Assert.assertTrue(Browser.isElementPresent(ManualRenewalPageObjects.readyForRenewalCard()));
        WebBaseTest.logger.addScreenshot("Ready For Renewal Card Is Visible");
        Browser.waitForSeconds(2);
    }

    public void navigateToReadyForRenewalPage() {
        Browser.click(ManualRenewalPageObjects.readyForRenewalCard());
        WebBaseTest.logger.addScreenshot("Display Contract that Ready for Renewal");
        Browser.waitForSeconds(2);
    }


    public void ClickManualRenewalCard() {
        Browser.waitUntilPresenceOfElement(ManualRenewalPageObjects.clickOnReadyForRenewalCard(), 20);
        Browser.click(ManualRenewalPageObjects.clickOnReadyForRenewalCard());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Click on Manual Renewal Card");
    }

    public void getCurrentContractNumber() {
        Browser.waitForSeconds(1);
        String val = getWebElement(ManualRenewalPageObjects.getCurrentContractNumber()).getAttribute("value");
        TestDataManager.addDependantGlobalTestData("ManualRenewalContract", "Old_Contract", val);
        TestDataManager.writeDependantGlobalTestData("ManualRenewalContract");
        System.out.println("Current Contract Number : " + val);
    }

    public void getNewContractNumber() {
        Browser.waitForSeconds(1);
        String val = Browser.getWebElement(ManualRenewalPageObjects.getNewContractNumber()).getText().replace("#","");
        TestDataManager.addDependantGlobalTestData("ManualRenewalContract", "New_Contract", val);
        TestDataManager.writeDependantGlobalTestData("ManualRenewalContract");
        System.out.println("New Contract Number : " + val);
    }

    public void verifyNewContractAreGenerate(Map<String, String> data) {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        String CurrentContract = data.get("Old_Contract");
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.getNewContractNumber(),30);
        String NewContract = Browser.getText(ManualRenewalPageObjects.getNewContractNumber());
        Assert.assertFalse(CurrentContract.contains(NewContract));
        logger.addScreenshot("");
    }

    public void getLatestRenewalContract() {
        Browser.waitForSeconds(1);
        if (Browser.isElementPresent(ManualRenewalPageObjects.clickOnLatestKebabMenuButton())) {
            Browser.click(ManualRenewalPageObjects.clickOnLatestKebabMenuButton());

        } else {
            clickOnKebabMenuButton();
        }
    }

    public void verifyIssueDateIsVisible() {
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.issueDate(),20);
        String Date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        String IssueDate = Browser.getText(ManualRenewalPageObjects.issueDate());
        String s = IssueDate.split(" ")[0];
        String T = s.replace("-", "");
        System.out.println(T);
        Assert.assertEquals(Date, T);
        logger.addScreenshot("Issue Date : " +IssueDate);
    }

    public void contractTimeLineStatus(String Status) {
        boolean status = false;
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.getListOfContractTimeLineStatus(), 20);
        List<WebElement> ContractTimeLineStatusList = Browser.driver.findElements(ManualRenewalPageObjects.getListOfContractTimeLineStatus());
        for (WebElement y : ContractTimeLineStatusList) {
            String getContractStatus = y.getText();
            if (getContractStatus.contains(Status)) {
                status = true;
                break;
            }
        }
        if (status) {
            System.out.println("Contract Status : " + Status + " is Found.");
        } else {
            System.out.println("Contract Status : " + Status + " Not Found.");
        }
    }


    public void verifySubmitContractForRenewalPageIsDisplayed() {
        Browser.waitUntilPresenceOfElement(ManualRenewalPageObjects.sendContractForRenewal(), 20);
        String SendContractForRenewalTitle = Browser.getText(ManualRenewalPageObjects.sendContractForRenewal());
        Assert.assertTrue(SendContractForRenewalTitle.contains("إرسال العقد للتجديد"));
        logger.addScreenshot("Remains in the same إرسال العقد للتجديد page");
    }

    public void verifyContractRenewalStepsPageIsDisplayed() {
        Browser.waitUntilPresenceOfElement(ManualRenewalPageObjects.renewalStepsPage(), 30);
        Browser.waitForSeconds(2);
        String SendContractForRenewalTitle = Browser.getText(ManualRenewalPageObjects.renewalStepsPage());
        Assert.assertTrue(SendContractForRenewalTitle.contains("خطوات تجديد العقد"));
        logger.addScreenshot("Contract Renewal Steps Page Is Displayed");
    }

    public void clickOnCancelPopUpButton() {
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.cancelBTNPopUp(), 20);
        Browser.click(ManualRenewalPageObjects.cancelBTNPopUp());
        logger.addScreenshot("");
    }

    public void clickOnConfirmPopUpButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.confirmBTNPopUp(), 20);
        Browser.click(ManualRenewalPageObjects.confirmBTNPopUp());
    }

    public void payingFeeThroughLessor() {
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.payFeeThroughLessor(), 20);
        String PayingFee = Browser.getText(ManualRenewalPageObjects.payFeeThroughLessor());
        Assert.assertTrue(PayingFee.contains("المؤجر سوف يدفع رسوم شبكة إيجار"));
        logger.addScreenshot("المؤجر سوف يدفع رسوم شبكة إيجار");
    }

    public void EjarRegistrationFeesIsVisible() {
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.EjarRegistrationFees(), 20);
        String PayingFee = Browser.getText(ManualRenewalPageObjects.EjarRegistrationFees());
        Assert.assertTrue(PayingFee.contains("رسوم التسجيل في إيجار"));
        logger.addScreenshot("رسوم التسجيل في إيجار");
    }

    public void verifySendContractForRenewalPopUpIsVisible(Map<String, String> data) {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.sendContractForRenewalMsg(), 30);
        String PopUpMessage1 = Browser.getText(ManualRenewalPageObjects.sendContractForRenewalMsg());
        Assert.assertTrue(PopUpMessage1.contains("تم إرسال طلب تجديد العقد"));
        String PopUpMessage2 = Browser.getText(ManualRenewalPageObjects.getContractFromPopUpUMsg());
        Assert.assertTrue(PopUpMessage2.substring(19,31).contains(data.get("New_Contract")));
        Assert.assertTrue(PopUpMessage2.contains("للتجديد بنجاح"));
        logger.addScreenshot("");
    }

    public void verifySelectedContractIsNotVisibleInReadyForRenewalContracts(String SelectedContract) {
        boolean status = true;
        if (!(Browser.isElementPresent(ManualRenewalPageObjects.NoContractFoundMsg()))) {
            if (Browser.isElementPresent(ManualRenewalPageObjects.selectPageSizeFifty())) {
                Browser.selectDropdownByVisibleText(ManualRenewalPageObjects.selectPageSizeFifty(), "50");
                Browser.waitForSeconds(5);
            }
            while (status) {
                List<WebElement> ContractNumber = driver.findElements(ManualRenewalPageObjects.getAllContractNumberTxt());
                for (WebElement ContractNum : ContractNumber) {
                    Browser.waitForSeconds(1);
                    if (ContractNum.getText().contains(SelectedContract)) {
                        logger.addScreenshot("Contract is found");
                        status = false;
                        break;
                    }
                }
                if (Browser.isElementPresent(ManualRenewalPageObjects.ClickContractNextArrow())) {
                    if (Browser.isElementEnabled(ManualRenewalPageObjects.ClickContractNextArrow())) {
                        Browser.click(ManualRenewalPageObjects.ClickContractNextArrow());
                    }
                } else {
                    break;
                }
            }
        } else {
            logger.addScreenshot("Selected Contract Is Not Visible in ready for renewal contracts");
        }
        Assert.assertTrue(status, "Contract is found");
    }


    public void verifyNewRenewalContractIsVisibleInTotalNoOfContracts(String NewContract) {
        boolean status = false;
        if (!(Browser.isElementPresent(ManualRenewalPageObjects.NoContractFoundMsg()))) {
            if (Browser.isElementPresent(ManualRenewalPageObjects.selectPageSizeFifty())) {
                Browser.selectDropdownByVisibleText(ManualRenewalPageObjects.selectPageSizeFifty(), "50");
                Browser.waitForSeconds(5);
            }
            while (!status) {
                Browser.waitForSeconds(2);
                List<WebElement> ContractNumber = driver.findElements(ManualRenewalPageObjects.getAllContractNumberTxt());
                for (WebElement ContractNum : ContractNumber) {
                    if (ContractNum.getText().contains(NewContract)) {
                        logger.addScreenshot("Contract is found");
                        status = true;
                        break;
                    }
                }
                if (Browser.isElementPresent(ManualRenewalPageObjects.ClickContractNextArrow())) {
                    if (Browser.isElementEnabled(ManualRenewalPageObjects.ClickContractNextArrow())) {
                        Browser.click(ManualRenewalPageObjects.ClickContractNextArrow());
                    }
                } else {
                    break;
                }
            }
        } else {
            logger.addScreenshot("Selected Contract Is Not Visible in ready for renewal contracts");
        }
        Assert.assertTrue(status, "Contract is not found");
    }

    public void verifySelectedContractIsVisibleInReadyForRenewalContracts(String SelectedContract) {
        boolean status = false;
        if (!(Browser.isElementPresent(ManualRenewalPageObjects.NoContractFoundMsg()))) {
            if (Browser.isElementPresent(ManualRenewalPageObjects.selectPageSizeFifty())) {
                Browser.selectDropdownByVisibleText(ManualRenewalPageObjects.selectPageSizeFifty(), "50");
                Browser.waitForSeconds(5);
            }
            while (!status) {
                List<WebElement> ContractNumber = driver.findElements(ManualRenewalPageObjects.getAllContractNumberTxt());
                for (WebElement ContractNum : ContractNumber) {
                    if (ContractNum.getText().contains(SelectedContract)) {
                        logger.addScreenshot("Contract is found");
                        status = true;
                        break;
                    }
                }
                if (Browser.isElementPresent(ManualRenewalPageObjects.ClickContractNextArrow())) {
                    if (Browser.isElementEnabled(ManualRenewalPageObjects.ClickContractNextArrow())) {
                        Browser.click(ManualRenewalPageObjects.ClickContractNextArrow());
                        Browser.waitForSeconds(5);
                    }
                } else {
                    break;
                }
            }
        } else {
            logger.addScreenshot("Selected Contract Is Not Visible in ready for renewal contracts");
        }
        Assert.assertTrue(status, "Contract is not found");
    }

    public void verifyTotalNumberOfContractInReadyForRenewalCard() {
        boolean status = false;
        int Count = 0;
        int ManualRenewalCardNumber = Integer.parseInt(Browser.getText(ManualRenewalPageObjects.getTotalNoOfContractInReadyForRenewalCard()));
        if (!(Browser.isElementPresent(ManualRenewalPageObjects.NoContractFoundMsg()))) {
            if (Browser.isElementPresent(ManualRenewalPageObjects.selectPageSizeFifty())) {
                Browser.selectDropdownByVisibleText(ManualRenewalPageObjects.selectPageSizeFifty(), "50");
                Browser.waitForSeconds(10);
            }
            while (!status) {
                List<WebElement> ContractNumber = driver.findElements(ManualRenewalPageObjects.getCurrentTotalOfContracts());
                Count += ContractNumber.size();
                System.out.println(Count);
                if (Browser.isElementPresent(ManualRenewalPageObjects.ClickContractNextArrow())) {
                    if (Browser.isElementEnabled(ManualRenewalPageObjects.ClickContractNextArrow())) {
                        Browser.click(ManualRenewalPageObjects.ClickContractNextArrow());
                        Browser.waitForSeconds(5);
                    } else {
                        status = true;
                        break;
                    }
                } else {
                    status = true;
                    break;
                }
            }
        }
        Assert.assertTrue(status);
        Assert.assertEquals(ManualRenewalCardNumber, Count, "Total contracts number is not matching");
        logger.addScreenshot("Total contracts number is : " + ManualRenewalCardNumber);
    }

    public void AssessmentOfManualRenewalAsLessor(String Selection) {
        Browser.waitForSeconds(3);
        //if Good
        if (Selection.equals("Good")) {
            Browser.click(ManualRenewalPageObjects.newOption());
            Browser.click(ManualRenewalPageObjects.GoodOption1());
            Browser.click(ManualRenewalPageObjects.GoodOption2());
            Browser.click(ManualRenewalPageObjects.sendAssessmentBTN());
            Browser.waitForSeconds(3);
            Browser.click(ManualRenewalPageObjects.closeSubmitPopUp());
        }
        //if Bad
        if (Selection.equals("Bad")) {
            Browser.click(ManualRenewalPageObjects.NotGoodOption());
            Browser.click(ManualRenewalPageObjects.BadOption1());
            Browser.setText(ManualRenewalPageObjects.reasonInput1(), "Test");
            Browser.click(ManualRenewalPageObjects.BadOption2());
            Browser.setText(ManualRenewalPageObjects.reasonInput2(), "Test");
            Browser.click(ManualRenewalPageObjects.sendAssessmentBTN());
            Browser.waitForSeconds(3);
            Browser.click(ManualRenewalPageObjects.closeSubmitPopUp());
        }
    }


    public void AssessmentOfManualRenewalAsTenant(String Selection) {
        Browser.waitForSeconds(10);
        //if Good
        if (Selection.equals("Good")) {
            Browser.click(ManualRenewalPageObjects.YesOption1());
            Browser.click(ManualRenewalPageObjects.GoodOption1());
            Browser.click(ManualRenewalPageObjects.YesOption2());
            Browser.click(ManualRenewalPageObjects.GoodOption2());
            Browser.click(ManualRenewalPageObjects.newOption());
            Browser.click(ManualRenewalPageObjects.GoodOption3());
            Browser.click(ManualRenewalPageObjects.GoodOption4());
            Browser.click(ManualRenewalPageObjects.sendAssessmentBTN());
            Browser.waitForSeconds(3);
            Browser.click(ManualRenewalPageObjects.closeSubmitPopUp());
        }
        //if Bad
        if (Selection.equals("Bad")) {
            Browser.click(ManualRenewalPageObjects.NoOption1());
            Browser.click(ManualRenewalPageObjects.NoOption2());
            Browser.click(ManualRenewalPageObjects.NotGoodOption());
            Browser.click(ManualRenewalPageObjects.BadOption1());
            Browser.setText(ManualRenewalPageObjects.reasonInput1(), "Test");
            Browser.click(ManualRenewalPageObjects.BadOption2());
            Browser.setText(ManualRenewalPageObjects.reasonInput2(), "Test");
            Browser.click(ManualRenewalPageObjects.sendAssessmentBTN());
            Browser.waitForSeconds(3);
            Browser.click(ManualRenewalPageObjects.closeSubmitPopUp());
        }
    }

    public void updateFinancialInRenewalContract() {
        Browser.waitForSeconds(3);
        click(ManualRenewalPageObjects.lateFeesLabel());
        Browser.waitForSeconds(1);
        Browser.setText(ManualRenewalPageObjects.fillLateFeesInput(), "20");
        Browser.waitForSeconds(1);
        click(ManualRenewalPageObjects.retainerLabel());
        Browser.waitForSeconds(1);
        Browser.setText(ManualRenewalPageObjects.fillRetainerFeeInput(), "20");
        Browser.waitForSeconds(1);
        logger.addScreenshot("Added Financial");
    }

    public void updateTermsAndConditionInRenewalContract() {
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(3);
        click(ManualRenewalPageObjects.addNewTermsLabel());
        waitUntilVisibilityOfElement(ManualRenewalPageObjects.addNewTermsLinkText(), 20);
        click(ManualRenewalPageObjects.addNewTermsLinkText());
        waitUntilVisibilityOfElement(ManualRenewalPageObjects.fillNewTermsTextArea(), 20);
        Browser.setText(ManualRenewalPageObjects.fillNewTermsTextArea(), "Test By Automation");
        click(ManualRenewalPageObjects.clickConfirmButton());
        logger.addScreenshot("Added additional terms");
    }

    public void clickOnEditButton1() {
        waitUntilVisibilityOfElement(ManualRenewalPageObjects.editBTN1(), 20);
        click(ManualRenewalPageObjects.editBTN1());
    }

    public void clickOnEditButton2() {
        waitUntilVisibilityOfElement(ManualRenewalPageObjects.editBTN2(), 20);
        click(ManualRenewalPageObjects.editBTN2());
    }

    public void navigateToContractInfoLabel(){
        Browser.waitUntilPresenceOfElement(CommonMethodsPageObjects.contractInfoLabel(),20);
        Browser.click(CommonMethodsPageObjects.contractInfoLabel());
        Browser.waitForSeconds(1);
    }
}