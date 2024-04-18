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
        return By.xpath("//button[contains(text(),' إلغاء')]");
    }
    public static By backBTN() throws Exception{
        return By.xpath("//button[contains(text(),' السابق')]");
    }
    public static By confirmBTN() throws Exception{
        return By.xpath("//button[contains(text(),' تأكيد ')]");
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
        return By.xpath("//h5[contains (text() , 'رسالة نجاح')]");
    }
    public static By minValueError(){
        return By.xpath("//li[@data-error=\"errors.min_value\"]");
    }

    public static By totalAmount(){
        return By.xpath("//span[text()='الإجمالي']/following-sibling::span");
    }
    public static By hijriDate() {
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
        return By.xpath("//span[text()=' رقم الطلب ']/following-sibling::h5[@class=\"item-value\"]");
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
        return By.xpath("//span[contains (text() , ' تم الإرسال. ')]");
    }

    public static By ApproveBTN() {
        return By.xpath("//button[contains (text(), ' قبول ')]");
    }

    public static By ConfirmationPopUpTitle() {
        return By.xpath("//h2[contains (text(), 'تأكيد ')]");
    }

    public static By RejectBTN() {
        return By.xpath("//button[contains (text() , ' رفض ')]");
    }

    public static By ReasonOfRejectPopUpTitle() {
        return By.xpath("//h2[text()='سبب الرفض ']");
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
        return By.xpath("//textarea[@formcontrolname=\"rejection_reason_note\"]");
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
        return By.xpath("//a[@class=\"list-item active\"]/div/h5");
    }

    public static By newContractInvoice() throws Exception{
        return By.xpath("(//app-contract-invoice-row)[last()]");
    }
    public static By newAmountForContractInvoice() throws Exception{
        return By.xpath("//td[contains(text(),'ر.س')]");
    }

}
