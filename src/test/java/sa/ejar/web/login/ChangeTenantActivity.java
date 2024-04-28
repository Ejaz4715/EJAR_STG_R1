package sa.ejar.web.login;

import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class ChangeTenantActivity extends NHCWebTest {

    /**
     * Pre Conditions
     * -Create Contracts
     * -Approve from parties
     */



    /**
     * Submit Change Commercial Activity request
     * TC_01 to TC_
     * */
    @Test(dataProvider = "testDataProvider")
    public void TC_01_ChangeTenantActivity(Map<String, String> data) throws Exception {
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
    public void TC_21_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("WGAV74YE");
        app.changeTenantActivityPage.assertRequestDetails();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("WGAV74YEF");
        app.changeTenantActivityPage.assertInvalidRequest();
    }
}
