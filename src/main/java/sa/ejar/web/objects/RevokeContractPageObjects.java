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
        return By.xpath("//h1[contains (text() , 'طلب فسخ العقد من طرف واحد')]");
    }

    public static By ExecutionOrderNumberInput() {
        return By.xpath("//input[@data-name=\"execution_order_number\"]");
    }

    public static By ExecutionOrderDateInput() {
        return By.xpath("//input[@data-name=\"execution_order_date\"]");
    }

    public static By ExecutionOrderDateErrorMessage() {
        return By.xpath("//li[@data-error=\"errors.max_value\"]");
    }

    public static By CalenderIcon() {
        return By.xpath("//div[contains(@class,\"date-picker\")]");
    }

    public static By CalenderPopUp() {
        return By.xpath("//div[@class='calendar-option']");
    }

    public static By NoteInputField() {
        return By.xpath("//textarea[@data-name=\"note\"]");
    }

    public static By HijriDateUnderExecutionOrderDate() {
        return By.xpath("//span[@class='input-hints']");
    }

    public static By UploadDocumentsInput() {
        return By.xpath("(//input[@type='file'])");
    }

    public static By AttachmentIcon() {
        return By.xpath("//div[@class=\"attachment-icon\"]");
    }

    public static By ErrorMessageForLargeFile() {
        return By.xpath("//p[contains (text(), 'حجم الملف أكبر من المسموح به')]");
    }

    public static By NextButton() {
        return By.xpath("//button[contains (text(), \" التالي \")]");
    }

    public static By RequestDetailsSection() {
        return By.xpath("//h5[text()='طلب الفسخ']");
    }

    public static By ConfirmRevokeContractButton() {
        return By.xpath("//button[contains (text() , ' تأكيد طلب الفسخ  ')]");
    }

    public static By RequestNumberText() {
        return By.xpath("//h5[text()='فسخ العقد من طرف واحد']/ancestor::div[contains (@class , 'card')]/descendant::h5[contains (text(), '#')]");
    }

    public static By ViewButtonOnRequest() {
        return By.xpath("//button[contains (text(), ' عرض ')]");
    }

    public static By UnAssignButton() {
        return By.xpath("//button[contains (text() , ' إلغاء التعيين ')]");
    }

    public static By RejectReasonTextarea() {
        return By.xpath("//textarea[@data-name=\"reject_reason\"]");
    }

    public static By RejectBTNOnPopUp() {
        return By.xpath("//h2[text()='سبب الرفض ']/ancestor::app-card/descendant::button[contains (text() , ' رفض ')]");
    }
    public static By ErrorMsg() {
        return By.xpath("//app-file-upload//p[@class='error']");
    }

    public static By cancelBTNOnRequestTPage() {
        return By.xpath("//button[@routerlink=\"..\"]");
    }

    public static By RentalIncidentRequestPageHeading() {
        return By.xpath("//h1[contains (text() , 'تفاصيل الطلب')]");
    }
}
