package sa.ejar.web.login;

import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class RevokeContract extends NHCWebTest {

    /**
     * Pre Conditions
     * -Create Contracts
     * -Approve from parties
     */

    /**
     * Submit Revoke Contract request (All Payment Settled by Tenant)
     * TC_01 to TC_38
    * */
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
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 06: Verify ( فسخ العقد من طرف واحد ) option is displayed");
        CommonMethodsPage.KebabMenuOptions("فسخ العقد من طرف واحد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 06: Click on  ( فسخ العقد من طرف واحد ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        app.revokeContractPage.verifyRevokeContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
    public void TC_15_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
    public void TC_16_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
    public void TC_17_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 08: Upload an attachment of valid type (PNG, JPEG, GIF, PDF) with file size greater than 20MB");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 08: Upload another attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment_Large_Size"));
        app.revokeContractPage.verifyErrorMessageIsDisplayedForLargeFile();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
    public void TC_19_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
        logger.info("Step 08: Click on \"إلغاء\" button on pop up");
        CommonMethodsPage.clickOnCancelButton();
        app.revokeContractPage.checkRevokeContractRequestPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
        logger.info("Step 08: Click on \"إلغاء\" button on pop up");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
    public void TC_23_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" تسوية جميع المدفوعات  \" radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        app.revokeContractPage.checkAllPaymentSettledRadioButtonIsSelected();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Verify \" التالي \" button is not enabled and user can not continue without selecting any option");
        app.revokeContractPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on\"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_27_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on\"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Click on\"إلغاء\" button on pop up");
        CommonMethodsPage.clickOnCancelButton();
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on\"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Click on\" تأكيد \" button");
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.checkTheContractsPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on\"السابق\" button");
        CommonMethodsPage.clickOnBackButton();
        app.revokeContractPage.checkRequestDetailsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 12: Click on \" التالي \" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on \" تسوية جميع المدفوعات  \" radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_31_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 11: Upload an attachment of any type except (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("Invalid_PDF_Attachment"));
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
    public void TC_32_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 11: Upload an attachment of any type except (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("Invalid_PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on تحميل button");
        CommonMethodsPage.ClickOnAttachment("download");
        CommonMethodsPage.verifyAttachmentHasBeenDownloaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_33_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 11: Upload an attachment of any type except (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("Invalid_PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on إلغاء button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_34_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 11: Upload an attachment of any type except (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("Invalid_PDF_Attachment"));
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
    public void TC_35_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 11: Upload an attachment of any type except (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("Invalid_PDF_Attachment"));
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
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.checkTheContractsPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 11: Upload an attachment of any type except (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("Invalid_PDF_Attachment"));
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
    public void TC_37_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 11: Upload an attachment of any type except (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("Invalid_PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on  تأكيد طلب الفسخ   button");
        app.revokeContractPage.clickOnConfirmRevokeContractButton();
        CommonMethodsPage.verifySuccessPopUpIsDisplayed();
        app.revokeContractPage.getReqNum();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_38_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
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
        logger.info("Step 11: Upload an attachment of any type except (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("Invalid_PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on  تأكيد طلب الفسخ   button");
        app.revokeContractPage.clickOnConfirmRevokeContractButton();
        logger.info("Step 15: Click on إلغاء button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkTheContractsPage();
    }

    /**
     * Admin approve the Revoke Contract request (All Payment Settled by Tenant)
     * TC_38 to TC_
     * */
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
        logger.info("Step 02: Click on \" الطلبات \" tab");

        logger.info("Step 03: Click on \"عرض جميع العقود\"");

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
        logger.info("Step 11: Upload an attachment of any type except (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("Invalid_PDF_Attachment"));
        logger.info("Step 12: Click on  التالي  button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  تسوية جميع المدفوعات   radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        logger.info("Step 14: Click on التالي button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on  تأكيد طلب الفسخ   button");
        app.revokeContractPage.clickOnConfirmRevokeContractButton();
        logger.info("Step 15: Click on إلغاء button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkTheContractsPage();
    }

}


