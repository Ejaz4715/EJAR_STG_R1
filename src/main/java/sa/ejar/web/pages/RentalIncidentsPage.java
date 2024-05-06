package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.RentalIncidentsPageObjects;

import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.getWebElement;
import static sa.ejar.web.pages.CommonMethodsPage.selectFromList;

public class RentalIncidentsPage {


    public void clickOnRentalIncidentTab() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.rentalIncidentTab(), 40 );
        Browser.click(RentalIncidentsPageObjects.rentalIncidentTab());
    }

    public void clickOnNewRentalIncidentButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.newRentalIncidentBTN(), 40 );
        Browser.click(RentalIncidentsPageObjects.newRentalIncidentBTN());
    }

    public void selectRequesterType(String requesterType) throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterTypeDDL(), 20);
        selectFromList(requesterType, RentalIncidentsPageObjects.requesterTypeDDL());

    }

    public void verifyRequesterTypeIsSelected(String selectedRequesterType) throws Exception {
        WebElement requesterType = getWebElement(RentalIncidentsPageObjects.requesterTypeDDL());
        String text = requesterType.getAttribute("value");
        Assert.assertEquals(text, selectedRequesterType);
        logger.addScreenshot("The (صفة مقدم الطلب) Is Selected");

    }
    public void selectRequesterCategory(String requesterType) throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterCategoryDDL(), 20);
        selectFromList(requesterType, RentalIncidentsPageObjects.requesterCategoryDDL());

    }

    public void verifyRequesterCategoryIsSelected(String selectedRequesterCategory) throws Exception {
        WebElement requesterCategory = getWebElement(RentalIncidentsPageObjects.requesterCategoryDDL());
        String text = requesterCategory.getAttribute("value");
        Assert.assertEquals(text, selectedRequesterCategory);
        logger.addScreenshot("The (فئة مقدم الطلب) Is Selected");
    }

    public void clickOnRequesterRoleRadioButtons(String requesterRole) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterRoleRadioBTNs(), 40);
        List<WebElement> requester = Browser.getWebElements(RentalIncidentsPageObjects.requesterRoleRadioBTNs());
        for (WebElement req : requester) {
            String optText = req.getText();
            if (optText.contains(requesterRole)) {
                req.click();
                req.isSelected();
                break;
            }
        }
    }

    public void clickOnAddRequesterInfoButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.addRequesterInfoBTN(), 40 );
        Browser.click(RentalIncidentsPageObjects.addRequesterInfoBTN());
    }

    public void verifyTheAddRequesterInfoPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.addRequesterInfoPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.addRequesterInfoPage()));
        logger.addScreenshot("The (إضافة بيانات مقدم الطلب) page is displayed");
    }

    public void verifyNewRentalIncidentPageIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.newRentalIncidentPage(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.newRentalIncidentPage()));
        logger.addScreenshot("The (تسجيل واقعة ايجارية جديدة) page is displayed");
    }

    public void verifyRequesterCategoryDropdownListIsDisabled() throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterCategoryDDL(), 20);
        Assert.assertTrue(Browser.isElementDisabled(RentalIncidentsPageObjects.requesterCategoryDDL()));
        logger.addScreenshot("The (فئة مقدم الطلب) dropdown list is disabled");
    }


    public void verifyAddRequesterInfoButtonIsNotDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.addRequesterInfoBTN(), 20);
        Assert.assertTrue(Browser.isElementNotDisplayed(RentalIncidentsPageObjects.addRequesterInfoBTN()));
        logger.addScreenshot("The (بيانات مقدم الطلب) button is not displayed");
    }
    public void clearPhoneNumber() throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.phoneNumberInput(), 20);
        Browser.clearText(RentalIncidentsPageObjects.phoneNumberInput());
    }
    public void verifyRequesterInfoIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterInfo(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.requesterInfo()));
        logger.addScreenshot("The (بيانات مقدم الطلب) is displayed");
    }
    public void verifyRequesterInfoIsRemoved() throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterInfo(), 20);
        Assert.assertTrue(Browser.isElementNotPresent(RentalIncidentsPageObjects.requesterInfo()));
        logger.addScreenshot("The (بيانات مقدم الطلب) is removed");
    }

    public void clickOnAddAbstainingPartyInfoButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.AddAbstainingPartyInfoButton(), 40);
        Browser.click(RentalIncidentsPageObjects.AddAbstainingPartyInfoButton());
    }

    public void verifyAddAbstainingPartyButtonIsDisabled() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.AddAbstainingPartyInfoButton(), 40);
        Assert.assertTrue(Browser.isElementDisabled(RentalIncidentsPageObjects.AddAbstainingPartyInfoButton()), "Abstaining party info button is enabled");
        logger.addScreenshot("");
    }

    public void verifyAddAbstainingPartyButtonIsEnabled() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.AddAbstainingPartyInfoButton(), 40);
        Assert.assertTrue(Browser.isElementEnabled(RentalIncidentsPageObjects.AddAbstainingPartyInfoButton()));
        logger.addScreenshot("");
    }

    public void verifyAbstainerRole(String abstainerRole) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.AbstainerRole(), 40);
        String actualRole = Browser.getText(RentalIncidentsPageObjects.AbstainerRole());
        Assert.assertTrue(actualRole.contains(abstainerRole), "Abstainer role is not " + abstainerRole);
        logger.addScreenshot("");
    }


}
