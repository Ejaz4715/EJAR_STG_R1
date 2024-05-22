package sa.ejar.web.login;

import com.testcrew.manager.TestDataManager;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class SendContractForApproval extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void TC_01_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_SendContractForApproval(Map<String, String> data) throws Exception {
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
    public void TC_03_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify (عرض العقد) option is displayed");
        CommonMethodsPage.KebabMenuOptions("عرض العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: The  (خطوات العقد) page is displayed");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Verify the user navigate to (معاينة العقد) section");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on (تحميل مسودة العقد)");
        app.sendContractForApprovalPage.clickOnDownloadDraftCopyButton();
        logger.info("Step 10: Verify the user able to download the (مسودة العقد) ");
        CommonMethodsPage.verifyNewTabIsOpened();


    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Verify the user remains in the same (معاينة العقد) section");
        app.sendContractForApprovalPage.verifyPreviewContractSectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify the user navigate back to (خطوات العقد) page");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10:Verify the user navigate to (معاينة اتفاقية الوساطة) section");
        app.sendContractForApprovalPage.verifyPreviewBrokerageAgreementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (السابق)  button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 11:Verify the user moves to previous section (معاينة العقد)");
        app.sendContractForApprovalPage.verifyPreviewContractSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Verify the user remains in the same (معاينة اتفاقية الوساطة) section");
        app.sendContractForApprovalPage.verifyPreviewBrokerageAgreementSectionIsDisplayed();

    }


    @Test(dataProvider = "testDataProvider")
    public void TC_14_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Verify the user navigate back to (خطوات العقد) page");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة)  button");
        app.sendContractForApprovalPage.clickOnAddButton();
        logger.info("Step 11: Verify the user navigate to (نطاق الإتفاقية) page ");
        app.sendContractForApprovalPage.verifyAgreementScopePageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تعديل)  button");
        app.sendContractForApprovalPage.clickOnEditButton();
        logger.info("Step 11: Verify the user navigate to (نطاق الإتفاقية) page ");
        app.sendContractForApprovalPage.verifyAgreementScopePageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة)  button");
        app.sendContractForApprovalPage.clickOnAddButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة)  button");
        app.sendContractForApprovalPage.clickOnAddButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Verify the user remains in the same (نطاق الإتفاقية) page");
        app.sendContractForApprovalPage.verifyAgreementScopePageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة)  button");
        app.sendContractForApprovalPage.clickOnAddButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Verify the user navigate back to (معاينة اتفاقية الوساطة) section");
        app.sendContractForApprovalPage.verifyPreviewBrokerageAgreementSectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة)  button");
        app.sendContractForApprovalPage.clickOnAddButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Verify the user navigate back to (معاينة اتفاقية الوساطة) section");
        app.sendContractForApprovalPage.verifyPreviewBrokerageAgreementSectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11: Verify the user navigate to (بنود وشروط إضافية) page");
        app.sendContractForApprovalPage.verifyAdditionalTermsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Verify the user remains in the same (بنود وشروط إضافية) page");
        app.sendContractForApprovalPage.verifyAdditionalTermsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Verify the user navigate back to (معاينة اتفاقية الوساطة) section");
        app.sendContractForApprovalPage.verifyPreviewBrokerageAgreementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11: Verify the user able to click (بنود وشروط إضافية) switch button");
        app.sendContractForApprovalPage.clickAdditionalTermsSwitchButton();
        app.sendContractForApprovalPage.verifyAdditionalTermsSwitchButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11:  Click on (إضافة بند آخر) button");
        app.sendContractForApprovalPage.clickOnAddAnotherAdditionalTermsButton();
        logger.info("Step 12:  Pop up window is displayed with title (إضافة بند آخر)");
        app.sendContractForApprovalPage.verifyAddAnotherAdditionalTermsPopupWindowIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_27_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11:  Click on (إضافة بند آخر) button");
        app.sendContractForApprovalPage.clickOnAddAnotherAdditionalTermsButton();
        logger.info("Step 12:  Enter (بنود وشروط إضافية)  textarea");
        app.sendContractForApprovalPage.enterAdditionalTerms(data.get("Additional_Terms"));
        logger.info("Step 13:  Verify (بنود وشروط إضافية)  has been entered");
        app.sendContractForApprovalPage.verifyAdditionalTermsHasBeenEntered(data.get("Additional_Terms"));

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11:  Click on (إضافة بند آخر) button");
        app.sendContractForApprovalPage.clickOnAddAnotherAdditionalTermsButton();
        logger.info("Step 12:  Click on (إغلاق)  button");
        CommonMethodsPage.clickOnCloseButton();
        logger.info("Step 13: Verify the user remains in the same (بنود وشروط إضافية) page");
        app.sendContractForApprovalPage.verifyAdditionalTermsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11:  Click on (إضافة بند آخر) button");
        app.sendContractForApprovalPage.clickOnAddAnotherAdditionalTermsButton();
        logger.info("Step 12:  Enter (بنود وشروط إضافية)  textarea");
        app.sendContractForApprovalPage.enterAdditionalTerms(data.get("Additional_Terms"));
        logger.info("Step 13: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 14: Verify the user remains in the same page with entered (بنود وشروط إضافية)");
        app.sendContractForApprovalPage.verifyAdditionalTermsPageIsDisplayed();
        app.sendContractForApprovalPage.verifyEnteredAdditionalTerms(data.get("Additional_Terms"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11:  Click on (إضافة بند آخر) button");
        app.sendContractForApprovalPage.clickOnAddAnotherAdditionalTermsButton();
        logger.info("Step 12: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Verify an error message (فشل التحقق من الصحة) is displayed ");
        app.sendContractForApprovalPage.verifyAddAnotherAdditionalErrorMessageIsDisplayed("translation missing: ar.translation missing: ar.activerecord.errors.models.domain/brokerage_agreement/model/brokerage_agreement_custom_term.attributes.content.blank");
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_31_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11: Click on  (تعديل)  button");
        app.sendContractForApprovalPage.clickOnEditButton();
        logger.info("Step 12: Pop up window is displayed with title (إضافة بند آخر)");
        app.sendContractForApprovalPage.verifyAddAnotherAdditionalTermsPopupWindowIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11: Click on  (تعديل)  button");
        app.sendContractForApprovalPage.clickOnEditButton();
        logger.info("Step 12: Click on  (إزالة)  button");
        CommonMethodsPage.clickOnRemoveButton();
        logger.info("Step 13: Verify the user remains in the same page and entered additional terms is removed");
        app.sendContractForApprovalPage.verifyEnteredAdditionalTermsIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_33_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
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
        logger.info("Step 08: Click on  (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on  (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إضافة شروطا إضافية)  button");
        app.sendContractForApprovalPage.clickAddAnAdditionalTermsButton();
        logger.info("Step 11: Click on (إضافة بند آخر) button");
        app.sendContractForApprovalPage.clickOnAddAnotherAdditionalTermsButton();
        logger.info("Step 12: Enter (بنود وشروط إضافية)  textarea");
        app.sendContractForApprovalPage.enterAdditionalTerms(data.get("Additional_Terms"));
        logger.info("Step 13: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 14: Click on (تأكيد الشروط والأحكام) button");
        app.sendContractForApprovalPage.clickOnConfirmTermsAndConditionsButton();
        logger.info("Step 15: Verify the user navigate back to (معاينة اتفاقية الوساطة) section");
        app.sendContractForApprovalPage.verifyPreviewBrokerageAgreementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_34_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on (الاستمرار في دفع الرسوم) button");
        app.sendContractForApprovalPage.clickOnContinueToPayingFeesButton();
        logger.info("Step 11: Verify the user navigate to (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_35_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on (الاستمرار في دفع الرسوم) button");
        app.sendContractForApprovalPage.clickOnContinueToPayingFeesButton();
        logger.info("Step 11: Click on  (السابق)  button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 12: Verify the user moves to previous section (معاينة اتفاقية الوساطة)");
        app.sendContractForApprovalPage.verifyPreviewBrokerageAgreementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on (الاستمرار في دفع الرسوم) button");
        app.sendContractForApprovalPage.clickOnContinueToPayingFeesButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_37_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on (الاستمرار في دفع الرسوم) button");
        app.sendContractForApprovalPage.clickOnContinueToPayingFeesButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Verify the user remains in the same (دفع رسوم إيجار) section");
        app.sendContractForApprovalPage.verifyPayingEjarFeesSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_38_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on (الاستمرار في دفع الرسوم) button");
        app.sendContractForApprovalPage.clickOnContinueToPayingFeesButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Verify the user navigate back to (خطوات العقد) page");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_39_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on (الاستمرار في دفع الرسوم) button");
        app.sendContractForApprovalPage.clickOnContinueToPayingFeesButton();
        logger.info("Step 11: Verify the (تأكيد وإرسال) button is disabled/not clickable");
        CommonMethodsPage.verifyTheConfirmAndSubmitButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_40_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on (الاستمرار في دفع الرسوم) button");
        app.sendContractForApprovalPage.clickOnContinueToPayingFeesButton();
        logger.info("Step 11: Click on (إخلاء مسؤولية) checkbox");
        CommonMethodsPage.clickOnDisclaimerCheckbox();
        logger.info("Step 12: Verify the (تأكيد وإرسال) button is enabled/clickable");
        CommonMethodsPage.verifyTheConfirmAndSubmitButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_41_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on (الإرسال للتوثيق)  button");
        CommonMethodsPage.clickOnSubmitForApprovalBTN();
        logger.info("Step 09: Click on (التالي)  button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on (الاستمرار في دفع الرسوم) button");
        app.sendContractForApprovalPage.clickOnContinueToPayingFeesButton();
        logger.info("Step 11: Click on (إخلاء مسؤولية) checkbox");
        CommonMethodsPage.clickOnDisclaimerCheckbox();
        logger.info("Step 12: Click on (تأكيد وإرسال) button");
        CommonMethodsPage.clickOnConfirmAndSubmitButton();
        logger.info("Step 13: Click on rating buttons");
        CommonMethodsPage.clickRatingButtons();
        logger.info("Step 14: Click on (إرسال) button");
        CommonMethodsPage.clickOnSubmitButton();
        logger.info("Step 15:Verify popup message (تم تقديم الرد) is displayed");
        CommonMethodsPage.verifyTheSurveyIsSuccessfullySubmittedDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_42_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        CommonMethodsPage.checkRequestStatus("بانتظار موافقة الأطراف");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_43_SendContractForApproval(Map<String, String> data) throws Exception {
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
    public void TC_44_SendContractForApproval(Map<String, String> data) throws Exception {
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
    public void TC_45_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Verify (الموافقة على العقد) option is displayed");
        CommonMethodsPage.KebabMenuOptions("الموافقة على العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_46_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Verify the user navigate to (خطوات الموافقة على العقد)");
        app.sendContractForApprovalPage.verifyContractApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_47_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Verify the user navigate to (مراجعة معلومات العقد)");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_48_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09:  Click on  (تحميل)  button");
        app.sendContractForApprovalPage.clickOnDownloadButton();
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_49_SendContractForApproval(Map<String, String> data) throws Exception {
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
    public void TC_50_SendContractForApproval(Map<String, String> data) throws Exception {
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
    public void TC_51_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Verify the (رفض العقد) is Enabled");
        app.sendContractForApprovalPage.verifyRejectTheContractButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_52_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Verify the (رفض العقد) is Disabled");
        app.sendContractForApprovalPage.verifyRejectTheContractButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_53_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Verify the (رفض العقد) is Disabled");
        app.sendContractForApprovalPage.verifyRejectTheContractButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_54_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10:Verify the user able to enter text on (اكتب سبب الرفض) textarea ");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        app.sendContractForApprovalPage.verifyRejectionContractReasonHasBeenEntered("Rejection_Contract_Reason");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_55_SendContractForApproval(Map<String, String> data) throws Exception {
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
    public void TC_56_SendContractForApproval(Map<String, String> data) throws Exception {
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
    public void TC_57_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 12: Verify the user navigate back to (مراجعة معلومات العقد)");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_58_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Verify The user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_59_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: The OTP code has been input successfully");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_60_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Click on  (إلغاء) button");
        app.sendContractForApprovalPage.verifyVerificationCodeIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Verify the user navigate back to (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_61_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Verify the  (التحقق من الهوية)  button is disabled  ");
        app.sendContractForApprovalPage.verifyIdentityVerificationButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_62_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Enter wrong OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("Wrong_OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify the error message is displayed under OTP input field, Message:  غير صالح OTP   رمز ");
        app.sendContractForApprovalPage.verifyOTPErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_63_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Enter OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify the user navigate to (تم إرسال الرفض) page");
        app.sendContractForApprovalPage.verifyRejectionSubmittedMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_64_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Verify the user navigate to (مراجعة اتفاقية الوساطة) page");
        app.sendContractForApprovalPage.verifyReviewAgreementPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_65_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (السابق)  button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 11: Verify the user navigate to (مراجعة معلومات العقد) page");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_66_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (رفض)  button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_67_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (رفض)  button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 12: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 13: Verify the (رفض العقد) is Enabled");
        app.sendContractForApprovalPage.verifyRejectTheContractButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_68_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (رفض)  button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Verify the (رفض العقد) is Disabled");
        app.sendContractForApprovalPage.verifyRejectTheContractButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_69_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (رفض)  button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 12: Verify the (رفض العقد) is Disabled");
        app.sendContractForApprovalPage.verifyRejectTheContractButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_70_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (رفض)  button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11:Verify the user able to enter text on (اكتب سبب الرفض) textarea ");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        app.sendContractForApprovalPage.verifyRejectionContractReasonHasBeenEntered("Rejection_Contract_Reason");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_71_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (رفض)  button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_72_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (رفض)  button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Verify the user remains in the same (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_73_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (رفض)  button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Verify the user navigate back to (مراجعة اتفاقية الوساطة) page");
        app.sendContractForApprovalPage.verifyReviewAgreementPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_74_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify the user navigate to the (إخلاء مسؤولية) page");
        app.sendContractForApprovalPage.verifyApprovalDisclaimerPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_75_SendContractForApproval(Map<String, String> data) throws Exception {
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
    public void TC_76_SendContractForApproval(Map<String, String> data) throws Exception {
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
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_77_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 12: Verify the user navigate back to (مراجعة اتفاقية الوساطة) page");
        app.sendContractForApprovalPage.verifyReviewAgreementPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_78_SendContractForApproval(Map<String, String> data) throws Exception {
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
    public void TC_79_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (تأكيد)  button");
        app.sendContractForApprovalPage.verifyReviewAgreementPageIsDisplayed();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 13: Click on  (إلغاء)  button");
        app.sendContractForApprovalPage.verifyVerificationCodeIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Verify the user navigate back to the (إخلاء مسؤولية) page");
        app.sendContractForApprovalPage.verifyApprovalDisclaimerPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_80_SendContractForApproval(Map<String, String> data) throws Exception {
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
        logger.info("Step 13: Enter OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Click on rating buttons");
        CommonMethodsPage.clickRatingButtons();
        logger.info("Step 16: Click on (إرسال) button");
        CommonMethodsPage.clickOnSubmitButton();
        logger.info("Step 17:Verify popup message (تم تقديم الرد) is displayed");
        CommonMethodsPage.verifyTheSurveyIsSuccessfullySubmittedDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_81_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.checkRequestStatus("بانتظار موافقة المستأجر");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_82_SendContractForApproval(Map<String, String> data) throws Exception {
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
    public void TC_83_SendContractForApproval(Map<String, String> data) throws Exception {
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
    public void TC_84_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify (الموافقة على العقد) option is displayed");
        CommonMethodsPage.KebabMenuOptions("الموافقة على العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_85_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Verify the user navigate to (خطوات الموافقة على العقد)");
        app.sendContractForApprovalPage.verifyContractApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_86_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
    public void TC_87_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09:  Click on  (تحميل)  button");
        app.sendContractForApprovalPage.clickOnDownloadButton();
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_88_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
    public void TC_89_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
    public void TC_90_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Verify the (رفض العقد) is Enabled");
        app.sendContractForApprovalPage.verifyRejectTheContractButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_91_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Verify the (رفض العقد) is Disabled");
        app.sendContractForApprovalPage.verifyRejectTheContractButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_92_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        logger.info("Step 11: Verify the (رفض العقد) is Disabled");
        app.sendContractForApprovalPage.verifyRejectTheContractButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_93_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10:Verify the user able to enter text on (اكتب سبب الرفض) textarea ");
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        app.sendContractForApprovalPage.verifyRejectionContractReasonHasBeenEntered("Rejection_Contract_Reason");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_94_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
    public void TC_95_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
    public void TC_96_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        logger.info("Step 12: Verify the user navigate back to (مراجعة معلومات العقد)");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_97_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Verify The user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_98_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: The OTP code has been input successfully");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_99_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Click on  (إلغاء) button");
        app.sendContractForApprovalPage.verifyVerificationCodeIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Verify the user navigate back to (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_100_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Verify the  (التحقق من الهوية)  button is disabled ");
        app.sendContractForApprovalPage.verifyIdentityVerificationButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_101_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Enter wrong OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("Wrong_OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify the error message is displayed under OTP input field, Message:  غير صالح OTP   رمز ");
        app.sendContractForApprovalPage.verifyOTPErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_102_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        app.sendContractForApprovalPage.enterRejectionReason("Rejection_Contract_Reason");
        logger.info("Step 12: Click on  (رفض العقد) button");
        app.sendContractForApprovalPage.clickOnRejectTheContractButton();
        logger.info("Step 13: Enter OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify the user navigate to (تم إرسال الرفض) page");
        app.sendContractForApprovalPage.verifyRejectionSubmittedMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_103_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Verify the user navigate to the (إخلاء مسؤولية) page");
        app.sendContractForApprovalPage.verifyApprovalDisclaimerPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_104_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Verify the (إرسال الموافقة على العقد) button is disabled/not clickable");
        app.sendContractForApprovalPage.verifySubmitContractApprovalButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_105_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 11: Verify the (إرسال الموافقة على العقد) button is is enabled/clickable");
        app.sendContractForApprovalPage.verifySubmitContractApprovalButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_106_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Verify the user navigate back to (مراجعة معلومات العقد)");
        app.sendContractForApprovalPage.verifyReviewTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_107_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 11: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 12: Verify The user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_108_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 11: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 12: Click on  (إلغاء)  button");
        app.sendContractForApprovalPage.verifyVerificationCodeIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Verify the user navigate back to the (إخلاء مسؤولية) page");
        app.sendContractForApprovalPage.verifyApprovalDisclaimerPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_109_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (الموافقة على العقد)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        logger.info("Step 08: Click on  (لنبدأ)  button");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        logger.info("Step 09: Click on  (تأكيد)  button");
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 11: Click on  (إرسال الموافقة على العقد) button");
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        logger.info("Step 12: Enter OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 13: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 14: Rate the survey");
        CommonMethodsPage.clickOnYesRadioButtons();
        CommonMethodsPage.clickRatingButtons();
        logger.info("Step 15: Click on (إرسال) button");
        CommonMethodsPage.clickOnSubmitButton();
        logger.info("Step 16:Verify popup message (تم تقديم الرد) is displayed");
        CommonMethodsPage.verifyTheSurveyIsSuccessfullySubmittedDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_110_SendContractForApproval(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        CommonMethodsPage.checkRequestStatus("نشط");
    }
}
