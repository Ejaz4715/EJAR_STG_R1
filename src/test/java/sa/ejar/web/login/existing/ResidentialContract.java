package sa.ejar.web.login.existing;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
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
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        app.addResidentialContractPage.clickDateInputField();
        String currentDate = java.time.LocalDate.now().toString();
        String [] arrDate = currentDate.split("-");
        app.addResidentialContractPage.selectStartDateOfResidualContract(String.valueOf(Integer.parseInt(arrDate[2])),app.addResidentialContractPage.getCurrentMonth(arrDate[1]), arrDate[0]);
        app.addResidentialContractPage.selectEndDateOfResidualContract(String.valueOf(Integer.parseInt(arrDate[2])),app.addResidentialContractPage.getCurrentMonth(arrDate[1]), String.valueOf(Integer.parseInt(arrDate[0])+1));
        app.addResidentialContractPage.clickConfirmPeriodBTN();
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
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddIndividualTenantBTN();
        app.addResidentialContractPage.clickTenantRadioBTN();
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
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
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectGoverningLaw(data.get("EnableSublease"));
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
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
    public void ResidentialContractLessThanThreeMonths(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application As Bo Officer/Manager Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();
        app.addResidentialContractPage.clickDateInputField();
        String currentDate = java.time.LocalDate.now().toString();
        String [] arrDate = currentDate.split("-");
        app.addResidentialContractPage.selectStartDateOfResidualContract(String.valueOf(Integer.parseInt(arrDate[2])),app.addResidentialContractPage.getCurrentMonth(arrDate[1]), arrDate[0]);
        app.addResidentialContractPage.selectEndDateOfResidualContract(String.valueOf(Integer.parseInt(arrDate[2])),app.addResidentialContractPage.getCurrentMonth(String.valueOf(Integer.parseInt(arrDate[1])+02)), arrDate[0]);
        app.addResidentialContractPage.clickConfirmPeriodBTN();
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
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddIndividualTenantBTN();
        app.addResidentialContractPage.clickTenantRadioBTN();
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();
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
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectGoverningLaw(data.get("EnableSublease"));
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
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
        CommonMethodsPage.clickOnConfirmButton();
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
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
        CommonMethodsPage.clickOnConfirmButton();
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        app.sendContractForApprovalPage.clickOnSubmitContractApprovalButton();
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
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
    public void ApproveResidentialContractByTenantLessThan3Months(Map<String, String> data) throws Exception {
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