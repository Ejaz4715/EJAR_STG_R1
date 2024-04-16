package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.TerminateContractPageObjects;

import static com.testcrew.manager.PDFReportManager.logger;
import static sa.ejar.web.pages.CommonMethodsPage.selectFromList;

public class TerminateContractPage {
    public void checkTheRequestTerminationText() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.requestTerminationText(),20);
        Assert.assertTrue(Browser.isElementDisabled(TerminateContractPageObjects.requestTerminationText()));
        logger.addScreenshot("User Navigate To ' طلب الإنهاء' Page");
    }
    public void checkTheContractsPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.theContractPage(),20);
        Assert.assertTrue(Browser.isElementDisabled(TerminateContractPageObjects.theContractPage()));
        logger.addScreenshot("User Navigate Back To 'العقود' Page");
    }
    public void selectRequestingParty() throws Exception {
        Browser.waitUntilVisibilityOfElement(TerminateContractPageObjects.requestingPartyDDL(),20);
        selectFromList("المؤجر",TerminateContractPageObjects.requestingPartyDDL());
        selectFromList("المستأجر",TerminateContractPageObjects.requestingPartyDDL());
        logger.addScreenshot("The Requesting Party Is Selected");
    }

}
