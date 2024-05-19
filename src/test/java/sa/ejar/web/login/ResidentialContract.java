package sa.ejar.web.login;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;
import java.util.Map;

public class ResidentialContract extends NHCWebTest{

    @Test(dataProvider = "testDataProvider")
    public void addNewResidentialContractWithDurationMoreThanThreeMonths(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.rechargeWalletPage.chooseOfficer("BO_Manager");
        //app.rechargeWalletPage.addIban();
        //app.rechargeWalletPage.rechargeWallet();
        //--------------------------------------------------------------------------------------------
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        String month = data.get("Month");
        String year = data.get("Year");
        String currentDate = java.time.LocalDate.now().toString();
        String [] arrDate = currentDate.split("-");
        app.addResidentialContractPage.selectStartDateOfResidualContract(arrDate[2].substring(1),app.addResidentialContractPage.getCurrentMonth(arrDate[1]), arrDate[0]);
        app.addResidentialContractPage.selectEndDateOfResidualContract(arrDate[2].substring(1),app.addResidentialContractPage.getCurrentMonth(arrDate[1]), String.valueOf(Integer.valueOf(arrDate[0])+1));
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
            logger.info("Select and confirm address from the map");
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
        logger.info("Step 06: Input Individual/Tenant Information details > Confirm");
        //app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("509876567");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.selectTenantRegion(1);
        //app.addResidentialContractPage.clickTenantCityDropdown();
        //app.addResidentialContractPage.selectTenantCity("الرياض");
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        //app.addResidentialContractPage.addLessorFacilities();
        //app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("564678656");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        //app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 07: Navigate to Financial > Input annual rent > Select Single Payment > Add and select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.increaseRentPrice();
        app.addResidentialContractPage.clickAddAdditionalContractTerms();
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.addNewIbanInContract())) {            app.addResidentialContractPage.addNewIbanBTN();
            app.addResidentialContractPage.enterIbanNumber("SA8720000000000000034567");
            app.addResidentialContractPage.enterAccountOwnerName("Test 3 Bank");
            app.addResidentialContractPage.clickSaveBTNOnAddIban();
        }
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRadioBtnForAccountOwner();
        logger.info("Step 08:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.addAdditionalFee();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 09:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectOtherTerms();
        app.addResidentialContractPage.selectGoverningLaw();
        app.addResidentialContractPage.addAdditionalTerms();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        logger.info("Step 10:  Navigate to Submit the contract > Review all details > Submit for Approval");
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
        app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.clickConfirmBtnOnCloseSurveyPopUp();
        logger.info("Step 11:  Get contract number > Search for the contract and verify the status has been changed");
        app.addResidentialContractPage.setContractNumberToContext(context);
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(context.getAttribute("Contract number").toString());
        String contractNum = app.addResidentialContractPage.getContractNumber();
        TestDataManager.addDependantGlobalTestData("ResidentialContract", "ContractNumber(<3 Months)", contractNum);
        app.addResidentialContractPage.verifyContractStatusIsWaitingForApproval();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_approveResidentialContractMoreThanThreeMonthsWithSinglePaymentByLesser(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_approveResidentialContractMoreThanThreeMonthsWithSinglePaymentByTenant(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_verifyResidentialContractStatusIsActiveByBoManager(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Bo Officer/Manager Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        app.addResidentialContractPage.verifyContractStatusIsActivated();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_addNewResidentialContractWithDurationMoreThanThreeMonthsAndMonthlyFrequencyPayment(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.rechargeWalletPage.chooseOfficer("BO_Manager");
        //app.rechargeWalletPage.addIban();
        //app.rechargeWalletPage.rechargeWallet();
        //--------------------------------------------------------------------------------------------
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.selectStartDateOfResidualContract("20", "May مايو", "2024");
        app.addResidentialContractPage.selectEndDateOfResidualContract("20", "May مايو", "2025");
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.addResidentialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty("Auto1010");
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
        logger.info("Step 06: Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("509876567");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.selectTenantRegion(1);
        //app.addResidentialContractPage.clickTenantCityDropdown();
        //app.addResidentialContractPage.selectTenantCity("الرياض");
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        app.addResidentialContractPage.addLessorFacilities();
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("564678656");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 07: Navigate to Financial > Input annual rent > Select Monthly payment > Add and select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.increaseRentPrice();
        app.addResidentialContractPage.clickAddAdditionalContractTerms();
        app.addResidentialContractPage.clickMonthlyPaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.addNewIbanInContract())) {            app.addResidentialContractPage.addNewIbanBTN();
            app.addResidentialContractPage.enterIbanNumber("SA8720000000000000034567");
            app.addResidentialContractPage.enterAccountOwnerName("Test 3 Bank");
            app.addResidentialContractPage.clickSaveBTNOnAddIban();
        }
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRepresentativeRadioBtnForAccountOwner();
        logger.info("Step 08:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.addAdditionalFee();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 09:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectOtherTerms();
        app.addResidentialContractPage.selectGoverningLaw();
        app.addResidentialContractPage.addAdditionalTerms();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 10:  Submit the contract > Review all details > Submit");
        app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
        app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.clickConfirmBtnOnCloseSurveyPopUp();
        logger.info("Step 11:  Get contract number > Search for the contract and verify the status has been changed");
        app.addResidentialContractPage.setContractNumberToContext(context);
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.verifyContractStatusIsWaitingForApproval();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_approveResidentialContractMoreThanThreeMonthsWithMonthlyFrequencyPaymentByLesser(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_approveResidentialContractMoreThanThreeMonthsWithMonthlyFrequencyPaymentByTenant(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_20_verifyResidentialContractStatusIsRegisteredAsBoManager(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        app.addResidentialContractPage.verifyContractStatusIsRegistered();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_addNewResidentialContractWithDurationMoreThanThreeMonthsAndQuarterlyFrequencyPayment(Map<String, String> data, ITestContext context) throws Exception {
        //One Year Monthly frequency Payment
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.rechargeWalletPage.chooseOfficer("BO_Manager");
        //app.rechargeWalletPage.addIban();
        //app.rechargeWalletPage.rechargeWallet();
        //--------------------------------------------------------------------------------------------
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.selectStartDateOfResidualContract("5", "February فبراير", "2024");
        app.addResidentialContractPage.selectEndDateOfResidualContract("20", "May مايو", "2025");
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.addResidentialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty("Auto1010");
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
        logger.info("Step 06: Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("509876567");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.selectTenantRegion(1);
        //app.addResidentialContractPage.clickTenantCityDropdown();
        //app.addResidentialContractPage.selectTenantCity("الرياض");
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        app.addResidentialContractPage.addLessorFacilities();
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("564678656");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 07: Navigate to Financial > Input annual rent > Select Quarterly payment > Add and select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.increaseRentPrice();
        app.addResidentialContractPage.clickAddAdditionalContractTerms();
        app.addResidentialContractPage.clickQuarterlyPaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.addNewIbanInContract())) {            app.addResidentialContractPage.addNewIbanBTN();
            app.addResidentialContractPage.enterIbanNumber("SA8720000000000000034567");
            app.addResidentialContractPage.enterAccountOwnerName("Test 3 Bank");
            app.addResidentialContractPage.clickSaveBTNOnAddIban();
        }
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectOtherRadioBtnForAccountOwner();
        logger.info("Step 08:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.addAdditionalFee();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 09:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectOtherTerms();
        app.addResidentialContractPage.selectGoverningLaw();
        app.addResidentialContractPage.addAdditionalTerms();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 10:  Submit the contract > Review all details > Submit");
        app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
        app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.clickConfirmBtnOnCloseSurveyPopUp();
        logger.info("Step 11:  Get contract number > Search for the contract and verify the status has been changed");
        app.addResidentialContractPage.setContractNumberToContext(context);
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.verifyContractStatusIsWaitingForApproval();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_approveResidentialContractMoreThanThreeMonthsWithQuarterlyFrequencyPaymentByLesser(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_approveResidentialContractMoreThanThreeMonthsWithQuarterlyFrequencyPaymentByTenant(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_addNewResidentialContractWithDurationMoreThanThreeMonthsAndSixMonthPayment(Map<String, String> data, ITestContext context) throws Exception {
        //One Year Monthly frequency Payment
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.rechargeWalletPage.chooseOfficer("BO_Manager");
        //app.rechargeWalletPage.addIban();
        //app.rechargeWalletPage.rechargeWallet();
        //--------------------------------------------------------------------------------------------
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.selectStartDateOfResidualContract("20", "May مايو", "2024");
        app.addResidentialContractPage.selectEndDateOfResidualContract("20", "May مايو", "2025");
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.addResidentialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty("Auto1010");
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
        logger.info("Step 06: Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("509876567");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.selectTenantRegion(1);
        //app.addResidentialContractPage.clickTenantCityDropdown();
        //app.addResidentialContractPage.selectTenantCity("الرياض");
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        app.addResidentialContractPage.addLessorFacilities();
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("564678656");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 07: Navigate to Financial > Input annual rent > Select Six Month payment > Add and select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.increaseRentPrice();
        app.addResidentialContractPage.clickAddAdditionalContractTerms();
        app.addResidentialContractPage.clickSixMonthPaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.addNewIbanInContract())) {            app.addResidentialContractPage.addNewIbanBTN();
            app.addResidentialContractPage.enterIbanNumber("SA8720000000000000034567");
            app.addResidentialContractPage.enterAccountOwnerName("Test 3 Bank");
            app.addResidentialContractPage.clickSaveBTNOnAddIban();
        }
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRadioBtnForAccountOwner();
        logger.info("Step 08:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.addAdditionalFee();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 09:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectOtherTerms();
        app.addResidentialContractPage.selectGoverningLaw();
        app.addResidentialContractPage.addAdditionalTerms();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 10:  Submit the contract > Review all details > Submit");
        app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
        app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.clickConfirmBtnOnCloseSurveyPopUp();
        logger.info("Step 11:  Get contract number > Search for the contract and verify the status has been changed");
        app.addResidentialContractPage.setContractNumberToContext(context);
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.verifyContractStatusIsWaitingForApproval();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_approveResidentialContractMoreThanThreeMonthsAndSixMonthPaymentByLessor(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_approveResidentialContractMoreThanThreeMonthsAndSixMonthPaymentByTenant(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_27_addNewResidentialContractWithDurationMoreThanThreeMonthsAndYearlyPayment(Map<String, String> data, ITestContext context) throws Exception {
        //One Year Monthly frequency Payment
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.rechargeWalletPage.chooseOfficer("BO_Manager");
        //app.rechargeWalletPage.addIban();
        //app.rechargeWalletPage.rechargeWallet();
        //--------------------------------------------------------------------------------------------
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.selectStartDateOfResidualContract("5", "February فبراير", "2024");
        app.addResidentialContractPage.selectEndDateOfResidualContract("20", "May مايو", "2025");
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.addResidentialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty("Auto1010");
        app.addResidentialContractPage.clickContinueWithThisPropertyBTN();
        app.addResidentialContractPage.clickContinueToSelectUnitsBTN();
        app.addResidentialContractPage.clickFilterBtnOnSelectUnitPage();
        app.addResidentialContractPage.selectUnitsAvailability();
        app.addResidentialContractPage.selectFirstAvailableUnit();
        app.addResidentialContractPage.clickConfirmPropertyDetailsBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.newAddress())) {            logger.info("Select and confirm address from the map");
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
        logger.info("Step 06: Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("509876567");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.selectTenantRegion(1);
        //app.addResidentialContractPage.clickTenantCityDropdown();
        //app.addResidentialContractPage.selectTenantCity("الرياض");
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        app.addResidentialContractPage.addLessorFacilities();
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("564678656");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 07: Navigate to Financial > Input annual rent > Select Yearly payment > Add and select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.increaseRentPrice();
        app.addResidentialContractPage.clickAddAdditionalContractTerms();
        app.addResidentialContractPage.clickYearlyPaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.addNewIbanInContract())) {            app.addResidentialContractPage.addNewIbanBTN();
            app.addResidentialContractPage.enterIbanNumber("SA8720000000000000034567");
            app.addResidentialContractPage.enterAccountOwnerName("Test 3 Bank");
            app.addResidentialContractPage.clickSaveBTNOnAddIban();
        }
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRepresentativeRadioBtnForAccountOwner();
        logger.info("Step 08:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.addAdditionalFee();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 09:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectOtherTerms();
        app.addResidentialContractPage.selectGoverningLaw();
        app.addResidentialContractPage.addAdditionalTerms();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 10:  Submit the contract > Review all details > Submit");
        app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
        app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.clickConfirmBtnOnCloseSurveyPopUp();
        logger.info("Step 11:  Get contract number > Search for the contract and verify the status has been changed");
        app.addResidentialContractPage.setContractNumberToContext(context);
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.verifyContractStatusIsWaitingForApproval();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_approveResidentialContractMoreThanThreeMonthsAndYearlyPaymentByLesser(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_approveResidentialContractMoreThanThreeMonthsAndYearlyPaymentByTenant(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_addNewResidentialContractWithDurationMoreThanThreeMonthsAndFlexiblePayment(Map<String, String> data, ITestContext context) throws Exception {
        //One Year Monthly frequency Payment
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.rechargeWalletPage.chooseOfficer("BO_Manager");
        //app.rechargeWalletPage.addIban();
        //app.rechargeWalletPage.rechargeWallet();
        //--------------------------------------------------------------------------------------------
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.selectStartDateOfResidualContract("20", "May مايو", "2024");
        app.addResidentialContractPage.selectEndDateOfResidualContract("20", "May مايو", "2025");
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.addResidentialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty("Auto1010");
        app.addResidentialContractPage.clickContinueWithThisPropertyBTN();
        app.addResidentialContractPage.clickContinueToSelectUnitsBTN();
        app.addResidentialContractPage.clickFilterBtnOnSelectUnitPage();
        app.addResidentialContractPage.selectUnitsAvailability();
        app.addResidentialContractPage.selectFirstAvailableUnit();
        app.addResidentialContractPage.clickConfirmPropertyDetailsBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.newAddress())) {            logger.info("Select and confirm address from the map");
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
        logger.info("Step 06: Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("509876567");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.selectTenantRegion(1);
        //app.addResidentialContractPage.clickTenantCityDropdown();
        //app.addResidentialContractPage.selectTenantCity("الرياض");
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        app.addResidentialContractPage.addLessorFacilities();
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("564678656");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 07: Navigate to Financial > Input annual rent > Select Flexible payment > Add and select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.increaseRentPrice();
        app.addResidentialContractPage.clickAddAdditionalContractTerms();
        app.addResidentialContractPage.clickFlexiblePaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.addNewIbanInContract())) {            app.addResidentialContractPage.addNewIbanBTN();
            app.addResidentialContractPage.enterIbanNumber("SA8720000000000000034567");
            app.addResidentialContractPage.enterAccountOwnerName("Test 3 Bank");
            app.addResidentialContractPage.clickSaveBTNOnAddIban();
        }
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectOtherRadioBtnForAccountOwner();
        logger.info("Step 08:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.addAdditionalFee();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 09:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectOtherTerms();
        app.addResidentialContractPage.selectGoverningLaw();
        app.addResidentialContractPage.addAdditionalTerms();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 10:  Submit the contract > Review all details > Submit");
        app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
        app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.clickConfirmBtnOnCloseSurveyPopUp();
        logger.info("Step 11:  Get contract number > Search for the contract and verify the status has been changed");
        app.addResidentialContractPage.setContractNumberToContext(context);
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.verifyContractStatusIsWaitingForApproval();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_31_approveResidentialContractMoreThanThreeMonthsAndFlexiblePaymentByLesser(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_approveResidentialContractMoreThanThreeMonthsWithFlexiblePaymentByTenant(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    //--------------------------ResidentialContractLessThanThreeMonths--------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_33_addNewResidentialContractWithDurationLessThanThreeMonthsAndSinglePayment(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.rechargeWalletPage.chooseOfficer("BO_Manager");
        //app.rechargeWalletPage.addIban();
        //app.rechargeWalletPage.rechargeWallet();
        //--------------------------------------------------------------------------------------------
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (Less than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        String currentDate = java.time.LocalDate.now().toString();
        String [] arrDate = currentDate.split("-");
        app.addResidentialContractPage.selectStartDateOfResidualContract(arrDate[2],app.addResidentialContractPage.getCurrentMonth(arrDate[1]), String.valueOf(Integer.valueOf(arrDate[0])+1));
        app.addResidentialContractPage.selectEndDateOfResidualContract(arrDate[2],app.addResidentialContractPage.getCurrentMonth(String.valueOf(Integer.valueOf(arrDate[1])+02)), String.valueOf(Integer.valueOf(arrDate[0])+1));
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
            logger.info("Select and confirm address from the map");
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
        logger.info("Step 06: Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("509876567");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.selectTenantRegion(1);
        //app.addResidentialContractPage.clickTenantCityDropdown();
        //app.addResidentialContractPage.selectTenantCity("الرياض");
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        //app.addResidentialContractPage.addLessorFacilities();
        //app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("564678656");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        //app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 07: Navigate to Financial > Input annual rent > Select Single Payment > Add and select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("2000");
        //app.addResidentialContractPage.increaseRentPrice();
        //app.addResidentialContractPage.clickAddAdditionalContractTerms();
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.addNewIbanInContract())) {            app.addResidentialContractPage.addNewIbanBTN();
            app.addResidentialContractPage.enterIbanNumber("SA8720000000000000034567");
            app.addResidentialContractPage.enterAccountOwnerName("Test 3 Bank");
            app.addResidentialContractPage.clickSaveBTNOnAddIban();
        }
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRadioBtnForAccountOwner();
        logger.info("Step 08:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        //app.addResidentialContractPage.addAdditionalFee();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 09:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectOtherTerms();
        app.addResidentialContractPage.selectGoverningLaw();
        app.addResidentialContractPage.addAdditionalTerms();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        logger.info("Step 10:  Navigate to Submit the contract > Review all details > Submit for Approval");
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
        app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.clickConfirmBtnOnCloseSurveyPopUp();
        logger.info("Step 11:  Get contract number > Search for the contract and verify the status has been changed");
        app.addResidentialContractPage.setContractNumberToContext(context);
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.verifyContractStatusIsWaitingForApproval();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_34_approveResidentialContractLessThanThreeMonthsWithSinglePaymentByLesser(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Lessor Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(<3 Months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_35_approveResidentialContractLessThanThreeMonthsWithSinglePaymentByTenant(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Tenant Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(<3 Months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_verifyResidentialContractLessThanThreeMonthStatusIsActiveByBoManager(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: As Bo Officer/Manager Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(<3 Months)"));
        app.addResidentialContractPage.verifyContractStatusIsRegistered();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_37_addNewResidentialContractWithDurationLessThanThreeMonthsAndMonthlyFrequencyPayment(Map<String, String> data,  ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        //---------------If New User Uncomment Below Method-----------------------------------
//        app.rechargeWalletPage.chooseOfficer("BO_Manager");
        //app.rechargeWalletPage.addIban();
        //app.rechargeWalletPage.rechargeWallet();
        //--------------------------------------------------------------------------------------------
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (Less than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.selectStartDateOfResidualContract("20", "May مايو", "2024");
        app.addResidentialContractPage.selectEndDateOfResidualContract("1", "August أغسطس", "2024");
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.addResidentialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty("Auto1010");
        app.addResidentialContractPage.clickContinueWithThisPropertyBTN();
        app.addResidentialContractPage.clickContinueToSelectUnitsBTN();
        app.addResidentialContractPage.clickFilterBtnOnSelectUnitPage();
        app.addResidentialContractPage.selectUnitsAvailability();
        app.addResidentialContractPage.selectFirstAvailableUnit();
        app.addResidentialContractPage.clickConfirmPropertyDetailsBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.newAddress())) {
            logger.info("Select and confirm address from the map");
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
        logger.info("Step 06: Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("509876567");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.selectTenantRegion(1);
        //app.addResidentialContractPage.clickTenantCityDropdown();
        //app.addResidentialContractPage.selectTenantCity("الرياض");
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        app.addResidentialContractPage.addLessorFacilities();
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("564678656");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 07: Navigate to Financial > Input annual rent > Select Monthly Payment > Add and select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.increaseRentPrice();
        app.addResidentialContractPage.clickAddAdditionalContractTerms();
        app.addResidentialContractPage.clickMonthlyPaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.addNewIbanInContract())) {            app.addResidentialContractPage.addNewIbanBTN();
            app.addResidentialContractPage.enterIbanNumber("SA8720000000000000034567");
            app.addResidentialContractPage.enterAccountOwnerName("Test 3 Bank");
            app.addResidentialContractPage.clickSaveBTNOnAddIban();
        }
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRepresentativeRadioBtnForAccountOwner();
        logger.info("Step 08:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.addAdditionalFee();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 09:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectOtherTerms();
        app.addResidentialContractPage.selectGoverningLaw();
        app.addResidentialContractPage.addAdditionalTerms();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 10:  Submit the contract > Review all details > Submit");
        app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
        app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.clickConfirmBtnOnCloseSurveyPopUp();
        logger.info("Step 11:  Get contract number > Search for the contract and verify the status has been changed");
        app.addResidentialContractPage.setContractNumberToContext(context);
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.verifyContractStatusIsWaitingForApproval();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_38_approveResidentialContractLessThanThreeMonthsAndMonthlyFrequencyPaymentByLesser(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(<3 Months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_39_approveResidentialContractLessThanThreeMonthsAndMonthlyFrequencyPaymentByTenant(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(<3 Months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_40_verifyResidentialContractLessThanThreeMonthStatusIsRegisteredAsBoManager(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(<3 Months)"));
        app.addResidentialContractPage.verifyContractStatusIsRegistered();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_41_addNewResidentialContractWithDurationLessThanThreeMonthsAndQuarterlyFrequencyPayment(Map<String, String> data,  ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.rechargeWalletPage.chooseOfficer("BO_Manager");
        //app.rechargeWalletPage.addIban();
        //app.rechargeWalletPage.rechargeWallet();
        //--------------------------------------------------------------------------------------------
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (Less than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.selectStartDateOfResidualContract("5", "February فبراير", "2024");
        app.addResidentialContractPage.selectEndDateOfResidualContract("1", "May مايو", "2024");
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.addResidentialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty("Auto1010");
        app.addResidentialContractPage.clickContinueWithThisPropertyBTN();
        app.addResidentialContractPage.clickContinueToSelectUnitsBTN();
        app.addResidentialContractPage.clickFilterBtnOnSelectUnitPage();
        app.addResidentialContractPage.selectUnitsAvailability();
        app.addResidentialContractPage.selectFirstAvailableUnit();
        app.addResidentialContractPage.clickConfirmPropertyDetailsBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.newAddress())) {
            logger.info("Select and confirm address from the map");
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
        logger.info("Step 06: Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("509876567");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.selectTenantRegion(1);
        //app.addResidentialContractPage.clickTenantCityDropdown();
        //app.addResidentialContractPage.selectTenantCity("الرياض");
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        app.addResidentialContractPage.addLessorFacilities();
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("564678656");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 07: Navigate to Financial > Input annual rent > Select Quarterly Payment > Add and select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.increaseRentPrice();
        app.addResidentialContractPage.clickAddAdditionalContractTerms();
        app.addResidentialContractPage.clickQuarterlyPaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.addNewIbanInContract())) {
            app.addResidentialContractPage.addNewIbanBTN();
            app.addResidentialContractPage.enterIbanNumber("SA8720000000000000034567");
            app.addResidentialContractPage.enterAccountOwnerName("Test 3 Bank");
            app.addResidentialContractPage.clickSaveBTNOnAddIban();
        }
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectOtherRadioBtnForAccountOwner();
        logger.info("Step 08:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.addAdditionalFee();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 09:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectOtherTerms();
        app.addResidentialContractPage.selectGoverningLaw();
        app.addResidentialContractPage.addAdditionalTerms();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 10:  Submit the contract > Review all details > Submit");
        app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
        app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.clickConfirmBtnOnCloseSurveyPopUp();
        logger.info("Step 11:  Get contract number > Search for the contract and verify the status has been changed");
        app.addResidentialContractPage.setContractNumberToContext(context);
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.verifyContractStatusIsWaitingForApproval();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_42_approveResidentialContractLessThanThreeMonthsAndQuarterlyFrequencyPaymentByLesser(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(<3 Months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_43_approveResidentialContractLessThanThreeMonthsAndQuarterlyFrequencyPaymentByTenant(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(<3 Months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_44_addNewResidentialContractWithDurationLessThanThreeMonthsAndFlexiblePayment(Map<String, String> data,  ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.rechargeWalletPage.chooseOfficer("BO_Manager");
        //app.rechargeWalletPage.addIban();
        //app.rechargeWalletPage.rechargeWallet();
        //--------------------------------------------------------------------------------------------
        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 03: Input date > Select contract's duration from calender (Less than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.selectStartDateOfResidualContract("20", "May مايو", "2024");
        app.addResidentialContractPage.selectEndDateOfResidualContract("1", "August أغسطس", "2024");
        app.addResidentialContractPage.clickConfirmPeriodBTN();
        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.addResidentialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty("Auto1010");
        app.addResidentialContractPage.clickContinueWithThisPropertyBTN();
        app.addResidentialContractPage.clickContinueToSelectUnitsBTN();
        app.addResidentialContractPage.clickFilterBtnOnSelectUnitPage();
        app.addResidentialContractPage.selectUnitsAvailability();
        app.addResidentialContractPage.selectFirstAvailableUnit();
        app.addResidentialContractPage.clickConfirmPropertyDetailsBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.newAddress())) {
            logger.info("Select and confirm address from the map");
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
        logger.info("Step 06: Input Individual/Tenant Information details > Confirm");
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("509876567");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.selectTenantRegion(1);
        //app.addResidentialContractPage.clickTenantCityDropdown();
        //app.addResidentialContractPage.selectTenantCity("الرياض");
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        app.addResidentialContractPage.addLessorFacilities();
        app.addResidentialContractPage.inputTenantPhoneNumberAndEmail("564678656");
        //---------------If New User Uncomment Below Method-----------------------------------
        //app.addResidentialContractPage.AddAdditionalAdders();
        //-----------------------------------------------------------------------------------
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
        logger.info("Step 07: Navigate to Financial > Input annual rent > Select Flexible Payment > Add and select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.increaseRentPrice();
        app.addResidentialContractPage.clickAddAdditionalContractTerms();
        app.addResidentialContractPage.clickFlexiblePaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
        if(Browser.isElementPresent(AddResidentialContractPageObjects.addNewIbanInContract())) {            app.addResidentialContractPage.addNewIbanBTN();
            app.addResidentialContractPage.enterIbanNumber("SA8720000000000000034567");
            app.addResidentialContractPage.enterAccountOwnerName("Test 3 Bank");
            app.addResidentialContractPage.clickSaveBTNOnAddIban();
        }
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRadioBtnForAccountOwner();
        logger.info("Step 08:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.addAdditionalFee();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 09:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectOtherTerms();
        app.addResidentialContractPage.selectGoverningLaw();
        app.addResidentialContractPage.addAdditionalTerms();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();
        logger.info("Step 10:  Submit the contract > Review all details > Submit");
        app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
        app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.clickConfirmBtnOnCloseSurveyPopUp();
        logger.info("Step 11:  Get contract number > Search for the contract and verify the status has been changed");
        app.addResidentialContractPage.setContractNumberToContext(context);
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.verifyContractStatusIsWaitingForApproval();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_45_approveResidentialContractLessThanThreeMonthsAndFlexiblePaymentByLesser(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(<3 Months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_46_approveResidentialContractLessThanThreeMonthsAndFlexiblePaymentByTenant(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();
        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(<3 Months)"));
        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    //------------------------------NotUsed-----------------------------------------------------------
    @Test(dataProvider = "testDataProvider")
    public void verifyBOOfficerNavigationToResidentialContractPage(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to EJAR Dashboard");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Navigate to Add New Residential page");
        app.addResidentialContractPage.selectNewResidualContract();
        logger.info("Step 04: Verify Add Residential Contract page is visible to the user");
        app.addResidentialContractPage.verifyAddResidentialContractPageIsVisible();
    }
}