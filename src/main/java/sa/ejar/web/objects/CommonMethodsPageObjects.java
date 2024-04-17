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
    public static By backBTN() throws Exception{
        return By.xpath(get("//button[contains(text(),' السابق')]"));
    }
    public static By confirmBTN() throws Exception{
        return By.xpath(get("//button[contains(text(),' تأكيد ')]"));
    }


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
    public static By TerminateOptions() {
        return By.xpath("//a[contains (@class,\"nav-item p-3 text-center text-danger\")]");
    }
    public static By PopUpAlertAfterCancel() {
        return By.xpath("//app-card-body/p");
    }

    public static By maxValueError() throws Exception{
        return By.xpath(get("//li[@data-error=\"errors.max_value\"]"));
    }
    public static By minValueError() throws Exception{
        return By.xpath(get("//li[@data-error=\"errors.min_value\"]"));
    }

    public static By totalAmount() throws Exception{
        return By.xpath(get("//span[text()='الإجمالي']/following-sibling::span"));
    }
    public static By hijriDate() throws Exception{
        return By.xpath(get("//span[@class=\"input-hints\"]"));
    }

}
