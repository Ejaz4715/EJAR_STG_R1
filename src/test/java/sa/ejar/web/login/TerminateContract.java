package sa.ejar.web.login;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;

import java.util.Map;

import static com.testcrew.base.WebBaseTest.logger;

public class TerminateContract extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void TC_01_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 03: Navigate to Contracts > View Contracts");
        app.addResidentialContractPage.clickContractsBtn();
        app.commonMethodsPage.selectViewAllContractsButton();

    }
    @Test(dataProvider = "testDataProvider")
    public void TC_02_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 03: Navigate to Contracts > View Contracts");
        app.addResidentialContractPage.clickContractsBtn();
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Search By Contract Number");
        app.commonMethodsPage.clickFilterBtnOnViewAllContractsPage();
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));

    }
    @Test(dataProvider = "testDataProvider")
    public void TC_03_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 03: Navigate to Contracts > View Contracts");
        app.addResidentialContractPage.clickContractsBtn();
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Search By Contract Number");
        app.commonMethodsPage.clickFilterBtnOnViewAllContractsPage();
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));

    }
    @Test(dataProvider = "testDataProvider")
    public void TC_04_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 03: Navigate to Contracts > View Contracts");
        app.addResidentialContractPage.clickContractsBtn();
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Search By Contract Number");
        app.commonMethodsPage.clickFilterBtnOnViewAllContractsPage();
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));

    }
    @Test(dataProvider = "testDataProvider")
    public void TC_05_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 03: Navigate to Contracts > View Contracts");
        app.addResidentialContractPage.clickContractsBtn();
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Search By Contract Number");
        app.commonMethodsPage.clickFilterBtnOnViewAllContractsPage();
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));


        app.commonMethodsPage.clickOnNextButton();
        app.terminateContractPage.checkTheRequestTerminationText();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 03: Navigate to Contracts > View Contracts");
        app.addResidentialContractPage.clickContractsBtn();
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Search By Contract Number");
        app.commonMethodsPage.clickFilterBtnOnViewAllContractsPage();
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));


        app.commonMethodsPage.clickOnCancelButton();
        app.terminateContractPage.checkTheContractsPage();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter OTP Number");
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 03: Navigate to Contracts > View Contracts");
        app.addResidentialContractPage.clickContractsBtn();
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Search By Contract Number");
        app.commonMethodsPage.clickFilterBtnOnViewAllContractsPage();
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        app.commonMethodsPage.clickOnNextButton();
        app.terminateContractPage.selectRequestingParty();
    }
}
