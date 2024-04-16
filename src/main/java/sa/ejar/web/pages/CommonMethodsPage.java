package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.precondition.LoginPageObjects;

import java.util.List;

import static com.testcrew.web.Browser.logger;

public class CommonMethodsPage {

    /**
     * Click on Contracts Button
     * */
    public void clickContractsBtn() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 60);
        if (Browser.isElementPresent(LoginPageObjects.assessementUnitpopup())){
//            Browser.waitForSeconds(3);
            Browser.click(LoginPageObjects.assessementUnitpopup());
        }
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.contractButton(), 60);
//        Browser.waitForSeconds(5);
        Browser.click(LoginPageObjects.contractButton());
//        Browser.waitForSeconds(2);
        logger.addScreenshot("Clicked on Contracts button");
    }

    /**
     * Click on View Contracts option
     * */
    public void selectViewAllContractsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.viewAllContractsButton(), 20);
        Browser.click(LoginPageObjects.viewAllContractsButton());
        Browser.waitForSeconds(1);
        logger.addScreenshot("Navigate to View All Contracts page");
    }

    /**
     * Click on filter button
     * */
    public void clickFilterBtnOnViewAllContractsPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.filterBtnOnViewAllContractsPage(), 20);
        Browser.click(AddResidentialContractPageObjects.filterBtnOnViewAllContractsPage());
        logger.addScreenshot("Clicked on filter button");
    }


    /**
     * Click on filter button
     * @param contractNumber - Contract number
     * */
    public void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
        Browser.waitUntilPresenceOfElement(AddResidentialContractPageObjects.searchContractNumberInputField(),20);
//        Browser.waitForSeconds(3);
        Browser.setText(AddResidentialContractPageObjects.searchContractNumberInputField(), contractNumber);
        Browser.waitForSeconds(1);
        logger.addScreenshot("Entered Contract Number in search input field");
    }

    public void assertContractsAreAppearing(){
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ContractsList(), 40);
        boolean status = Browser.isElementDisplayed(CommonMethodsPageObjects.ContractsList());
        Assert.assertTrue(status, "Contracts are not displayed");
        logger.addScreenshot("All available contracts are displayed");
    }

    public void verifySearchedContractIsDisplayed(String expectedContractNumber){
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.ContractNumberOfSearchedContract(), 40);
        if (Browser.isElementDisplayed(CommonMethodsPageObjects.ContractNumberOfSearchedContract())){
            String actualContractNumber = Browser.getText(CommonMethodsPageObjects.ContractsList());
            Assert.assertEquals(actualContractNumber, expectedContractNumber, "Searched Contract is not displayed");
            logger.addScreenshot("Searched contract is displayed");
        }
        else{
            logger.addScreenshot("Searched contract is not displayed");
        }
    }


    public void clickOnKebabMenuButton(){
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuButton(), 40);
        Browser.click(CommonMethodsPageObjects.KebabMenuButton());
    }

    public void KebabMenuOptions(String option){
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuOptions(), 40);
        List<WebElement> kebabOptions = Browser.getWebElements(CommonMethodsPageObjects.KebabMenuOptions());
        boolean status = false;
        for (WebElement opt : kebabOptions){
            String optText = opt.getText();
            if (optText.contains(option)){
                status = true;
                break;
            }
        }
        Assert.assertTrue(status, option + "option is not available");
        logger.addScreenshot("");
    }
    public void ClickOnKebabMenuOption(String option){
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.KebabMenuOptions(), 40);
        List<WebElement> kebabOptions = Browser.getWebElements(CommonMethodsPageObjects.KebabMenuOptions());
        for (WebElement opt : kebabOptions){
            String optText = opt.getText();
            if (optText.contains(option)){
                opt.click();
                break;
            }
        }
    }
}
