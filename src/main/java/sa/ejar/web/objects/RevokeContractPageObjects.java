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

    public static By ExecutionOrderDateErrorMessage() {
        return By.xpath("//li[@data-error=\"errors.max_value\"]");
    }

    public static By CalenderIcon() {
        return By.xpath("//div[@class=\"date-picker-button\"]");
    }

    public static By CalenderPopUp() {
        return By.xpath("//div[@class=\"calendar-option\"]");
    }

    public static By NoteInputField() {
        return By.xpath("//textarea[@data-name=\"note\"]");
    }

    public static By HijriDateUnderExecutionOrderDate() {
        return By.xpath("//span[@class='input-hints']");
    }

    public static By UploadDocumentsInput() {
        return By.xpath("//input[@data-name=\"execution_order_documents\"]");
    }

    public static By AttachmentIcon() {
        return By.xpath("//div[@class=\"attachment-icon\"]");
    }

    public static By ErrorMessageForLargeFile() {
        return By.xpath("//p[contains (text(), 'حجم الملف أكبر من المسموح به. أقصى حجم للملف يجب أن لا يتعدى 20 ميغابت')]");
    }

    public static By NextButton() {
        return By.xpath("//button[contains (text(), \" التالي \")]");
    }

    public static By RequestDetailsSection() {
        return By.xpath("//h5[text()='طلب الفسخ']");
    }

    public static By ConfirmRevokeContratButton() {
        return By.xpath("//button[contains (text() , ' تأكيد طلب الفسخ  ')]");
    }

    public static By RequestNumberText() {
        return By.xpath("//button[contains (text() , ' تأكيد طلب الفسخ  ')]");
    }
}
