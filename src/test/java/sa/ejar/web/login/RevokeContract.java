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
        app.addResidentialContractPage.clickContractsBtn();
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( فسخ العقد من طرف واحد ) option");
        app.commonMethodsPage.ClickOnKebabMenuOption("فسخ العقد من طرف واحد");
        app.revokeContractPage.verifyRevokeContractPageIsDisplayed();
    }

}
