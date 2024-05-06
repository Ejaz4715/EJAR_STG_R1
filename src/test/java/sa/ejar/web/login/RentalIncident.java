package sa.ejar.web.login;

import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.RentalIncidentsPageObjects;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;
import sa.ejar.web.pages.RentalIncidentsPage;

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

    /**
     * Abstaining Party Information Section
     * From TC_23 to TC_42
     * */
    @Test(dataProvider = "testDataProvider")
    public void TC_23_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Add partial Requester Information");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 06: Verify abstainer info ( إضافة بيانات الطرف الممتنع ) link is disabled ");
        app.rentalIncidentsPage.verifyAddAbstainingPartyButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Add Requester Information");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 06: Verify abstainer info ( إضافة بيانات الطرف الممتنع ) link is enabled ");
        app.rentalIncidentsPage.verifyAddAbstainingPartyButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Add Requester Information");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 06: Click on ( إضافة بيانات الطرف الممتنع ) button");
        app.rentalIncidentsPage.clickOnAddAbstainingPartyInfoButton();
        logger.info("Step 07: Check Abstaining party role");
        app.rentalIncidentsPage.verifyAbstainerRole(data.get("Abstainer_Role"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Add Requester Information");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 06: Click on ( إضافة بيانات الطرف الممتنع ) button");
        app.rentalIncidentsPage.clickOnAddAbstainingPartyInfoButton();
        logger.info("Step 07: Verify Next button is not clickable ");
        CommonMethodsPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_27_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Add Requester Information");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 06: Click on ( إضافة بيانات الطرف الممتنع ) button");
        app.rentalIncidentsPage.clickOnAddAbstainingPartyInfoButton();
        logger.info("Step 07: Fill National ID number");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        app.addResidentialContractPage.inputTenantNationalId(data.get("Abstainer_id"));
        logger.info("Step 08: Verify Next button is not clickable ");
        CommonMethodsPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Add Requester Information");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 06: Click on ( إضافة بيانات الطرف الممتنع ) button");
        app.rentalIncidentsPage.clickOnAddAbstainingPartyInfoButton();
        logger.info("Step 07: Verify user is able to click on National Id radio button");
        app.contractWaiverPage.verifyUserIsAbleToClickNationalIdRadioButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Add Requester Information");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 06: Click on ( إضافة بيانات الطرف الممتنع ) button");
        app.rentalIncidentsPage.clickOnAddAbstainingPartyInfoButton();
        logger.info("Step 07: From Party Identification section click on National ID radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 08: Verify National Id input field is enabled and accepts valid value");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Abstainer_id"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Abstainer_id"), AddResidentialContractPageObjects.tenantNationalIdInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Add Requester Information");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 06: Click on ( إضافة بيانات الطرف الممتنع ) button");
        app.rentalIncidentsPage.clickOnAddAbstainingPartyInfoButton();
        logger.info("Step 07: From Party Identification section click on National ID radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 08: Input national id less than 10 numbers");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Abstainer_id_LessThan10"));
        logger.info("Step 09: Verify National Id input field  displays an error message ");
        CommonMethodsPage.errorMessage("الحد", RentalIncidentsPageObjects.NationalIdInputError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_31_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Add Requester Information");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 06: Click on ( إضافة بيانات الطرف الممتنع ) button");
        app.rentalIncidentsPage.clickOnAddAbstainingPartyInfoButton();
        logger.info("Step 07: From Party Identification section click on National ID radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 08: Input national id including a letter");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Abstainer_id_Letters"));
        logger.info("Step 09:  Verify National Id input field  displays an error message ");
        CommonMethodsPage.errorMessage("يرجى", RentalIncidentsPageObjects.NationalIdInputError());
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_32_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Add Requester Information");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 06: Click on ( إضافة بيانات الطرف الممتنع ) button");
        app.rentalIncidentsPage.clickOnAddAbstainingPartyInfoButton();
        logger.info("Step 07: From Party Identification section click on National ID radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 08: Verify the DOB input fields is enabled");
        app.contractWaiverPage.verifyDOBInputFieldIsEnabled();
        logger.info("Step 09: Verify user is able to Input valid DOB in Hijri format");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Abstainer_Valid_DOB"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Abstainer_DOB"), AddResidentialContractPageObjects.tenantDateOfBirthInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_33_RentalIncident(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on (الوقائع الإيجارية) tab");
        app.rentalIncidentsPage.clickOnRentalIncidentTab();
        logger.info("Step 03: Click on (تسجيل واقعة ايجارية جديد) button");
        app.rentalIncidentsPage.clickOnNewRentalIncidentButton();
        logger.info("Step 04: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 05: Add Requester Information");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 06: Click on ( إضافة بيانات الطرف الممتنع ) button");
        app.rentalIncidentsPage.clickOnAddAbstainingPartyInfoButton();
        logger.info("Step 07: From Party Identification section click on National ID radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 08: Enter the date of birth in gregorian format");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Abstainer_DOB_Gregorian"));
        CommonMethodsPage.verifyValueIsEntered("", AddResidentialContractPageObjects.tenantDateOfBirthInput());
    }

}
