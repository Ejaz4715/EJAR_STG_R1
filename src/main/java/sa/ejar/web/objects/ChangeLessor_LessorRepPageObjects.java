package sa.ejar.web.objects;

import org.openqa.selenium.By;

public class ChangeLessor_LessorRepPageObjects {
    public static By FirstContractNumber() {
        return By.xpath("(//h5/child::a[@class=\"btn btn-link text-primary p-0\"])[1]");
    }

    public static By ContractStatusDropdown() {
        return By.xpath("//select[@data-name=\"state\"]");
    }

    public static By PropertyTab() {
        return By.xpath("//a[contains(text(),'العقارات')]");
    }

    public static By ViewOwnerShipDocumentsOption() {
        return By.xpath("//span[contains(text(),'عرض جميع وثائق الملكية')]");
    }

    public static By OwnerShipDocumentPageTitle() {
        return By.xpath("//h1[contains (text(), 'وثائق الملكية')]");
    }

    public static By OwnershipDocumentSearchField() {
        return By.xpath("//input[@data-name=\"document_number\"]");
    }

    public static By ChangeLessorRepPageTitle() {
        return By.xpath("//h2[contains (text() ,'تغيير ممثل المؤجر')]");
    }

    public static By changLessorRepRadioBTNs() {
        return By.xpath("//app-form-radio/label");
    }

    public static By ContractStatusDropdownOptions() {
        return By.xpath("//select[@data-name=\"state\"]/child::option");
    }

    public static By selectedRadioButton() {
        return  By.xpath("//app-form-radio/child::input");
    }

    public static By ChangeLessorSelectedOptionSection() {
        return By.xpath("//h2[@class = 'card-title mx-4 card-title-variant']");
    }

    public static By closeBTN() {
        return  By.xpath("(//button[contains (text(),'إلغاء')])[1]");
    }

    public static By NextBTN() {
        return By.xpath("(//button[contains (text(), 'التالي')])[1]");
    }

    public static By AddNewLessorRepPageTitle() {
        return By.xpath("//h1[contains (text() , 'إضافة ممثل المؤجر الجديد')]");
    }

    public static By WarningPopupTitle() {
        return  By.xpath("//h2[text()='رسالة خطأ']");
    }

    public static By PopupMessage() {
        return By.xpath("//app-card-body//p");
    }

    public static By GotoServiceButton() {
        return By.xpath("//button[contains (text(), 'الذهاب للخدمة')]");
    }

    public static By PropertyInformationSectionTitle() {
        return By.xpath("//h2[text() = 'معلومات العقار']");
    }

    public static By LessorRepIdSectionTitle() {
        return By.xpath("//h2[text() = 'تحديد هوية ممثل المؤجر الجديد']");
    }

    public static By IdTypeRadioButtons() {
        return By.xpath("//app-form-radio/descendant::input/following-sibling::label");
    }

    public static By IdTypeRadioInput() {
        return By.xpath("//app-form-radio/descendant::input");
    }
}
