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
            put("filter-btn-on-view-all-contracts-page", new HashMap<>() {{
                put("en", "//span[@class=\"icon filter-icon\"]");
                put("ar", "//span[@class=\"icon filter-icon\"]");
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
            put("property-use-dropdown", new HashMap<>() {{
                put("en", "//select[@data-name=\"property_usage\"]");
                put("ar", "//select[@data-name=\"property_usage\"]");
            }});
            put("property-type-dropdown", new HashMap<>() {{
                put("en", "//select[@data-name=\"property_type\"]");
                put("ar", "//select[@data-name=\"property_type\"]");
            }});
            put("ownership-document-type-dropdown", new HashMap<>() {{
                put("en", "//select[@data-name=\"property_type\"]");
                put("ar", "//select[@data-name=\"property_type\"]");
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
            put("add-residential-contract-heading", new HashMap<>() {{
                put("en", "//h1[text()=' Add Residential Contract ']");
                put("ar", "//h1[text()=' تسجيل عقد سكني ']");
            }});
            put("annual-rent-fee-input-field", new HashMap<>() {{
                put("en", "//input[@data-name=\"total_units_rent\"]");
                put("ar", "//input[@data-name=\"total_units_rent\"]");
            }});
            put("single-payment-frequency-radio-btn", new HashMap<>() {{
                put("en", "//label[text()=' Single Payment ']");
                put("ar", "//label[text()=' دفعة واحدة ']");
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
            put("continue-financial-terms-btn", new HashMap<>() {{
                put("en", "//button[text()=' Confirm Financial Terms ']");
                put("ar", "//button[text()=' تأكيد البيانات المالية ']");
            }});
            put("terms-and-conditions-step", new HashMap<>() {{
                put("en", "//div[text()=' Terms & conditions ']");
                put("ar", "(//div//app-form-radio[@formcontrolname='term_type'])[1]");
            }});
            put("add-terms-and-conditions-btn", new HashMap<>() {{
                put("en", "//a[@routerlink=\"terms-and-conditions\"]");
                put("ar", "//a[@routerlink=\"terms-and-conditions\"]");
            }});
            put("ejar-fees-payer-radio-btn", new HashMap<>() {{
                put("en", "//label[text()=' Brokerage Office ']");
                put("ar", "//label[text()=' مكتب وساطة ']");
            }});
            put("governing-law-radio-btn", new HashMap<>() {{
                put("en", "//div[text()='The competent judicial authority in the Kingdom of Saudi Arabia']");
                put("ar", "//div[text()='الجهة القضائية المختصة في المملكة العربية السعودية']");
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
            put("contract-status-text", new HashMap<>() {{
                put("en", "(//span[@class=\"pin mt-1 max-width-110 success\"])[1]");
                put("ar", "(//span[@class=\"pin mt-1 max-width-110 success\"])[1]");
            }});
            put("close-survey-pop-up-btn", new HashMap<>() {{
                put("en", "//button[@class=\"close-button\"]");
                put("ar", "//button[@class=\"close-button\"]");
            }});
            put("confirm-btn-on-close-survey-pop-up", new HashMap<>() {{
                put("en", "//button[text()=' Confirm ']");
                put("ar", "//button[text()=' تأكيد ']");
            }});
            put("contract-number-text", new HashMap<>() {{
                put("en", "//h4[@class=\"ms-4\"]");
                put("ar", "//h4[@class=\"ms-4\"]");
            }});
            put("search-contract-number-input-field", new HashMap<>() {{
                put("en", "//input[@data-name=\"contract_number\"]");
                put("ar", "//input[@data-name=\"contract_number\"]");
            }});
            put("three-dots-beside-contract-status", new HashMap<>() {{
                put("en", "//span[@class=\"round-icon large menu\"]");
                put("ar", "//span[@class=\"round-icon large menu\"]");
            }});
            put("dropdown-menu-for-contract-options", new HashMap<>() {{
                put("en", "//span[@class=\"round-icon large menu\"]");
                put("ar", "//span[@class=\"round-icon large menu\"]");
            }});
            put("Lets-start-btn", new HashMap<>() {{
                put("en", "//button[@class=\"btn btn-primary w-100-m float-right\"]");
                put("ar", "//button[@class=\"btn btn-primary w-100-m float-right\"]");
            }});

            put("confirm-btn", new HashMap<>() {{
                put("en", "//button[@class=\"btn btn-primary flex-fill\"]");
                put("ar", "//button[@class=\"btn btn-primary flex-fill\"]");
            }});

            put("confirm-btn2", new HashMap<>() {{
                put("en", "//button[text()=' Confirm ']");
                put("ar", "(//button[contains(text(),'تأكيد')])[2]");
            }});

            put("agreement-checkbox", new HashMap<>() {{
                put("en", "//label[@class=\"form-check-label\"]");
                put("ar", "//label[@class=\"form-check-label\"]");
            }});

            put("submit-contract-approval-btn", new HashMap<>() {{
                put("en", "//button[@class=\"btn btn-primary order-0 order-md-1\"]");
                put("ar", "//button[@class=\"btn btn-primary order-0 order-md-1\"]");
            }});

            put("OTP-input", new HashMap<>() {{
                put("en", "//input[@data-name=\"index_1\"]");
                put("ar", "//input[@data-name=\"index_1\"]");
            }});

            put("verify-identity-btn", new HashMap<>() {{
                put("en", "//input[@data-name=\"index_1\"]");
                put("ar", "//button[contains(text(),'التحقق من الهوية')]");
            }});

            put("approval-submitted-text", new HashMap<>() {{
                put("en", "");
                put("ar", "//h2[text() = 'التقييم والإستبيان']");
            }});

            put("btn-view-all-contracts", new HashMap<>() {{
                put("en", "//span[text()='View all contracts']");
                put("ar", "//span[text()='عرض جميع العقود']");
            }});
            put("property-units-Additional-btn", new HashMap<>() {{
                put("en", "//div[text()=' Covered property and units ']");
                put("ar", "//button[text()=' معلومات إضافية ']");
            }});

            put("Sign-Location", new HashMap<>() {{
                put("en", "");
                put("ar", "//div//input[@formcontrolname='sign_location']");
            }});

            put("Sign-Special-Specification", new HashMap<>() {{
                put("en", "");
                put("ar", "//div//input[@formcontrolname='sign_special_specification']");
            }});

            put("Sign-Width", new HashMap<>() {{
                put("en", "");
                put("ar", "//div//input[@formcontrolname='sign_width']");
            }});

            put("Sign-Height", new HashMap<>() {{
                put("en", "");
                put("ar", "//div//input[@formcontrolname='sign_height']");
            }});
            put("Building-Number", new HashMap<>() {{
                put("en", "");
                put("ar", "//input[@formcontrolname='building_number']");
            }});
            put("Street-Name", new HashMap<>() {{
                put("en", "");
                put("ar", "//input[@formcontrolname='street_name']");
            }});
            put("Additional-Number", new HashMap<>() {{
                put("en", "");
                put("ar", "//input[@formcontrolname='additional_number']");
            }});
            put("Payment-Frequency", new HashMap<>() {{
                put("en", "");
                put("ar", "//label[contains(text(),'دفعات متكررة')]");
            }});
            put("Flexible-Payment-Frequency", new HashMap<>() {{
                put("en", "");
                put("ar", "//label[contains(text(),'الدفعات المرنة')]");
            }});
            put("Aproved-Contract", new HashMap<>() {{
                put("en", "");
                put("ar", "(//a[contains(text(),'الموافقة على العقد')])[1]");
            }});

            put("Assessment-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//div//h2[text()='التقييم والإستبيان']");
            }});

            put("Assessment1", new HashMap<>() {{
                put("en", "");
                put("ar", "(//div[@class='rating'])[1]");
            }});

            put("Assessment2", new HashMap<>() {{
                put("en", "");
                put("ar", "(//div[@class='rating'])[5]");
            }});
            put("Assessment-Send-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//app-card-footer//button[text()=' إرسال ']");
            }});

            put("Confirm-Assessment-Send-Message", new HashMap<>() {{
                put("en", "");
                put("ar", "//h2[text()='تم تقديم الرد']");
            }});

            put("Close-Survey", new HashMap<>() {{
                put("en", "");
                put("ar", "//div//button[@class='close-button']");
            }});
            put("Contract-Not-Found", new HashMap<>() {{
                put("en", "");
                put("ar", "//div[text()=' لم يتم العثور على عقود! يرجى إضافة عقود جديدة. ']");
            }});
            put("Contract-Number-TXT", new HashMap<>() {{
                put("en", "");
                put("ar", "//h4[@class=\"ms-4\"]");
            }});
            put("Confirm-Delete-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "(//button[contains(text(),'تأكيد')])[1]");
            }});
            put("Draft-Status", new HashMap<>() {{
                put("en", "");
                put("ar", "//h5//span[text()='مسودة ']");
            }});
            put("Save-Contract-As-Draft", new HashMap<>() {{
                put("en", "");
                put("ar", "//app-contract-action-bar[@class='d-none d-md-block']//button[@class='btn btn-secondary'][contains(text(),'الحفظ والمتابعة لاحقًا')]");
            }});
            put("Check-Unit-Selected", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[normalize-space()='· 1']");
            }});
            put("Contract-Delete-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[@class='btn btn-outline-danger'][contains(text(),'حذف')]");
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

    public static By addCommercialContractDashboard() throws Exception {
        return By.xpath(get("add-Commercial-contract-heading"));
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

    public static By propertyUseMenu() throws Exception {
        return By.xpath(get("property-use-dropdown"));
    }

    public static By propertyTypeMenu() throws Exception {
        return By.xpath(get("property-type-dropdown"));
    }

    public static By OwnershipDocumentTypeMenu() throws Exception {
        return By.xpath(get("ownership-document-type-dropdown"));
    }

    public static By propertyName() throws Exception {
        return By.xpath(get("property-name"));
    }

    public static By continueWithThisPropertyBTN() throws Exception {
        return By.xpath(get("continue-with-this-property-btn"));
    }

    public static By continueToSelectUnitsBTN() throws Exception {
        return By.xpath(get("continue-to-select-units-btn"));
    }

    public static By selectUnit() throws Exception {
        return By.xpath(get("select-units"));
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

    public static By checkUnitSelected() throws Exception {
        return By.xpath(get("Check-Unit-Selected"));
    }

    public static By identifyAddressOnMapBTN() throws Exception {
        return By.xpath(get("identify-address-on-map-btn"));
    }

    public static By confirmBtnOnMap() throws Exception {
        return By.xpath(get("confirm-btn-on-map"));
    }

    public static By saveBtnOnPropertyAddress() throws Exception {
        return By.xpath(get("save-btn-property-address"));
    }


    public static By contractPartiesStepBTN() throws Exception {
        return By.xpath(get("contract-parties-step-btn"));
    }

    public static By addIndividualTenantBTN() throws Exception {
        return By.xpath(get("add-individual-tenant-btn"));
    }

    public static By tenantRadioBTN() throws Exception {
        return By.xpath(get("tenant-type-radio-btn"));
    }

    public static By tenantNationalIdInput() throws Exception {
        return By.xpath(get("tenant-national-id-input-field"));
    }

    public static By tenantDateOfBirthInput() throws Exception {
        return By.xpath(get("tenant-date-of-birth-input-field"));
    }


    public static By continueBtnOnIndividualContractPage() throws Exception {
        return By.xpath(get("continue-btn"));
    }

    public static By tenantPhoneNumberInput() throws Exception {
        return By.xpath(get("tenant-phone-number-input-field"));
    }

    public static By tenantRegionDropdown() throws Exception {
        return By.xpath(get("tenant-region-dropdown"));
    }

    public static By tenantCityDropdown() throws Exception {
        return By.xpath(get("tenant-city-dropdown"));
    }


    public static By selectTenantCity() throws Exception {
        return By.xpath(get("select-tenant-city"));
    }

    public static By confirmBtnOnTenantAddressPage() throws Exception {
        return By.xpath(get("confirm-btn-on-tenant-address-page"));
    }

    public static By filterBtnOnSelectUnitsPage() throws Exception {
        return By.xpath(get("filter-btn-on-select-units-page"));
    }

    public static By selectUnitsAvailability() throws Exception {
        return By.xpath(get("select-units-availability"));
    }

    public static By addResidentialContractDashboard() throws Exception {
        return By.xpath(get("add-residential-contract-heading"));
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

    public static By addNewIbanBTN() throws Exception {
        return By.xpath(get("add-new-iban-btn"));
    }

    public static By ibanNumberInputField() throws Exception {
        return By.xpath(get("iban-number-input-field"));
    }

    public static By accountOwnerNameInputField() throws Exception {
        return By.xpath(get("account-owner-name-input-field"));
    }

    public static By saveBTNonAddNewIban() throws Exception {
        return By.xpath(get("save-btn-on-add-new-iban"));
    }

    public static By selectIbanDropdown() throws Exception {
        return By.xpath(get("select-iban-dropdown"));
    }

    public static By ibanAccountOwnerRadioBTN() throws Exception {
        return By.xpath(get("iban-account-owner-radio-btn"));
    }

    public static By continueToAdditionalFeeBTN() throws Exception {
        return By.xpath(get("continue-to-additional-fee-btn"));
    }

    public static By continueFinancialTermsBTN() throws Exception {
        return By.xpath(get("continue-financial-terms-btn"));
    }

    public static By termsAndConditionsStepBTN() throws Exception {
        return By.xpath(get("terms-and-conditions-step"));
    }

    public static By addTermsAndConditionsBTN() throws Exception {
        return By.xpath(get("add-terms-and-conditions-btn"));
    }

    public static By ejarFeesPayerRadioBTN() throws Exception {
        return By.xpath(get("ejar-fees-payer-radio-btn"));
    }

    public static By governingLawRadioBTN() throws Exception {
        return By.xpath(get("governing-law-radio-btn"));
    }

    public static By confirmTermsAndConditionsBTN() throws Exception {
        return By.xpath(get("confirm-terms-and-conditions-btn"));
    }

    public static By submitForApprovalBTN() throws Exception {
        return By.xpath(get("submit-for-approval-btn"));
    }

    public static By continueBtnOnPreviewContractPage() throws Exception {
        return By.xpath(get("continue-btn-on-preview-contract-page"));
    }

    public static By continuePayBtnOnPreviewBrokerageAgreementPage() throws Exception {
        return By.xpath(get("continue-pay-btn-on-preview-brokerage-agreement-page"));
    }

    public static By disclaimerCheckboxOnPayingEjarFeesPage() throws Exception {
        return By.xpath(get("disclaimer-checkbox-on-paying-ejar-fees-page"));
    }

    public static By confirmAndSubmitBtnOnPayingEjarFeesPage() throws Exception {
        return By.xpath(get("confirm-and-submit-btn-on-paying-ejar-fees-page"));
    }

    public static By contractStatus() throws Exception {
        return By.xpath(get("contract-status-text"));
    }

    public static By closeSurveyPopUpBTN() throws Exception {
        return By.xpath(get("close-survey-pop-up-btn"));
    }

    public static By confirmBtnOnCloseSurveyPopUp() throws Exception {
        return By.xpath(get("confirm-btn-on-close-survey-pop-up"));
    }

    public static By contractNumber() throws Exception {
        return By.xpath(get("contract-number-text"));
    }

    public static By searchContractNumberInputField() throws Exception {
        return By.xpath(get("search-contract-number-input-field"));
    }

    public static By filterBtnOnViewAllContractsPage() throws Exception {
        return By.xpath(get("filter-btn-on-view-all-contracts-page"));
    }


    public static By threeDotsBesideContractStatus() throws Exception {
        return By.xpath(get("three-dots-beside-contract-status"));
    }

    public static By dropdownMenuOptionsForContract() throws Exception {
        return By.xpath(get("dropdown-menu-for-contract-options"));
    }

    public static By letsStartBTN() throws Exception {
        return By.xpath(get("Lets-start-btn"));
    }

    public static By confirmBTN() throws Exception {
        return By.xpath(get("confirm-btn"));
    }

    public static By confirmBTN2() throws Exception {
        return By.xpath(get("confirm-btn2"));
    }

    public static By agreementCheckbox() throws Exception {
        return By.xpath(get("agreement-checkbox"));
    }

    public static By submitContractApprovalBTN() throws Exception {
        return By.xpath(get("submit-contract-approval-btn"));
    }

    public static By OTPButton() throws Exception {
        return By.xpath(get("OTP-input"));
    }

    public static By verifyIdentityBTN() throws Exception {
        return By.xpath(get("verify-identity-btn"));
    }

    public static By approvalSubmittedText() throws Exception {
        return By.xpath(get("approval-submitted-text"));
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

    public static By signLocation() throws Exception {
        return By.xpath(get("Sign-Location"));
    }

    public static By signSpecialSpecification() throws Exception {
        return By.xpath(get("Sign-Special-Specification"));
    }

    public static By signWidth() throws Exception {
        return By.xpath(get("Sign-Width"));
    }

    public static By signHeight() throws Exception {
        return By.xpath(get("Sign-Height"));
    }

    public static By streetName() throws Exception {
        return By.xpath(get("Additional-Number"));
    }

    public static By buildingNumber() throws Exception {
        return By.xpath(get("Building-Number"));
    }

    public static By additionalNumber() throws Exception {
        return By.xpath(get("Street-Name"));
    }

    public static By paymentFrequency() throws Exception {
        return By.xpath(get("Payment-Frequency"));
    }

    public static By flexiblePaymentFrequency() throws Exception {
        return By.xpath(get("Flexible-Payment-Frequency"));
    }

    public static final By getPaymentFrequencyOption(String PaymentOption) {
        String xpath = "//label[@class='form-check-label']//div[text()='" + PaymentOption + "']";
        return By.xpath(xpath);
    }

    public static By approvedContract() throws Exception {
        return By.xpath(get("Aproved-Contract"));
    }

    public static By assessmentButton() throws Exception {
        return By.xpath(get("Assessment-Button"));
    }


    public static By assessment1() throws Exception {
        return By.xpath(get("Assessment1"));
    }

    public static By assessment2() throws Exception {
        return By.xpath(get("Assessment2"));
    }

    public static By assessmentSendButton() throws Exception {
        return By.xpath(get("Assessment-Send-Button"));
    }

    public static By confirmAssessmentSendMessage() throws Exception {
        return By.xpath(get("Confirm-Assessment-Send-Message"));
    }

    public static By closeSurvey() throws Exception {
        return By.xpath(get("Close-Survey"));
    }

    public static By contractNotFound() throws Exception {
        return By.xpath(get("Contract-Not-Found"));
    }

    public static By contractNumberTXT() throws Exception {
        return By.xpath(get("Contract-Number-TXT"));
    }

    public static By contractDeleteButton() throws Exception {
        return By.xpath(get("Contract-Delete-Button"));
    }

    public static By confirmDeleteButton() throws Exception {
        return By.xpath(get("Confirm-Delete-Button"));
    }

    public static By getDraftContractStatus() throws Exception {
        return By.xpath(get("Draft-Status"));
    }

    public static By saveContractAsDraft() throws Exception {
        return By.xpath(get("Save-Contract-As-Draft"));
    }

    public static By SameTermRadioButton() {
        return By.xpath("//div[text()='نفس مدة العقد السابقة']/parent::label");
    }

    public static By NoticePeriodInput() {
        return By.xpath("//input[@data-name=\"cancel_auto_renewal_notice_period_in_days\"]");
    }
}