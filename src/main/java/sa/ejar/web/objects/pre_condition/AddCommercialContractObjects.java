package sa.ejar.web.objects.pre_condition;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class AddCommercialContractObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("btn-contracts", new HashMap<>() {{
                put("en", "//a[text()=' Contracts ']");
                put("ar", "//a[text()=' العقود ']");
            }});
            put("option-new-Commercial-contract", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[text()='تسجيل عقد تجاري']");
            }});
            put("add-Commercial-contract-heading", new HashMap<>() {{
                put("en", "");
                put("ar", "//h1[text()=' تسجيل عقد تجاري. ']");
            }});
            put("date-input-field", new HashMap<>() {{
                put("en", "//input[@data-name=\"contract_start_date\"]");
                put("ar", "//input[@data-name=\"contract_start_date\"]");
            }});
            put("click-start-year", new HashMap<>() {{
                put("en", "(//button[@data-test-id=\"year-selection\"])[1]");
                put("ar", "(//button[@data-test-id=\"year-selection\"])[1]");
            }});
            put("select-start-year", new HashMap<>() {{
                put("en", "//div[@class=\"year-select-item\"]/child::button");
                put("ar", "//div[@class=\"year-select-item\"]/child::button");
            }});
            put("click-start-month", new HashMap<>() {{
                put("en", "(//button[@data-test-id=\"month-selection\"])[1]");
                put("ar", "(//button[@data-test-id=\"month-selection\"])[1]");
            }});
            put("select-start-month", new HashMap<>() {{
                put("en", "//div[@class=\"month-select-item\"]/child::button");
                put("ar", "//div[@class=\"month-select-item\"]/child::button");
            }});
            put("select-start-day", new HashMap<>() {{
                put("en", "(//table)[1]//tr//td");
                put("ar", "(//table)[1]//tr//td");
            }});
            put("click-end-year", new HashMap<>() {{
                put("en", "(//button[@data-test-id=\"year-selection\"])[2]");
                put("ar", "(//button[@data-test-id=\"year-selection\"])[2]");
            }});
            put("select-end-year", new HashMap<>() {{
                put("en", "//div[@class=\"year-select-item\"]/child::button");
                put("ar", "//div[@class=\"year-select-item\"]/child::button");
            }});
            put("click-end-month", new HashMap<>() {{
                put("en", "(//button[@data-test-id=\"month-selection\"])[2]");
                put("ar", "(//button[@data-test-id=\"month-selection\"])[2]");
            }});
            put("select-end-month", new HashMap<>() {{
                put("en", "//div[@class=\"month-select-item\"]/child::button");
                put("ar", "//div[@class=\"month-select-item\"]/child::button");
            }});
            put("select-end-day", new HashMap<>() {{
                put("en", "(//table)[2]//tr//td");
                put("ar", "(//table)[2]//tr//td");
            }});
            put("btn-confirm-period", new HashMap<>() {{
                put("en", "//button[text()=' Confirm period ']");
                put("ar", "//button[text()=' تأكيد مدة الإيجار ']");
            }});
            put("btn-add-property", new HashMap<>() {{
                put("en", "//a[text()=' Add property ']");
                put("ar", "//a[contains(text(),'إضافة عقار')]");
            }});
            put("property-name", new HashMap<>() {{
                put("en", "//div[@class=\"col\"]/child::h5");
                put("ar", "//h5[@class='card-title']/parent::div");
            }});
            put("continue-with-this-property-btn", new HashMap<>() {{
                put("en", "//button[text()=' Continue with this property ']");
                put("ar", "//button[text()=' الاستمرار مع هذا العقار ']");
            }});
            put("continue-to-select-units-btn", new HashMap<>() {{
                put("en", "//button[text()=' Continue to select units ']");
                put("ar", "//button[text()=' الاستمرار لاختيار وحدات ']");
            }});
            put("select-units", new HashMap<>() {{
                put("en", "//div[@class=\"col p-0 pe-3\"]/child::h5");
                put("ar", "//div[@class=\"col p-0 pe-3\"]/child::h5");
            }});
            put("select-first-available-unit", new HashMap<>() {{
                put("en", "(//div[@class=\"col p-0 pe-3\"]/child::h5)[1]");
                put("ar", "(//div[@class=\"col p-0 pe-3\"]/child::h5)[1]");
            }});
            put("confirm-property-details", new HashMap<>() {{
                put("en", "//button[text()=' Confirm property details ']");
                put("ar", "//button[text()=' تأكيد ']");
            }});
            put("covered-property-units-step-btn", new HashMap<>() {{
                put("en", "//div[text()=' Covered property and units ']");
                put("ar", "//div[text()=' العقارات والوحدات ']");
            }});
            put("identify-address-on-map-btn", new HashMap<>() {{
                put("en", "//button[text()=' Identify address on map ']");
                put("ar", "//button[contains(text(),'تحديد العنوان على الخريطة')]");

            }});
            put("confirm-btn-on-map", new HashMap<>() {{
                put("en", "//button[text()=' Confirm ']");
                put("ar", "(//button[contains(text(),'تأكيد')])[2]");

            }});
            put("save-btn-property-address", new HashMap<>() {{
                put("en", "//button[text()=' Save ']");
                put("ar", "//button[contains(text(),'حفظ')]");
            }});
            put("contract-parties-step-btn", new HashMap<>() {{
                put("en", "//div[text()=' Contract parties ']");
                put("ar", "//div[text()=' أطراف العقد ']");
            }});
            put("add-individual-tenant-btn", new HashMap<>() {{
                put("en", "//a[@data-test-id=\"contracts.contract-parties.add-individual-tenant\"]");
                put("ar", "//a[@data-test-id=\"contracts.contract-parties.add-individual-tenant\"]");
            }});
            put("tenant-type-radio-btn", new HashMap<>() {{
                put("en", "//label[text()=' Tenant ']");
                put("ar", "//label[text()=' المستأجر ']");
            }});
            put("tenant-national-id-input-field", new HashMap<>() {{
                put("en", "//input[@data-name=\"id_number\"]");
                put("ar", "//input[@data-name=\"id_number\"]");
            }});
            put("tenant-date-of-birth-input-field", new HashMap<>() {{
                put("en", "//input[@data-name=\"hijri\"]");
                put("ar", "//input[@data-name=\"hijri\"]");
            }});
            put("continue-btn", new HashMap<>() {{
                put("en", "//button[text()=' Continue ']");
                put("ar", "//button[text()=' التالي ']");
            }});
            put("tenant-phone-number-input-field", new HashMap<>() {{
                put("en", "//input[@data-name=\"nationalNumber\"]");
                put("ar", "//input[@data-name=\"nationalNumber\"]");
            }});
            put("tenant-region-dropdown", new HashMap<>() {{
                put("en", "//select[@data-name=\"region\"]");
                put("ar", "//select[@data-name=\"region\"]");
            }});
            put("tenant-city-dropdown", new HashMap<>() {{
                put("en", "//label[text()=\"City\"]/parent::app-form-field/descendant::div[text()=' Please select ']");
                put("ar", "//div[@class='form-control select empty']//div[@class='text-truncate placeholder'][contains(text(),'يرجى اختيار')]");

            }});
            put("select-tenant-city", new HashMap<>() {{
                put("en", "//div[@class=\"option-text\"]");
                put("ar", "//div[@class=\"option-text\"]");
            }});
            put("confirm-btn-on-tenant-address-page", new HashMap<>() {{
                put("en", "//button[text()=' Confirm ']");
                put("ar", "//button[text()=' تأكيد ']");
            }});
            put("filter-btn-on-select-units-page", new HashMap<>() {{
                put("en", "//span[@class=\"icon filter-icon\"]");
                put("ar", "//span[@class=\"icon filter-icon\"]");
            }});
            put("select-units-availability", new HashMap<>() {{
                put("en", "//select[@data-name=\"unit_availability\"]");
                put("ar", "//select[@data-name=\"unit_availability\"]");
            }});
            put("annual-rent-fee-input-field", new HashMap<>() {{
                put("en", "//input[@data-name=\"total_units_rent\"]");
                put("ar", "//input[@data-name=\"total_units_rent\"]");
            }});
            put("continue-to-billing-schedule-btn", new HashMap<>() {{
                put("en", "//button[text()=' Continue to Billing schedule ']");
                put("ar", "//button[text()=' متابعة إلى جدول الدفعات ']");
            }});
            put("pay-online-btn", new HashMap<>() {{
                put("en", "//label[text()=' Pay online only ']");
                put("ar", "//label[text()=' الدفع الإلكتروني فقط ']");
            }});
            put("add-new-iban-btn", new HashMap<>() {{
                put("en", "//button[text()=' Add new IBAN ']");
                put("ar", "//button[text()=' إضافة رقم آيبان جديد ']");
            }});
            put("iban-number-input-field", new HashMap<>() {{
                put("en", "//input[@data-name=\"iban_number\"]");
                put("ar", "//input[@data-name=\"iban_number\"]");
            }});
            put("account-owner-name-input-field", new HashMap<>() {{
                put("en", "//input[@data-name=\"alias_name\"]");
                put("ar", "//input[@data-name=\"alias_name\"]");
            }});
            put("save-btn-on-add-new-iban", new HashMap<>() {{
                put("en", "//button[text()=' Save ']");
                put("ar", "//button[text()=' حفظ ']");
            }});

            put("select-iban-dropdown", new HashMap<>() {{
                put("en", "//select[@data-name=\"iban_number\"]");
                put("ar", "//select[@data-name=\"iban_number\"]");
            }});

            put("iban-account-owner-radio-btn", new HashMap<>() {{
                put("en", "//label[text()=' Lessor ']");
                put("ar", "//label[text()=' المؤجر ']");
            }});
            put("continue-to-additional-fee-btn", new HashMap<>() {{
                put("en", "//button[text()=' Continue to additional fees ']");
                put("ar", "//button[text()=' التالي ']");
            }});
            put("add-terms-and-conditions-btn", new HashMap<>() {{
                put("en", "//a[@routerlink=\"terms-and-conditions\"]");
                put("ar", "//a[@routerlink=\"terms-and-conditions\"]");
            }});
            put("confirm-terms-and-conditions-btn", new HashMap<>() {{
                put("en", "//button[text()=' Confirm terms and conditions ']");
                put("ar", "//button[text()=' تأكيد الشروط والأحكام ']");
            }});
            put("submit-for-approval-btn", new HashMap<>() {{
                put("en", "(//button[text()=' Submit for Approval '])[1]");
                put("ar", "(//button[text()=' الإرسال للتوثيق '])[1]");
            }});
            put("financial-terms-step-btn", new HashMap<>() {{
                put("en", "//div[text()=' Financial terms ']");
                put("ar", "//div[text()=' البيانات المالية ']");
            }});
            put("add-rental-contracts-btn", new HashMap<>() {{
                put("en", "//a[text()=' Add rental contract-terms ']");
                put("ar", "//a[contains(text(),'إضافة شروط عقد الإيجار')]");
            }});
            put("continue-btn-on-preview-contract-page", new HashMap<>() {{
                put("en", "//button[text()=' Continue ']");
                put("ar", "//button[text()=' التالي ']");
            }});
            put("continue-To-Owner-Info", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'التالي')]");
            }});
            put("continue-pay-btn-on-preview-brokerage-agreement-page", new HashMap<>() {{
                put("en", "//button[text()=' Continue to paying fees ']");
                put("ar", "//button[text()=' الاستمرار في دفع الرسوم ']");
            }});
            put("disclaimer-checkbox-on-paying-ejar-fees-page", new HashMap<>() {{
                put("en", "(//label[@class=\"form-check-label\"])[1]");
                put("ar", "(//label[@class=\"form-check-label\"])[1]");
            }});
            put("confirm-and-submit-btn-on-paying-ejar-fees-page", new HashMap<>() {{
                put("en", "//button[text()=' Confirm and submit ']");
                put("ar", "//button[text()=' تأكيد وإرسال ']");
            }});

            put("search-contract-number-input-field", new HashMap<>() {{
                put("en", "//input[@data-name=\"contract_number\"]");
                put("ar", "//input[@data-name=\"contract_number\"]");
            }});

            put("confirm-btn", new HashMap<>() {{
                put("en", "//button[@class=\"btn btn-primary flex-fill\"]");
                put("ar", "//button[@class=\"btn btn-primary flex-fill\"]");
            }});

            put("btn-view-all-contracts", new HashMap<>() {{
                put("en", "//span[text()='View all contracts']");
                put("ar", "//span[text()='عرض جميع العقود']");
            }});
            put("property-units-Additional-btn", new HashMap<>() {{
                put("en", "//div[text()=' Covered property and units ']");
                put("ar", "//button[text()=' معلومات إضافية ']");
            }});
            put("Payment-Frequency", new HashMap<>() {{
                put("en", "");
                put("ar", "//label[contains(text(),'دفعات متكررة')]");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }


    public static By contractButtonArrow() throws Exception {
        return By.xpath(get("btn-contracts"));
    }

    public static By optionCreateNewContract() throws Exception {
        return By.xpath(get("option-new-Commercial-contract"));
    }

    public static By clickDateInputField() throws Exception {
        return By.xpath(get("date-input-field"));
    }

    public static By clickContractStartYear() throws Exception {
        return By.xpath(get("click-start-year"));
    }

    public static By selectContractStartYear() throws Exception {
        return By.xpath(get("select-start-year"));
    }

    public static By clickContractStartMonth() throws Exception {
        return By.xpath(get("click-start-month"));
    }

    public static By selectContractStartMonth() throws Exception {
        return By.xpath(get("select-start-month"));
    }

    public static By selectContractStartDay() throws Exception {
        return By.xpath(get("select-start-day"));
    }

    public static By clickContractEndYear() throws Exception {
        return By.xpath(get("click-end-year"));
    }

    public static By selectContractEndYear() throws Exception {
        return By.xpath(get("select-end-year"));
    }

    public static By clickContractEndMonth() throws Exception {
        return By.xpath(get("click-end-month"));
    }

    public static By selectContractEndMonth() throws Exception {
        return By.xpath(get("select-end-month"));
    }

    public static By selectContractEndDay() throws Exception {
        return By.xpath(get("select-end-day"));
    }

    public static By confirmPeriodBTN() throws Exception {
        return By.xpath(get("btn-confirm-period"));
    }

    public static By addPropertyBTN() throws Exception {
        return By.xpath(get("btn-add-property"));
    }

    public static By continueWithThisPropertyBTN() throws Exception {
        return By.xpath(get("continue-with-this-property-btn"));
    }

    public static By continueToSelectUnitsBTN() throws Exception {
        return By.xpath(get("continue-to-select-units-btn"));
    }

    public static By selectFirstAvailableUnit() throws Exception {
        return By.xpath(get("select-first-available-unit"));
    }

    public static By confirmPropertyDetailsBTN() throws Exception {
        return By.xpath(get("confirm-property-details"));
    }

    public static By coveredPropertyUnitsBTN() throws Exception {
        return By.xpath(get("covered-property-units-step-btn"));
    }

    public static By confirmAdditionalDetailsBTN() throws Exception {
        return By.xpath(get("property-units-Additional-btn"));
    }

    public static By tenantNationalIdInput() throws Exception {
        return By.xpath(get("tenant-national-id-input-field"));
    }

    public static By tenantDateOfBirthInput() throws Exception {
        return By.xpath(get("tenant-date-of-birth-input-field"));
    }

    public static By filterBtnOnSelectUnitsPage() throws Exception {
        return By.xpath(get("filter-btn-on-select-units-page"));
    }

    public static By selectUnitsAvailability() throws Exception {
        return By.xpath(get("select-units-availability"));
    }

    public static By financialTermsStepBTN() throws Exception {
        return By.xpath(get("financial-terms-step-btn"));
    }

    public static By addRentalContractTermsBTN() throws Exception {
        return By.xpath(get("add-rental-contracts-btn"));
    }

    public static By annualRentInputField() throws Exception {
        return By.xpath(get("annual-rent-fee-input-field"));
    }

    public static By singlePaymentRadioBTN() throws Exception {
        return By.xpath(get("single-payment-frequency-radio-btn"));
    }

    public static By continueToBillingScheduleBTN() throws Exception {
        return By.xpath(get("continue-to-billing-schedule-btn"));
    }

    public static By payOnlineBTN() throws Exception {
        return By.xpath(get("pay-online-btn"));
    }

    public static By selectIbanDropdown() throws Exception {
        return By.xpath(get("select-iban-dropdown"));
    }

    public static By ibanAccountOwnerRadioBTN() throws Exception {
        return By.xpath(get("iban-account-owner-radio-btn"));
    }

    public static By continueFinancialTermsBTN() throws Exception {
        return By.xpath(get("continue-financial-terms-btn"));
    }

    public static By addTermsAndConditionsBTN() throws Exception {
        return By.xpath(get("add-terms-and-conditions-btn"));
    }

    public static By confirmTermsAndConditionsBTN() throws Exception {
        return By.xpath(get("confirm-terms-and-conditions-btn"));
    }

    public static By searchContractNumberInputField() throws Exception {
        return By.xpath(get("search-contract-number-input-field"));
    }

    public static By confirmBTN() throws Exception {
        return By.xpath(get("confirm-btn"));
    }

    public static By contractButton() throws Exception {
        return By.xpath(get("btn-contracts"));
    }

    public static By viewAllContractsButton() throws Exception {
        return By.xpath(get("btn-view-all-contracts"));
    }

    public static By continueToOwnerInfo() throws Exception {
        return By.xpath(get("continue-To-Owner-Info"));
    }

    public static By SameTermRadioButton() {
        return By.xpath("//div[text()='نفس مدة العقد السابقة']/parent::label");
    }

    public static By NoticePeriodInput() {
        return By.xpath("//input[@data-name=\"cancel_auto_renewal_notice_period_in_days\"]");
    }
}