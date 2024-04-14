package sa.ejar.web.objects.precondition;

import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map;
import com.testcrew.manager.TestConfigManager;

public class AddResidentialContractPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("option-new-residential-contract", new HashMap<>(){{
            put ("en", "//span[text()='Create new residential']");
            put ("ar", "//span[text()='تسجيل عقد سكني']");
        }});
        put("btn-contracts", new HashMap<>(){{
            put ("en", "//a[text()=' Contracts ']");
            put ("ar", "//a[text()=' العقود ']");
        }});
        put("filter-btn-on-view-all-contracts-page", new HashMap<>(){{
            put ("en", "//span[@class=\"icon filter-icon\"]");
            put ("ar", "//span[@class=\"icon filter-icon\"]");
        }});
        put("date-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"contract_start_date\"]");
            put ("ar", "//input[@data-name=\"contract_start_date\"]");
        }});
        put("click-start-year", new HashMap<>(){{
            put ("en", "(//button[@data-test-id=\"year-selection\"])[1]");
            put ("ar", "(//button[@data-test-id=\"year-selection\"])[1]");
        }});
        put("select-start-year", new HashMap<>(){{
            put ("en", "//div[@class=\"year-select-item\"]/child::button");
            put ("ar", "//div[@class=\"year-select-item\"]/child::button");
        }});
        put("click-start-month", new HashMap<>(){{
            put ("en", "(//button[@data-test-id=\"month-selection\"])[1]");
            put ("ar", "(//button[@data-test-id=\"month-selection\"])[1]");
        }});
        put("select-start-month", new HashMap<>(){{
            put ("en", "//div[@class=\"month-select-item\"]/child::button");
            put ("ar", "//div[@class=\"month-select-item\"]/child::button");
        }});
        put("select-start-day", new HashMap<>(){{
            put ("en", "(//table)[1]//tr//td");
            put ("ar", "(//table)[1]//tr//td");
        }});
        put("click-end-year", new HashMap<>(){{
            put ("en", "(//button[@data-test-id=\"year-selection\"])[2]");
            put ("ar", "(//button[@data-test-id=\"year-selection\"])[2]");
        }});
        put("select-end-year", new HashMap<>(){{
            put ("en", "//div[@class=\"year-select-item\"]/child::button");
            put ("ar", "//div[@class=\"year-select-item\"]/child::button");
        }});
        put("click-end-month", new HashMap<>(){{
            put ("en", "(//button[@data-test-id=\"month-selection\"])[2]");
            put ("ar", "(//button[@data-test-id=\"month-selection\"])[2]");
        }});
        put("select-end-month", new HashMap<>(){{
            put ("en", "//div[@class=\"month-select-item\"]/child::button");
            put ("ar", "//div[@class=\"month-select-item\"]/child::button");
        }});
        put("select-end-day", new HashMap<>(){{
            put ("en", "(//table)[2]//tr//td");
            put ("ar", "(//table)[2]//tr//td");
        }});
        put("btn-confirm-period", new HashMap<>(){{
            put ("en", "//button[text()=' Confirm period ']");
            put ("ar", "//button[text()=' تأكيد مدة الإيجار ']");
        }});
        put("btn-add-property", new HashMap<>(){{
            put ("en", "//a[text()=' Add property ']");
            put ("ar", "//a[text()=' إضافة عقار ']");
        }});
        put("property-use-dropdown", new HashMap<>(){{
            put ("en", "//select[@data-name=\"property_usage\"]");
            put ("ar", "//select[@data-name=\"property_usage\"]");
        }});
        put("property-type-dropdown", new HashMap<>(){{
            put ("en", "//select[@data-name=\"property_type\"]");
            put ("ar", "//select[@data-name=\"property_type\"]");
        }});
        put("ownership-document-type-dropdown", new HashMap<>(){{
            put ("en", "//select[@data-name=\"property_type\"]");
            put ("ar", "//select[@data-name=\"property_type\"]");
        }});
        put("property-name", new HashMap<>(){{
            put ("en", "//div[@class=\"col\"]/child::h5");
            put ("ar", "//div[@class=\"col\"]");
        }});
        put("continue-with-this-property-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Continue with this property ']");
            put ("ar", "//button[text()=' الاستمرار مع هذا العقار ']");
        }});
        put("continue-to-select-units-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Continue to select units ']");
            put ("ar", "//button[text()=' الاستمرار لاختيار وحدات ']");
        }});
        put("select-units", new HashMap<>(){{
            put ("en", "//div[@class=\"col p-0 pe-3\"]/child::h5");
            put ("ar", "//div[@class=\"col p-0 pe-3\"]/child::h5");
        }});
        put("select-first-available-unit", new HashMap<>(){{
            put ("en", "(//div[@class=\"col p-0 pe-3\"]/child::h5)[1]");
            put ("ar", "(//div[@class=\"col p-0 pe-3\"]/child::h5)[1]");
        }});
        put("confirm-property-details", new HashMap<>(){{
            put ("en", "//button[text()=' Confirm property details ']");
            put ("ar", "//button[text()=' تأكيد ']");
        }});
        put("covered-property-units-step-btn", new HashMap<>(){{
            put ("en", "//div[text()=' Covered property and units ']");
            put ("ar", "//div[text()=' العقارات والوحدات ']");
        }});
        put("identify-address-on-map-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Identify address on map ']");
            put ("ar", "//button[contains(text(),'تحديد العنوان على الخريطة')]");
        }});
        put("confirm-btn-on-map", new HashMap<>(){{
            put ("en", "//button[text()=' Confirm ']");
            put ("ar", "//button[@class='btn btn-primary position-relative']");
        }});
        put("save-btn-property-address", new HashMap<>(){{
            put ("en", "//button[text()=' Save ']");
            put ("ar", "//button[contains(text(),'حفظ')]");
        }});
        put("contract-parties-step-btn", new HashMap<>(){{
            put ("en", "//div[text()=' Contract parties ']");
            put ("ar", "//div[text()=' أطراف العقد ']");
        }});
        put("add-individual-tenant-btn", new HashMap<>(){{
            put ("en", "//a[@data-test-id=\"contracts.contract-parties.add-individual-tenant\"]");
            put ("ar", "//a[@data-test-id=\"contracts.contract-parties.add-individual-tenant\"]");
        }});
        put("tenant-type-radio-btn", new HashMap<>(){{
            put ("en", "//label[text()=' Tenant ']");
            put ("ar", "//label[text()=' المستأجر ']");
        }});
        put("tenant-national-id-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"id_number\"]");
            put ("ar", "//input[@data-name=\"id_number\"]");
        }});
        put("tenant-date-of-birth-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"hijri\"]");
            put ("ar", "//input[@data-name=\"hijri\"]");
        }});
        put("continue-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Continue ']");
            put ("ar", "//button[text()=' التالي ']");
        }});
        put("tenant-phone-number-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"nationalNumber\"]");
            put ("ar", "//input[@data-name=\"nationalNumber\"]");
        }});
        put("tenant-region-dropdown", new HashMap<>(){{
            put ("en", "//select[@data-name=\"region\"]");
            put ("ar", "//select[@data-name=\"region\"]");
        }});
        put("tenant-city-dropdown", new HashMap<>(){{
            put ("en", "//label[text()=\"City\"]/parent::app-form-field/descendant::div[text()=' Please select ']");
            put ("ar", "//label[text()=\"المدينة\"]/parent::app-form-field/descendant::div[text()=' يرجى اختيار ']");
        }});
        put("select-tenant-city", new HashMap<>(){{
            put ("en", "//div[@class=\"option-text\"]");
            put ("ar", "//div[@class=\"option-text\"]");
        }});
        put("confirm-btn-on-tenant-address-page", new HashMap<>(){{
            put ("en", "//button[text()=' Confirm ']");
            put ("ar", "//button[text()=' تأكيد ']");
        }});
        put("filter-btn-on-select-units-page", new HashMap<>(){{
            put ("en", "//span[@class=\"icon filter-icon\"]");
            put ("ar", "//span[@class=\"icon filter-icon\"]");
        }});
        put("select-units-availability", new HashMap<>(){{
            put ("en", "//select[@data-name=\"unit_availability\"]");
            put ("ar", "//select[@data-name=\"unit_availability\"]");
        }});
        put("add-residential-contract-heading", new HashMap<>(){{
            put ("en", "//h1[text()=' Add Residential Contract ']");
            put ("ar", "//h1[text()=' تسجيل عقد سكني ']");
        }});
        put("annual-rent-fee-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"total_units_rent\"]");
            put ("ar", "//input[@data-name=\"total_units_rent\"]");
        }});
        put("single-payment-frequency-radio-btn", new HashMap<>(){{
            put ("en", "//label[text()=' Single Payment ']");
            put ("ar", "//label[text()=' دفعة واحدة ']");
        }});
        put("continue-to-billing-schedule-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Continue to Billing schedule ']");
            put ("ar", "//button[text()=' متابعة إلى جدول الدفعات ']");
//            put ("ar", "  ");

        }});
        put("pay-online-btn", new HashMap<>(){{
            put ("en", "//label[text()=' Pay online only ']");
            put ("ar", "//label[text()=' الدفع الإلكتروني فقط ']");
        }});
        put("add-new-iban-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Add new IBAN ']");
            put ("ar", "//button[text()=' إضافة رقم آيبان جديد ']");
        }});
        put("add-new-Wallet-btn", new HashMap<>(){{
            put ("en", "");
            put ("ar", "//a[contains(text(),'انقر هنا لإضافة محفظة')]");
        }});
        put("add-new-iban-Wallet-btn", new HashMap<>(){{
            put ("en", "");
            put ("ar", "//a[contains(text(),'إضافة ايبان جديد')]");
        }});
        put("iban-number-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"iban_number\"]");
            put ("ar", "//input[@data-name=\"iban_number\"]");
        }});
        put("account-owner-name-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"alias_name\"]");
            put ("ar", "//input[@data-name=\"alias_name\"]");
        }});
        put("save-btn-on-add-new-iban", new HashMap<>(){{
            put ("en", "//button[text()=' Save ']");
            put ("ar", "//button[text()=' حفظ ']");
        }});

        put("select-iban-dropdown", new HashMap<>(){{
            put ("en", "//select[@data-name=\"iban_number\"]");
            put ("ar", "//select[@data-name=\"iban_number\"]");
        }});

        put("iban-account-owner-radio-btn", new HashMap<>(){{
            put ("en", "//label[text()=' Lessor ']");
            put ("ar", "//label[text()=' المؤجر ']");
        }});
        put("continue-to-additional-fee-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Continue to additional fees ']");
            put ("ar", "//button[text()=' التالي ']");
        }});
        put("continue-financial-terms-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Confirm Financial Terms ']");
            put ("ar", "//button[text()=' تأكيد البيانات المالية ']");
        }});
        put("terms-and-conditions-step", new HashMap<>(){{
            put ("en", "//div[text()=' Terms & conditions ']");
            put ("ar", "//div[text()=' الشروط والأحكام ']");
        }});
        put("add-terms-and-conditions-btn", new HashMap<>(){{
            put ("en", "//a[@routerlink=\"terms-and-conditions\"]");
            put ("ar", "//a[@routerlink=\"terms-and-conditions\"]");
        }});
        put("ejar-fees-payer-radio-btn", new HashMap<>(){{
            put ("en", "//label[text()=' Brokerage Office ']");
            put ("ar", "//label[text()=' مكتب وساطة ']");
        }});
        put("governing-law-radio-btn", new HashMap<>(){{
            put ("en", "//div[text()='The competent judicial authority in the Kingdom of Saudi Arabia']");
            put ("ar", "//div[text()='الجهة القضائية المختصة في المملكة العربية السعودية']");
        }});
        put("confirm-terms-and-conditions-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Confirm terms and conditions ']");
            put ("ar", "//button[text()=' تأكيد الشروط والأحكام ']");
        }});
        put("submit-for-approval-btn", new HashMap<>(){{
            put ("en", "(//button[text()=' Submit for Approval '])[1]");
            put ("ar", "(//button[text()=' الإرسال للتوثيق '])[1]");
        }});
        put("financial-terms-step-btn", new HashMap<>(){{
            put ("en", "//div[text()=' Financial terms ']");
            put ("ar", "//div[text()=' البيانات المالية ']");
        }});
        put("add-rental-contracts-btn", new HashMap<>(){{
            put ("en", "//a[@data-test-id=\"contracts.financial-terms.add-terms\"]");
            put ("ar", "//a[@data-test-id=\"contracts.financial-terms.add-terms\"]");
        }});
        put("continue-btn-on-preview-contract-page", new HashMap<>(){{
            put ("en", "//button[text()=' Continue ']");
            put ("ar", "//button[text()=' التالي ']");
        }});
        put("continue-pay-btn-on-preview-brokerage-agreement-page", new HashMap<>(){{
            put ("en", "//button[text()=' Continue to paying fees ']");
            put ("ar", "//button[text()=' الاستمرار في دفع الرسوم ']");
        }});
        put("disclaimer-checkbox-on-paying-ejar-fees-page", new HashMap<>(){{
            put ("en", "(//label[@class=\"form-check-label\"])[1]");
            put ("ar", "(//label[@class=\"form-check-label\"])[1]");
        }});
        put("confirm-and-submit-btn-on-paying-ejar-fees-page", new HashMap<>(){{
            put ("en", "//button[text()=' Confirm and submit ']");
            put ("ar", "//button[text()=' تأكيد وإرسال ']");
        }});
        put("contract-status-text", new HashMap<>(){{
            put ("en", "(//span[@class=\"pin mt-1 max-width-110 success\"])[1]");
            put ("ar", "(//span[@class=\"pin mt-1 max-width-110 success\"])[1]");
        }});
        put("close-survey-pop-up-btn", new HashMap<>(){{
            put ("en", "//button[@class=\"close-button\"]");
            put ("ar", "//button[@class=\"close-button\"]");
        }});
        put("confirm-btn-on-close-survey-pop-up", new HashMap<>(){{
            put ("en", "//button[text()=' Confirm ']");
            put ("ar", "//button[text()=' تأكيد ']");
        }});
        put("contract-number-text", new HashMap<>(){{
            put ("en", "//h4[@class=\"ms-4\"]");
            put ("ar", "//h4[@class=\"ms-4\"]");
        }});
        put("search-contract-number-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"contract_number\"]");
            put ("ar", "//input[@data-name=\"contract_number\"]");
        }});
        put("contract-number-text-view-all-contract-page", new HashMap<>(){{
            put ("en", "//h5[@class=\"item-value\"]/child::a");
            put ("ar", "//h5[@class=\"item-value\"]/child::a");
        }});
        put("approve-contract-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Approve contract ']");
            put ("ar", "//button[text()=' الموافقة على العقد ']");
        }});

        put("Email-Input", new HashMap<>(){{
            put ("en", "");
            put ("ar", "//input[@formcontrolname='email']");
        }});

        put("Lessor-Facility-Wife-ID-Label", new HashMap<>(){{
            put ("en", "");
            put ("ar", "//label[contains(text(),'زوج/ـة')]");
        }});

        put("Add-Lessor-Facility", new HashMap<>(){{
            put ("en", "");
            put ("ar", "//a[contains(text(),'أضف مرافق جديدًا')]");
        }});

        put("national-id-radio-btn", new HashMap<>(){{
            put ("en", "//label[text()=' National ID ']");
            put ("ar", "//label[text()=' هوية وطنية ']");
        }});

        put("Loading-Icon", new HashMap<>(){{
            put ("en", "//div[contains (@class,\"sk-circle\")]");
            put ("ar", "//div[contains (@class,\"sk-circle\")]");
        }});


    }};


    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By clickDateInputField() throws Exception{
        return By.xpath(get("date-input-field"));
    }

    public static By clickContractStartYear() throws Exception{
        return By.xpath(get("click-start-year"));
    }
    public static By selectContractStartYear() throws Exception{
        return By.xpath(get("select-start-year"));
    }
    public static By clickContractStartMonth() throws Exception{
        return By.xpath(get("click-start-month"));
    }
    public static By selectContractStartMonth() throws Exception{
        return By.xpath(get("select-start-month"));
    }

    public static By selectContractStartDay() throws Exception{
        return By.xpath(get("select-start-day"));
    }
    public static By clickContractEndYear() throws Exception{
        return By.xpath(get("click-end-year"));
    }
    public static By selectContractEndYear() throws Exception{
        return By.xpath(get("select-end-year"));
    }
    public static By clickContractEndMonth() throws Exception{
        return By.xpath(get("click-end-month"));
    }
    public static By selectContractEndMonth() throws Exception{
        return By.xpath(get("select-end-month"));
    }

    public static By selectContractEndDay() throws Exception{
        return By.xpath(get("select-end-day"));
    }

    public static By confirmPeriodBTN() throws Exception{
        return By.xpath(get("btn-confirm-period"));
    }

    public static By addPropertyBTN() throws Exception{
        return By.xpath(get("btn-add-property"));
    }

    public static By propertyUseMenu() throws Exception{
        return By.xpath(get("property-use-dropdown"));
    }

    public static By propertyTypeMenu() throws Exception{
        return By.xpath(get("property-type-dropdown"));
    }

    public static By OwnershipDocumentTypeMenu() throws Exception{
        return By.xpath(get("ownership-document-type-dropdown"));
    }

    public static By propertyName() throws Exception{
        return By.xpath(get("property-name"));
    }
    public static By continueWithThisPropertyBTN() throws Exception{
        return By.xpath(get("continue-with-this-property-btn"));
    }

    public static By continueToSelectUnitsBTN() throws Exception{
        return By.xpath(get("continue-to-select-units-btn"));
    }

    public static By selectUnit() throws Exception{
        return By.xpath(get("select-units"));
    }
    public static By selectFirstAvailableUnit() throws Exception{
        return By.xpath(get("select-first-available-unit"));
    }

    public static By confirmPropertyDetailsBTN() throws Exception{
        return By.xpath(get("confirm-property-details"));
    }
    public static By coveredPropertyUnitsBTN() throws Exception{
        return By.xpath(get("covered-property-units-step-btn"));
    }

    public static By identifyAddressOnMapBTN() throws Exception{
        return By.xpath(get("identify-address-on-map-btn"));
    }

    public static By confirmBtnOnMap() throws Exception{
        return By.xpath(get("confirm-btn-on-map"));
    }

    public static By saveBtnOnPropertyAddress() throws Exception{
        return By.xpath(get("save-btn-property-address"));
    }


    public static By contractPartiesStepBTN() throws Exception{
        return By.xpath(get("contract-parties-step-btn"));
    }

    public static By addIndividualTenantBTN() throws Exception{
        return By.xpath(get("add-individual-tenant-btn"));
    }

    public static By tenantRadioBTN() throws Exception{
        return By.xpath(get("tenant-type-radio-btn"));
    }

    public static By tenantNationalIdInput() throws Exception{
        return By.xpath(get("tenant-national-id-input-field"));
    }

    public static By tenantDateOfBirthInput() throws Exception{
        return By.xpath(get("tenant-date-of-birth-input-field"));
    }


    public static By continueBtnOnIndividualContractPage() throws Exception{
        return By.xpath(get("continue-btn"));
    }

    public static By tenantPhoneNumberInput() throws Exception{
        return By.xpath(get("tenant-phone-number-input-field"));
    }

    public static By tenantRegionDropdown() throws Exception{
        return By.xpath(get("tenant-region-dropdown"));
    }

    public static By tenantCityDropdown() throws Exception{
        return By.xpath(get("tenant-city-dropdown"));
    }


    public static By selectTenantCity() throws Exception{
        return By.xpath(get("select-tenant-city"));
    }

    public static By confirmBtnOnTenantAddressPage() throws Exception{
        return By.xpath(get("confirm-btn-on-tenant-address-page"));
    }

    public static By filterBtnOnSelectUnitsPage() throws Exception{
        return By.xpath(get("filter-btn-on-select-units-page"));
    }

    public static By selectUnitsAvailability() throws Exception{
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

    public static By filterBtnOnViewAllContractsPage() throws Exception{
        return By.xpath(get("filter-btn-on-view-all-contracts-page"));
    }


    public static By contractNumberTextOnViewContractsPage() throws Exception {
        return By.xpath(get("contract-number-text-view-all-contract-page"));
    }

    public static By approveContractBTN() throws Exception {
        return By.xpath(get("approve-contract-btn"));
    }
    public static By addNewWalletBtn() throws Exception {
        return By.xpath(get("add-new-Wallet-btn"));
    }
    public static By addNewIbanInWallet() throws Exception {
        return By.xpath(get("add-new-iban-Wallet-btn"));
    }

    public static By emailInput() throws Exception {
        return By.xpath(get("Email-Input"));
    }

    public static By lessorFacilityWifeIDLabel() throws Exception {
        return By.xpath(get("Lessor-Facility-Wife-ID-Label"));
    }

    public static By addLessorFacility() throws Exception {
        return By.xpath(get("Add-Lessor-Facility"));
    }

    public static By NationalIDRadioBTN() throws Exception {
        return By.xpath(get("national-id-radio-btn"));
    }

    public static By LoadingIcon() throws Exception {
        return By.xpath(get("Loading-Icon"));
    }
}
