package sa.ejar.web.objects;

import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map;
import com.testcrew.manager.TestConfigManager;

public class ContractsApprovalPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("option-new-residential-contract", new HashMap<>(){{
            put ("en", "//span[text()='Create new residential']");
            put ("ar", "//span[text()='تسجيل عقد سكني']");
        }});

        put("Lets-start-btn", new HashMap<>(){{
            put ("en", "//button[@class='btn btn-primary w-100-m float-right']");
            put ("ar", "//button[@class='btn btn-primary w-100-m float-right']");
        }});

        put("confirm-btn", new HashMap<>(){{
            put ("en", "//button[@class='btn btn-primary flex-fill']");
            put ("ar", "//button[@class='btn btn-primary flex-fill']");
        }});

        put("agreement-checkbox", new HashMap<>(){{
            put ("en", "//label[@class='form-check-label']");
            put ("ar", "//label[@class='form-check-label']");
        }});

        put("submit-contract-approval-btn", new HashMap<>(){{
            put ("en", "//button[@class='btn btn-primary order-0 order-md-1']");
            put ("ar", "//button[@class='btn btn-primary order-0 order-md-1']");
        }});

        put("OTP-input", new HashMap<>(){{
            put ("en", "//input[@data-name='index_1']");
            put ("ar", "//input[@data-name='index_1']");
        }});

        put("verify-identity-btn", new HashMap<>(){{
            put ("en", "//button[@class='btn btn-primary']");
            put ("ar", "//button[@class='btn btn-primary']");
        }});

        put("approval-submitted-text", new HashMap<>(){{
            put ("en", "");
            put ("ar", "//h2[text() = 'التقييم والإستبيان']");
        }});

        put("close-button-on-pop-up", new HashMap<>(){{
            put ("en", "//button[@data-test-id='confirm']");
            put ("ar", "//button[@data-test-id='confirm']");
        }});
    }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }


    public static By letsStartBTN() throws Exception{
        return By.xpath(get("Lets-start-btn"));
    }

    public static By confirmBTN() throws Exception{
        return By.xpath(get("confirm-btn"));
    }

    public static By agreementCheckbox() throws Exception{
        return By.xpath(get("agreement-checkbox"));
    }

    public static By submitContractApprovalBTN() throws Exception{
        return By.xpath(get("submit-contract-approval-btn"));
    }

    public static By OTPButton() throws Exception{
        return By.xpath(get("OTP-input"));
    }
    public static By verifyIdentityBTN() throws Exception{
        return By.xpath(get("verify-identity-btn"));
    }
    public static By approvalSubmittedText() throws Exception{
        return By.xpath(get("approval-submitted-text"));
    }

    public static By closeBtnOnPopUp() throws Exception{
        return By.xpath(get("close-button-on-pop-up"));
    }
}
