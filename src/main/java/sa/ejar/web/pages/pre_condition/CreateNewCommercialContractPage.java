package sa.ejar.web.pages.pre_condition;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import sa.ejar.web.objects.pre_condition.*;

import java.util.List;

import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.logger;

public class CreateNewCommercialContractPage {

    public void closeConfirmTaxPopUp() {
        if (Browser.isElementPresent(By.xpath("//button[text()=' تأكيد ']"))) {
            Browser.waitUntilVisibilityOfElement(By.xpath("//button[text()=' تأكيد ']"), 20);
            Browser.click(By.xpath("//button[text()=' تأكيد ']"));
        }
    }

    public void scrollUpToContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.contractButtonArrow(), 20);
        Browser.executeJSScrollIntoView(AddCommercialContractObjects.contractButtonArrow());
    }

    public void clickOnContractsBtn() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.contractButtonArrow(), 20);
        Browser.click(AddCommercialContractObjects.contractButtonArrow());
    }

    public void selectNewCommercialContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.optionCreateNewContract(), 15);
        Browser.click(AddCommercialContractObjects.optionCreateNewContract());
    }

    public void verifyAddCommercialContractPageIsVisible() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.addCommercialContractDashboard(), 15);
        Assert.assertTrue(Browser.isElementPresent(AddCommercialContractObjects.addCommercialContractDashboard()), "Add Residential Contract dashboard is not visible");
    }



    public void clickDateInputField() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.clickDateInputField(), 15);
        Browser.click(AddCommercialContractObjects.clickDateInputField());
    }

    public void selectStartDateOfResidualContract(String day, String month, String year) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.clickContractStartYear(), 5);
        Browser.click(AddCommercialContractObjects.clickContractStartYear());
        List<WebElement> listYear = driver.findElements(AddCommercialContractObjects.selectContractStartYear());
        for (WebElement y : listYear) {
            String getYear = y.getText();
            if (getYear.equalsIgnoreCase(year)) {
                y.click();
                break;
            }
        }

        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.clickContractStartMonth(), 5);
        Browser.click(AddCommercialContractObjects.clickContractStartMonth());
        List<WebElement> listMonth = driver.findElements(AddCommercialContractObjects.selectContractStartMonth());
        for (WebElement m : listMonth) {
            String getMonth = m.getText();
            if (getMonth.equalsIgnoreCase(month)) {
                m.click();
                break;
            }
        }

        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.selectContractStartDay(), 10);
        List<WebElement> listDay = driver.findElements(AddCommercialContractObjects.selectContractStartDay());
        for (WebElement d : listDay) {
            String getMonth = d.getText();
            if (getMonth.equalsIgnoreCase(day)) {
                d.click();
                break;
            }
        }
    }

    public void selectEndDateOfResidualContract(String day, String month, String year) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.clickContractEndYear(), 5);
        Browser.click(AddCommercialContractObjects.clickContractEndYear());
        List<WebElement> listYear = driver.findElements(AddCommercialContractObjects.selectContractEndYear());
        for (WebElement y : listYear) {
            String getYear = y.getText();
            if (getYear.equalsIgnoreCase(year)) {
                y.click();
                break;
            }
        }

        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.clickContractEndMonth(), 5);
        Browser.click(AddCommercialContractObjects.clickContractEndMonth());
        List<WebElement> listMonth = driver.findElements(AddCommercialContractObjects.selectContractEndMonth());
        for (WebElement m : listMonth) {
            String getMonth = m.getText();
            if (getMonth.equalsIgnoreCase(month)) {
                m.click();
                break;
            }
        }
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.selectContractEndDay(), 5);
        List<WebElement> listDay = driver.findElements(AddCommercialContractObjects.selectContractEndDay());
        for (WebElement d : listDay) {
            String getDay = d.getText();
            if (getDay.equalsIgnoreCase(day)) {
                d.click();
                break;
            }
        }
    }

    public void clickConfirmPeriodBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmPeriodBTN(), 35);
        Browser.click(AddCommercialContractObjects.confirmPeriodBTN());
    }

    public void clickAddPropertyBTN() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 20);
        Browser.waitUntilElementToBeClickable(AddCommercialContractObjects.coveredPropertyUnitsBTN(),40);
        Browser.click(AddCommercialContractObjects.coveredPropertyUnitsBTN());
        Browser.waitUntilElementToBeClickable(AddCommercialContractObjects.addPropertyBTN(), 40);
        Browser.click(AddCommercialContractObjects.addPropertyBTN());
    }

    public void selectProperty(String propertyName) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.propertyName(), 40);
        List<WebElement> listPropertyNames = driver.findElements(AddCommercialContractObjects.propertyName());
        for (WebElement property : listPropertyNames) {
            String getPropertyName = property.getText();
            if (getPropertyName.contains(propertyName)) {
                property.click();
                break;
            }
        }
        logger.addScreenshot("select Property");
    }

    public void clickContinueWithThisPropertyBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.continueWithThisPropertyBTN(), 45);
        Browser.click(AddCommercialContractObjects.continueWithThisPropertyBTN());
    }

    public void clickContinueToSelectUnitsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.continueToSelectUnitsBTN(), 50);
        Browser.click(AddCommercialContractObjects.continueToSelectUnitsBTN());
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.filterBtnOnSelectUnitsPage(), 30);
    }

    public void clickFilterBtnOnSelectUnitPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.filterBtnOnSelectUnitsPage(), 10);
        Browser.click(AddCommercialContractObjects.filterBtnOnSelectUnitsPage());
    }

    public void selectUnitsAvailability() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.selectUnitsAvailability(), 10);
        Browser.selectDropdownByIndex(AddCommercialContractObjects.selectUnitsAvailability(), 1);
    }

    public void selectTargetUnit() {
        while (!(Browser.isElementPresent(By.xpath("//h5[text()=' وحدة# 1223-22 ']//span[@class='ms-2 badge success']")))) {
            Browser.click(By.xpath("(//button[@class='btn btn-sm btn-outline-primary icon-container'])[2]"));
        }
        Browser.click(By.xpath("//h5[text()=' وحدة# 1223-22 ']//span[@class='ms-2 badge success']"));
    }


    public void selectFirstAvailableUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.selectFirstAvailableUnit(), 10);
        Browser.click(AddCommercialContractObjects.selectFirstAvailableUnit());
    }

    public void selectUnit(String inputUnit) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.selectUnit(), 10);
        List<WebElement> listUnits = driver.findElements(AddCommercialContractObjects.selectUnit());
        for (WebElement unit : listUnits){
            String getUnitNum= unit.getText();
            System.out.println("unit number is " + getUnitNum);
            if (getUnitNum.contains(inputUnit)){
                unit.click();
                break;
            }
        }
    }
    public void clickConfirmPropertyDetailsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmPropertyDetailsBTN(), 5);
        Browser.click(AddCommercialContractObjects.confirmPropertyDetailsBTN());
    }
    public void confirmAdditionalDetailsBTN() throws Exception {
        if (Browser.isElementPresent(AddCommercialContractObjects.confirmAdditionalDetailsBTN())) {
            Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmAdditionalDetailsBTN(), 50);
            Browser.click(AddCommercialContractObjects.confirmAdditionalDetailsBTN());
        }
    }
    public void clickIdentifyAddressOnMapBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.identifyAddressOnMapBTN(), 15);
        Browser.click(AddCommercialContractObjects.identifyAddressOnMapBTN());
    }

    public void clickConfirmBtnOnMap() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmBtnOnMap(), 25);
        Browser.click(AddCommercialContractObjects.confirmBtnOnMap());
    }

    public void clickSaveBtnOnPropertyAddress() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.saveBtnOnPropertyAddress(), 5);
        Browser.click(AddCommercialContractObjects.saveBtnOnPropertyAddress());

    }
    public void clickContractPartiesBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.contractPartiesStepBTN(), 30);
        Browser.click(AddCommercialContractObjects.contractPartiesStepBTN());
    }

    public void clickAddIndividualTenantBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.addIndividualTenantBTN(), 5);
        Browser.click(AddCommercialContractObjects.addIndividualTenantBTN());
    }

    public void clickTenantRadioBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.tenantRadioBTN(), 5);
        Browser.click(AddCommercialContractObjects.tenantRadioBTN());
    }

    public void inputTenantNationalId(String nationalId) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.tenantNationalIdInput(), 5);
        Browser.setText(AddCommercialContractObjects.tenantNationalIdInput(), nationalId);
    }

    public void inputTenantDOB(String DOB) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.tenantDateOfBirthInput(), 5);
        Browser.setText(AddCommercialContractObjects.tenantDateOfBirthInput(), DOB);
        logger.addScreenshot("Enter Tenant ID");

    }
    public void clickContinueButtonOnTenantContractPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.continueBtnOnIndividualContractPage(), 5);
        Browser.click(AddCommercialContractObjects.continueBtnOnIndividualContractPage());
    }

    public void inputTenantPhoneNumber(String phoneNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.tenantPhoneNumberInput(), 5);
        Browser.setText(AddCommercialContractObjects.tenantPhoneNumberInput(), phoneNumber);
    }

    public void selectTenantRegion() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.tenantRegionDropdown(), 5);
        Browser.click(AddCommercialContractObjects.tenantRegionDropdown());
        Browser.selectDropdownByIndex(AddCommercialContractObjects.tenantRegionDropdown(), 1);
        Browser.click(AddCommercialContractObjects.tenantRegionDropdown());
    }
    public void clickTenantCityDropdown() throws Exception {
        Browser.executeJSScroll(300);
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.tenantCityDropdown(), 5);
        Browser.click(AddCommercialContractObjects.tenantCityDropdown());
    }
    public void selectTenantCity(String city) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.selectTenantCity(), 5);
        List<WebElement> listCity = driver.findElements(AddCommercialContractObjects.selectTenantCity());
        for (WebElement cityName : listCity){
            String getCityName = cityName.getText();
            if (getCityName.contains(city)){
                cityName.click();
                break;
            }
        }
    }
    public void clickConfirmBtnOnTenantAddressPage() throws Exception {
        Browser.setText(AddCommercialContractObjects.streetName(),"Olaya");
        Browser.setText(AddCommercialContractObjects.buildingNumber(),"12332");
        Browser.setText(AddCommercialContractObjects.additionalNumber(),"44432");
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmBtnOnTenantAddressPage(), 15);
        Browser.click(AddCommercialContractObjects.confirmBtnOnTenantAddressPage());
    }

    public void clickFinancialTermsStepBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.financialTermsStepBTN(), 40);
        Browser.click(AddCommercialContractObjects.financialTermsStepBTN());
    }

    public void clickAddRentalContractTermsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.addRentalContractTermsBTN(), 50);
        Browser.click(AddCommercialContractObjects.addRentalContractTermsBTN());
    }

    public void enterAnnulRent(String rent) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.annualRentInputField(), 15);
        Browser.setText(AddCommercialContractObjects.annualRentInputField(), rent);
    }
    public void clickSinglePaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.singlePaymentRadioBTN(), 15);
        Browser.click(AddCommercialContractObjects.singlePaymentRadioBTN());
    }

    public void clickMonthlyPaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.paymentFrequency(), 15);
        Browser.click(AddCommercialContractObjects.paymentFrequency());
    }

    public void clickQuarterlyPaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.paymentFrequency(), 15);
        Browser.click(AddCommercialContractObjects.paymentFrequency());
        Browser.click(By.xpath("//label[@class='form-check-label']//div[text()=' ربعي ']"));
    }

    public void clickSixMonthPaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.paymentFrequency(), 15);
        Browser.click(AddCommercialContractObjects.paymentFrequency());
        Browser.click(By.xpath("//label[@class='form-check-label']//div[text()=' نصف سنوى ']"));
    }
    public void clickYearlyPaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.paymentFrequency(), 15);
        Browser.click(AddCommercialContractObjects.paymentFrequency());
        Browser.click(By.xpath("//label[@class='form-check-label']//div[text()=' سنوي ']"));
    }

    public void clickFlexiblePaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.flexiblePaymentFrequency(), 15);
        Browser.click(AddCommercialContractObjects.flexiblePaymentFrequency());
    }

    public void verifyContractStatusIsRegistered() throws Exception {
        Browser.executeJSScroll(450);
        String [] expectedStatus = {"Registered", "مُسجل"};
        boolean status = false;
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])){
            status = true;
        }
        Assert.assertTrue(status);
        logger.addScreenshot("Contract Status :" + actualStatus);
    }

    public void clickConfirmPaymentScheduleBTN() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.continueToBillingScheduleBTN(),20);
            Browser.click(AddCommercialContractObjects.continueToBillingScheduleBTN());
    }

    public void clickPayOnlineBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.payOnlineBTN(), 25);
        Browser.click(AddCommercialContractObjects.payOnlineBTN());
    }

    public void clickPayOnlineAndThroughBOOrLessorBTN()  {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'الدفع الالكتروني او اصدار سند القبض')]"), 25);
        Browser.click(By.xpath("//label[contains(text(),'الدفع الالكتروني او اصدار سند القبض')]"));
    }

    public void addNewIbanBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.addNewIbanBTN(), 15);
        Browser.click(AddCommercialContractObjects.addNewIbanBTN());
    }

    public void enterIbanNumber(String ibanNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.ibanNumberInputField(), 15);
        Browser.setText(AddCommercialContractObjects.ibanNumberInputField(), ibanNumber);
    }

    public void enterAccountOwnerName(String ownerName) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.accountOwnerNameInputField(), 15);
        Browser.setText(AddCommercialContractObjects.accountOwnerNameInputField(), ownerName);
    }

    public void clickSaveBTNOnAddIban() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.saveBTNonAddNewIban(), 15);
        Browser.click(AddCommercialContractObjects.saveBTNonAddNewIban());
    }

    public void selectIbanFromDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.selectIbanDropdown(), 15);
        Browser.click(AddCommercialContractObjects.selectIbanDropdown());
        Browser.selectDropdownByIndex(AddCommercialContractObjects.selectIbanDropdown(), 1);
    }

    public void selectLessorRadioBtnForAccountOwner() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.ibanAccountOwnerRadioBTN(), 15);
        Browser.click(AddCommercialContractObjects.ibanAccountOwnerRadioBTN());
        Browser.click(AddCommercialContractObjects.continueToOwnerInfo());
    }

    public void clickContinueFinancialTermsBTN(String status, String amount) throws Exception {
        if (status.equalsIgnoreCase("yes")){
            new AddResidentialContractPage().enableSecurityDeposit(amount);

        }
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.continueFinancialTermsBTN(), 15);
        Browser.click(AddCommercialContractObjects.continueFinancialTermsBTN());
    }

    public void clickAddTermsAndConditionsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.addTermsAndConditionsBTN(), 35);
        Browser.waitUntilElementToBeClickable(AddCommercialContractObjects.addTermsAndConditionsBTN(), 35);
        Browser.click(AddCommercialContractObjects.addTermsAndConditionsBTN());
    }

    public void selectGoverningLaw() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.governingLawRadioBTN(), 15);
        Browser.click(AddCommercialContractObjects.governingLawRadioBTN());
    }

    public void clickConfirmTermsAndConditionsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmTermsAndConditionsBTN(), 15);
        Browser.click(AddCommercialContractObjects.confirmTermsAndConditionsBTN());
    }

    public void clickSubmitForApprovalBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.submitForApprovalBTN(), 35);
        Browser.click(AddCommercialContractObjects.submitForApprovalBTN());
        logger.addScreenshot("");

    }

    public void submitContractLater() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.contractNumberTXT(),30);
        String number = Browser.getWebElement(AddCommercialContractObjects.contractNumberTXT()).getText();
        String contractNumber = number.split("#")[1];
        Browser.click(AddCommercialContractObjects.saveContractAsDraft());
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.filterBtnOnViewAllContractsPage(), 20);
        Browser.click(AddCommercialContractObjects.filterBtnOnViewAllContractsPage());
        Browser.setText(AddCommercialContractObjects.searchContractNumberInputField(), contractNumber);
        Browser.executeJSScroll(400);
        String Status = Browser.getWebElement(AddCommercialContractObjects.getDraftContractStatus()).getText();
        Assert.assertTrue(Status.contains("مسودة"));
    }
    public void deleteSubmitContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.contractDeleteButton(),40);
        Browser.executeJSScrollIntoView(AddCommercialContractObjects.contractDeleteButton());
        String number = Browser.getWebElement(AddCommercialContractObjects.contractNumberTXT()).getText();
        String contractNumber = number.split("#")[1];
        Browser.click(AddCommercialContractObjects.contractDeleteButton());
        Browser.click(AddCommercialContractObjects.confirmDeleteButton());
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.contractButton(), 10);
        Browser.click(AddCommercialContractObjects.contractButton());
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.viewAllContractsButton(), 20);
        Browser.click(AddCommercialContractObjects.viewAllContractsButton());
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.filterBtnOnViewAllContractsPage(), 20);
        Browser.click(AddCommercialContractObjects.filterBtnOnViewAllContractsPage());
        Browser.setText(AddCommercialContractObjects.searchContractNumberInputField(), contractNumber);
        Browser.executeJSScroll(400);
        String Status = Browser.getWebElement(AddCommercialContractObjects.contractNotFound()).getText();
        Assert.assertTrue(Status.contains("لم يتم العثور على عقود!"));
    }

    public void clickContinueBtnOnPreviewContractPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.continueBtnOnPreviewContractPage(), 40);
        Browser.click(AddCommercialContractObjects.continueBtnOnPreviewContractPage());
        logger.addScreenshot("");
    }

    public void clickContinuePayBtnOnPreviewBrokerageAgreementPage() throws Exception {
        if (Browser.isElementPresent(AddCommercialContractObjects.continuePayBtnOnPreviewBrokerageAgreementPage())) {
            Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.continuePayBtnOnPreviewBrokerageAgreementPage(), 35);
            Browser.click(AddCommercialContractObjects.continuePayBtnOnPreviewBrokerageAgreementPage());
        }
    }

    public void clickDisclaimerCheckboxOnPayingEjarFeesPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.disclaimerCheckboxOnPayingEjarFeesPage(), 35);
        Browser.click(AddCommercialContractObjects.disclaimerCheckboxOnPayingEjarFeesPage());
    }

    public void clickConfirmAndSubmitBtnOnPayingEjarFeesPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmAndSubmitBtnOnPayingEjarFeesPage(), 50);
        Browser.click(AddCommercialContractObjects.confirmAndSubmitBtnOnPayingEjarFeesPage());
        logger.addScreenshot("");
    }

    public void verifyContractStatus() throws Exception {
        Browser.executeJSScroll(400);
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.contractStatus(), 35);
        String status = Browser.getWebElement(AddCommercialContractObjects.contractStatus()).getText();
        if (status.contains("Waiting Parties Approval")){
            Assert.assertTrue(true);
        }
        else {
            Assert.assertFalse(false);
        }
        logger.addScreenshot("");
    }

    public void clickCloseSurveyPopUpBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.closeSurveyPopUpBTN(), 35);
        Browser.click(AddCommercialContractObjects.closeSurveyPopUpBTN());
    }

    public void AssessmentSubmitContractSurveyPopUp() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.assessmentButton(), 80);
        Browser.click(AddCommercialContractObjects.assessment1());
        Browser.click(AddCommercialContractObjects.assessment2());
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.assessmentSendButton(), 10);
        Browser.click(AddCommercialContractObjects.assessmentSendButton());
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmAssessmentSendMessage(),20);
        if (Browser.isElementPresent(AddCommercialContractObjects.confirmAssessmentSendMessage())) {
            Browser.click(AddCommercialContractObjects.closeSurvey());
        }
    }
    public void AssessmentSurveyPopUp() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.assessmentButton(), 60);
        Browser.click(AddCommercialContractObjects.assessment1());
        Browser.click(AddCommercialContractObjects.assessment2());
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.assessmentSendButton(), 60);
        Browser.click(AddCommercialContractObjects.assessmentSendButton());
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmAssessmentSendMessage(),60);
        if (Browser.isElementPresent(AddCommercialContractObjects.confirmAssessmentSendMessage())) {
            Browser.click(AddCommercialContractObjects.closeSurvey());
        }
        if(Browser.isElementPresent(By.xpath("//p[text()='نموذج استلام/تسليم الوحدة']"))){
            Browser.click(By.xpath("//label[text()=' نعم، بحالة جيدة ']"));
            Browser.click(By.xpath("//button[text()=' إرسال ']"));
        }
        Assert.assertTrue(Browser.isElementPresent(By.xpath("//h2[text()='تمت الموافقة']")));
    }


    public void AssessmentSurveyPopUp2() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.assessmentButton(), 60);
        Browser.click(AddCommercialContractObjects.assessment1());
        Browser.click(By.xpath("(//label[@class='form-check-label'])[1]"));
        Browser.click(AddCommercialContractObjects.assessment2());
        Browser.click(By.xpath("(//label[@class='form-check-label'])[3]"));
        Browser.click(By.xpath("(//div[@class='rating'])[9]"));
        Browser.click(By.xpath("(//div[@class='rating'])[13]"));
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.assessmentSendButton(), 60);
        Browser.click(AddCommercialContractObjects.assessmentSendButton());
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmAssessmentSendMessage(),60);
        if (Browser.isElementPresent(AddCommercialContractObjects.confirmAssessmentSendMessage())) {
            Browser.click(AddCommercialContractObjects.closeSurvey());
        }
        if(Browser.isElementPresent(By.xpath("//p[text()='نموذج استلام/تسليم الوحدة']"))){
            Browser.click(By.xpath("//label[text()=' نعم، بحالة جيدة ']"));
            Browser.click(By.xpath("//button[text()=' إرسال ']"));
        }
        Assert.assertTrue(Browser.isElementPresent(By.xpath("//h2[text()='تمت الموافقة']")));
    }

    public void clickConfirmBtnOnCloseSurveyPopUp() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmBtnOnCloseSurveyPopUp(), 35);
        Browser.click(AddCommercialContractObjects.confirmBtnOnCloseSurveyPopUp());
    }

    public String getContractNumber() throws Exception {
        String number = Browser.getWebElement(AddCommercialContractObjects.contractNumber()).getText();
        return number.split("#")[1];
    }
    public void clickFilterBtnOnViewAllContractsPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.filterBtnOnViewAllContractsPage(), 20);
        Browser.click(AddCommercialContractObjects.filterBtnOnViewAllContractsPage());
    }

    public void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
        Browser.setText(AddCommercialContractObjects.searchContractNumberInputField(), contractNumber);
    }

    public void verifyContractStatusIsActivated() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 60);
        Browser.executeJSScroll(450);
        boolean status = false;
        String [] expectedStatus = {"Active", "نشط"};
        String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
        Browser.executeJSScroll(1000);
        System.out.println("Contract status : " + actualStatus);
        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])){
            status = true;
        }
        Assert.assertTrue(status);
        logger.addScreenshot("Contract Status :" + actualStatus);
    }

    public void setResidentialContractFields(ITestContext context) throws Exception{
        String contractNumber= getContractNumber();
        context.setAttribute("Contract number",contractNumber);
        //System.out.println(context.getAttribute("Contract number"));
    }
    public void addLessorFacilities() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.addLessorFacility(),10);
        Browser.click(AddResidentialContract2PageObjects.addLessorFacility());
        Browser.click(AddResidentialContract2PageObjects.lessorFacilityWifeIDLabel());
        Browser.click(AddResidentialContract2PageObjects.nationalIDRegistrationLabel());
        Browser.setText(AddResidentialContractPageObjects.tenantNationalIdInput(),"1079565430");
        Browser.setText(AddResidentialContractPageObjects.tenantDateOfBirthInput(),"14130323");
        Browser.click(AddPropertyPageObjects.getButtonContinue());
    }

    public void inputTenantPhoneNumberAndEmail(String phoneNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantPhoneNumberInput(), 5);
        Browser.setText(AddResidentialContractPageObjects.tenantPhoneNumberInput(), phoneNumber);
        Browser.setText(AddResidentialContractPageObjects.emailInput(),"Test@test.com");
    }

    public void verifyContractStatusIsWaitingForApproval() throws Exception {
        Browser.executeJSScroll(450);
        String [] expectedStatus = {"بانتظار موافقة الأطراف", "Waiting Parties Approval"};
        boolean status = false;
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
        System.out.println("Contract status : " + actualStatus);
        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])){
            status = true;
        }
        Assert.assertTrue(status);
        logger.addScreenshot("Contract Status :" + actualStatus);
    }

    public void clickThreeDotsOnContractBesideStatus() throws Exception {
        Browser.executeJSScroll(200);
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.threeDotsBesideContractStatus(), 45);
        Browser.click(AddCommercialContractObjects.threeDotsBesideContractStatus());
    }

    public void selectApproveContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.approvedContract(),45);
        Browser.click(AddCommercialContractObjects.approvedContract());
    }

    public void ClickLetsStartBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.letsStartBTN(), 45);
        Browser.click(AddCommercialContractObjects.letsStartBTN());
    }

    public void clickConfirmBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmBTN(),45);
        Browser.executeJSScrollIntoView(AddCommercialContractObjects.confirmBTN());
        Browser.click(AddCommercialContractObjects.confirmBTN());
        if(Browser.isElementPresent(AddCommercialContractObjects.confirmBTN())) {
            Browser.executeJSScrollIntoView(AddCommercialContractObjects.confirmBTN());
            Browser.click(AddCommercialContractObjects.confirmBTN());
        }
    }

    public void clickOnAgreementCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.agreementCheckbox(), 45);
        Browser.click(AddCommercialContractObjects.agreementCheckbox());
    }
    public void clickSubmitContractApprovalBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.submitContractApprovalBTN(), 45);
        Browser.click(AddCommercialContractObjects.submitContractApprovalBTN());
    }

    public void enterOTPForApproval(String otp) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.OTPButton(), 45);
        Browser.setText(AddCommercialContractObjects.OTPButton(), otp);
    }

    public void clickVerifyIdentityBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.verifyIdentityBTN(), 45);
        Browser.click(AddCommercialContractObjects.verifyIdentityBTN());
    }

    public void verifyApprovalIsSubmitted() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.approvalSubmittedText(), 45);
        Assert.assertTrue(Browser.isElementPresent(AddCommercialContractObjects.approvalSubmittedText()));
    }
    public void clickContractsBtn() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.contractButton(), 35);
        Browser.click(AddCommercialContractObjects.contractButton());
    }
    public void selectViewAllContractsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.viewAllContractsButton(), 20);
        Browser.click(AddCommercialContractObjects.viewAllContractsButton());
    }

    public void clickOnSameTermRadioButton() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.confirmPeriodBTN(), 20);
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.SameTermRadioButton(), 20);
        Browser.click(AddCommercialContractObjects.SameTermRadioButton());
    }

    public void enterNoticePeriod(String period) {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.NoticePeriodInput(), 20);
        Browser.executeJSScrollIntoView(AddCommercialContractObjects.NoticePeriodInput());
        Browser.setText(AddCommercialContractObjects.NoticePeriodInput(), period);
    }
}