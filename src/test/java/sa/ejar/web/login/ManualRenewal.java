package sa.ejar.web.login;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;
import java.util.Map;

import static sa.ejar.web.objects.CommonMethodsPageObjects.*;

public class ManualRenewal extends NHCWebTest {

    //---------------------Manual_Renewal_BoOfficer---------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_106_ManualRenewal(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify ( تجديد العقد ) option is visible");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_ManualRenewal(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard(); //ManualRenewalCard
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard(); //ManualRenewalCard
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify new contract are generate");
        app.manualRenewalPage.verifyNewContractAreGenerate(context);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard(); //ManualRenewalCard
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify 'أعيد إصدارها' Is Visible In Contract Time Line");
        app.manualRenewalPage.verifyIssueStatusIsVisibleInContractTimeLine();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_10_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard(); //ManualRenewalCard
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify Issue Date Is Visible");
        app.manualRenewalPage.verifyIssueDateIsVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard(); //ManualRenewalCard
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();

        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Click on ' الإرسال للتوثيق ' button > Verify Submit Contract for Renewal is visible ");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }


    //---------------------Manual_Renewal_Tenant---------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_109_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Verify Contract Renewal Steps Page is Displayed");
        app.manualRenewalPage.verifyContractRenewalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_110_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is Displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_111_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on  (تحميل مسودة العقد) button");
        CommonMethodsPage.clickOnDownloadDraftCopy();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_112_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on \"إلغاء\" button");
        CommonMethodsPage.scrollToElement(cancelBTN());
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_113_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on \"إلغاء\" button");
        CommonMethodsPage.scrollToElement(cancelBTN());
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
        logger.info("Step 12: Click on \"إلغاء\" button from popup window");
        app.manualRenewalPage.clickOnCancelPopUpButton();
        CommonMethodsPage.scrollToElement(By.xpath("//div//h1[text()=' إرسال العقد للتجديد ']"));
        logger.info("Step 13: User remains in the same section (معاينة العقد) in (إرسال العقد للتجديد) page");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_114_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on \"إلغاء\" button");
        CommonMethodsPage.scrollToElement(cancelBTN());
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
        logger.info("Step 12: Click on \"تأكيد\" button from popup window");
        app.manualRenewalPage.clickOnConfirmPopUpButton();
        logger.info("Step 13: User navigate back to contract steps (خطوات العقد ) page");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_115_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_116_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 13: Click on  (السابق) button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 14: Verify the user move to previous (معاينة العقد) section");
        app.sendContractForApprovalPage.verifyPreviewContractSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_117_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 13: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_118_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 13: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
        logger.info("Step 14: Click on \"إلغاء\" button from popup window");
        app.manualRenewalPage.clickOnCancelPopUpButton();
        logger.info("Step 15: User remains in the same section (دفع رسوم إيجار) in (إرسال العقد للتجديد) page");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_119_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 13: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
        logger.info("Step 14: Click on \"تأكيد\" button from popup window");
        app.manualRenewalPage.clickOnConfirmPopUpButton();
        logger.info("Step 15: User navigate back to contract steps (خطوات العقد ) page");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_120_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the paying fee will through Lessor");
        app.manualRenewalPage.payingFeeThroughLessor();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_121_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 13: Verify the (تأكيد وإرسال) button is disabled/not clickable");
        CommonMethodsPage.scrollToElement(confirmAndSubmitBTN());
        CommonMethodsPage.verifyTheConfirmAndSubmitButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_122_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 13: Click on (إخلاء مسؤولية) checkbox");
        CommonMethodsPage.clickOnDisclaimerCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_123_ManualRenewal(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber(context);
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        CommonMethodsPage.SendForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 13: Click on (إخلاء مسؤولية) checkbox");
        CommonMethodsPage.clickOnDisclaimerCheckbox();
        logger.info("Step 14: Click on (تأكيد وإرسال) button");
        CommonMethodsPage.clickOnConfirmAndSubmitButton();
        logger.info("Step 17:Verify popup message (تم إرسال طلب تجديد العقد) is displayed");
        //???????????????????????????????????????????????????
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_124_ManualRenewal(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Verify 'انتظار رسوم منصة إيجار' Is Visible In Contract Time Line");
        app.manualRenewalPage.verifyWaitingEjarFeeStatusIsVisibleInContractTimeLine();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_125_ManualRenewal(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify the status of contract is (انتظار رسوم منصة إيجار)");
        CommonMethodsPage.verifyContractStatusIsWaitingEjarFee();
      }

    @Test(dataProvider = "testDataProvider")
    public void TC_126_ManualRenewal(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on  (تحميل مسودة العقد) button");
        CommonMethodsPage.clickOnDownloadDraftCopy();
        logger.info("Step 09: Verify contract major version start with '1-0'");
        CommonMethodsPage.PDFValidation(data.get("ContractNumber"),"Contract No. "+data.get("ContractNumber")+" / 1-0");
       }
    }