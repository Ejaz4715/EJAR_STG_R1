package sa.ejar.web.login.pre_condition;

import com.testcrew.manager.TestDataManager;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;


public class AwqafCommercialContract extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void AwqafCommercialContractMoreThan3Month(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.createNewCommercialContractPage.selectNewCommercialContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.clickOnStartDay();
        String endDate = CommonMethodsPage.getCurrentDate(1, 0, 0);
        app.addResidentialContractPage.selectEndDateOfResidualContract(endDate.substring(6, 8).replaceFirst("^0*", ""), app.addResidentialContractPage.getCurrentMonth(endDate.substring(4, 6)), endDate.substring(0, 4));
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.createNewCommercialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty(data.get("Property_Name"));
        app.createNewCommercialContractPage.clickContinueWithThisPropertyBTN();
        app.createNewCommercialContractPage.clickContinueToSelectUnitsBTN();
        app.createNewCommercialContractPage.clickFilterBtnOnSelectUnitPage();
        app.createNewCommercialContractPage.selectUnitsAvailability();
        app.addResidentialContractPage.selectFirstAvailableUnit();
        app.createNewCommercialContractPage.confirmAdditionalDetailsBTN();
        app.createNewCommercialContractPage.clickConfirmPropertyDetailsBTN();
        app.createNewCommercialContractPage.clickOnSameTermRadioButton();
        app.createNewCommercialContractPage.enterNoticePeriod("60");
        logger.info("Step 05: Navigate Add Individual Tenant >Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddTenantBTN(data.get("TenantType"), data.get("CrNumber"));
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();
        if (data.get("TenantType").equalsIgnoreCase("organization")){
            app.addResidentialContractPage.addNewOwnerShipDocument();
        }
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 06: Navigate to Financial > Input annual rent > Select Single Payment > select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRadioBtnForAccountOwner();
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.clickConfirmFinancialTermsBTN(data.get("EnableSecurityDeposit"), data.get("SecurityAmount"));
        logger.info("Step 07:Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.createNewCommercialContractPage.clickAddTermsAndConditionsBTN();
        app.addSubleaseContractPage.getContractOption2();
        app.addSubleaseContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addSubleaseContractPage.ChangeCommercialActivity();
        if(data.get("EnableSublease").equalsIgnoreCase("yes")){
            app.addSubleaseContractPage.RentSubleasesForOther();
        }
        app.addSubleaseContractPage.clickConfirmTermsAndConditions();
        logger.info("Step 08: Submit the contract > Review all details > Submit");
        if (data.get("SubmitOrDraft").equalsIgnoreCase("submit")) {
            app.addResidentialContractPage.clickSubmitForApprovalBTN();
            app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
            app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
            app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
            CommonMethodsPage.clickRatingButtons();
            CommonMethodsPage.clickOnSubmitButton();
            app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
            String contractNum = app.addResidentialContractPage.getContractNumber();
            TestDataManager.addDependantGlobalTestData("Contracts", "ContractNumber", contractNum);
            TestDataManager.writeDependantGlobalTestData("Contracts");
        } else if (data.get("SubmitOrDraft").equalsIgnoreCase("draft")) {
            String contractNum = app.addResidentialContractPage.getContractNumber();
            TestDataManager.addDependantGlobalTestData("Contracts", "ContractNumber", contractNum);
            TestDataManager.writeDependantGlobalTestData("Contracts");
            app.addResidentialContractPage.clickOnSaveAndContinueLaterButton();
        }
    }

    @Test(dataProvider = "testDataProvider")
    public void ApproveAwqafCommercialByLessorMoreThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
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
//        CommonMethodsPage.clickOnConfirmButton();
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 04: Give rating > Confirm approve contract");
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void ApproveAwqafCommercialByTenantMoreThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
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
    public void AwqafCommercialContractLessThan3Month(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.createNewCommercialContractPage.selectNewCommercialContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.clickOnStartDay();
        String endDate = CommonMethodsPage.getCurrentDate(0, 2, 0);
        app.addResidentialContractPage.selectEndDateOfResidualContract(endDate.substring(6, 8).replaceFirst("^0*", ""), app.addResidentialContractPage.getCurrentMonth(endDate.substring(4, 6)), endDate.substring(0, 4));
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.createNewCommercialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty(data.get("Property_Name"));
        app.createNewCommercialContractPage.clickContinueWithThisPropertyBTN();
        app.createNewCommercialContractPage.clickContinueToSelectUnitsBTN();
        app.createNewCommercialContractPage.clickFilterBtnOnSelectUnitPage();
        app.createNewCommercialContractPage.selectUnitsAvailability();
        app.addResidentialContractPage.selectFirstAvailableUnit();
        app.createNewCommercialContractPage.confirmAdditionalDetailsBTN();
        app.createNewCommercialContractPage.clickConfirmPropertyDetailsBTN();
        logger.info("Step 05: Navigate Add Individual Tenant >Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddTenantBTN(data.get("TenantType"), data.get("CrNumber"));
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();
        if (data.get("TenantType").equalsIgnoreCase("organization")){
            app.addResidentialContractPage.addNewOwnerShipDocument();
        }
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 06: Navigate to Financial > Input annual rent > Select Single Payment > select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRadioBtnForAccountOwner();
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 07:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.createNewCommercialContractPage.clickAddTermsAndConditionsBTN();
        app.addSubleaseContractPage.getContractOption2();
        app.addSubleaseContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addSubleaseContractPage.ChangeCommercialActivity();
        if(data.get("EnableSublease").equalsIgnoreCase("yes")){
            app.addSubleaseContractPage.RentSubleasesForOther();
        }
        app.addSubleaseContractPage.clickConfirmTermsAndConditions();
        logger.info("Step 08:  Submit the contract > Review all details > Submit");
        if (data.get("SubmitOrDraft").equalsIgnoreCase("submit")) {
            app.addResidentialContractPage.clickSubmitForApprovalBTN();
            app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
            app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
            app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
            CommonMethodsPage.clickRatingButtons();
            CommonMethodsPage.clickOnSubmitButton();
            app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
            String contractNum = app.addResidentialContractPage.getContractNumber();
            TestDataManager.addDependantGlobalTestData("Contracts", "ContractNumber", contractNum);
            TestDataManager.writeDependantGlobalTestData("Contracts");
        } else if (data.get("SubmitOrDraft").equalsIgnoreCase("draft")) {
            String contractNum = app.addResidentialContractPage.getContractNumber();
            TestDataManager.addDependantGlobalTestData("Contracts", "ContractNumber", contractNum);
            TestDataManager.writeDependantGlobalTestData("Contracts");
            app.addResidentialContractPage.clickOnSaveAndContinueLaterButton();
        }
    }

    @Test(dataProvider = "testDataProvider")
    public void ApproveAwqafCommercialByLessorLessThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
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
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        CommonMethodsPage.clickOnConfirmButton();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 04: Give rating > Confirm approve contract");
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void ApproveAwqafCommercialByTenantLessThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
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