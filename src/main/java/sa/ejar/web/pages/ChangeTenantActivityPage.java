package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.ejar.web.objects.ChangeTenantActivityPageObjects;

import static com.testcrew.web.Browser.logger;

public class ChangeTenantActivityPage {

    public void assertRequestDetails() {
        String referenceNumber =  Browser.getAttributeValue(ChangeTenantActivityPageObjects.referenceNumber(), "value");
        String requestID = Browser.getText(ChangeTenantActivityPageObjects.requestID());
        String rID = requestID.replace("#","");
        Assert.assertEquals(referenceNumber, rID, "request ID does not matching");
        String requestType = Browser.getText(ChangeTenantActivityPageObjects.requestType());
        Assert.assertEquals(requestType, "تغيير النشاط التجاري", "request type does not matching");
        logger.addScreenshot(" ");
    }

    public void assertInvalidRequest() {
        String noResult = Browser.getText(ChangeTenantActivityPageObjects.noResultMessage());
        Assert.assertEquals(noResult, "حاليا ، ليس لديك أي طلب", "Text is not correct");
        logger.addScreenshot(" ");
    }
}
