package sa.ejar.web;

import com.testcrew.utility.TCRobot;
import sa.ejar.web.objects.pre_condition.LoginPageObjects;
import sa.ejar.web.pages.*;
import sa.ejar.web.pages.pre_condition.*;
import com.testcrew.manager.TestConfigManager;
import com.testcrew.web.Browser;

import java.awt.event.KeyEvent;
import java.util.Map;


public class NHCWebApplication {


    /**
     * Pre-conditions - Different type of contracts
     * */
    public final LoginPage loginPage;
    public final AddResidentialContractPage addResidentialContractPage;
    public final CreateNewCommercialContractPage createNewCommercialContractPage;
    public final AddSubleaseContractPage addSubleaseContractPage;

    /**
     * Regression pack
     * */
    public final RevokeContractPage revokeContractPage;
    public final TerminateContractPage terminateContractPage;
    public final ContractWaiverPage contractWaiverPage;
    public final SendContractForApprovalPage sendContractForApprovalPage;
    public final MoveInMoveOutUnitsPage moveInMoveOutUnitsPage;
    public final RentalIncidentsPage rentalIncidentsPage;
    public final ChangeTenantActivityPage changeTenantActivityPage;
    public final ManualRenewalPage manualRenewalPage;
    public final ChangeLessor_LessorRepPage changeLessor_lessorRepPage;
    public final AutomaticRenewalPage automaticRenewalPage;



    public NHCWebApplication() {
        loginPage = new LoginPage();
        addResidentialContractPage = new AddResidentialContractPage();
        revokeContractPage = new RevokeContractPage();
        terminateContractPage = new TerminateContractPage();
        contractWaiverPage = new ContractWaiverPage();
        sendContractForApprovalPage = new SendContractForApprovalPage();
        rentalIncidentsPage = new RentalIncidentsPage();
        moveInMoveOutUnitsPage = new MoveInMoveOutUnitsPage();
        changeTenantActivityPage = new ChangeTenantActivityPage();
        manualRenewalPage = new ManualRenewalPage();
        changeLessor_lessorRepPage = new ChangeLessor_LessorRepPage();
        createNewCommercialContractPage = new CreateNewCommercialContractPage();
        addSubleaseContractPage = new AddSubleaseContractPage();
        automaticRenewalPage = new AutomaticRenewalPage();
    }

    public void openApplication(Map<String, String> data) throws Exception {
        if (data.get("URL") != null) {
            Browser.openUrl(data.get("URL"));
        } else {
            Browser.openUrl(TestConfigManager.getTestSettingsWebAppURL());
        }
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getButtonLogin(), 40);
        Browser.waitForSeconds(1);
        TCRobot robot = new TCRobot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }
    }
}
