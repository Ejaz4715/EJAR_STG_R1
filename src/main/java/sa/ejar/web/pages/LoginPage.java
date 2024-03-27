package sa.ejar.web.pages;

import com.testcrew.base.WebBasePage;
import com.testcrew.manager.ReportManager;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.AddResidentialContractPageObjects;
import sa.ejar.web.objects.LoginPageObjects;
import java.util.List;
import java.util.Map;

import static com.testcrew.web.Browser.driver;

public class LoginPage extends WebBasePage {
    public static final ReportManager logger = new ReportManager(LoginPage.class);

    // Page actions
    public void enterUsername(String UserName) throws Exception {
        logger.info("Enter UserName As : " + UserName);
        Browser.setText(LoginPageObjects.setTextEmail(), UserName);
    }

    public void enterBORegistrationPassword(Map<String, String> data) throws Exception {
//        logger.info("Enter Password  As : " + data.get("Password"));
        Browser.setText(LoginPageObjects.setTextPassword(), data.get("Password"));
        logger.addScreenshot("Enter User Name & Password");
    }

    public void enterPassword(String password) throws Exception {
        logger.info("Enter Password As : " + password);
        Browser.setText(LoginPageObjects.setTextPassword(), password);
//        Browser.waitForSeconds(1);
        logger.addScreenshot("After Enter User credential");
    }

    public void clickLogin() throws Exception {
//        Browser.doubleClick(LoginPageObjects.getButtonLogin());
//        while(!(Browser.isElementPresent(LoginPageObjects.getVerificationCode()))){
            Browser.click(LoginPageObjects.getButtonLogin());
//            Browser.waitForSeconds(2);
//        }
//        if (){
//            Browser.doubleClick(LoginPageObjects.getButtonLogin());
//        }
////        Browser.click(LoginPageObjects.getButtonLogin());
//        Browser.waitForSeconds(2);
    }

    public void closePopUp() throws Exception {
        Browser.waitForSeconds(5);
        Browser.click(LoginPageObjects.popUpButton());
    }

    public void enterAdminUsername(String User) throws Exception {
        logger.info("Enter User Name : " + User);
        Browser.setText(LoginPageObjects.setUserName(), User);
    }
  /*  public void changeUILanguage(String language) throws Exception {
        logger.info("Change Language");
        Browser.waitUntilVisibilityOfElement(getDashboardHeading(), 20);
    }*/

    public void clickConfirmButton() throws Exception {
        logger.info("Click Confirm");
        Browser.click(LoginPageObjects.confirmButton());
    }

    public void changeUILanguage(String language) throws Exception {
        logger.info("Change Language");
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getDashboardHeading(), 20);
        Browser.waitForSeconds(3);
        String actualHeading = Browser.getWebElement(LoginPageObjects.getDashboardHeading()).getText();
        String dropDownLanguage;
        String expectedHeading = "الخدمات الإلكترونية";
        Browser.getWebElement(LoginPageObjects.getButtonLanguage()).click();
        List<WebElement> list =  driver.findElements(LoginPageObjects.getLanguage());
        for (WebElement w : list) {
            if (language.equalsIgnoreCase("en") && expectedHeading.equalsIgnoreCase(actualHeading)) {
                dropDownLanguage = w.getText();
                if(dropDownLanguage.equalsIgnoreCase("EN")){
                    w.click();
                    break;
                }

            }
            else if(language.equalsIgnoreCase("ar")&& expectedHeading.equalsIgnoreCase(actualHeading)){
                break;
            }
        }
        logger.addScreenshot("Switch to arabic");
    }

//    public void login(Map<String, String> data) throws Exception {
//        logger.info("Login to application.");
//        enterUsername(data.get("Email"));
//        enterPassword(data.get("Password"));
//        clickLogin();
//    }


    // Assert functions
    public void assertLoginPageDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getDashboardHeading(), 20);
        Assert.assertTrue(Browser.isElementPresent(LoginPageObjects.getDashboardHeading()),
                "Login Page is displayed.");
        Browser.waitForSeconds(1);
        logger.addScreenshot("Login Page displayed.");
    }

    public void enterVerificationCode() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
//        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getVerificationCode(), 20);
        Browser.setText(LoginPageObjects.getVerificationCode(), "1234");
        Browser.waitForSeconds(1);
        logger.addScreenshot("Enter OTP");
//        Browser.waitForSeconds(2);
        Browser.click(LoginPageObjects.confirmButton());
//        Browser.waitForSeconds(4);
    }

    public void clickLogout() throws Exception {
        Browser.waitForSeconds(3);
        Browser.click(LoginPageObjects.adminDropdownMenu());
        Browser.waitForSeconds(2);
        Browser.click(LoginPageObjects.clickLogOut());
        logger.addScreenshot("Click on Logout");
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
        Browser.waitForSeconds(3);
    }

    public void closeExploreEjarPopUp() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 30);
        if (Browser.isElementPresent(LoginPageObjects.exploreEjarPopUp())) {
            Browser.waitUntilVisibilityOfElement(LoginPageObjects.exploreEjarPopUp(),20);
//            Browser.waitForSeconds(5);
//            logger.addScreenshot("");
//            Browser.waitForSeconds(1);
            Browser.click(LoginPageObjects.closeButton1());
//            Browser.waitForSeconds(1);
//            logger.addScreenshot("Close Explore Ejar PopUp");
        }

        Browser.waitForSeconds(1);
        if (Browser.isElementPresent(LoginPageObjects.closeButton2())) {
//            logger.addScreenshot("");
//            Browser.waitForSeconds(2);
            Browser.click(LoginPageObjects.closeButton2());
//            Browser.waitForSeconds(2);
        }
       /* if (Browser.isElementPresent(LoginPageObjects.popUpButton())){
            Browser.waitForSeconds(5);
            Browser.click(LoginPageObjects.popUpButton());
        }*/
    }

    public void acceptTerms() throws Exception {
        if(Browser.isElementPresent(LoginPageObjects.firstTerm())) {
            Browser.click(LoginPageObjects.firstTerm());
            Browser.waitForSeconds(2);
            Browser.click(LoginPageObjects.secondTerm());
            Browser.waitForSeconds(2);
            logger.addScreenshot("");
            Browser.waitForSeconds(2);
            Browser.click(LoginPageObjects.confirmTermsButton());
            Browser.waitForSeconds(5);
        }
        if(Browser.isElementPresent(LoginPageObjects.closeButton2())){
            Browser.click(LoginPageObjects.closeButton2());
            Browser.waitForSeconds(5);
        }
    }
}


