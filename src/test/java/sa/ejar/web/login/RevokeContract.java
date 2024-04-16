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
        logger.info("Step 02: Navigate to Contracts > View Contracts");
        app.addResidentialContractPage.clickContractsBtn();
        app.commonMethodsPage.selectViewAllContractsButton();
        app.commonMethodsPage.clickFilterBtnOnViewAllContractsPage();
        app.commonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
    }
}
