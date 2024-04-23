package sa.ejar.web.login;

import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.ContractWaiverPageObjects;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class ContractWaiver extends NHCWebTest {

/**
 * Pre Conditions
 * -Create Contracts
 * -Approve from parties
 */



    /**
     * Submit Contract Waiver request
     * TC_01 to TC_
     * */
    @Test(dataProvider = "testDataProvider")
    public void TC_01_ContractWaiver(Map<String, String> data) throws Exception {
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
    public void TC_02_ContractWaiver(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_ContractWaiver(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Verify (  تقبيل العقد  ) option is displayed");
        CommonMethodsPage.KebabMenuOptions("تقبيل العقد");
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_04_ContractWaiver(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        logger.info("Step 07: Verify Contract waiver service (خدمة تقبيل العقد) page is visible to the user");
        app.contractWaiverPage.verifyContractWaiverServicePageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_ContractWaiver(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  (  تقبيل العقد  ) option");
        CommonMethodsPage.ClickOnKebabMenuOption("تقبيل العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 07: Verify Contract waiver (تقبيل العقد) page is displayed");
        app.contractWaiverPage.verifyContractWaiverPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_ContractWaiver(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.errorMessage(" الحد الأدنى لعدد الأحرف هو 10 " , ContractWaiverPageObjects.ErrorMessageUnderNatinalId());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_ContractWaiver(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.errorMessage("يرجى التأكد من التنسيق" , ContractWaiverPageObjects.ErrorMessageUnderNatinalId());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_ContractWaiver(Map<String, String> data) throws Exception {
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
        String greaterDateThanCurrent = CommonMethodsPage.getCurrentDate(10, 2, 2);
        app.contractWaiverPage.enterValidTenantDOB(greaterDateThanCurrent);
        CommonMethodsPage.errorMessage("أقصى قيمة هي", AddResidentialContractPageObjects.tenantDateOfBirthInput());
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_17_ContractWaiver(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.errorMessage(" يرجى التأكد من التنسيق ", CommonMethodsPageObjects.PhoneNumberInputFieldErrorMessage());
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_23_ContractWaiver(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.errorMessage(" الحد الأدنى لعدد الأحرف هو 6 ", CommonMethodsPageObjects.PhoneNumberInputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_ContractWaiver(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.errorMessage(" يرجى التأكد من التنسيق ", CommonMethodsPageObjects.EmailErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_ContractWaiver(Map<String, String> data) throws Exception {
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
        logger.info("Step 15: Click on المنطقة dropdown");
        CommonMethodsPage.clickOnRegionDropdownMenu();
        logger.info("Step 15: Select an option");
        CommonMethodsPage.selectRegion(data.get("TenantRegion"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_ContractWaiver(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.errorMessage(" يجب أن يكون 5 رقمًا " , CommonMethodsPageObjects.PostalCodeError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_ContractWaiver(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.verifyValueIsEntered(data.get("TenantPostalCode_Valid"), CommonMethodsPageObjects.PostalCodeError());
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_31_ContractWaiver(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.errorMessage("", CommonMethodsPageObjects.StreetNameError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_ContractWaiver(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.errorMessage(" يجب أن يكون 4 رقمًا ", CommonMethodsPageObjects.BuildingNumberError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_34_ContractWaiver(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.errorMessage(" يجب أن يكون 4 رقمًا ", CommonMethodsPageObjects.AdditionalNumberError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_ContractWaiver(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickOnRegionDropdownMenu();
        CommonMethodsPage.selectRegion(data.get("TenantRegion"));
        logger.info("Step 17: Select city");
        CommonMethodsPage.clickOnCityDropdown();
        CommonMethodsPage.SelectCity(data.get("TenantCity"));
        logger.info("Step 18: Click on   تأكيد   Button ");
        CommonMethodsPage.clickOnNextButton();
        //incomplete
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_40_ContractWaiver(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickOnRegionDropdownMenu();
        CommonMethodsPage.selectRegion(data.get("TenantRegion"));
        logger.info("Step 17: Select city");
        CommonMethodsPage.clickOnCityDropdown();
        CommonMethodsPage.SelectCity(data.get("TenantCity"));
        logger.info("Step 18: Click on   تأكيد   Button ");
        CommonMethodsPage.clickOnNextButton();
        //incomplete
    }

}
