package sa.ejar.web.objects.pre_condition;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class LoginPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("button-login", new HashMap<>() {{
            put("en", "//button[text()=' Login ']");
            put("ar", "//button[contains(@class,'btn btn-primary')]");
        }});
        put("text-password", new HashMap<>() {{
            put("en", "//input[@data-name=\"password\"]");
            put("ar", "//input[@data-name=\"password\"]");
        }});

        put("text-verificationCode", new HashMap<>() {{
            put("en", "//input[@id = 'index_1']");
            put("ar", "//input[@id = 'index_1']");
        }});
        put("text-email", new HashMap<>() {{
            put("en", "//input[@data-name=\"username\"]");
            put("ar", "//input[@data-name=\"username\"]");
        }});
        put("explore-ejar-pop-up", new HashMap<>() {{
            put("en", "//button[text()=' Start your free trial now! ']");
            put("ar", "//button[@class='w-100 mb-2 btn btn-primary']");
        }});
        put("manageAccountButton", new HashMap<>() {{
            put("en", "//span[text() = 'Manage Account']");
            put("ar", "//span[text() = 'إدارة الحساب']");
        }});
        put("text-confirmBTN", new HashMap<>() {{
            put("en", "//button[text() = 'Confirm']");
            put("ar", "//button[text() = 'تأكيد']");
        }});

        put("option-new-residential-contract", new HashMap<>() {{
            put("en", "//span[text()='Create new residential']");
            put("ar", "//span[text()='تسجيل عقد سكني']");
        }});

        put("btn-contracts", new HashMap<>() {{
            put("en", "//a[text()=' Contracts ']");
            put("ar", "//a[text()=' العقود ']");
        }});

        put("btn-view-all-contracts", new HashMap<>() {{
            put("en", "//span[text()='View all contracts']");
            put("ar", "//span[text()='عرض جميع العقود']");
        }});
        put("Close-Button1", new HashMap<>() {{
            put("en", "");
            put("ar", "//button[@class = 'close-button']");
        }});

        put("Close-Button2", new HashMap<>() {{
            put("en", "");
            put("ar", "(//button[contains(text(),'إغلاق')])[1]");
        }});
        put("Confirm-Terms-Button", new HashMap<>() {{
            put("en", "");
            put("ar", "(//button[contains(text(),'تأكيد')])[1]");
        }});
        put("assessment-unit-pop-up", new HashMap<>() {{
            put("en", "//button[@class=\"close-button\"]");
            put("ar", "//button[@class=\"close-button\"]");
        }});
    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By getButtonLogin() throws Exception {
        return By.xpath(get("button-login"));
    }

    public static By setTextEmail() throws Exception {
        return By.xpath(get("text-email"));
    }

    public static By setTextPassword() throws Exception {
        return By.xpath(get("text-password"));
    }

    public static By getVerificationCode() throws Exception {
        return By.xpath(get("text-verificationCode"));
    }

    public static By confirmButton() throws Exception {
        return By.xpath(get("text-confirmBTN"));
    }


    public static By contractButton() throws Exception {
        return By.xpath(get("btn-contracts"));
    }

    public static By viewAllContractsButton() throws Exception {
        return By.xpath(get("btn-view-all-contracts"));
    }

    public static By optionCreateNewContract() throws Exception {
        return By.xpath(get("option-new-residential-contract"));
    }

    public static By manageAccountButton() throws Exception {
        return By.xpath(get("manageAccountButton"));
    }

    public static By wallet() throws Exception {
        return By.xpath(get("walletButton"));
    }

    public static By exploreEjarPopUp() throws Exception {
        return By.xpath(get("explore-ejar-pop-up"));
    }

    public static By closeButton1() throws Exception {
        return By.xpath(get("Close-Button1"));
    }

    public static By closeButton2() throws Exception {
        return By.xpath(get("Close-Button2"));
    }

    public static By assessementUnitpopup() throws Exception {
        return By.xpath(get("assessment-unit-pop-up"));
    }

    public static By ContractNumberInput() {
        return By.xpath("//div//input[@data-name='contract_number']");
    }

    public static By descriptionDropDownList() {
        return By.xpath("//select[@data-name='transaction_purpose_code']");
    }

    public static By SecurityAmountReserved() {
        return By.xpath("//tbody//td[@class='dash-if-empty px-3'][contains(text(),'ر.س')]");
    }
}