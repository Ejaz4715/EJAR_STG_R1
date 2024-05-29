package sa.ejar.web.login;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class RevokeContract extends NHCWebTest {

    /**
     * Submit Revoke Contract request (All Payment Settled by Tenant)
     * TC_01 to TC_38
     */
    @Test(dataProvider = "testDataProvider")
    public void TC_01_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
    public void TC_02_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_03_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify ( فسخ العقد من طرف واحد ) option is displayed");
        CommonMethodsPage.KebabMenuOptions("فسخ العقد من طرف واحد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        app.revokeContractPage.verifyRevokeContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Verify contracts page is displayed ");
        CommonMethodsPage.checkTheContractsPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify Revoke Contract Request Page is appearing");
        app.revokeContractPage.checkRevokeContractRequestPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on السابق button");
        CommonMethodsPage.clickOnBackButton();
        app.revokeContractPage.verifyRevokeContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in \"رقم إقرار التنفيذ\" input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        app.revokeContractPage.checkExecutionOrderNumberIsEntered(data.get("ExecutionOrderNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter date greater than current date in \" تاريخ إقرار\" input field");
        String futureDate = CommonMethodsPage.getCurrentDate(1, 0, 0);
        app.revokeContractPage.enterExecutionOrderDate(futureDate);
        app.revokeContractPage.verifyGreaterExecutionDateErrorMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter valid gregorian date in \" تاريخ إقرار\" input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        app.revokeContractPage.checkExecutionOrderDateIsEntered(data.get("ExecutionOrderDate"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on calender Icon");
        app.revokeContractPage.clickOnCalenderIcon();
        logger.info("Step 09: Verify Calendar pop up is displayed");
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in \" ملاحظات \" input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 09: Verify Calendar pop up is displayed");
        app.revokeContractPage.verifyNoteIsTextEntered(data.get("Note"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter date greater than current date in \" تاريخ إقرار\" input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 09: Verify equivalent Hijri date is displayed under \"تاريخ إقرار\"  input field");
        app.revokeContractPage.verifyHijriDateIsDisplayedUnderExecutionOrderDate();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_14_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Upload attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Upload attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 09: Upload another attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.verifyAttachmentsAreUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Upload attachment of valid type (PNG, JPEG, GIF, PDF) having large size");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment_Large_Size"));
        app.revokeContractPage.verifyErrorMessageIsDisplayedForLargeFile();
    }

    //Failed manually
    @Test(dataProvider = "testDataProvider")
    public void TC_17_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in \"رقم إقرار التنفيذ\" input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in \" تاريخ إقرار\" input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in \" ملاحظات \" input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of any type except (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("Invalid_PDF_Attachment"));
        logger.info("Step 12: Verify user can not continue");
        app.revokeContractPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (Next) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
        logger.info("Step 08: Click on \"إلغاء\" button on pop up");
        CommonMethodsPage.clickOnCancelButton();
        app.revokeContractPage.checkRevokeContractRequestPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (Next) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
        logger.info("Step 08: Click on \"إلغاء\" button on pop up");
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on \"السابق\" button");
        CommonMethodsPage.clickOnBackButton();
        CommonMethodsPage.checkTheContractsPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in \"رقم إقرار التنفيذ\" input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in \" تاريخ إقرار\" input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in \" ملاحظات \" input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in \"رقم إقرار التنفيذ\" input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in \" تاريخ إقرار\" input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in \" ملاحظات \" input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" تسوية جميع المدفوعات  \" radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        app.revokeContractPage.checkAllPaymentSettledRadioButtonIsSelected();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in \"رقم إقرار التنفيذ\" input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in \" تاريخ إقرار\" input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in \" ملاحظات \" input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Verify \" التالي \" button is not enabled and user can not continue without selecting any option");
        app.revokeContractPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in \"رقم إقرار التنفيذ\" input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in \" تاريخ إقرار\" input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in \" ملاحظات \" input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on\"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in \"رقم إقرار التنفيذ\" input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in \" تاريخ إقرار\" input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in \" ملاحظات \" input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on\"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Click on\"إلغاء\" button on pop up");
        CommonMethodsPage.clickOnCancelButton();
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_27_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in \"رقم إقرار التنفيذ\" input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in \" تاريخ إقرار\" input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in \" ملاحظات \" input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on\"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Click on\" تأكيد \" button");
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.checkTheContractsPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in \"رقم إقرار التنفيذ\" input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in \" تاريخ إقرار\" input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in \" ملاحظات \" input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on\"السابق\" button");
        CommonMethodsPage.clickOnBackButton();
        app.revokeContractPage.checkRequestDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in \"رقم إقرار التنفيذ\" input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in \" تاريخ إقرار\" input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in \" ملاحظات \" input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" تسوية جميع المدفوعات  \" radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on  عرض  button");
        CommonMethodsPage.ClickOnAttachment("view");
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_31_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on تحميل button");
        CommonMethodsPage.ClickOnAttachment("download");
//        CommonMethodsPage.verifyAttachmentHasBeenDownloaded();
        CommonMethodsPage.verifyNewTabIsOpened();
        //Incomplete
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on إلغاء button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_33_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on إلغاء button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 15: Click on إلغاء button on pop up");
        CommonMethodsPage.clickOnCancelButton();
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_34_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on إلغاء button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 15: Click on إلغاء button on pop up");
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.checkTheContractsPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_35_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on السابق button on pop up");
        CommonMethodsPage.clickOnBackButton();
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on  تأكيد طلب الفسخ   button");
        app.revokeContractPage.clickOnConfirmRevokeContractButton();
        CommonMethodsPage.verifySuccessPopUpIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_37_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on  تأكيد طلب الفسخ   button");
        app.revokeContractPage.clickOnConfirmRevokeContractButton();
        logger.info("Step 15: Click on إغلاق button");
        CommonMethodsPage.clickOnCloseButton();
        CommonMethodsPage.checkTheContractsPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_38_Revoke(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on الطلبات tab > Select عرض الطلبات option");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        CommonMethodsPage.clickOnViewAllRequestsButton();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumber(data.get("ContractNumber"));
        app.revokeContractPage.getReqNumApprove();
    }

    /**
     * Admin approve the Revoke Contract request (All Payment Settled by Tenant)
     * TC_39 to TC_56
     */
    @Test(dataProvider = "testDataProvider")
    public void TC_39_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03:  Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Revoke");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_40_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03:  Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04:  Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05:  Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        CommonMethodsPage.verifySearchedRequestIsDisplayed(data.get("ReqNum_Approval"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_41_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03:  Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04:  Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05:  Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06:  Check request status ");
        CommonMethodsPage.checkRequestStatus("تم الإرسال");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_42_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03:  Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04:  Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05:  Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06:  Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed
                ("سوف يتم تغير حالة الطلب الى قيد الإجراء لحين اتخاذ الإجراء المناسب حيال الطلب وسوف يسند الطلب الى مهامكم.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_43_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03:  Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04:  Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05:  Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06:  Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07:  Click on \" إلغاء \" button on pop up");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifySearchedRequestIsDisplayed(data.get("ReqNum_Approval"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_44_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03:  Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04:  Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05:  Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06:  Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07:  Click on \"  تأكيد  \" button");
        CommonMethodsPage.clickOnConfirmButton();
        app.revokeContractPage.checkRevokeContractRequestPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_45_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03:  Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04:  Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05:  Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06:  Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07:  Click on   إلغاء  button");
        app.revokeContractPage.clickOnCancelButtonOnRevokeRequestPage();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Revoke");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_46_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03:  Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04:  Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05:  Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 10:  Verify the request status is قيد الانتظار ");
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_47_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03:  Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04:  Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05:  Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06:  Click on \" إلغاء التعيين \" button next to the request status ");
        app.revokeContractPage.clickOnUnAssignButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم إلغاء تعيينك لهذا الطلب. يرجى التأكيد لتنفيذ هذا الإجراء");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_48_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03:  Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04:  Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05:  Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06:  Click on \" إلغاء التعيين \" button next to the request status ");
        app.revokeContractPage.clickOnUnAssignButton();
        logger.info("Step 07:  Click on  \" إلغاء \" button ");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        CommonMethodsPage.verifySearchedRequestIsDisplayed(data.get("ReqNum_Approval"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_49_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03:  Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04:  Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05:  Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06:  Click on \" إلغاء التعيين \" button next to the request status ");
        app.revokeContractPage.clickOnUnAssignButton();
        logger.info("Step 07:  Click on \"  تأكيد  \" button ");
        CommonMethodsPage.clickOnConfirmButton();
        Browser.waitForSeconds(2);
        CommonMethodsPage.checkRequestStatus("تم الإرسال");
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_50_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on \"  تأكيد  \" button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 07: Click on \" إلغاء التعيين \" button");
        app.revokeContractPage.clickOnUnAssignButton();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 08: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 09: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        CommonMethodsPage.checkRequestStatus("تم الإرسال");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_51_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on \"  تأكيد  \" button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 08: Click on \" عرض \" button beside attachment");
        CommonMethodsPage.ClickOnAttachment("view");
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_52_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on تحميل button beside attachment");
        CommonMethodsPage.ClickOnAttachment("download");
        CommonMethodsPage.verifyAttachmentHasBeenDownloaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_53_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on \" قبول \" button ");
        CommonMethodsPage.clickOnApproveBTN();
        CommonMethodsPage.verifyConfirmPopUpIsDisplayedAfterApproveRequest();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_54_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on \" قبول \" button ");
        CommonMethodsPage.clickOnApproveBTN();
        logger.info("Step 08: Click on \"إلغاء\" button on pop up ");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        app.revokeContractPage.checkRevokeContractRequestPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_55_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 08: Click on \" قبول \" button ");
        CommonMethodsPage.clickOnApproveBTN();
        logger.info("Step 09: Click on \" تأكيد الموافقة \" button ");
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Revoke");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_56_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval"));
        logger.info("Step 06: Verify the request status is  موافق عليه ");
        CommonMethodsPage.checkRequestStatus("موافق عليه");
    }

    /**
     * Admin Reject the Revoke Contract request (All Payment Settled by Tenant)
     * Pre-requisite - Lessor submits a revoke request (TC_57)
     * TC_57 to TC_66
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_57_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on  تأكيد طلب الفسخ   button");
        app.revokeContractPage.clickOnConfirmRevokeContractButton();
        CommonMethodsPage.verifySuccessPopUpIsDisplayed();
        logger.info("Step 16: Click on الطلبات tab > Select عرض الطلبات option");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        CommonMethodsPage.clickOnViewAllRequestsButton();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumber(data.get("ContractNumber"));
        logger.info("Step 17: Get the request number");
        app.revokeContractPage.getReqNumReject();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_58_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Rejection"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on \"  تأكيد  \" button");
        CommonMethodsPage.clickOnConfirmButton();
        app.revokeContractPage.checkRevokeContractRequestPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_59_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Rejection"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on \" رفض \" button ");
        CommonMethodsPage.clickOnRejectBTN();
        CommonMethodsPage.verifyConfirmPopUpIsDisplayedAfterRejectRequest();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_60_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Rejection"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on \" رفض \" button ");
        CommonMethodsPage.clickOnRejectBTN();
        app.revokeContractPage.enterRejectionReason(data.get("RejectReason"));
        app.revokeContractPage.verifyRejectionReasonHasBeenEntered(data.get("RejectReason"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_61_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Rejection"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on \" رفض \" button ");
        CommonMethodsPage.clickOnRejectBTN();
        app.revokeContractPage.verifyRejectButtonIsDisabledOnPopUp();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_62_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Rejection"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on \" رفض \" button ");
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 08: Click on \"إلغاء\" button on pop up ");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        app.revokeContractPage.checkRevokeContractRequestPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_63_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Rejection"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on  رفض button ");
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 08: Click on رفض  button on pop up ");
        app.revokeContractPage.enterRejectionReason(data.get("RejectReason"));
        logger.info("Step 09: Click on رفض  button on pop up ");
        app.revokeContractPage.clickOnRejectButtonOnPopUp();
        CommonMethodsPage.verifyConfirmPopUpIsDisplayedAfterRejectRequest();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_64_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Rejection"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on  رفض button ");
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 08: Click on رفض  button on pop up ");
        app.revokeContractPage.enterRejectionReason(data.get("RejectReason"));
        logger.info("Step 09: Click on رفض  button on pop up ");
        app.revokeContractPage.clickOnRejectButtonOnPopUp();
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        CommonMethodsPage.verifyConfirmPopUpIsDisplayedAfterRejectRequest();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_65_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Rejection"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on  رفض button ");
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 08: Click on رفض  button on pop up ");
        app.revokeContractPage.enterRejectionReason(data.get("RejectReason"));
        logger.info("Step 09: Click on رفض  button on pop up ");
        app.revokeContractPage.clickOnRejectButtonOnPopUp();
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Revoke");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_66_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Rejection"));
        logger.info("Step 06: Verify the request status is \"مرفوض  \"");
        CommonMethodsPage.checkRequestStatus("مرفوض");
    }

    /**
     * Submit Revoke Contract request (Remaining Final Payment)
     * TC_67 to TC_80
     * Pre-requisite - Lessor initiate the request (TC_67)
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_67_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_68_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" الدفعة النهائية للمستأجر   \" radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        app.revokeContractPage.checkTenantFinalPaymentRadioButtonIsSelected();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_69_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" الدفعة النهائية للمستأجر   \" radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 14: Enter a valid amount equals to remaining amount or less than remaining amount");
        app.terminateContractPage.enterPaymentAmount(data.get("TenantFinalPaymentAmount"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_70_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" الدفعة النهائية للمستأجر   \" radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 14: Enter a valid amount equals to remaining amount or less than remaining amount");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_TenantFinalPaymentAmount"));
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_71_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" الدفعة النهائية للمستأجر   \" radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 14: Enter a valid amount equals to remaining amount or less than remaining amount");
        app.terminateContractPage.enterPaymentAmount(data.get("TenantFinalPaymentAmount"));
        CommonMethodsPage.totalAmount(data.get("TenantFinalPaymentAmount"), CommonMethodsPageObjects.totalAmount());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_72_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" الدفعة النهائية للمستأجر   \" radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 14: Enter a Gregorian date in تاريخ الاستحقاق input field less than current date");
        String date = CommonMethodsPage.getCurrentDate(-2, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.errorMessage("أدنى", CommonMethodsPageObjects.minValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_73_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" الدفعة النهائية للمستأجر   \" radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 14: Enter a greater Gregorian date in تاريخ الاستحقاق input field  ");
        String date = CommonMethodsPage.getCurrentDate(5, 1, 1);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_74_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" الدفعة النهائية للمستأجر   \" radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 14: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_75_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" الدفعة النهائية للمستأجر   \" radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 14: Click on calender icon");
        app.revokeContractPage.clickOnCalenderIcon();
        logger.info("Step 15: Verify calender is displayed");
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_76_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" الدفعة النهائية للمستأجر   \" radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 14: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 15: Verify equivalent Hijri date is displayed under \"تاريخ الاستحقاق\"  input field");
        app.revokeContractPage.verifyHijriDateIsDisplayedUnderExecutionOrderDate();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_77_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Verify \" التالي \" button is not enabled");
        app.revokeContractPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_78_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" الدفعة النهائية للمستأجر   \" radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 14: Enter invalid payment amount");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_TenantFinalPaymentAmount"));
        logger.info("Step 15: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(5, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 16: Verify \" التالي \" button is not enabled");
        app.revokeContractPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_79_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" الدفعة النهائية للمستأجر   \" radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 14: Enter invalid payment amount");
        app.terminateContractPage.enterPaymentAmount(data.get("TenantFinalPaymentAmount"));
        logger.info("Step 15: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 16: Verify \" التالي \" button is not enabled");
        CommonMethodsPage.clickOnNextButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_80_Revoke(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in رقم إقرار التنفيذ input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        logger.info("Step 09: Enter valid gregorian date in تاريخ إقرار input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        logger.info("Step 10: Enter text in  ملاحظات  input field");
        app.revokeContractPage.enterNotesText(data.get("Note"));
        logger.info("Step 11: Upload an attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" الدفعة النهائية للمستأجر   \" radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 14: Enter invalid payment amount");
        app.terminateContractPage.enterPaymentAmount(data.get("TenantFinalPaymentAmount"));
        logger.info("Step 15: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 16: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 16: Click on \" تأكيد طلب الفسخ  \" button");
        app.revokeContractPage.clickOnConfirmRevokeContractButton();
        CommonMethodsPage.verifySuccessPopUpIsDisplayed();
        logger.info("Step 16: Click on الطلبات tab > Select عرض الطلبات option");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        CommonMethodsPage.clickOnViewAllRequestsButton();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumber(data.get("ContractNumber"));
        logger.info("Step 17: Get the request number");
        app.revokeContractPage.getReqNumApproveWithPayment();

    }

    /**
     * Admin approve the Revoke request (With Payment)
     * Only TC_81
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_81_Revoke(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Revoke"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on عرض طلبات فسخ العقد ");
        CommonMethodsPage.clickOnRevokeContractRequestButton();
        logger.info("Step 04: Click on filter button ");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNum_Approval_With_Payment"));
        logger.info("Step 06: Click on  عرض  button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        logger.info("Step 07: Click on \"  تأكيد  \" button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 08: Click on \" قبول \" button ");
        CommonMethodsPage.clickOnApproveBTN();
        logger.info("Step 09: Click on \" تأكيد الموافقة \" button ");
        CommonMethodsPage.clickOnConfirmButton();
    }

    /**
     * Verify Invoices - As Lessor after admin approved the Revoke request (Which has payment due)
     * From TC_82 to TC_87
     */
    @Test(dataProvider = "testDataProvider")
    public void TC_82_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Verify the user is able to view  (الفواتير) page");
        CommonMethodsPage.verifyContractsInvoicesIsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_83_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("ContractNumber"));
        logger.info("Step 06: Verify user is able to view all the invoices of selected contract");
        CommonMethodsPage.verifySearchedContractIsDisplayedForInvoices(data.get("ContractNumber"));

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_84_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("ContractNumber"));
        logger.info("Step 06: Click on new invoice");
        CommonMethodsPage.clickOnNewInvoice();
        logger.info("Step 07: Verify a new invoice having same amount");
        CommonMethodsPage.newAmountForContractInvoice(data.get("TenantFinalPaymentAmount"));

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_85_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("ContractNumber"));
        logger.info("Step 06: Click on new invoice");
        CommonMethodsPage.clickOnNewInvoice();
        logger.info("Step 07: Verify new invoice has same date as entered by lessor");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        CommonMethodsPage.verifyNewInvoiceDateIsSameAsEnteredInRequest(date);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_86_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("ContractNumber"));
        logger.info("Step 06: Verify old invoice has a status مغلقة");
        CommonMethodsPage.verifyInvoiceStatus("old", "مغلقة", CommonMethodsPageObjects.OldInvoiceStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_87_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("ContractNumber"));
        logger.info("Step 06: Click on new invoice");
        CommonMethodsPage.clickOnNewInvoice();
        logger.info("Step 07: Verify new invoice has a status  لم يتم الدفع  ");
        CommonMethodsPage.verifyInvoiceStatus("new", "لم يتم الدفع", CommonMethodsPageObjects.NewInvoiceStatus());
    }
}


