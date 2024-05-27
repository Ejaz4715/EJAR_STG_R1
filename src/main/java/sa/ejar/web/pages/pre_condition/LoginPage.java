package sa.ejar.web.pages.pre_condition;

import com.testcrew.base.WebBasePage;
import com.testcrew.manager.ReportManager;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.pre_condition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.pre_condition.LoginPageObjects;

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
        Browser.setText(LoginPageObjects.setTextPassword(), data.get("Password"));
        logger.addScreenshot("Enter User Name & Password");
    }

    public void enterPassword(String password) throws Exception {
        logger.info("Enter Password As : " + password);
        Browser.setText(LoginPageObjects.setTextPassword(), password);
        logger.addScreenshot("After Enter User credential");
    }

    public void clickLogin() throws Exception {
        Browser.click(LoginPageObjects.getButtonLogin());
    }

    public void closePopUp() throws Exception {
        Browser.waitForSeconds(5);
        Browser.click(LoginPageObjects.popUpButton());
    }

    public void enterAdminUsername(String User) throws Exception {
        logger.info("Enter User Name : " + User);
        Browser.setText(LoginPageObjects.setUserName(), User);
    }

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
        List<WebElement> list = driver.findElements(LoginPageObjects.getLanguage());
        for (WebElement w : list) {
            if (language.equalsIgnoreCase("en") && expectedHeading.equalsIgnoreCase(actualHeading)) {
                dropDownLanguage = w.getText();
                if (dropDownLanguage.equalsIgnoreCase("EN")) {
                    w.click();
                    break;
                }

            } else if (language.equalsIgnoreCase("ar") && expectedHeading.equalsIgnoreCase(actualHeading)) {
                break;
            }
        }
        logger.addScreenshot("Switch to arabic");
    }


    // Assert functions
    public void assertLoginPageDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getDashboardHeading(), 20);
        Assert.assertTrue(Browser.isElementPresent(LoginPageObjects.getDashboardHeading()),
                "Login Page is displayed.");
        Browser.waitForSeconds(1);
        logger.addScreenshot("Login Page displayed.");
    }

    public void enterVerificationCode(String OTP) throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getVerificationCode(), 20);
        Browser.setText(LoginPageObjects.getVerificationCode(), OTP);
        Browser.waitForSeconds(1);
        Browser.click(LoginPageObjects.confirmButton());
        logger.addScreenshot("OTP entered");
    }

    public void enterVerificationCodeForOTP(String OTP) throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getVerificationCode(), 20);
        Browser.setText(LoginPageObjects.getVerificationCode(), OTP);
        Browser.waitForSeconds(1);
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
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 40);
        while (Browser.isElementPresent(LoginPageObjects.exploreEjarPopUp()) || Browser.isElementPresent(LoginPageObjects.closeButton2())
                || Browser.isElementPresent(LoginPageObjects.closeButton1())) {
            Browser.waitForSeconds(1);
            if (Browser.isElementPresent(LoginPageObjects.closeButton2())) {
                Browser.click(LoginPageObjects.closeButton2());
            } else if (Browser.isElementPresent(LoginPageObjects.exploreEjarPopUp())) {
                Browser.click(LoginPageObjects.closeButton1());
            } else if (Browser.isElementPresent(LoginPageObjects.closeButton1())) {
                Browser.click(LoginPageObjects.closeButton1());
            }
            Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 40);
        }
//        if (Browser.isElementPresent(LoginPageObjects.exploreEjarPopUp())) {
//            Browser.waitUntilVisibilityOfElement(LoginPageObjects.exploreEjarPopUp(),40);
//            Browser.click(LoginPageObjects.closeButton1());
//        }
//        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 40);
//        if (Browser.isElementPresent(LoginPageObjects.closeButton2())) {
//            Browser.waitUntilVisibilityOfElement(LoginPageObjects.closeButton2(),40);
//            Browser.click(LoginPageObjects.closeButton2());
//        }
//        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 40);
//        if (Browser.isElementPresent(LoginPageObjects.closeButton1())) {
//            Browser.waitUntilVisibilityOfElement(LoginPageObjects.closeButton1(),40);
//            Browser.click(LoginPageObjects.closeButton1());
//        }
//        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 40);
//        if (Browser.isElementPresent(LoginPageObjects.closeButton1())) {
//            Browser.waitUntilVisibilityOfElement(LoginPageObjects.closeButton1(),40);
//            Browser.click(LoginPageObjects.closeButton1());
//
//        }
//        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 40);
//        if (Browser.isElementPresent(LoginPageObjects.closeButton1())) {
//            Browser.waitUntilVisibilityOfElement(LoginPageObjects.closeButton1(),40);
//            Browser.click(LoginPageObjects.closeButton1());
//
//        }
    }

    public void acceptTerms() throws Exception {
        if (Browser.isElementPresent(LoginPageObjects.firstTerm())) {
            Browser.click(LoginPageObjects.firstTerm());
            Browser.waitForSeconds(2);
            Browser.click(LoginPageObjects.secondTerm());
            Browser.waitForSeconds(2);
            logger.addScreenshot("");
            Browser.waitForSeconds(2);
            Browser.click(LoginPageObjects.confirmTermsButton());
            Browser.waitForSeconds(5);
        }
        if (Browser.isElementPresent(LoginPageObjects.closeButton2())) {
            Browser.click(LoginPageObjects.closeButton2());
            Browser.waitForSeconds(5);
        }
    }
}


