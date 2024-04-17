package sa.ejar.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class TerminateContractPageObjects {

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
    public static By terminationStepsPage() throws Exception{
        return By.xpath(" //h5[text()='خطوات طلب إنهاء العقد']");
    }

    public static By requestTerminationText() throws Exception{
        return By.xpath("//h1[text()='طلب الإنهاء']");
    }
    public static By theContractPage() throws Exception{
        return By.xpath("//h1[text()='العقود']");
    }
    public static By requestingPartyDDL() throws Exception{
        return By.xpath("//select[@data-name=\"requesting_party\"]");
    }
    public static By calendarIconOFDateRequiredToTerminateTheContract() throws Exception{
        return By.xpath("//div[@class='date-picker-button']");
    }
    public static By terminationReasonDDL() throws Exception{
        return By.xpath("//select[@data-name=\"termination_reason\"]");
    }
    public static By terminationReasonTXT() throws Exception{
        return By.xpath("//textarea[@data-name=\"note\"]");
    }
    public static By confirmationMsg() throws Exception{
        return By.xpath("//h5[text()='رسالة تأكيد']");
    }
    public static By financialSettlementSection() throws Exception{
        return By.xpath("//h2[text()=' تسوية مالية ']");
    }
    public static By allPaymentsSettledRadioBTN() throws Exception{
        return By.xpath("//app-form-radio[@value=\"all_payments_settled\"]/label");
    }
    public static By tenantFinalPaymentRadioBTN() throws Exception{
        return By.xpath("//app-form-radio[@value=\"tenant_final_payment\"]/label");
    }
    public static By paymentAmountTXT() throws Exception{
        return By.xpath("//input[@data-name=\"payment\"]");
    }
    public static By paymentDueDateTXT() throws Exception{
        return By.xpath("//input[@data-name=\"payment_due_date\"]");
    }
    public static By validationFailedTXT() throws Exception{
        return By.xpath("//div[@class=\"message\"]");
    }
    public static By confirmRequestTheTerminationBTN() throws Exception{
        return By.xpath("//button[text()=' تأكيد طلب الإنهاء ']");
    }
    public static By terminationSummarySection() throws Exception{
        return By.xpath("//h2[text()='ملخص الإنهاء']");
    }
    public static By terminationDetailsSection() throws Exception{
        return By.xpath("//a[text()=' تفاصيل الإنهاء ']");
    }
    public static By terminationRequestDoneMessage() throws Exception{
        return By.xpath("//h5[text(0='تم تقديم طلب الإنهاء']");
    }
    public static By partyApprovalMessage() throws Exception{
        return By.xpath("//p[contains(text(),'سننتظر موافقة أطراف الإيجار')]");
    }
    public static By theRequestsPage() throws Exception{
        return By.xpath("//h1[text()='الطلبات']");
    }
    public static By theRequestsList() throws Exception{
        return By.xpath("//app-single-contract-termination-request");
    }


}
