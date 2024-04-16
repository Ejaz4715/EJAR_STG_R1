package sa.ejar.web.login;

import com.testcrew.web.Browser;
import sa.ejar.web.base.NHCWebTest;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.Map;

public class Login extends NHCWebTest {

    //----------------------------------------Login-------------------------------------------------
    @Test(dataProvider = "testDataProvider")
    public void userLogin(Map<String, String> data) throws Exception {
//        Browser.driver.close();
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
//        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC09_VerifyAdminAbleToLoginToEjarSystem(Map<String, String> data) throws Exception {
        //TC04_Verify Admin able to log in to Ejar successfully.
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step : Login As Admin Enter valid UserName, Enter Password, click Login");
//        app.loginPage.changeUILanguage("ar");
        app.loginPage.enterAdminUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
//        Browser.waitForSeconds(6);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC05_VerifyAdminNotAbleToLoginToEjarSystemWithInvalidData(Map<String, String> data) throws Exception {
        //TC04_Verify Admin able to log in to Ejar successfully.
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
//        app.loginPage.changeUILanguage("ar");
        logger.info("Step : Login As Admin Enter invalid UserName,Enter invalid Password,click Login");
        app.loginPage.enterAdminUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
//        Browser.waitForSeconds(6);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC08_VerifyBoOfficerAbleToLoginToEjarSystem(Map<String, String> data) throws Exception {
        //TC11_VerifyBoOfficerAbleToLoginToEjarSystem
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
//        app.loginPage.changeUILanguage("ar");
        logger.info("Step : As Bo Officer/Manager Enter UserName,Enter Password,click Login");
        app.loginPage.enterAdminUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
    }

//    @Test(dataProvider = "testDataProvider")
//    public void TC07_VerifyBoOfficerAbleToLoginAndActiveTheAccount(Map<String, String> data) throws Exception {
//        data.putAll(TestDataManager.readDependantGlobalTestData("BO_Registration"));
//        //TC11_VerifyBoOfficerAbleToLoginToEjarSystem
//        logger.info("Step 00: Test Data : " + data.toString());
//        app.openApplication(data);
////        app.loginPage.changeUILanguage("ar");
//        logger.info("Step 01: Login As Bo Officer Enter UserName,Enter Password,click Login");
//        app.loginPage.enterAdminUsername(data.get("BO_username"));
//        app.loginPage.enterPassword(data.get("Password"));
//        app.loginPage.clickLogin();
//        app.loginPage.enterVerificationCode(data.get("OTP"));
//        logger.info("Step 02: Fill Account Activation Details");
//        app.registrationPage.clickToAccountActivation();
//        app.registrationPage.selectBOCity("الرياض");
//        app.registrationPage.clickCityDropdown();
////        app.registrationPage.clickDistrictDropdown();
////        app.registrationPage.selectBODistrict("ام الحمام الشرقي");
//        app.registrationPage.fillAddress();
//        app.registrationPage.selectOfficeLocated();
//        app.registrationPage.clickOnFindOnMap();
//        logger.info("Step 03: Complete Ejar Training Course");
//        app.registrationPage.completeEjarTraining();
//    }

    //---------------------------UAT----------------------------------------------

    @Test(dataProvider = "testDataProvider")
    public void VerifyBoOfficerAbleToLoginToEarSystemInUATEnvironment(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        logger.info("Step : As Bo Officer/Manager Enter UserName,Enter Password,click Login");
        app.loginPage.enterAdminUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
    }
}