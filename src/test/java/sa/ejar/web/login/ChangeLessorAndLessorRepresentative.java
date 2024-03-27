package sa.ejar.web.login;

import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import java.util.Map;


public class ChangeLessorAndLessorRepresentative extends NHCWebTest {

    //-----------------More Than 3 Month , One Owner Without Lessor Representative-----------

    @Test(dataProvider = "testDataProvider")
    public void VerifyAddLessorRepresentative(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("UserName"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to OwnerShip Document Page");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument("1-0002");
        app.changeLessorAndLessorRepresentativePage.AddNewLessorRepresentativeToOwnerShipDocument();
    }

    @Test(dataProvider = "testDataProvider")
    public void VerifyUpdateLessorRepresentative(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("UserName"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to OwnerShip Document Page");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument("1-0002");
        app.changeLessorAndLessorRepresentativePage.updateCurrentLessorRepresentativeDFromOwnerShipDocument();
        app.changeLessorAndLessorRepresentativePage.addNewLessorRepresentative();
        app.changeLessorAndLessorRepresentativePage.addLessorRepresentativeLegalDocument();
        app.changeLessorAndLessorRepresentativePage.uploadAttachment();
        app.changeLessorAndLessorRepresentativePage.ConfirmChangeLessorRepresentative();
    }

    @Test(dataProvider = "testDataProvider")
    public void VerifyDeleteLessorRepresentative(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("UserName"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to OwnerShip Document Page");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument("1-0002");
        app.changeLessorAndLessorRepresentativePage.deleteLessorRepresentativeToOwnerShipDocument();
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument("1-0002");
        app.changeLessorAndLessorRepresentativePage.assertLessorRepresentativeDeleted();
    }

    @Test(dataProvider = "testDataProvider")
    public void VerifyUpdateCurrentLessor(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("UserName"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to OwnerShip Document Page");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument("1-0002");
        app.changeLessorAndLessorRepresentativePage.AddNewLessorRepresentativeToOwnerShipDocument();
    }
}
