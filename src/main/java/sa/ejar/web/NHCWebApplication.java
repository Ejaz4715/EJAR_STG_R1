package sa.ejar.web;
import com.testcrew.utility.TCRobot;
import org.openqa.selenium.chrome.ChromeDriver;
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
    public final RevokeContractPage revokeContractPage;
    public final CommonMethodsPage commonMethodsPage;

    public final TerminateContractPage terminateContractPage;

    public final ContractWaiverPage contractWaiverPage;
//    public final RechargeWalletPage rechargeWalletPage;
//    public final AddPropertyPage addPropertyPage;
//    public final RegistrationPage registrationPage;
//    public final CreateNewCommercialContract createNewCommercialContract;

    public final ChangeLessorAndLessorRepresentativePage changeLessorAndLessorRepresentativePage;

    public NHCWebApplication() {
        loginPage = new LoginPage();
        addResidentialContractPage = new AddResidentialContractPage();
        revokeContractPage = new RevokeContractPage();
        commonMethodsPage = new CommonMethodsPage();
        terminateContractPage = new TerminateContractPage();
        contractWaiverPage = new ContractWaiverPage();
//        rechargeWalletPage = new RechargeWalletPage();
//        addPropertyPage = new AddPropertyPage();
//        registrationPage = new RegistrationPage();
//        createNewCommercialContract = new CreateNewCommercialContract();
        changeLessorAndLessorRepresentativePage = new ChangeLessorAndLessorRepresentativePage();
    }

    public void openApplication(Map<String, String> data) throws Exception {

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
