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

    public static By RevokeContractRequestPageHeading() {
        return By.xpath("//h1[text()='طلب فسخ العقد من طرف واحد']");
    }

    public static By ExecutionOrderNumberInput() {
        return By.xpath("//input[@data-name=\"execution_order_number\"]");
    }

    public static By ExecutionOrderDateInput() {
        return By.xpath("//input[@data-name=\"execution_order_date\"]");
    }
}
