package sa.ejar.web.login;

import com.testcrew.manager.TestDataManager;
import org.testng.annotations.Test;
import sa.ejar.api.repo.APICollection;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.SaveSecurityDepositPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class SaveSecurityDeposit extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void TC_01_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on 'تأكيد استلام / تسليم الوحدة'");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام / تسليم الوحدة");
        logger.info("Step 07: Click on نعم radio button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 07: Click the 'إرسال' button ");
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on 'تأكيد استلام / تسليم الوحدة'");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام / تسليم الوحدة");
        logger.info("Step 07: Click on نعم radio button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 07: Click the 'إرسال' button ");
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        logger.info("Step 01: Trigger the API to expire the contract");
        new APICollection().makeContractReadyForRenewal(data);
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_04_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify the contract status is 'Expired'");
        app.automaticRenewalPage.verifyContractStatus("منتهي");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on 'تأكيد استلام / تسليم الوحدة'");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام / تسليم الوحدة");
        logger.info("Step 07: Click on نعم radio button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 07: Click the 'إرسال' button ");
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on 'تأكيد استلام / تسليم الوحدة'");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام / تسليم الوحدة");
        logger.info("Step 07: Click on نعم radio button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 07: Click the 'إرسال' button ");
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on user profile");
        app.saveSecurityDepositPage.clickOnUserProfile();
        logger.info("Step 03: Click on إدارة الحساب");
        app.saveSecurityDepositPage.clickOnManageAccount();
        logger.info("Step 04: Click on المحفظة");
        app.saveSecurityDepositPage.clickOnWallet();
        logger.info("Step 05: From عمليات المحفظة  filter button and search by contract  number");
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        CommonMethodsPage.selectFromList("مبلغ الضمان المحجوز", SaveSecurityDepositPageObjects.SecurityAmountReservedOption());
        logger.info("Step 06: check the مبلغ الضمان المحجوز is displayed");
        app.saveSecurityDepositPage.verifySecurityAmountReservedDescriptionIsDisplayed("مبلغ الضمان المحجوز");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on user profile");
        app.saveSecurityDepositPage.clickOnUserProfile();
        logger.info("Step 03: Click on إدارة الحساب");
        app.saveSecurityDepositPage.clickOnManageAccount();
        logger.info("Step 04: Click on المحفظة");
        app.saveSecurityDepositPage.clickOnWallet();
        logger.info("Step 05: From عمليات المحفظة  filter button and search by contract  number");
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        CommonMethodsPage.selectFromList("مبلغ الضمان المحجوز", SaveSecurityDepositPageObjects.SecurityAmountReservedOption());
        logger.info("Step 06: Verify the مبلغ الضمان المحجوز in the wallet is same as in contract (500)");
        app.saveSecurityDepositPage.verifySecurityAmountReservedIsSameAsContract("500");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on 'عرض نموذج استلام / تسليم'");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام / تسليم");
        logger.info("Step 07: Verify the \"مبلغ الضمان المحجوز\" in the form is 500 SR");
        app.saveSecurityDepositPage.verifySecurityAmountInMoveInForm("500");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on 'تأكيد استلام / تسليم الوحدة'");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام / تسليم الوحدة");
        logger.info("Step 07: Click on نعم radio button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 07: Click the 'إرسال' button ");
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on 'تأكيد استلام / تسليم الوحدة'");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام / تسليم الوحدة");
        logger.info("Step 07: Click on نعم radio button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 07: Click the 'إرسال' button ");
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        logger.info("Step 01: Trigger the API to expire the contract");
        new APICollection().makeContractReadyForRenewal(data);
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_13_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify the contract status is 'Expired'");
        app.automaticRenewalPage.verifyContractStatus("منتهي");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on 'تأكيد استلام / تسليم الوحدة'");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام / تسليم الوحدة");
        logger.info("Step 07: Click on لا  radio button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        app.saveSecurityDepositPage.enterDamageAmount(data.get("DamageAmount"));
        logger.info("Step 07: Click the 'إرسال' button ");
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on 'تأكيد استلام / تسليم الوحدة'");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام / تسليم الوحدة");
        logger.info("Step 07: Click on لا  radio button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        app.saveSecurityDepositPage.enterDamageAmount(data.get("DamageAmount"));
        logger.info("Step 07: Click the 'إرسال' button ");
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on user profile");
        app.saveSecurityDepositPage.clickOnUserProfile();
        logger.info("Step 03: Click on إدارة الحساب");
        app.saveSecurityDepositPage.clickOnManageAccount();
        logger.info("Step 04: Click on المحفظة");
        app.saveSecurityDepositPage.clickOnWallet();
        logger.info("Step 05: From عمليات المحفظة  filter button and search by contract  number");
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        CommonMethodsPage.selectFromList("مبلغ الضمان المحجوز", SaveSecurityDepositPageObjects.SecurityAmountReservedOption());
        logger.info("Step 06: check the مبلغ الضمان المحجوز is displayed");
        app.saveSecurityDepositPage.verifySecurityAmountReservedDescriptionIsDisplayed("مبلغ الضمان المحجوز");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on user profile");
        app.saveSecurityDepositPage.clickOnUserProfile();
        logger.info("Step 03: Click on إدارة الحساب");
        app.saveSecurityDepositPage.clickOnManageAccount();
        logger.info("Step 04: Click on المحفظة");
        app.saveSecurityDepositPage.clickOnWallet();
        logger.info("Step 05: From عمليات المحفظة  filter button and search by contract  number");
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        CommonMethodsPage.selectFromList("استرداد مبلغ التأمين", SaveSecurityDepositPageObjects.SecurityAmountReservedOption());
        logger.info("Step 06: Verify استرداد مبلغ التأمين is displayed with the remaining amount (200 SR) ");
        app.saveSecurityDepositPage.verifySecurityAmountReservedDescriptionIsDisplayed("مبلغ الضمان المحجوز");
        app.saveSecurityDepositPage.verifySecurityAmountInMoveInForm("200");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on user profile");
        app.saveSecurityDepositPage.clickOnUserProfile();
        logger.info("Step 03: Click on إدارة الحساب");
        app.saveSecurityDepositPage.clickOnManageAccount();
        logger.info("Step 04: Click on المحفظة");
        app.saveSecurityDepositPage.clickOnWallet();
        logger.info("Step 05: From عمليات المحفظة  filter button and search by contract  number");
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        CommonMethodsPage.selectFromList("مبلغ الضمان المحجوز", SaveSecurityDepositPageObjects.SecurityAmountReservedOption());
        logger.info("Step 06: check the مبلغ الضمان المحجوز is displayed");
        app.saveSecurityDepositPage.verifySecurityAmountReservedDescriptionIsDisplayed("مبلغ الضمان المحجوز");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_SecurityDeposit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on user profile");
        app.saveSecurityDepositPage.clickOnUserProfile();
        logger.info("Step 03: Click on إدارة الحساب");
        app.saveSecurityDepositPage.clickOnManageAccount();
        logger.info("Step 04: Click on المحفظة");
        app.saveSecurityDepositPage.clickOnWallet();
        logger.info("Step 05: From عمليات المحفظة  filter button and search by contract  number");
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        CommonMethodsPage.selectFromList("استرداد مبلغ التأمين", SaveSecurityDepositPageObjects.SecurityAmountReservedOption());
        logger.info("Step 06: Verify استرداد مبلغ التأمين is displayed with the remaining amount (300 SR) ");
        app.saveSecurityDepositPage.verifySecurityAmountReservedDescriptionIsDisplayed("مبلغ الضمان المحجوز");
        app.saveSecurityDepositPage.verifySecurityAmountInMoveInForm("300");
    }
}
