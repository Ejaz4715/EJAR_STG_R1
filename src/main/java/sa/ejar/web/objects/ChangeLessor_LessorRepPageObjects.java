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

    public static By OwnerShipDocumentSectionTitle() {
        return By.xpath("//h2[contains (text(), 'وثائق الملكية')]");
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
        return By.xpath("//app-form-radio/child::input");
    }

    public static By ChangeLessorSelectedOptionSection() {
        return By.xpath("//h2[@class = 'card-title mx-4 card-title-variant']");
    }

    public static By closeBTN() {
        return By.xpath("(//button[contains (text(),'إلغاء')])[1]");
    }

    public static By NextBTN() {
        return By.xpath("(//button[contains (text(), 'التالي')])[1]");
    }

    public static By closeBTN2() {
        return By.xpath("(//button[contains (text(),'إلغاء')])[2]");
    }

    public static By NextBTN2() {
        return By.xpath("(//button[contains (text(), 'التالي')])[2]");
    }

    public static By closeBTN3() {
        return By.xpath("(//button[contains (text(),'إلغاء')])[3]");
    }

    public static By NextBTN3() {
        return By.xpath("(//button[contains (text(), 'التالي')])[3]");
    }

    public static By AddNewLessorRepPageTitle() {
        return By.xpath("//h1[contains (text() , 'إضافة ممثل المؤجر الجديد')]");
    }

    public static By removeTheCurrentLessorRepPageTitle() {
        return By.xpath("//h1[contains (text() , 'إزالة ممثل المؤجر الحالي')]");
    }

    public static By WarningPopupTitle() {
        return By.xpath("//h2[text()='رسالة خطأ']");
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
        return By.xpath("//app-form-radio/descendant::input[@data-name=\"id_type\"]");
    }

    public static By lessorRepIcon() {
        return By.xpath("//span[@class=\"round-icon group large\"]");
    }

    public static By NewLessorRepInfoPageTitle() {
        return By.xpath("//h2[text()='ممثل المؤجر الجديد']");
    }

    public static By AddNewRepresentationDocumentLink() {
        return By.xpath("//a[contains (text(),  'إضافة وثيقة')]");
    }

    public static By AddNewRepresentationDocumentPopupTitle() {
        return By.xpath("//h2[text()='إضافة وثيقة قانونية جديدة']");
    }

    public static By DocumentTypeDropdown() {
        return By.xpath("//select[contains(@data-name, \"document_type\")]");
    }

    public static By DocumentTypeDropdownList() {
        return By.xpath("//select[contains(@data-name, \"document_type\")]/child::option");
    }

    public static By IssueDateInputField() {
        return By.xpath("//label[text()='تاريخ الإصدار']/parent::app-form-field/descendant::input");
    }

    public static By ExpiryDateInputField() {
        return By.xpath("//label[text()=' تاريخ انتهاء الصلاحية']/parent::app-form-field/descendant::input");
    }

    public static By IssueByInputField() {
        return By.xpath("//input[@data-name=\"issued_by\"]");
    }

    public static By LegalDocumentNameInput() {
        return By.xpath("//input[@data-name=\"legal_document_type_name\"]");
    }

    public static By DocumentIssuePlaceInput() {
        return By.xpath("//input[@data-name=\"issue_place\"]");
    }

    public static By AddButton() {
        return By.xpath("//button[contains(text() ,'إضافة')]");
    }

    public static By LessorAddedPopupTitle() {
        return By.xpath("//h2[contains (text(), 'إضافة ممثل المؤجر الجديد')]");
    }
    public static By LessorUpdatePopupTitle() {
        return By.xpath("//h2[contains (text(), 'تعديل ممثل المؤجر الحالي')]");
    }
    public static By LessorChangedPopupTitle() {
        return By.xpath("//h2[contains (text(), 'تغيير المؤجر')]");
    }

    public static By RequestNumber() {
        return By.xpath("//h2[contains (text(),'المؤجر')]/ancestor::app-card/descendant::img/following-sibling::p");
    }

    public static By removeLessorRepBTN() {
        return By.xpath("//button[text()=' إزالة الممثل ']");
    }

    public static By currentLessorRepSection() {
        return By.xpath("//h2[contains (text(), 'معلومات الممثل الحالي')]");
    }

    public static By UpdateLessorRepPageTitle() {
        return By.xpath("//h1[text()='تعديل ممثل المؤجر الحالي']");
    }

    public static By lessorRemovedPopupTitle() {
        return By.xpath("//h2[contains (text() , 'إزالة ممثل المؤجر الحالي')]");
    }
    public static By ownershipChangeRequestOfTitleDeedPage() {
        return By.xpath("//span[contains(text(),'طلب تغيير ملكية وثيقة الملكية')]");
    }
    public static By changeLessorRequestPage() {
        return By.xpath("//h1[contains (text(), 'طلب تغيير المالك')]");
    }
    public static By issuedDateTextFiled() {
        return By.xpath("//input[@data-name=\"issued_date\"]");
    }
    public static By legalDocumentTypeNameInputField() {
        return By.xpath("//input[@formcontrolname=\"legal_document_type_name\"]");
    }
    public static By createNewBTN() {
        return By.xpath("//button[contains(text(),' أنشئ جديد ')]");
    }
    public static By confirmOwnershipDocumentBTN() {
        return By.xpath("//button[contains (text(), 'تأكيد وثيقة الملكية')]");
    }

    public static By changeBTN() {
        return By.xpath("//button[text()=' تغيير ']");
    }
    public static By addOrganizationOwnerLinkBTN() {
        return By.xpath("//a[text()=' إضافة مالك منشأة ']");
    }
    public static By addIndividualOwnerLinkBTN() {
        return By.xpath("//a[contains (text(), 'إضافة مالك فرد')]");
    }
    public static By addOrganizationOwnerPage() {
        return By.xpath("//h1[contains(text(),'إضافة مالك منشأة')]");
    }
    public static By addIndividualOwnerPage() {
        return By.xpath("//h1[contains(text(),'إضافة مالك فرد')]");
    }

    public static By PopUpAlertAfterCancel() {
        return By.xpath("//footer/descendant::button[contains(text(),'تأكيد')]/parent::footer/preceding-sibling::app-card-body/child::p");
    }

    public static By OldLessorRepInfoSectionTitle() {
        return By.xpath("//h2[text()='ممثل المؤجر السابق']");
    }

    public static By ContinueAddNewLessorRepButton() {
        return By.xpath("//button[text()=' الاستمرار لإضافة ممثل جديد ']");
    }

    public static By PropertyOwnerButton() {
        return By.xpath("//label[text()=' مالك العقار ']");
    }

    public static By RepresentativeOwnerRadioButtonButton() {
        return By.xpath("//label[contains (text() , 'ممثل المالك')]");
    }

    public static By PropertyOwnerButtonInput() {
        return By.xpath("//input[@data-value=\"property_owner\"]");
    }

    public static By RepresentativeOwnerRadioButtonButtonInput() {
        return By.xpath("//input[@data-value=\"owner_representative\"]");
    }

    public static By ContractPartyInfoPage() {
        return By.xpath("//h2[text()='معلومات طرف العقد']");
    }

    public static By PartyIdSection() {
        return By.xpath("//h2[text()='هوية الطرف']");
    }

    public static By PropertyOwnerText() {
        return By.xpath("//app-owners-quick-info[@id=\"new-owners\"]/descendant::span[@class=\"round-icon large menu\"]");
    }
}
