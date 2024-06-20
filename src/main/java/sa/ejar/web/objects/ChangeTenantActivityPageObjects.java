package sa.ejar.web.objects;

import org.openqa.selenium.By;

public class ChangeTenantActivityPageObjects {

    //public static By popUpAlertAfterCancel() { return By.xpath("//app-card-body"); }
    public static By viewRequestButton(){
        return  By.xpath("//a[text()=' عرض الطلب ']");
    }
    public static By letsStartButton(){
        return  By.xpath("//button[text()=' لنبدأ ']");
    }
    public static By oldTenantActivity(){
        return By.xpath("//a[text()=' نشاط المستأجر القديم ']");
    }
    public static By oldTenantActivityDescription(){return By.xpath("//app-card[@id='old-tenant-activity']//span/span");}
    public static By newTenantActivity(){return By.xpath("//a[text()=' نشاط المستأجر الجديد ']");}
    public static By backButton(){
        return By.xpath("//button[text()=' السابق ']");
    }
    public static By bottomNewTenantActivity(){return By.xpath("//h2[text()='نشاط المستأجر الجديد']");}
    public static By approveTenantActivity(){return By.xpath("//h2[text()='الموافقة على نشاط المستأجر']");}
    public static By reviewChangeTenantActivity(){return By.xpath("//h1[text()=' مراجعة تغيير نشاط المستأجر ']");}
    public static By submitApprovalButton(){return By.xpath("//div[@class='button-bar']//button[contains(@class, 'btn-primary')]");}
    public static By requestID() {
        return By.xpath("(//h5[@class='item-value'])[1]");
    }
    public static By requestType() {
        return By.xpath("(//h5[@class='item-value'])[3]");
    }
    public static By noResultMessage() {
        return By.xpath("//h5[@class='card-title']");
    }
    public static By statusDropdown() {
        return By.xpath("//select[@data-name='status']");
    }
    public static By statusOptions() {
        return By.xpath("//select[@data-name='status']/option");
    }
    public static By requestTypeDropdown() {
        return By.xpath("//app-custom-select[@data-name='request_type']");
    }
    public static By requestTypeOptions() {
        return By.xpath("//select[@data-name='request_type']/option");
    }
    public static By contractNumber() {
        return By.xpath("//span[text()='رقم العقد']/parent::div/h5/a");
    }
    public static By submitRequestPopupMsgInChangeTenantCommercialActivity() {return  By.xpath("//p[text()='الطلب بانتظار موافقة الطرف الآخر لمدة 7 ، وسيتم إشعاركم في حالة قبول أو رفض الطلب']");}
    public static By createdDate(){
        return By.xpath("(//span[@class='item-label'])[2]");
    }
    public static By newTenantActivityDescription(){return  By.xpath("//app-tenant-organization-activity-form[@id='new-tenant-activity']//input[@formcontrolname='activity_description']");}
    public static By newTenantActivityDescriptionInReviewChangedTenantActivityPage(){return  By.cssSelector("#new-tenant-activity > app-card-body > app-card-value > p.info-value > span > span");}
    public static By submitRequestInChangeTenantCommercialActivity(){return By.xpath("//button[text()=' تقديم الطلب ']");}
    public static By issuedBy(){
        return By.xpath("//h5[@class='item-value dash-if-empty']");
    }
    public static By newTenantActivityTextBox() {return By.xpath("//h2[text()=' نشاط المستأجر الجديد']/parent::div/parent::div/parent::app-card-header/following-sibling::app-card-body//input");}
    public static By submitButton() {return By.xpath("//button[@class='btn btn-primary me-2']");}
    public static By requestTitle(){return By.xpath("//app-card[@class='submitted-feedback m-0 card']//h5");}
    public static By requestWaitingForSevenDaysMessage() {return By.xpath("//p[text()='الطلب بانتظار موافقة الطرف الآخر لمدة 7 ، وسيتم إشعاركم في حالة قبول أو رفض الطلب']");}
    public static By changeTenantActivityPageHeader(){return By.xpath("//h1[text()=' تغيير نشاط المستأجر التجاري ']");}
    public static By contractNumberHeader(){
        return By.xpath("//h4");
    }
    public static By contractParties() {return By.xpath("//app-party-info");}
    public static By oldTenantActivityHeadingOnChangeTenantActivityPage(){return By.xpath("//h2[text()=' نشاط المستأجر القديم']");}
    public static By oldTenantActivityDescriptionOnChangeTenantActivityPage(){return By.xpath("//h2[text()=' نشاط المستأجر القديم']/parent::div/parent::div/parent::app-card-header/following-sibling::app-card-body");}
    public static By oldTenantDescription(){return By.xpath("//app-tenant-organization-activity-form[@id='old-tenant-activity']//input[@formcontrolname='activity_description']");}
    public static By issueDate() {return By.xpath("//div//span[contains(text(),'تم الإنشاء')]");}
    public static By confirmApprovalMsg() {return By.xpath("//h2[text()='تم إرسال الموفقة']");}
    public static By confirmRejectMsg() {return By.xpath("//h2[text()='تم تقديم الرفض']");}
    public static By  rejectTenantActivityBTN() {return By.xpath("(//button[text()=' رفض نشاط المستأجر '])[1]");}
    public static By cancelBTN() {return By.xpath("(//app-card-footer//button[contains(text(),'إلغاء')])[1]");}
    public static By RequestPageTitle() {return By.xpath("//h1[contains (text() , 'طلبات')]");}
    public static By RejectTenantActivityHeading() {return By.xpath("//div//h2[text()='رفض نشاط المستأجر']");}
    public static By IAgreeToTheAboveCheckBox() {return By.xpath("//label//div[text()=' أقر بالموافقة على المذكور أعلاه ']");}
    public static By TenantActivityApprovalStepsHeading() {return By.xpath("(//div//h2[text()='خطوات الموافقة على تغيير النشاط'])[1]");}
    public static By getLessorName() {return By.xpath("(//div//p[@class='mb-1'])[1]");}
    public static By getTenantName() {return By.xpath("(//div//p[@class='mb-1'])[2]");}
    public static By getTenantRepresentativeName() {return By.xpath("(//div//p[@class='mb-1'])[3]");}
    public static By getLessorID() {return By.xpath("(//div//span[@class='text-primary dash-if-empty'])[1]");}
    public static By getTenantID() {return By.xpath("(//div//span[@class='text-primary dash-if-empty'])[2]");}
    public static By getTenantRepresentativeID() {return By.xpath("(//div//span[@class='text-primary dash-if-empty'])[3]");}
}
