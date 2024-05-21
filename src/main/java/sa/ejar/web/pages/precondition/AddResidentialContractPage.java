package sa.ejar.web.pages.precondition;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import sa.ejar.web.objects.*;
import org.openqa.selenium.WebElement;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.precondition.LoginPageObjects;

import java.util.List;

import static com.testcrew.web.Browser.logger;

public class AddResidentialContractPage {

    /*
     * Click date input field
     * */
    public void clickDateInputField() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.clickDateInputField(), 5);
        Browser.click(AddResidentialContractPageObjects.clickDateInputField());
    }

    /**
     * Click on Contracts Button
     * */
    public void clickContractsBtn() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 60);
        if (Browser.isElementPresent(LoginPageObjects.assessementUnitpopup())) {
            Browser.click(LoginPageObjects.assessementUnitpopup());
        }
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.contractButton(), 60);
        Browser.click(LoginPageObjects.contractButton());
        logger.addScreenshot("Clicked on Contracts button");
    }

    public void selectViewAllContractsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.viewAllContractsButton(), 20);
        Browser.click(LoginPageObjects.viewAllContractsButton());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Navigate to View All Contracts page");
    }

    /**
     * Select New Residential Contract
     * */
    public void selectNewResidualContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.optionCreateNewContract(), 45);
        Browser.click(LoginPageObjects.optionCreateNewContract());
        logger.addScreenshot("Select New Residential Contract");
    }

    /**
     * Select Start date of contract
     * */
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
        monthNum = monthNum.replaceFirst("^0*", "");
        month = switch (monthNum) {
            case "1" -> "January يناير ";
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
            case "12" -> "December  يناير ";
            default -> month;
        };
        return month;
    }

    /**
     * Select End date of contract
     * */
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
        Browser.waitForSeconds(3);
        Browser.click(AddResidentialContractPageObjects.confirmPeriodBTN());
        logger.addScreenshot("Input date and confirm");
    }

    public void clickAddPropertyBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.coveredPropertyUnitsBTN(), 40);
        Browser.click(AddResidentialContractPageObjects.coveredPropertyUnitsBTN());
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addPropertyBTN(), 40);
        Browser.click(AddResidentialContractPageObjects.addPropertyBTN());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Navigate to Add Property page");
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
        logger.addScreenshot("Property Selected");
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
        logger.addScreenshot("Available unit is selected");
    }

    public void clickConfirmPropertyDetailsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmPropertyDetailsBTN(), 5);
        Browser.click(AddResidentialContractPageObjects.confirmPropertyDetailsBTN());
        logger.addScreenshot("Clicked Confirm Property Details button");
    }

    public void clickIdentifyAddressOnMapBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.identifyAddressOnMapBTN(), 15);
        Browser.click(AddResidentialContractPageObjects.identifyAddressOnMapBTN());
    }

    public void clickConfirmBtnOnMap() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmBtnOnMap(), 5);
        Browser.click(AddResidentialContractPageObjects.confirmBtnOnMap());
        logger.addScreenshot("Clicked Confirm Button on Map");
    }

    public void clickSaveBtnOnPropertyAddress() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.saveBtnOnPropertyAddress(), 5);
        Browser.click(AddResidentialContractPageObjects.saveBtnOnPropertyAddress());
    }

    public void clickContractPartiesBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractPartiesStepBTN(), 30);
        Browser.click(AddResidentialContractPageObjects.contractPartiesStepBTN());
    }

    public void clickAddIndividualTenantBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addIndividualTenantBTN(), 5);
        Browser.click(AddResidentialContractPageObjects.addIndividualTenantBTN());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Navigate to Add Individual Tenant page");
    }

    public void clickTenantRadioBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantRadioBTN(), 5);
        Browser.click(AddResidentialContractPageObjects.tenantRadioBTN());
    }

    public void verifyTenantRadioBTNIsClickable() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantRadioBTN(), 5);
        Assert.assertTrue(Browser.isElementEnabled(AddResidentialContractPageObjects.tenantRadioBTN()), "Button is not clickable");
    }

    public void verifyTenantRepresentativeRadioBTNIsClickable() {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantRepresentativeRadioBTN(), 5);
        Assert.assertTrue(Browser.isElementEnabled(AddResidentialContractPageObjects.tenantRepresentativeRadioBTN()), "Button is not clickable");
        logger.addScreenshot("");
    }

    public void inputTenantNationalId(String nationalId) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantNationalIdInput(), 5);
        Browser.setText(AddResidentialContractPageObjects.tenantNationalIdInput(), nationalId);
    }

    public void inputTenantDOB(String DOB) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantDateOfBirthInput(), 10);
        Browser.waitForSeconds(1);
        Browser.setText(AddResidentialContractPageObjects.tenantDateOfBirthInput(), DOB);
    }

    public void clickContinueButtonOnTenantContractPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueBtnOnIndividualContractPage(), 5);
        Browser.click(AddResidentialContractPageObjects.continueBtnOnIndividualContractPage());
        logger.addScreenshot("Clicked Confirm after providing required data for new Tenant");
    }


    public void inputTenantPhoneNumberAndEmail(String phoneNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantPhoneNumberInput(), 5);
        Browser.setText(AddResidentialContractPageObjects.tenantPhoneNumberInput(), phoneNumber);
        Browser.setText(AddResidentialContractPageObjects.emailInput(), "Test@test.com");
    }

    public void clickConfirmBtnOnTenantAddressPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmBtnOnTenantAddressPage(), 15);
        Browser.click(AddResidentialContractPageObjects.confirmBtnOnTenantAddressPage());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Confirm Tenant Address");

    }

    public void verifyAddResidentialContractPageIsVisible() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addResidentialContractDashboard(), 25);
        Assert.assertTrue(Browser.isElementPresent(AddResidentialContractPageObjects.addResidentialContractDashboard()), "Add Residential Contract dashboard is not visible");
        logger.addScreenshot("");
    }

    public void clickFinancialTermsStepBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.financialTermsStepBTN(), 30);
        Browser.click(AddResidentialContractPageObjects.financialTermsStepBTN());
    }

    public void clickAddRentalContractTermsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addRentalContractTermsBTN(), 25);
        Browser.click(AddResidentialContractPageObjects.addRentalContractTermsBTN());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Navigate to Financial Terms page");
    }

    public void enterAnnulRent(String rent) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.annualRentInputField(), 25);
        Browser.setText(AddResidentialContractPageObjects.annualRentInputField(), rent);
        logger.addScreenshot("Entered annual rent");
    }

    public void clickSinglePaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.singlePaymentRadioBTN(), 15);
        Browser.click(AddResidentialContractPageObjects.singlePaymentRadioBTN());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Selected payment frequency");}

    public void clickMonthlyPaymentFrequency() {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'دفعات متكررة')]"), 15);
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[contains(text(),'دفعات متكررة')]"));
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[@class='form-check-label']//div[text()=' شهري ']"));
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void clickQuarterlyPaymentFrequency() {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'دفعات متكررة')]"), 15);
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[contains(text(),'دفعات متكررة')]"));
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[@class='form-check-label']//div[text()=' ربعي ']"));
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void clickSixMonthPaymentFrequency() {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'دفعات متكررة')]"), 15);
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[contains(text(),'دفعات متكررة')]"));
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[@class='form-check-label']//div[text()=' نصف سنوى ']"));
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void clickYearlyPaymentFrequency() {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'دفعات متكررة')]"), 15);
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[contains(text(),'دفعات متكررة')]"));
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[@class='form-check-label']//div[text()=' سنوي ']"));
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void clickFlexiblePaymentFrequency() {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'الدفعات المرنة')]"), 15);
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[contains(text(),'الدفعات المرنة')]"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void clickConfirmPaymentScheduleBTN() throws Exception {
        if (Browser.isElementPresent(By.xpath("//button[text()=' إلمتابعة إلى رصيد بدء العقد ']"))) {
//            Browser.waitForSeconds(2);
            Browser.click(By.xpath("//button[text()=' إلمتابعة إلى رصيد بدء العقد ']"));
        }
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueToBillingScheduleBTN(), 30);
//        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.continueToBillingScheduleBTN());
    }

    public void clickPayOnlineBTN() throws Exception {
//        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.payOnlineBTN(), 30);
//        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.payOnlineBTN());
//        Browser.waitForSeconds(2);
        Browser.executeJSScrollIntoView(By.xpath("//label[contains(text(),'رقم حساب الآيبان')]"));
        Browser.waitForSeconds(1);
    }

    public void addNewIbanBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addNewIbanBTN(), 15);
//        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.addNewIbanBTN());
        logger.addScreenshot("Add new IBAN button is clicked");
    }

    public void enterIbanNumber(String ibanNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.ibanNumberInputField(), 15);
//        Browser.waitForSeconds(2);
        Browser.setText(AddResidentialContractPageObjects.ibanNumberInputField(), ibanNumber);
    }

    public void enterAccountOwnerName(String ownerName) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.accountOwnerNameInputField(), 15);
//        Browser.waitForSeconds(2);
        Browser.setText(AddResidentialContractPageObjects.accountOwnerNameInputField(), ownerName);
    }

    public void clickSaveBTNOnAddIban() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.saveBTNonAddNewIban(), 15);
//        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.saveBTNonAddNewIban());
        logger.addScreenshot("Saved new IBAN");
    }

    public void selectIbanFromDropdown() throws Exception {
        Browser.executeJSScroll(100);
        Browser.waitForSeconds(1);
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectIbanDropdown(), 20);
//        Browser.waitForSeconds(4);
        Browser.click(AddResidentialContractPageObjects.selectIbanDropdown());
        Browser.selectDropdownByIndex(AddResidentialContractPageObjects.selectIbanDropdown(), 1);
    }

    public void selectLessorRadioBtnForAccountOwner() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.ibanAccountOwnerRadioBTN(), 26);
//        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.ibanAccountOwnerRadioBTN());
    }

    public void selectLessorRepresentativeRadioBtnForAccountOwner() {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'ممثل')]"), 15);
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[contains(text(),'ممثل')]"));
        logger.addScreenshot("Selected payment method and account owner");
        Browser.waitForSeconds(1);
    }

    public void selectOtherRadioBtnForAccountOwner() {
        Browser.waitUntilVisibilityOfElement(By.xpath(""), 15);
        Browser.waitForSeconds(2);
        Browser.click(By.xpath(""));
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void clickContinueToAdditionalFeeBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueToAdditionalFeeBTN(), 25);
        Browser.click(AddResidentialContractPageObjects.continueToAdditionalFeeBTN());
    }

    public void clickContinueFinancialTermsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueFinancialTermsBTN(), 15);
        Browser.click(AddResidentialContractPageObjects.continueFinancialTermsBTN());
        logger.addScreenshot("");
    }

    public void clickTermsAndConditionsStepBTN() throws Exception {
        Browser.waitUntilElementToBeClickable(AddResidentialContractPageObjects.termsAndConditionsStepBTN(), 35);
        Browser.click(AddResidentialContractPageObjects.termsAndConditionsStepBTN());
    }

    public void clickAddTermsAndConditionsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addTermsAndConditionsBTN(), 15);
        Browser.click(AddResidentialContractPageObjects.addTermsAndConditionsBTN());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Navigate to Terms And Conditions page");
    }

    public void selectBrokerageOfficeAsEjarFeesPayer() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.ejarFeesPayerRadioBTN(), 15);
        Browser.click(AddResidentialContractPageObjects.ejarFeesPayerRadioBTN());
    }

    public void selectGoverningLaw() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.governingLawRadioBTN(), 15);
        Browser.click(AddResidentialContractPageObjects.governingLawRadioBTN());
    }

    public void clickConfirmTermsAndConditionsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmTermsAndConditionsBTN(), 40);
        Browser.click(AddResidentialContractPageObjects.confirmTermsAndConditionsBTN());
        logger.addScreenshot("Confirm Terms And Conditions");
    }

    public void clickSubmitForApprovalBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.submitForApprovalBTN(), 35);
        Browser.waitUntilElementToBeClickable(AddResidentialContractPageObjects.submitForApprovalBTN(), 35);
        Browser.click(AddResidentialContractPageObjects.submitForApprovalBTN());
        Browser.waitForSeconds(3);
        logger.addScreenshot("Navigate to Contract Submission page");
    }

    public void clickContinueBtnOnPreviewContractPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueBtnOnPreviewContractPage(), 35);
        Browser.click(AddResidentialContractPageObjects.continueBtnOnPreviewContractPage());
    }

    public void clickContinuePayBtnOnPreviewBrokerageAgreementPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continuePayBtnOnPreviewBrokerageAgreementPage(), 35);
        Browser.click(AddResidentialContractPageObjects.continuePayBtnOnPreviewBrokerageAgreementPage());
    }

    public void clickDisclaimerCheckboxOnPayingEjarFeesPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.disclaimerCheckboxOnPayingEjarFeesPage(), 35);
        Browser.click(AddResidentialContractPageObjects.disclaimerCheckboxOnPayingEjarFeesPage());
        logger.addScreenshot("");
    }

    public void clickConfirmAndSubmitBtnOnPayingEjarFeesPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmAndSubmitBtnOnPayingEjarFeesPage(), 35);
        Browser.waitUntilElementToBeClickable(AddResidentialContractPageObjects.confirmAndSubmitBtnOnPayingEjarFeesPage(), 35);
        Browser.click(AddResidentialContractPageObjects.confirmAndSubmitBtnOnPayingEjarFeesPage());
        logger.addScreenshot("");
    }

    public void verifyContractStatusIsWaitingForApproval() throws Exception {
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(1);
        String[] expectedStatus = {"بانتظار موافقة الأطراف ", "Waiting Parties Approval"};
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }
        logger.addScreenshot("");
    }

    public void clickCloseSurveyPopUpBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.closeSurveyPopUpBTN(), 60);
        Browser.click(AddResidentialContractPageObjects.closeSurveyPopUpBTN());
    }

    public void clickConfirmBtnOnCloseSurveyPopUp() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmBtnOnCloseSurveyPopUp(), 35);
        Browser.click(AddResidentialContractPageObjects.confirmBtnOnCloseSurveyPopUp());
    }

    public String getContractNumber() throws Exception {
        Browser.waitForSeconds(2);
        String number = Browser.getWebElement(AddResidentialContractPageObjects.contractNumber()).getText();
        return number.split("#")[1];
    }

    public void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
        Browser.waitUntilPresenceOfElement(AddResidentialContractPageObjects.searchContractNumberInputField(), 20);
        Browser.setText(AddResidentialContractPageObjects.searchContractNumberInputField(), contractNumber);
        Browser.waitForSeconds(1);
        logger.addScreenshot("Entered Contract Number in search input field");
    }

    public void setContractNumberToContext(ITestContext context) throws Exception {
        String contractNumber = getContractNumber();
        context.setAttribute("Contract number", contractNumber);
    }

    public void clickContractNumberOnContractViewPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractNumberTextOnViewContractsPage(), 20);
        Browser.click(AddResidentialContractPageObjects.contractNumberTextOnViewContractsPage());
        logger.addScreenshot("Navigate to view the searched contract");
    }

    public void clickApproveContractBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.approveContractBTN(), 20);
        Browser.click(AddResidentialContractPageObjects.approveContractBTN());
        logger.addScreenshot("Click Approve Contract");
    }

    /*
     * Contract Approval
     * */
    public void clickLetsStartBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.letsStartBTN(), 20);
        Browser.click(ContractsApprovalPageObjects.letsStartBTN());
        logger.addScreenshot("");
    }

    public void clickConfirmBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.confirmBTN(), 20);
        Browser.click(ContractsApprovalPageObjects.confirmBTN());
        //Handle the dynamic requirement of double-click on Confirm BTN
        if (!Browser.isElementPresent(ContractsApprovalPageObjects.agreementCheckbox())) {
            Browser.waitForSeconds(2);
            Browser.click(ContractsApprovalPageObjects.confirmBTN());
        }
        logger.addScreenshot("Confirm contract details");
    }

    public void clickOnAgreementCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.agreementCheckbox(), 20);
        Browser.click(ContractsApprovalPageObjects.agreementCheckbox());
        logger.addScreenshot("");
    }

    public void clickSubmitContractApprovalBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.submitContractApprovalBTN(), 20);
        Browser.click(ContractsApprovalPageObjects.submitContractApprovalBTN());
        logger.addScreenshot("Submit contract for approval");
    }

    public void enterOTPForApproval(String otp) throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.OTPButton(), 20);
        Browser.setText(ContractsApprovalPageObjects.OTPButton(), otp);
        logger.addScreenshot("Entered OTP");
    }

    public void clickVerifyIdentityBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.verifyIdentityBTN(), 20);
        Browser.click(ContractsApprovalPageObjects.verifyIdentityBTN());
        logger.addScreenshot("");
    }

    public void verifyApprovalIsSubmitted() throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.approvalSubmittedText(), 20);
        Assert.assertTrue(Browser.isElementPresent(ContractsApprovalPageObjects.approvalSubmittedText()));
        logger.addScreenshot("");
    }

    public void verifyContractStatusIsRegistered() throws Exception {
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(1);
        boolean status = false;
        String[] expectedStatus = {"Registered", "مُسجل"};
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
        Browser.executeJSScroll(1000);
        System.out.println("Contract status : " + actualStatus);
        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])) {
            Assert.assertTrue(true);
            status = true;
        }
        Assert.assertTrue(status);
        Browser.waitForSeconds(1);
        logger.addScreenshot("Contract Status : " + actualStatus);
    }

    public void verifyContractStatusIsActivated() throws Exception {
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(1);
        boolean status = false;
        String[] expectedStatus = {"Active", "نشط"};
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
        Browser.executeJSScroll(1000);
        System.out.println("Contract status : " + actualStatus);
        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])) {
            status = true;
        }
        Assert.assertTrue(status);
        Browser.waitForSeconds(1);
        logger.addScreenshot("Contract Status : " + actualStatus);
    }

    public void verifyContractStatusIsRejected() throws Exception {
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(1);
        boolean status = false;
        String[] expectedStatus = {"Rejected", "مرفوض"};
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
        Browser.executeJSScroll(1000);
        System.out.println("Contract status : " + actualStatus);
        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])) {
            status = true;
        }
        Assert.assertTrue(status);
        Browser.waitForSeconds(1);
        logger.addScreenshot("Contract Status : " + actualStatus);
    }


    public void clickCloseBtnOnPopUp() throws Exception {
        Browser.waitForSeconds(3);
        if (Browser.isElementPresent(ContractsApprovalPageObjects.closeBtnOnPopUp())) {
            Browser.click(ContractsApprovalPageObjects.closeBtnOnPopUp());
        }
    }

}
