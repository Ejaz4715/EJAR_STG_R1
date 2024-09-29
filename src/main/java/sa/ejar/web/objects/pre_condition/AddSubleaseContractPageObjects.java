package sa.ejar.web.objects.pre_condition;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class AddSubleaseContractPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("BTN_View_All_Contracts", new HashMap<>() {{
            put("ar", "//span[text()='عرض جميع العقود']");
        }});
        put("TXT_Contract_Number", new HashMap<>() {{
            put("ar", "//input[@formcontrolname='contract_number']");
        }});

        put("BTN_Dots", new HashMap<>() {{
            put("ar", "//div[@data-dropdown-role='toggler']//span[@class='round-icon large menu']");
        }});
        put("Add_Sublease_Contract", new HashMap<>() {{
            put("ar", "//a[contains(text(),'إنشاء عقد إيجار من الباطن')]");
        }});
        put("BTN_Register", new HashMap<>() {{
            put("ar", "//a/span[text()='تسجيل']");
        }});
        put("National_ID_Radio_BTN", new HashMap<>() {{
            put("ar", "//label[text()=' هوية وطنية ']");
        }});

        put("BTN_Search", new HashMap<>() {{
            put("ar", "//button[text()=' البحث ']");
        }});

        put("BTN_Next", new HashMap<>() {{
            put("ar", "//button[text()='التالي']");
        }});

        put("Term-Condition-BTN_Next", new HashMap<>() {{
            put("ar", "//button[text()=' التالي ']");
        }});
        put("TXT_Username", new HashMap<>() {{
            put("ar", "//input[@formcontrolname='username']");
        }});
        put("TXT_Password", new HashMap<>() {{
            put("ar", "//input[@formcontrolname='password']");
        }});
        put("TXT_Confirm_Password", new HashMap<>() {{
            put("ar", "//input[@formcontrolname='password_confirmation']");
        }});
        put("BTN_Create_Account", new HashMap<>() {{
            put("ar", "//button[text()=' إنشاء حساب ']");
        }});
        put("Checkbox_Terms", new HashMap<>() {{
            put("ar", "//app-form-checkbox[@formcontrolname='terms_confirmed']");
        }});
        put("Checkbox_Info", new HashMap<>() {{
            put("ar", "//app-form-checkbox[@formcontrolname='info_confirmed']");
        }});
        put("BTN_Confirm", new HashMap<>() {{
            put("ar", "//button[text()=' تأكيد ']");
        }});

        put("BTN_Login_To_Account", new HashMap<>() {{
            put("ar", "//button[text()=' تسجيل الدخول إلى حسابك ']");
        }});

        put("TXT_Email", new HashMap<>() {{
            put("ar", "//input[@formcontrolname='email']");
        }});
        put("TXT_Postal_Code", new HashMap<>() {{
            put("ar", "//input[@formcontrolname='postal_code']");
        }});
        put("TXT_Street_Name", new HashMap<>() {{
            put("ar", "//input[@formcontrolname='street_name']");
        }});
        put("TXT_Building_Number", new HashMap<>() {{
            put("ar", "//input[@formcontrolname='building_number']");
        }});
        put("TXT_Additional_Number", new HashMap<>() {{
            put("ar", "//input[@formcontrolname='additional_number']");
        }});
        put("BTN_Add_Companions", new HashMap<>() {{
            put("ar", "//a[@data-test-id='contracts.companions.add']");
        }});
        put("Switch_BTN_Utilities_And_Services", new HashMap<>() {{
            put("ar", "//app-switch-input[@formcontrolname='utilities_and_services_required']");
        }});
        put("Switch-BTN-Engineering-Supervision", new HashMap<>() {{
            put("ar", "//form[@id='engineering_supervision_form']//span[@class='slider enable-transitions']");
        }});
        put("Switch-BTN-Unit-Finishing", new HashMap<>() {{
            put("ar", "//form[@id='unit_finishing_form']//span[@class='slider enable-transitions']");
        }});
        put("Switch-BTN-Waste-Removal", new HashMap<>() {{
            put("ar", "//form[@id='waste_removal_form']//span[@class='slider enable-transitions']");
        }});
        put("Switch_BTN_Security_Deposit", new HashMap<>() {{
            put("ar", "//form[@id='security_deposit_form']//span[@class='slider enable-transitions']");
        }});
        put("TXT-Engineering-Supervision", new HashMap<>() {{
            put("ar", "//input[@data-name='engineering_supervision']");
        }});
        put("TXT-Unit-Finishing", new HashMap<>() {{
            put("ar", "//input[@data-name='unit_finishing']");
        }});
        put("TXT-Waste-Removal", new HashMap<>() {{
            put("ar", "//input[@data-name='waste_removal']");
        }});
        put("TXT_Security_Deposit", new HashMap<>() {{
            put("ar", "//input[@data-name='security_deposit']");
        }});
        put("Switch_BTN_Late_Fees_Charged", new HashMap<>() {{
            put("ar", "//form[@id='late_fees_charged_form']//span[@class='slider enable-transitions']");
        }});
        put("TXT_Late_Fees_Charged", new HashMap<>() {{
            put("ar", "//input[@data-name='late_fees_charged']");
        }});
        put("Switch_BTN_Retainer_Fees", new HashMap<>() {{
            put("ar", "//form[@id='retainer_fee_form']//span[@class='slider enable-transitions']");
        }});
        put("TXT_Retainer_Fees", new HashMap<>() {{
            put("ar", "//input[@data-name='retainer_fee']");
        }});
        put("Switch_BTN_Brokerage_Fees", new HashMap<>() {{
            put("ar", "//form[@id='brokerage_fee_form']//span[@class='slider enable-transitions']");
        }});
        put("TXT_Brokerage_Fees", new HashMap<>() {{
            put("ar", "//input[@data-name='brokerage_fee']");
        }});
        put("TXT_Brokerage_Fees_Due_Date", new HashMap<>() {{
            put("ar", "//input[@data-name='brokerage_fee_due_date']");
        }});
        put("Switch_BTN_Government_Review", new HashMap<>() {{
            put("ar", "//app-term-question[@data-test-id='residential_followup_with_authorities']//span[@class='slider enable-transitions']");
        }});
        put("Switch_BTN_Improvement", new HashMap<>() {{
            put("ar", "//app-term-question[@data-test-id='renovations_and_improvements_rental_unit']//span[@class='slider enable-transitions']");
        }});
        put("Switch_BTN_Edit_Unit", new HashMap<>() {{
            put("ar", "//app-term-question[@data-test-id='modification_rental_unit']//span[@class='slider enable-transitions']");
        }});
        put("Switch_BTN_Custom_Terms", new HashMap<>() {{
            put("ar", "//app-switch-input[@class='float-right ng-untouched ng-pristine ng-valid']//span[@class='slider enable-transitions']");
        }});

        put("BTN_Add_Another_Terms", new HashMap<>() {{
            put("ar", "//a[@class='add-link text-primary']");
        }});
        put("TXT_Terms", new HashMap<>() {{
            put("ar", "//textarea");
        }});
        put("BTN_Select_Unit", new HashMap<>() {{
            put("ar", "//a[text()=' حدد الوحدة ']");
        }});
        put("BTN_Close_Window", new HashMap<>() {{
            put("ar", "//button[@class='close-button']");
        }});
        put("BTN_Close", new HashMap<>() {{
            put("ar", "//button[contains(text(),'إغلاق')]");
        }});
        put("BTN_Charge", new HashMap<>() {{
            put("ar", "//button[@class='btn btn-sm btn-outline-primary mb-1']");
        }});
        put("option-new-residential-contract", new HashMap<>() {{
            put("en", "//span[text()='Create new residential']");
            put("ar", "//span[text()='تسجيل عقد سكني']");
        }});
        put("btn-contracts", new HashMap<>() {{
            put("ar", "//a[text()=' العقود ']");
        }});
        put("filter-btn-on-view-all-contracts-page", new HashMap<>() {{
            put("en", "//span[@class='icon filter-icon']");
            put("ar", "//span[@class='icon filter-icon']");
        }});
        put("date-input-field", new HashMap<>() {{
            put("en", "//input[@data-name='contract_start_date']");
            put("ar", "//input[@data-name='contract_start_date']");
        }});
        put("click-start-year", new HashMap<>() {{
            put("en", "(//button[@data-test-id='year-selection'])[1]");
            put("ar", "(//button[@data-test-id='year-selection'])[1]");
        }});
        put("select-start-year", new HashMap<>() {{
            put("en", "//div[@class='year-select-item']/child::button");
            put("ar", "//div[@class='year-select-item']/child::button");
        }});
        put("click-start-month", new HashMap<>() {{
            put("en", "(//button[@data-test-id='month-selection'])[1]");
            put("ar", "(//button[@data-test-id='month-selection'])[1]");
        }});
        put("select-start-month", new HashMap<>() {{
            put("en", "//div[@class='month-select-item']/child::button");
            put("ar", "//div[@class='month-select-item']/child::button");
        }});
        put("select-start-day", new HashMap<>() {{
            put("en", "(//table)[1]//tr//td");
            put("ar", "(//table)[1]//tr//td");
        }});
        put("click-end-year", new HashMap<>() {{
            put("en", "(//button[@data-test-id='year-selection'])[2]");
            put("ar", "(//button[@data-test-id='year-selection'])[2]");
        }});
        put("select-end-year", new HashMap<>() {{
            put("en", "//div[@class='year-select-item']/child::button");
            put("ar", "//div[@class='year-select-item']/child::button");
        }});
        put("click-end-month", new HashMap<>() {{
            put("en", "(//button[@data-test-id='month-selection'])[2]");
            put("ar", "(//button[@data-test-id='month-selection'])[2]");
        }});
        put("select-end-month", new HashMap<>() {{
            put("en", "//div[@class='month-select-item']/child::button");
            put("ar", "//div[@class='month-select-item']/child::button");
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
            put("ar", "//a[text()=' إضافة عقار ']");
        }});
        put("property-use-dropdown", new HashMap<>() {{
            put("en", "//select[@data-name='property_usage']");
            put("ar", "//select[@data-name='property_usage']");
        }});
        put("property-type-dropdown", new HashMap<>() {{
            put("en", "//select[@data-name='property_type']");
            put("ar", "//select[@data-name='property_type']");
        }});
        put("ownership-document-type-dropdown", new HashMap<>() {{
            put("en", "//select[@data-name='property_type']");
            put("ar", "//select[@data-name='property_type']");
        }});
        put("property-name", new HashMap<>() {{
            put("en", "//div[@class='col']/child::h5");
            put("ar", "//div[@class='col']/child::h5");
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
            put("en", "//div[@class='col p-0 pe-3']/child::h5");
            put("ar", "//div[@class='col p-0 pe-3']/child::h5");
        }});
        put("select-first-available-unit", new HashMap<>() {{
            put("en", "(//div[@class='col p-0 pe-3']/child::h5)[1]");
            put("ar", "(//div[@class='col p-0 pe-3']/child::h5)[1]");
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
        }});
        put("confirm-btn-on-map", new HashMap<>() {{
            put("en", "//button[text()=' Confirm ']");
        }});
        put("save-btn-property-address", new HashMap<>() {{
            put("en", "//button[text()=' Save ']");
        }});
        put("contract-parties-step-btn", new HashMap<>() {{
            put("en", "//div[text()=' Contract parties ']");
            put("ar", "//div[text()=' أطراف العقد ']");
        }});
        put("add-individual-tenant-btn", new HashMap<>() {{
            put("en", "//a[@data-test-id='contracts.contract-parties.add-individual-tenant']");
            put("ar", "//a[@data-test-id='contracts.contract-parties.add-individual-tenant']");
        }});
        put("tenant-type-radio-btn", new HashMap<>() {{
            put("en", "//label[text()=' Tenant ']");
            put("ar", "//label[text()=' المستأجر ']");
        }});
        put("tenant-national-id-input-field", new HashMap<>() {{
            put("en", "//input[@data-name='id_number']");
            put("ar", "//input[@data-name='id_number']");
        }});
        put("tenant-date-of-birth-input-field", new HashMap<>() {{
            put("en", "//input[@data-name='hijri']");
            put("ar", "//input[@data-name='hijri']");
        }});
        put("continue-btn", new HashMap<>() {{
            put("en", "//button[text()=' Continue ']");
            put("ar", "//button[text()=' التالي ']");
        }});
        put("tenant-phone-number-input-field", new HashMap<>() {{
            put("en", "//input[@data-name='nationalNumber']");
            put("ar", "//input[@data-name='nationalNumber']");
        }});
        put("tenant-region-dropdown", new HashMap<>() {{
            put("en", "//select[@data-name='region']");
            put("ar", "//select[@data-name='region']");
        }});
        put("tenant-city-dropdown", new HashMap<>() {{
            put("en", "//label[text()='City']/parent::app-form-field/descendant::div[text()=' Please select ']");
            put("ar", "//label[text()='المدينة']/parent::app-form-field/descendant::div[text()=' يرجى اختيار ']");
        }});
        put("select-tenant-city", new HashMap<>() {{
            put("en", "//div[@class='option-text']");
            put("ar", "//div[@class='option-text']");
        }});
        put("confirm-btn-on-tenant-address-page", new HashMap<>() {{
            put("en", "//button[text()=' Confirm ']");
            put("ar", "//button[text()=' تأكيد ']");
        }});
        put("filter-btn-on-select-units-page", new HashMap<>() {{
            put("en", "//span[@class='icon filter-icon']");
            put("ar", "//span[@class='icon filter-icon']");
        }});
        put("select-units-availability", new HashMap<>() {{
            put("en", "//select[@data-name='unit_availability']");
            put("ar", "//select[@data-name='unit_availability']");
        }});
        put("add-residential-contract-heading", new HashMap<>() {{
            put("en", "//h1[text()=' Add Residential Contract ']");
            put("ar", "//h1[text()=' تسجيل عقد سكني ']");
        }});
        put("annual-rent-fee-input-field", new HashMap<>() {{
            put("en", "//input[@data-name='total_units_rent']");
            put("ar", "//input[@data-name='total_units_rent']");
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
            put("en", "//input[@data-name='iban_number']");
            put("ar", "//input[@data-name='iban_number']");
        }});
        put("account-owner-name-input-field", new HashMap<>() {{
            put("en", "//input[@data-name='alias_name']");
            put("ar", "//input[@data-name='alias_name']");
        }});
        put("save-btn-on-add-new-iban", new HashMap<>() {{
            put("en", "//button[text()=' Save ']");
            put("ar", "//button[text()=' حفظ ']");
        }});

        put("select-iban-dropdown", new HashMap<>() {{
            put("en", "//select[@data-name='iban_number']");
            put("ar", "//select[@data-name='iban_number']");
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
            put("ar", "//div[text()=' الشروط والأحكام ']");
        }});
        put("add-terms-and-conditions-btn", new HashMap<>() {{
            put("en", "//a[@routerlink='terms-and-conditions']");
            put("ar", "//a[@routerlink='terms-and-conditions']");
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
            put("en", "//a[@data-test-id='contracts.financial-terms.add-terms']");
            put("ar", "//a[@data-test-id='contracts.financial-terms.add-terms']");
        }});
        put("continue-btn-on-preview-contract-page", new HashMap<>() {{
            put("en", "//button[text()=' Continue ']");
            put("ar", "//button[text()=' التالي ']");
        }});
        put("continue-pay-btn-on-preview-brokerage-agreement-page", new HashMap<>() {{
            put("en", "//button[text()=' Continue to paying fees ']");
            put("ar", "//button[text()=' الاستمرار في دفع الرسوم ']");
        }});
        put("disclaimer-checkbox-on-paying-ejar-fees-page", new HashMap<>() {{
            put("en", "(//label[@class='form-check-label'])[1]");
            put("ar", "(//label[@class='form-check-label'])[1]");
        }});
        put("confirm-and-submit-btn-on-paying-ejar-fees-page", new HashMap<>() {{
            put("en", "//button[text()=' Confirm and submit ']");
            put("ar", "//button[text()=' تأكيد وإرسال ']");
        }});
        put("contract-status-text", new HashMap<>() {{
            put("en", "(//span[@class='pin mt-1 max-width-110 success'])[1]");
            put("ar", "(//span[@class='pin mt-1 max-width-110 success'])[1]");
        }});
        put("close-survey-pop-up-btn", new HashMap<>() {{
            put("en", "//button[@class='close-button']");
            put("ar", "//button[@class='close-button']");
        }});
        put("confirm-btn-on-close-survey-pop-up", new HashMap<>() {{
            put("en", "//button[text()=' Confirm ']");
            put("ar", "//button[text()=' تأكيد ']");
        }});
        put("contract-number-text", new HashMap<>() {{
            put("en", "//h4[@class='ms-4']");
            put("ar", "//h4[@class='ms-4']");
        }});
        put("search-contract-number-input-field", new HashMap<>() {{
            put("en", "//input[@data-name='contract_number']");
            put("ar", "//input[@data-name='contract_number']");
        }});
        put("contract-number-text-view-all-contract-page", new HashMap<>() {{
            put("en", "//h5[@class='item-value']/child::a");
            put("ar", "//h5[@class='item-value']/child::a");
        }});
        put("approve-contract-btn", new HashMap<>() {{
            put("en", "//button[text()=' Approve contract ']");
            put("ar", "//a[text()=' الموافقة على العقد ']");
        }});
        put("Meter-Current-Reading", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-form-field[@class='form-group field-pristine field-valid']//input[@data-name='meter_current_reading']");
        }});

        put("Validate-Button", new HashMap<>() {{
            put("en", "");
            put("ar", "//button[@class='btn btn-secondary btn-sm']");
        }});

        put("Water-Meter-Number", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='water_meter']");
        }});

        put("Water-Meter-Account", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='water_meter_account']");
        }});

        put("Electricity-Other-Option", new HashMap<>() {{
            put("en", "");
            put("ar", "(//app-form-radio[@formcontrolname='meter_type'])[3]");
        }});

        put("Water-Other-Option", new HashMap<>() {{
            put("en", "");
            put("ar", "//div[@class=' Other ']//label[text()=' Other ']");
        }});

        put("Meter-Reason", new HashMap<>() {{
            put("en", "");
            put("ar", "//textarea[@formcontrolname='other_meter_reason']");
        }});

        put("Number-Of-Parking", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='number_of_parking_lots']");
        }});
        put("Gas-Meter-Current-Reading", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@class='form-control invalid ng-untouched ng-pristine ng-invalid']");
        }});
        put("Gas-Fee-Reading-Meter", new HashMap<>() {{
            put("en", "");
            put("ar", "//label[text()=' قراءة العداد ']");
        }});
        put("Gas-Fee-Option", new HashMap<>() {{
            put("en", "");
            put("ar", "//label[text()=' ثابت سنويًا ']");
        }});

        put("Electricity-Meter-Site", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='premise_id']");
        }});

        put("Close-Alert-Message", new HashMap<>() {{
            put("en", "");
            put("ar", "//span[@class='close-icon-black']");
//            put("ar", "//span[@class='close-icon-black cursor-pointer']");
        }});
        put("Electricity-Current-Reading", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='electricity_current_reading']");
        }});
        put("Switch-BTN-Arbitration", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='dispute_settlement']//span[@class='slider enable-transitions']");
        }});

        put("Switch-BTN-Contract-Subject-To-Condition", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='conditional_contract']//span[@class='slider enable-transitions']");
        }});

        put("Switch-BTN-Change-Commercial-Activity", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='changing_commercial_activity']//span[@class='slider enable-transitions']");
        }});

        put("Switch-BTN-Automatic-Contract-Renewal", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[contains(@data-test-id,'auto_renewal')]//span[@class='slider enable-transitions']");
        }});

        put("Switch-BTN-Sublease", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='subleasing_and_lease_transfer']//span[@class='slider enable-transitions']");
        }});

        put("Switch-BTN-Review-Government-And-Official-Agencies", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='followup_with_authorities']//span[@class='slider enable-transitions']");
        }});

        put("Switch-BTN-Additional-Terms-And-Conditions", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-switch-input[@formcontrolname='custom_terms_accepted']//span[@class='slider enable-transitions']");
        }});

        put("Add-Additional-Term", new HashMap<>() {{
            put("en", "");
            put("ar", "//a[text()=' إضافة بند آخر ']");
        }});

        put("Add-Additional-Term-Input", new HashMap<>() {{
            put("en", "");
            put("ar", "//textarea[@formcontrolname='content']");
        }});

        put("Confirm-Add-Additional-Term-Input-But", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-card-footer[@class='card-footer']//button[text()=' تأكيد ']");
        }});

        put("Confirm-Additional-Term-But", new HashMap<>() {{
            put("en", "");
            put("ar", "//div[@class='button-bar']//button[text()=' تأكيد ']");
        }});

        put("Dispute-Resolution-Period", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='dispute_resolution_period_in_days']");
        }});
        put("Cancel-Auto-Renewal", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='cancel_auto_renewal_notice_period_in_days']");
        }});
        put("Switch-BTN-Safety-And-Security-Precautions", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='safety_and_security']//span[@class='slider enable-transitions']");
        }});
        put("Switch-BTN-Changes-On-Unit", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='changes_on_unit']//span[@class='slider enable-transitions']");
        }});
        put("Switch-BTN-Interior-Design-Works", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='interior_and_design_works']//span[@class='slider enable-transitions']");
        }});
        put("Switch-BTN-Unit-Opening-Delayed", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='daily_rent_on_late_opening']//span[@class='slider enable-transitions']");
        }});
        put("Daily-Value-Delay", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='daily_amount']");
        }});
        put("Switch-BTN-Trademark-Registration-Proof", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='trademark_registration_proof']//span[@class='slider enable-transitions']");
        }});

        put("Switch-BTN-Insurance-Policy", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='insurance_policy']//span[@class='slider enable-transitions']");
        }});

        put("Switch-BTN-Maintaining-Electrical-Mechanical-Infrastructures", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='maintaining_electrical_mechanical_infrastructures']//span[@class='slider enable-transitions']");
        }});

        put("Switch-BTN-Non-Smoking-Zones", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='abide_with_non_smoking_zones']//span[@class='slider enable-transitions']");
        }});

        put("Switch-BTN-Waste-Disposal", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='waste_disposal']//span[@class='slider enable-transitions']");
        }});

        put("Switch-BTN-Unit-Closing-Period", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='permitted_unit_closing_period']//span[@class='slider enable-transitions']");
        }});
        put("Continuous-Closing-Days", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='continuous_closing_days']");
        }});
        put("Discontinuous-Closing-Days", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='discontinuous_closing_days']");
        }});
        put("Switch-BTN-Removal-Additions-Lease-Expire", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='removal_of_additions_on_lease_expire']//span[@class='slider enable-transitions']");
        }});
        put("Period-For-Terminating-If-Unit-Not-Opened", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='notification_for_termination_period']");
        }});
        put("Opening-Period-For-Intended-Activity", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='unit_opening_period']");
        }});

        put("Switch-BTN-Approval-User-Guide", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='receipt_of_tenant_manual']//span[@class='slider enable-transitions']");
        }});

        put("Daily-Value-Of-Delayed-Delivery-Unit", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='daily_amount']");
        }});

        put("Switch-BTN-Daily-Charge-In-Case-Delayed-Delivery-Unit", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='daily_rent_on_handover_delay']//span[@class='slider enable-transitions']");
        }});

        put("Daily-Value-Of-Delay-Cancel-Municipal-License", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='municipality_cancellation_delay_daily_rent']");
        }});
        put("Switch-BTN-Cancel-Municipal-License", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='municipality_license_cancellation']//span[@class='slider enable-transitions']");
        }});
        put("Switch-BTN-Adherence-To-Opening-And-Closing-Dates-Of-Rental-Unit", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='commit_to_facility_working_hours']//span[@class='slider enable-transitions']");
        }});
        put("Switch-BTN-Commercial-Discounts", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='promotion_announcement']//span[@class='slider enable-transitions']");
        }});
        put("Switch-BTN-Isolation-Floor-For-Any-Activity-Use-Water-And-Sanitation", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='floor_water_proof']//span[@class='slider enable-transitions']");
        }});
        put("Switch-BTN-Loading-And-Unloading-Operations", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='loading_zone_operations']//span[@class='slider enable-transitions']");
        }});
        put("Switch-BTN-Cancellation-Transfer-Of-Phone-Lines", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='canceling_and_transfer_of_land_phone_lines']//span[@class='slider enable-transitions']");
        }});
        put("Switch-BTN-Replacing-Rental-Unit", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='changing_replacing_unit']//span[@class='slider enable-transitions']");
        }});
        put("Switch-BTN-Change-In-Rental-Value", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='changing_unit_rent']//span[@class='slider enable-transitions']");
        }});
        put("Number-Reporting-Days", new HashMap<>() {{
            put("en", "");
            put("ar", "//input[@data-name='rent_change_notification_period']");
        }});
        put("Switch-BTN-Adhere-To-Tenant-Guide", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='commit_to_tenants_guide']//span[@class='slider enable-transitions']");
        }});
        put("Validity-Rental-Contract-On-Owner-Change", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='validity_of_contract_on_ownership_change']//span[@class='slider enable-transitions']");
        }});
        put("Obligation-To-Pay-Remaining-Rental-Value", new HashMap<>() {{
            put("en", "");
            put("ar", "//app-term-question[@data-test-id='remaining_rent_on_contract_termination']//span[@class='slider enable-transitions']");
        }});

        put("Not-Have-Iban-Account", new HashMap<>() {{
            put("en", "");
            put("ar", "//div//span[contains(text(),'لم يتم إنشاء أي حساب')]");
        }});

    }};


    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }


    public static By BTNViewAllContracts() throws Exception {
        return By.xpath(get("BTN_View_All_Contracts"));
    }

    public static By TXTContractNumber() throws Exception {
        return By.xpath(get("TXT_Contract_Number"));
    }

    public static By BTNDots() throws Exception {
        return By.xpath(get("BTN_Dots"));
    }

    public static By AddSubleaseContract() throws Exception {
        return By.xpath(get("Add_Sublease_Contract"));
    }

    public static By BTNRegister() throws Exception {
        return By.xpath(get("BTN_Register"));
    }

    public static By NationalIDRadioBTN() throws Exception {
        return By.xpath(get("National_ID_Radio_BTN"));
    }

    public static By BTNSearch() throws Exception {
        return By.xpath(get("BTN_Search"));
    }

    public static By BTNNext() throws Exception {
        return By.xpath(get("BTN_Next"));
    }

    public static By termConditionBTN_Next() throws Exception {
        return By.xpath(get("Term-Condition-BTN_Next"));
    }

    public static By TXTUsername() throws Exception {
        return By.xpath(get("TXT_Username"));
    }

    public static By TXTPassword() throws Exception {
        return By.xpath(get("TXT_Password"));
    }

    public static By TXTConfirmPassword() throws Exception {
        return By.xpath(get("TXT_Confirm_Password"));
    }

    public static By BTNCreateAccount() throws Exception {
        return By.xpath(get("BTN_Create_Account"));
    }

    public static By CheckboxTerms() throws Exception {
        return By.xpath(get("Checkbox_Terms"));
    }

    public static By CheckboxInfo() throws Exception {
        return By.xpath(get("Checkbox_Info"));
    }

    public static By BTNConfirm() throws Exception {
        return By.xpath(get("BTN_Confirm"));
    }

    public static By BTNLoginToAccount() throws Exception {
        return By.xpath(get("BTN_Login_To_Account"));
    }


    public static By BTNContracts() throws Exception {
        return By.xpath(get("btn-contracts"));
    }

    public static By TXTEmail() throws Exception {
        return By.xpath(get("TXT_Email"));
    }

    public static By TXTPostalCode() throws Exception {
        return By.xpath(get("TXT_Postal_Code"));
    }

    public static By TXTStreetName() throws Exception {
        return By.xpath(get("TXT_Street_Name"));
    }

    public static By TXTBuildingNumber() throws Exception {
        return By.xpath(get("TXT_Building_Number"));
    }

    public static By TXTAdditionalNumber() throws Exception {
        return By.xpath(get("TXT_Additional_Number"));
    }

    public static By BTNAddCompanions() throws Exception {
        return By.xpath(get("BTN_Add_Companions"));
    }

    public static By SwitchBTNUtilitiesAndServices() throws Exception {
        return By.xpath(get("Switch_BTN_Utilities_And_Services"));
    }

    public static By SwitchBTNEngineeringSupervision() throws Exception {
        return By.xpath(get("Switch-BTN-Engineering-Supervision"));
    }

    public static By SwitchBTNUnitFinishing() throws Exception {
        return By.xpath(get("Switch-BTN-Unit-Finishing"));
    }

    public static By SwitchBTNWasteRemoval() throws Exception {
        return By.xpath(get("Switch-BTN-Waste-Removal"));
    }

    public static By SwitchBTNSecurityDeposit() throws Exception {
        return By.xpath(get("Switch_BTN_Security_Deposit"));
    }

    public static By TXTEngineeringSupervision() throws Exception {
        return By.xpath(get("TXT-Engineering-Supervision"));
    }

    public static By TXTUnitFinishing() throws Exception {
        return By.xpath(get("TXT-Unit-Finishing"));
    }

    public static By TXTWasteRemoval() throws Exception {
        return By.xpath(get("TXT-Waste-Removal"));
    }

    public static By TXTSecurityDeposit() throws Exception {
        return By.xpath(get("TXT_Security_Deposit"));
    }

    public static By SwitchBTNLateFeesCharged() throws Exception {
        return By.xpath(get("Switch_BTN_Late_Fees_Charged"));
    }

    public static By TXTLateFeesCharged() throws Exception {
        return By.xpath(get("TXT_Late_Fees_Charged"));
    }

    public static By SwitchBTNRetainerFees() throws Exception {
        return By.xpath(get("Switch_BTN_Retainer_Fees"));
    }

    public static By TXTRetainerFees() throws Exception {
        return By.xpath(get("TXT_Retainer_Fees"));
    }

    public static By SwitchBTNBrokerageFees() throws Exception {
        return By.xpath(get("Switch_BTN_Brokerage_Fees"));
    }

    public static By TXTBrokerageFees() throws Exception {
        return By.xpath(get("TXT_Brokerage_Fees"));
    }

    public static By TXTBrokerageFeesDueDate() throws Exception {
        return By.xpath(get("TXT_Brokerage_Fees_Due_Date"));
    }

    public static By SwitchBTNGovernmentReview() throws Exception {
        return By.xpath(get("Switch_BTN_Government_Review"));
    }

    public static By SwitchBTNImprovement() throws Exception {
        return By.xpath(get("Switch_BTN_Improvement"));
    }

    public static By SwitchBTNEditUnit() throws Exception {
        return By.xpath(get("Switch_BTN_Edit_Unit"));
    }

    public static By SwitchBTNCustomTerms() throws Exception {
        return By.xpath(get("Switch_BTN_Custom_Terms"));
    }

    public static By BTNAddAnotherTerms() throws Exception {
        return By.xpath(get("BTN_Add_Another_Terms"));
    }

    public static By TXTTerms() throws Exception {
        return By.xpath(get("TXT_Terms"));
    }

    public static By BTNSelectUnit() throws Exception {
        return By.xpath(get("BTN_Select_Unit"));
    }

    public static By BTNCloseWindow() throws Exception {
        return By.xpath(get("BTN_Close_Window"));
    }

    public static By BTNClose() throws Exception {
        return By.xpath(get("BTN_Close"));
    }

    public static By BTNCharge() throws Exception {
        return By.xpath(get("BTN_Charge"));
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

    public static By contractNumberTextOnViewContractsPage() throws Exception {
        return By.xpath(get("contract-number-text-view-all-contract-page"));
    }

    public static By approveContractBTN() throws Exception {
        return By.xpath(get("approve-contract-btn"));
    }

    public static By meterCurrentReading() throws Exception {
        return By.xpath(get("Meter-Current-Reading"));
    }

    public static By validateButton() throws Exception {
        return By.xpath(get("Validate-Button"));
    }

    public static By waterFixedFee() throws Exception {
        return By.xpath(get("Water-Fixed-Fee"));
    }

    public static By waterMeterNumber() throws Exception {
        return By.xpath(get("Water-Meter-Number"));
    }

    public static By waterMeterAccount() throws Exception {
        return By.xpath(get("Water-Meter-Account"));
    }

    public static By electricityOtherOption() throws Exception {
        return By.xpath(get("Electricity-Other-Option"));
    }

    public static By waterOtherOption() throws Exception {
        return By.xpath(get("Water-Other-Option"));
    }

    public static By meterReason() throws Exception {
        return By.xpath(get("Meter-Reason"));
    }

    public static By numberOfParking() throws Exception {
        return By.xpath(get("Number-Of-Parking"));
    }

    public static By gasMeterCurrentReading() throws Exception {
        return By.xpath(get("Gas-Meter-Current-Reading"));
    }

    public static By gasFeeReadingMeter() throws Exception {
        return By.xpath(get("Gas-Fee-Reading-Meter"));
    }

    public static By gasFeeOption() throws Exception {
        return By.xpath(get("Gas-Fee-Option"));
    }

    public static final By getFixed_Option1() {
        String xpath = "(//label[@class='form-check-label'][text()=' مبلغ ثابت '])[1]";
        return By.xpath(xpath);
    }

    public static final By getFixed_Option2() {
        String xpath = "(//label[@class='form-check-label'][text()=' مبلغ ثابت '])[2]";
        return By.xpath(xpath);
    }

    public static final By getInvoice_Option1() {
        String xpath = "(//label[@class='form-check-label'][text()=' دفع الفواتير '])[1]";
        return By.xpath(xpath);
    }

    public static final By getInvoice_Option2() {
        String xpath = "(//label[@class='form-check-label'][text()=' دفع الفواتير '])[2]";
        return By.xpath(xpath);
    }

    public static final By setFixedFee_Input1() {
        String xpath = "(//div[@class='form-input']//input[@data-name='to_be_paid_at'])[1]";
        return By.xpath(xpath);
    }

    public static final By setFixedFee_Input2() {
        String xpath = "(//div[@class='form-input']//input[@data-name='to_be_paid_at'])[2]";
        return By.xpath(xpath);
    }

    public static final By setFixedFee_Input3() {
        String xpath = "(//div[@class='form-input']//input[@data-name='to_be_paid_at'])[3]";
        return By.xpath(xpath);
    }

    public static final By setFixedFee_Input4() {
        String xpath = "(//div[@class='form-input']//input[@data-name='to_be_paid_at'])[4]";
        return By.xpath(xpath);
    }

    public static final By getSeparatedMeter_Option1() {
        String xpath = "(//label[text()=' عداد منفصل '])[1]";
        return By.xpath(xpath);
    }

    public static final By getSeparatedMeter_Option2() {
        String xpath = "(//label[text()=' عداد منفصل '])[2]";
        return By.xpath(xpath);
    }

    public static final By getSharedMeter_Option1() {
        String xpath = " (//label[text()=' عداد مشترك '])[1]";
        return By.xpath(xpath);
    }

    public static final By getSharedMeter_Option2() {
        String xpath = " (//label[text()=' عداد مشترك '])[2]";
        return By.xpath(xpath);
    }

    public static final By getLessorOwnerInvoice_Option1() {
        String xpath = "(//label[@class='form-check-label'][text()=' المؤجر '])[1]";
        return By.xpath(xpath);
    }

    public static final By getLessorOwnerInvoice_Option2() {
        String xpath = "(//label[@class='form-check-label'][text()=' المؤجر '])[2]";
        return By.xpath(xpath);
    }

    public static final By getElectricityOther_Option(String OtherOptionName) {
        String xpath = "//label[text()=' " + OtherOptionName + " ']";
        return By.xpath(xpath);
    }

    public static final By getContractOption(String ContractOption) {
        String xpath = "//div[text()='" + ContractOption + "']";
        return By.xpath(xpath);
    }

    public static By electricityCurrentReadingInput() throws Exception {
        return By.xpath(get("Electricity-Current-Reading"));
    }

    public static By electricityMeterSite() throws Exception {
        return By.xpath(get("Electricity-Meter-Site"));
    }

    public static By closeAlertMessage() throws Exception {
        return By.xpath(get("Close-Alert-Message"));
    }

    public static By SwitchBTNArbitration() throws Exception {
        return By.xpath(get("Switch-BTN-Arbitration"));
    }

    public static By SwitchBTNContractSubjectToCondition() throws Exception {
        return By.xpath(get("Switch-BTN-Contract-Subject-To-Condition"));
    }

    public static By SwitchBTNChangeCommercialActivity() throws Exception {
        return By.xpath(get("Switch-BTN-Change-Commercial-Activity"));
    }

    public static By SwitchBTNAutomaticContractRenewal() throws Exception {
        return By.xpath(get("Switch-BTN-Automatic-Contract-Renewal"));
    }

    public static By SwitchBTNSublease() throws Exception {
        return By.xpath(get("Switch-BTN-Sublease"));
    }

    public static By SwitchBTNReviewGovernmentAndOfficialAgencies() throws Exception {
        return By.xpath(get("Switch-BTN-Review-Government-And-Official-Agencies"));
    }

    public static By SwitchBTNAdditionalTermsAndConditions() throws Exception {
        return By.xpath(get("Switch-BTN-Additional-Terms-And-Conditions"));
    }

    public static By addAdditionalTerm() throws Exception {
        return By.xpath(get("Add-Additional-Term"));
    }

    public static By addAdditionalTermInput() throws Exception {
        return By.xpath(get("Add-Additional-Term-Input"));
    }

    public static By confirmAddAdditionalTermInputBut() throws Exception {
        return By.xpath(get("Confirm-Add-Additional-Term-Input-But"));
    }

    public static By disputeResolutionPeriod() throws Exception {
        return By.xpath(get("Dispute-Resolution-Period"));
    }

    public static By cancelAutoRenewal() throws Exception {
        return By.xpath(get("Cancel-Auto-Renewal"));
    }

    public static By confirmAdditionalTermBut() throws Exception {
        return By.xpath(get("Confirm-Additional-Term-But"));
    }

    public static By SwitchBTNSafetyAndSecurityPrecautions() throws Exception {
        return By.xpath(get("Switch-BTN-Safety-And-Security-Precautions"));
    }

    public static By SwitchBTNChangesOnUnit() throws Exception {
        return By.xpath(get("Switch-BTN-Changes-On-Unit"));
    }

    public static By SwitchBTNInteriorDesignWorks() throws Exception {
        return By.xpath(get("Switch-BTN-Interior-Design-Works"));
    }

    public static By SwitchBTNunitOpeningDelayed() throws Exception {
        return By.xpath(get("Switch-BTN-Unit-Opening-Delayed"));
    }

    public static By dailyValueDelayInput() throws Exception {
        return By.xpath(get("Daily-Value-Delay"));
    }

    public static By SwitchBTNTrademarkRegistrationProof() throws Exception {
        return By.xpath(get("Switch-BTN-Trademark-Registration-Proof"));
    }

    public static By SwitchBTNInsurancePolicy() throws Exception {
        return By.xpath(get("Switch-BTN-Insurance-Policy"));
    }

    public static By SwitchBTNMaintainingElectricalMechanicalInfrastructures() throws Exception {
        return By.xpath(get("Switch-BTN-Maintaining-Electrical-Mechanical-Infrastructures"));
    }

    public static By SwitchBTNNonSmokingZones() throws Exception {
        return By.xpath(get("Switch-BTN-Non-Smoking-Zones"));
    }

    public static By SwitchBTNWasteDisposal() throws Exception {
        return By.xpath(get("Switch-BTN-Waste-Disposal"));
    }

    public static By SwitchBTNUnitClosingPeriod() throws Exception {
        return By.xpath(get("Switch-BTN-Unit-Closing-Period"));
    }

    public static By continuousClosingDays() throws Exception {
        return By.xpath(get("Continuous-Closing-Days"));
    }

    public static By discontinuousClosingDays() throws Exception {
        return By.xpath(get("Discontinuous-Closing-Days"));
    }

    public static By periodForTerminatingIfUnitNotOpened() throws Exception {
        return By.xpath(get("Period-For-Terminating-If-Unit-Not-Opened"));
    }

    public static By openingPeriodForIntendedActivity() throws Exception {
        return By.xpath(get("Opening-Period-For-Intended-Activity"));
    }

    public static By SwitchBTNApprovalUserGuide() throws Exception {
        return By.xpath(get("Switch-BTN-Approval-User-Guide"));
    }

    public static By dailyValueOfDelayedDeliveryUnit() throws Exception {
        return By.xpath(get("Daily-Value-Of-Delayed-Delivery-Unit"));
    }

    public static By SwitchBTNDailyChargeInCaseDelayedDeliveryUnit() throws Exception {
        return By.xpath(get("Switch-BTN-Daily-Charge-In-Case-Delayed-Delivery-Unit"));
    }

    public static By dailyValueOfDelayCancelMunicipalLicense() throws Exception {
        return By.xpath(get("Daily-Value-Of-Delay-Cancel-Municipal-License"));
    }

    public static By SwitchBTNCancelMunicipalLicense() throws Exception {
        return By.xpath(get("Switch-BTN-Cancel-Municipal-License"));
    }

    public static By SwitchBTNRemovalAdditionsLeaseExpire() throws Exception {
        return By.xpath(get("Switch-BTN-Removal-Additions-Lease-Expire"));
    }

    public static By SwitchBTNAdhereToTenantGuide() throws Exception {
        return By.xpath(get("Switch-BTN-Adhere-To-Tenant-Guide"));
    }

    public static By SwitchBTNAdherenceToOpeningAndClosingDatesOfRentalUnit() throws Exception {
        return By.xpath(get("Switch-BTN-Adherence-To-Opening-And-Closing-Dates-Of-Rental-Unit"));
    }

    public static By SwitchBTNCommercialDiscounts() throws Exception {
        return By.xpath(get("Switch-BTN-Commercial-Discounts"));
    }

    public static By SwitchBTNIsolationFloorForAnyActivityUseWaterAndSanitation() throws Exception {
        return By.xpath(get("Switch-BTN-Isolation-Floor-For-Any-Activity-Use-Water-And-Sanitation"));
    }

    public static By SwitchBTNLoadingAndUnloadingOperations() throws Exception {
        return By.xpath(get("Switch-BTN-Loading-And-Unloading-Operations"));
    }

    public static By SwitchBTNCancellationTransferOfPhoneLines() throws Exception {
        return By.xpath(get("Switch-BTN-Cancellation-Transfer-Of-Phone-Lines"));
    }

    public static By SwitchBTNReplacingRentalUnit() throws Exception {
        return By.xpath(get("Switch-BTN-Replacing-Rental-Unit"));
    }

    public static By SwitchBTNChangeInRentalValue() throws Exception {
        return By.xpath(get("Switch-BTN-Change-In-Rental-Value"));
    }

    public static By numberReportingDays() throws Exception {
        return By.xpath(get("Number-Reporting-Days"));
    }

    public static By validityRentalContractOnOwnerChange() throws Exception {
        return By.xpath(get("Validity-Rental-Contract-On-Owner-Change"));
    }

    public static By obligationToPayRemainingRentalValue() throws Exception {
        return By.xpath(get("Obligation-To-Pay-Remaining-Rental-Value"));
    }
}
