package sa.ejar.web.login.pre_condition;

import com.testcrew.manager.TestDataManager;
import org.testng.ITestContext;
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
        String currentDate = java.time.LocalDate.now().toString();
        String [] arrDate = currentDate.split("-");
        app.addResidentialContractPage.selectStartDateOfResidualContract(String.valueOf(Integer.parseInt(arrDate[2])),app.addResidentialContractPage.getCurrentMonth(arrDate[1]), arrDate[0]);
        app.addResidentialContractPage.selectEndDateOfResidualContract(String.valueOf(Integer.parseInt(arrDate[2])),app.addResidentialContractPage.getCurrentMonth(arrDate[1]), String.valueOf(Integer.parseInt(arrDate[0])+1));
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
        app.createNewCommercialContractPage.clickSinglePaymentFrequency();
//        app.createNewCommercialContractPage.clickConfirmPaymentScheduleBTN();
        app.createNewCommercialContractPage.clickPayOnlineBTN();
        app.createNewCommercialContractPage.selectIbanFromDropdown();
        app.createNewCommercialContractPage.selectLessorRadioBtnForAccountOwner();
        app.createNewCommercialContractPage.clickContinueFinancialTermsBTN();
        logger.info("Step 10:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.createNewCommercialContractPage.clickAddTermsAndConditionsBTN();
        app.addSubleaseContractPage.getContractOption2();
        app.addSubleaseContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addSubleaseContractPage.ChangeCommercialActivity();
        app.addSubleaseContractPage.RentSubleasesForOther();
        app.addSubleaseContractPage.clickConfirmTermsAndConditions();
        logger.info("Step 11:  Submit the contract > Review all details > Submit");
        app.createNewCommercialContractPage.clickSubmitForApprovalBTN();
        app.createNewCommercialContractPage.clickContinueBtnOnPreviewContractPage();
        app.createNewCommercialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.createNewCommercialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.createNewCommercialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        CommonMethodsPage.clickRatingButtons();
        CommonMethodsPage.clickOnSubmitButton();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        logger.info("Step 12:  Get contract number > Search for the contract and verify the status has been changed");
        String contractNum = app.createNewCommercialContractPage.getContractNumber();
        app.createNewCommercialContractPage.clickContractsBtn();
        TestDataManager.addDependantGlobalTestData("Contracts","ContractNumber",contractNum);
        TestDataManager.writeDependantGlobalTestData("Contracts");
    }
}

