package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.ManualRenewalPageObjects;
import sa.ejar.web.objects.TerminateContractPageObjects;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.*;
import static com.testcrew.web.Browser.click;

public class ManualRenewalPage {

    public void ClickManualRenewalCard() {
        Browser.waitUntilPresenceOfElement(By.xpath("//app-card//p[text()='جاهز للتجديد']"), 20);
        Browser.click(By.xpath("//app-card//p[text()='جاهز للتجديد']"));
        Browser.waitForSeconds(1);
    }

    public void getCurrentContractNumber(ITestContext context) {
        Browser.waitForSeconds(1);
        String val = getWebElement(By.xpath("//input[@data-name='contract_number']")).getAttribute("value");
        context.setAttribute("CurrentContractNumber", val);
        System.out.println("Value : " + val);
    }

    public void verifyNewContractAreGenerate(ITestContext context) {
        String CurrentContract = (String) context.getAttribute("CurrentContractNumber");
        String NewContract = Browser.getText(By.xpath("//div//h4[@class='ms-4']")); //New Contract Heading
        Assert.assertTrue(!CurrentContract.equals(NewContract));
        logger.addScreenshot("");
    }

    public void verifyIssueDateIsVisible() {
        String Date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        String IssueDate = Browser.getText(By.xpath("//div//p[@class='timestamp']")); //IssueDate
        String s = IssueDate.split(" ")[0];
        String T = s.replace("-", "");
        System.out.println(T);
        Assert.assertTrue(Date.equals(T));
        logger.addScreenshot("");
    }

    public void verifyIssueStatusIsVisibleInContractTimeLine() {
        String title = Browser.getText(By.xpath("//div//h2[@class='title']")); //IssueStatus
        Assert.assertTrue(title.contains("أعيد إصدارها"));
        logger.addScreenshot("");
    }

    public void verifyWaitingEjarFeeStatusIsVisibleInContractTimeLine() {
        Browser.waitUntilPresenceOfElement(By.xpath("(//div//h2[@class='title'])[2]"),20);
        String title = Browser.getText(By.xpath("(//div//h2[@class='title'])[2]")); //IssueStatus
        Assert.assertTrue(title.contains("انتظار رسوم منصة إيجار"));
        logger.addScreenshot("");
    }

    public void verifySubmitContractForRenewalPageIsDisplayed() {
        String SendContractForRenewalTitle = Browser.getText(By.xpath("//div//h1[text()=' إرسال العقد للتجديد ']"));
        Assert.assertTrue(SendContractForRenewalTitle.contains("إرسال العقد للتجديد"));
        logger.addScreenshot("Remains in the same إرسال العقد للتجديد page");
    }

    public void verifyContractRenewalStepsPageIsDisplayed() {
        Browser.waitUntilPresenceOfElement(By.xpath("//div//h2[@class='card-title']"), 20);
        String SendContractForRenewalTitle = Browser.getText(By.xpath("//div//h2[@class='card-title']"));
        Assert.assertTrue(SendContractForRenewalTitle.contains("خطوات تجديد العقد"));
        logger.addScreenshot("Contract Renewal Steps Page Is Displayed");
    }

      public void verifyTheReviewContractSectionIsDisplayed() throws Exception {
        if(Browser.isElementPresent(CommonMethodsPageObjects.reviewTheContractPage())){
            Browser.executeJSScrollIntoView(CommonMethodsPageObjects.reviewTheContractPage());
        }
        Assert.assertTrue(Browser.isElementDisplayed(CommonMethodsPageObjects.reviewTheContractPage()));
        logger.addScreenshot("The (معاينة العقد) section is displayed");
    }

    public void clickOnCancelPopUpButton(){
            Browser.waitUntilVisibilityOfElement(By.xpath("//footer//button[contains(text(),' إلغاء')]"), 20);
            Browser.click(By.xpath("//footer//button[contains(text(),' إلغاء')]"));
    }

    public static void clickOnConfirmPopUpButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(By.xpath("//footer//button[text()=' تأكيد ']"), 20);
        Browser.click(By.xpath("//footer//button[text()=' تأكيد ']"));
    }

    public static void payingFeeThroughLessor() throws Exception {
        Browser.waitUntilVisibilityOfElement(By.xpath("//div[@class='d-inline-block ps-2 py-3 py-md-0']"), 20);
        String PayingFee = Browser.getText(By.xpath("//div[@class='d-inline-block ps-2 py-3 py-md-0']"));
        Assert.assertTrue(PayingFee.contains("المؤجر سوف يدفع رسوم شبكة إيجار"));
        logger.addScreenshot("المؤجر سوف يدفع رسوم شبكة إيجار");
    }
}
