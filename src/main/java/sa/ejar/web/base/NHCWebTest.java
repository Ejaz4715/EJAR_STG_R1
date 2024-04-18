package sa.ejar.web.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import sa.ejar.web.NHCWebApplication;
import com.testcrew.web.Browser;
import com.testcrew.wrapper.base.TestCrewWebBaseTest;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import java.util.HashMap;
import java.util.Map;

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

        //Set download path
        String downloadDir = System.getProperty("user.dir") + "\\src\\main\\downloads";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("download.default_directory=" + downloadDir);
        Browser.driver = new ChromeDriver(options);
    }
}