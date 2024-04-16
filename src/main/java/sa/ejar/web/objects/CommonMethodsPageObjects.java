package sa.ejar.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class CommonMethodsPageObjects {


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


    public static By nextBTN() throws Exception{
        return By.xpath(get("//button[contains(text(),'التالي')]"));
    }
    public static By cancelBTN() throws Exception{
        return By.xpath(get("//button[contains(text(),' إلغاء')]"));
    }

}
