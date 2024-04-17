package sa.ejar.web.login;

import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;

import java.util.Map;

public class RevokeContract extends NHCWebTest {

    /** Pre Conditions
     * -Create Contracts
     * -Approve from parties
     * */

    
    @Test(dataProvider = "testDataProvider")
    public void TC_01_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.commonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify all the available contracts are displayed");
        app.commonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.commonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.commonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify searched contract is appearing");
        app.commonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.commonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.commonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Verify ( فسخ العقد من طرف واحد ) option is displayed");
        app.commonMethodsPage.KebabMenuOptions("فسخ العقد من طرف واحد");
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_04_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.commonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.commonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( فسخ العقد من طرف واحد ) option");
        app.commonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        app.revokeContractPage.verifyRevokeContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.commonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.commonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        app.commonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        app.commonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Verify contracts page is displayed ");
        app.commonMethodsPage.checkTheContractsPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.commonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.commonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        app.commonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify Revoke Contract Request Page is appearing");
        app.revokeContractPage.checkRevokeContractRequestPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.commonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.commonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        app.commonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on السابق button");
        app.commonMethodsPage.clickOnBackButton();
        app.revokeContractPage.verifyRevokeContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.commonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.commonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        app.commonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter text in \"رقم إقرار التنفيذ\" input field");
        app.revokeContractPage.enterExecutionOrderNumber(data.get("ExecutionOrderNumber"));
        app.revokeContractPage.checkExecutionOrderNumberIsEntered(data.get("ExecutionOrderNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.commonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.commonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        app.commonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter date greater than current date in \" تاريخ إقرار\" input field");
        String currentDate = java.time.LocalDate.now().toString();
        String [] arrDate = currentDate.split("-");
        app.revokeContractPage.enterExecutionOrderDate(currentDate);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_Revoke(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.commonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.commonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  ( فسخ العقد من طرف واحد ) option > Click on Cancel (إلغاء) button");
        app.commonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter date greater than current date in \" تاريخ إقرار\" input field");
        app.revokeContractPage.enterExecutionOrderDate(data.get("ExecutionOrderDate"));
        app.revokeContractPage.checkExecutionOrderDateIsEntered(data.get("ExecutionOrderDate"));
    }
}
