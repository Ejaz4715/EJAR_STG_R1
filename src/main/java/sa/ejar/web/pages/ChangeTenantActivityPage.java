package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
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
    }
}
