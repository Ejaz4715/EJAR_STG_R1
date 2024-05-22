package sa.ejar.web.pages.pre_condition;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestContext;
import sa.ejar.web.objects.pre_condition.*;

import java.util.List;
import java.util.Map;

import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.logger;

public class AddSubleaseContractPage {

    public void clickOnTheContracts() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNContracts(), 20);
        Browser.click(AddSubleaseContractPageObjects.BTNContracts());
    }

    public void clickOnViewAllContracts() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNViewAllContracts(), 20);
        Browser.click(AddSubleaseContractPageObjects.BTNViewAllContracts());
    }

    public void clickOnFilterOfContracts() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.filterBtnOnViewAllContractsPage(), 20);
        Browser.click(AddSubleaseContractPageObjects.filterBtnOnViewAllContractsPage());
    }

    public void enterContractNumber(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTContractNumber(), 20);
        Browser.setText(AddSubleaseContractPageObjects.TXTContractNumber(), data.get("Contract_Number"));
        logger.addScreenshot("");
    }

    public void clickOnDotsButton() throws Exception {
        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNDots(), 30);
        Browser.executeJSScrollIntoView(AddSubleaseContractPageObjects.BTNDots());
        Browser.click(AddSubleaseContractPageObjects.BTNDots());
    }

    public void clickOnCreateSubleaseContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.AddSubleaseContract(), 30);
        Browser.click(AddSubleaseContractPageObjects.AddSubleaseContract());
    }


    public void clickOnRegisterButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNRegister(), 7);
        Browser.click(AddSubleaseContractPageObjects.BTNRegister());
    }


    public void clickNationalIDRadioBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.NationalIDRadioBTN(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddSubleaseContractPageObjects.NationalIDRadioBTN());
    }


    public void clickOnSearchButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNSearch(), 7);
        Browser.click(AddSubleaseContractPageObjects.BTNSearch());
    }

    public void clickOnNextButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNNext(), 7);
        Browser.click(AddSubleaseContractPageObjects.BTNNext());
    }

    public void enterUsername(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTUsername(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTUsername(), data.get("New_Username"));
    }

    public void enterPassword(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTPassword(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTPassword(), data.get("New_Password"));
    }

    public void enterConfirmPassword(Map<String, String> data) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTConfirmPassword(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTConfirmPassword(), data.get("New_Confirm_Password"));
        Browser.takeScreenshot();
    }

    public void clickOnCreateAccountButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNCreateAccount(), 7);
        Browser.click(AddSubleaseContractPageObjects.BTNCreateAccount());
    }

    public void clickOnLoginToAccountButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNLoginToAccount(), 7);
        Browser.click(AddSubleaseContractPageObjects.BTNLoginToAccount());
    }

    public void clickOnTermsCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.CheckboxTerms(), 8);
        Browser.click(AddSubleaseContractPageObjects.CheckboxTerms());
    }

    public void clickOnInfoCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.CheckboxInfo(), 8);
        Browser.click(AddSubleaseContractPageObjects.CheckboxInfo());
    }

    public void clickOnConfirmButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNConfirm(), 20);
        Browser.executeJSScrollIntoView(AddSubleaseContractPageObjects.BTNConfirm());
        Browser.click(AddSubleaseContractPageObjects.BTNConfirm());
        Browser.waitForSeconds(2);
    }


    public void enterEmail() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTEmail(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTEmail(), "abc@g.com");

    }

    public void enterPostalCode() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTPostalCode(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTPostalCode(), "11111");
        Browser.takeScreenshot();
    }

    public void enterStreetName() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTStreetName(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTStreetName(), "Ejar Street");
    }

    public void enterBuildingNumber() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTBuildingNumber(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTBuildingNumber(), "1111");
    }

    public void enterAdditionalNumber() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTAdditionalNumber(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTAdditionalNumber(), "1111");
        Browser.takeScreenshot();
    }

    public void clickAddCCompanions() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNAddCompanions(), 15);
        Browser.waitForSeconds(3);
        Browser.click(AddSubleaseContractPageObjects.BTNAddCompanions());
    }

    public void clickOnUtilitiesAndServices() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNUtilitiesAndServices(), 20);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNUtilitiesAndServices());
    }

    public void clickOnEngineeringSupervision() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNEngineeringSupervision(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNEngineeringSupervision());
        enterEngineeringSupervision();
    }

    public void enterEngineeringSupervision() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTEngineeringSupervision(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTEngineeringSupervision(), "150");
        Browser.takeScreenshot();
    }

    public void clickOnUnitFinishing() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNUnitFinishing(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNUnitFinishing());
        enterUnitFinishing();
    }

    public void enterUnitFinishing() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTUnitFinishing(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTUnitFinishing(), "150");
        Browser.takeScreenshot();
    }

    public void clickOnWasteRemoval() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNWasteRemoval(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNWasteRemoval());
        enterWasteRemoval();
        logger.addScreenshot("");
    }

    public void enterWasteRemoval() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTWasteRemoval(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTWasteRemoval(), "150");
        Browser.takeScreenshot();
    }

    public void clickOnSecurityDeposit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNSecurityDeposit(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNSecurityDeposit());
        enterSecurityDeposit();
    }

    public void enterSecurityDeposit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTSecurityDeposit(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTSecurityDeposit(), "150");
        logger.addScreenshot("");
    }

    public void clickOnLateFeesCharged() throws Exception {
        Browser.executeJSScroll(250);
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNLateFeesCharged(), 7);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNLateFeesCharged());
        enterLateFeesCharged();
    }

    public void enterLateFeesCharged() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTLateFeesCharged(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTLateFeesCharged(), "100");
        Browser.takeScreenshot();
    }

    public void clickOnRetainerFees() throws Exception {
        Browser.executeJSScroll(250);
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNRetainerFees(), 7);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNRetainerFees());
        enterRetainerFees();
    }

    public void enterRetainerFees() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTRetainerFees(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTRetainerFees(), "400");
        Browser.takeScreenshot();
    }


    public void clickOnBrokerageFees() throws Exception {
        Browser.executeJSScroll(250);
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNBrokerageFees(), 7);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNBrokerageFees());
    }
    public void clickOnBrokerageFees2() throws Exception {
        Browser.executeJSScroll(250);
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNBrokerageFees(), 7);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNBrokerageFees());
        enterBrokerageFees();
        logger.addScreenshot("");
    }

    public void enterBrokerageFees() throws Exception {
        if (Browser.isElementPresent(By.xpath("//label[text()='دفع أجرة سعي مكتب الوساطة من خلال']"))){

            Browser.click(By.xpath("//label[text()=' المؤجر ']"));
        }
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTBrokerageFees(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTBrokerageFees(), "100");
        if(Browser.isElementPresent(By.xpath("//input[@data-name='brokerage_fee_due_date']"))){

            Browser.setText(By.xpath("//input[@data-name='brokerage_fee_due_date']"),"20240404");
        }
    }

    public void enterBrokerageFeesDueDate() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTBrokerageFeesDueDate(), 7);
        Browser.setText(AddSubleaseContractPageObjects.TXTBrokerageFeesDueDate(), "20240303");
        Browser.takeScreenshot();
    }

    public void clickOnArbitration() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNArbitration(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNArbitration());
        Browser.click(By.xpath("(//label[@class='form-check-label']//div[text()='مركز التحكيم العقاري'])"));
        Browser.setText(AddSubleaseContractPageObjects.disputeResolutionPeriod(), "10");
        logger.addScreenshot("");
    }

    public void ContractSubjectToCondition() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNContractSubjectToCondition(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNContractSubjectToCondition());
        Browser.click(By.xpath("(//label[@class='form-check-label']//div[text()='في إنتظار شهادة البناء'])"));
        logger.addScreenshot("");
    }

    public void ChangeCommercialActivity() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNChangeCommercialActivity(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNChangeCommercialActivity());
    }

    public void AutomaticContractRenewal() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNAutomaticContractRenewal(), 50);
        Browser.click(By.xpath("(//label[@class='form-check-label']//div[text()='نفس مدة العقد السابقة'])"));
        Browser.setText(AddSubleaseContractPageObjects.cancelAutoRenewal(), "180");
        logger.addScreenshot("");
    }

    public void SwitchBTNAutomaticContractRenewal() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNAutomaticContractRenewal(), 50);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNAutomaticContractRenewal());
    }

    public void RentSubleasesForOther() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNSublease(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNSublease());
        Browser.click(By.xpath("(//label[@class='form-check-label']//div[text()='يحق للمستأجر تأجير الوحدة الإيجارية كاملة للغير.'])"));
    }
    public void ReviewGovernmentAndOfficialAgencies() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNReviewGovernmentAndOfficialAgencies(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNReviewGovernmentAndOfficialAgencies());
    }

    public void SafetyAndSecurityPrecautions() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNSafetyAndSecurityPrecautions(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNSafetyAndSecurityPrecautions());
    }

    public void ChangesOnUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNChangesOnUnit(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNChangesOnUnit());
        logger.addScreenshot("");
    }

    public void InteriorDesignWorks() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNInteriorDesignWorks(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNInteriorDesignWorks());
    }

    public void unitOpeningDelayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNunitOpeningDelayed(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNunitOpeningDelayed());
        Browser.setText(AddSubleaseContractPageObjects.dailyValueDelayInput(), "10");
    }

    public void trademarkRegistrationProof() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNTrademarkRegistrationProof(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNTrademarkRegistrationProof());
        logger.addScreenshot("");
    }

    public void InsurancePolicy() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNInsurancePolicy(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNInsurancePolicy());
    }

    public void MaintainingElectricalMechanicalInfrastructures() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNMaintainingElectricalMechanicalInfrastructures(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNMaintainingElectricalMechanicalInfrastructures());
    }

    public void NonSmokingZones() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNNonSmokingZones(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNNonSmokingZones());
    }

    public void WasteDisposal() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNWasteDisposal(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNWasteDisposal());
        logger.addScreenshot("");
    }

    public void UnitClosingPeriod() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNUnitClosingPeriod(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNUnitClosingPeriod());
        Browser.setText(AddSubleaseContractPageObjects.continuousClosingDays(), "100");
        Browser.setText(AddSubleaseContractPageObjects.discontinuousClosingDays(), "100");
    }

    public void RemovalAdditionsLeaseExpire() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNRemovalAdditionsLeaseExpire(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNRemovalAdditionsLeaseExpire());
        Browser.click(By.xpath("(//label[@class='form-check-label']//div[text()='إزالة التحسينات'])"));
        logger.addScreenshot("");
    }

    public void cancelMunicipalLicense() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNCancelMunicipalLicense(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNCancelMunicipalLicense());
        Browser.click(By.xpath("(//label[@class='form-check-label']//div[text()='إلغاء رخصة البلدية'])"));
        Browser.click(By.xpath("(//label[@class='form-check-label']//div[text()='إلغاء وتحديد أجرة يومية في حالة التأخير'])"));
        Browser.setText(AddSubleaseContractPageObjects.dailyValueOfDelayCancelMunicipalLicense(), "100");
        logger.addScreenshot("");
    }

    public void dailyChargeInCaseDelayedDeliveryUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNDailyChargeInCaseDelayedDeliveryUnit(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNDailyChargeInCaseDelayedDeliveryUnit());
        Browser.setText(AddSubleaseContractPageObjects.dailyValueOfDelayedDeliveryUnit(), "100");
    }

    public void approvalUserGuide() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNApprovalUserGuide(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNApprovalUserGuide());
    }

    public void openingAndTerminationPeriod() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.openingPeriodForIntendedActivity(), 12);
        Browser.setText(AddSubleaseContractPageObjects.openingPeriodForIntendedActivity(), "100");
        Browser.setText(AddSubleaseContractPageObjects.periodForTerminatingIfUnitNotOpened(), "100");
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void AdhereToTenantGuide() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNAdhereToTenantGuide(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNAdhereToTenantGuide());
    }

    public void AdherenceToOpeningAndClosingDatesOfRentalUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNAdherenceToOpeningAndClosingDatesOfRentalUnit(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNAdherenceToOpeningAndClosingDatesOfRentalUnit());
    }

    public void CommercialDiscounts() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNCommercialDiscounts(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNCommercialDiscounts());
        Browser.click(By.xpath("(//label[@class='form-check-label']//div[text()='إشعار المؤجر والحصول علي موافقة كتابية'])"));
        logger.addScreenshot("");
    }

    public void IsolationFloorForAnyActivityUseWaterAndSanitation() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNIsolationFloorForAnyActivityUseWaterAndSanitation(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNIsolationFloorForAnyActivityUseWaterAndSanitation());
    }

    public void LoadingAndUnloadingOperations() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNLoadingAndUnloadingOperations(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNLoadingAndUnloadingOperations());
    }

    public void CancellationTransferOfPhoneLines() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNCancellationTransferOfPhoneLines(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNCancellationTransferOfPhoneLines());
    }

    public void ReplacingRentalUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNReplacingRentalUnit(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNReplacingRentalUnit());
    }

    public void ChangeInRentalValue() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNChangeInRentalValue(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNChangeInRentalValue());
        Browser.setText(AddSubleaseContractPageObjects.numberReportingDays(), "100");
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }


    public void AdditionalTermsAndConditions() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNAdditionalTermsAndConditions(), 12);
            Browser.click(AddSubleaseContractPageObjects.SwitchBTNAdditionalTermsAndConditions());
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.addAdditionalTerm(),20);
            Browser.click(AddSubleaseContractPageObjects.addAdditionalTerm());
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.addAdditionalTermInput(), 20);
            Browser.setText(AddSubleaseContractPageObjects.addAdditionalTermInput(), "Test By Automation");
            logger.addScreenshot("");
            Browser.click(AddSubleaseContractPageObjects.confirmAddAdditionalTermInputBut());
    }

    public void clickOnGovernmentReview() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNGovernmentReview(), 7);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNGovernmentReview());
    }

    public void clickOnImprovement() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNImprovement(), 7);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNImprovement());
    }

    public void clickOnEditUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNEditUnit(), 7);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNEditUnit());
    }

    public void clickOnCustomTerms() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNCustomTerms(), 7);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNCustomTerms());
    }

    public void clickOnAddAnotherTerms() throws Exception {
        Browser.executeJSScroll(200);
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNAddAnotherTerms(), 20);
        Browser.click(AddSubleaseContractPageObjects.BTNAddAnotherTerms());
    }

    public void enterAnotherTerms() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTTerms(), 15);
        Browser.setText(AddSubleaseContractPageObjects.TXTTerms(), "شروط ايجار المحدثة");
        Browser.takeScreenshot();
    }

    public void clickSelectUnit() throws Exception {
        Browser.executeJSScroll(900);
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNSelectUnit(),5);
        Browser.click(AddSubleaseContractPageObjects.BTNSelectUnit());
    }

    public void clickOnCloseWindow() throws Exception {
        if (Browser.isElementPresent(AddSubleaseContractPageObjects.BTNCloseWindow())) {
            Browser.waitForSeconds(5);
            Browser.click(AddSubleaseContractPageObjects.BTNCloseWindow());
        } else {
            Browser.waitForSeconds(2);
        }
    }

    public void clickOnCloseButton() throws Exception {
        Browser.waitForSeconds(7);
        if (Browser.isElementPresent(AddSubleaseContractPageObjects.BTNClose())) {
            Browser.click(AddSubleaseContractPageObjects.BTNClose());
        }

    }

    public void clickDateInputField() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.clickDateInputField(), 35);
        Browser.click(AddSubleaseContractPageObjects.clickDateInputField());
    }

    public void clickContractsBtn() throws Exception {
        Browser.waitForSeconds(1);
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.contractButton(), 20);
        Browser.click(LoginPageObjects.contractButton());
    }

    public void selectViewAllContractsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.viewAllContractsButton(), 20);
        Browser.click(LoginPageObjects.viewAllContractsButton());
    }


    public void selectNewResidualContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.optionCreateNewContract(), 5);
        Browser.click(LoginPageObjects.optionCreateNewContract());
        Browser.takeScreenshot();
    }

    public void selectEndDateOfSubleaseContract(String day, String month, String year) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.clickContractEndYear(), 5);
        Browser.click(AddSubleaseContractPageObjects.clickContractEndYear());


        //Select year
        List<WebElement> listYear = driver.findElements(AddSubleaseContractPageObjects.selectContractEndYear());
        for (WebElement y : listYear) {
            String getYear = y.getText();
            if (getYear.equalsIgnoreCase(year)) {
                y.click();
                break;
            }
        }

        //Select month
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.clickContractEndMonth(), 5);
        Browser.click(AddSubleaseContractPageObjects.clickContractEndMonth());
        List<WebElement> listMonth = driver.findElements(AddSubleaseContractPageObjects.selectContractEndMonth());
        String[] monthArray = month.split(" ");
        for (WebElement m : listMonth) {
            String getMonth = m.getText();
            if (getMonth.equalsIgnoreCase(monthArray[0]) || getMonth.equalsIgnoreCase(monthArray[1])) {
                Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.selectContractEndMonth(), 6);
                m.click();
                break;
            }
        }

        //Select day
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.selectContractEndDay(), 5);
        List<WebElement> listDay = driver.findElements(AddSubleaseContractPageObjects.selectContractEndDay());
        for (WebElement d : listDay) {
            String getDay = d.getText();
            if (getDay.equalsIgnoreCase(day)) {
                Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.selectContractEndDay(), 6);
                d.click();
                break;
            }
        }
    }

    public void selectStartDateOfSubleaseContract(String day, String month, String year) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.clickContractStartYear(), 5);
        Browser.click(AddSubleaseContractPageObjects.clickContractStartYear());

        //Select year
        List<WebElement> listYear = driver.findElements(AddSubleaseContractPageObjects.selectContractStartYear());
        for (WebElement y : listYear) {
            String getYear = y.getText();
            if (getYear.equalsIgnoreCase(year)) {
                y.click();
                break;
            }
        }

        //Select month
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.clickContractStartMonth(), 5);
        Browser.click(AddSubleaseContractPageObjects.clickContractStartMonth());
        String[] monthArray = month.split(" ");
        List<WebElement> listMonth = driver.findElements(AddSubleaseContractPageObjects.selectContractStartMonth());
        for (WebElement m : listMonth) {
            String getMonth = m.getText();
            if (getMonth.equalsIgnoreCase(monthArray[0]) || getMonth.equalsIgnoreCase(monthArray[1])) {
                m.click();
                break;
            }
        }

        //Select day
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.selectContractStartDay(), 10);
        List<WebElement> listDay = driver.findElements(AddSubleaseContractPageObjects.selectContractStartDay());
        for (WebElement d : listDay) {
            String getMonth = d.getText();
            if (getMonth.equalsIgnoreCase(day)) {
                Browser.waitForSeconds(2);
                d.click();
                break;
            }
        }
    }

    public void clickConfirmPeriodBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.confirmPeriodBTN(), 20);
        Browser.executeJSScroll(200);
        Browser.waitForSeconds(1);
        Browser.click(AddSubleaseContractPageObjects.confirmPeriodBTN());
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void clickAddPropertyBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.coveredPropertyUnitsBTN(), 20);
        Browser.waitForSeconds(5);
        Browser.click(AddSubleaseContractPageObjects.coveredPropertyUnitsBTN());
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.addPropertyBTN(), 10);
        Browser.click(AddSubleaseContractPageObjects.addPropertyBTN());
    }

    public void selectProperty(String propertyName) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.propertyName(), 5);
        Browser.waitForSeconds(2);
        List<WebElement> listPropertyNames = driver.findElements(AddSubleaseContractPageObjects.propertyName());
        for (WebElement property : listPropertyNames) {
            String getPropertyName = property.getText();
            if (getPropertyName.equalsIgnoreCase(propertyName)) {
                property.click();
                Browser.waitForSeconds(2);
                break;
            }
        }
        Browser.takeScreenshot();
    }

    public void clickContinueWithThisPropertyBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.continueWithThisPropertyBTN(), 5);
        Browser.click(AddSubleaseContractPageObjects.continueWithThisPropertyBTN());
    }

    public void clickContinueToSelectUnitsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.continueToSelectUnitsBTN(), 10);
        Browser.waitForSeconds(2);
        Browser.click(AddSubleaseContractPageObjects.continueToSelectUnitsBTN());
    }

    public void clickFilterBtnOnSelectUnitPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.filterBtnOnSelectUnitsPage(), 50);
        Browser.click(AddSubleaseContractPageObjects.filterBtnOnSelectUnitsPage());
    }

    public void selectUnitsAvailability() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.selectUnitsAvailability(), 20);
        Browser.selectDropdownByIndex(AddSubleaseContractPageObjects.selectUnitsAvailability(), 1);
    }

    public void selectUnit(String inputUnit) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.selectUnit(), 10);
        Browser.waitForSeconds(2);
        List<WebElement> listUnits = driver.findElements(AddSubleaseContractPageObjects.selectUnit());
        for (WebElement unit : listUnits) {
            String getUnitNum = unit.getText();
            System.out.println("unit number is " + getUnitNum);
            if (getUnitNum.contains(inputUnit)) {
                unit.click();
                Browser.waitForSeconds(2);
                break;
            }
        }
        Browser.takeScreenshot();
    }

    public void selectFirstAvailableUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.selectFirstAvailableUnit(), 20);
        Browser.click(AddSubleaseContractPageObjects.selectFirstAvailableUnit());
        logger.addScreenshot("");
    }

    public void clickConfirmPropertyDetailsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.confirmPropertyDetailsBTN(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddSubleaseContractPageObjects.confirmPropertyDetailsBTN());
        Browser.takeScreenshot();
    }

    public void clickIdentifyAddressOnMapBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.identifyAddressOnMapBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddSubleaseContractPageObjects.identifyAddressOnMapBTN());
    }

    public void clickConfirmBtnOnMap() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.confirmBtnOnMap(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddSubleaseContractPageObjects.confirmBtnOnMap());
        Browser.takeScreenshot();
    }

    public void clickSaveBtnOnPropertyAddress() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.saveBtnOnPropertyAddress(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddSubleaseContractPageObjects.saveBtnOnPropertyAddress());
    }

    public void clickContractPartiesBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.contractPartiesStepBTN(), 20);
        Browser.executeJSScrollIntoView(AddSubleaseContractPageObjects.contractPartiesStepBTN());
        Browser.waitForSeconds(2);
        Browser.click(AddSubleaseContractPageObjects.contractPartiesStepBTN());
    }

    public void clickAddIndividualTenantBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.addIndividualTenantBTN(), 25);
        Browser.click(AddSubleaseContractPageObjects.addIndividualTenantBTN());
        logger.addScreenshot("");
    }

    public void clickTenantRadioBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.tenantRadioBTN(), 25);
        Browser.click(AddSubleaseContractPageObjects.tenantRadioBTN());
    }

    public void inputTenantNationalId(String nationalId) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.tenantNationalIdInput(), 25);
        Browser.setText(AddSubleaseContractPageObjects.tenantNationalIdInput(), nationalId);
    }

    public void inputTenantDOB(String DOB) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.tenantDateOfBirthInput(), 25);
        Browser.setText(AddSubleaseContractPageObjects.tenantDateOfBirthInput(), DOB);
    }

    public void clickContinueButtonOnTenantContractPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.continueBtnOnIndividualContractPage(), 25);
        Browser.click(AddSubleaseContractPageObjects.continueBtnOnIndividualContractPage());
        logger.addScreenshot("");
    }


    public void inputTenantPhoneNumber(String phoneNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.tenantPhoneNumberInput(), 20);
        Browser.setText(AddSubleaseContractPageObjects.tenantPhoneNumberInput(), phoneNumber);
    }

    public void selectTenantRegion() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.tenantRegionDropdown(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddSubleaseContractPageObjects.tenantRegionDropdown());
        Browser.selectDropdownByIndex(AddSubleaseContractPageObjects.tenantRegionDropdown(), 1);
    }

    public void clickTenantCityDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.tenantCityDropdown(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddSubleaseContractPageObjects.tenantCityDropdown());
    }

    public void selectTenantCity(String city) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.selectTenantCity(), 5);
        Browser.waitForSeconds(2);
        List<WebElement> listCity = driver.findElements(AddSubleaseContractPageObjects.selectTenantCity());
        for (WebElement cityName : listCity) {
            String getCityName = cityName.getText();
            if (getCityName.contains(city)) {
                cityName.click();
                Browser.waitForSeconds(2);
                break;
            }
        }
        Browser.takeScreenshot();
    }

    public void clickConfirmBtnOnTenantAddressPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.confirmBtnOnTenantAddressPage(), 25);
        Browser.click(AddSubleaseContractPageObjects.confirmBtnOnTenantAddressPage());
        logger.addScreenshot("");
    }

    public void verifyAddResidentialContractPageIsVisible() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.addResidentialContractDashboard(), 15);
        Assert.assertTrue(Browser.isElementPresent(AddSubleaseContractPageObjects.addResidentialContractDashboard()), "Add Residential Contract dashboard is not visible");
        Browser.takeScreenshot();
    }

    public void clickFinancialTermsStepBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.financialTermsStepBTN(), 60);
        Browser.click(AddSubleaseContractPageObjects.financialTermsStepBTN());
    }

    public void clickAddRentalContractTermsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.addRentalContractTermsBTN(), 45);
        Browser.click(AddSubleaseContractPageObjects.addRentalContractTermsBTN());
    }

    public void enterAnnulRent(String rent) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.annualRentInputField(), 15);
        Browser.setText(AddSubleaseContractPageObjects.annualRentInputField(), rent);
        logger.addScreenshot("");
    }


    public void electricitySeparatedMeterWithFixedAmount() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.getSeparatedMeter_Option1(),50);
        Browser.click(AddSubleaseContractPageObjects.getSeparatedMeter_Option1());
        Browser.click(AddSubleaseContractPageObjects.getLessorOwnerInvoice_Option1());
        Browser.waitForSeconds(3);
        Browser.setText(AddSubleaseContractPageObjects.electricityMeterSite(), "1098789009");
        Browser.click(AddSubleaseContractPageObjects.validateButton());
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.closeAlertMessage(),20);
        Browser.click(AddSubleaseContractPageObjects.closeAlertMessage());
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.electricityCurrentReadingInput(),40);
        Browser.waitForSeconds(3);
        Browser.setText(AddSubleaseContractPageObjects.electricityCurrentReadingInput(), "109878900989009");
        Browser.click(AddSubleaseContractPageObjects.getFixed_Option1());
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.setFixedFee_Input1(),20);
        Browser.waitForSeconds(3);
        Browser.setText(AddSubleaseContractPageObjects.setFixedFee_Input1(), "200");
        logger.addScreenshot("");
    }

    public void electricitySeparatedMeterWithInvoicePayment() throws Exception {
        Browser.click(AddSubleaseContractPageObjects.getSeparatedMeter_Option1());
        Browser.click(AddSubleaseContractPageObjects.getLessorOwnerInvoice_Option1());
        Browser.setText(AddSubleaseContractPageObjects.electricityMeterSite(), "1098789009");
        Browser.click(AddSubleaseContractPageObjects.validateButton());
        Browser.waitForSeconds(1);
        Browser.click(AddSubleaseContractPageObjects.closeAlertMessage());
        Browser.waitForSeconds(1);
        Browser.setText(AddSubleaseContractPageObjects.electricityCurrentReadingInput(), "109878900989009");
        Browser.click(AddSubleaseContractPageObjects.getInvoice_Option1());
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void electricitySharedMeterWithInvoicePayment() throws Exception {
        Browser.click(AddSubleaseContractPageObjects.getSharedMeter_Option1());
        Browser.setText(AddSubleaseContractPageObjects.electricityMeterSite(), "1098789009");
        Browser.click(AddSubleaseContractPageObjects.validateButton());
        Browser.waitForSeconds(1);
        Browser.click(AddSubleaseContractPageObjects.closeAlertMessage());
        Browser.waitForSeconds(1);
        Browser.setText(AddSubleaseContractPageObjects.electricityCurrentReadingInput(), "109878900989009");
        Browser.click(AddSubleaseContractPageObjects.getInvoice_Option1());
        logger.addScreenshot("");
        Browser.waitForSeconds(6);
    }

    public void electricitySharedMeterWithFixedAmount() throws Exception {
        Browser.click(AddSubleaseContractPageObjects.getSharedMeter_Option1());
        Browser.setText(AddSubleaseContractPageObjects.electricityMeterSite(), "1098789009");
        Browser.click(AddSubleaseContractPageObjects.validateButton());
        Browser.waitForSeconds(1);
        Browser.click(AddSubleaseContractPageObjects.closeAlertMessage());
        Browser.waitForSeconds(1);
        Browser.setText(AddSubleaseContractPageObjects.electricityCurrentReadingInput(), "109878900989009");
        Browser.click(AddSubleaseContractPageObjects.getFixed_Option1());
        Browser.setText(AddSubleaseContractPageObjects.setFixedFee_Input1(), "200");
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void electricityOtherMeter() throws Exception {
        Browser.click(AddSubleaseContractPageObjects.electricityOtherOption());
        Browser.click(AddSubleaseContractPageObjects.getElectricityOther_Option("Commercial site"));
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void waterSeparatedMeterWithFixedAmount() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.getSeparatedMeter_Option2(), 40);
        Browser.click(AddSubleaseContractPageObjects.getSeparatedMeter_Option2());
        Browser.click(AddSubleaseContractPageObjects.getLessorOwnerInvoice_Option2());
        Browser.setText(AddSubleaseContractPageObjects.waterMeterAccount(), "1900909393");
        Browser.setText(AddSubleaseContractPageObjects.waterMeterNumber(), "34567890");
        Browser.click(AddSubleaseContractPageObjects.getFixed_Option2());
        Browser.setText(AddSubleaseContractPageObjects.setFixedFee_Input3(), "200");
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }


    public void waterSeparatedMeterWithInvoicePayment() throws Exception {
        Browser.click(AddSubleaseContractPageObjects.getSeparatedMeter_Option2());
        Browser.click(AddSubleaseContractPageObjects.getLessorOwnerInvoice_Option2());
        Browser.setText(AddSubleaseContractPageObjects.waterMeterAccount(), "1900909393");
        Browser.setText(AddSubleaseContractPageObjects.waterMeterNumber(), "34567890");
        Browser.click(AddSubleaseContractPageObjects.getInvoice_Option2());
        Browser.setText(AddSubleaseContractPageObjects.meterCurrentReading(), "200");
        logger.addScreenshot("");
        Browser.waitForSeconds(2);

    }

    public void waterMeterSharedMeterWithFixedAmount() throws Exception {
        Browser.click(AddSubleaseContractPageObjects.getSharedMeter_Option2());
        Browser.setText(AddSubleaseContractPageObjects.waterMeterAccount(), "1900909393");
        Browser.setText(AddSubleaseContractPageObjects.waterMeterNumber(), "34567890");
        Browser.click(AddSubleaseContractPageObjects.getFixed_Option2());
        Browser.setText(AddSubleaseContractPageObjects.waterFixedFee(), "200");
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void waterMeterSharedMeterWithInvoicePayment() throws Exception {
        Browser.click(AddSubleaseContractPageObjects.getSharedMeter_Option2());
        Browser.setText(AddSubleaseContractPageObjects.waterMeterAccount(), "1900909393");
        Browser.setText(AddSubleaseContractPageObjects.waterMeterNumber(), "34567890");
        Browser.click(AddSubleaseContractPageObjects.getInvoice_Option2());
        Browser.setText(AddSubleaseContractPageObjects.meterCurrentReading(), "200");
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void waterOtherMeter() throws Exception {
        Browser.click(AddSubleaseContractPageObjects.waterOtherOption());
        Browser.setText(AddSubleaseContractPageObjects.meterReason(), "TestByAutomation");
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void gasWithFixedAmount() throws Exception {
        if(Browser.isElementPresent(AddSubleaseContractPageObjects.gasFeeOption())) {
            Browser.click(AddSubleaseContractPageObjects.gasFeeOption());
            Browser.waitForSeconds(3);
            Browser.setText(AddSubleaseContractPageObjects.setFixedFee_Input2(), "200");
            logger.addScreenshot("");
        }
        else if (Browser.isElementPresent(By.xpath("//label[text()=' المجموع الكلي ']"))){
            Browser.click(By.xpath("//label[text()=' المجموع الكلي ']"));
            Browser.waitForSeconds(2);
            Browser.setText(AddSubleaseContractPageObjects.setFixedFee_Input2(), "200");
            logger.addScreenshot("");
            Browser.waitForSeconds(2);
        }
    }

    public void gasWithReadingMeter() throws Exception {
        Browser.click(AddSubleaseContractPageObjects.gasFeeReadingMeter());
        Browser.setText(AddSubleaseContractPageObjects.gasMeterCurrentReading(), "100");
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void parkingInput() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.numberOfParking(), 20);
        Browser.waitForSeconds(1);
        Browser.setText(AddSubleaseContractPageObjects.numberOfParking(), "1");
        Browser.waitForSeconds(1);
        Browser.click(AddSubleaseContractPageObjects.setFixedFee_Input4());
        Browser.waitForSeconds(1);
        Browser.setText(AddSubleaseContractPageObjects.setFixedFee_Input4(), "200");
        logger.addScreenshot("");
    }


    public void AddAwqafContractTerms(){
      Browser.waitForSeconds(2);
      Browser.executeJSScroll(400);
      Browser.waitForSeconds(2);
      Browser.click(By.xpath("//app-switch-input[@formcontrolname='utilities_and_services_required']//span[@class='slider enable-transitions']"));
      Browser.waitForSeconds(2);
      Browser.setText(By.xpath("//input[@data-name='sewage_fees']"),"100");
      Browser.setText(By.xpath("//input[@data-name='maintenance']"),"100");
      Browser.setText(By.xpath("//input[@data-name='cleaning_services']"),"100");
      Browser.setText(By.xpath("//input[@data-name='security']"),"100");
      Browser.waitForSeconds(1);
      Browser.clearText(By.xpath("//input[@data-name='tin_number']"));
      Browser.setText(By.xpath("//input[@data-name='tin_number']"),"1234567890");
      Browser.waitForSeconds(1);
    }

    public void SwitchBTNUtilitiesAndServices() throws Exception {
        if(Browser.isElementPresent(AddSubleaseContractPageObjects.numberOfParking())){
            Browser.setText(AddSubleaseContractPageObjects.numberOfParking(), "1");
            Browser.setText(AddSubleaseContractPageObjects.setFixedFee_Input1(), "200");
            logger.addScreenshot("");
        }
        else {
        clickOnUtilitiesAndServices();
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.numberOfParking(), 60);
        Browser.setText(AddSubleaseContractPageObjects.numberOfParking(), "1");
        Browser.setText(AddSubleaseContractPageObjects.setFixedFee_Input1(), "200");
        logger.addScreenshot("");
          }
        }

    public void clickMonthlyPaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'دفعات متكررة')]"), 15);
        Browser.click(By.xpath("//label[contains(text(),'دفعات متكررة')]"));
        Browser.click(By.xpath("//label[@class='form-check-label']//div[text()=' شهري ']"));
        logger.addScreenshot("");
    }

    public void UtilitiesAndServices() throws Exception {
        clickOnUtilitiesAndServices();
        //Electricity
        electricitySeparatedMeterWithFixedAmount();
        //electricitySeparatedMeterWithInvoicePayment();
        //electricitySharedMeterWithFixedAmount();
        //electricitySharedMeterWithInvoicePayment();
        //electricityOtherMeter();
        //Gas Meter
        gasWithFixedAmount();
        //gasWithReadingMeter();
        //Water
        waterSeparatedMeterWithFixedAmount();
        //waterSeparatedMeterWithInvoicePayment();
        //waterMeterSharedMeterWithFixedAmount();
        //waterMeterSharedMeterWithInvoicePayment();
        //waterOtherMeter();
        //Parking
        parkingInput();
        Browser.executeJSScroll(700);
    }

    public void addTaxNumber() {
        Browser.waitForSeconds(1);
        Browser.clearText(By.xpath("//input[@data-name='tin_number']"));
        Browser.setText(By.xpath("//input[@data-name='tin_number']"), "1234567890");
        Browser.waitForSeconds(1);
    }

    public void clickSinglePaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.singlePaymentRadioBTN(), 15);
        Browser.click(AddSubleaseContractPageObjects.singlePaymentRadioBTN());
    }

    public void clickConfirmPaymentScheduleBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.continueToBillingScheduleBTN(), 15);
        Browser.click(AddSubleaseContractPageObjects.continueToBillingScheduleBTN());
    }

    public void clickPayOnlineBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.payOnlineBTN(), 15);
        Browser.click(AddSubleaseContractPageObjects.payOnlineBTN());
    }

    public void addNewIbanBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.addNewIbanBTN(), 15);
        Browser.click(AddSubleaseContractPageObjects.addNewIbanBTN());
        logger.addScreenshot("");
    }

    public void enterIbanNumber(String ibanNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.ibanNumberInputField(), 15);
        Browser.waitForSeconds(2);
        Browser.setText(AddSubleaseContractPageObjects.ibanNumberInputField(), ibanNumber);
    }

    public void enterAccountOwnerName(String ownerName) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.accountOwnerNameInputField(), 15);
        Browser.waitForSeconds(2);
        Browser.setText(AddSubleaseContractPageObjects.accountOwnerNameInputField(), ownerName);
    }

    public void clickSaveBTNOnAddIban() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.saveBTNonAddNewIban(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddSubleaseContractPageObjects.saveBTNonAddNewIban());
        logger.addScreenshot("");
    }

    public void selectIbanFromDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.selectIbanDropdown(), 25);
        Browser.click(AddSubleaseContractPageObjects.selectIbanDropdown());
        Browser.selectDropdownByIndex(AddSubleaseContractPageObjects.selectIbanDropdown(), 1);
    }

    public void selectLessorRadioBtnForAccountOwner() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.ibanAccountOwnerRadioBTN(), 15);
        Browser.click(AddSubleaseContractPageObjects.ibanAccountOwnerRadioBTN());
    }

    public void clickContinueToAdditionalFeeBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.continueToAdditionalFeeBTN(), 15);
        Browser.click(AddSubleaseContractPageObjects.continueToAdditionalFeeBTN());
    }

    public void addAdditionalFee() throws Exception {
        clickOnEngineeringSupervision();
        clickOnUnitFinishing();
        clickOnWasteRemoval();
        //clickOnSecurityDeposit();
        clickOnLateFeesCharged();
        clickOnRetainerFees();
        clickOnBrokerageFees2();
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(1);
    }

    public void addAdditionalFee2() throws Exception {
        //clickOnSecurityDeposit();
        clickOnLateFeesCharged();
        clickOnRetainerFees();
        clickOnBrokerageFees();
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(2);
    }

    public void addAdditionalFeeLessThan3Month() throws Exception {
        clickOnEngineeringSupervision();
        clickOnUnitFinishing();
        clickOnWasteRemoval();
        clickOnLateFeesCharged();
        clickOnRetainerFees();
        clickOnBrokerageFees();
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(2);
    }
    public void clickAddAdditionalTermsAndConditions1() throws Exception {
        clickOnArbitration();
        ContractSubjectToCondition();
        ChangeCommercialActivity();
        AutomaticContractRenewal();
        ReviewGovernmentAndOfficialAgencies();
        AdditionalTermsAndConditions();
    }
    public void clickAddAdditionalTermsAndConditionsWithOpenContractMoreThan3Month() throws Exception {
        clickOnArbitration();
        AutomaticContractRenewal();
        ChangeCommercialActivity();
        RentSubleasesForOther();
        ReviewGovernmentAndOfficialAgencies();
        AdditionalTermsAndConditions();

    }

    public void clickAddAdditionalTermsAndConditionsWithOpenContractMoreThan3MonthForSublease() throws Exception {
        clickOnArbitration();
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNAutomaticContractRenewal());
        ChangeCommercialActivity();
        ReviewGovernmentAndOfficialAgencies();
        AdditionalTermsAndConditions();
    }

    public void clickAddAdditionalTermsAndConditionsWithOpenContractLessThan3MonthForSublease() throws Exception {
        clickOnArbitration();
        ChangeCommercialActivity();
        ReviewGovernmentAndOfficialAgencies();
        AdditionalTermsAndConditions();
    }
    public void clickAddAdditionalTermsAndConditionsWithOpenContractLessThan3Month() throws Exception {
        clickOnArbitration();
        ChangeCommercialActivity();
        RentSubleasesForOther();
        ReviewGovernmentAndOfficialAgencies();
        AdditionalTermsAndConditions();
    }
    public void addMoreTermsWithUnifiedCommercialContractMoreThan3Month() throws Exception {
        AutomaticContractRenewal();
        ChangeCommercialActivity();
        AdditionalTermsAndConditions();
    }

    public void clickAddAdditionalTermsAndConditionsWithResidentialOpenContractLessThan3Month() throws Exception {
        clickOnArbitration();
        ChangeCommercialActivity();
        RentSubleasesForOther();
        ReviewGovernmentAndOfficialAgencies();
        AdditionalTermsAndConditions();
    }

    public void AddMoreTermsWithUnifiedCommercialContractLessThan3Month() throws Exception {
        ChangeCommercialActivity();
        AdditionalTermsAndConditions();
    }


    public void addMoreTermsAndCondition()  throws Exception {
         //ContractSubjectToCondition();
         AutomaticContractRenewal();
         ChangeCommercialActivity();
         AdditionalTermsAndConditions();
        }

        public void clickAddAdditionalTermsAndConditions5() throws Exception {
            RentSubleasesForOther();
            ReviewGovernmentAndOfficialAgencies();
            SafetyAndSecurityPrecautions();
            ChangesOnUnit();
            InteriorDesignWorks();
            unitOpeningDelayed();
            trademarkRegistrationProof();
            InsurancePolicy();
            MaintainingElectricalMechanicalInfrastructures();
            NonSmokingZones();
            WasteDisposal();
            RemovalAdditionsLeaseExpire();
            cancelMunicipalLicense();
            approvalUserGuide();
            AdhereToTenantGuide();
            AdherenceToOpeningAndClosingDatesOfRentalUnit();
            CommercialDiscounts();
            IsolationFloorForAnyActivityUseWaterAndSanitation();
            LoadingAndUnloadingOperations();
            CancellationTransferOfPhoneLines();
            ReplacingRentalUnit();
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.termConditionBTN_Next(),10);
            Browser.click(AddSubleaseContractPageObjects.termConditionBTN_Next());
        }
        public void clickAddAdditionalTermsAndConditionsCommercialContractMoreThan3Month() throws Exception {
            RentSubleasesForOther();
            ReviewGovernmentAndOfficialAgencies();
            SafetyAndSecurityPrecautions();
            ChangesOnUnit();
            InteriorDesignWorks();
            unitOpeningDelayed();
            trademarkRegistrationProof();
            InsurancePolicy();
            MaintainingElectricalMechanicalInfrastructures();
            NonSmokingZones();
            WasteDisposal();
            UnitClosingPeriod();
            RemovalAdditionsLeaseExpire();
            cancelMunicipalLicense();
            //dailyChargeInCaseDelayedDeliveryUnit();
            approvalUserGuide();
            openingAndTerminationPeriod();
            AdhereToTenantGuide();
            AdherenceToOpeningAndClosingDatesOfRentalUnit();
            CommercialDiscounts();
            IsolationFloorForAnyActivityUseWaterAndSanitation();
            LoadingAndUnloadingOperations();
            CancellationTransferOfPhoneLines();
            ReplacingRentalUnit();
            ChangeInRentalValue();
            Browser.waitForSeconds(1);
            Browser.click(AddSubleaseContractPageObjects.termConditionBTN_Next());
            Browser.waitForSeconds(1);
        }


    public void clickAddAdditionalTermsAndConditionsCommercialLessThan3Month() throws Exception {
        RentSubleasesForOther();
        ReviewGovernmentAndOfficialAgencies();
        SafetyAndSecurityPrecautions();
        ChangesOnUnit();
        InteriorDesignWorks();
        unitOpeningDelayed();
        trademarkRegistrationProof();
        InsurancePolicy();
        MaintainingElectricalMechanicalInfrastructures();
        NonSmokingZones();
        WasteDisposal();
        RemovalAdditionsLeaseExpire();
        cancelMunicipalLicense();
        //dailyChargeInCaseDelayedDeliveryUnit();
        approvalUserGuide();
        AdhereToTenantGuide();
        AdherenceToOpeningAndClosingDatesOfRentalUnit();
        CommercialDiscounts();
        IsolationFloorForAnyActivityUseWaterAndSanitation();
        LoadingAndUnloadingOperations();
        CancellationTransferOfPhoneLines();
        ReplacingRentalUnit();
        Browser.waitForSeconds(1);
        Browser.click(AddSubleaseContractPageObjects.termConditionBTN_Next());
        Browser.waitForSeconds(1);
    }

    public void clickAddAdditionalTermsAndConditionsForSubleaseContract3month() throws Exception {
        ReviewGovernmentAndOfficialAgencies();
        SafetyAndSecurityPrecautions();
        ChangesOnUnit();
        InteriorDesignWorks();
        unitOpeningDelayed();
        trademarkRegistrationProof();
        InsurancePolicy();
        MaintainingElectricalMechanicalInfrastructures();
        NonSmokingZones();
        WasteDisposal();
        UnitClosingPeriod();
        RemovalAdditionsLeaseExpire();
        cancelMunicipalLicense();
        //dailyChargeInCaseDelayedDeliveryUnit();
        approvalUserGuide();
        AdhereToTenantGuide();
        AdherenceToOpeningAndClosingDatesOfRentalUnit();
        CommercialDiscounts();
        IsolationFloorForAnyActivityUseWaterAndSanitation();
        LoadingAndUnloadingOperations();
        CancellationTransferOfPhoneLines();
        ReplacingRentalUnit();
        Browser.waitForSeconds(1);
        Browser.click(AddSubleaseContractPageObjects.termConditionBTN_Next());
        Browser.waitForSeconds(1);
    }


    public void clickAddAdditionalTermsAndConditions4() throws Exception {
        Browser.waitUntilVisibilityOfElement(By.xpath("//app-term-question[@data-test-id='tenant_can_sublease']//span[@class='slider enable-transitions']"), 12);
        Browser.click(By.xpath("//app-term-question[@data-test-id='tenant_can_sublease']//span[@class='slider enable-transitions']"));
        Browser.click(By.xpath("//app-term-question[@data-test-id='residential_followup_with_authorities']//span[@class='slider enable-transitions']"));
        Browser.click(By.xpath("//app-term-question[@data-test-id='renovations_and_improvements_rental_unit']//span[@class='slider enable-transitions']"));
        Browser.click(By.xpath("//app-term-question[@data-test-id='modification_rental_unit']//span[@class='slider enable-transitions']"));
        Browser.click(By.xpath("//label[@class='form-check-label']//div[text()='الجهة القضائية المختصة في المملكة العربية السعودية']"));
        AdditionalTermsAndConditions();
    }


        public void addMutualRightsTerms() throws Exception {
            ResponsibleForPayingFees();
            ResponsibleForProvidingRequirementsForIssuingShopLicense();
            CommonObligations();
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.termConditionBTN_Next(),10);
            Browser.click(AddSubleaseContractPageObjects.termConditionBTN_Next());
        }

        public void ResponsibleForPayingFees(){
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.getOwnerOption2(),10);
            Browser.click(AddSubleaseContractPageObjects.getOwnerOption2());
        }

        public void ResponsibleForProvidingRequirementsForIssuingShopLicense(){
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.getOwnerOption3(),10);
            Browser.click(AddSubleaseContractPageObjects.getOwnerOption3());
            logger.addScreenshot("");
        }

        public void CommonObligations() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.validityRentalContractOnOwnerChange(),10);
            Browser.click(AddSubleaseContractPageObjects.validityRentalContractOnOwnerChange());
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.obligationToPayRemainingRentalValue(),10);
            Browser.click(AddSubleaseContractPageObjects.obligationToPayRemainingRentalValue());
            logger.addScreenshot("");
        }

        public void clickConfirmTermsAndConditions() throws Exception {
            Browser.executeJSScrollIntoView(AddSubleaseContractPageObjects.confirmAdditionalTermBut());
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.confirmAdditionalTermBut(),20);
            Browser.click(AddSubleaseContractPageObjects.confirmAdditionalTermBut());
        }
        public void clickContinueFinancialTermsBTN() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.continueFinancialTermsBTN(), 15);
            Browser.click(AddSubleaseContractPageObjects.continueFinancialTermsBTN());
            logger.addScreenshot("");
        }

        public void getContractOption1() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.getContractOption("عقد غير موحد"),35);
            Browser.click(AddSubleaseContractPageObjects.getContractOption("عقد غير موحد"));
            logger.addScreenshot("");
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.termConditionBTN_Next(),35);
            Browser.click(AddSubleaseContractPageObjects.termConditionBTN_Next());
        }

       public void getContractOption2() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.getContractOption("عقد غير موحد"),20);
        Browser.click(AddSubleaseContractPageObjects.getContractOption("عقد غير موحد"));
        logger.addScreenshot("");
        Browser.click(AddSubleaseContractPageObjects.termConditionBTN_Next());
        }

    public void clickTermsAndConditionsStepBTN() throws Exception {
        Browser.waitUntilElementToBeClickable(AddSubleaseContractPageObjects.termsAndConditionsStepBTN(), 60);
        Browser.click(AddSubleaseContractPageObjects.termsAndConditionsStepBTN());
    }

        public void clickAddTermsAndConditionsBTN() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.addTermsAndConditionsBTN(), 15);
            Browser.click(AddSubleaseContractPageObjects.addTermsAndConditionsBTN());
            Browser.takeScreenshot();
        }

        public void selectBrokerageOfficeAsEjarFeesPayer() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.ejarFeesPayerRadioBTN(), 15);
            Browser.click(AddSubleaseContractPageObjects.ejarFeesPayerRadioBTN());
            logger.addScreenshot("");
        }

        public void selectGoverningLaw() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.governingLawRadioBTN(), 15);
            Browser.click(AddSubleaseContractPageObjects.governingLawRadioBTN());
        }

        public void clickConfirmTermsAndConditionsBTN() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.confirmTermsAndConditionsBTN(), 15);
            Browser.click(AddSubleaseContractPageObjects.confirmTermsAndConditionsBTN());
            Browser.takeScreenshot();
        }

        public void clickSubmitForApprovalBTN() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.submitForApprovalBTN(), 35);
            Browser.click(AddSubleaseContractPageObjects.submitForApprovalBTN());
            Browser.waitForSeconds(1);
            logger.addScreenshot("");
            Browser.waitForSeconds(1);
        }

        public void clickContinueBtnOnPreviewContractPage() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.continueBtnOnPreviewContractPage(), 35);
            Browser.click(AddSubleaseContractPageObjects.continueBtnOnPreviewContractPage());
        }

        public void clickContinuePayBtnOnPreviewBrokerageAgreementPage() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.continuePayBtnOnPreviewBrokerageAgreementPage(), 35);
            Browser.click(AddSubleaseContractPageObjects.continuePayBtnOnPreviewBrokerageAgreementPage());
        }

        public void clickDisclaimerCheckboxOnPayingEjarFeesPage() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.disclaimerCheckboxOnPayingEjarFeesPage(), 35);
            Browser.click(AddSubleaseContractPageObjects.disclaimerCheckboxOnPayingEjarFeesPage());
            Browser.waitForSeconds(1);
            logger.addScreenshot("");
            Browser.waitForSeconds(1);
        }

        public void clickConfirmAndSubmitBtnOnPayingEjarFeesPage() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.confirmAndSubmitBtnOnPayingEjarFeesPage(), 35);
            Browser.click(AddSubleaseContractPageObjects.confirmAndSubmitBtnOnPayingEjarFeesPage());
            Browser.waitForSeconds(1);
            logger.addScreenshot("");
            Browser.waitForSeconds(1);
        }

        public void verifyContractStatusIsWaitingForApproval() throws Exception {
            Browser.waitForSeconds(1);
            Browser.executeJSScroll(450);
            Browser.waitForSeconds(2);
            String [] expectedStatus = {"بانتظار موافقة الأطراف", "Waiting Parties Approval"};
            boolean status = false;
            Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
            Browser.waitForSeconds(2);
            String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
            System.out.println("Contract status : " + actualStatus);
            if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])){
                status = true;
            }
            Assert.assertTrue(status);
            Browser.waitForSeconds(2);
            logger.addScreenshot("Contract Status :" + actualStatus);
        }

        public void clickCloseSurveyPopUpBTN() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.closeSurveyPopUpBTN(), 35);
            Browser.waitForSeconds(2);
            Browser.click(AddSubleaseContractPageObjects.closeSurveyPopUpBTN());
            Browser.waitForSeconds(1);
            logger.addScreenshot("");
            Browser.waitForSeconds(1);
        }

        public void clickConfirmBtnOnCloseSurveyPopUp() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.confirmBtnOnCloseSurveyPopUp(), 35);
            Browser.waitForSeconds(2);
            Browser.click(AddSubleaseContractPageObjects.confirmBtnOnCloseSurveyPopUp());
        }

        public String getContractNumber() throws Exception {
            Browser.waitForSeconds(2);
            String number = Browser.getWebElement(AddSubleaseContractPageObjects.contractNumber()).getText();
            String contractNumber = number.split("#")[1];
            return contractNumber;
        }

        public void clickFilterBtnOnViewAllContractsPage() throws Exception {
            Browser.waitForSeconds(3);
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.filterBtnOnViewAllContractsPage(), 20);
            Browser.click(AddSubleaseContractPageObjects.filterBtnOnViewAllContractsPage());
            logger.addScreenshot("");
        }

        public void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
            Browser.waitForSeconds(1);
            Browser.setText(AddSubleaseContractPageObjects.searchContractNumberInputField(), contractNumber);
            logger.addScreenshot("");
        }

        public void setContractNumberToContext(ITestContext context) throws Exception {
            String contractNumber = getContractNumber();
            context.setAttribute("Contract number", contractNumber);
        }

        public void clickContractNumberOnContractViewPage() throws Exception {
            Browser.executeJSScrollIntoView(AddSubleaseContractPageObjects.contractNumberTextOnViewContractsPage());
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.contractNumberTextOnViewContractsPage(), 20);
            Browser.waitForSeconds(2);
            Browser.click(AddSubleaseContractPageObjects.contractNumberTextOnViewContractsPage());
            logger.addScreenshot("");
        }

        public void clickApproveContractBTN() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.approveContractBTN(), 20);
            Browser.waitForSeconds(2);
            Browser.click(AddSubleaseContractPageObjects.approveContractBTN());
            Browser.takeScreenshot();
        }
        public void clickCharge() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNCharge(), 8);
            Browser.click(AddSubleaseContractPageObjects.BTNCharge());
        }
/*
        *//*
         * Contract Approval
         * *//*
        public void clickLetsStartBTN() throws Exception {
            Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.letsStartBTN(), 20);
            Browser.click(ContractsApprovalPageObjects.letsStartBTN());
            logger.addScreenshot("");
        }



        public void rechargeWallet() throws Exception{
            Browser.waitForSeconds(3);
            Browser.click(RechargeWalletPageObjects.enterAmount());
            Browser.setText(RechargeWalletPageObjects.enterAmount(),"1000");
            Browser.click(RechargeWalletPageObjects.clickNexxtButton());
            Browser.waitForSeconds(20);
            Browser.waitUntilVisibilityOfElement(RechargeWalletPageObjects.madaPayButton(),10);
            Browser.click(RechargeWalletPageObjects.madaPayButton());
            if(Browser.isElementPresent(RechargeWalletPageObjects.cardNumberButton())){
                Browser.waitForSeconds(14);
                driver.switchTo().frame("card.number");
                Browser.waitForSeconds(3);
                Browser.click(RechargeWalletPageObjects.cardNumberButton());
                Browser.setText(RechargeWalletPageObjects.cardNumberButton(),"4464040000000007");
                driver.switchTo().defaultContent();
                Browser.click(RechargeWalletPageObjects.expiryDateButton());
                Browser.setText(RechargeWalletPageObjects.expiryDateButton(),"07/29");
                Browser.waitForSeconds(2);
                Browser.click(RechargeWalletPageObjects.cardNameButton());
                Browser.setText(RechargeWalletPageObjects.cardNameButton(),"test");
                Browser.waitForSeconds(2);
                driver.switchTo().frame("card.cvv");
                Browser.click(RechargeWalletPageObjects.enterCardCVV());
                Browser.waitForSeconds(2);
                Browser.setText(RechargeWalletPageObjects.enterCardCVV(),"100");
                driver.switchTo().defaultContent();
                Browser.click(RechargeWalletPageObjects.clickPayButton());
                Browser.waitForSeconds(2);
                Actions actions = new Actions(driver);
                actions.sendKeys(Keys.TAB).perform();
                Browser.waitForSeconds(2);
                actions.sendKeys(Keys.TAB).perform();
                Browser.waitForSeconds(2);
                actions.sendKeys(Keys.ENTER).perform();
                Browser.waitForSeconds(2);
                Browser.isElementPresent(RechargeWalletPageObjects.rechargeWalletMessage());
                Browser.waitForSeconds(3);
                Browser.click(RechargeWalletPageObjects.closePopUpButton());
                Browser.takeScreenshot();
            }
        }

        public void clickConfirmBTN() throws Exception {
            Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.confirmBTN(), 20);
            Browser.executeJSScrollIntoView(ContractsApprovalPageObjects.confirmBTN());
            Browser.waitForSeconds(2);
            Browser.click(ContractsApprovalPageObjects.confirmBTN());
            //Handle the dynamic requirement of double-click on Confirm BTN
            if (!Browser.isElementPresent(ContractsApprovalPageObjects.agreementCheckbox())) {
                Browser.waitForSeconds(2);
                Browser.click(ContractsApprovalPageObjects.confirmBTN());
            }
            logger.addScreenshot("");
        }

        public void clickOnAgreementCheckbox() throws Exception {
            Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.agreementCheckbox(), 20);
            Browser.click(ContractsApprovalPageObjects.agreementCheckbox());
            logger.addScreenshot("");
        }

        public void clickSubmitContractApprovalBTN() throws Exception {
            Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.submitContractApprovalBTN(), 20);
            Browser.click(ContractsApprovalPageObjects.submitContractApprovalBTN());
            logger.addScreenshot("");
        }

        public void enterOTPForApproval(String otp) throws Exception {
            Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.OTPButton(), 20);
            Browser.setText(ContractsApprovalPageObjects.OTPButton(), otp);
            logger.addScreenshot("");
        }

        public void clickVerifyIdentityBTN() throws Exception {
            Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.verifyIdentityBTN(), 20);
            Browser.click(ContractsApprovalPageObjects.verifyIdentityBTN());
            logger.addScreenshot("");
            Browser.waitForSeconds(13);
        }

        public void verifyApprovalIsSubmitted() throws Exception {
            Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.approvalSubmittedText(), 45);
            Browser.waitForSeconds(1);
            logger.addScreenshot("");
            Browser.waitForSeconds(1);
            Assert.assertTrue(Browser.isElementPresent(ContractsApprovalPageObjects.approvalSubmittedText()));
        }

    public void verifyContractStatusIsActivated() throws Exception {
        Browser.waitForSeconds(3);
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(3);
        boolean status = false;
        String [] expectedStatus = {"Active", "نشط"};
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        Browser.waitForSeconds(2);
        String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
        Browser.executeJSScroll(1000);
        System.out.println("Contract status : " + actualStatus);
        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])){
            status = true;
        }
        Assert.assertTrue(status);
        Browser.waitForSeconds(2);
        logger.addScreenshot("Contract Status :" + actualStatus);
    }

        public void verifyContractStatusIsRegistered() throws Exception {
            Browser.waitForSeconds(1);
            Browser.executeJSScroll(450);
            Browser.waitForSeconds(2);
            String[] expectedStatus = {"Registered", "مُسجل"};
            boolean status = false;
            Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
            Browser.waitForSeconds(2);
            String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
            System.out.println("Contract status : " + actualStatus);
            if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])) {
                status = true;
            }
            Assert.assertTrue(status);
            Browser.waitForSeconds(2);
            logger.addScreenshot("Contract Status :" + actualStatus);
        }

        public void clickCloseBtnOnPopUp() throws Exception {
            Browser.waitForSeconds(3);
            if (Browser.isElementPresent(ContractsApprovalPageObjects.closeBtnOnPopUp())) {
                Browser.click(ContractsApprovalPageObjects.closeBtnOnPopUp());
            }
        }*/
    }