package sa.ejar.web.login;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;
import java.util.Map;
import static sa.ejar.web.objects.ChangeTenantActivityPageObjects.*;

public class ChangeTenantActivity extends NHCWebTest {

    //----------------------------------------------------------------
    //------Tenant Representative Scenario : Change Tenant Activity---
    //----------------------------------------------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_001_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        app.changeTenantActivityPage.getPartiesDetails();
        CommonMethodsPage.clickOnDownloadContractCopy();
        String CurrentContractVersion = app.changeTenantActivityPage.getContractVersionFromPDF(data.get("ContractNumber"));
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivity", "Current_Contract_Version", CurrentContractVersion);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivity");
        CommonMethodsPage.closeNewTab();
        Browser.getDriver().navigate().back();
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Check Change Tenant Activity ( تغيير نشاط المستأجر ) option is displayed");
        CommonMethodsPage.KebabMenuOptions("تغيير نشاط المستأجر");
        app.changeTenantActivityPage.deleteDownloadFile(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_002_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Check Change Tenant Activity ( تغيير نشاط المستأجر ) option is Not displayed");
        CommonMethodsPage.KebabMenuOptionNotDisplayed("تغيير نشاط المستأجر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_003_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.KebabMenuOptions("تغيير نشاط المستأجر");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        app.changeTenantActivityPage.verifyChangeTenantActivityPageHeaderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_004_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.KebabMenuOptions("تغيير نشاط المستأجر");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        app.changeTenantActivityPage.verifyChangeTenantActivityPageHeaderIsDisplayed();
        logger.info("Step 07: Check contract number is displayed");
        app.changeTenantActivityPage.assertContractNumberInPageHeader(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_005_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.KebabMenuOptions("تغيير نشاط المستأجر");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        app.changeTenantActivityPage.verifyChangeTenantActivityPageHeaderIsDisplayed();
        logger.info("Step 07: Verify Contract parties are displayed in ' تغيير نشاط المستأجر التجاري 'page");
        app.changeTenantActivityPage.assertContractParties(data);
    }

    //BUG------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_006_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.KebabMenuOptions("تغيير نشاط المستأجر");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        app.changeTenantActivityPage.verifyChangeTenantActivityPageHeaderIsDisplayed();
        logger.info("Step 07: Check old tenant Activity description ( نشاط المستأجر القديم ) is displayed");
        app.changeTenantActivityPage.assertOldTenantActivityHeadingOnChangeTenantActivityPage();
        app.changeTenantActivityPage.getOldTenantActivityDescriptionOnChangeTenantActivityPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_007_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_008_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.deleteNewTenantActivityDescription("نشاط المستأجر الجديد");
    }

    //BUG------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_009_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter/Delete text in New Tenant Activity ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.deleteNewTenantActivityDescription("نشاط المستأجر الجديد");
        logger.info("Step 08: Verify Submit Request (تقديم الطلب ) button is disabled");
        Browser.executeJSScroll(-550);
        CommonMethodsPage.verifySubmitRequestIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_010_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Verify 'OTP طلب' popup displayed");
        CommonMethodsPage.verifyOTPPopIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_011_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Click on Cancel (إلغاء ) button from OTP Request popup");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: User neviagte back to ' تغيير نشاط المستأجر التجاري' page");
        app.changeTenantActivityPage.verifyChangeTenantActivityPageHeaderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_012_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Check Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.checkVerifyIdentityButtonIsPresent();
        CommonMethodsPage.checkVerifyIdentityButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_013_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter wrong OTP number");
        app.loginPage.enterVerificationCodeForOTP("1239");
        logger.info("Step 10: Click on Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        logger.info("Step 11: Verify error message ' غير صالح OTP رمز E1389' is displayed");
        CommonMethodsPage.verifyInvalidOTPErrorMessagePresentStatus(true);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_014_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter OTP number");
        app.loginPage.enterVerificationCodeForOTP("123");
        CommonMethodsPage.checkVerifyIdentityButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_015_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter Valid OTP number");
        app.loginPage.enterVerificationCodeForOTP("1234");
        logger.info("Step 10: Click on Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        logger.info("Step 11: Verify submitted request popup will be displayed");
        app.changeTenantActivityPage.verifySubmitRequestPopupForNewTenantActivity();
        String RequestNum = app.changeTenantActivityPage.getRequestNumber();
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivity", "ChangeTenantActivityRequestNumber", RequestNum);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivity");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_016_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter Valid OTP number");
        app.loginPage.enterVerificationCodeForOTP("1234");
        logger.info("Step 10: Click on Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        logger.info("Step 11: Verify submitted request popup will be displayed");
        app.changeTenantActivityPage.verifySubmitRequestPopupForNewTenantActivity();
        logger.info("Step 12: Check request number contain 8 alphanumeric");
        String RequestNum = app.changeTenantActivityPage.getRequestNumber();
        app.changeTenantActivityPage.checkRequestNumberHasAlphaNumeric();
        app.changeTenantActivityPage.verifyRequestContainEightAlphaNumeric();
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivity", "ChangeTenantActivityRequestNumber", RequestNum);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivity");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_017_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter Valid OTP number");
        app.loginPage.enterVerificationCodeForOTP("1234");
        logger.info("Step 10: Click on Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        logger.info("Step 11: Verify submitted request popup will be displayed");
        app.changeTenantActivityPage.verifySubmitRequestPopupForNewTenantActivity();
        logger.info("Step 12: Check message 'الطلب بانتظار موافقة الطرف الآخر لمدة 7 ، وسيتم إشعاركم في حالة قبول أو رفض الطلب'. is visible");
        app.changeTenantActivityPage.checkRequestWaitingForSevenDaysMessage();
        String RequestNum = app.changeTenantActivityPage.getRequestNumber();
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivity", "ChangeTenantActivityRequestNumber", RequestNum);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivity");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_018_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter Valid OTP number");
        app.loginPage.enterVerificationCodeForOTP("1234");
        logger.info("Step 10: Click on Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        logger.info("Step 11: Verify submitted request popup will be displayed");
        app.changeTenantActivityPage.verifySubmitRequestPopupForNewTenantActivity();
        String RequestNum = app.changeTenantActivityPage.getRequestNumber();
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivity", "ChangeTenantActivityRequestNumber", RequestNum);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivity");
        logger.info("Step 12: Click on close button");
        app.changeTenantActivityPage.closeSubmitRequestPopUp();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_019_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_020_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_021_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_022_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter invalid request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("HVDI09U6");
        logger.info("Step 06: Verify message 'حاليا ، ليس لديك أي طلب' is displayed");
        app.changeTenantActivityPage.assertInvalidRequest();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_023_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Verify 'قيد الانتظار ' status is displayed");
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_024_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: From Status dropdown list, Select pending status");
        app.changeTenantActivityPage.selectStatus("قيد الانتظار");
        logger.info("Step 07: From Request Type dropdown list,Select Commercial Activity Change");
        app.changeTenantActivityPage.selectRequestType("تغيير النشاط التجاري");
        String Date = app.changeTenantActivityPage.verifyIssueDate();
        app.changeTenantActivityPage.assertRequestDetails(data.get("ChangeTenantActivityRequestNumber"),
                "تغيير النشاط التجاري", data.get("ContractNumber"), Date);
        app.changeTenantActivityPage.assertCreatedDateAndIssuedByOnRequestDetails(data.get("LessorName"), data.get("TenantRepresentativeName"));
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_025_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Check request status 'موافق عليه'");
        CommonMethodsPage.checkRequestStatus("موافق عليه");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_026_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Check request status 'مرفوض'");
        CommonMethodsPage.checkRequestStatus("مرفوض");
    }

    //----------------------------------------------------------------
    //----------------Lessor Approval Scenarios-----------------------
    //-----------------------------------------------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_027_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Verify ' الطلبات ' page is displayed");
        app.changeTenantActivityPage.checkRequestsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_028_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.assertFilterPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_029_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        String Date = app.changeTenantActivityPage.verifyIssueDate();
        app.changeTenantActivityPage.assertRequestDetails(data.get("ChangeTenantActivityRequestNumber"),
                "تغيير النشاط التجاري", data.get("ContractNumber"), Date);
        app.changeTenantActivityPage.assertCreatedDateAndIssuedByOnRequestDetails(data.get("LessorName"), data.get("TenantRepresentativeName"));
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_030_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter invalid request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("WGAV74YEF");
        app.changeTenantActivityPage.assertInvalidRequest();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_031_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        String Date = app.changeTenantActivityPage.verifyIssueDate();
        app.changeTenantActivityPage.assertRequestDetails(data.get("ChangeTenantActivityRequestNumber"),
                "تغيير النشاط التجاري", data.get("ContractNumber"), Date);
        logger.info("Step 06: Check request status");
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_032_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("step 08: Verify( خطوات الموافقة على تغيير النشاط ) page is displayed");
        app.changeTenantActivityPage.assertTenantActivityApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_033_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("step 09: Verify( مراجعة تغيير نشاط المستأجر ) page is displayed");
        app.changeTenantActivityPage.assertReviewChangedTenantActivity();
    }

    //BUG------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_034_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Check Old Tenant Activity ( وصف نشاط المستأجر القديم ) details");
        app.changeTenantActivityPage.clickOnOldTenantActivity();
        app.changeTenantActivityPage.assertOldTenantDescriptionDetails("");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_035_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on ( نشاط المستأجر الجديد ) label > Check New Tenant Activity (وصف نشاط المستأجر الجديد) details");
        app.changeTenantActivityPage.clickOnNewTenantActivity();
        app.changeTenantActivityPage.assertNewTenantDescriptionDetails(data.get("NewTenantActivityDescription"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_036_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on Back ( السابق ) button");
        app.changeTenantActivityPage.clickBackButton();
        logger.info("step 10: Verify User neviagte back to ( خطوات الموافقة على تغيير النشاط ) page");
        app.changeTenantActivityPage.assertTenantActivityApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_037_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify user neviagte to 'الموافقة على نشاط المستأجر' page");
        app.changeTenantActivityPage.assertApproveTenantActivity();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_038_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on Cancel ( إلغاء ) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("step 12: Verify user neviagte back to ( مراجعة تغيير نشاط المستأجر ) page");
        app.changeTenantActivityPage.assertReviewChangedTenantActivity();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_039_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify ( إرسال الموافقة ) button is disabled/not clickable");
        app.changeTenantActivityPage.verifySubmitApprovalButtonDisabled(true);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_040_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify 'أقر بالموافقة على المذكور أعلاه' checkbox is clickable > ( إرسال الموافقة ) button is enabled");
        app.changeTenantActivityPage.clickOnIAgreeToTheAboveCheckBox();
        app.changeTenantActivityPage.verifySubmitApprovalButtonEnabled(true);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_041_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on 'أقر بالموافقة على المذكور أعلاه' checkbox");
        app.changeTenantActivityPage.clickOnIAgreeToTheAboveCheckBox();
        logger.info("Step 12: Click on ( إرسال الموافقة ) button");
        app.changeTenantActivityPage.clickOnSubmitApprovalBTN();
        logger.info("Step 13: Verify message of 'تم إرسال الموفقة' is displayed");
        app.changeTenantActivityPage.assertConfirmApprovalMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_042_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Check request status 'موافق عليه'");
        CommonMethodsPage.checkRequestStatus("موافق عليه");
    }

    //----------------------------------------------------------------
    //-------------------Lessor Reject Scenarios-----------------------
    //-----------------------------------------------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_043_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on (رفض ) button");
        app.changeTenantActivityPage.clickOnRejectBTN();
        logger.info("Step 11: Verify user neviagte to ' رفض نشاط المستأجر ' page");
        app.changeTenantActivityPage.assertRejectTenantActivityPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_044_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on ( رفض ) button");
        app.changeTenantActivityPage.clickOnRejectBTN();
        logger.info("Step 11: Click on \"إلغاء\" button");
        app.changeTenantActivityPage.clickOnCancelButton();
        logger.info("Step 12: Verify PopUp Alert is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_045_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on ( رفض ) button");
        app.changeTenantActivityPage.clickOnRejectBTN();
        logger.info("Step 11: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
        logger.info("Step 12: Click on \"إلغاء\" button from popup window");
        app.manualRenewalPage.clickOnCancelPopUpButton();
        logger.info("Step 13: Verify user remaining on ' رفض نشاط المستأجر ' page");
        app.changeTenantActivityPage.assertRejectTenantActivityPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_046_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on ( رفض ) button");
        app.changeTenantActivityPage.clickOnRejectBTN();
        logger.info("Step 11: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
        logger.info("Step 12: Click on \"تأكيد\" button from popup window");
        app.manualRenewalPage.clickOnConfirmPopUpButton();
        logger.info("step 13: Verify user neviagte back to 'مراجعة تغيير نشاط المستأجر 'page");
        Browser.executeJSScroll(-1500);
        app.changeTenantActivityPage.assertReviewChangedTenantActivity();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_047_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on ( رفض ) button");
        app.changeTenantActivityPage.clickOnRejectBTN();
        logger.info("Step 11: Click on ( رفض نشاط المستأجر  ) button");
        app.changeTenantActivityPage.rejectTenantActivityBTN();
        logger.info("Step 12: Verify message of 'تم تقديم الرفض' is displayed");
        app.changeTenantActivityPage.assertConfirmRejectMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_048_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Check request status 'مرفوض'");
        CommonMethodsPage.checkRequestStatus("مرفوض");
    }

    //----------------------------------------------------------------
    //------Lessor Scenario : Change Tenant Activity------------------
    //----------------------------------------------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_049_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        app.changeTenantActivityPage.getPartiesDetails();
        CommonMethodsPage.clickOnDownloadContractCopy();
        String CurrentContractVersion = app.changeTenantActivityPage.getContractVersionFromPDF(data.get("ContractNumber"));
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivity", "Current_Contract_Version", CurrentContractVersion);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivity");
        CommonMethodsPage.closeNewTab();
        Browser.getDriver().navigate().back();
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Check Change Tenant Activity ( تغيير نشاط المستأجر ) option is displayed");
        CommonMethodsPage.KebabMenuOptions("تغيير نشاط المستأجر");
        app.changeTenantActivityPage.deleteDownloadFile(data.get("ContractNumber"));
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_050_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Check Change Tenant Activity ( تغيير نشاط المستأجر ) option is Not displayed");
        CommonMethodsPage.KebabMenuOptionNotDisplayed("تغيير نشاط المستأجر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_051_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.KebabMenuOptions("تغيير نشاط المستأجر");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        app.changeTenantActivityPage.verifyChangeTenantActivityPageHeaderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_052_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.KebabMenuOptions("تغيير نشاط المستأجر");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        app.changeTenantActivityPage.verifyChangeTenantActivityPageHeaderIsDisplayed();
        logger.info("Step 07: Check contract number is displayed");
        app.changeTenantActivityPage.assertContractNumberInPageHeader(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_053_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.KebabMenuOptions("تغيير نشاط المستأجر");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        app.changeTenantActivityPage.verifyChangeTenantActivityPageHeaderIsDisplayed();
        logger.info("Step 07: Verify Contract parties are displayed in ' تغيير نشاط المستأجر التجاري 'page");
        app.changeTenantActivityPage.assertContractParties(data);
    }

    // BUG------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_054_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.KebabMenuOptions("تغيير نشاط المستأجر");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        app.changeTenantActivityPage.verifyChangeTenantActivityPageHeaderIsDisplayed();
        logger.info("Step 07: Check old tenant Activity description ( نشاط المستأجر القديم ) is displayed");
        app.changeTenantActivityPage.assertOldTenantActivityHeadingOnChangeTenantActivityPage();
        app.changeTenantActivityPage.getOldTenantActivityDescriptionOnChangeTenantActivityPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_055_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_056_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.deleteNewTenantActivityDescription("نشاط المستأجر الجديد");
    }

    //BUG------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_057_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter/Delete text in New Tenant Activity ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.deleteNewTenantActivityDescription("نشاط المستأجر الجديد");
        logger.info("Step 08: Verify Submit Request (تقديم الطلب ) button is disabled");
        CommonMethodsPage.verifySubmitRequestIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_058_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Verify 'OTP طلب' popup displayed");
        CommonMethodsPage.verifyOTPPopIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_059_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Click on Cancel (إلغاء ) button from OTP Request popup");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: User neviagte back to ' تغيير نشاط المستأجر التجاري' page");
        app.changeTenantActivityPage.verifyChangeTenantActivityPageHeaderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_060_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Check Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.checkVerifyIdentityButtonIsPresent();
        CommonMethodsPage.checkVerifyIdentityButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_061_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter wrong OTP number");
        app.loginPage.enterVerificationCodeForOTP("1239");
        logger.info("Step 10: Click on Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        logger.info("Step 11: Verify error message ' غير صالح OTP رمز E1389' is displayed");
        CommonMethodsPage.verifyInvalidOTPErrorMessagePresentStatus(true);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_062_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter OTP number");
        app.loginPage.enterVerificationCodeForOTP("123");
        CommonMethodsPage.checkVerifyIdentityButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_063_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter Valid OTP number");
        app.loginPage.enterVerificationCodeForOTP("1234");
        logger.info("Step 10: Click on Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        logger.info("Step 11: Verify submitted request popup will be displayed");
        app.changeTenantActivityPage.verifySubmitRequestPopupForNewTenantActivity();
        String RequestNum = app.changeTenantActivityPage.getRequestNumber();
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivity", "ChangeTenantActivityRequestNumber", RequestNum);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivity");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_064_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter Valid OTP number");
        app.loginPage.enterVerificationCodeForOTP("1234");
        logger.info("Step 10: Click on Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        logger.info("Step 11: Verify submitted request popup will be displayed");
        app.changeTenantActivityPage.verifySubmitRequestPopupForNewTenantActivity();
        logger.info("Step 12: Check request number contain 8 alphanumeric");
        String RequestNum = app.changeTenantActivityPage.getRequestNumber();
        app.changeTenantActivityPage.checkRequestNumberHasAlphaNumeric();
        app.changeTenantActivityPage.verifyRequestContainEightAlphaNumeric();
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivity", "ChangeTenantActivityRequestNumber", RequestNum);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivity");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_065_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter Valid OTP number");
        app.loginPage.enterVerificationCodeForOTP("1234");
        logger.info("Step 10: Click on Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        logger.info("Step 11: Verify submitted request popup will be displayed");
        app.changeTenantActivityPage.verifySubmitRequestPopupForNewTenantActivity();
        logger.info("Step 12: Check message 'الطلب بانتظار موافقة الطرف الآخر لمدة 7 ، وسيتم إشعاركم في حالة قبول أو رفض الطلب'. is visible");
        app.changeTenantActivityPage.checkRequestWaitingForSevenDaysMessage();
        String RequestNum = app.changeTenantActivityPage.getRequestNumber();
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivity", "ChangeTenantActivityRequestNumber", RequestNum);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivity");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_066_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter Valid OTP number");
        app.loginPage.enterVerificationCodeForOTP("1234");
        logger.info("Step 10: Click on Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        logger.info("Step 11: Verify submitted request popup will be displayed");
        app.changeTenantActivityPage.verifySubmitRequestPopupForNewTenantActivity();
        String RequestNum = app.changeTenantActivityPage.getRequestNumber();
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivity", "ChangeTenantActivityRequestNumber", RequestNum);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivity");
        logger.info("Step 12: Click on close button");
        app.loginPage.closeExploreEjarPopUp();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_067_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_068_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_069_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_070_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter invalid request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("HVDI09U6");
        logger.info("Step 06: Verify message 'حاليا ، ليس لديك أي طلب' is displayed");
        app.changeTenantActivityPage.assertInvalidRequest();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_071_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Verify 'قيد الانتظار ' status is displayed");
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_072_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: From Status dropdown list, Select pending status");
        app.changeTenantActivityPage.selectStatus("قيد الانتظار");
        logger.info("Step 07: From Request Type dropdown list,Select Commercial Activity Change");
        app.changeTenantActivityPage.selectRequestType("تغيير النشاط التجاري");
        String Date = app.changeTenantActivityPage.verifyIssueDate();
        app.changeTenantActivityPage.assertRequestDetails(data.get("ChangeTenantActivityRequestNumber"),
                "تغيير النشاط التجاري", data.get("ContractNumber"), Date);
        app.changeTenantActivityPage.assertCreatedDateAndIssuedByOnRequestDetails(data.get("LessorName"), data.get("TenantRepresentativeName"));
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_073_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Check request status 'موافق عليه'");
        CommonMethodsPage.checkRequestStatus("موافق عليه");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_074_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Check request status 'مرفوض'");
        CommonMethodsPage.checkRequestStatus("مرفوض");
    }

    //----------------------------------------------------------------
    //----------------Tenant Representative Approval Scenarios--------
    //----------------------------------------------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_075_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Verify ' الطلبات ' page is displayed");
        app.changeTenantActivityPage.checkRequestsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_076_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.assertFilterPopupIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_077_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        String Date = app.changeTenantActivityPage.verifyIssueDate();
        app.changeTenantActivityPage.assertRequestDetails(data.get("ChangeTenantActivityRequestNumber"),
                "تغيير النشاط التجاري", data.get("ContractNumber"), Date);
        app.changeTenantActivityPage.assertCreatedDateAndIssuedByOnRequestDetails(data.get("LessorName"), data.get("TenantRepresentativeName"));
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_078_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter invalid request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("WGAV74YEF");
        app.changeTenantActivityPage.assertInvalidRequest();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_079_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        String Date = app.changeTenantActivityPage.verifyIssueDate();
        app.changeTenantActivityPage.assertRequestDetails(data.get("ChangeTenantActivityRequestNumber"),
                "تغيير النشاط التجاري", data.get("ContractNumber"), Date);
        logger.info("Step 06: Check request status");
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_080_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("step 08: Verify( خطوات الموافقة على تغيير النشاط ) page is displayed");
        app.changeTenantActivityPage.assertTenantActivityApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_081_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("step 09: Verify( مراجعة تغيير نشاط المستأجر ) page is displayed");
        app.changeTenantActivityPage.assertReviewChangedTenantActivity();
    }

    //BUG------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_082_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Check Old Tenant Activity ( وصف نشاط المستأجر القديم ) details");
        app.changeTenantActivityPage.clickOnOldTenantActivity();
        app.changeTenantActivityPage.assertOldTenantDescriptionDetails("");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_083_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on ( نشاط المستأجر الجديد ) label > Check New Tenant Activity (وصف نشاط المستأجر الجديد) details");
        app.changeTenantActivityPage.clickOnNewTenantActivity();
        app.changeTenantActivityPage.assertNewTenantDescriptionDetails(data.get("NewTenantActivityDescription"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_084_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on Back ( السابق ) button");
        app.changeTenantActivityPage.clickBackButton();
        logger.info("step 10: Verify User neviagte back to ( خطوات الموافقة على تغيير النشاط ) page");
        app.changeTenantActivityPage.assertTenantActivityApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_085_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify user neviagte to 'الموافقة على نشاط المستأجر' page");
        app.changeTenantActivityPage.assertApproveTenantActivity();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_086_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on Cancel ( إلغاء ) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("step 12: Verify user neviagte back to ( مراجعة تغيير نشاط المستأجر ) page");
        app.changeTenantActivityPage.assertReviewChangedTenantActivity();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_087_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify ( إرسال الموافقة ) button is disabled/not clickable");
        app.changeTenantActivityPage.verifySubmitApprovalButtonDisabled(true);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_088_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify 'أقر بالموافقة على المذكور أعلاه' checkbox is clickable > ( إرسال الموافقة ) button is enabled");
        app.changeTenantActivityPage.clickOnIAgreeToTheAboveCheckBox();
        app.changeTenantActivityPage.verifySubmitApprovalButtonEnabled(true);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_089_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on 'أقر بالموافقة على المذكور أعلاه' checkbox");
        app.changeTenantActivityPage.clickOnIAgreeToTheAboveCheckBox();
        logger.info("Step 12: Click on ( إرسال الموافقة ) button");
        app.changeTenantActivityPage.clickOnSubmitApprovalBTN();
        logger.info("Step 13: Verify message of 'تم إرسال الموفقة' is displayed");
        app.changeTenantActivityPage.assertConfirmApprovalMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_090_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Check request status 'موافق عليه'");
        CommonMethodsPage.checkRequestStatus("موافق عليه");
    }

    //----------------------------------------------------------------
    //-------------------Lessor Reject Scenarios-----------------------
    //-----------------------------------------------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_091_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on (رفض ) button");
        app.changeTenantActivityPage.clickOnRejectBTN();
        logger.info("Step 11: Verify user neviagte to ' رفض نشاط المستأجر ' page");
        app.changeTenantActivityPage.assertRejectTenantActivityPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_092_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on ( رفض ) button");
        app.changeTenantActivityPage.clickOnRejectBTN();
        logger.info("Step 11: Click on \"إلغاء\" button");
        app.changeTenantActivityPage.clickOnCancelButton();
        logger.info("Step 12: Verify PopUp Alert is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_093_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on ( رفض ) button");
        app.changeTenantActivityPage.clickOnRejectBTN();
        logger.info("Step 11: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
        logger.info("Step 12: Click on \"إلغاء\" button from popup window");
        app.manualRenewalPage.clickOnCancelPopUpButton();
        logger.info("Step 13: Verify user remaining on ' رفض نشاط المستأجر ' page");
        app.changeTenantActivityPage.assertRejectTenantActivityPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_094_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on ( رفض ) button");
        app.changeTenantActivityPage.clickOnRejectBTN();
        logger.info("Step 11: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
        logger.info("Step 12: Click on \"تأكيد\" button from popup window");
        app.manualRenewalPage.clickOnConfirmPopUpButton();
        logger.info("step 13: Verify user neviagte back to 'مراجعة تغيير نشاط المستأجر 'page");
        CommonMethodsPage.scrollToElement(reviewChangeTenantActivity());
        app.changeTenantActivityPage.assertReviewChangedTenantActivity();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_095_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on New Tenant Activity ( نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on ( رفض ) button");
        app.changeTenantActivityPage.clickOnRejectBTN();
        logger.info("Step 11: Click on ( رفض نشاط المستأجر  ) button");
        app.changeTenantActivityPage.rejectTenantActivityBTN();
        logger.info("Step 12: Verify message of 'تم تقديم الرفض' is displayed");
        app.changeTenantActivityPage.assertConfirmRejectMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_096_ChangeTenantActivity(Map<String, String> data) throws Exception {
         data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ChangeTenantActivityRequestNumber"));
        logger.info("Step 06: Check request status 'مرفوض'");
        CommonMethodsPage.checkRequestStatus("مرفوض");
    }

    //----------------------------------------------------------------
    //----------------------Contract Scenario: -----------------------
    //----------------------------------------------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_097_ChangeTenantActivity(Map<String, String> data) throws Exception {
         data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        String NewContractVersion =app.changeTenantActivityPage.getContractVersionFromPDF(data.get("ContractNumber"));
        CommonMethodsPage.closeNewTab();
        logger.info("Step 09: Verify minor version of contract is increase");
        app.changeTenantActivityPage.assertContractVersionIsIncreased(data,NewContractVersion);
        app.changeTenantActivityPage.deleteDownloadFile(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_098_ChangeTenantActivity(Map<String, String> data) throws Exception {
         data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        String NewContractVersion =app.changeTenantActivityPage.getContractVersionFromPDF(data.get("ContractNumber"));
        CommonMethodsPage.closeNewTab();
        logger.info("Step 09: Verify minor version of contract is not increase if the request rejected from parties");
        app.changeTenantActivityPage.assertContractVersionIsNotIncreased(data,NewContractVersion);
        app.changeTenantActivityPage.deleteDownloadFile(data.get("ContractNumber"));
    }

     //BUG------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_099_ChangeTenantActivity(Map<String, String> data) throws Exception {
         data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        CommonMethodsPage.verifyNewTabIsOpened();
        String NewTenantActivityCommercial = app.changeTenantActivityPage.getNewTenantActivityCommercialFromPDF(data.get("ContractNumber"));
        logger.info("Step 09: Verify new tenant activity commercial is updated on copy of contract");
        app.changeTenantActivityPage.assertNewTenantDescriptionIsVisible(data,NewTenantActivityCommercial);
        app.changeTenantActivityPage.deleteDownloadFile(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_100_ChangeTenantActivity(Map<String, String> data) throws Exception {
         data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Verify 'تم إنشاء العقد' Is Visible In Contract Time Line after approved change tenant activity request from lessor");
        app.manualRenewalPage.contractTimeLineStatus("تم إنشاء العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_101_ChangeTenantActivity(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeTenantActivity"));
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (عرض العقد)  option");
        CommonMethodsPage.ClickOnViewContractOption("عرض العقد");
        logger.info("Step 08: Verify 'تم إنشاء العقد' Is Visible In Contract Time Line  after approved change tenant activity request from tenant");
        app.manualRenewalPage.contractTimeLineStatus("تم إنشاء العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_CreateChangeTenantActivityRequestByTenantRepresentative(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter Valid OTP number");
        app.loginPage.enterVerificationCodeForOTP("1234");
        logger.info("Step 10: Click on Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        logger.info("Step 11: Verify submitted request popup will be displayed");
        app.changeTenantActivityPage.verifySubmitRequestPopupForNewTenantActivity();
        String RequestNum = app.changeTenantActivityPage.getRequestNumber();
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivity", "ChangeTenantActivityRequestNumber", RequestNum);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivity");
        logger.info("Step 12: Click on close button");
        app.changeTenantActivityPage.closeSubmitRequestPopUp();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_CreateChangeTenantActivityRequestByLessor(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on contract ( العقود ) tab");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 03: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: From contract search field enter contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 05: Click on three dots (contract list action)");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on Change Tenant Activity  ( تغيير نشاط المستأجر ) option ");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير نشاط المستأجر");
        logger.info("Step 07: Enter text in New Tenant Activity  ( نشاط المستأجر الجديد ) input field");
        app.changeTenantActivityPage.addNewTenantActivityDescription(data.get("NewTenantActivityDescription"));
        logger.info("Step 08: Click on Submit Request (تقديم الطلب ) button");
        app.changeTenantActivityPage.clickOnSubmitRequest();
        logger.info("Step 09: Enter Valid OTP number");
        app.loginPage.enterVerificationCodeForOTP("1234");
        logger.info("Step 10: Click on Verify identity (التحقق من الهوية ) button from OTP Request popup");
        CommonMethodsPage.clickOnVerifyIdentityButton();
        logger.info("Step 11: Verify submitted request popup will be displayed");
        app.changeTenantActivityPage.verifySubmitRequestPopupForNewTenantActivity();
        String RequestNum = app.changeTenantActivityPage.getRequestNumber();
        TestDataManager.addDependantGlobalTestData("ChangeTenantActivity", "ChangeTenantActivityRequestNumber", RequestNum);
        TestDataManager.writeDependantGlobalTestData("ChangeTenantActivity");
        logger.info("Step 12: Click on close button");
        app.changeTenantActivityPage.closeSubmitRequestPopUp();
    }
}