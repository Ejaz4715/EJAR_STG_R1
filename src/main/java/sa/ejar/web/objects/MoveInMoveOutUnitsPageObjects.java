package sa.ejar.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map;

public class MoveInMoveOutUnitsPageObjects {

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

    public static By closeMoveInOutPopUp(){
        return By.xpath("//app-modal//div//button[@class='close-button']");
    }

    public static By selectYesRadioBTN(){
        return By.xpath("//form//label[text()=' نعم، بحالة جيدة ']");
    }

    public static By selectNoRadioBTN(){
        return By.xpath("//form//label[text()=' لا، لم تكن بحالة جيدة ']");
    }

    public static By NoteTextareaInput(){
        return By.xpath("//div//textarea[@formcontrolname='reason']");
    }

    public static By UploadDocumentsInput() {
        return By.xpath("//input[@type='file']");
    }

    public static By deleteUploadDocumentBTN() {
        return By.xpath("//button//i[@class='delete-icon']");
    }

    public static By DoItLaterBTN(){
        return By.xpath("//div//button[text()=' حفظ كمسودة ']");
    }

    public static By AlertMessage(){
        return By.xpath("//label[@class='card-title text-bold']");
    }

    public static By MoveInHeading() {
        return By.xpath("//div//p[@class='card-title m-0']");
    }

    public static By ViewDetails() {
        return By.xpath("//div//button[text()=' عرض التفاصيل ']");
    }

    public static By ContractHeading() {
        return By.xpath("//div//h2[text()='معلومات العقد']");
    }

    public static By ConfirmMoveInBTN() {
        return By.xpath("//section//div//button[text()='تأكيد حالة الوحدة']");
    }

    public static By MoveInStatus() {
        return By.xpath("(//app-card-value//span[@class='dash-if-empty']//span)[11]");
    }

    public static By TenantResponse() {
        return By.xpath("//p[@class='info-value mb-3']");
    }

    public static By LessorResponse() {
        return By.xpath("//p[@class='info-value mb-3']");
    }

    public static By DisplayBTN() {
        return By.xpath("//div//button[text()=' عرض ']");
    }

    public static By DownloadPDFBTN() {
        return By.xpath("//a[text()='تحميل نسخه PDF']");
    }
}