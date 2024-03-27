package sa.ejar.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class LoginPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {{
        // Button
        put("button-language", new HashMap<>() {{
            put("en", "//select[@name=\"language\"]/parent::app-language-selector");
            put("ar", "//select[@name=\"language\"]/parent::app-language-selector");
        }});

        put("dropdown-language", new HashMap<>() {{
            put("en", "//select[@name=\"language\"]/child::option");
            put("ar", "//select[@name=\"language\"]/child::option");
        }});


        put("button-login", new HashMap<>() {{
            put("en", "//button[text()=' Login ']");
            put("ar", "//button[contains(@class,'btn btn-primary')]");
        }});
        put("dashboard-heading", new HashMap<>() {{
            put("en", "//h1[@class=\"py-4 m-0 title\"]");
            put("ar", "//h1[@class=\"py-4 m-0 title\"]");
        }});
        // Checkbox
        // Dropdown
        // Element
        // Link
        // Radio
        // Text
        put("text-user", new HashMap<>() {{
            put("en", "//input[@data-name=\"username\"]");
            put("ar", "//input[@data-name=\"username\"]");
        }});
        put("User-ID", new HashMap<>() {{
            put("en", "//input[@data-name=\"password\"]");
            put("ar", "//input[@formcontrolname='username']");
        }});
        put("text-password", new HashMap<>() {{
            put("en", "//input[@data-name=\"password\"]");
            put("ar", "//input[@data-name=\"password\"]");
        }});

        put("text-verificationCode",new HashMap<>(){{
            put("en","//input[@id = 'index_1']");
            put("ar","//input[@id = 'index_1']");
        }});
        put("text-email", new HashMap<>() {{
            put("en", "//input[@data-name=\"username\"]");
            put("ar", "//input[@data-name=\"username\"]");
        }});
        put("text-verificationCode", new HashMap<>() {{
            put("en", "//input[@id = 'index_1']");
            put("ar", "//input[@id = 'index_1']");
        }});
        put("text-confirmBTN", new HashMap<>() {{
            put("en", "//button[text() = 'Confirm']");
            put("ar", "//button[text() = 'تأكيد']");
        }});
        put("manageOfficeButton", new HashMap<>() {{
            put("en", "//span[text() = 'Manage Office']");
            put("ar","//span[text() = 'إدارة المكتب']");
//            put("ar","//span[contains(text(),'محفظة')]");
        }});
        put("rechargeButton", new HashMap<>() {{
            put("en", "//span[text() = 'Wallet']");
        }});
        put("chargeWalletButton", new HashMap<>() {{
            put("en", "//button[text() = ' Charge your wallet ']");
            put("ar","//span[contains(text(),'محفظة')]");
        }});
        put("walletButton", new HashMap<>() {{
            put("en", "//button[text() = ' Charge your wallet ']");
            put("ar","//span[contains(text(),'محفظة')]");
        }});
        put("text-Amount", new HashMap<>() {{
            put("en", "//input[@data-name=\"custom_value\"]");
        }});
        put("nextButton", new HashMap<>() {{
            put("en", "//button[text() = ' Next ']");
        }});
        put("popUpButton", new HashMap<>() {{
            put("en", "//button[@class = 'close-button']");
            put("ar", "//button[@class = 'close-button']");
        }});
        put("officerButton", new HashMap<>() {{
            put("en", "//div[@class = 'flex-row']");
//            put("ar","//p[text() = 'مستأجر']");
            put("ar","//div[@class = 'flex-row']");
        }});
        put("explore-ejar-pop-up", new HashMap<>(){{
            put ("en", "//button[text()=' Start your free trial now! ']");
            put ("ar", "//button[@class='w-100 mb-2 btn btn-primary']");
//            put("ar","//div[@class=\"modal-content\"]");
        }});
        put("manageAccountButton",new HashMap<>(){{
            put("en","//span[text() = 'Manage Account']");
            put("ar","//span[text() = 'إدارة الحساب']");
        }});

        put("button-close",new HashMap<>(){{
            put("en","//button[contains(text(),' Remind me later ')]");
            put("ar","//button[contains(text(),' Remind me later ')]");

        }});
        put("text-confirmBTN",new HashMap<>(){{
            put("en","//button[text() = 'Confirm']");
            put("ar","//button[text() = 'تأكيد']");
        }});

        put("option-new-residential-contract", new HashMap<>(){{
            put ("en", "//span[text()='Create new residential']");
            put ("ar", "//span[text()='تسجيل عقد سكني']");
        }});

        put("btn-contracts", new HashMap<>(){{
            put ("en", "//a[text()=' Contracts ']");
            put ("ar", "//a[text()=' العقود ']");
        }});

        put("User_ID", new HashMap<>() {{
            put("en", "//input[@formcontrolname='username']");
            put("ar", "//input[@formcontrolname='username']");
        }});
        put("Admin-menu", new HashMap<>(){{
            put ("en", "//app-user-menu-button//img[@class='toggler-img']");
            put ("ar", "//app-user-menu-button//img[@class='toggler-img']");
        }});
        put("Log-Out", new HashMap<>(){{
            put ("en", "(//div//span[@class='col-m'])[6]");
            put ("ar", "(//div//span[@class='col-m'])[5]");
        }});
        put("btn-view-all-contracts", new HashMap<>(){{
            put ("en", "//span[text()='View all contracts']");
            put ("ar", "//span[text()='عرض جميع العقود']");
        }});

        put("OtpConfirmButton", new HashMap<>(){{
            put ("en", "//span[text()='View all contracts']");
            put ("ar", "//app-card-footer[@class='card-footer']//button[@class='btn btn-primary'][contains(text(),'تأكيد')]");
        }});

        put("Close-Button1", new HashMap<>(){{
            put ("en", "");
            put ("ar", "//button[@class = 'close-button']");
        }});

        put("Close-Button2", new HashMap<>(){{
            put ("en", "");
            put ("ar", "(//button[contains(text(),'إغلاق')])[1]");
        }});

        put("First-Term", new HashMap<>(){{
            put ("en", "");
            put ("ar", "(//label[@class='form-check-label'])[1]");
        }});

        put("Second-Term", new HashMap<>(){{
            put ("en", "");
            put ("ar", "(//label[@class='form-check-label'])[2]");
        }});

        put("Confirm-Terms-Button", new HashMap<>(){{
            put ("en", "");
            put ("ar", "(//button[contains(text(),'تأكيد')])[1]");
        }});
        put("assessment-unit-pop-up", new HashMap<>(){{
            put ("en", "//button[@class=\"close-button\"]");
            put ("ar", "//button[@class=\"close-button\"]");
        }});
    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }


    public static By getButtonLanguage() throws Exception {
        return By.xpath(get("button-language"));
    }

    public static By getLanguage() throws Exception {
        return By.xpath(get("dropdown-language"));
    }

    public static By getButtonLogin() throws Exception {
        return By.xpath(get("button-login"));
    }

    public static By getDashboardHeading() throws Exception {
        return By.xpath(get("dashboard-heading"));
    }

    // Checkbox
    // Dropdown
    // Element
    // Link
    // Radio
    // Text

    public static By setTextUsername() throws Exception {
        return By.xpath(get("text-user"));
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

    public static By buttonConfirmOtp() throws Exception{
        return By.xpath(get("OtpConfirmButton"));
    }

    public static By confirmButton() throws Exception {
        return By.xpath(get("text-confirmBTN"));
    }


    public static By contractButton() throws Exception{
        return By.xpath(get("btn-contracts"));
    }
    public static By viewAllContractsButton() throws Exception{
        return By.xpath(get("btn-view-all-contracts"));
    }

    public static By optionCreateNewContract() throws Exception{
        return By.xpath(get("option-new-residential-contract"));
    }

    public static By manageOfficeButton() throws Exception {
        return By.xpath(get("manageOfficeButton"));
    }

    public static By popUpButton() throws Exception {
        return By.xpath(get("popUpButton"));
    }

    public static By officerButton() throws Exception {
        return By.xpath(get("officerButton"));
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

    public static By setUserName() throws Exception {
        return By.xpath(get("User-ID"));
    }
    public static By adminDropdownMenu() throws Exception{
        return By.xpath(get("Admin-menu"));
    }
    public static By clickLogOut() throws Exception{
        return By.xpath(get("Log-Out"));
    }
    public static By firstTerm() throws Exception{
        return By.xpath(get("First-Term"));
    }

    public static By secondTerm() throws Exception{
        return By.xpath(get("Second-Term"));
    }
    public static By confirmTermsButton() throws Exception{
        return By.xpath(get("Confirm-Terms-Button"));
    }

    public static By assessementUnitpopup() throws Exception {
        return By.xpath(get("assessment-unit-pop-up"));
    }
}