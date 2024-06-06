package sa.ejar.web.pages.pre_condition;

import com.testcrew.base.WebBasePage;
import com.testcrew.web.Browser;
import sa.ejar.web.objects.pre_condition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.pre_condition.LoginPageObjects;
import static com.testcrew.web.Browser.logger;

public class LoginPage extends WebBasePage {

    public void enterUsername(String UserName) throws Exception {
        logger.info("Enter UserName As : " + UserName);
        Browser.setText(LoginPageObjects.setTextEmail(), UserName);
    }

    public void enterPassword(String password) throws Exception {
        Browser.setText(LoginPageObjects.setTextPassword(), password);
        logger.addScreenshot("Username & password is entered");
    }

    public void clickLogin() throws Exception {
        Browser.click(LoginPageObjects.getButtonLogin());
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

    public void closeExploreEjarPopUp() throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 20);
        while (Browser.isElementPresent(LoginPageObjects.exploreEjarPopUp()) || Browser.isElementPresent(LoginPageObjects.closeButton2()) || Browser.isElementPresent(LoginPageObjects.closeButton1())) {
            if (Browser.isElementPresent(LoginPageObjects.closeButton1())) {
                Browser.click(LoginPageObjects.closeButton1());
            } else{
                Browser.click(LoginPageObjects.closeButton2());
            }
            Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 20);
        }
    }
}


