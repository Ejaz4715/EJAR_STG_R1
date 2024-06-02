package sa.ejar.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map;

public class ManualRenewalPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("A", new HashMap<>() {{
                put("ar", "");
                put("en", "");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static By readyForRenewalCard() {return By.xpath("//app-card-value//p[text()='جاهز للتجديد']");}

    public static By contractStatus() {return By.xpath("//span[contains(@class,'pin mt-1')]");}


    public static By getTotalNoOfContractInReadyForRenewalCard() {return By.xpath("(//app-card-value[@data-name='جاهز للتجديد']//span)[2]");}

    public static By getCurrentTotalOfContracts() {return By.xpath("//h5[@class='item-value']");}

    public static By clickOnReadyForRenewalCard() {return By.xpath("//app-card//p[text()='جاهز للتجديد']");}
   
    public static By getNewContractNumber() {return By.xpath("//h4[@class='ms-4']");}

    public static By getCurrentContractNumber() {return By.xpath("//input[@data-name='contract_number']");}

    public static By issueDate() {return By.xpath("//div//p[@class='timestamp']");}

    public static By getListOfContractTimeLineStatus() {return By.xpath("//div[contains(@class,'timeline-body')]");}
    
    public static By sendContractForRenewal() {return By.xpath("//div//h1[text()=' إرسال العقد للتجديد ']");}

    public static By renewalStepsPage() {return By.xpath("//div//h2[@class='card-title']");}

    public static By cancelBTNPopUp() {return By.xpath("//footer//button[contains(text(),' إلغاء')]");}

    public static By confirmBTNPopUp() {return By.xpath("//footer//button[text()=' تأكيد ']");}

    public static By payFeeThroughLessor() {return By.xpath("/div[@class='d-inline-block ps-2 py-3 py-md-0']");}

    public static By EjarRegistrationFees() {return By.xpath("(//div[@class='card-info-title'])[2]");}

    public static By sendContractForRenewalMsg() {return By.xpath("//div//h2[text()='تم إرسال طلب تجديد العقد']");}

    public static By getContractFromPopUpUMsg() {return By.xpath("//div//p[@class='info-value']");}

    public static By newOption() {return By.xpath("//label[text()=' جديدة ']");}

    public static By GoodOption1() {return By.xpath("(//div[text()=' راضٍ جدًا '])[1]");}

    public static By GoodOption2() {return By.xpath("(//div[text()=' راضٍ جدًا '])[2]");}

    public static By GoodOption3() {return By.xpath("(//div[text()=' راضٍ جدًا '])[3]");}

    public static By GoodOption4() {return By.xpath("(//div[text()=' راضٍ جدًا '])[4]");}

    public static By BadOption1() {return By.xpath("(//div[text()=' غير راضٍ\t '])[1]");}

    public static By BadOption2() {return By.xpath("(//div[text()=' غير راضٍ\t '])[2]");}

    public static By sendAssessmentBTN() {return By.xpath("//app-card-footer//button[text()=' إرسال ']");}

    public static By closeSubmitPopUp() {return By.xpath("//div//button[@class='close-button']");}

    public static By NoOption1() {return By.xpath("(//div//label[text()=' لا '])[1]");}

    public static By NoOption2() {return By.xpath("(//div//label[text()=' لا '])[2]");}

    public static By YesOption1() {return By.xpath("(//div//label[text()=' نعم '])[1]");}

    public static By YesOption2() {return By.xpath("(//div//label[text()=' نعم '])[2]");}

    public static By NotGoodOption() {return By.xpath("//label[text()=' منخفض ']");}

    public static By reasonInput1() {return By.xpath("//app-form-field//input[@data-name='reason_1']");}

    public static By reasonInput2() {return By.xpath("//app-form-field//input[@data-name='reason_2']");}

    public static By textarea() {return By.xpath("//div//textarea[@data-name='4']");}

    public static By editBTN1() {return By.xpath("//button[contains(text(),'تعديل')]");}

    public static By editBTN2() {return By.xpath("//button[contains(text(),'تعديل')]");}

    public static By NoContractFoundMsg() { return By.xpath("//div[text()=' لم يتم العثور على عقود! يرجى إضافة عقود جديدة. ']");}

    public static By ClickContractNextArrow() { return By.xpath("(//button[@class='btn btn-outline-primary icon-container'])[2]");}

    public static By getAllContractNumberTxt() { return By.xpath("//h5[@class='item-value']");}

    public static By selectPageSizeFifty() { return By.xpath("//select[@data-name='page_size']");}

    public static By lateFeesLabel() { return By.xpath("//form[@id='late_fees_charged_form']//span[@class='slider enable-transitions']");}

    public static By fillLateFeesInput() { return By.xpath("(//div//input[@mask='separator'])[1]");}

    public static By fillRetainerFeeInput() { return By.xpath("(//div//input[@mask='separator'])[2]");}

    public static By addNewTermsLabel() { return By.xpath("//app-switch-input[@class='float-right ng-untouched ng-pristine ng-valid']//span[@class='slider enable-transitions']");}

    public static By addNewTermsLinkText() { return By.xpath("//a[contains(text(),'إضافة بند آخر')]");}

    public static By fillNewTermsTextArea() { return By.xpath("//textarea[@formcontrolname='content']");}

    public static By clickConfirmButton() { return By.xpath("//button[@type='button'][contains(text(),'تأكيد')]");}
    public static By clickOnLatestKebabMenuButton() { return By.xpath("(//span[@class=\"round-icon large menu\"])[last()]");}

    public static By WarningClass() {
        return By.xpath("//li[@class=\"warning\"]");
    }
}
