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

    public static By requestNumber() {
        return By.xpath("//p[contains(text(),'تم ارسال الطلب')]");
    }
    public static By requestChangeCurrentLessorRepPage() {
        return By.xpath("//h2[text()='طلب تعديل ممثل المؤجر الحالي']");
    }
    public static By changeLessorPage() {
        return By.xpath("//h2[text()='تغيير المؤجر']");
    }

    public static By addNewLessorRepPage() {
        return By.xpath("//h1[text()='طلب إضافة ممثل المؤجر الجديد']");
    }

    public static By requestUpdateCurrentLessorRepPage() {
        return By.xpath("//h1[text()='طلب تعديل ممثل المؤجر الحالي']");
    }
    public static By removeCurrentLessorRepPage() {
        return By.xpath("//h1[text()='إزالة ممثل المؤجر الحالي']");
    }
    public static By requestChangeLessorPage() {
        return By.xpath("//h1[text()='طلب تغيير المؤجر']");
    }


    public static By rejectChangeRequestBTN() {
        return By.xpath("//button[text()=' رفض طلب التغيير ']");
    }
    public static By reviewChangeRequestSection() {
        return By.xpath("//h2[contains(text(),'معلومات وثيقة الملكية')]");
    }
    public static By rejectMsg() {
        return By.xpath("//h2[text()='تم تقديم الرفض']");
    }

    public static By contractsAndAgreementsSection() {
        return By.xpath("//h2[text()='العقود']");
    }
    public static By IBANInfoSection() {
        return By.xpath("//h2[text()=' أرقام الآيبان']");
    }
    public static By editIBANInfoPopupWindow() {
        return By.xpath("//div[text()=' تعديل الحساب الشخصي آيبان ']");
    }
    public static By addNewIbanBTN() {
        return By.xpath("//button[text()=' إضافة رقم آيبان جديد ']");
    }
    public static By addNewIBANPopupWindow() {
        return By.xpath("//div[text()=' إضافة رقم آيبان جديد ']");
    }

    public static By declarationAndConfirmationSection() {
        return By.xpath("//h2[text()='الإقرار وتأكيد الموافقة']");
    }

    public static By confirmApprovalBTN() {
        return By.xpath("//button[text()=' تأكيد الموافقة على الطلب ']");
    }
    public static By lessorLessorRepChangedSuccessfullyMsg() {
        return By.xpath("//h2[contains(text(),'تم تغيير المؤجر/ممثل المؤجر بنجاح')]");
    }

    public static By manageOwnershipDocumentPage() {
        return By.xpath("//h1/span[contains(text(),'إدارة مستند الملكية')]");
    }

    public static By lessorRepKebabBTN() {
        return By.xpath("(//span[@class=\"round-icon large menu\"])[2]");
    }
    public static By lessorKebabBTN() {
        return By.xpath("(//span[@class=\"round-icon large menu\"])[1]");
    }

    public static By lessorRepEditBTN() {
        return By.xpath("//a[contains(text(),'تعديل')]");
    }
    public static By addAnIndividualPage() {
        return By.xpath("//h1[text()='إضافة مالك فرد']");
    }
    public static By nationalIDTXT() {
        return By.xpath("//app-card-value[@data-name=\"رقم الهوية الوطنية\"]/descendant::span/span");
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
    public static By lessorRepIcon() {
        return By.xpath("//span[@class=\"round-icon group large\"]");
    }

}
