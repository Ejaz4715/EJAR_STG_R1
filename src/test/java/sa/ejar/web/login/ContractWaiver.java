package sa.ejar.web.login;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.ContractWaiverPageObjects;
import sa.ejar.web.objects.RentalIncidentsPageObjects;
import sa.ejar.web.objects.RevokeContractPageObjects;
import sa.ejar.web.objects.pre_condition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.pre_condition.LoginPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class ContractWaiver extends NHCWebTest {

    /**
     * Submit Contract Waiver request
     * TC_01 to TC_55
     */
    @Test(dataProvider = "testDataProvider")
    public void TC_01_ContractWaiver(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Verify (  تقبيل العقد  ) option is displayed");
        CommonMethodsPage.KebabMenuOptions("تقبيل العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Verify Contract waiver service (خدمة تقبيل العقد) page is visible to the user");
        app.contractWaiverPage.verifyContractWaiverServicePageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify Contract waiver (تقبيل العقد) page is displayed");
        app.contractWaiverPage.verifyContractWaiverPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Cancel (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkTheContractsPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Verify  (طرف العقد فرد مستأجر) page is displayed");
        app.contractWaiverPage.verifyIndividualContractTenantPageIsDisplayed();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_08_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Verify user is able to click  المستأجر radio button");
        app.addResidentialContractPage.verifyTenantRadioBTNIsClickable();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Verify user is able to click   ممثل المستأجر  radio button");
        app.addResidentialContractPage.verifyTenantRepresentativeRadioBTNIsClickable();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Verify user is able to click هوية وطنية radio button");
        app.contractWaiverPage.verifyUserIsAbleToClickNationalIdRadioButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Verify National Id input field is enabled and accepts valid value");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        CommonMethodsPage.verifyValueIsEntered(data.get("TenantNationalID"), AddResidentialContractPageObjects.tenantNationalIdInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input national id less than 10 numbers");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID_LessThanTenDigits"));
        logger.info("Step 13: Verify National Id input field  displays an error message ");
        CommonMethodsPage.errorMessage("الحد", ContractWaiverPageObjects.ErrorMessageUnderNatinalId());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input national id including a letter");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID_WithLetters"));
        logger.info("Step 13: Verify National Id input field displays an error message  ");
        CommonMethodsPage.errorMessage("يرجى", ContractWaiverPageObjects.ErrorMessageUnderNatinalId());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Verify the input field is enabled");
        app.contractWaiverPage.verifyDOBInputFieldIsEnabled();
        logger.info("Step 13: Verify user is abel to Input valid DOB in Hijri format");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        CommonMethodsPage.verifyValueIsEntered(data.get("TenantValidDOB"), AddResidentialContractPageObjects.tenantDateOfBirthInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Verify the input field is enabled");
        app.contractWaiverPage.verifyDOBInputFieldIsEnabled();
        logger.info("Step 13: Input a date starting in Gregorian format above year (1600)");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantDOB_WrongFormat"));
        CommonMethodsPage.verifyValueIsNotEntered(data.get("TenantDOB_WrongFormat"), AddResidentialContractPageObjects.tenantDateOfBirthInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Verify the input field is enabled");
        app.contractWaiverPage.verifyDOBInputFieldIsEnabled();
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantDOB_Future"));
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_17_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Verify user is able to click on calender Icon");
        app.revokeContractPage.clickOnCalenderIcon();
        logger.info("Step 13: Verify Calendar pop up is displayed");
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 13: Verify equivalent Gregorian date is displayed under تاريخ الميلاد input field");
        CommonMethodsPage.verifyEquivalentDateIsDisplayed("gregorian");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 13: Verify Next button is enabled");
        CommonMethodsPage.verifyNextButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on إلغاء Button");
        CommonMethodsPage.clickOnCancelButton();
        app.contractWaiverPage.verifyContractWaiverPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Verify Next button is enabled and clickable");
        CommonMethodsPage.clickOnNextButton();
        app.contractWaiverPage.verifyTenantPartyInfoPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a phone number which does not begin with digit 5");
        CommonMethodsPage.enterPhoneNumber(data.get("TenantPhoneNumber_NotBeginWith5"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.PhoneNumberInputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a phone number begins with digit 5 having length = 1");
        CommonMethodsPage.enterPhoneNumber(data.get("TenantPhoneNumber_OneDigit"));
        CommonMethodsPage.errorMessage("الأدنى", CommonMethodsPageObjects.PhoneNumberInputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a phone number begins with digit 5 having length = 9");
        CommonMethodsPage.enterPhoneNumber(data.get("TenantPhoneNumber_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("TenantPhoneNumber_Valid"), CommonMethodsPageObjects.PhoneNumberInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input an email with invalid format");
        CommonMethodsPage.enterEmail(data.get("TenantEmail_Invalid"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.EmailErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a valid email address");
        CommonMethodsPage.enterEmail(data.get("TenantEmail_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("TenantEmail_Valid"), CommonMethodsPageObjects.EmailInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_27_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on المنطقة dropdown > Select region");
        CommonMethodsPage.clickOnRegionDropdownMenu();
        CommonMethodsPage.selectFromList(data.get("TenantRegion"), CommonMethodsPageObjects.RegionDropdown());
        logger.addScreenshot("Region selected");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on المدينة dropdown");
        CommonMethodsPage.clickOnCityDropdown();
        logger.info("Step 15: Select an option from available cities");
        CommonMethodsPage.SelectCity(data.get("TenantCity"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a numerical value with with letters in Postal code input");
        CommonMethodsPage.enterPostalCode(data.get("TenantPostalCode_Invalid"));
        CommonMethodsPage.errorMessage("يجب", CommonMethodsPageObjects.PostalCodeError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Enter a valid postal code including on numerical values");
        CommonMethodsPage.enterPostalCode(data.get("TenantPostalCode_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("TenantPostalCode_Valid"), CommonMethodsPageObjects.PostalCodeInput());
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_31_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a value including any special character in اسم الشارع input field");
        CommonMethodsPage.enterStreetName(data.get("TenantStreetName_Invalid"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.StreetNameError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a valid value in (اسم الشارع ) input field");
        CommonMethodsPage.enterStreetName(data.get("TenantStreetName_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("TenantStreetName_Valid"), CommonMethodsPageObjects.StreetNameInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_33_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a numerical value with (length < 5) in  رقم المبنى field");
        CommonMethodsPage.enterBuildingNumber(data.get("TenantBuildingNum_Invalid"));
        CommonMethodsPage.errorMessage("يجب", CommonMethodsPageObjects.BuildingNumberError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_34_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input numerical value رقم المبنى field of length = 4");
        CommonMethodsPage.enterBuildingNumber(data.get("TenantBuildingNum_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("TenantBuildingNum_Valid"), CommonMethodsPageObjects.BuildingNumberInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_35_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a numerical value with (length < 4) in  الرقم الإضافي  field");
        CommonMethodsPage.enterAdditionalNumber(data.get("TenantAdditionalNum_Invalid"));
        CommonMethodsPage.errorMessage("يجب", CommonMethodsPageObjects.AdditionalNumberError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input numerical value الرقم الإضافي  field of length = 4");
        CommonMethodsPage.enterAdditionalNumber(data.get("TenantAdditionalNum_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("TenantAdditionalNum_Valid"), CommonMethodsPageObjects.AdditionalNumberInput());
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_37_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on Cancel button");
        CommonMethodsPage.clickOnCancelButton();
        app.contractWaiverPage.verifyContractWaiverPageIsDisplayed();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_38_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on previous button");
        CommonMethodsPage.clickOnBackButton();
        app.contractWaiverPage.verifyIndividualContractTenantPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_39_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on Add an individual as a tenant( إضافة فرد كمستأجر)");
        app.contractWaiverPage.clickOnAddIndividualTenant();
        logger.info("Step 10: Click on  المستأجر radio button");
        app.addResidentialContractPage.clickTenantRadioBTN();
        logger.info("Step 11: Click on هوية وطنية radio button");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        logger.info("Step 12: Input valid National id for ner Tenant");
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
        logger.info("Step 13: Input a valid date of birth for new Tenant");
        app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
        logger.info("Step 14: Click next button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Enter phone number");
        CommonMethodsPage.enterPhoneNumber(data.get("TenantPhoneNumber_Valid"));
        logger.info("Step 16: Select province");
        CommonMethodsPage.selectFromList(data.get("TenantRegion"), CommonMethodsPageObjects.RegionDropdown());
        logger.info("Step 17: Select city");
        CommonMethodsPage.clickOnCityDropdown();
        CommonMethodsPage.SelectCity(data.get("TenantCity"));
        logger.info("Step 18: Click on   تأكيد   Button ");
        CommonMethodsPage.clickOnConfirmButton();
        app.contractWaiverPage.verifyContractWaiverPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_40_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
//        CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on إلغاء Button ");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkTheContractsPage();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_41_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
//        CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 19: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        app.contractWaiverPage.verifyRentalDetailsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_42_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        //        CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  السابق  Button");
        CommonMethodsPage.clickOnBackButton();
        app.contractWaiverPage.verifyContractWaiverPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_43_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        //        CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10:  Click on التالي Button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 20);
        CommonMethodsPage.clickOnNextButton();
        app.contractWaiverPage.verifyNewTenantPartySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_44_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10:  Click on التالي Button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 20);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on السابق Button");
        CommonMethodsPage.clickOnBackButton();
        app.contractWaiverPage.verifyContractDetailsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_45_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10:  Click on التالي Button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 20);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on 'أنا أوافق على ما سبق'  checkbox");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        app.contractWaiverPage.verifyAcknowledgementCheckboxIsChecked();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_46_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        //CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10:  Click on التالي Button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 20);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify  تأكيد Button is not clickable");
        app.contractWaiverPage.verifyConfirmButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_47_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        //CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 19: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 20:  Click on التالي Button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 20);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 21: Click on acknowledgement checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 22: Click on تأكيد Button ");
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.verifySuccessPopUpIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_48_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        //CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10:  Click on التالي Button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 20);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on acknowledgement checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click on تأكيد Button ");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Click on تأكيد Button on the pop up");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        CommonMethodsPage.verifyOTPPopIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_49_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        //CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10:  Click on التالي Button");
//        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(),20);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on acknowledgement checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click on تأكيد Button ");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Click on إلغاء Button on the pop up");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        app.contractWaiverPage.verifyNewTenantPartySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_50_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        //CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10:  Click on التالي Button");
//        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(),20);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on acknowledgement checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click on تأكيد Button ");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Click on تأكيد Button on the pop up");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        logger.info("Step 14: Enter OTP code");
        app.loginPage.enterVerificationCodeForOTP(data.get("OTP"));
        String fistCharOfOTP = String.valueOf(data.get("OTP").charAt(0));
        CommonMethodsPage.verifyValueIsEntered(fistCharOfOTP, LoginPageObjects.getVerificationCode());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_51_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        //CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10:  Click on التالي Button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 20);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on acknowledgement checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click on تأكيد Button ");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Click on تأكيد Button on the pop up");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        logger.info("Step 14: Verify  التحقق من الهوية  button is disabled");
        CommonMethodsPage.checkVerifyIdentityButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_52_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        //CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10:  Click on التالي Button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 20);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on acknowledgement checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click on تأكيد Button ");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Click on تأكيد Button on the pop up");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        logger.info("Step 14: Input wrong OTP code");
        app.loginPage.enterVerificationCodeForOTP(data.get("WrongOTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        app.sendContractForApprovalPage.verifyOTPErrorMessageIsDisplayed();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_53_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        //CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10:  Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on acknowledgement checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click on تأكيد Button ");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Click on تأكيد Button on the pop up");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        logger.info("Step 14: Click on  إلغاء  button");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        app.contractWaiverPage.verifyNewTenantPartySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_54_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        //CommonMethodsPage.clickOnNextButton();
        Browser.waitForSeconds(2);
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        logger.info("Step 09: Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10:  Click on التالي Button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on acknowledgement checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click on تأكيد Button ");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Click on تأكيد Button on the pop up");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        logger.info("Step 14: Input correct OTP code");
        app.loginPage.enterVerificationCodeForOTP(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        CommonMethodsPage.verifySuccessPopUpIsDisplayed();
        app.contractWaiverPage.requestNumber();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_55_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestStatus("في انتظار موافقة المؤجر");
    }


    /**
     * Lessor Approval For Contract Waiver Request
     * TC_56 to TC_75
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_56_ContractWaiver(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_57_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.verifySearchedRequestIsDisplayed(data.get("RequestNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_58_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        app.contractWaiverPage.verifyContractWaiverServicePageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_59_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on cancel button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Contract Waiver");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_60_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        app.contractWaiverPage.verifyContractDetailsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_61_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \" إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Contract Waiver");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_62_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        app.contractWaiverPage.verifyRentalDetailsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_63_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" عرض \"  button");
        CommonMethodsPage.ClickOnAttachment("view");
        Browser.waitForSeconds(5);
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_64_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" إلغاء \"  button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Contract Waiver");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_65_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" السابق \"  button ");
        CommonMethodsPage.clickOnBackButton();
        app.contractWaiverPage.verifyContractDetailsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_66_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.AttachmentIcon(), 40);
        CommonMethodsPage.clickOnNextButton();
        app.contractWaiverPage.verifyDeclareAndConfirmSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_67_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        Browser.waitUntilVisibilityOfElement(RevokeContractPageObjects.AttachmentIcon(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on إلغاء button ");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Contract Waiver");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_68_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        app.contractWaiverPage.verifyRentalDetailsSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on السابق  button ");
        CommonMethodsPage.clickOnBackButton();
        app.contractWaiverPage.verifyRentalDetailsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_69_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        app.contractWaiverPage.verifyRentalDetailsSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \" أنا أوافق على ما سبق  \"  checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        app.contractWaiverPage.verifyAcknowledgementCheckboxIsChecked();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_70_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        app.contractWaiverPage.verifyRentalDetailsSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify \"تأكيد الموافقة\" button is not clickable");
        CommonMethodsPage.verifyConfirmButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_71_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        app.contractWaiverPage.verifyRentalDetailsSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \" أنا أوافق على ما سبق  \"  checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click \"تأكيد الموافقة\" button");
        CommonMethodsPage.clickOnConfirmButton();
        app.contractWaiverPage.verifyConfirmationPopUpAppears();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_72_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        app.contractWaiverPage.verifyRentalDetailsSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \" أنا أوافق على ما سبق  \"  checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click \"تأكيد الموافقة\" button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Click on إلغاء button");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        app.contractWaiverPage.verifyDeclareAndConfirmSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_73_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        app.contractWaiverPage.verifyRentalDetailsSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \" أنا أوافق على ما سبق  \"  checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click \"تأكيد الموافقة\" button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Click on \"تأكيد\" button");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        CommonMethodsPage.verifyOTPPopIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_74_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        app.contractWaiverPage.verifyRentalDetailsSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \" أنا أوافق على ما سبق  \"  checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click \"تأكيد الموافقة\" button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Click on \"تأكيد\" button");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        logger.info("Step 14: Enter valid OTP");
        app.loginPage.enterVerificationCodeForOTP(data.get("OTP"));
        logger.info("Step 15: Click on \" التحقق من الهوية \" button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        CommonMethodsPage.verifySuccessPopUpIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_75_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestStatus("في انتظار موافقة المستأجر الجديد");
    }

    /**
     * New Tenant Approval For Contract Waiver Request
     * TC_76 to TC_93
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_76_ContractWaiver(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_77_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.verifySearchedRequestIsDisplayed(data.get("RequestNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_78_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        app.contractWaiverPage.verifyContractWaiverServicePageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_79_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on cancel button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Contract Waiver");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_80_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        app.contractWaiverPage.verifyContractDetailsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_81_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \" إلغاء\" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Contract Waiver");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_82_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnNextButton();
        app.contractWaiverPage.verifyRentalDetailsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_83_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" عرض \"  button");
        CommonMethodsPage.ClickOnAttachment("view");
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_84_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" إلغاء \"  button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Contract Waiver");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_85_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" السابق \"  button ");
        CommonMethodsPage.clickOnBackButton();
        app.contractWaiverPage.verifyContractDetailsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_86_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.RentalDetailsSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        app.contractWaiverPage.verifyDeclareAndConfirmSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_87_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.RentalDetailsSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on إلغاء button ");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Contract Waiver");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_88_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.RentalDetailsSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on السابق  button ");
        CommonMethodsPage.clickOnBackButton();
        app.contractWaiverPage.verifyRentalDetailsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_89_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.RentalDetailsSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \" أنا أوافق على ما سبق  \"  checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        app.contractWaiverPage.verifyAcknowledgementCheckboxIsChecked();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_90_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.RentalDetailsSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify \"تأكيد الموافقة\" button is not clickable");
        CommonMethodsPage.verifyConfirmButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_91_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.RentalDetailsSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \" أنا أوافق على ما سبق  \"  checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click \"تأكيد الموافقة\" button");
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.verifyOTPPopIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_92_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.RentalDetailsSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \" أنا أوافق على ما سبق  \"  checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click \"تأكيد الموافقة\" button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Enter valid OTP");
        app.loginPage.enterVerificationCodeForOTP(data.get("OTP"));
        logger.info("Step 14: Click on \" التحقق من الهوية \" button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        CommonMethodsPage.verifySuccessPopUpIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_93_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestStatus("موافقة");
    }


    /**
     * Verify the Contract Status As A Lessor, After Contract Waiver Request Is Approved From All Parties
     * TC_92 to TC_98
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_94_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on  \"العقود\" tab ");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\" ");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.checkTheContractsPage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_95_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on  \"العقود\" tab ");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\" ");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_96_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on  \"العقود\" tab ");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\" ");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify verify status of old contract is Archived (مؤرشف) ");
        CommonMethodsPage.verifyStatusOfContract(data.get("Old_ContractStatus"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_97_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on  \"العقود\" tab ");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\" ");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify verify status of new contract is Active (نشط)  ");
        CommonMethodsPage.verifyStatusOfContract(data.get("New_ContractStatus"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_98_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on  \"العقود\" tab ");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\" ");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify Tenant name is different in new contract");
        app.contractWaiverPage.verifyTenantNameIsChanged(data.get("New_TenantName"), data.get("Old_TenantName"));
    }


    /**
     * Lessor Rejection For Contract Waiver Request
     * TC_99 to TC_108
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_99_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on التالي Button");
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.RentalDetailsSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on acknowledgement checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 11: Click on تأكيد Button ");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Click on تأكيد Button on the pop up");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        logger.info("Step 13: Input OTP code");
        app.loginPage.enterVerificationCodeForOTP(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        app.contractWaiverPage.requestNumber();
        logger.info("Step 14: Click on إغلاق button");
        CommonMethodsPage.clickOnCloseButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_100_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_101_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button > Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.KebabMenuOptions("الموافقة / رفض تقبيل العقد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_102_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button > Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 06: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 07: Click on \"الرفض\" button");
        CommonMethodsPage.clickOnRejectBTN();
        CommonMethodsPage.verifyConfirmPopUpIsDisplayedAfterRejectRequest();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_103_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button > Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 06: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 07: Click on \"الرفض\" button");
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 08: Enter reason for rejection in \"سبب الرفض\" text field");
        CommonMethodsPage.enterRejectionReasonNote(data.get("RejectReason"));
        CommonMethodsPage.verifyValueIsEntered(data.get("RejectReason"), CommonMethodsPageObjects.rejectionReasonNote());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_104_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button > Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 06: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 07: Click on \"الرفض\" button");
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 08: Verify \"نعم, أنا متأكد\" is not clickable");
        app.contractWaiverPage.verifyYesAgreeButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_105_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button > Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 06: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 07: Click on \"الرفض\" button");
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 08: Enter reason for rejection in \"سبب الرفض\" text field");
        CommonMethodsPage.enterRejectionReasonNote(data.get("RejectReason"));
        logger.info("Step 08: Verify \"نعم, أنا متأكد\" is clickable");
        app.contractWaiverPage.clickOnYesAgreeButton();
        CommonMethodsPage.verifyOTPPopIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_106_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button > Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 06: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 07: Click on \"الرفض\" button");
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 08: Enter reason for rejection in \"سبب الرفض\" text field");
        CommonMethodsPage.enterRejectionReasonNote(data.get("RejectReason"));
        logger.info("Step 08: Verify \"نعم, أنا متأكد\" is clickable");
        app.contractWaiverPage.clickOnYesAgreeButton();
        logger.info("Step 09: Input OTP code");
        app.loginPage.enterVerificationCodeForOTP(data.get("OTP"));
        String fistCharOfOTP = String.valueOf(data.get("OTP").charAt(0));
        CommonMethodsPage.verifyValueIsEntered(fistCharOfOTP, LoginPageObjects.getVerificationCode());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_107_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button > Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 06: Click on NEXT button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 07: Click on \"الرفض\" button");
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 08: Enter reason for rejection in \"سبب الرفض\" text field");
        CommonMethodsPage.enterRejectionReasonNote(data.get("RejectReason"));
        logger.info("Step 08: Verify \"نعم, أنا متأكد\" is clickable");
        app.contractWaiverPage.clickOnYesAgreeButton();
        logger.info("Step 09: Input OTP code");
        app.loginPage.enterVerificationCodeForOTP(data.get("OTP"));
        logger.info("Step 10: Click on \" التحقق من الهوية \" button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 11: Click on CLOSE button");
        CommonMethodsPage.clickOnCloseButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Contract Waiver");
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_108_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Verify the status of requests is \"مرفوض من قبل المؤجر\"");
        CommonMethodsPage.checkRequestStatus("مرفوض من قبل المؤجر");
    }


    /**
     * Tenant Rejection For Contract Waiver Request
     * TC_109 to TC_119
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_109_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
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
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 08: Click on Next button twice");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        if (!(Browser.isElementPresent(ContractWaiverPageObjects.TenantIdNumberSection()))) {
            app.contractWaiverPage.clickOnAddIndividualTenant();
            app.addResidentialContractPage.clickTenantRadioBTN();
            app.contractWaiverPage.clickOnNationalIdRadioButton();
            app.addResidentialContractPage.inputTenantNationalId(data.get("TenantNationalID"));
            app.contractWaiverPage.enterValidTenantDOB(data.get("TenantValidDOB"));
            CommonMethodsPage.clickOnNextButton();
            CommonMethodsPage.clickOnConfirmButton();
        }
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on التالي Button");
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.RentalDetailsSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on acknowledgement checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 11: Click on تأكيد Button ");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Click on تأكيد Button on the pop up");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        logger.info("Step 13: Input OTP code");
        app.loginPage.enterVerificationCodeForOTP(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        app.contractWaiverPage.requestNumber();
        logger.info("Step 14: Click on إغلاق button");
        CommonMethodsPage.clickOnCloseButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_110_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        logger.info("Step 08: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"  التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"التالي\" button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \" أنا أوافق على ما سبق  \"  checkbox ");
        app.contractWaiverPage.clickOnAcknowledgementCheckbox();
        logger.info("Step 12: Click \"تأكيد الموافقة\" button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: Click on \"تأكيد\" button on pop up ");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        logger.info("Step 14: Enter valid OTP");
        app.loginPage.enterVerificationCodeForOTP(data.get("OTP"));
        logger.info("Step 15: Click on \" التحقق من الهوية \" button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 16: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCloseButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_111_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestsPageIsDisplayed(data.get("RequestNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_112_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestsPageIsDisplayed(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        app.contractWaiverPage.verifyContractWaiverServicePageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_113_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on \"الرفض\" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnRejectBTN();
        CommonMethodsPage.verifyConfirmPopUpIsDisplayedAfterRejectRequest();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_114_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestsPageIsDisplayed(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on \"الرفض\" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 09: Enter reason for rejection in \"سبب الرفض\" text field");
        CommonMethodsPage.enterRejectionReasonNote(data.get("RejectReason"));
        CommonMethodsPage.verifyValueIsEntered(data.get("RejectReason"), CommonMethodsPageObjects.rejectionReasonNote());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_115_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestsPageIsDisplayed(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on \"الرفض\" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 09: Verify \"نعم, أنا متأكد\" is not clickable");
        app.contractWaiverPage.verifyYesAgreeButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_116_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestsPageIsDisplayed(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on \"الرفض\" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 09: Enter reason for rejection in \"سبب الرفض\" text field");
        CommonMethodsPage.enterRejectionReasonNote(data.get("RejectReason"));
        logger.info("Step 09: Verify \"نعم, أنا متأكد\" is clickable");
        app.contractWaiverPage.clickOnYesAgreeButton();
        CommonMethodsPage.verifyOTPPopIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_117_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestsPageIsDisplayed(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on \"الرفض\" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 09: Enter reason for rejection in \"سبب الرفض\" text field");
        CommonMethodsPage.enterRejectionReasonNote(data.get("RejectReason"));
        logger.info("Step 10: Verify \"نعم, أنا متأكد\" is clickable");
        app.contractWaiverPage.clickOnYesAgreeButton();
        logger.info("Step 11: Input OTP");
        app.loginPage.enterVerificationCodeForOTP(data.get("OTP"));
        String fistCharOfOTP = String.valueOf(data.get("OTP").charAt(0));
        CommonMethodsPage.verifyValueIsEntered(fistCharOfOTP, LoginPageObjects.getVerificationCode());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_118_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestsPageIsDisplayed(data.get("RequestNumber"));
        logger.info("Step 06: Click on Kebab menu button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  الموافقة / رفض تقبيل العقد  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on \"الرفض\" button");
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.PopUpErrorMessage(), 40);
        CommonMethodsPage.clickOnRejectBTN();
        logger.info("Step 09: Enter reason for rejection in \"سبب الرفض\" text field");
        CommonMethodsPage.enterRejectionReasonNote(data.get("RejectReason"));
        logger.info("Step 10: Verify \"نعم, أنا متأكد\" is clickable");
        app.contractWaiverPage.clickOnYesAgreeButton();
        logger.info("Step 11: Input OTP");
        app.loginPage.enterVerificationCodeForOTP(data.get("OTP"));
        logger.info("Step 12: Click on \" التحقق من الهوية \" button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        CommonMethodsPage.verifySuccessPopUpIsDisplayed();
        logger.info("Step 13: Click on \" إغلاق \" button");
        CommonMethodsPage.clickOnCloseButton();
        CommonMethodsPage.checkRequestsPageIsDisplayed("Contract Waiver");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_119_ContractWaiver(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ContractWaiver"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \" الطلبات \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in رقم الطلب input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestStatus("مرفوض من قبل المستأجر الجديد");
    }

    /**
     * Tenant Rejection For Contract Waiver Request
     * TC_120 to TC_124
     */
    @Test(dataProvider = "testDataProvider")
    public void TC_120_ContractWaiver(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Existing_ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify error message (pending contract waiver request)");
        app.contractWaiverPage.verifyErrorMessagePopUpIsDisplayed();
        app.contractWaiverPage.validateTheErrorMessageOnPopUp("بطلب بحالة بانتظار  موافقة الأطراف");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_121_ContractWaiver(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Existing_ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify error message (pending request to Change Lessor/Lessor Representative)");
        app.contractWaiverPage.verifyErrorMessagePopUpIsDisplayed();
        app.contractWaiverPage.validateTheErrorMessageOnPopUp("عذرا، لا يمكن تقديم طلب التنازل عن العقد بسبب وجود طلب تغيير المؤجر/ممثل المؤجر على نفس وثيقة الملكية التابع لهذا العقد بانتظار الموافقة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_122_ContractWaiver(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Existing_ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify error message (Main contract has a sublease contract)");
        app.contractWaiverPage.verifyErrorMessagePopUpIsDisplayed();
        app.contractWaiverPage.validateTheErrorMessageOnPopUp("عذرا، لا يمكن تقديم طلب التنازل عن العقد لمستأجر مرتبط بعقد من الباطن");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_123_ContractWaiver(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Existing_ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify error message (Security deposit is enabled)");
        app.contractWaiverPage.verifyErrorMessagePopUpIsDisplayed();
        app.contractWaiverPage.validateTheErrorMessageOnPopUp("عذرا، لا يمكن تقديم طلب التنازل عن العقد بسبب وجود حجز مبلغ الضمان لديك");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_124_ContractWaiver(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.loginToEjar(data.get("Username"), data.get("Password"), data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Existing_ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify the error message pop up is displayed");
        app.contractWaiverPage.verifyErrorMessagePopUpIsDisplayed();
        logger.info("Step 08: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCloseButton();
        app.contractWaiverPage.verifyContractWaiverServicePageIsDisplayed();
    }
}
