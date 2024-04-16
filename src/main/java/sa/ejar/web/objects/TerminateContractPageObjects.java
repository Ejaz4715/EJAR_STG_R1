package sa.ejar.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class TerminateContractPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {

            put("A", new HashMap<>() {{
                put("ar", "");
                put("en", "");
            }});


        }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static By requestTerminationText() throws Exception{
        return By.xpath(get("//h1[text()='طلب الإنهاء']"));
    }
    public static By theContractPage() throws Exception{
        return By.xpath(get("//h1[text()='العقود']"));
    }
    public static By requestingPartyDDL() throws Exception{
        return By.xpath(get("//select[@data-name=\"requesting_party\"]"));
    }

}
