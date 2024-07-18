package sa.ejar.web.login.pre_condition;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.pre_condition.AddResidentialContractPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;
import java.util.Map;

public class ResidentialContract extends NHCWebTest{

    @Test(dataProvider = "testDataProvider")
    public void ResidentialContractMoreThanThreeMonths(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
app.loginPage.clickLogin();        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.clickOnStartDay();
        String endDate = CommonMethodsPage.getCurrentDate(1,0,0);
        app.addResidentialContractPage.selectEndDateOfResidualContract(endDate.substring(6, 8).replaceFirst("^0*", ""), app.addResidentialContractPage.getCurrentMonth(endDate.substring(4, 6)), endDate.substring(0, 4));
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.addResidentialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty(data.get("Property_Name"));
        app.addResidentialContractPage.clickContinueWithThisPropertyBTN();
        app.addResidentialContractPage.clickContinueToSelectUnitsBTN();
        app.addResidentialContractPage.clickFilterBtnOnSelectUnitPage();
        app.addResidentialContractPage.selectUnitsAvailability();
        app.addResidentialContractPage.selectFirstAvailableUnit();
        app.addResidentialContractPage.clickConfirmPropertyDetailsBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.newAddress())) {
            app.addResidentialContractPage.clickIdentifyAddressOnMapBTN();
            app.addResidentialContractPage.clickConfirmBtnOnMap();
            app.addResidentialContractPage.clickSaveBtnOnPropertyAddress();
        }
        logger.info("Step 05: Navigate to Add Individual Tenant > Input Individual's identification details > Continue");
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddIndividualTenantBTN();
        app.addResidentialContractPage.clickTenantRadioBTN();
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 06: Navigate to Financial > Input annual rent > Select Single Payment > select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.addNewIbanInContract())) {
            app.addResidentialContractPage.addNewIbanBTN();
            app.addResidentialContractPage.enterIbanNumber("SA8720000000000000034567");
            app.addResidentialContractPage.enterAccountOwnerName("Test 3 Bank");
            app.addResidentialContractPage.clickSaveBTNOnAddIban();
        }
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRadioBtnForAccountOwner();
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.clickConfirmFinancialTermsBTN(data.get("EnableSecurityDeposit"), data.get("SecurityAmount"));
        logger.info("Step 07:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectGoverningLaw(data.get("EnableSublease"));
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        logger.info("Step 08:  Submit the contract > Review all details > Submit");
        if(data.get("SubmitOrDraft").equalsIgnoreCase("submit")){
            app.addResidentialContractPage.clickSubmitForApprovalBTN();
            app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
            app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
            app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
            app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
            Browser.waitForSeconds(5);
            CommonMethodsPage.clickRatingButtons();
            CommonMethodsPage.clickOnSubmitButton();
            app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
            String contractNum =  app.addResidentialContractPage.getContractNumber();
            TestDataManager.addDependantGlobalTestData("Contracts", "ContractNumber", contractNum);
            TestDataManager.writeDependantGlobalTestData("Contracts");
        } else if (data.get("SubmitOrDraft").equalsIgnoreCase("draft")) {
            String contractNum =  app.addResidentialContractPage.getContractNumber();
            TestDataManager.addDependantGlobalTestData("Contracts", "ContractNumber", contractNum);
            TestDataManager.writeDependantGlobalTestData("Contracts");
            app.addResidentialContractPage.clickOnSaveAndContinueLaterButton();
        }
    }

    @Test(dataProvider = "testDataProvider")
    public void ResidentialContractLessThanThreeMonths(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
app.loginPage.clickLogin();        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.clickOnStartDay();
        String endDate = CommonMethodsPage.getCurrentDate(0,2,0);
        app.addResidentialContractPage.selectEndDateOfResidualContract(endDate.substring(6, 8).replaceFirst("^0*", ""), app.addResidentialContractPage.getCurrentMonth(endDate.substring(4, 6)), endDate.substring(0, 4));
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.addResidentialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty(data.get("Property_Name"));
        app.addResidentialContractPage.clickContinueWithThisPropertyBTN();
        app.addResidentialContractPage.clickContinueToSelectUnitsBTN();
        app.addResidentialContractPage.clickFilterBtnOnSelectUnitPage();
        app.addResidentialContractPage.selectUnitsAvailability();
        app.addResidentialContractPage.selectFirstAvailableUnit();
        app.addResidentialContractPage.clickConfirmPropertyDetailsBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.newAddress())) {
            app.addResidentialContractPage.clickIdentifyAddressOnMapBTN();
            app.addResidentialContractPage.clickConfirmBtnOnMap();
            app.addResidentialContractPage.clickSaveBtnOnPropertyAddress();
        }
        logger.info("Step 05: Navigate to Add Individual Tenant > Input Individual's identification details > Continue");
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddIndividualTenantBTN();
        app.addResidentialContractPage.clickTenantRadioBTN();
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 06: Navigate to Financial > Input annual rent > Select Single Payment > select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.addNewIbanInContract())) {
            app.addResidentialContractPage.addNewIbanBTN();
            app.addResidentialContractPage.enterIbanNumber("SA8720000000000000034567");
            app.addResidentialContractPage.enterAccountOwnerName("Test 3 Bank");
            app.addResidentialContractPage.clickSaveBTNOnAddIban();
        }
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRadioBtnForAccountOwner();
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.clickConfirmFinancialTermsBTN(data.get("EnableSecurityDeposit"), data.get("SecurityAmount"));
        logger.info("Step 07:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectGoverningLaw(data.get("EnableSublease"));
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        logger.info("Step 08:  Submit the contract > Review all details > Submit");
        if(data.get("SubmitOrDraft").equalsIgnoreCase("submit")){
            app.addResidentialContractPage.clickSubmitForApprovalBTN();
            app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
            app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
            app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
            app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
            CommonMethodsPage.clickRatingButtons();
            CommonMethodsPage.clickOnSubmitButton();
            app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
            String contractNum =  app.addResidentialContractPage.getContractNumber();
            TestDataManager.addDependantGlobalTestData("Contracts", "ContractNumber", contractNum);
            TestDataManager.writeDependantGlobalTestData("Contracts");
        } else if (data.get("SubmitOrDraft").equalsIgnoreCase("draft")) {
            String contractNum =  app.addResidentialContractPage.getContractNumber();
            TestDataManager.addDependantGlobalTestData("Contracts", "ContractNumber", contractNum);
            TestDataManager.writeDependantGlobalTestData("Contracts");
            app.addResidentialContractPage.clickOnSaveAndContinueLaterButton();
        }
    }

    @Test(dataProvider = "testDataProvider")
    public void ApproveResidentialContractByLesserMoreThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
app.loginPage.clickLogin();        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to all contracts > Search for the contract");
        CommonMethodsPage.changeUserRole("مؤجر");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 03: Navigate to approve contract");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        if(Browser.isElementPresent(CommonMethodsPageObjects.confirmBTN())){
            CommonMethodsPage.clickOnConfirmButton();
        }
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 04: Give rating > Confirm approve contract");
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void ApproveResidentialContractByLesserLessThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
app.loginPage.clickLogin();        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to all contracts > Search for the contract");
        CommonMethodsPage.changeUserRole("مؤجر");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 03: Navigate to approve contract");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        if(Browser.isElementPresent(CommonMethodsPageObjects.confirmBTN())){
            CommonMethodsPage.clickOnConfirmButton();
        }
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 04: Give rating > Confirm approve contract");
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }
    @Test(dataProvider = "testDataProvider")
    public void ApproveResidentialContractByTenantMoreThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
app.loginPage.clickLogin();        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to all contracts > Search for the contract");
        CommonMethodsPage.changeUserRole("مستأجر");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 03: Navigate to approve contract");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        CommonMethodsPage.clickOnYesRadioButtons();
        logger.info("Step 04: Give rating > Confirm approve contract");
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void ApproveResidentialContractByTenantLessThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
app.loginPage.clickLogin();        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to all contracts > Search for the contract");
        CommonMethodsPage.changeUserRole("مستأجر");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 03: Navigate to approve contract");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على العقد");
        app.sendContractForApprovalPage.clickOnLetUsStartButton();
        CommonMethodsPage.selectCheckboxesOfSendApproveContract();
        CommonMethodsPage.clickOnConfirmButton();
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        CommonMethodsPage.clickOnYesRadioButtons();
        logger.info("Step 04: Give rating > Confirm approve contract");
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }
}