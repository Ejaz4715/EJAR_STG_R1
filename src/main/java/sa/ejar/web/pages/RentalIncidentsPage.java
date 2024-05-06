package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.RentalIncidentsPageObjects;
import sa.ejar.web.objects.SendContractForApprovalPageObjects;
import sa.ejar.web.objects.TerminateContractPageObjects;

import java.awt.event.KeyEvent;
import java.util.List;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.getWebElement;
import static sa.ejar.web.pages.CommonMethodsPage.selectFromList;

public class RentalIncidentsPage {

    public void clickOnRentalIncidentTab() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.rentalIncidentTab(), 40);
        Browser.click(RentalIncidentsPageObjects.rentalIncidentTab());
    }

    public void clickOnNewRentalIncidentButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.newRentalIncidentBTN(), 40);
        Browser.click(RentalIncidentsPageObjects.newRentalIncidentBTN());
    }

    public void selectRequesterType(String requesterType) throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterTypeDDL(), 20);
        selectFromList(requesterType, RentalIncidentsPageObjects.requesterTypeDDLOption());

    }

    public void verifyRequesterTypeIsSelected(String selectedRequesterType) throws Exception {
        WebElement requesterType = getWebElement(RentalIncidentsPageObjects.requesterTypeDDL());
//        Browser.getDropdownFirstSelectedOption()
        String t = requesterType.getAttribute("value");
        String text = t.toLowerCase();
        if (text.contains("lessor")) {
            text = "مؤجر";
        } else if (text.contains("tenant")) {
            text = "مستأجر";
        }
        Assert.assertEquals(text, selectedRequesterType);
        logger.addScreenshot("The (صفة مقدم الطلب) Is Selected");

    }

    public void selectRequesterCategory(String requesterType) throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterCategoryDDL(), 20);
        selectFromList(requesterType, RentalIncidentsPageObjects.requesterCategoryDDLOption());

    }

    public void verifyRequesterCategoryIsSelected(String selectedRequesterCategory) throws Exception {
        WebElement requesterCategory = getWebElement(RentalIncidentsPageObjects.requesterCategoryDDL());
        String t = requesterCategory.getAttribute("value");
        String text = t.toLowerCase();
        if (text.contains("individual")) {
            text = "فرد";
        } else if (text.contains("organization")) {
            text = "منشأة";
        }
        Assert.assertEquals(text, selectedRequesterCategory);
        logger.addScreenshot("The (فئة مقدم الطلب) Is Selected");
    }

    public void clickOnRequesterRoleRadioButtons(String requesterRole) {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterRoleRadioBTNs(), 40);
        List<WebElement> requester = Browser.getWebElements(RentalIncidentsPageObjects.requesterRoleRadioBTNs());
        int i ;
        for (i = 0 ; i <= requester.size(); i++) {
            String optText = requester.get(i).getText();
            if (optText.contains(requesterRole)) {
                requester.get(i).click();
                break;
            }
        }
        logger.addScreenshot("The (إختر صفة مقدم الطلب) radio button is selected");
    }



    public void clickOnAddRequesterInfoButton() {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.addRequesterInfoBTN(), 40);
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
        Assert.assertTrue(Browser.isElementNotPresent(RentalIncidentsPageObjects.addRequesterInfoBTN()));
        logger.addScreenshot("The (بيانات مقدم الطلب) button is not displayed");
    }

    public void clearPhoneNumber() throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.phoneNumberInput(), 20);
        WebElement ele = Browser.getWebElement(RentalIncidentsPageObjects.phoneNumberInput());
        ele.click();
        ele.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
//        Browser.clearText(RentalIncidentsPageObjects.phoneNumberInput());

    }

    public void verifyRequesterInfoIsDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(RentalIncidentsPageObjects.requesterInfo(), 20);
        Assert.assertTrue(Browser.isElementDisplayed(RentalIncidentsPageObjects.requesterInfo()));
        logger.addScreenshot("The (بيانات مقدم الطلب) is displayed");
    }

    public void verifyRequesterInfoIsRemoved() throws Exception {
        Browser.waitUntilInvisibilityOfElement(RentalIncidentsPageObjects.requesterInfo(), 20);
        Assert.assertTrue(Browser.isElementNotPresent(RentalIncidentsPageObjects.requesterInfo()));
        logger.addScreenshot("The (بيانات مقدم الطلب) is removed");
    }

}
