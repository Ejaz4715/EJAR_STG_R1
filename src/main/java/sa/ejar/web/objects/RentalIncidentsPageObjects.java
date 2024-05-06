package sa.ejar.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class RentalIncidentsPageObjects {


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
    public static By rentalIncidentTab(){
        return By.xpath("//a[text()=' الوقائع الإيجارية ']");
    }

    public static By newRentalIncidentBTN(){
        return By.xpath("//button[text()='تسجيل واقعة ايجارية جديد']");
    }
    public static By requesterTypeDDL(){
        return By.xpath("//select[@data-name=\"requester_type\"]");
    }
    public static By requesterTypeDDLOption(){
        return By.xpath("//select[@data-name=\"requester_type\"]/option");
    }

    public static By requesterCategoryDDL(){
        return By.xpath("//select[@data-name=\"requester_category\"]");
    }
    public static By requesterCategoryDDLOption(){
        return By.xpath("//select[@data-name=\"requester_category\"]/option");
    }

    public static By requesterRoleRadioBTNs(){
        return By.xpath("//app-form-radio/label");
    }
    public static By addRequesterInfoBTN(){
        return By.xpath("//button[text()=' بيانات مقدم الطلب  ']");
    }
    public static By addRequesterInfoPage(){
        return By.xpath("//h1[text()='إضافة بيانات مقدم الطلب ']");
    }
    public static By newRentalIncidentPage(){
        return By.xpath("//h1[contains(text(),'تسجيل واقعة ايجارية جديدة')]");
    }
    public static By phoneNumberInput(){
        return By.xpath("//input[@formcontrolname=\"nationalNumber\"]");
    }
    public static By requesterInfo(){
        return By.xpath("//app-rental-incident-requester-parties");
    }


    public static By AddAbstainingPartyInfoButton() {
        return By.xpath("//button[contains (text() ,'إضافة بيانات الطرف الممتنع')]");
    }

    public static By AbstainerRole() {
        return By.xpath("//app-form-radio[@formcontrolname=\"role\"]/child::label");
    }

    public static By NationalIdInputError() {
        return By.xpath("//li[contains (@data-error, \"min\")]");
    }
}
