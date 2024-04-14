package sa.ejar.web;
import com.testcrew.utility.TCRobot;
import sa.ejar.web.objects.precondition.LoginPageObjects;
import sa.ejar.web.pages.*;
import sa.ejar.web.pages.precondition.AddResidentialContractPage;
import sa.ejar.web.pages.precondition.LoginPage;
import com.testcrew.manager.TestConfigManager;
import com.testcrew.web.Browser;

import java.awt.event.KeyEvent;
import java.util.Map;

public class NHCWebApplication {


    public final LoginPage loginPage;
    public final AddResidentialContractPage addResidentialContractPage;
//    public final RechargeWalletPage rechargeWalletPage;
//    public final AddPropertyPage addPropertyPage;
//    public final RegistrationPage registrationPage;
//    public final CreateNewCommercialContract createNewCommercialContract;

    public final ChangeLessorAndLessorRepresentativePage changeLessorAndLessorRepresentativePage;

    public NHCWebApplication() {
        loginPage = new LoginPage();
        addResidentialContractPage = new AddResidentialContractPage();
//        rechargeWalletPage = new RechargeWalletPage();
//        addPropertyPage = new AddPropertyPage();
//        registrationPage = new RegistrationPage();
//        createNewCommercialContract = new CreateNewCommercialContract();
        changeLessorAndLessorRepresentativePage = new ChangeLessorAndLessorRepresentativePage();
    }

    public void openApplication(Map<String, String> data) throws Exception {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("--disable-gpu"); // Disable GPU usage to avoid certain issues
//        chromeOptions.addArguments("--no-sandbox");
//        Browser.driver = new ChromeDriver(chromeOptions);
        if (data.get("URL") != null) {
            Browser.openUrl(data.get("URL"));
        } else {
            Browser.openUrl(TestConfigManager.getTestSettingsWebAppURL());
        }
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getButtonLogin(), 40);
        Browser.waitForSeconds(2);
        TCRobot robot = new TCRobot();
        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
        }
    }
}
