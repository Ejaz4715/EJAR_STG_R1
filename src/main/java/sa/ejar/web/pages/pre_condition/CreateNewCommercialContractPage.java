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

    public void clickOnContractsBtn() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.contractButtonArrow(), 20);
        Browser.click(AddCommercialContractObjects.contractButtonArrow());
    }

    public void selectNewCommercialContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.optionCreateNewContract(), 15);
        Browser.click(AddCommercialContractObjects.optionCreateNewContract());
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

    public void selectFirstAvailableUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.selectFirstAvailableUnit(), 10);
        Browser.click(AddCommercialContractObjects.selectFirstAvailableUnit());
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

    public void inputTenantNationalId(String nationalId) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.tenantNationalIdInput(), 5);
        Browser.setText(AddCommercialContractObjects.tenantNationalIdInput(), nationalId);
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

    public void clickConfirmPaymentScheduleBTN() throws Exception {
            Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.continueToBillingScheduleBTN(),20);
            Browser.click(AddCommercialContractObjects.continueToBillingScheduleBTN());
    }

    public void clickPayOnlineBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.payOnlineBTN(), 25);
        Browser.click(AddCommercialContractObjects.payOnlineBTN());
    }

    public void selectIbanFromDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.selectIbanDropdown(), 15);
        Browser.click(AddCommercialContractObjects.selectIbanDropdown());
        Browser.selectDropdownByIndex(AddCommercialContractObjects.selectIbanDropdown(), 1);
    }

    public void selectLessorRadioBtnForAccountOwner() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.ibanAccountOwnerRadioBTN(), 15);
        Browser.click(AddCommercialContractObjects.ibanAccountOwnerRadioBTN());
//        Browser.click(AddCommercialContractObjects.continueToOwnerInfo());
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


    public void clickConfirmTermsAndConditionsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.confirmTermsAndConditionsBTN(), 15);
        Browser.click(AddCommercialContractObjects.confirmTermsAndConditionsBTN());
    }

    public void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
        Browser.setText(AddCommercialContractObjects.searchContractNumberInputField(), contractNumber);
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
        Browser.waitUntilPresenceOfElement(AddCommercialContractObjects.NoticePeriodInput(), 20);
        Browser.waitUntilVisibilityOfElement(AddCommercialContractObjects.NoticePeriodInput(), 20);
        Browser.setText(AddCommercialContractObjects.NoticePeriodInput(), period);
    }
}