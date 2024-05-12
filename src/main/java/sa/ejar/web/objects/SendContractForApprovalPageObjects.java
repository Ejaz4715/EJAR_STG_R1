package sa.ejar.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class SendContractForApprovalPageObjects {

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
    public static By sendForApprovalBTN() throws Exception{
        return By.xpath("(//app-button//button[text()=' الإرسال للتوثيق '])[1]");
    }
    public static By contractStepsPage() throws Exception{
        return By.xpath("//h5[text()='خطوات العقد']");
    }
    public static By previewContractSection() {
        return By.xpath("//a[text()=' معاينة العقد ']");
    }

    public static By downloadDraftCopyBTN() {
        return By.xpath("//button[text()=' تحميل مسودة العقد ']");
    }

    public static By previewBrokerageAgreementSection() {
        return By.xpath("//a[text()=' معاينة اتفاقية الوساطة ']");
    }
    public static By addBTN() {
        return By.xpath("//a[text()=' إضافة ']");
    }
    public static By agreementScopePage() {
        return By.xpath("//h2[text()='نطاق الإتفاقية']");
    }
    public static By editBTN() {
        return By.xpath("//button[text()=' تعديل ']");
    }
    public static By addAnAdditionalTermsBTN() {
        return By.xpath("//a[text()=' إضافة شروطًا إضافية ']");
    }
    public static By additionalTermsPage() {
        return By.xpath("//h2[text()='بنود وشروط إضافية']");
    }
    public static By additionalTermsSwitchBTN() {
        return By.xpath("//app-switch-input[@formcontrolname=\"custom_terms_accepted\"]/label/span");
    }
    public static By addAnotherAdditionalTermsBTN() {
        return By.xpath("//a[text()=' إضافة بند آخر ']");
    }
    public static By addAnotherAdditionalTermsPopupWindow() {
        return By.xpath("//h2[text()='إضافة بند آخر']");
    }

    public static By additionalTermsTextarea() {
        return By.xpath("//textarea[@data-name=\"content\"]");
    }
    public static By theEnteredAdditionalTerms() {
        return By.xpath("//app-card-body[@data-test=\"persisted-custom-terms\"]/p");
    }
    public static By theEnteredAdditionalTermsRemoved() {
        return By.xpath("//app-card-body[@data-test=\"persisted-custom-terms\"]");
    }

    public static By addAnotherAdditionalTermsErrorMsg() {
        return By.xpath("//h5[text()='فشل التحققّ من الصحة']");
    }
    public static By addAnotherAdditionalTermsErrorMsgContent() {
        return By.xpath("//div[@class=\"message\"]");
    }

    public static By confirmTermsAndConditionsBTN() {
        return By.xpath("//button[text()=' تأكيد الشروط والأحكام ']");
    }
    public static By continueToPayingFeesBTN() {
        return By.xpath("//button[text()=' الاستمرار في دفع الرسوم ']");
    }
    public static By payingEjarFeesSection() {
        return By.xpath("//h2[text()='دفع رسوم إيجار']");
    }
    public static By contractSentMsg() {
        return By.xpath("//p[text()=' تم إرسال العقد للطرفين. ']");
    }

    public static By contractApprovalStepsPage() {
        return By.xpath("//h2[text()='خطوات الموافقة على العقد']");
    }
    public static By lestUsStartBTN() {
        return By.xpath("//button[text()=' لنبدأ ']");
    }

    public static By reviewTheContractPage() {
        return By.xpath("//h1[text()=' مراجعة معلومات العقد ']");
    }
    public static By rejectTheContractPage() {
        return By.xpath("//h2[text()='لماذا ترغب بالرفض']");
    }
    public static By rejectionReasonTextarea() {
        return By.xpath("//textarea[@formcontrolname=\"custom_reason\"]");
    }
    public static By rejectTheContractBTN() {
        return By.xpath("//button[text()=' رفض العقد ']");
    }
    public static By identityVerification() {
        return By.xpath("//h2[text()='التحقق من الهوية.']");
    }
    public static By identityVerificationBTN() {
        return By.xpath("//button[contains(text(), 'التحقق من الهوية')]");
    }

    public static By wrongOTPMsg() {
        return By.xpath("//li[contains(text(), 'OTP غير صالح')]");
    }
    public static By rejectionSubmittedMsg() {
        return By.xpath("//h2[text()= 'تم إرسال الرفض']");
    }
    public static By reviewAgreementPage() {
        return By.xpath("//h1[text()=' مراجعة اتفاقية الوساطة ']");
    }

    public static By approvalDisclaimerPage() {
        return By.xpath("//h2[text()='إخلاء المسؤولية']");
    }
    public static By submitContractApprovalBTN() {
        return By.xpath("//button[text()=' إرسال الموافقة على العقد ']");
    }

    public static By agreeToTheAboveCheckbox() {
        return By.xpath("//app-form-checkbox/child::label");
    }
    public static By approvalConfirmedMsg() {
        return By.xpath("//h2[text()='تمت الموافقة']");
    }

    public static By sendForApprovalCheckboxes() {
        return By.xpath("//input[@type=\"checkbox\"]/following-sibling::label");
    }

    public static By downloadBTN() {
        return By.xpath("(//button[text()=' تحميل '])[1]");
    }

}
