package sa.ejar.web.pages.pre_condition;

import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import sa.ejar.web.objects.pre_condition.AddResidentialContractPageObjects;
import sa.ejar.web.objects.pre_condition.LoginPageObjects;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

import static com.testcrew.web.Browser.logger;

public class LoginPage {

    public void enterUsername(String UserName) throws Exception {
        Browser.setText(LoginPageObjects.setTextEmail(), UserName);
    }

    public void enterPassword(String password) throws Exception {
        Browser.setText(LoginPageObjects.setTextPassword(), password);
        logger.addScreenshot("Username & password is entered");
    }

    public void clickLogin(String id) throws Exception {
        Browser.click(LoginPageObjects.getButtonLogin());
        String code = Browser.getText(LoginPageObjects.NafathCode()).toLowerCase();
        logger.addScreenshot("");
        Assert.assertNotEquals(code, "null");
        approveNafathReq(id);
    }

    public void approveNafathReq(String idNumber) throws AWTException {
        ((JavascriptExecutor) Browser.driver).executeScript("window.open()");
        Set<String> tabs = Browser.driver.getWindowHandles();
        String[] arrayTabs = tabs.toArray(new String[0]);
        Browser.driver.switchTo().window(arrayTabs[1]);
        Browser.driver.navigate().to("https://api-test.rega.gov.sa/v1/iam/admin/admin-panel");
        Browser.waitForSeconds(1);
        TCRobot robot = new TCRobot();
        robot.setText("admin");
        robot.keyPress(KeyEvent.VK_TAB);
        Browser.waitForSeconds(1);
        robot.setText("Admin@1234");
        robot.keyPress(KeyEvent.VK_ENTER);
        Browser.waitForSeconds(2);
        Browser.driver.navigate().refresh();
        Browser.waitUntilPresenceOfElement(LoginPageObjects.NafathApprove(idNumber), 40);
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.NafathApprove(idNumber), 40);
        Browser.click(LoginPageObjects.NafathApprove(idNumber));
        Browser.driver.switchTo().window(arrayTabs[1]);
        Browser.driver.close();
        Browser.driver.switchTo().window(arrayTabs[0]);
    }

    public void enterVerificationCode(String OTP) throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getVerificationCode(), 20);
        Browser.setText(LoginPageObjects.getVerificationCode(), OTP);
        Browser.waitForSeconds(1);
        Browser.click(LoginPageObjects.confirmButton());
        logger.addScreenshot("OTP is entered");
    }

    public void enterVerificationCodeForOTP(String OTP) throws Exception {
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getVerificationCode(), 20);
        Browser.setText(LoginPageObjects.getVerificationCode(), OTP);
        Browser.waitForSeconds(1);
    }

    public void closeExploreEjarPopUp() throws Exception {
        Browser.waitForSeconds(4);
        for (int i = 0; i <= 2; i++) {
            if (Browser.isElementPresent(LoginPageObjects.exploreEjarPopUp())) {
                Browser.waitUntilVisibilityOfElement(LoginPageObjects.closeButton1(), 40);
                Browser.click(LoginPageObjects.closeButton1());
            } else if (Browser.isElementPresent(LoginPageObjects.closeButton2())) {
                Browser.waitUntilVisibilityOfElement(LoginPageObjects.closeButton2(), 40);
                Browser.click(LoginPageObjects.closeButton2());
            } else if (Browser.isElementPresent(LoginPageObjects.closeButton1())) {
                Browser.waitUntilVisibilityOfElement(LoginPageObjects.closeButton1(), 40);
                Browser.click(LoginPageObjects.closeButton1());
            }
        }
    }
}


