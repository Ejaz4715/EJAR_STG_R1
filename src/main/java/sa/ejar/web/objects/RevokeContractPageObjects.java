package sa.ejar.web.objects;

import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class RevokeContractPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {{
        // Button
        put("NA", new HashMap<>() {{
            put("en", "");
            put("ar", "");
        }});
    }};

    public static By RevokeContractPageHeading() {
        return By.xpath("//h2[text()='طلب فسخ العقد']");
    }
}
