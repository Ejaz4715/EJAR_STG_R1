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
        return By.xpath("//a[@data-test-id=\"contracts.contract-parties.add-individual-tenant\"]");
    }

    public static By IndividualContractTenantPageTitle() {
        return By.xpath("//h1[contains(text(), 'طرف العقد فرد مستأجر')]");
    }

    public static By NationalIdRadioButton() {
        return By.xpath("//input[@data-value=\"national_id\"]/following-sibling::label");
    }

    public static By ErrorMessageUnderNatinalId() {
        return By.xpath("//label[contains (text() , 'رقم الهوية الوطنية')]/parent::app-form-field/descendant::li");
    }

    public static By TenantPartyInfoPageTitle() {
        return By.xpath("//h2[contains (text() , 'معلومات طرف العق')]");
    }
}
