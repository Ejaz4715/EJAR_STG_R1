package sa.ejar.web.login;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.ejar.api.repo.APICollection;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;
import java.util.Map;
import static sa.ejar.web.objects.CommonMethodsPageObjects.*;
import static sa.ejar.web.objects.ManualRenewalPageObjects.*;

public class ManualRenewal extends NHCWebTest {

    //---------------------Manual_Renewal_BoOfficer---------------------------
    //------------------------------------------------------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_001_ManualRenewal(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_002_ManualRenewal(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_003_ManualRenewal(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
        logger.info("Step 06: Verify number of contracts that display in Ready For Renewal ( جاهز للتجديد ) card has same number of displayed contracts.");
        app.manualRenewalPage.verifyTotalNumberOfContractInReadyForRenewalCard();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_004_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 07: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        Browser.executeJSScroll(400);
        logger.info("Step 08: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_005_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 07: Enter contract number in the contract search");
//        CommonMethodsPage.enterContractNumberInContractSearchInputField("1028940383");
        CommonMethodsPage.enterContractNumberInContractSearchInputField("test");
        Browser.executeJSScroll(400);
        logger.info("Step 08: Verify searched contract is not appearing");
        CommonMethodsPage.verifySearchedContractIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_006_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
    public void TC_007_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
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
    public void TC_008_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.manualRenewalPage.getLatestRenewalContract();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify new contract are generate");
        app.manualRenewalPage.verifyNewContractAreGenerate(data);
        app.manualRenewalPage.getNewContractNumber();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_009_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.manualRenewalPage.getLatestRenewalContract();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify 'أعيد إصدارها' Is Visible In Contract Time Line");
        app.manualRenewalPage.contractTimeLineStatus("أعيد إصدارها");
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_010_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.manualRenewalPage.getLatestRenewalContract();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify Issue Date Is Visible");
        app.manualRenewalPage.verifyIssueDateIsVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_011_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.manualRenewalPage.getLatestRenewalContract();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_012_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.manualRenewalPage.getLatestRenewalContract();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is Displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_013_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on  (تحميل مسودة العقد) button");
        CommonMethodsPage.clickOnDownloadDraftCopy();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_014_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on \"إلغاء\" button");
        CommonMethodsPage.scrollToElement(cancelBTN());
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_015_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on \"إلغاء\" button");
        CommonMethodsPage.scrollToElement(cancelBTN());
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
        logger.info("Step 11: Click on \"إلغاء\" button from popup window");
        app.manualRenewalPage.clickOnCancelPopUpButton();
        CommonMethodsPage.scrollToElement(sendContractForRenewal());
        logger.info("Step 12: User remains in the same section (معاينة العقد) in (إرسال العقد للتجديد) page");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_016_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on \"إلغاء\" button");
        CommonMethodsPage.scrollToElement(cancelBTN());
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
        logger.info("Step 11: Click on \"تأكيد\" button from popup window");
        app.manualRenewalPage.clickOnConfirmPopUpButton();
        logger.info("Step 12: User navigate back to contract steps (خطوات العقد ) page");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_017_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_018_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 12: Click on  (السابق) button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 13: Verify the user move to previous (معاينة العقد) section");
        app.sendContractForApprovalPage.verifyPreviewContractSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_019_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 12: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_020_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();       
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 12: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
        logger.info("Step 13: Click on \"إلغاء\" button from popup window");
        app.manualRenewalPage.clickOnCancelPopUpButton();
        logger.info("Step 14: User remains in the same section (دفع رسوم إيجار) in (إرسال العقد للتجديد) page");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_021_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 12: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
        logger.info("Step 13: Click on \"تأكيد\" button from popup window");
        app.manualRenewalPage.clickOnConfirmPopUpButton();
        logger.info("Step 14: User navigate back to contract steps (خطوات العقد ) page");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_022_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the paying fee will through Lessor");
        app.manualRenewalPage.payingFeeThroughLessor();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_023_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 12: Verify the (تأكيد وإرسال) button is disabled/not clickable");
        CommonMethodsPage.scrollToElement(confirmAndSubmitBTN());
        CommonMethodsPage.verifyTheConfirmAndSubmitButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_024_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();       
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 12: Click on (إخلاء مسؤولية) checkbox ,(تأكيد وإرسال) button is enabled ");
        CommonMethodsPage.clickOnDisclaimerCheckbox();
        CommonMethodsPage.verifyTheConfirmAndSubmitButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_025_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        app.manualRenewalPage.getNewContractNumber();
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 10: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 12: Click on (إخلاء مسؤولية) checkbox");
        CommonMethodsPage.clickOnDisclaimerCheckbox();
        logger.info("Step 13: Click on (تأكيد وإرسال) button");
        CommonMethodsPage.clickOnConfirmAndSubmitButton();
        logger.info("Step 14:Verify popup message (تم إرسال طلب تجديد العقد) is displayed");
        app.manualRenewalPage.verifySendContractForRenewalPopUpIsVisible(data);
//        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_026_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Verify 'انتظار رسوم منصة إيجار' Is Visible In Contract Time Line");
        app.manualRenewalPage.contractTimeLineStatus("انتظار رسوم منصة إيجار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_027_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Verify the status of contract is change to  (انتظار رسوم منصة إيجار)");
        CommonMethodsPage.verifyContractStatus("انتظار رسوم منصة إيجار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_028_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify new renewal contract is visible in Total Number Of Contracts");
        app.manualRenewalPage.verifyNewRenewalContractIsVisibleInTotalNoOfContracts(data.get("New_Contract"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_029_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify Ready For Renewal (جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
        logger.info("Step 06: Verify selected contract for renewal is not visible in Ready For Renewal ( جاهز للتجديد ) Contracts");
        app.manualRenewalPage.verifySelectedContractIsNotVisibleInReadyForRenewalContracts(data.get("Old_Contract"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_030_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on  (تحميل مسودة العقد) button");
        CommonMethodsPage.clickOnDownloadDraftCopy();
        logger.info("Step 09: Verify contract version will be '1-0'");
        CommonMethodsPage.PDFValidation(data.get("New_Contract"), "Contract No. " + data.get("New_Contract") + " / 1-0");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_031_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Click on (تعديل) button");
        CommonMethodsPage.scrollToElement(editBTN1());
        app.manualRenewalPage.clickOnEditButton1();
        logger.info("Step 09: Update Financial terms");
        app.manualRenewalPage.updateFinancialInRenewalContract();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 10: Click on (تعديل) button");
        CommonMethodsPage.scrollToElement(editBTN2());
        app.manualRenewalPage.clickOnEditButton2();
        logger.info("Step 11: Update Terms And Condition");
        app.manualRenewalPage.updateTermsAndConditionInRenewalContract();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        logger.info("Step 12: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 13: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_032_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Old_Contract"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is not visible");
        CommonMethodsPage.checkSendForApprovalButtonIsNotVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_033_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Verify 'تم التقديم' status Is Visible In Contract Time Line after Bo Manager resubmitted rejected contract to parties");
        app.manualRenewalPage.contractTimeLineStatus("تم التقديم");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_034_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Verify the status of contract is change to  (بانتظار موافقة الأطراف) after Bo Manager resubmitted rejected contract to parties");
        CommonMethodsPage.verifyContractStatus("انتظار رسوم منصة إيجار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_035_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Click on Manual Renewal Card");
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 05: Verify selected contract for renewal is visible in Ready For Renewal ( جاهز للتجديد ) Contracts,if the new contract is rejected from lessor.");
        app.manualRenewalPage.verifySelectedContractIsVisibleInReadyForRenewalContracts(data.get("Old_Contract"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_036_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Click on Manual Renewal Card");
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 05: Verify selected contract for renewal is visible in Ready For Renewal ( جاهز للتجديد ) Contracts ,if the new contract is rejected from tenant.");
        app.manualRenewalPage.verifySelectedContractIsVisibleInReadyForRenewalContracts(data.get("Old_Contract"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_037_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Verify the status of new renewal contract is change to  ( مسودة )");
        CommonMethodsPage.verifyContractStatus("مسودة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_038_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Verify the status of contract is ( مسودة )");
        CommonMethodsPage.verifyContractStatus("مسودة");
        logger.info("Step 07: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 08: Click on ( عرض العقد ) option");
        CommonMethodsPage.KebabMenuOptions("عرض العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 09: Click on (تعديل) button");
        CommonMethodsPage.scrollToElement(editBTN1());
        app.manualRenewalPage.clickOnEditButton1();
        logger.info("Step 10: Update Financial terms");
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.manualRenewalPage.updateFinancialInRenewalContract();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 11: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 12: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 13: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 15: Click on (إخلاء مسؤولية) checkbox");
        CommonMethodsPage.clickOnDisclaimerCheckbox();
        logger.info("Step 16: Click on (تأكيد وإرسال) button");
        CommonMethodsPage.clickOnConfirmAndSubmitButton();
        logger.info("Step 17:Verify popup message (تم إرسال طلب تجديد العقد) is displayed");
        app.manualRenewalPage.verifySendContractForRenewalPopUpIsVisible(data);
        ////app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        logger.info("Step 18: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 19: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 20: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 21: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 22: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 23: Click on ( عرض العقد ) option");
        CommonMethodsPage.KebabMenuOptions("عرض العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 24: Verify ' تم التقديم ' Is Visible In Contract Time Line");
        app.manualRenewalPage.contractTimeLineStatus("تم التقديم");
    }

    //---------------------Manual_Renewal_Lessor------------------------------
    //------------------------------------------------------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_039_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_040_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_041_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
        logger.info("Step 06: Verify number of contracts that display in Ready For Renewal ( جاهز للتجديد ) card has same number of displayed contracts.");
        app.manualRenewalPage.verifyTotalNumberOfContractInReadyForRenewalCard();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_042_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 07: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        Browser.executeJSScroll(400);
        logger.info("Step 08: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_043_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 07: Enter contract number in the contract search");
//        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        CommonMethodsPage.enterContractNumberInContractSearchInputField("test");
        Browser.executeJSScroll(400);
        logger.info("Step 08: Verify searched contract is not appearing");
        CommonMethodsPage.verifySearchedContractIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_044_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
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
    public void TC_045_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
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
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_046_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify new contract are generate");
        app.manualRenewalPage.verifyNewContractAreGenerate(data);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_047_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد ");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد ");
        logger.info("Step 08: Verify 'أعيد إصدارها' Is Visible In Contract Time Line");
        app.manualRenewalPage.contractTimeLineStatus("أعيد إصدارها");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_048_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify Issue Date Is Visible");
        app.manualRenewalPage.verifyIssueDateIsVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_049_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Click on ' الإرسال للتوثيق ' button > Verify Submit Contract for Renewal is visible");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_050_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Verify Contract Renewal Steps Page is Displayed");
        app.manualRenewalPage.verifyContractRenewalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_051_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();       
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is Displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_052_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on (تحميل مسودة العقد) button");
        CommonMethodsPage.clickOnDownloadDraftCopy();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_053_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_054_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
        CommonMethodsPage.scrollToElement(sendContractForRenewal());
        logger.info("Step 13: User remains in the same section (معاينة العقد) in (إرسال العقد للتجديد) page");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_055_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_056_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();       
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_057_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_058_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();        
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_059_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_060_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_061_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify lessor able to see (رسوم التسجيل في إيجار) from (دفع رسوم إيجار) section");
        app.manualRenewalPage.EjarRegistrationFeesIsVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_062_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_063_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 13: Click on (إخلاء مسؤولية) checkbox ,(تأكيد وإرسال) button is enabled");
        CommonMethodsPage.clickOnDisclaimerCheckbox();
        CommonMethodsPage.verifyTheConfirmAndSubmitButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_064_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        app.manualRenewalPage.getNewContractNumber();
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
        logger.info("Step 15: Verify popup message (تم إرسال طلب تجديد العقد) is displayed");
        app.manualRenewalPage.verifySendContractForRenewalPopUpIsVisible(data);
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_065_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( عرض العقد ) option");
        CommonMethodsPage.KebabMenuOptions("عرض العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 08: Verify ' تم التقديم ' Is Visible In Contract Time Line");
        app.manualRenewalPage.contractTimeLineStatus("تم التقديم");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_066_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( عرض العقد ) option");
        CommonMethodsPage.KebabMenuOptions("عرض العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 08: Verify '( انتظار  الأطراف )' Is Visible In Contract Time Line");
        app.manualRenewalPage.contractTimeLineStatus("انتظار الأطراف");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_067_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify the status of contract change to ( بانتظار موافقة المستأجر )");
        CommonMethodsPage.verifyContractStatus("بانتظار موافقة المستأجر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_068_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on Manual Renewal Card");
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 05: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 06: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 07: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 08: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 09: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        app.manualRenewalPage.getNewContractNumber();
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 10: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 11: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 12: Click on ( التالي ) button");
        CommonMethodsPage.scrollToElement(nextBTN());
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
        logger.info("Step 14: Click on (إخلاء مسؤولية) checkbox");
        CommonMethodsPage.clickOnDisclaimerCheckbox();
        logger.info("Step 15: Click on (تأكيد وإرسال) button");
        CommonMethodsPage.clickOnConfirmAndSubmitButton();
        logger.info("Step 16: Verify popup message (تم إرسال طلب تجديد العقد) is displayed");
        app.manualRenewalPage.verifySendContractForRenewalPopUpIsVisible(data);
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        logger.info("Step 17: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 18: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 19: Click on Manual Renewal Card");
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 20: Verify selected contract for renewal is not visible in Ready For Renewal ( جاهز للتجديد ) Contracts");
        app.manualRenewalPage.verifySelectedContractIsNotVisibleInReadyForRenewalContracts(data.get("Old_Contract"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_069_ManualRenewal(Map<String, String> data) throws Exception {
         data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify new renewal contract is visible in Total Number Of Contracts");
        app.manualRenewalPage.verifyNewRenewalContractIsVisibleInTotalNoOfContracts(data.get("New_Contract"));
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_070_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
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
        logger.info("Step 09: Verify contract version will be '1-0'");
        CommonMethodsPage.PDFValidation(data.get("ContractNumber"), "Contract No. " + data.get("ContractNumber") + " / 1-0");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_071_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Click on (تعديل) button");
        CommonMethodsPage.scrollToElement(editBTN1());
        app.manualRenewalPage.clickOnEditButton1();
        logger.info("Step 09: Update Financial terms");
        app.manualRenewalPage.updateFinancialInRenewalContract();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 10: Click on (تعديل) button");
        CommonMethodsPage.scrollToElement(editBTN2());
        app.manualRenewalPage.clickOnEditButton2();
        logger.info("Step 11: Update Terms And Condition");
        app.manualRenewalPage.updateTermsAndConditionInRenewalContract();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        logger.info("Step 12: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        app.manualRenewalPage.getNewContractNumber();
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 13: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_072_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is not visible");
        CommonMethodsPage.checkSendForApprovalButtonIsNotVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_073_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on Manual Renewal Card");
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 05: Verify selected contract for renewal is visible in Ready For Renewal ( جاهز للتجديد ) Contracts if new renewal contract is rejected from tenant.");
        app.manualRenewalPage.verifySelectedContractIsVisibleInReadyForRenewalContracts(data.get("Old_Contract"));
    }

    //---------------------Manual_Renewal_Tenant---------------------------
    //------------------------------------------------------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_074_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_075_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_076_ManualRenewal(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
        logger.info("Step 06: Verify number of contracts that display in Ready For Renewal ( جاهز للتجديد ) card has same number of displayed contracts.");
        app.manualRenewalPage.verifyTotalNumberOfContractInReadyForRenewalCard();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_077_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 07: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        Browser.executeJSScroll(400);
        logger.info("Step 08: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_078_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify Ready For Renewal ( جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 05: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 07: Enter contract number in the contract search");
//        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        CommonMethodsPage.enterContractNumberInContractSearchInputField("test");
        Browser.executeJSScroll(400);
        logger.info("Step 08: Verify searched contract is not appearing");
        CommonMethodsPage.verifySearchedContractIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_079_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_080_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Click on Manual Renewal Card");
        app.manualRenewalPage.ClickManualRenewalCard();
        logger.info("Step 05: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 06: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 07: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 08: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 09: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        app.manualRenewalPage.getNewContractNumber();
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
        logger.info("Step 15:Verify popup message (تم إرسال طلب تجديد العقد) is displayed");
        app.manualRenewalPage.verifySendContractForRenewalPopUpIsVisible(data);
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        logger.info("Step 16: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 17: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 18: Verify Ready For Renewal (جاهز للتجديد ) card is visible");
        app.manualRenewalPage.verifyReadyForRenewalCardIsVisible();
        logger.info("Step 19: Click on ( جاهز للتجديد ) card");
        app.manualRenewalPage.navigateToReadyForRenewalPage();
        logger.info("Step 20: Verify selected contract for renewal is not visible in Ready For Renewal ( جاهز للتجديد ) Contracts");
        app.manualRenewalPage.verifySelectedContractIsNotVisibleInReadyForRenewalContracts(data.get("Old_Contract"));}

    @Test(dataProvider = "testDataProvider")
    public void TC_081_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Verify new renewal contract is visible in Total Number Of Contracts");
        app.manualRenewalPage.verifyNewRenewalContractIsVisibleInTotalNoOfContracts(data.get("New_Contract"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_082_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify new contract are generate");
        app.manualRenewalPage.verifyNewContractAreGenerate(data);
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_083_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify 'أعيد إصدارها' Is Visible In Contract Time Line");
        app.manualRenewalPage.contractTimeLineStatus("أعيد إصدارها");
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_084_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify Issue Date Is Visible");
        app.manualRenewalPage.verifyIssueDateIsVisible();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_085_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Click on ' الإرسال للتوثيق ' button > Verify Submit Contract for Renewal is visible ");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_086_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 09: Verify that Tenant is able to submit contract for approval without modified any details");
        CommonMethodsPage.assertEditButtonNotVisible();
        logger.info("Step 10: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 11: Verify Contract Renewal Steps Page is Displayed");
        app.manualRenewalPage.verifyContractRenewalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_087_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is Displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_088_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 09: Click on ( لنبدأ ) button");
        CommonMethodsPage.clickOnLetUsStartButton();
        logger.info("Step 10: Verify Submit Contract For Renewal Page is displayed");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
        logger.info("Step 11: Click on  (تحميل مسودة العقد) button");
        CommonMethodsPage.clickOnDownloadDraftCopy();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_089_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_090_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
        CommonMethodsPage.scrollToElement(sendContractForRenewal());
        logger.info("Step 13: User remains in the same section (معاينة العقد) in (إرسال العقد للتجديد) page");
        app.manualRenewalPage.verifySubmitContractForRenewalPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_091_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_092_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_093_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_094_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_095_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_096_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_097_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_098_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_099_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
    public void TC_100_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.manualRenewalPage.getCurrentContractNumber();
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تجديد العقد ) option");
        CommonMethodsPage.KebabMenuOptions("تجديد العقد");
        CommonMethodsPage.ClickOnKebabMenuOption("تجديد العقد");
        logger.info("Step 08: Verify ' الإرسال للتوثيق ' button is enabled > Click on ' الإرسال للتوثيق ' button");
        app.manualRenewalPage.getNewContractNumber();
        CommonMethodsPage.checkSendForApprovalButtonIsEnabled();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
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
        logger.info("Step 15:Verify popup message (تم إرسال طلب تجديد العقد) is displayed");
        app.manualRenewalPage.verifySendContractForRenewalPopUpIsVisible(data);
        //app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_101_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Verify 'انتظار رسوم منصة إيجار' Is Visible In Contract Time Line");
        app.manualRenewalPage.contractTimeLineStatus("انتظار رسوم منصة إيجار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_102_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Verify the status of contract is change to  (انتظار رسوم منصة إيجار)");
        CommonMethodsPage.verifyContractStatus("انتظار رسوم منصة إيجار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_103_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on  (تحميل مسودة العقد) button");
        CommonMethodsPage.clickOnDownloadDraftCopy();
        logger.info("Step 09: Verify contract version will be '1-0'");
        CommonMethodsPage.PDFValidation(data.get("New_Contract"), "Contract No. " + data.get("New_Contract") + " / 1-0");
    }

    //---------------------Manual_Renewal_Lessor_Reject------------------------------
    //-------------------------------------------------------------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_104_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_105_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("New_Contract"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_106_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify ( الموافقة على العقد ) option is displayed");
        CommonMethodsPage.KebabMenuOptions("الموافقة على العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_107_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Verify the user navigate to (خطوات الموافقة على العقد)");
        app.sendContractForApprovalPage.verifyContractApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_108_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify the user navigate to (مراجعة معلومات العقد)");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_109_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (السابق)  button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 10: Verify the user navigate back to (خطوات الموافقة على العقد) page");
        app.sendContractForApprovalPage.verifyContractApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_110_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_111_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Verify (لماذا ترغب بالرفض) radio buttons is clickable");
        CommonMethodsPage.clickRejectReasonRadioButtons();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_112_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Verify (رفض العقد) button is not clickable");
        CommonMethodsPage.verifyTheRejectButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_113_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Verify (رفض العقد) button is not clickable");
        CommonMethodsPage.verifyTheRejectButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_114_ManualRenewal (Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Verify User able to input text in( اكتب سبب الرفض)textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_115_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_116_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Verify the user remains in the same (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_117_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Click on  (تأكيد)  of pup up alert window");
        app.manualRenewalPage.clickOnConfirmPopUpButton();
        app.manualRenewalPage.navigateToContractInfoLabel();
        Browser.executeJSScroll(-500);
        logger.info("Step 12: Verify the user navigate back to (مراجعة معلومات العقد) page");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_118_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Verify The user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_119_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Verify user is able to input OTP successfully");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_120_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Click on  (إلغاء) button");
        app.sendContractForApprovalPage.verifyVerificationCodeIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Verify the user navigate back to (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_121_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Verify the (التحقق من الهوية) button is disabled");
        CommonMethodsPage.verifyTheVerifyIdentityButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_122_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Enter wrong OTP number");
        app.sendContractForApprovalPage.enterVerificationCode("34567");
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify the error message is displayed under OTP input field, Message: E1389 رمز OTP غير صالح");
        app.sendContractForApprovalPage.verifyOTPErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_123_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Enter OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify 'تم إرسال الرفض' message is displayed");
        app.sendContractForApprovalPage.verifyRejectionSubmittedMessageIsDisplayed();
    }

    //---------------------Manual_Renewal_Lessor_Approved------------------------------
    //---------------------------------------------------------------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_124_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_125_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("New_Contract"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_126_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify ( الموافقة على العقد ) option is displayed");
        CommonMethodsPage.KebabMenuOptions("الموافقة على العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_127_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Verify the user navigate to (خطوات الموافقة على العقد)");
        app.sendContractForApprovalPage.verifyContractApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_128_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify the user navigate to (مراجعة معلومات العقد)");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_129_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (السابق)  button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 10: Verify the user navigate back to (خطوات الموافقة على العقد) page");
        app.sendContractForApprovalPage.verifyContractApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_130_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify (تأكيد الموافقة على معلومات العقد) checkbox is clickable");
        CommonMethodsPage.contractInformationCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_131_132_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (أقر بانه تم مطابقة معلومات المؤجر مع معلومات الصك / أقر بانه تم التحقق من الايبان)checkboxes are clickable");
        //TC131 , TC132
        CommonMethodsPage.lessorCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_133_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (تأكيد الموافقة على بيانات المستأجرين ) checkbox is clickable");
        CommonMethodsPage.tenantsCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_134_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (اقر بأنه تم مطابقة العنوان المذكورعلى الموقع الفعلي) checkbox is clickable");
        CommonMethodsPage.propertyDetailsCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_135_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (تأكيد الموافقة على تفاصيل الوحدة) checkbox is clickable");
        CommonMethodsPage.unitDetailsCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_136_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (تأكيد الموافقة على الشروط المالية ) checkbox is clickable");
        CommonMethodsPage.financialTermsCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_137_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (تاكيد الموافقة على الشروط والأحكام ) checkbox is clickable");
        CommonMethodsPage.termsConditionsCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_138_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (تأكيد الموافقة على الوثائق المرتبطة بالعقد ) checkbox is clickable");
        CommonMethodsPage.capturedDocumentsCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_139_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_140_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        CommonMethodsPage.scrollToElement(confirmBTN());
        logger.info("Step 09: (تأكيد) button is not clickable/disabled");
        CommonMethodsPage.verifyConfirmButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_141_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (السابق)  button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 11: Verify the user navigate back to ( مراجعة معلومات العقد ) page");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_142_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_143_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify the user navigate to the (إخلاء مسؤولية) page");
        app.sendContractForApprovalPage.verifyApprovalDisclaimerPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_144_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify the (إرسال الموافقة على العقد) button is disabled/not clickable");
        app.sendContractForApprovalPage.verifySubmitContractApprovalButtonIsDisabled();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_145_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Verify the (إرسال الموافقة على العقد) button is is enabled/clickable");
        app.sendContractForApprovalPage.verifySubmitContractApprovalButtonIsEnabled();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_146_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Verify the user navigate back to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_147_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 13: Verify The user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_148_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 13: Verify user is able to input OTP successfully");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_149_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 13: Click on  (إلغاء) button");
        app.sendContractForApprovalPage.verifyVerificationCodeIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Verify the user navigate back to (إخلاء مسؤولية) page");
        app.sendContractForApprovalPage.verifyApprovalDisclaimerPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_150_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 13: Verify the (التحقق من الهوية) button is disabled");
        CommonMethodsPage.verifyTheVerifyIdentityButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_151_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 13: Enter wrong OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("Wrong_OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify the error message is displayed under OTP input field, Message: E1389 رمز OTP غير صالح");
        app.sendContractForApprovalPage.verifyOTPErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_152_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 14: Enter OTP Number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 15: Click on (التحقق من الهوية)");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        app.manualRenewalPage.AssessmentOfManualRenewalAsLessor("Good");
        logger.info("Step 16: Verify 'تمت الموافقة بنجاح' message is displayed");
        app.sendContractForApprovalPage.verifyApprovedSubmittedMessageIsDisplayed();
        app.manualRenewalPage.AssessmentOfManualRenewalAsLessor("Good");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_153_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 14: Verify user is able to input OTP successfully");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 15: Click on (التحقق من الهوية)");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        app.manualRenewalPage.AssessmentOfManualRenewalAsLessor("Good");
        logger.info("Step 16: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 17: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 18: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 19: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 20: Verify the status of contract change to ( بانتظار موافقة المستأجر )");
        CommonMethodsPage.verifyContractStatus("بانتظار موافقة المستأجر");
    }

    //---------------------Manual_Renewal_Tenant_Reject------------------------------
    //-------------------------------------------------------------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_154_ManualRenewal(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_155_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("New_Contract"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_156_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify ( الموافقة على العقد ) option is displayed");
        CommonMethodsPage.KebabMenuOptions("الموافقة على العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_157_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Verify the user navigate to (خطوات الموافقة على العقد)");
        app.sendContractForApprovalPage.verifyContractApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_158_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify the user navigate to (مراجعة معلومات العقد)");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_159_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (السابق)  button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 10: Verify the user navigate back to (خطوات الموافقة على العقد) page");
        app.sendContractForApprovalPage.verifyContractApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_160_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_161_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Verify (لماذا ترغب بالرفض) radio buttons is clickable");
        CommonMethodsPage.clickRejectReasonRadioButtons();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_162_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Verify (رفض العقد) button is not clickable");
        CommonMethodsPage.verifyTheRejectButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_163_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Verify (رفض العقد) button is not clickable");
        CommonMethodsPage.verifyTheRejectButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_164_ManualRenewal (Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11:Verify the user able to enter text on (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_165_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_166_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Verify the user remains in the same (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_167_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Verify the user navigate back to (مراجعة معلومات العقد) page");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_168_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Verify The user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_169_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Verify user is able to input OTP successfully");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_170_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Click on  (إلغاء) button");
        app.sendContractForApprovalPage.verifyVerificationCodeIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Verify the user navigate back to (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_171_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Verify the (التحقق من الهوية) button is disabled");
        CommonMethodsPage.verifyTheVerifyIdentityButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_172_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Enter wrong OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("Wrong_OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify the error message is displayed under OTP input field, Message: E1389 رمز OTP غير صالح");
        app.sendContractForApprovalPage.verifyOTPErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_173_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Enter OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify 'تم إرسال الرفض' message is displayed");
        app.sendContractForApprovalPage.verifyRejectionSubmittedMessageIsDisplayed();
    }

    //---------------------Manual_Renewal_Tenant_Approved------------------------------
    //---------------------------------------------------------------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_174_ManualRenewal(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_175_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("New_Contract"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_176_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify ( الموافقة على العقد ) option is displayed");
        CommonMethodsPage.KebabMenuOptions("الموافقة على العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_177_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Verify the user navigate to (خطوات الموافقة على العقد)");
        app.sendContractForApprovalPage.verifyContractApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_178_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify the user navigate to (مراجعة معلومات العقد)");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_179_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (السابق)  button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 10: Verify the user navigate back to (خطوات الموافقة على العقد) page");
        app.sendContractForApprovalPage.verifyContractApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_180_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify (تأكيد الموافقة على معلومات العقد) checkbox is clickable");
        CommonMethodsPage.contractInformationCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_181_182_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        //TC181 + TC182
        logger.info("Step 09: Verify that (أقر بانه تم مطابقة معلومات المؤجر مع معلومات الصك / أقر بانه تم التحقق من الايبان)checkboxes are clickable");
        CommonMethodsPage.lessorCheckbox();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_183_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (تأكيد الموافقة على بيانات المستأجرين ) checkbox is clickable");
        CommonMethodsPage.tenantsCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_184_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (اقر بأنه تم مطابقة العنوان المذكورعلى الموقع الفعلي) checkbox is clickable");
        CommonMethodsPage.propertyDetailsCheckbox();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_185_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (تأكيد الموافقة على تفاصيل الوحدة) checkbox is clickable");
        CommonMethodsPage.unitDetailsCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_186_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (تأكيد الموافقة على الشروط المالية ) checkbox is clickable");
        CommonMethodsPage.financialTermsCheckbox();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_187_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (تاكيد الموافقة على الشروط والأحكام ) checkbox is clickable");
        CommonMethodsPage.termsConditionsCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_188_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify that (تأكيد الموافقة على الوثائق المرتبطة بالعقد ) checkbox is clickable");
        CommonMethodsPage.capturedDocumentsCheckbox();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_189_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify the user navigate to the (إخلاء مسؤولية) page");
        app.sendContractForApprovalPage.verifyApprovalDisclaimerPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_190_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        CommonMethodsPage.scrollToElement(confirmBTN());
        logger.info("Step 09: (تأكيد) button is not clickable/disabled");
        CommonMethodsPage.verifyConfirmButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_191_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify the (إرسال الموافقة على العقد) button is disabled/not clickable");
        app.sendContractForApprovalPage.verifySubmitContractApprovalButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_192_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Verify the (إرسال الموافقة على العقد) button is is enabled/clickable");
        app.sendContractForApprovalPage.verifySubmitContractApprovalButtonIsEnabled();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_193_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Verify the user navigate back to (مراجعة معلومات العقد) page");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_194_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 13: Verify The user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_195_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 13: Verify user is able to input OTP successfully");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_196_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 13: Click on  (إلغاء) button");
        app.sendContractForApprovalPage.verifyVerificationCodeIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Verify the user navigate back to (إخلاء مسؤولية) page");
        app.sendContractForApprovalPage.verifyApprovalDisclaimerPageIsDisplayed();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_197_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 13: Verify the (التحقق من الهوية) button is disabled");
        CommonMethodsPage.verifyTheVerifyIdentityButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_198_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 13: Enter wrong OTP number");
        app.sendContractForApprovalPage.enterVerificationCode("2428");
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify the error message is displayed under OTP input field, Message: E1389 رمز OTP غير صالح");
        app.sendContractForApprovalPage.verifyOTPErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_199_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 14: Enter OTP Number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 15: Click on (التحقق من الهوية)");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        app.manualRenewalPage.AssessmentOfManualRenewalAsTenant("Bad");
        logger.info("Step 16: Verify 'تمت الموافقة بنجاح' message is displayed");
        app.sendContractForApprovalPage.verifyApprovedSubmittedMessageIsDisplayed();
        app.manualRenewalPage.AssessmentOfManualRenewalAsTenant("Good");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_200_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Verify the status of contract change to ( نشط)");
        CommonMethodsPage.verifyContractStatus("نشط");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_201_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify ( الموافقة على العقد ) option is not visible if the lessor not pay ejar fee");
        CommonMethodsPage.KebabMenuOptions("الموافقة على العقد");
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_202_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify ( الموافقة على العقد ) option is visible if the lessor pay ejar fee");
        CommonMethodsPage.KebabMenuOptions("الموافقة على العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_203_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Verify the status of contract change to (بانتظار موافقة المؤجر)");
        CommonMethodsPage.verifyContractStatus("بانتظار موافقة المؤجر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_204_ManualRenewal(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ManualRenewalContract"));
        logger.info("Step 00: Test Data : " + data);
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
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("New_Contract"));
        logger.info("Step 06: Verify the status of contract is change to  (انتظار رسوم منصة إيجار)");
        CommonMethodsPage.verifyContractStatus("انتظار رسوم منصة إيجار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_RenewalContractAPI_1(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        new APICollection().makeContractReadyForRenewal(data);
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_RenewalContractAPI_2(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        new APICollection().makeContractReadyForRenewal(data);
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_RenewalContractAPI_3(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        new APICollection().makeContractReadyForRenewal(data);
    }
}