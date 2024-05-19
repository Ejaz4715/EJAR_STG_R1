package sa.ejar.web.pages;

import com.testcrew.base.WebBaseTest;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.ContractsApprovalPageObjects;
import sa.ejar.web.objects.ManualRenewalPageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.*;

public class ManualRenewalPage {

    public void verifyReadyForRenewalCardIsVisible() {
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.readyForRenewalCard(),20);
        Assert.assertTrue(Browser.isElementPresent(ManualRenewalPageObjects.readyForRenewalCard()));
        WebBaseTest.logger.addScreenshot("Ready For Renewal Card Is Visible");
        Browser.waitForSeconds(1);
    }

    public void navigateToReadyForRenewalPage() {
        Browser.click(ManualRenewalPageObjects.readyForRenewalCard());
        WebBaseTest.logger.addScreenshot("Display Contract that Ready for Renewal");
        Browser.waitForSeconds(3);
    }

    public void verifyTotalNumberOfContractInReadyForRenewalCard() {
        boolean status = false;
        int Count = 0;
        int ManualRenewalCardNumber = Integer.parseInt(ManualRenewalPageObjects.getTotalNoOfContractInReadyForRenewalCard);
        //If No contract is displayed
        while (Browser.isElementPresent(ManualRenewalPageObjects.noContractFound())) {
            logger.addScreenshot("No contracts found in ready for renewal");
            break;
        }
        //More than five contract are displayed
        while (Browser.isElementPresent(ManualRenewalPageObjects.contractNextArrow())) {
            Browser.selectDropdownByVisibleText(ManualRenewalPageObjects.selectDisplayOfContract(), "50");
            Browser.waitForSeconds(7);
            List<WebElement> ContractNumber = driver.findElements(ManualRenewalPageObjects.getCurrentTotalOfContracts());
            Count += ContractNumber.size();
            System.out.println(Count);
            status = true;
            if (status == true) {
                Browser.click(ManualRenewalPageObjects.contractNextArrow());
                Browser.waitForSeconds(7);
            }
            if (Browser.isElementDisabled(ManualRenewalPageObjects.contractNextArrow())) {
                List<WebElement> ContractNumber2 = driver.findElements(ManualRenewalPageObjects.getCurrentTotalOfContracts());
                Count += ContractNumber2.size();
                System.out.println(Count);
                Assert.assertEquals(ManualRenewalCardNumber, Count);
                break;
            }
        }
        //If One contract to Five found are displayed
        while (!Browser.isElementPresent(ManualRenewalPageObjects.contractNextArrow())) {
            List<WebElement> ContractNumber = driver.findElements(ManualRenewalPageObjects.getCurrentTotalOfContracts());
            Count += ContractNumber.size();
            System.out.println(Count);
            status = true;
            if (status = true && Count >= 1 && Count <= 5) {
                System.out.println(Count);
                Assert.assertEquals(ManualRenewalCardNumber, Count);
                break;
            }
        }
    }

    public void ClickManualRenewalCard() {
        Browser.waitUntilPresenceOfElement(ManualRenewalPageObjects.clickOnReadyForRenewalCard(), 20);
        Browser.click(ManualRenewalPageObjects.clickOnReadyForRenewalCard());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Click on Manual Renewal Card");
    }

    public void getCurrentContractNumber(ITestContext context) {
        Browser.waitForSeconds(1);
        String val = getWebElement(ManualRenewalPageObjects.getCurrentContractNumber()).getAttribute("value");
        context.setAttribute("CurrentContractNumber", val);
        System.out.println("Current Contract Number : " + val);
    }

    public void getNewContractNumber(ITestContext context) {
        Browser.waitForSeconds(1);
        String val = Browser.getWebElement(ManualRenewalPageObjects.getNewContractNumber()).getText();
        context.setAttribute("NewContractNumber", val);
        System.out.println("New Contract Number : " + val);
    }

    public void verifyNewContractAreGenerate(ITestContext context) {
        String CurrentContract = (String) context.getAttribute("CurrentContractNumber");
        String NewContract = Browser.getText(ManualRenewalPageObjects.getNewContractNumber());
        Assert.assertTrue(!CurrentContract.equals(NewContract));
        logger.addScreenshot("");
    }

    public void verifyIssueDateIsVisible() {
        String Date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        String IssueDate = Browser.getText(ManualRenewalPageObjects.issueDate());
        String s = IssueDate.split(" ")[0];
        String T = s.replace("-", "");
        System.out.println(T);
        Assert.assertTrue(Date.equals(T));
        logger.addScreenshot("");
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
        if (status == true) {
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
        Browser.waitUntilPresenceOfElement(ManualRenewalPageObjects.renewalStepsPage(), 20);
        String SendContractForRenewalTitle = Browser.getText(ManualRenewalPageObjects.renewalStepsPage());
        Assert.assertTrue(SendContractForRenewalTitle.contains("خطوات تجديد العقد"));
        logger.addScreenshot("Contract Renewal Steps Page Is Displayed");
    }

    public void verifyTheReviewContractSectionIsDisplayed() throws Exception {
        if (Browser.isElementPresent(CommonMethodsPageObjects.reviewTheContractPage())) {
            Browser.executeJSScrollIntoView(CommonMethodsPageObjects.reviewTheContractPage());
        }
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.reviewTheContractPage()));
        logger.addScreenshot("The (معاينة العقد) section is displayed");
    }

    public void clickOnCancelPopUpButton() {
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.cancelBTNPopUp(), 20);
        Browser.click(ManualRenewalPageObjects.cancelBTNPopUp());
        logger.addScreenshot("");
    }

    public static void clickOnConfirmPopUpButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.confirmBTNPopUp(), 20);
        Browser.click(ManualRenewalPageObjects.confirmBTNPopUp());
    }

    public static void payingFeeThroughLessor() throws Exception {
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.payFeeThroughLessor(), 20);
        String PayingFee = Browser.getText(ManualRenewalPageObjects.payFeeThroughLessor());
        Assert.assertTrue(PayingFee.contains("المؤجر سوف يدفع رسوم شبكة إيجار"));
        logger.addScreenshot("المؤجر سوف يدفع رسوم شبكة إيجار");
    }

    public static void EjarRegistrationFeesIsVisible() throws Exception {
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.EjarRegistrationFees(), 20);
        String PayingFee = Browser.getText(ManualRenewalPageObjects.EjarRegistrationFees());
        Assert.assertTrue(PayingFee.contains("رسوم التسجيل في إيجار"));
        logger.addScreenshot("رسوم التسجيل في إيجار");
    }

    public void verifySendContractForRenewalPopUpIsVisible(ITestContext context) {
        Browser.waitUntilVisibilityOfElement(ManualRenewalPageObjects.sendContractForRenewalMsg(), 30);
        String PopUpMessage1 = Browser.getText(ManualRenewalPageObjects.sendContractForRenewalMsg());
        Assert.assertTrue(PopUpMessage1.contains("تم إرسال طلب تجديد العقد"));
        String PopUpMessage2 = Browser.getText(ManualRenewalPageObjects.getContractFromPopUpUMsg());
        Assert.assertTrue(PopUpMessage2.contains((String) context.getAttribute("NewContractNumber")));
        Assert.assertTrue(PopUpMessage2.contains("للتجديد بنجاح"));
        logger.addScreenshot("");
    }

    public static void verifySelectedContractIsNotVisibleInReadyForRenewalContracts(String SelectedContract) {
        boolean status = false;
        while (Browser.isElementPresent(By.xpath("//div[text()=' لم يتم العثور على عقود! يرجى إضافة عقود جديدة. ']"))) {
            logger.addScreenshot("Selected Contract Is Not Visible in ready for renewal contracts");
            break;
        }
        while (Browser.isElementPresent(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]"))) {
            Browser.selectDropdownByVisibleText(By.xpath("//select[@data-name='page_size']"), "50");
            Browser.waitForSeconds(7);
            List<WebElement> ContractNumber = driver.findElements(By.xpath("//h5[@class='item-value']"));
            if (!ContractNumber.contains(SelectedContract)) {
                status = true;
                if (status == true && (Browser.isElementDisabled(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]")))) {
                    logger.addScreenshot("Selected Contract Is Not Visible in ready for renewal contracts");
                    break;
                } else if (status == true && (!Browser.isElementDisabled(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]")))) {
                    Browser.click(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]"));
                    Browser.waitForSeconds(7);
                    if (Browser.isElementDisabled(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]"))) {
                        List<WebElement> ContractNumber1 = driver.findElements(By.xpath("//h5[@class='item-value']"));
                        if (!ContractNumber1.contains(SelectedContract)) {
                            logger.addScreenshot("Selected Contract Is Not Visible in ready for renewal contracts");
                            break;
                        }
                    }
                }
            }
        }
    }

    public void verifyNewRenewalContractIsVisibleInTotalNoOfContracts(String NewContract) {
        boolean status = false;
        while (Browser.isElementPresent(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]"))) {
            Browser.selectDropdownByVisibleText(By.xpath("//select[@data-name='page_size']"), "50");
            Browser.waitForSeconds(7);
            List<WebElement> ContractNumber = driver.findElements(By.xpath("//h5[@class='item-value']"));
            if (ContractNumber.contains(NewContract)) {
                status = true;
                break;

                } else if (status == true && (!Browser.isElementDisabled(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]")))) {
                    Browser.click(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]"));
                    Browser.waitForSeconds(7);
                    if (Browser.isElementDisabled(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]"))) {
                        List<WebElement> ContractNumber1 = driver.findElements(By.xpath("//h5[@class='item-value']"));
                        if (ContractNumber1.contains(NewContract)) {
                            logger.addScreenshot("Selected Contract Is Visible In Total Number Of Contracts");
                            break;
                        }
                    }
                }
            }
        }

    public void verifySelectedContractIsVisibleInReadyForRenewalContracts(String SelectedContract) {
        boolean status = false;
        while (Browser.isElementPresent(By.xpath("//div[text()=' لم يتم العثور على عقود! يرجى إضافة عقود جديدة. ']"))) {
            logger.addScreenshot("Selected Contract Is Not Visible in ready for renewal contracts");
            break;
        }
        while (Browser.isElementPresent(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]"))) {
            Browser.selectDropdownByVisibleText(By.xpath("//select[@data-name='page_size']"), "50");
            Browser.waitForSeconds(7);
            List<WebElement> ContractNumber = driver.findElements(By.xpath("//h5[@class='item-value']"));
            if (ContractNumber.contains(SelectedContract)) {
                status = true;
                logger.addScreenshot("Selected Contract Is Visible In Ready For Renewal Contracts");
                break;

            } else if (status == true && (!Browser.isElementDisabled(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]")))) {
                Browser.click(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]"));
                Browser.waitForSeconds(7);
                if (Browser.isElementDisabled(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]"))) {
                    List<WebElement> ContractNumber1 = driver.findElements(By.xpath("//h5[@class='item-value']"));
                    if (ContractNumber1.contains(SelectedContract)) {
                        logger.addScreenshot("Selected Contract Is Visible In Ready For Renewal Contracts");
                        break;
                    }
                }
            }
        }
        while (!Browser.isElementPresent(By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]"))) {
            List<WebElement> ContractNumber1 = driver.findElements(By.xpath("//h5[@class='item-value']"));
            if (ContractNumber1.contains(SelectedContract)) {
                logger.addScreenshot("Selected Contract Is Visible In Ready For Renewal Contracts");
                break;
            }
        }
    }


    public void AssessmentOfManualRenewalAsLessor() throws Exception {
        Browser.waitForSeconds(3);
        //if Good
        if (Browser.isElementPresent(ContractsApprovalPageObjects.approvalSubmittedText())) {
            Browser.click(ManualRenewalPageObjects.newOption());
            Browser.click(ManualRenewalPageObjects.GoodOption1());
            Browser.click(ManualRenewalPageObjects.GoodOption2());
            Browser.click(ManualRenewalPageObjects.sendAssessmentBTN());
            Browser.waitForSeconds(3);
            Browser.click(ManualRenewalPageObjects.closeSubmitPopUp());

//            //if Bad
//            if (Browser.isElementPresent(ContractsApprovalPageObjects.approvalSubmittedText())) {
//                Browser.click(ManualRenewalPageObjects.NotGoodOption());
//                Browser.click(ManualRenewalPageObjects.BadOption1());
//                Browser.setText(ManualRenewalPageObjects.reasonInput1(), "Test");
//                Browser.click(ManualRenewalPageObjects.BadOption2());
//                Browser.setText(ManualRenewalPageObjects.reasonInput2(), "Test");
//                Browser.click(ManualRenewalPageObjects.sendAssessmentBTN());
//                Browser.waitForSeconds(3);
//                Browser.click(ManualRenewalPageObjects.closeSubmitPopUp());
//            }
        }
    }

    public void AssessmentOfManualRenewalAsTenant() throws Exception {
        Browser.waitForSeconds(3);
        //if Good
        if (Browser.isElementPresent(ContractsApprovalPageObjects.approvalSubmittedText())) {
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

//            //if Bad
//            if (Browser.isElementPresent(ContractsApprovalPageObjects.approvalSubmittedText())) {
//                Browser.click(ManualRenewalPageObjects.NoOption1());
//                Browser.click(ManualRenewalPageObjects.NoOption2());
//                Browser.click(ManualRenewalPageObjects.NotGoodOption());
//                Browser.click(ManualRenewalPageObjects.BadOption1());
//                Browser.setText(ManualRenewalPageObjects.reasonInput1(), "Test");
//                Browser.click(ManualRenewalPageObjects.BadOption2());
//                Browser.setText(ManualRenewalPageObjects.reasonInput2(), "Test");
//                Browser.click(ManualRenewalPageObjects.sendAssessmentBTN());
//                Browser.waitForSeconds(3);
//                Browser.click(ManualRenewalPageObjects.closeSubmitPopUp());
//            }
        }
    }

     public void updateFinancialInRenewalContract(){
         Browser.waitForSeconds(1);
         click(By.xpath("//form[@id='late_fees_charged_form']//span[@class='slider enable-transitions']"));
         Browser.setText(By.xpath("(//div//input[@mask='separator'])[1]"),"20");
         Browser.waitForSeconds(1);
         click(By.xpath("//form[@id='retainer_fee_form']//span[@class='slider enable-transitions']"));
         Browser.setText(By.xpath("(//div//input[@mask='separator'])[2]"),"20");
         Browser.waitForSeconds(1);
         logger.addScreenshot("Added Financial");
     }

        public void updateTermsAndConditionInRenewalContract(){
            Browser.executeJSScroll(300);
            Browser.waitForSeconds(3);
            click(By.xpath("//app-switch-input[@class='float-right ng-untouched ng-pristine ng-valid']//span[@class='slider enable-transitions']"));
            waitUntilVisibilityOfElement(By.xpath("//a[contains(text(),'إضافة بند آخر')]"),20);
            click(By.xpath("//a[contains(text(),'إضافة بند آخر')]"));
            waitUntilVisibilityOfElement(By.xpath("//textarea[@formcontrolname='content']"),20);
            Browser.setText(By.xpath("//textarea[@formcontrolname='content']"),"Test By Automation");
            click(By.xpath("//button[@type='button'][contains(text(),'تأكيد')]"));
            logger.addScreenshot("Added additional terms");
        }

    public static void clickOnEditButton1() throws Exception {
        waitUntilVisibilityOfElement(ManualRenewalPageObjects.editBTN1(), 20);
        click(ManualRenewalPageObjects.editBTN1());
       }

    public static void clickOnEditButton2() throws Exception {
        waitUntilVisibilityOfElement(ManualRenewalPageObjects.editBTN2(), 20);
        click(ManualRenewalPageObjects.editBTN2());
    }


}