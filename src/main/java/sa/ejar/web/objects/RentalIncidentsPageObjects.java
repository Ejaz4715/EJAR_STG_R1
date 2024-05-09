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
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static By rentalIncidentTab() {
        return By.xpath("//a[text()=' الوقائع الإيجارية ']");
    }

    public static By newRentalIncidentBTN() {
        return By.xpath("//button[text()='تسجيل واقعة ايجارية جديد']");
    }

    public static By requesterTypeDDL() {
        return By.xpath("//select[@data-name=\"requester_type\"]");
    }

    public static By requesterTypeDDLOption() {
        return By.xpath("//select[@data-name=\"requester_type\"]/option");
    }

    public static By requesterCategoryDDL() {
        return By.xpath("//select[@data-name=\"requester_category\"]");
    }

    public static By requesterCategoryDDLOption() {
        return By.xpath("//select[@data-name=\"requester_category\"]/option");
    }

    public static By requesterRoleRadioBTNs() {
        return By.xpath("//app-form-radio/label");
    }

    public static By addRequesterInfoBTN() {
        return By.xpath("//button[text()=' بيانات مقدم الطلب  ']");
    }

    public static By addRequesterInfoPage() {
        return By.xpath("//h1[text()='إضافة بيانات مقدم الطلب ']");
    }

    public static By newRentalIncidentPage() {
        return By.xpath("//h1[contains(text(),'تسجيل واقعة ايجارية جديدة')]");
    }

    public static By phoneNumberInput() {
        return By.xpath("//input[@formcontrolname=\"nationalNumber\"]");
    }

    public static By requesterInfo() {
        return By.xpath("//app-rental-incident-requester-parties");
    }


    public static By AddAbstainingPartyInfoButton() {
        return By.xpath("//button[contains (text() ,'إضافة بيانات الطرف الممتنع')]");
    }

    public static By AbstainerRole() {
        return By.xpath("//app-form-radio[@formcontrolname=\"role\"]/child::label");
    }

    public static By NationalIdInputError() {
        return By.xpath("//label[text()='رقم الهوية الوطنية']/parent::app-form-field/descendant::li");
    }

    public static By DOBInputError() {
        return By.xpath("//label[text()='تاريخ الميلاد']/parent::app-form-field/descendant::li");
    }

    public static By AbstainingPartyInfoSection() {
        return By.xpath("//a[contains (@class , 'active') and text() = ' معلومات عن الطرف الممتنع ']");
    }

    public static By IdentificationAbstainingPartyIdSection() {
        return By.xpath("//a[contains (@class , 'active') and text() = ' تحديد هوية الطرف الممتنع ']");
    }

    public static By AbstainingPartyInformation() {
        return By.xpath("//p[contains (text() , 'اسم المؤجر')]");
    }

    public static By EditButtonOnAbstainingPartyInfoSection() {
        return By.xpath("//h2[text() = 'بيانات الطرف الممتنع']/ancestor::app-card/descendant::button[contains(text(),'تعديل')]");
    }

    public static By DeleteButtonOnAbstainingPartyInfoSection() {
        return By.xpath("//h2[text() = 'بيانات الطرف الممتنع']/ancestor::app-card/descendant::button[@data-test-id=\"requester.delete_requester\"]");
    }

    public static By ContractPeriodSectionTitle() {
        return By.xpath("//h2[contains (text(), 'مدة العقد')]");
    }

    public static By ContractPeriodDateInputField() {
        return By.xpath("//input[@data-name=\"contract_start_date\"]");
    }

    public static By ContractTypeDropDown() {
        return By.xpath("//select[@data-name=\"contract_type\"]");
    }

    public static By ContractTypeDropDownOptionsList() {
        return By.xpath("//select[@data-name=\"contract_type\"]/child::option");
    }

    public static By DurationYearInputFieldOnCalenderPopUp() {
        return By.xpath("//input[@data-name=\"years\"]");
    }

    public static By TotalRequestAmount() {
        return By.xpath("//span[text()=' اجمالي قيمة رسوم الطلب ']/parent::div/following-sibling::div[1]/child::p");
    }

    public static By TotalNumberOfYears() {
        return By.xpath("//span[text()=' عدد سنوات العقد ']/parent::div/following-sibling::div[1]/child::p");
    }

    public static By AnnualRentInputField() {
        return By.xpath("//input[@data-name=\"contract_annual_rent_value\"]");
    }

    public static By DaysInputField() {
        return By.xpath("//input[@data-name=\"days\"]");
    }

    public static By BORegistrationInputField() {
        return By.xpath("//input[@data-name=\"bo_register_number\"]");
    }

    public static By PopUpErrorMessage() {
        return By.xpath("//div[@class='message']");
    }

    public static By organizationRadioBTN() {
        return By.xpath("//app-form-radio[@formcontrolname=\"selectedOrganizationId\"]");
    }

    public static By organizationInfoSection() {
        return By.xpath("//a[text()=' بيانات المنشأة ']");
    }

    public static By continueToRepresentativeInfoBTN() {
        return By.xpath("//button[text()=' الاستمرار في معلومات المفوض ']");
    }

    public static By organizationIdentificationSection() {
        return By.xpath("//a[text()=' بيانات ممثل المنشأة ']");
    }

    public static By addOwnershipDocumentLinkBTN() {
        return By.xpath("//a[text()=' إضافة وثيقة ملكية ']");
    }

    public static By ownershipDocumentIdentificationSection() {
        return By.xpath("//a[text()=' تحديد وثيقة ملكية ']");
    }

    public static By assertOwnershipDocument() {
        return By.xpath("//p[text()=' وثيقة ملكية']");
    }

    public static By overSizeErrorMsg() {
        return By.xpath("//p[@class=\"error\"]");
    }

    public static By differentFormatAttachment() {
        return By.xpath("//p[@class=\"browse-file-text\"]");
    }

    public static By approveOfDeclarationCheckbox() {
        return By.xpath("//app-form-checkbox[@formcontrolname=\"approval_declaration\"]");
    }

    public static By approveOfDeclarationCheckboxSelected() {
        return By.xpath("//input[@data-name=\"approval_declaration\"]");
    }

    public static By reasonRefusalRadioBTN() {
        return By.xpath("//app-form-radio[@formcontrolname=\"refusalReason\"][1]");
    }

    public static By rentalIncidentRequestNumber() {
        return By.xpath("//span[text()='نفيدك باستلام طلب تسجيل واقعة إيجارية رقم ']/strong[1]");
    }

    public static By availableUnit() {
        return By.xpath("//h5//span[contains(@class,'ms')]");
    }

    public static By RentalIncidentPage() {
        return By.xpath("//h1[contains (text(), 'الوقائع الإيجارية')]");
    }

    public static By CRInformation() {
        return By.xpath("//p[contains (text() , 'رقم السجل التجاري')]");
    }

    public static By IDNumberOfPersonWriteTheContractInput() {
        return By.xpath("//input[@data-name=\"person_id_number\"]");
    }

    public static By PhoneNumberOfPersonWriteTheContractInput() {
        return By.xpath("//input[@data-name=\"nationalNumber\"]");
    }

    public static By InputFieldErrorMessage() {
        return By.xpath("//ul/child::li[contains (@data-error, \"error\")]");
    }

    public static By rejectTheRequestPopUp() {
        return By.xpath("//h2[text()=' رفض الطلب ']");
    }

    public static By rejectReasonTextarea() {
        return By.xpath("//textarea[@formcontrolname=\"rejectReason\"]");
    }

    public static By rejectConfirmationMsg() {
        return By.xpath("//p[contains(text(),'تأكيد رفض طلب واقعة إيجاريه')]");
    }

    public static By RentalIncidentRequestStatus() {
        return By.xpath("//p[contains (text() , 'حالة ')]/parent::app-info/descendant::p/child::span");
    }

    public static By SendToLegalAuthoritiesBTN() {
        return By.xpath("//button[contains (text(), 'ارسال للجهات القانونية')]");
    }

    public static By SendToLegalAuthoritiesPopUp() {
        return By.xpath("//h2[text()=' ارسال للجهات القانونية ']");
    }

    public static By ViewAttachmentButton() {
        return By.xpath("(//app-card/descendant::button[contains(text(),'عرض')])[1]");
    }

    public static By CommentForLegalAuthorities() {
        return By.xpath("//label[contains (text() , 'تعليقك')]/parent::app-form-field/descendant::textarea");
    }

    public static By SendRequestButton() {
        return By.xpath("//button[contains (text(), 'رسال الطلب')] | //button[contains (text(), ' إرسال ')] ");
    }

    public static By ReviewedByLegalAuthorityButton() {
        return By.xpath("//button[text()=' تمت مراجعة الإدارة القانونية ']");
    }

    public static By ApproveRequestButton() {
        return By.xpath("//button[text()=' الموافقة علي الطلب ']");
    }

    public static By WarningPopUpTitle() {
        return By.xpath("//h2[text()=' رسالة تنبيه ']");
    }

    public static By ApproveButtonOnPopup() {
        return By.xpath("//button[text()=' الموافقة ']");
    }

    public static By UpdateAndResubmitButton() {
        return By.xpath("//button[text()=' تحديث واعادة ارسال ']");
    }

    public static By CheckBoxesForUpdateAndResubmitPopup() {
        return By.xpath("//label[@class=\"form-check-label\"]");
    }
}
