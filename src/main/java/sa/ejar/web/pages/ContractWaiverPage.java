package sa.ejar.web.pages;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.jfree.util.Log;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.ContractWaiverPageObjects;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;

import java.util.List;

import static com.testcrew.base.WebBaseTest.logger;

public class ContractWaiverPage {

    public void verifyContractWaiverServicePageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.ContractWaiverServicePageHeading(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ContractWaiverPageObjects.ContractWaiverServicePageHeading()));
        logger.addScreenshot("");
    }

    public void verifyContractWaiverPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.ContractWaiverPageHeading(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ContractWaiverPageObjects.ContractWaiverPageHeading()));
        logger.addScreenshot("");
    }

    public void clickOnAddIndividualTenant() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.AddIndividualTenant(), 40);
        Browser.click(ContractWaiverPageObjects.AddIndividualTenant());

    }

    public void verifyIndividualContractTenantPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.IndividualContractTenantPageTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ContractWaiverPageObjects.IndividualContractTenantPageTitle()));
        logger.addScreenshot("");

    }

    public void verifyUserIsAbleToClickNationalIdRadioButton() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.NationalIdRadioButton(), 40);
        Assert.assertTrue(Browser.isElementEnabled(ContractWaiverPageObjects.NationalIdRadioButton()));
        logger.addScreenshot("");
    }

    public void clickOnNationalIdRadioButton() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.NationalIdRadioButton(), 40);
        Browser.click(ContractWaiverPageObjects.NationalIdRadioButton());
    }

    public void verifyDOBInputFieldIsEnabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantDateOfBirthInput(), 40);
        Assert.assertTrue(Browser.isElementEnabled(AddResidentialContractPageObjects.tenantDateOfBirthInput()));
        logger.addScreenshot("");
    }

    public void enterValidTenantDOB(String validDOB) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantDateOfBirthInput(), 40);
        Browser.setText(AddResidentialContractPageObjects.tenantDateOfBirthInput(), validDOB);
        logger.addScreenshot("");
    }

    public void verifyTenantPartyInfoPageIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.TenantPartyInfoPageTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ContractWaiverPageObjects.TenantPartyInfoPageTitle()));
        logger.addScreenshot("");
    }

    public void verifyContractDetailsSectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.ContractDetailsSectionTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ContractWaiverPageObjects.ContractDetailsSectionTitle()));
        logger.addScreenshot("");
    }

    public void verifyNewTenantPartySectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.NewTenantPartySectionTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ContractWaiverPageObjects.NewTenantPartySectionTitle()));
        logger.addScreenshot("");
    }

    public void clickOnAcknowledgementCheckbox() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.AcknowledgementCheckbox(), 40);
        Browser.click(ContractWaiverPageObjects.AcknowledgementCheckbox());
        logger.addScreenshot("");
    }

    public void verifyAcknowledgementCheckboxIsChecked() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.AcknowledgementCheckbox(), 40);
        Browser.isElementSelected(ContractWaiverPageObjects.AcknowledgementCheckbox());
        logger.addScreenshot("");
    }

    public void verifyConfirmButtonIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.confirmBTN(), 20);
        Assert.assertTrue(Browser.isElementDisabled(CommonMethodsPageObjects.confirmBTN()), "Button is not disabled");
        logger.addScreenshot("Button is disabled");
    }

    public String getRequestNumber() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.RequestNumber(), 50);
        String text = Browser.getText(ContractWaiverPageObjects.RequestNumber());
        int index = text.indexOf("#");
        String newText = text.substring(++index);
        String reqNum = newText.split(" ")[0];
        return reqNum;
    }

    public void reqNumApproval(){
        String request = getRequestNumber();
        TestDataManager.addDependantGlobalTestData("ContractWaiver", "ReqNumApproval", request);
        TestDataManager.writeDependantGlobalTestData("ContractWaiver");
    }
    public void reqNumLessorRejection(){
        String request = getRequestNumber();
        TestDataManager.addDependantGlobalTestData("ContractWaiver", "ReqNumLessorRejection", request);
        TestDataManager.writeDependantGlobalTestData("ContractWaiver");
    }

    public void reqNumTenantRejection(){
        String request = getRequestNumber();
        TestDataManager.addDependantGlobalTestData("ContractWaiver", "ReqNumTenantRejection", request);
        TestDataManager.writeDependantGlobalTestData("ContractWaiver");
    }


    public void verifyRentalDetailsSectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.RentalDetailsSectionTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ContractWaiverPageObjects.RentalDetailsSectionTitle()));
        logger.addScreenshot("");
    }
    public void verifyDeclareAndConfirmSectionIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.DeclareAndConfirmSectionTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ContractWaiverPageObjects.DeclareAndConfirmSectionTitle()));
        logger.addScreenshot("");
    }

    public void verifyConfirmationPopUpAppears() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.ConfirmationPopUpMessage(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ContractWaiverPageObjects.ConfirmationPopUpMessage()));
        logger.addScreenshot("Confirmation pop up is displayed");
    }

    public void verifyTenantNameIsChanged(String newTenantName, String oldTenantName) throws Exception {
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(1);
        boolean status = false;
        String contractStatus= "";
        String tenantName = "";
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        List<WebElement> listStatus = Browser.getWebElements(AddResidentialContractPageObjects.contractStatus());
        List<WebElement> listTenantNames = Browser.getWebElements(AddResidentialContractPageObjects.tenantName());
        for (WebElement s : listStatus){
            for (WebElement n : listTenantNames) {
                contractStatus = s.getText();
                tenantName = n.getText();
                if (contractStatus.contains("نشط") && tenantName.contains(newTenantName)) {
                    if (contractStatus.contains("مؤرشف") && tenantName.contains(oldTenantName)) {
                        status = true;
                        break;
                    }
                }
            }
        }
        Assert.assertTrue(status, "Tenant name is not changed in new contract");
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
    }

    public void verifyYesAgreeButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.YesAgreeBTN(), 40);
        Assert.assertTrue(Browser.isElementDisabled(ContractWaiverPageObjects.YesAgreeBTN()), "Button is not disabled");
        logger.addScreenshot("");
    }

    public void clickOnYesAgreeButton() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.YesAgreeBTN(), 40);
        Browser.click(ContractWaiverPageObjects.YesAgreeBTN());
        logger.addScreenshot("");
    }

    public void verifyErrorMessagePopUpIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.ErrorMessagePopUpTitle(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ContractWaiverPageObjects.ErrorMessagePopUpTitle()), "Pop up is not displayed");
    }

    public void validateTheErrorMessageOnPopUp(String expectedMessage) {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.ErrorMessageOnPopUp(), 40);
        String actualMessage = Browser.getText(ContractWaiverPageObjects.ErrorMessageOnPopUp());
        Assert.assertTrue(actualMessage.contains(expectedMessage),"Error message is not same");
        logger.addScreenshot("The message is " + actualMessage);
    }

    public void clickOnCancelButtonOnPopUp() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.CancelButtonOnPopUp(), 40);
        Browser.click(ContractWaiverPageObjects.CancelButtonOnPopUp());
    }
    public void clickOnConfirmButtonOnPopUp() {
        Browser.waitUntilVisibilityOfElement(ContractWaiverPageObjects.ConfirmButtonOnPopUp(), 40);
        Browser.click(ContractWaiverPageObjects.ConfirmButtonOnPopUp());
    }

}
