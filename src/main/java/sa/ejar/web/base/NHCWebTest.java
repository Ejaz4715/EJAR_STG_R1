package sa.ejar.web.base;

import sa.ejar.web.NHCWebApplication;
import com.testcrew.web.Browser;
import com.testcrew.wrapper.base.TestCrewWebBaseTest;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

public class NHCWebTest extends TestCrewWebBaseTest {

    public NHCWebApplication app;


    public NHCWebTest() {
        app = new NHCWebApplication();
    }

    @BeforeSuite
    public void beforeSuiteNHC() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        Browser.setUserDesiredCapabilities(desiredCapabilities);
    }
}