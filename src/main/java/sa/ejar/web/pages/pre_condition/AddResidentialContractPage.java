package sa.ejar.web.pages.pre_condition;

import com.testcrew.web.Browser;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import sa.ejar.web.objects.ChangeLessor_LessorRepPageObjects;
import sa.ejar.web.objects.pre_condition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.pre_condition.LoginPageObjects;
import sa.ejar.web.pages.*;

import java.util.List;


public class AddResidentialContractPage {

    /**
     * Click date input field
     */
    public void clickDateInputField() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.clickDateInputField(), 5);
        Browser.click(AddResidentialContractPageObjects.clickDateInputField());
    }

    /**
     * Click on Contracts Button
     */
    public void clickContractsBtn() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 60);
        if (Browser.isElementPresent(LoginPageObjects.assessementUnitpopup())) {
            Browser.click(LoginPageObjects.assessementUnitpopup());
        }
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.contractButton(), 60);
        Browser.click(LoginPageObjects.contractButton());
    }

    public void selectViewAllContractsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.viewAllContractsButton(), 20);
        Browser.click(LoginPageObjects.viewAllContractsButton());
        Browser.waitForSeconds(1);
    }

    /**
     * Select New Residential Contract
     */
    public void selectNewResidualContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.optionCreateNewContract(), 45);
        Browser.click(LoginPageObjects.optionCreateNewContract());
    }

    /**
     * Select Start date of contract
     */
    public void selectEndDateOfResidualContract(String day, String month, String year) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.clickContractEndYear(), 20);
        Browser.click(AddResidentialContractPageObjects.clickContractEndYear());


        //Select year
        List<WebElement> listYear = Browser.driver.findElements(AddResidentialContractPageObjects.selectContractEndYear());
        for (WebElement y : listYear) {
            String getYear = y.getText();
            if (getYear.equalsIgnoreCase(year)) {
                y.click();
                break;
            }
        }

        //Select month
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.clickContractEndMonth(), 20);
        Browser.click(AddResidentialContractPageObjects.clickContractEndMonth());
        List<WebElement> listMonth = Browser.driver.findElements(AddResidentialContractPageObjects.selectContractEndMonth());
        String[] monthArray = month.split(" ");
        for (WebElement m : listMonth) {
            String getMonth = m.getText();
            if (getMonth.equalsIgnoreCase(monthArray[0]) || getMonth.equalsIgnoreCase(monthArray[1])) {
                m.click();
                break;
            }
        }

        //Select day
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectContractEndDay(), 20);
        List<WebElement> listDay = Browser.driver.findElements(AddResidentialContractPageObjects.selectContractEndDay());
        for (WebElement d : listDay) {
            String getDay = d.getText();
            if (getDay.equalsIgnoreCase(day)) {
                d.click();
                break;
            }
        }
    }

    public String getCurrentMonth(String monthNum) {
        String month = "";
        //replace 0 with null starting from the beginning(^) of the string
        monthNum = monthNum.replaceFirst("^0*", "");
        month = switch (monthNum) {
            case "1" -> "January يناير";
            case "2" -> "February فبراير";
            case "3" -> "March مارس";
            case "4" -> "April أبريل";
            case "5" -> "May مايو";
            case "6" -> "June يونيو";
            case "7" -> "July يوليو";
            case "8" -> "August أغسطس";
            case "9" -> "September سبتمبر";
            case "10" -> "October أكتوبر";
            case "11" -> "November نوفمبر";
            case "12" -> "December ديسمبر";
            default -> month;
        };
        return month;
    }

    /**
     * Select End date of contract
     */
    public void selectStartDateOfResidualContract(String day, String month, String year) throws Exception {

        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.clickContractStartYear(), 20);
        Browser.click(AddResidentialContractPageObjects.clickContractStartYear());

        //Select year
        List<WebElement> listYear = Browser.driver.findElements(AddResidentialContractPageObjects.selectContractStartYear());
        for (WebElement y : listYear) {
            String getYear = y.getText();
            if (getYear.equalsIgnoreCase(year)) {
                y.click();
                break;
            }
        }

        //Select month
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.clickContractStartMonth(), 20);
        Browser.click(AddResidentialContractPageObjects.clickContractStartMonth());
        String[] monthArray = month.split(" ");
        List<WebElement> listMonth = Browser.driver.findElements(AddResidentialContractPageObjects.selectContractStartMonth());
        for (WebElement m : listMonth) {
            String getMonth = m.getText();
            if (getMonth.equalsIgnoreCase(monthArray[0]) || getMonth.equalsIgnoreCase(monthArray[1])) {
                m.click();
                break;
            }
        }

        //Select day
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectContractStartDay(), 20);
        List<WebElement> listDay = Browser.driver.findElements(AddResidentialContractPageObjects.selectContractStartDay());
        for (WebElement d : listDay) {
            String getMonth = d.getText();
            if (getMonth.equalsIgnoreCase(day)) {
                d.click();
                break;
            }
        }
    }

    public void clickConfirmPeriodBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmPeriodBTN(), 30);
        Browser.click(AddResidentialContractPageObjects.confirmPeriodBTN());
    }

    public void clickAddPropertyBTN() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.confirmPeriodBTN(), 30);
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.coveredPropertyUnitsBTN(), 40);
        Browser.click(AddResidentialContractPageObjects.coveredPropertyUnitsBTN());
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addPropertyBTN(), 40);
        Browser.click(AddResidentialContractPageObjects.addPropertyBTN());
    }

    public void selectProperty(String propertyName) throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 30);
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.propertyName(), 30);
        List<WebElement> listPropertyNames = Browser.driver.findElements(AddResidentialContractPageObjects.propertyName());
        for (WebElement property : listPropertyNames) {
            String getPropertyName = property.getText();
            if (getPropertyName.contains(propertyName)) {
                property.click();
                break;
            }
        }
    }

    public void clickContinueWithThisPropertyBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueWithThisPropertyBTN(), 20);
        Browser.click(AddResidentialContractPageObjects.continueWithThisPropertyBTN());
    }

    public void clickContinueToSelectUnitsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueToSelectUnitsBTN(), 40);
        Browser.click(AddResidentialContractPageObjects.continueToSelectUnitsBTN());
    }

    public void clickFilterBtnOnSelectUnitPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.filterBtnOnSelectUnitsPage(), 20);
        Browser.click(AddResidentialContractPageObjects.filterBtnOnSelectUnitsPage());
    }

    public void selectUnitsAvailability() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectUnitsAvailability(), 20);
        Browser.selectDropdownByIndex(AddResidentialContractPageObjects.selectUnitsAvailability(), 1);
    }

    public void selectFirstAvailableUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectFirstAvailableUnit(), 25);
        Browser.click(AddResidentialContractPageObjects.selectFirstAvailableUnit());
        Browser.waitForSeconds(1);
    }

    public void clickConfirmPropertyDetailsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmPropertyDetailsBTN(), 5);
        Browser.click(AddResidentialContractPageObjects.confirmPropertyDetailsBTN());
    }

    public void clickIdentifyAddressOnMapBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.identifyAddressOnMapBTN(), 15);
        Browser.click(AddResidentialContractPageObjects.identifyAddressOnMapBTN());
    }

    public void clickConfirmBtnOnMap() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 40);
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmBtnOnMap(), 5);
        Browser.click(AddResidentialContractPageObjects.confirmBtnOnMap());
    }

    public void clickSaveBtnOnPropertyAddress() throws Exception {

        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.saveBtnOnPropertyAddress(), 5);
        Browser.click(AddResidentialContractPageObjects.saveBtnOnPropertyAddress());
    }

    public void clickContractPartiesBTN() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.confirmPeriodBTN(), 100);
        if (Browser.isElementNotPresent(AddResidentialContractPageObjects.LoadingIcon())) {
            Browser.waitForSeconds(1);
            Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractPartiesStepBTN(), 60);
            Browser.click(AddResidentialContractPageObjects.contractPartiesStepBTN());
        }
    }

    public void clickAddIndividualTenantBTN() throws Exception {
        Browser.waitUntilPresenceOfElement(AddResidentialContractPageObjects.addIndividualTenantBTN(), 50);
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addIndividualTenantBTN(), 50);
        Browser.click(AddResidentialContractPageObjects.addIndividualTenantBTN());
    }

    /**
     * Method to select the tenant type - Organization tenant is in if part
     *
     * @param tenantType - Tenant type to be selected
     * @param CrNumber   - CR number of organization if tenant type is ORGANIZATION
     */
    public void clickAddTenantBTN(String tenantType, String CrNumber) throws Exception {
        if (tenantType.equalsIgnoreCase("organization")) {
            //Select tenant organization
            Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addOrganizationTenantBTN(), 40);
            Browser.click(AddResidentialContractPageObjects.addOrganizationTenantBTN());
            // Select the license type > input CR number and continue
            clickTenantRadioBTN();
            clickCommercialRadioBTN();
            CommonMethodsPage.enterCRNumberInputField(CrNumber);
            Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.SearchOrganizationBTN(), 40);
            Browser.click(AddResidentialContractPageObjects.SearchOrganizationBTN());
            Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.ContinueOrganizationBTN(), 40);
            Browser.click(AddResidentialContractPageObjects.ContinueOrganizationBTN());
            //Click tenant representative radio button
            clickTenantRepresentativeRadioBTN();
        } else {
            Browser.waitUntilPresenceOfElement(AddResidentialContractPageObjects.addIndividualTenantBTN(), 50);
            Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addIndividualTenantBTN(), 50);
            Browser.click(AddResidentialContractPageObjects.addIndividualTenantBTN());
            clickTenantRadioBTN();
        }
    }

    public void addNewOwnerShipDocument() throws Exception {
        new ChangeLessor_LessorRepPage().clickOnAddNewRepresentationDocumentLink();
        new ChangeLessor_LessorRepPage().clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList("أخرى", ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        String docNum = "Testing" + RandomStringUtils.randomNumeric(5);
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(docNum);
        new ChangeLessor_LessorRepPage().enterDocumentName(docNum);
        new MoveInMoveOutUnitsPage().uploadFile("ejartest.pdf");
        new ChangeLessor_LessorRepPage().clickOnAddButton();
    }

    public void clickTenantRadioBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantRadioBTN(), 50);
        Browser.click(AddResidentialContractPageObjects.tenantRadioBTN());
    }

    public void clickTenantRepresentativeRadioBTN() {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantRepRadioBTN(), 40);
        Browser.click(AddResidentialContractPageObjects.tenantRepRadioBTN());
    }

    public void clickCommercialRadioBTN() {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.CommercialRadioBTN(), 50);
        Browser.waitUntilElementToBeClickable(AddResidentialContractPageObjects.CommercialRadioBTN(), 50);
        Browser.click(AddResidentialContractPageObjects.CommercialRadioBTN());
    }


    public void verifyTenantRadioBTNIsClickable() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantRadioBTN(), 50);
        Assert.assertTrue(Browser.isElementEnabled(AddResidentialContractPageObjects.tenantRadioBTN()), "Button is not clickable");
    }

    public void verifyTenantRepresentativeRadioBTNIsClickable() {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantRepresentativeRadioBTN(), 50);
        Assert.assertTrue(Browser.isElementEnabled(AddResidentialContractPageObjects.tenantRepresentativeRadioBTN()), "Button is not clickable");
    }

    public void inputTenantNationalId(String nationalId) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantNationalIdInput(), 50);
        Browser.setText(AddResidentialContractPageObjects.tenantNationalIdInput(), nationalId);
    }

    public void inputTenantDOB(String DOB) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantDateOfBirthInput(), 60);
        Browser.setText(AddResidentialContractPageObjects.tenantDateOfBirthInput(), DOB);
    }

    public void clickContinueButtonOnTenantContractPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueBtnOnIndividualContractPage(), 50);
        Browser.click(AddResidentialContractPageObjects.continueBtnOnIndividualContractPage());
    }

    public void clickConfirmBtnOnTenantAddressPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmBtnOnTenantAddressPage(), 50);
        Browser.click(AddResidentialContractPageObjects.confirmBtnOnTenantAddressPage());
    }

    public void clickFinancialTermsStepBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.financialTermsStepBTN(), 30);
        Browser.click(AddResidentialContractPageObjects.financialTermsStepBTN());
    }

    public void clickAddRentalContractTermsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addRentalContractTermsBTN(), 25);
        Browser.click(AddResidentialContractPageObjects.addRentalContractTermsBTN());
    }

    public void enterAnnulRent(String rent) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.annualRentInputField(), 25);
        Browser.setText(AddResidentialContractPageObjects.annualRentInputField(), rent);
    }

    public void clickSinglePaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.singlePaymentRadioBTN(), 50);
        Browser.click(AddResidentialContractPageObjects.singlePaymentRadioBTN());
    }


    public void clickConfirmPaymentScheduleBTN() throws Exception {
        if (Browser.isElementPresent(By.xpath("//button[contains (text(),'المتابعة إلى رصيد بدء العقد')]"))) {
            Browser.waitUntilVisibilityOfElement(By.xpath("//button[contains (text(),'المتابعة إلى رصيد بدء العقد')]"), 40);
            Browser.click(By.xpath("//button[contains (text(),'المتابعة إلى رصيد بدء العقد')]"));
        }
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueToBillingScheduleBTN(), 30);
        Browser.click(AddResidentialContractPageObjects.continueToBillingScheduleBTN());
    }

    public void clickPayOnlineBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.payOnlineBTN(), 30);
        Browser.click(AddResidentialContractPageObjects.payOnlineBTN());
        Browser.executeJSScrollIntoView(By.xpath("//label[contains(text(),'رقم حساب الآيبان')]"));
        Browser.waitForSeconds(1);
    }

    public void addNewIbanBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addNewIbanBTN(), 15);
        Browser.click(AddResidentialContractPageObjects.addNewIbanBTN());
    }

    public void enterIbanNumber(String ibanNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.ibanNumberInputField(), 15);
        Browser.setText(AddResidentialContractPageObjects.ibanNumberInputField(), ibanNumber);
    }

    public void enterAccountOwnerName(String ownerName) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.accountOwnerNameInputField(), 15);
        Browser.setText(AddResidentialContractPageObjects.accountOwnerNameInputField(), ownerName);
    }

    public void clickSaveBTNOnAddIban() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.saveBTNonAddNewIban(), 15);
        Browser.click(AddResidentialContractPageObjects.saveBTNonAddNewIban());
    }

    public void selectIbanFromDropdown() throws Exception {
        Browser.executeJSScroll(100);
        Browser.waitForSeconds(1);
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectIbanDropdown(), 20);
        Browser.click(AddResidentialContractPageObjects.selectIbanDropdown());
        Browser.selectDropdownByIndex(AddResidentialContractPageObjects.selectIbanDropdown(), 1);
    }

    public void selectLessorRadioBtnForAccountOwner() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.ibanAccountOwnerRadioBTN(), 26);
        Browser.click(AddResidentialContractPageObjects.ibanAccountOwnerRadioBTN());
    }

    public void clickContinueToAdditionalFeeBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueToAdditionalFeeBTN(), 25);
        Browser.click(AddResidentialContractPageObjects.continueToAdditionalFeeBTN());
    }

    public void clickContinueFinancialTermsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueFinancialTermsBTN(), 30);
        Browser.click(AddResidentialContractPageObjects.continueFinancialTermsBTN());
    }

    public void clickConfirmFinancialTermsBTN(String status, String amount) throws Exception {
        if (status.equalsIgnoreCase("yes")) {
            enableSecurityDeposit(amount);

        }
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueFinancialTermsBTN(), 30);
        Browser.click(AddResidentialContractPageObjects.continueFinancialTermsBTN());
    }

    public void clickTermsAndConditionsStepBTN() throws Exception {
        Browser.waitUntilElementToBeClickable(AddResidentialContractPageObjects.termsAndConditionsStepBTN(), 35);
        Browser.click(AddResidentialContractPageObjects.termsAndConditionsStepBTN());
    }

    public void clickAddTermsAndConditionsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addTermsAndConditionsBTN(), 30);
        Browser.click(AddResidentialContractPageObjects.addTermsAndConditionsBTN());
        Browser.waitForSeconds(1);
    }

    public void selectBrokerageOfficeAsEjarFeesPayer() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.ejarFeesPayerRadioBTN(), 15);
        Browser.click(AddResidentialContractPageObjects.ejarFeesPayerRadioBTN());
    }

    public void selectGoverningLaw(String status) throws Exception {
        if (status.equalsIgnoreCase("yes")) {
            enableSublease();
        }
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.governingLawRadioBTN(), 15);
        Browser.click(AddResidentialContractPageObjects.governingLawRadioBTN());
    }

    public void clickConfirmTermsAndConditionsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmTermsAndConditionsBTN(), 40);
        Browser.click(AddResidentialContractPageObjects.confirmTermsAndConditionsBTN());
    }

    public void clickSubmitForApprovalBTN() throws Exception {
        Browser.waitUntilPresenceOfElement(AddResidentialContractPageObjects.StepsList(), 50);
        List<WebElement> list = Browser.getWebElements(AddResidentialContractPageObjects.StepsList());
        while (list.size() < 5) {
            list = Browser.getWebElements(AddResidentialContractPageObjects.StepsList());
            Browser.waitForSeconds(1);
        }
        while (Browser.isElementPresent(AddResidentialContractPageObjects.WarningClass())) {
            Browser.waitForSeconds(1);
        }
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.submitForApprovalBTN(), 35);
        Browser.waitUntilElementToBeClickable(AddResidentialContractPageObjects.submitForApprovalBTN(), 35);
        Browser.click(AddResidentialContractPageObjects.submitForApprovalBTN());
    }

    public void clickContinueBtnOnPreviewContractPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueBtnOnPreviewContractPage(), 35);
        Browser.click(AddResidentialContractPageObjects.continueBtnOnPreviewContractPage());
    }

    public void clickContinuePayBtnOnPreviewBrokerageAgreementPage() throws Exception {
        if (Browser.isElementPresent(AddResidentialContractPageObjects.continuePayBtnOnPreviewBrokerageAgreementPage())) {
            Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continuePayBtnOnPreviewBrokerageAgreementPage(), 35);
            Browser.click(AddResidentialContractPageObjects.continuePayBtnOnPreviewBrokerageAgreementPage());
        }
    }

    public void clickDisclaimerCheckboxOnPayingEjarFeesPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.disclaimerCheckboxOnPayingEjarFeesPage(), 35);
        Browser.click(AddResidentialContractPageObjects.disclaimerCheckboxOnPayingEjarFeesPage());

    }

    public void clickConfirmAndSubmitBtnOnPayingEjarFeesPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmAndSubmitBtnOnPayingEjarFeesPage(), 35);
        Browser.waitUntilElementToBeClickable(AddResidentialContractPageObjects.confirmAndSubmitBtnOnPayingEjarFeesPage(), 35);
        Browser.click(AddResidentialContractPageObjects.confirmAndSubmitBtnOnPayingEjarFeesPage());
    }

    public void clickCloseSurveyPopUpBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.closeSurveyPopUpBTN(), 60);
        Browser.click(AddResidentialContractPageObjects.closeSurveyPopUpBTN());
    }

    public String getContractNumber() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractNumber(), 40);
        Browser.waitForSeconds(2);
        String number = Browser.getWebElement(AddResidentialContractPageObjects.contractNumber()).getText();
        return number.split("#")[1];
    }

    public void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
        Browser.waitUntilPresenceOfElement(AddResidentialContractPageObjects.searchContractNumberInputField(), 20);
        Browser.setText(AddResidentialContractPageObjects.searchContractNumberInputField(), contractNumber);
        Browser.waitForSeconds(1);
    }

    public void enableSecurityDeposit(String amount) {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.SecurityDepositSwitch(), 40);
        Browser.click(AddResidentialContractPageObjects.SecurityDepositSwitch());
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.SecurityDepositAmountInput(), 40);
        Browser.setText(AddResidentialContractPageObjects.SecurityDepositAmountInput(), amount);
    }

    public void enableSublease() {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.SubleaseSwitch(), 40);
        Browser.click(AddResidentialContractPageObjects.SubleaseSwitch());
    }

    public void clickOnSaveAndContinueLaterButton() {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.SaveAndContinueLaterButton(), 40);
        Browser.click(AddResidentialContractPageObjects.SaveAndContinueLaterButton());
    }

    public void clickOnStartDay() {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.StartDay(), 40);
        Browser.click(AddResidentialContractPageObjects.StartDay());
    }

}
