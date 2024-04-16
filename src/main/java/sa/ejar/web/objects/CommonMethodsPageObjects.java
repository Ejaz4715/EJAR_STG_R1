package sa.ejar.web.objects;

import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class CommonMethodsPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{
        // Button
        put("NA", new HashMap<>() {{
            put("en", "");
            put("ar", "");
        }});
    }};

    public static By ContractsList(){
        return By.xpath("//app-single-contract");
    }
    public static By ContractNumberOfSearchedContract(){
        return By.xpath("//h5/child::a[@class=\"btn btn-link text-primary p-0\"]");
    }
    public static By KebabMenuButton(){
        return By.xpath("//span[@class=\"round-icon large menu\"]");
    }
    public static By KebabMenuOptions() {
        return By.xpath("//a[contains (@class, \"nav-item p-3\")]");
    }
}
