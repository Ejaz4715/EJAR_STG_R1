package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.precondition.LoginPageObjects;

import java.util.List;

import static com.testcrew.web.Browser.driver;
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
     * @param contractNumber
     * */
    public void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
        Browser.waitUntilPresenceOfElement(AddResidentialContractPageObjects.searchContractNumberInputField(),20);
//        Browser.waitForSeconds(3);
        Browser.setText(AddResidentialContractPageObjects.searchContractNumberInputField(), contractNumber);
        Browser.waitForSeconds(1);
        logger.addScreenshot("Entered Contract Number in search input field");
    }

    public void clickOnNextButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.nextBTN(),20);
        Browser.click(CommonMethodsPageObjects.nextBTN());
    }
    public void clickOnCancelButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(CommonMethodsPageObjects.cancelBTN(),20);
        Browser.click(CommonMethodsPageObjects.cancelBTN());
    }

    public static void selectFromList(String list, By element) throws Exception {
        Browser.waitUntilVisibilityOfElement(element, 30);
        List<WebElement> selectList = driver.findElements(element);
        for (WebElement listName : selectList) {
            String getListName = listName.getText();
            if (getListName.contains(list)) {
                listName.click();
                break;
            }
        }
    }
}
