package sa.ejar.web.login;

import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.RentalIncidentsPageObjects;
import sa.ejar.web.objects.RevokeContractPageObjects;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.enterCRNumberInputField(data.get("CR_Number_Letters"));
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.enterCRNumberInputField(data.get("CR_Number_LessThanTen"));
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
        CommonMethodsPage.changeUserRole("مؤجر");
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
        CommonMethodsPage.enterCRNumberInputField(data.get("CR_Number_NotStartWithSeven"));
        logger.info("Step 10: Verify the (الرقم الوطني الموحد للمنشأة) input field displays an error message:يجب أن يبدأ رقم المؤسسة بـ 7 ");
        CommonMethodsPage.errorCRMessage("يجب أن يبدأ رقم المؤسسة بـ 7");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Enter (الرقم الوطني الموحد للمنشأة) input filed");
        CommonMethodsPage.enterCRNumberInputField(data.get("Valid_CR_Number"));
        logger.info("Step 10: Verify the (التالي) button is disable/not clickable");
        CommonMethodsPage.verifyNextButtonIsDisabled();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_RentalIncident(Map<String, String> data) throws Exception {
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
    public void TC_18_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Enter (الرقم الوطني الموحد للمنشأة) input filed");
        CommonMethodsPage.enterCRNumberInputField(data.get("Valid_CR_Number"));
        logger.info("Step 10: Click on organization radio button");
        app.rentalIncidentsPage.clickOnOrganizationRadioButton();
        logger.info("Step 11: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the user navigate to (بيانات المنشأة) section");
        app.rentalIncidentsPage.verifyOrganizationInfoSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Enter (الرقم الوطني الموحد للمنشأة) input filed");
        CommonMethodsPage.enterCRNumberInputField(data.get("Valid_CR_Number"));
        logger.info("Step 10: Click on organization radio button");
        app.rentalIncidentsPage.clickOnOrganizationRadioButton();
        logger.info("Step 11: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Verify the user navigate back to (تسجيل واقعة ايجارية جديدة) page");
        app.rentalIncidentsPage.verifyNewRentalIncidentPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Enter (الرقم الوطني الموحد للمنشأة) input filed");
        CommonMethodsPage.enterCRNumberInputField(data.get("Valid_CR_Number"));
        logger.info("Step 10: Click on organization radio button");
        app.rentalIncidentsPage.clickOnOrganizationRadioButton();
        logger.info("Step 11: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (الاستمرار في معلومات المفوض) button");
        app.rentalIncidentsPage.clickOnContinueToRepresentativeInfoButton();
        logger.info("Step 13: Verify the user navigate to ( بيانات ممثل المنشأة) section");
        app.rentalIncidentsPage.verifyOrganizationIdentificationSectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Enter (الرقم الوطني الموحد للمنشأة) input filed");
        CommonMethodsPage.enterCRNumberInputField(data.get("Valid_CR_Number"));
        logger.info("Step 10: Click on organization radio button");
        app.rentalIncidentsPage.clickOnOrganizationRadioButton();
        logger.info("Step 11: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (الاستمرار في معلومات المفوض) button");
        app.rentalIncidentsPage.clickOnContinueToRepresentativeInfoButton();
        logger.info("Step 13: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Verify the user navigate back to (تسجيل واقعة ايجارية جديدة) page");
        app.rentalIncidentsPage.verifyNewRentalIncidentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 05: Select (صفة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterType(data.get("Requester_Type"));
        logger.info("Step 06: Select (فئة مقدم الطلب) dropdown list");
        app.rentalIncidentsPage.selectRequesterCategory(data.get("Requester_Category"));
        logger.info("Step 07: Select (إختر صفة مقدم الطلب) radio button");
        app.rentalIncidentsPage.clickOnRequesterRoleRadioButtons(data.get("Requester_Role"));
        logger.info("Step 08: Click on (بيانات مقدم الطلب) button");
        app.rentalIncidentsPage.clickOnAddRequesterInfoButton();
        logger.info("Step 09: Enter (الرقم الوطني الموحد للمنشأة) input filed");
        CommonMethodsPage.enterCRNumberInputField(data.get("Valid_CR_Number"));
        logger.info("Step 10: Click on organization radio button");
        app.rentalIncidentsPage.clickOnOrganizationRadioButton();
        logger.info("Step 11: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (الاستمرار في معلومات المفوض) button");
        app.rentalIncidentsPage.clickOnContinueToRepresentativeInfoButton();
        logger.info("Step 13: Click on (تأكيد) button");
        Browser.waitForSeconds(2);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 14: Verify the user navigate back to (تسجيل واقعة ايجارية جديدة) page");
        app.rentalIncidentsPage.verifyNewRentalIncidentPageIsDisplayed();
    }

    /**
     * Abstaining Party Information Section
     * From TC_23 to TC_42
     */
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
        app.contractWaiverPage.enterValidTenantDOB(data.get("Abstainer_DOB"));
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

    @Test(dataProvider = "testDataProvider")
    public void TC_34_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 08: Enter abstainer date of birth greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Abstainer_DOB_Future"));
        CommonMethodsPage.errorMessage("أقصى", RentalIncidentsPageObjects.DOBInputError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_35_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 08: Click on Calender icon");
        app.revokeContractPage.clickOnCalenderIcon();
        logger.info("Step 09: Click on Calender icon");
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 08: Enter valid abstainer date of birth");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Abstainer_DOB"));
        logger.info("Step 09: Verify equivalent Gregorian date is displayed under DOB input field");
        CommonMethodsPage.verifyEquivalentDateIsDisplayed("gregorian");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_37_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 08: Enter valid abstainer national id");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Abstainer_id"));
        logger.info("Step 08: Enter valid abstainer date of birth");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Abstainer_DOB"));
        logger.info("Step 09: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        app.rentalIncidentsPage.verifyAbstainingPartyInfoSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_38_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 08: Enter valid abstainer national id");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Abstainer_id"));
        logger.info("Step 08: Enter valid abstainer date of birth");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Abstainer_DOB"));
        logger.info("Step 09: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Cancel button");
        CommonMethodsPage.clickOnCancelButton();
        app.rentalIncidentsPage.verifyNewRentalIncidentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_39_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 08: Enter valid abstainer national id");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Abstainer_id"));
        logger.info("Step 08: Enter valid abstainer date of birth");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Abstainer_DOB"));
        logger.info("Step 09: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Back ( السابق ) button");
        CommonMethodsPage.clickOnBackButton();
        app.rentalIncidentsPage.verifyIdentificationAbstainingPartyIdSectionSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_40_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 08: Enter valid abstainer national id");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Abstainer_id"));
        logger.info("Step 08: Enter valid abstainer date of birth");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Abstainer_DOB"));
        logger.info("Step 09: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click  (Confirm (تأكيد ) button ");
        CommonMethodsPage.clickOnConfirmButton();
        app.rentalIncidentsPage.verifyNewRentalIncidentPageIsDisplayed();
        logger.info("Step 10: Verify abstaining party information has been added");
        app.rentalIncidentsPage.verifyAbstainingPartyInformationIsAdded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_41_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 08: Enter valid abstainer national id");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Abstainer_id"));
        logger.info("Step 08: Enter valid abstainer date of birth");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Abstainer_DOB"));
        logger.info("Step 09: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click  (Confirm (تأكيد ) button ");
        CommonMethodsPage.clickOnConfirmButton();
        app.rentalIncidentsPage.verifyNewRentalIncidentPageIsDisplayed();
        logger.info("Step 10: Click on  Edit (تعديل) button");
        app.rentalIncidentsPage.clickOnEditButtonOnAbstainingPartyInfoSection();
        app.rentalIncidentsPage.verifyAbstainingPartyInfoSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_42_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 08: Enter valid abstainer national id");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Abstainer_id"));
        logger.info("Step 08: Enter valid abstainer date of birth");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Abstainer_DOB"));
        logger.info("Step 09: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click  (Confirm (تأكيد ) button ");
        CommonMethodsPage.clickOnConfirmButton();
        app.rentalIncidentsPage.verifyNewRentalIncidentPageIsDisplayed();
        logger.info("Step 10: Click on  Edit (تعديل) button");
        app.rentalIncidentsPage.clickOnDeleteButtonOnAbstainingPartyInfoSection();
        app.rentalIncidentsPage.verifyAbstainingPartyInformationIsDeleted();
    }

    /**
     * Contract period Section
     * From TC_43 to TC_51
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_43_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 05: Verify \"Contract Period\" section is not appearing");
        app.rentalIncidentsPage.verifyContractPeriodSectionIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_44_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Verify \"Start Date / End Date\" input field is disabled");
        app.rentalIncidentsPage.verifyContractPeriodDateInputFieldIsNotClickable();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_45_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on \"Contract Type\" dropdown");
        app.rentalIncidentsPage.clickOnContractTypeDropDown();
        logger.info("Step 07: Select Contract type Residential/Commercial");
        CommonMethodsPage.selectFromList(data.get("Contract_Type"), RentalIncidentsPageObjects.ContractTypeDropDownOptionsList());
        app.rentalIncidentsPage.verifyContractTypeIsSelected(data.get("Contract_Type"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_46_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on \"Contract Type\" dropdown");
        app.rentalIncidentsPage.clickOnContractTypeDropDown();
        logger.info("Step 07: Select Contract type Residential/Commercial");
        CommonMethodsPage.selectFromList(data.get("Contract_Type"), RentalIncidentsPageObjects.ContractTypeDropDownOptionsList());
        logger.info("Step 08: Click on \"Start Date / End Date\" input field");
        app.rentalIncidentsPage.clickOnContractPeriodDateInput();
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_47_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on \"Contract Type\" dropdown");
        app.rentalIncidentsPage.clickOnContractTypeDropDown();
        logger.info("Step 07: Select Contract type Residential/Commercial");
        CommonMethodsPage.selectFromList(data.get("Contract_Type"), RentalIncidentsPageObjects.ContractTypeDropDownOptionsList());
        logger.info("Step 08: Click on \"Start Date / End Date\" input field");
        app.rentalIncidentsPage.clickOnContractPeriodDateInput();
        logger.info("Step 09: Select Start Date and End Date from calender");
        String currentDate = java.time.LocalDate.now().toString();
        String[] arrDate = currentDate.split("-");
        app.addResidentialContractPage.selectStartDateOfResidualContract(
                String.valueOf(Integer.valueOf(arrDate[2])),
                app.addResidentialContractPage.getCurrentMonth(arrDate[1]),
                arrDate[0]);
        app.addResidentialContractPage.selectEndDateOfResidualContract(
                String.valueOf(Integer.valueOf(arrDate[2])),
                app.addResidentialContractPage.getCurrentMonth(arrDate[1]),
                String.valueOf(Integer.parseInt(arrDate[0]) + 1));
        CommonMethodsPage.verifyValueIsEntered(currentDate, RentalIncidentsPageObjects.ContractPeriodDateInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_48_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on \"Contract Type\" dropdown");
        app.rentalIncidentsPage.clickOnContractTypeDropDown();
        logger.info("Step 07: Select Contract type Residential/Commercial");
        CommonMethodsPage.selectFromList(data.get("Contract_Type"), RentalIncidentsPageObjects.ContractTypeDropDownOptionsList());
        logger.info("Step 08: Click on \"Start Date / End Date\" input field");
        app.rentalIncidentsPage.clickOnContractPeriodDateInput();
        logger.info("Step 09: Select Start Date and End Date from calender");
        String currentDate = java.time.LocalDate.now().toString();
        String[] arrDate = currentDate.split("-");
        app.addResidentialContractPage.selectStartDateOfResidualContract(
                String.valueOf(Integer.valueOf(arrDate[2])),
                app.addResidentialContractPage.getCurrentMonth(arrDate[1]),
                arrDate[0]);
        app.addResidentialContractPage.selectEndDateOfResidualContract(
                String.valueOf(Integer.valueOf(arrDate[2])),
                app.addResidentialContractPage.getCurrentMonth(arrDate[1]),
                String.valueOf(Integer.parseInt(arrDate[0]) + 1));
        logger.info("Step 10: Verify the duration is automatically populated in calender pop up");
        CommonMethodsPage.verifyValueIsEntered("1", RentalIncidentsPageObjects.DurationYearInputFieldOnCalenderPopUp());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_49_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on \"Contract Type\" dropdown");
        app.rentalIncidentsPage.clickOnContractTypeDropDown();
        logger.info("Step 07: Select Contract type Residential/Commercial");
        CommonMethodsPage.selectFromList(data.get("Contract_Type"), RentalIncidentsPageObjects.ContractTypeDropDownOptionsList());
        logger.info("Step 08: Click on \"Start Date / End Date\" input field");
        app.rentalIncidentsPage.clickOnContractPeriodDateInput();
        logger.info("Step 09: Select Start Date and End Date from calender");
        String currentDate = java.time.LocalDate.now().toString();
        String[] arrDate = currentDate.split("-");
        app.addResidentialContractPage.selectStartDateOfResidualContract(
                String.valueOf(Integer.valueOf(arrDate[2])),
                app.addResidentialContractPage.getCurrentMonth(arrDate[1]),
                arrDate[0]);
        app.addResidentialContractPage.selectEndDateOfResidualContract(
                String.valueOf(Integer.valueOf(arrDate[2])),
                app.addResidentialContractPage.getCurrentMonth(arrDate[1]),
                String.valueOf(Integer.parseInt(arrDate[0]) + 1));
        app.rentalIncidentsPage.enterDays("0");
        logger.info("Step 10: Click Confirm Period button");
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        CommonMethodsPage.totalAmount("1", RentalIncidentsPageObjects.TotalNumberOfYears());
        CommonMethodsPage.totalAmount("250", RentalIncidentsPageObjects.TotalRequestAmount());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_50_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on \"Contract Type\" dropdown");
        app.rentalIncidentsPage.clickOnContractTypeDropDown();
        logger.info("Step 07: Select Contract type Residential/Commercial");
        CommonMethodsPage.selectFromList(data.get("Contract_Type"), RentalIncidentsPageObjects.ContractTypeDropDownOptionsList());
        logger.info("Step 08: Click on \"Start Date / End Date\" input field");
        app.rentalIncidentsPage.clickOnContractPeriodDateInput();
        logger.info("Step 09: Click on \"Cancel\" button ");
        CommonMethodsPage.clickOnCancelButton();
        app.rentalIncidentsPage.verifyCalenderIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_51_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on \"Contract Type\" dropdown");
        app.rentalIncidentsPage.clickOnContractTypeDropDown();
        logger.info("Step 07: Select Contract type Residential/Commercial");
        CommonMethodsPage.selectFromList(data.get("Contract_Type"), RentalIncidentsPageObjects.ContractTypeDropDownOptionsList());
        logger.info("Step 08: Click on \"Start Date / End Date\" input field");
        app.rentalIncidentsPage.clickOnContractPeriodDateInput();
        logger.info("Step 09: Select Start Date and End Date from calender");
        String currentDate = java.time.LocalDate.now().toString();
        String[] arrDate = currentDate.split("-");
        app.addResidentialContractPage.selectStartDateOfResidualContract(
                String.valueOf(Integer.valueOf(arrDate[2])),
                app.addResidentialContractPage.getCurrentMonth(arrDate[1]),
                arrDate[0]);
        app.addResidentialContractPage.selectEndDateOfResidualContract(
                String.valueOf(Integer.valueOf(arrDate[2])),
                app.addResidentialContractPage.getCurrentMonth(arrDate[1]),
                String.valueOf(Integer.parseInt(arrDate[0]) + 1));
        logger.info("Step 10: Click Confirm Period button");
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 11: Enter value in Annual Rent value");
        app.rentalIncidentsPage.enterAnnualRent(data.get("Annual_Rent"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Annual_Rent"), RentalIncidentsPageObjects.AnnualRentInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_52_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 05: Verify the (إضافة وثيقة ملكية) link button is not clickable");
        app.rentalIncidentsPage.verifyAddOwnershipDocumentLinkButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_53_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: User is navigated to (Add Unit and real estate information)");
        app.rentalIncidentsPage.verifyOwnershipDocumentIdentificationSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_54_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Verify ownership document is selected");
        CommonMethodsPage.verifyOwnershipDocumentIsSelected(data.get("Ownership_Document"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_55_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter ownership document number");
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Ownership_Document_Number"));
        logger.info("Step 09: Verify ownership document number has been entered");
        CommonMethodsPage.verifyValueIsEntered(data.get("Ownership_Document_Number"), CommonMethodsPageObjects.ownershipDocumentNumberTXT());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_56_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter Release date");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Release_Date"));
        logger.info("Step 09: Verify release date has been entered");
        CommonMethodsPage.verifyValueIsEntered(data.get("Release_Date"), CommonMethodsPageObjects.releaseDateTXT());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_57_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter Release date less than 1900 year");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Invalid_Release_Date"));
        logger.info("Step 09: Verify release date does NOT accept date less than 1900 year");
        String invalidDate = String.valueOf(data.get("Invalid_Release_Date").charAt(0));
        CommonMethodsPage.verifyValueIsEntered(invalidDate, CommonMethodsPageObjects.releaseDateTXT());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_58_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter future release date");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Future_Release_Date"));
        logger.info("Step 09: Verify Input field (Release date) display an error message:أقصى قيمة هي");
        CommonMethodsPage.errorMessage("أقصى", RevokeContractPageObjects.ExecutionOrderDateErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_59_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Click on calender icon button");
        app.revokeContractPage.clickOnCalenderIcon();
        logger.info("Step 09: Verify calender pop up is displayed");
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_60_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter Release date");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Release_Date"));
        logger.info("Step 09:Verify equivalent date is displayed");
        CommonMethodsPage.verifyEquivalentDateIsDisplayed("hijri");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_61_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Verify the (Ownership document number) input field is disabled");
        app.rentalIncidentsPage.verifyReleaseDateInputFieldIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_62_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Verify the (Release Date) input field is disabled");
        app.rentalIncidentsPage.verifyOwnershipDocumentInputFieldIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_63_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Verify Owner ID Number field is not displayed when selected Ownership document type is NOT (Electronic Title Deed)");
        CommonMethodsPage.verifyOwnerIdInputFieldIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_64_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Verify Legal document type name field is not displayed when selected Ownership document type is NOT (Other)");
        CommonMethodsPage.verifyLegalDocumentTypeNameInputFieldIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_65_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document_Existing_Data"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter Release date");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Release_Date_Existing_Data"));
        logger.info("Step 09: Enter ownership document number");
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Ownership_Document_Number_Existing_Data"));
        logger.info("Step 10: Verify existing ownership document information is displayed");
        CommonMethodsPage.verifyTheSelectedOwnershipDocumentInfoIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_66_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter Release date");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Release_Date"));
        logger.info("Step 09: Enter ownership document number");
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Ownership_Document_Number"));
        logger.info("Step 10: Verify a warning message is displayed: .عذرًا، لم نتمكن من العثور على بيانات رقم الوثيقة الملكية المحدد");
        CommonMethodsPage.verifyAddNewOwnershipDocumentAlertMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_67_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document_Existing_Data"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter Release date");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Release_Date_Existing_Data"));
        logger.info("Step 09: Enter ownership document number");
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Ownership_Document_Number_Existing_Data"));
        logger.info("Step 10: Select existing ownership document");
        CommonMethodsPage.selectExistingOwnershipDocument();
        logger.info("Step 11: Verify existing ownership document is selected");
        CommonMethodsPage.verifyTheExistingOwnershipDocumentIsSelected();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_68_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document_Existing_Data"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter Release date");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Release_Date_Existing_Data"));
        logger.info("Step 09: Enter ownership document number");
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Ownership_Document_Number_Existing_Data"));
        logger.info("Step 10: Verify the (التالي) button is not enabled");
        CommonMethodsPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_69_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document_Existing_Data"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter Release date");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Release_Date_Existing_Data"));
        logger.info("Step 09: Enter ownership document number");
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Ownership_Document_Number_Existing_Data"));
        logger.info("Step 10: Select existing ownership document");
        CommonMethodsPage.selectExistingOwnershipDocument();
        logger.info("Step 11: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the user is moved to next step");
        CommonMethodsPage.verifyAddPropertyButtonIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_70_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document_Existing_Data"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter Release date");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Release_Date_Existing_Data"));
        logger.info("Step 09: Enter ownership document number");
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Ownership_Document_Number_Existing_Data"));
        logger.info("Step 10: Select existing ownership document");
        CommonMethodsPage.selectExistingOwnershipDocument();
        logger.info("Step 11: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify the (التالي) button is not enabled");
        CommonMethodsPage.verifyAddPropertyButtonIsDisplayed();
        CommonMethodsPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_71_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document_Existing_Data"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter Release date");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Release_Date_Existing_Data"));
        logger.info("Step 09: Enter ownership document number");
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Ownership_Document_Number_Existing_Data"));
        logger.info("Step 10: Select existing ownership document");
        CommonMethodsPage.selectExistingOwnershipDocument();
        logger.info("Step 11: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Select Property");
        app.addResidentialContractPage.selectProperty("Automation Test");
        logger.info("Step 13: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Verify the user is moved to next step");
        CommonMethodsPage.verifySelectUnitPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_72_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document_Existing_Data"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter Release date");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Release_Date_Existing_Data"));
        logger.info("Step 09: Enter ownership document number");
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Ownership_Document_Number_Existing_Data"));
        logger.info("Step 10: Select existing ownership document");
        CommonMethodsPage.selectExistingOwnershipDocument();
        logger.info("Step 11: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Select Property");
        app.addResidentialContractPage.selectProperty("Automation Test");
        logger.info("Step 13: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Verify the (التالي) button is not enabled");
        CommonMethodsPage.verifySelectUnitPageIsDisplayed();
        CommonMethodsPage.verifyNextButtonIsDisabled();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_73_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on (إضافةوثيقة ملكية) link button");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        logger.info("Step 07: Select ownership document");
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document_Existing_Data"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        logger.info("Step 08: Enter Release date");
        CommonMethodsPage.enterReleaseDateInputField(data.get("Release_Date_Existing_Data"));
        logger.info("Step 09: Enter ownership document number");
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Ownership_Document_Number_Existing_Data"));
        logger.info("Step 10: Select existing ownership document");
        CommonMethodsPage.selectExistingOwnershipDocument();
        logger.info("Step 11: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Select Property");
        app.addResidentialContractPage.selectProperty("Automation Test");
        logger.info("Step 13: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Select unit");
        app.addResidentialContractPage.selectFirstAvailableUnit();
        logger.info("Step 15: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 16: Verify the user is navigated to (Register new rental incident) and unit and property details information is displayed");
        app.rentalIncidentsPage.verifyNewRentalIncidentPageIsDisplayed();
        app.rentalIncidentsPage.verifyAddOwnershipDocumentInfoIsDisplayed();
    }

    /**
     * Brokerage office Section
     * From TC_74 to TC_85
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_74_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 05: Enter invalid CR number containing letters ");
        app.rentalIncidentsPage.enterBORegistrationNumber(data.get("CR_Number_Letters"));
        CommonMethodsPage.errorCRMessage("يرجى");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_75_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 05: Enter invalid CR number with length less than 10 digits ");
        app.rentalIncidentsPage.enterBORegistrationNumber(data.get("CR_Number_LessThanTen"));
        CommonMethodsPage.errorCRMessage("الحد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_76_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 05: Click on Search button");
        CommonMethodsPage.clickOnSearchButton();
        app.rentalIncidentsPage.verifyPopUpErrorMessages("عذرًا، الخدمة غير متوفرة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_86_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Verify the following error message is displayed: حجم الملف أكبر من المسموح به. أقصى حجم للملف يجب أن لا يتعدى 10 ميغابت");
        app.moveInMoveOutUnitsPage.uploadFile("ejartestt.pdf");
        CommonMethodsPage.errorMessageFoAttachments("حجم", RentalIncidentsPageObjects.overSizeErrorMsg());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_87_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Verify the attachment not uploaded with different format");
        app.moveInMoveOutUnitsPage.uploadFile("contracts.txt");
        app.rentalIncidentsPage.verifyDifferentAttachmentFormatNotUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_88_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Verify the attachment has been removed");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        CommonMethodsPage.clickOnDeleteIconButtonForAttachment();
        CommonMethodsPage.verifyTheAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_89_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Verify the user is redirected to a new window to view the attachment");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_90_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Upload File");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 07: Verify The (إرسال الطلب) is disabled/not clickable");
        CommonMethodsPage.verifySendRequestButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_91_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 05: Click on (الموافقة على الإقرار) checkbox");
        app.rentalIncidentsPage.clickOnApproveOfDeclarationCheckbox();
        logger.info("Step 06: Verify the (الموافقة على الإقرار) checkbox is selected");
        app.rentalIncidentsPage.verifyApproveOfDeclarationCheckboxIsSelected();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_92_RentalIncident(Map<String, String> data) throws Exception {
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
        logger.info("Step 07: Add Units and property details");
        app.rentalIncidentsPage.clickOnAddOwnershipDocumentLinkButton();
        CommonMethodsPage.selectOwnershipDocumentDropdownList(data.get("Ownership_Document_Existing_Data"), CommonMethodsPageObjects.ownershipDocumentDDLOption());
        CommonMethodsPage.enterReleaseDateInputField(data.get("Release_Date_Existing_Data"));
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Ownership_Document_Number_Existing_Data"));
        CommonMethodsPage.selectExistingOwnershipDocument();
        CommonMethodsPage.clickOnNextButton();
        app.addResidentialContractPage.selectProperty("Automation Test");
        CommonMethodsPage.clickOnNextButton();
        app.addResidentialContractPage.selectFirstAvailableUnit();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Reason for contract refusal");
        app.rentalIncidentsPage.clickOnReasonRefusalRadioButton();
        logger.info("Step 09: Upload Files");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 10: Verify The (إرسال الطلب) is disabled/not clickable");
        CommonMethodsPage.verifySendRequestButtonIsDisabled();

    }
}
