package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.ejar.web.objects.ChangeTenantActivityPageObjects;

import static com.testcrew.web.Browser.*;
import static sa.ejar.web.pages.CommonMethodsPage.selectFromList;

public class ChangeTenantActivityPage {

    public void assertRequestDetails(String requestId, String requestType, String contractNumber) {
        String requestID = Browser.getText(ChangeTenantActivityPageObjects.requestID());
        String rID = requestID.replace("#","");
        Assert.assertEquals(requestId, rID, "request ID does not matching");
        String contractNumberNew = Browser.getText(ChangeTenantActivityPageObjects.contractNumber()).replace("#","");
        Assert.assertEquals(contractNumberNew, contractNumber, "contract number is not matching");
        String requestTypeNew = Browser.getText(ChangeTenantActivityPageObjects.requestType());
        Assert.assertEquals(requestTypeNew, requestType, "request type does not matching");
        logger.addScreenshot(" ");
    }

    public void assertInvalidRequest() {
        String noResult = Browser.getText(ChangeTenantActivityPageObjects.noResultMessage());
        Assert.assertEquals(noResult, "حاليا ، ليس لديك أي طلب", "Text is not correct");
        logger.addScreenshot(" ");
    }

    public void selectStatus(String status) throws Exception {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.statusDropdown(), 40);
        click(ChangeTenantActivityPageObjects.statusDropdown());
        selectFromList(status, ChangeTenantActivityPageObjects.statusOptions());
        logger.addScreenshot(" ");
    }

    public void selectRequestType(String requestType) throws Exception {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.requestTypeDropdown(), 40);
        click(ChangeTenantActivityPageObjects.requestTypeDropdown());
        selectFromList(requestType, ChangeTenantActivityPageObjects.requestTypeOptions());
        logger.addScreenshot(" ");
    }

    public void assertCreatedDateAndIssuedByOnRequestDetails(String issuedBy) {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.createdDate(), 40);
        Browser.isElementDisplayed(ChangeTenantActivityPageObjects.createdDate());
        String issued = Browser.getText(ChangeTenantActivityPageObjects.issuedBy());
        Assert.assertEquals(issued, issuedBy, "issued by is not displayed");
        logger.addScreenshot(" ");
    }

    public void enterTextInNewTenantActivityTextBox(String text) {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.newTenantActivityTextBox(), 40);
        Browser.setText(ChangeTenantActivityPageObjects.newTenantActivityTextBox(), text);
        logger.addScreenshot(" ");
    }

    public void removeTextInNewTenantActivityTextBox() {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.newTenantActivityTextBox(), 40);
        Browser.clearText(ChangeTenantActivityPageObjects.newTenantActivityTextBox());
        logger.addScreenshot(" ");
    }

    public void assertSubmitButtonIsEnabled() {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitButton(), 40);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.submitButton());
        logger.addScreenshot(" ");
    }

    public void assertSubmitButtonIsDisabled() {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitButton(), 40);
        Browser.isElementDisabled(ChangeTenantActivityPageObjects.submitButton());
        logger.addScreenshot(" ");
    }

    public void clickOnSubmitButton() {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitButton(), 40);
        Browser.click(ChangeTenantActivityPageObjects.submitButton());
        logger.addScreenshot(" ");
    }


    public static void clickOnViewRequestButton() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.ViewRequestButton(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.ViewRequestButton());
        Browser.click(ChangeTenantActivityPageObjects.ViewRequestButton());
    }

    public void clickOnLetsStartButton() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.letsStartButton(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.letsStartButton());
        Browser.click(ChangeTenantActivityPageObjects.letsStartButton());

    }

    public void clickOnOldTenantActivity() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.oldTenantActivity(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.oldTenantActivity());
        Browser.click(ChangeTenantActivityPageObjects.oldTenantActivity());
    }

    public void assertOldTenantDescriptionDetails(String description) {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.oldTenantActivityDescription(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.oldTenantActivityDescription());
        Assert.assertEquals(Browser.getText(ChangeTenantActivityPageObjects.oldTenantActivityDescription()), description, "Old Tenant description is not matched");
    }

    public void clickOnNewTenantActivity() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.newTenantActivity(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.newTenantActivity());
        Browser.click(ChangeTenantActivityPageObjects.newTenantActivity());
    }

    public void assertNewTenantDescriptionDetails(String description) {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.newTenantActivityDescription(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.newTenantActivityDescription());
        Assert.assertEquals(Browser.getText(ChangeTenantActivityPageObjects.newTenantActivityDescription()), description, "Old Tenant description is not matched");
    }

    public void clickBackButton() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.backButton(), 20);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.backButton());
        Browser.click(ChangeTenantActivityPageObjects.backButton());
    }

    public void scrollToNewTenantActivity(){
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.bottomNewTenantActivity(), 20);
        Browser.executeJSScrollIntoView(ChangeTenantActivityPageObjects.bottomNewTenantActivity());
    }

    public void assertApproveTenantActivity() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.approveTenantActivity(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeTenantActivityPageObjects.approveTenantActivity()));
    }

    public void assertReviewChangedTenantActivity() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.reviewChangeTenantActivity(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeTenantActivityPageObjects.reviewChangeTenantActivity()));
    }

    public void verifySubmitApprovalButtonDisabled(boolean idDisabled) {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitApprovalButton(), 20);
        Assert.assertEquals(Browser.isElementDisabled(ChangeTenantActivityPageObjects.submitApprovalButton()), idDisabled);
    }

    public static void newTenantActivityDescription(String newTenantActivityDescription)
    {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.newTenantActivityDescription(), 10);
        Browser.isElementDisplayed(ChangeTenantActivityPageObjects.newTenantActivityDescription());
        setText(ChangeTenantActivityPageObjects.newTenantActivityDescription(), newTenantActivityDescription);
    }

    public static void clickOnSubmitRequest()
    {
        waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.submitRequestInChangeTenantCommercialActivity(), 10);
        Browser.isElementEnabled(ChangeTenantActivityPageObjects.submitRequestInChangeTenantCommercialActivity());
        click(ChangeTenantActivityPageObjects.submitRequestInChangeTenantCommercialActivity());
    }
    public void verifyChangeTenantActivityPageHeaderIsDisplayed() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.changeTenantActivityPageHeader(), 40);
        Assert.assertTrue(Browser.isElementDisplayed(ChangeTenantActivityPageObjects.changeTenantActivityPageHeader()),"Change Tenant Activity page header is not displayed");
        logger.addScreenshot(" ");
    }
    public void assertContractNumberInPageHeader(String contractNumber) {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.contractNumberHeader(),20);
        String contractNumberNew = Browser.getText(ChangeTenantActivityPageObjects.contractNumberHeader()).replace("#","");
        Assert.assertEquals(contractNumberNew, contractNumber, "contract number is not matching");
        logger.addScreenshot(" ");
    }

    public void assertContractParties() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.contractParties(),40);
        Browser.isElementDisplayed(ChangeTenantActivityPageObjects.contractParties());
        logger.addScreenshot(" ");
    }

    public void assertOldTenantActivityHeadingOnChangeTenantActivityPage() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.OldTenantActivityHeadingOnChangeTenantActivityPage(),40);
        Browser.isElementDisplayed(ChangeTenantActivityPageObjects.OldTenantActivityHeadingOnChangeTenantActivityPage());
        logger.addScreenshot(" ");
    }

    public void assertOldTenantActivityDescriptionOnChangeTenantActivityPage() {
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.OldTenantActivityDescriptionOnChangeTenantActivityPage(),40);
        Browser.isElementDisplayed(ChangeTenantActivityPageObjects.OldTenantActivityDescriptionOnChangeTenantActivityPage());
        logger.addScreenshot(" ");
    }
}
