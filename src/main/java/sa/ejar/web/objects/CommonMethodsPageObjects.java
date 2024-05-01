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
        return By.xpath("//button[contains(text(),'التالي')]");
    }
    public static By cancelBTN() throws Exception{
        return By.xpath("//button[contains(text(),'إلغاء')]");
    }
    public static By cancelPopUpBTN() throws Exception{
        return By.xpath("//div/button[contains(text(),' إلغاء')]");
    }
    public static By confirmPopUpBTN() throws Exception{
        return By.xpath("//div/button[text()=' تأكيد ']");
    }

    public static By backBTN() throws Exception{
        return By.xpath("//button[contains(text(),'السابق')]");
    }
    public static By confirmBTN() throws Exception{
        return By.xpath("//button[contains(text(),'تأكيد')]");
    }

    public static By editBTN() throws Exception{
        return By.xpath("//button[contains(text(),'تعديل')]");
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
    public static By maxValueError() {
        return By.xpath("//li[@data-error=\"errors.max_value\"]");
    }

    public static By ViewOrDownloadAttachmentButtons() {
        return By.xpath("//app-card/descendant::button");
    }

    public static By SuccessPopUPTitle() {
        return By.xpath("//*[contains (text() , 'رسالة نجاح')]");
    }
    public static By minValueError(){
        return By.xpath("//li[@data-error=\"errors.min_value\"]");
    }

    public static By totalAmount(){
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


    public static By theRequestTab() throws Exception{
        return By.xpath("//a[text()=' الطلبات ']");
    }
    public static By viewAllTheRequests() throws Exception{
        return By.xpath("//span[text()='عرض الطلبات']");
    }
    public static By requestNumberOfSearchedRequest() throws Exception{
        return By.xpath("//span[text()=' رقم الطلب ']/following-sibling::h5");
    }
    public static By requestList() throws Exception{
        return By.xpath("//app-single-contract-termination-request");
    }
    public static By requestNumberTXT() throws Exception{
        return By.xpath("//input[@data-name=\"reference\"]");
    }

    public static By acceptTerminationOptionBTN() throws Exception{
        return By.xpath("//a[text()=' الموافقة على الإنهاء ']");
    }

    public static By RevokeContractRequestOption() {
        return By.xpath("//span[contains (text() , 'عرض طلبات فسخ العقد')]");
    }

    public static By RequestPageTitle() {
        return By.xpath("//h1[contains (text() , 'طلبات')]");
    }

    public static By RequestStatus() {
//        return By.xpath("//span[contains (text() , ' تم الإرسال. ')]");
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
    public static By reviewTheContractPage() throws Exception{
        return By.xpath("//p[text()='مراجعة العقد']");
    }
    public static By rejectBTN() throws Exception{
        return By.xpath("//button[text()=' رفض ']");
    }
    public static By rejectReasonText() throws Exception{
        return By.xpath("//h2[text()='لماذا تريد الرفض؟']");
    }
    public static By rejectReasonRadioBTNs() throws Exception{
        return By.xpath("//app-form-radio[@formcontrolname=\"rejection_reason\"]");
    }
    public static By rejectionReasonNote() throws Exception{
        return By.xpath("//textarea[@formcontrolname=\"rejection_reason_note\" or  @data-name=\"rejection_reason\"]");
    }
    public static By rejectionSubmittedMessage() throws Exception{
        return By.xpath("//h2[text()='تم تقديم الرفض']");
    }

    public static By financialTab() throws Exception{
        return By.xpath("//a[text()=' المالية ']");
    }
    public static By allInvoicesBTN() throws Exception{
        return By.xpath("//span[text()='عرض الفواتير']");
    }
    public static By contractsInvoices() throws Exception{
        return By.xpath("//h3[text()='فواتير العقود']");
    }
    public static By contractsNumber() throws Exception{
        return By.xpath("//input[@data-name=\"contract_number\"]");
    }
    public static By allContractInvoices() throws Exception{
        return By.xpath("//span[text() = ' رقم العقد']/following-sibling::h5");
    }

    public static By newContractInvoice() throws Exception{
        return By.xpath("(//app-contract-invoice-row)[last()]");
    }
    public static By newAmountForContractInvoice() throws Exception{
        return By.xpath("//td[contains(text(),'ر.س')]");
    }
    public static By viewContractOptionBTN() throws Exception{
        return By.xpath("//a[text()=' عرض العقد ']");
    }

    public static By submitForApprovalBTN() throws Exception{
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

    public static By UserIdentityList(){
        return By.xpath("//app-nav-item[@icon='single-man-cicle']//span");
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

    public static By SendBTN(){
        return By.xpath("//app-button-bar//button[text()=' إرسال ']");
    }
}
