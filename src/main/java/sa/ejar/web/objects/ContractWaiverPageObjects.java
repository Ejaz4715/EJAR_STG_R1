package sa.ejar.web.objects;

import org.openqa.selenium.By;

public class ContractWaiverPageObjects {
    public static By ContractWaiverServicePageHeading() {
        return By.xpath("//h2[contains (text() , 'تقبيل ')]");
    }

    public static By ContractWaiverPageHeading() {
        return By.xpath("//h1[contains (text() , 'تقبيل ')]");
    }

    public static By AddIndividualTenant() {
        return By.xpath("//a[@data-test-id='contracts.contract-parties.add-individual-tenant']");
    }

    public static By IndividualContractTenantPageTitle() {
        return By.xpath("//h1[contains(text(), 'طرف العقد فرد مستأجر')]");
    }

    public static By NationalIdRadioButton() {
        return By.xpath("//input[@data-value='national_id']/following-sibling::label");
    }

    public static By ErrorMessageUnderNatinalId() {
        return By.xpath("//label[contains (text() , 'رقم الهوية الوطنية')]/parent::app-form-field/descendant::li");
    }

    public static By TenantPartyInfoPageTitle() {
        return By.xpath("//h2[contains (text() , 'معلومات طرف العق')]");
    }

    public static By ContractDetailsSectionTitle() {
//        return By.xpath("//h2[contains (text() , 'تفاصيل العقد')]");
        return By.xpath("//a[contains (@class,'active') and contains (text() , 'تفاصيل')]");
    }

    public static By NewTenantPartySectionTitle() {
        return By.xpath("//h2[contains (text() , 'الطرف المستأجر الجديد')]");
    }

    public static By AcknowledgementCheckbox() {
        return By.xpath("//input[@data-name='acknowledgement']/following-sibling::label");
    }

    public static By RequestNumber() {
        return By.xpath("(//h2[@class='card-title'])[1]");
    }

    public static By RentalDetailsSectionTitle() {
        return By.xpath("//a[@class='step active' and text() = ' تفاصيل الإيجار ']");
    }
    public static By DeclareAndConfirmSectionTitle() {
        return By.xpath("//a[@class='step active' and text() = ' إقرار وتأكيد ']");
    }

    public static By ConfirmationPopUpMessage() {
        return  By.xpath("//h2[@class = 'card-title']");
    }

    public static By YesAgreeBTN() {
        return By.xpath("//button[contains (text(), 'نعم, أنا متأكد')]");
    }

    public static By ErrorMessagePopUpTitle() {
        return By.xpath("//h2[contains (text() ,'رسالة خطأ')]");
    }

    public static By ErrorMessageOnPopUp() {
        return By.xpath("//h2[contains (text() ,'رسالة خطأ')]/ancestor::app-card/descendant::app-card-body/descendant::h2");
    }

    public static By CancelButtonOnPopUp() {
        return By.xpath("//footer/descendant::button[contains(text(),'إلغاء')] | //app-card-footer/descendant::button[contains(text(),'إلغاء')]");
    }

    public static By ConfirmButtonOnPopUp() {
        return By.xpath("//footer/descendant::button[contains(text(),'تأكيد')] | //app-card-footer/descendant::button[contains(text(),'تأكيد')]");
    }

    public static By TenantIdNumberSection() {
        return By.xpath("//app-card-header/following-sibling::app-card-body/descendant::span[@class='round-icon large menu']");
    }
}
