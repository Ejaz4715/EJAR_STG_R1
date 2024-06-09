package sa.ejar.web.pages.pre_condition;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import sa.ejar.web.objects.pre_condition.*;
import java.util.Map;
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

    public void enterContractNumber(String contractNum) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.TXTContractNumber(), 20);
        Browser.setText(AddSubleaseContractPageObjects.TXTContractNumber(), contractNum);
        logger.addScreenshot("");
    }

    public void clickOnCreateSubleaseContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.AddSubleaseContract(), 30);
        Browser.click(AddSubleaseContractPageObjects.AddSubleaseContract());
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

    public void clickOnConfirmButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.BTNConfirm(), 20);
        Browser.executeJSScrollIntoView(AddSubleaseContractPageObjects.BTNConfirm());
        Browser.click(AddSubleaseContractPageObjects.BTNConfirm());
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

    public void ChangeCommercialActivity() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNChangeCommercialActivity(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNChangeCommercialActivity());
    }

    public void RentSubleasesForOther() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.SwitchBTNSublease(), 12);
        Browser.click(AddSubleaseContractPageObjects.SwitchBTNSublease());
        Browser.click(By.xpath("(//label[@class='form-check-label']//div[text()='يحق للمستأجر تأجير الوحدة الإيجارية كاملة للغير.'])"));
    }

    public void clickOnCloseButton() throws Exception {
        if (Browser.isElementPresent(AddSubleaseContractPageObjects.BTNClose())) {
            Browser.click(AddSubleaseContractPageObjects.BTNClose());
        }
    }

    public void clickContractsBtn() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.contractButton(), 20);
        Browser.click(LoginPageObjects.contractButton());
    }

    public void selectViewAllContractsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.viewAllContractsButton(), 20);
        Browser.click(LoginPageObjects.viewAllContractsButton());
    }

    public void inputTenantNationalId(String nationalId) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.tenantNationalIdInput(), 25);
        Browser.setText(AddSubleaseContractPageObjects.tenantNationalIdInput(), nationalId);
    }

    public void clickConfirmTermsAndConditions() throws Exception {
        Browser.executeJSScrollIntoView(AddSubleaseContractPageObjects.confirmAdditionalTermBut());
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.confirmAdditionalTermBut(), 20);
        Browser.click(AddSubleaseContractPageObjects.confirmAdditionalTermBut());
    }

    public void clickContinueFinancialTermsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.continueFinancialTermsBTN(), 15);
        Browser.click(AddSubleaseContractPageObjects.continueFinancialTermsBTN());
        logger.addScreenshot("");
    }

    public void getContractOption1() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.getContractOption("عقد غير موحد"), 35);
        Browser.click(AddSubleaseContractPageObjects.getContractOption("عقد غير موحد"));
        logger.addScreenshot("");
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.termConditionBTN_Next(), 35);
        Browser.click(AddSubleaseContractPageObjects.termConditionBTN_Next());
    }

    public void getContractOption2() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.getContractOption("عقد غير موحد"), 20);
        Browser.driver.navigate().refresh();
        Browser.waitUntilVisibilityOfElement(AddSubleaseContractPageObjects.getContractOption("عقد غير موحد"), 20);
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

    public void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
        Browser.setText(AddSubleaseContractPageObjects.searchContractNumberInputField(), contractNumber);
        logger.addScreenshot("");
    }
}