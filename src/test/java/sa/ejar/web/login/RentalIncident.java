package sa.ejar.web.login;

import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class RentalIncident extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void TC_01_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Verify (صفة مقدم الطلب) dropdown list is selected");
        app.rentalIncidentsPage.verifyRequesterTypeIsSelected(data.get("Requester_Type"));
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_02_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Verify (فئة مقدم الطلب) dropdown list is selected");
        app.rentalIncidentsPage.verifyRequesterCategoryIsSelected(data.get("Requester_Category"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Verify the (إختر صفة مقدم الطلب) radio button is selectable");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Verify the user navigate to (بيانات مقدم الطلب)/ (إضافة بيانات مقدم الطلب) page");
        app.rentalIncidentsPage.verifyTheAddRequesterInfoPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Verify the user navigate back to (تسجيل واقعة ايجارية جديدة) page");
        app.rentalIncidentsPage.verifyNewRentalIncidentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Verify the (فئة مقدم الطلب) dropdown list is not selectable if not select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.verifyRequesterCategoryDropdownListIsDisabled();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_07_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Verify (بيانات مقدم الطلب) button is not displaying if not select (إختر صفة مقدم الطلب) radio buttons");
        app.rentalIncidentsPage.verifyAddRequesterInfoButtonIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        app.rentalIncidentsPage.clearPhoneNumber();
        logger.info("Step 09: Verify (تأكيد) button is disabled/not clickable");
        CommonMethodsPage.verifyConfirmButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Verify the user navigate back to (تسجيل واقعة ايجارية جديدة) page");
        app.rentalIncidentsPage.verifyNewRentalIncidentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (تعديل) button");
        CommonMethodsPage.clickOnEditButton();
        logger.info("Step 11: User navigate back to (إضافة بيانات مقدم الطلب) page");
        app.rentalIncidentsPage.verifyTheAddRequesterInfoPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Verify requester information is displaying");
        app.rentalIncidentsPage.verifyRequesterInfoIsDisplayed();
        logger.info("Step 11: Click on delete icon button");
        CommonMethodsPage.clickOnDeleteIconButton();
        logger.info("Step 12: Verify requester information is removed");
        app.rentalIncidentsPage.verifyRequesterInfoIsRemoved();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_12_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Verify the (التالي) button is disable/not clickable");
        CommonMethodsPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Enter (الرقم الوطني الموحد للمنشأة) input filed");
        CommonMethodsPage.enterCRNumberInputField(data.get("CR_Number"));
        logger.info("Step 10: Verify the (الرقم الوطني الموحد للمنشأة) input field displays an error message:يرجى التأكد من التنسيق");
        CommonMethodsPage.errorCRMessage("يرجى التأكد من التنسيق");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Enter (الرقم الوطني الموحد للمنشأة) input filed");
        CommonMethodsPage.enterCRNumberInputField(data.get("CR_Number"));
        logger.info("Step 10: Verify the (الرقم الوطني الموحد للمنشأة) input field displays an error message:الحد الأدنى لعدد الأحرف هو 10");
        CommonMethodsPage.errorCRMessage("الحد الأدنى لعدد الأحرف هو 10");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Enter (الرقم الوطني الموحد للمنشأة) input filed");
        CommonMethodsPage.enterCRNumberInputField(data.get("CR_Number"));
        logger.info("Step 10: Verify the (الرقم الوطني الموحد للمنشأة) input field displays an error message:يجب أن يبدأ رقم المؤسسة بـ 7 ");
        CommonMethodsPage.errorCRMessage("يجب أن يبدأ رقم المؤسسة بـ 7");
    }
}
