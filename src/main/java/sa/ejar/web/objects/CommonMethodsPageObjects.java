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


        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static By nextBTN() {
        return By.xpath("//button[contains(text(),'التالي')]");
    }

    public static By cancelBTN() {
        return By.xpath("//button[contains(text(),'إلغاء')]");
    }

    public static By cancelPopUpBTN() {
        return By.xpath("//div/button[contains(text(),' إلغاء')]");
    }

    public static By confirmPopUpBTN() {
        return By.xpath("//div/button[text()=' تأكيد ']");
    }

    public static By backBTN() {
        return By.xpath("//button[contains(text(),'السابق')]");
    }

    public static By confirmBTN() {
        return By.xpath("//button[contains(text(),'تأكيد')]");
    }

    public static By editBTN() {
        return By.xpath("//button[contains(text(),'تعديل')]");
    }

    public static By ContractsList() {
        return By.xpath("//app-single-contract");
    }

    public static By ContractNumberOfSearchedContract() {
        return By.xpath("//h5/child::a[@class=\"btn btn-link text-primary p-0\"]");
    }

    public static By KebabMenuButton() {
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

    public static By maxValueError() {
        return By.xpath("//li[@data-error=\"errors.max_value\"]");
    }

    public static By ViewOrDownloadAttachmentButtons() {
        return By.xpath("//app-card/descendant::button");
    }

    public static By SuccessPopUPTitle() {
        return By.xpath("//*[contains (text() , 'رسالة نجاح')]");
    }

    public static By minValueError() {
        return By.xpath("//li[@data-error=\"errors.min_value\"]");
    }

    public static By totalAmount() {
        return By.xpath("//span[text()='الإجمالي']/following-sibling::span");
    }

    public static By equivalentDateHint() {
        return By.xpath("//span[@class=\"input-hints\"]");
    }

    public static By closeBTN() {
        return By.xpath("//button[contains(text(),' إغلاق ')]");
    }

    public static By requestNumber() {
        return By.xpath("//h5[@class=\"message mb-2\"]");
    }


    public static By theRequestTab() {
        return By.xpath("//a[text()=' الطلبات ']");
    }

    public static By viewAllTheRequests() {
        return By.xpath("//span[text()='عرض الطلبات']");
    }

    public static By requestNumberOfSearchedRequest() {
        return By.xpath("//span[text()=' رقم الطلب ']/following-sibling::h5");
    }

    public static By requestList() {
        return By.xpath("//app-single-contract-termination-request");
    }

    public static By requestNumberTXT() {
        return By.xpath("//input[@data-name=\"reference\"]");
    }

    public static By acceptTerminationOptionBTN() {
        return By.xpath("//a[text()=' الموافقة على الإنهاء ']");
    }

    public static By RevokeContractRequestOption() {
        return By.xpath("//span[contains (text() , 'عرض طلبات فسخ العقد')]");
    }

    public static By RequestPageTitle() {
        return By.xpath("//h1[contains (text() , 'طلبات')] | //h2[contains (text(),'طلبات')]");
    }

    public static By RequestStatus() {
        return By.xpath("//span[contains (text() , 'الحالة')]/parent::div/descendant::h5/child::span");
    }

    public static By ApproveBTN() {
        return By.xpath("//button[contains (text(), ' قبول ')]");
    }

    public static By ConfirmationPopUpTitle() {
        return By.xpath("//h2[contains (text(), 'تأكيد ')]");
    }

    public static By RejectBTN() {
        return By.xpath("//button[contains (text() , 'رفض')]");
    }

    public static By ReasonOfRejectPopUpTitle() {
        return By.xpath("//*[contains (text(), 'سبب')]");
    }

    public static By PaymentDueDateOnInvoice() {
        return By.xpath("(//tbody//tr//td[3]//span)[3]");
    }

    public static By OldInvoiceStatus() {
        return By.xpath("//span[text()='الحالة']/following-sibling::h5");
    }

    public static By NewInvoiceStatus() {
        return By.xpath("//tbody//tr//td[5]");
    }

    public static By reviewTheContractPage() {
        return By.xpath("//p[text()='مراجعة العقد']");
    }

    public static By rejectBTN() {
        return By.xpath("//button[text()=' رفض ']");
    }

    public static By rejectReasonText() {
        return By.xpath("//h2[text()='لماذا تريد الرفض؟']");
    }

    public static By rejectReasonRadioBTNs() {
        return By.xpath("//app-form-radio[@formcontrolname=\"rejection_reason\"]");
    }

    public static By rejectionReasonNote() {
        return By.xpath("//textarea[@formcontrolname=\"rejection_reason_note\" or  @data-name=\"rejection_reason\"]");
    }

    public static By rejectionSubmittedMessage() {
        return By.xpath("//h2[text()='تم تقديم الرفض']");
    }

    public static By financialTab() {
        return By.xpath("//a[text()=' المالية ']");
    }

    public static By allInvoicesBTN() {
        return By.xpath("//span[text()='عرض الفواتير']");
    }

    public static By contractsInvoices() {
        return By.xpath("//h3[text()='فواتير العقود']");
    }

    public static By contractsNumber() {
        return By.xpath("//input[@data-name=\"contract_number\"]");
    }

    public static By allContractInvoices() {
        return By.xpath("//span[text() = ' رقم العقد']/following-sibling::h5");
    }

    public static By newContractInvoice() {
        return By.xpath("(//app-contract-invoice-row)[last()]");
    }

    public static By newAmountForContractInvoice() throws Exception {
        return By.xpath("//td[contains(text(),'ر.س')]");
    }

    public static By viewContractOptionBTN() {
        return By.xpath("//a[text()=' عرض العقد ']");
    }

    public static By submitForApprovalBTN() {
        return By.xpath("//button[text()=' الإرسال للتوثيق ']");
    }

    public static By removeBTN() {
        return By.xpath("//button[text()=' إزالة ']");
    }

    public static By confirmAndSubmitBTN() {
        return By.xpath("//button[text()=' تأكيد وإرسال ']");
    }

    public static By disclaimerCheckbox() {
        return By.xpath("//app-form-checkbox[@formcontrolname=\"approve_unified_disclaimer\"]/label");
    }

    public static By UserIdentityList() {
//        return By.xpath("//app-nav-item[@icon='single-man-cicle']//span");
        return By.xpath("//div[@data-dropdown-role=\"options\"]/descendant::span");
    }

    public static By RoleName() {
        return By.xpath("//div//p[@class='role-name']");
    }

    public static By ratingBTN() {
        return By.xpath("//app-rating-input/child::div/div[@class=\"rating\"][1]");
    }

    public static By submitBTN() {
        return By.xpath("//button[text()=' إرسال ']");
    }

    public static By successfulSurveySubmittedMsg() {
        return By.xpath("//h2[text()='تم تقديم الرد']");
    }

    public static By yesRadioBTN() {
        return By.xpath("//label[text()=' نعم ']");
    }

    public static By newRadioBTN() {
        return By.xpath("//label[text()=' جديدة ']/parent::app-form-radio");
    }

    public static By deleteIconBTN() {
        return By.xpath("//i[@class=\"delete-icon\"]/parent::button");
    }

    public static By CRNumberInput() {
        return By.xpath("//input[@formcontrolname=\"registration_number\"]");
    }

    public static By errorCRNumberMsg() {
        return By.xpath("//ul[@class=\"errors\"]/li");
    }

    public static By PhoneNumberInputField() {
        return By.xpath("//input[@data-name=\"nationalNumber\"]");
    }

    public static By PhoneNumberInputFieldErrorMessage() {
        return By.xpath("//label[contains (text() , 'الهاتف')]/parent::app-form-field/descendant::li");
    }

    public static By EmailInputField() {
        return By.xpath("//input[@data-name=\"email\"]");
    }

    public static By EmailErrorMessage() {
        return By.xpath("//label[contains (text() , 'البريد ')]/parent::app-form-field/descendant::li");
    }

    public static By RegionDropdown() {
        return By.xpath("//select[@data-name=\"region\"]");
    }

    public static By RegionDropdownOptions() {
        return By.xpath("//select[@data-name=\"region\"]/child::option");
    }

    public static By CityDropdown() {
        return By.xpath("//input[@data-name=\"city\"]/parent::div/child::div/child::div");
    }

    public static By CitySearchBar() {
        return By.xpath("//label[text()='المدينة']/parent::app-form-field/descendant::input[@placeholder=\"البحث\"]");
    }

    public static By CityName() {
        return By.xpath("//label[text()='المدينة']/parent::app-form-field/descendant::div[@class=\"option-text\"]");
    }

    public static By PostalCodeInput() {
        return By.xpath("//input[@data-name=\"postal_code\"]");
    }

    public static By PostalCodeError() {
        return By.xpath("//label[contains (text() , 'الرمز البريدي')]/parent::app-form-field/descendant::li");
    }

    public static By StreetNameInput() {
        return By.xpath("//input[@data-name=\"street_name\"]");

    }

    public static By StreetNameError() {
        return By.xpath("//label[contains (text() , 'اسم الشارع')]/parent::app-form-field/descendant::li");
    }

    public static By BuildingNumberError() {
        return By.xpath("//label[contains (text() , 'رقم المبنى' )]/parent::app-form-field/descendant::li");

    }

    public static By BuildingNumberInput() {
        return By.xpath("//input[@data-name=\"building_number\"]");

    }

    public static By AdditionalNumberInput() {
        return By.xpath("//input[@data-name=\"additional_number\"]");
    }

    public static By AdditionalNumberError() {
        return By.xpath("//label[contains (text() , 'الرقم الإضافي' )]/parent::app-form-field/descendant::li");
    }

    public static By SendBTN() {
        return By.xpath("//app-button-bar//button[text()=' إرسال ']");
    }

    public static By filterPopup() {
        return By.xpath("//app-card-body[@class='card-body']");
    }

    public static By invalidOTPErrorMsg() {
        return By.xpath("//li[contains(text(),'رمز OTP غير صالح')]");
    }

    public static By ContractResultOfSearchedContract(){ return By.xpath("//div[@class=\"col-12 py-4\"]");}
    public static By AccountSettingsHeading(){ return By.xpath("//header[@class='main-header d-lg-block d-none']//h1");}
    public static By UnitForms(){ return By.xpath("//div//a[text()=' نماذج الوحدة ']");}
    public static By ViewUnitForms(){ return By.xpath("//div//span[text()='عرض نماذج الوحدة']");}


    public static By SearchButton() {
        return By.xpath("//button[contains (text() ,'بحث')]");
    }

    public static By ownershipDocumentDDL() {
        return By.xpath("//select[@data-name=\"ownership_document_type\"]");
    }

    public static By ownershipDocumentDDLOption() {
        return By.xpath("//select[@data-name=\"ownership_document_type\"]/option");
    }

    public static By ownershipDocumentNumberTXT() {
        return By.xpath("//input[@formcontrolname=\"document_number\"]");
    }

    public static By releaseDateTXT() {
        return By.xpath("//input[@data-name=\"issued_date\"]");
    }

    public static By ownerIdTXT() {
        return By.xpath("//input[@formcontrolname=\"owner_id\"]");
    }

    public static By legalDocumentTypeNameTXT() {
        return By.xpath("//input[@formcontrolname=\"legal_document_type_name\"]");
    }

    public static By selectedOwnershipDocumentInfo() {
        return By.xpath("//app-form-radio[@formcontrolname=\"selectedOwnershipDoc\"]");
    }

    public static By selectedOwnershipDocumentInfoRadioBTN() {
        return By.xpath("//input[@data-name=\"selectedOwnershipDoc\"]");
    }

    public static By addNewOwnershipDocumentAlertMsg() {
        return By.xpath("//h5[text()='.عذرًا، لم نتمكن من العثور على بيانات رقم الوثيقة الملكية المحدد']");
    }

    public static By addPropertyBTN() {
        return By.xpath("//a[text()=' إضافة عقار جديد ']");
    }

    public static By selectUnitPage() {
        return By.xpath("//h2[text()=' اختر وحدة (وحدات) ']");
    }

    public static By deleteIconForAttachment() {
        return By.xpath("//h2[text() = 'المستندات المطلوبة']/ancestor::app-card/descendant::button/child::i");
    }

    public static By removedAttachment() {
        return By.xpath("//div[contains(@class, 'attachment-card')]");
    }

    public static By sendRequestBTN() {
        return By.xpath("//button[contains (text(), ' إرسال الطلب ')]");
    }

    public static By RentalIncidentRequestOption() {
        return By.xpath("//span[text()='عرض طلبات الوقائع الإيجارية']");
    }

    public static By RequestNumberInputField() {
        return By.xpath("//input[@data-name=\"rental_incident_number\"]");
    }

    public static By verifyBTN() {
        return By.xpath("//button[text()=' تحقق ']");
    }

    public static By ownershipReferenceSearchField() {
        return By.xpath("//input[@data-name=\"ownership_reference_no\"]");
    }

    public static By SearchedDeedNumber() {
        return By.xpath("//span[contains (text() , 'رقم وثيقة الملكية')]/following-sibling::h5");
    }

    public static By DownloadContractCopyButton() {
        return By.xpath("(//button[contains (text(), ' تحميل نسخة العقد ')])[1]");
    }
}
