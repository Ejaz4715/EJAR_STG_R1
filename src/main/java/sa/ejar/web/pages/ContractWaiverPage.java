package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.ejar.web.objects.ContractWaiverPageObjects;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.pages.precondition.AddResidentialContractPage;

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
}
