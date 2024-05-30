package sa.ejar.web.login.pre_condition;

import com.testcrew.manager.TestDataManager;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;
import java.util.Map;


public class AddCommercialContract extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void CommercialContractMoreThanThreeMonths(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 03: Navigate to Contracts > Add New Commercial Contract");
        app.createNewCommercialContractPage.clickOnContractsBtn();
        app.createNewCommercialContractPage.selectNewCommercialContract();
        logger.info("Step 05: Input date > Select contract's duration from calender and confirm");
        app.createNewCommercialContractPage.clickDateInputField();
        app.addResidentialContractPage.clickOnStartDay();
        String endDate = CommonMethodsPage.getCurrentDate(1,0,0);
        app.addResidentialContractPage.selectEndDateOfResidualContract(endDate.substring(6, 8).replaceFirst("^0*", ""), app.addResidentialContractPage.getCurrentMonth(endDate.substring(4, 6)), endDate.substring(0, 4));
        app.createNewCommercialContractPage.clickConfirmPeriodBTN();
        app.createNewCommercialContractPage.clickOnSameTermRadioButton();
        app.createNewCommercialContractPage.enterNoticePeriod("60");
        logger.info("Step 06: Navigate to Add Property > Select property > Select unit and confirm");
        app.createNewCommercialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty(data.get("Property_Name"));
        app.createNewCommercialContractPage.clickContinueWithThisPropertyBTN();
        app.createNewCommercialContractPage.clickContinueToSelectUnitsBTN();
        app.createNewCommercialContractPage.clickFilterBtnOnSelectUnitPage();
        app.createNewCommercialContractPage.selectUnitsAvailability();
        app.createNewCommercialContractPage.selectFirstAvailableUnit();
        app.createNewCommercialContractPage.confirmAdditionalDetailsBTN();
        app.createNewCommercialContractPage.clickConfirmPropertyDetailsBTN();
        logger.info("Step 07: Navigate Add Individual Tenant >Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddIndividualTenantBTN();
        app.addResidentialContractPage.clickTenantRadioBTN();
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 08: Navigate to Financial > Input annual rent > Select Single Payment >select IBAN > Select account owner > Continue");
        app.createNewCommercialContractPage.clickFinancialTermsStepBTN();
        app.createNewCommercialContractPage.clickAddRentalContractTermsBTN();
        app.createNewCommercialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.createNewCommercialContractPage.clickConfirmPaymentScheduleBTN();
        app.createNewCommercialContractPage.clickPayOnlineBTN();
        app.createNewCommercialContractPage.selectIbanFromDropdown();
        app.createNewCommercialContractPage.selectLessorRadioBtnForAccountOwner();
        app.addResidentialContractPage.clickConfirmFinancialTermsBTN(data.get("EnableSecurityDeposit"), data.get("SecurityAmount"));
        logger.info("Step 10:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.createNewCommercialContractPage.clickAddTermsAndConditionsBTN();
        app.addSubleaseContractPage.getContractOption2();
        app.addSubleaseContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addSubleaseContractPage.ChangeCommercialActivity();
        if(data.get("EnableSublease").equalsIgnoreCase("yes")){
            app.addSubleaseContractPage.RentSubleasesForOther();
        }
        app.addSubleaseContractPage.clickConfirmTermsAndConditions();
        logger.info("Step 11:  Submit the contract > Review all details > Submit");
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
    public void ApproveCommercialContractByLesserMoreThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void ApproveCommercialContractByTenantMoreThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }


    @Test(dataProvider = "testDataProvider")
    public void CommercialContractLessThanThreeMonths(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 03: Navigate to Contracts > Add New Commercial Contract");
        app.createNewCommercialContractPage.clickOnContractsBtn();
        app.createNewCommercialContractPage.selectNewCommercialContract();
        logger.info("Step 05: Input date > Select contract's duration from calender and confirm");
        app.createNewCommercialContractPage.clickDateInputField();
        app.addResidentialContractPage.clickOnStartDay();
        String endDate = CommonMethodsPage.getCurrentDate(1,0,0);
        app.addResidentialContractPage.selectEndDateOfResidualContract(endDate.substring(6, 8).replaceFirst("^0*", ""), app.addResidentialContractPage.getCurrentMonth(endDate.substring(4, 6)), endDate.substring(0, 4));
        app.createNewCommercialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 06: Navigate to Add Property > Select property > Select unit and confirm");
        app.createNewCommercialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty(data.get("Property_Name"));
        app.createNewCommercialContractPage.clickContinueWithThisPropertyBTN();
        app.createNewCommercialContractPage.clickContinueToSelectUnitsBTN();
        app.createNewCommercialContractPage.clickFilterBtnOnSelectUnitPage();
        app.createNewCommercialContractPage.selectUnitsAvailability();
        app.createNewCommercialContractPage.selectFirstAvailableUnit();
        app.createNewCommercialContractPage.confirmAdditionalDetailsBTN();
        app.createNewCommercialContractPage.clickConfirmPropertyDetailsBTN();
        logger.info("Step 07: Navigate Add Individual Tenant >Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddIndividualTenantBTN();
        app.addResidentialContractPage.clickTenantRadioBTN();
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 08: Navigate to Financial > Input annual rent > Select Single Payment >select IBAN > Select account owner > Continue");
        app.createNewCommercialContractPage.clickFinancialTermsStepBTN();
        app.createNewCommercialContractPage.clickAddRentalContractTermsBTN();
        app.createNewCommercialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.createNewCommercialContractPage.clickConfirmPaymentScheduleBTN();
        app.createNewCommercialContractPage.clickPayOnlineBTN();
        app.createNewCommercialContractPage.selectIbanFromDropdown();
        app.createNewCommercialContractPage.selectLessorRadioBtnForAccountOwner();
        app.addResidentialContractPage.clickConfirmFinancialTermsBTN(data.get("EnableSecurityDeposit"), data.get("SecurityAmount"));
        logger.info("Step 10:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.createNewCommercialContractPage.clickAddTermsAndConditionsBTN();
        app.addSubleaseContractPage.getContractOption2();
        app.addSubleaseContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addSubleaseContractPage.ChangeCommercialActivity();
        if(data.get("EnableSublease").equalsIgnoreCase("yes")){
            app.addSubleaseContractPage.RentSubleasesForOther();
        }
        app.addSubleaseContractPage.clickConfirmTermsAndConditions();
        logger.info("Step 11:  Submit the contract > Review all details > Submit");
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
    public void ApproveCommercialContractByLesserLessThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void ApproveCommercialContractByTenantLessThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        CommonMethodsPage.clickContractsBtn();
        CommonMethodsPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
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
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }
}

