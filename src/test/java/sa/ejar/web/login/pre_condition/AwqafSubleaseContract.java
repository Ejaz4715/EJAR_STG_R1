package sa.ejar.web.login.pre_condition;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class AwqafSubleaseContract extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void AwqafCommercialSubleaseContractMoreThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Navigate to Contracts > Filter Contracts , Enter Contract ,Click on create Sublease Contract");
        app.addSubleaseContractPage.clickOnTheContracts();
        app.addSubleaseContractPage.clickOnViewAllContracts();
        CommonMethodsPage.clickFilterBtn();
        app.addSubleaseContractPage.enterContractNumber(data.get("ContractNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        app.addSubleaseContractPage.clickOnCreateSubleaseContract();
        logger.info("Step 03: Input date > Select contract's duration from calender and confirm");
        app.createNewCommercialContractPage.clickDateInputField();
        app.addResidentialContractPage.clickOnStartDay();
        String endDate = CommonMethodsPage.getCurrentDate(0, 4, 0);
        app.addResidentialContractPage.selectEndDateOfResidualContract(endDate.substring(6, 8).replaceFirst("^0*", ""), app.addResidentialContractPage.getCurrentMonth(endDate.substring(4, 6)), endDate.substring(0, 4));
        app.createNewCommercialContractPage.clickConfirmPeriodBTN();
        app.createNewCommercialContractPage.clickOnSameTermRadioButton();
        app.createNewCommercialContractPage.enterNoticePeriod("60");
        logger.info("Step 04: Navigate Add Individual Tenant >Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddTenantBTN(data.get("TenantType"), data.get("CrNumber"));
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();
        if (data.get("TenantType").equalsIgnoreCase("organization")){
            app.addResidentialContractPage.addNewOwnerShipDocument();
        }
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 05: Navigate to Financial > Input annual rent > Select Payment >select IBAN > Select account owner > Continue");
        app.createNewCommercialContractPage.clickFinancialTermsStepBTN();
        app.createNewCommercialContractPage.clickAddRentalContractTermsBTN();
        app.createNewCommercialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.createNewCommercialContractPage.clickConfirmPaymentScheduleBTN();
        app.createNewCommercialContractPage.clickPayOnlineBTN();
        app.createNewCommercialContractPage.selectIbanFromDropdown();
        app.createNewCommercialContractPage.selectLessorRadioBtnForAccountOwner();
        logger.info("Step 06:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.clickConfirmFinancialTermsBTN(data.get("EnableSecurityDeposit"), data.get("SecurityAmount"));
        logger.info("Step 07: Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        Browser.waitForSeconds(3);
        app.createNewCommercialContractPage.clickAddTermsAndConditionsBTN();
        app.addSubleaseContractPage.getContractOption2();
        app.addSubleaseContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addSubleaseContractPage.ChangeCommercialActivity();
        app.addSubleaseContractPage.clickConfirmTermsAndConditions();
        logger.info("Step 08: Submit the contract > Review all details > Submit");
        if (data.get("SubmitOrDraft").equalsIgnoreCase("submit")) {
            app.addResidentialContractPage.clickSubmitForApprovalBTN();
            app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
//            app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
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
    public void ApproveAwqafCommercialSubleaseByLessorMoreThan3Months(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickOnConfirmButton();
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 04: Give rating > Confirm approve contract");
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void ApproveAwqafCommercialSubleaseByTenantMoreThan3Months(Map<String, String> data) throws Exception {
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
    public void AwqafCommercialSubleaseContractLessThan3Month(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Navigate to Contracts > Filter Contracts , Enter Contract ,Click on create Sublease Contract");
        app.addSubleaseContractPage.clickOnTheContracts();
        app.addSubleaseContractPage.clickOnViewAllContracts();
        CommonMethodsPage.clickFilterBtn();
        app.addSubleaseContractPage.enterContractNumber(data.get("ContractNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        app.addSubleaseContractPage.clickOnCreateSubleaseContract();
        logger.info("Step 03: Input date > Select contract's duration from calender and confirm");
        app.createNewCommercialContractPage.clickDateInputField();
        app.addResidentialContractPage.clickOnStartDay();
        String endDate = CommonMethodsPage.getCurrentDate(0, 1, 0);
        app.addResidentialContractPage.selectEndDateOfResidualContract(endDate.substring(6, 8).replaceFirst("^0*", ""), app.addResidentialContractPage.getCurrentMonth(endDate.substring(4, 6)), endDate.substring(0, 4));
        app.createNewCommercialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate Add Individual Tenant >Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddTenantBTN(data.get("TenantType"), data.get("CrNumber"));
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();
        if (data.get("TenantType").equalsIgnoreCase("organization")){
            app.addResidentialContractPage.addNewOwnerShipDocument();
        }
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 05: Navigate to Financial > Input annual rent > Select Payment >select IBAN > Select account owner > Continue");
        app.createNewCommercialContractPage.clickFinancialTermsStepBTN();
        app.createNewCommercialContractPage.clickAddRentalContractTermsBTN();
        app.createNewCommercialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.createNewCommercialContractPage.clickConfirmPaymentScheduleBTN();
        app.createNewCommercialContractPage.clickPayOnlineBTN();
        app.createNewCommercialContractPage.selectIbanFromDropdown();
        app.createNewCommercialContractPage.selectLessorRadioBtnForAccountOwner();
        logger.info("Step 06:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 07: Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.createNewCommercialContractPage.clickAddTermsAndConditionsBTN();
        app.addSubleaseContractPage.getContractOption2();
        app.addSubleaseContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addSubleaseContractPage.ChangeCommercialActivity();
        app.addSubleaseContractPage.clickConfirmTermsAndConditions();
        logger.info("Step 08: Submit the contract > Review all details > Submit");
        if (data.get("SubmitOrDraft").equalsIgnoreCase("submit")) {
            app.addResidentialContractPage.clickSubmitForApprovalBTN();
            app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
//            app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
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
    public void AwqafApproveCommercialSubleaseByLessorLessThan3Months(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickOnConfirmButton();
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 04: Give rating > Confirm approve contract");
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void AwqafApproveCommercialSubleaseByTenantLessThan3Months(Map<String, String> data) throws Exception {
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
    public void AwqafResidentialSubleaseContractMoreThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter ID/Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Navigate to Contracts > Add New Sublease Contract");
        app.addSubleaseContractPage.clickOnTheContracts();
        app.addSubleaseContractPage.clickOnViewAllContracts();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        app.addSubleaseContractPage.clickOnCreateSubleaseContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.clickOnStartDay();
        String endDate = CommonMethodsPage.getCurrentDate(0, 6, 0);
        app.addResidentialContractPage.selectEndDateOfResidualContract(endDate.substring(6, 8).replaceFirst("^0*", ""), app.addResidentialContractPage.getCurrentMonth(endDate.substring(4, 6)), endDate.substring(0, 4));
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Individual Tenant > Input Individual's identification details > Continue");
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddIndividualTenantBTN();
        app.addResidentialContractPage.clickTenantRadioBTN();
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 05: Navigate to Financial > Input annual rent > Select Flexible Payment > select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRadioBtnForAccountOwner();
        logger.info("Step 06:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.clickConfirmFinancialTermsBTN(data.get("EnableSecurityDeposit"), data.get("SecurityAmount"));
        logger.info("Step 07:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addSubleaseContractPage.clickTermsAndConditionsStepBTN();
        app.addSubleaseContractPage.clickAddTermsAndConditionsBTN();
        app.addSubleaseContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addSubleaseContractPage.selectGoverningLaw();
        app.addSubleaseContractPage.clickConfirmTermsAndConditionsBTN();
        logger.info("Step 08:  Submit the contract > Review all details > Submit");
        if (data.get("SubmitOrDraft").equalsIgnoreCase("submit")) {
            app.addResidentialContractPage.clickSubmitForApprovalBTN();
            app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
            app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
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
    public void ApproveAwqafResidentialSubleaseByLessorMoreThan3Months(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.clickOnConfirmButton();
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 04: Give rating > Confirm approve contract");
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void ApproveAwqafResidentialSubleaseByTenantMoreThan3Months(Map<String, String> data) throws Exception {
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
    public void AwqafResidentialSubleaseContractLessThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter ID/Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        //app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin(data.get("Username"));
        //app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Navigate to Contracts > Add New Sublease Contract");
        app.addSubleaseContractPage.clickOnTheContracts();
        app.addSubleaseContractPage.clickOnViewAllContracts();
        CommonMethodsPage.clickFilterBtn();
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        app.addSubleaseContractPage.clickOnCreateSubleaseContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.clickOnStartDay();
        String endDate = CommonMethodsPage.getCurrentDate(0, 2, 0);
        app.addResidentialContractPage.selectEndDateOfResidualContract(endDate.substring(6, 8).replaceFirst("^0*", ""), app.addResidentialContractPage.getCurrentMonth(endDate.substring(4, 6)), endDate.substring(0, 4));
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 05: Navigate to Add Individual Tenant > Input Individual's identification details > Continue");
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddIndividualTenantBTN();
        app.addResidentialContractPage.clickTenantRadioBTN();
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 07: Navigate to Financial > Input annual rent > Select Flexible Payment > select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRadioBtnForAccountOwner();
        logger.info("Step 08:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 09:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addSubleaseContractPage.clickTermsAndConditionsStepBTN();
        app.addSubleaseContractPage.clickAddTermsAndConditionsBTN();
        app.addSubleaseContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addSubleaseContractPage.selectGoverningLaw();
        app.addSubleaseContractPage.clickConfirmTermsAndConditionsBTN();
        logger.info("Step 10:  Submit the contract > Review all details > Submit");
        if (data.get("SubmitOrDraft").equalsIgnoreCase("submit")) {
            app.addResidentialContractPage.clickSubmitForApprovalBTN();
            app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
            app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
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
    public void ApproveAwqafResidentialSubleaseByLesserLessThan3Months(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
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
        CommonMethodsPage.clickOnConfirmButton();
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 04: Give rating > Confirm approve contract");
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void ApproveAwqafResidentialSubleaseByTenantLessThan3Months(Map<String, String> data) throws Exception {
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