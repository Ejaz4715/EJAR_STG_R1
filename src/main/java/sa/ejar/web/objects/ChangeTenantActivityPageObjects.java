package sa.ejar.web.objects;

import org.openqa.selenium.By;

public class ChangeTenantActivityPageObjects {


    //Example
    public static By PopUpAlertAfterCancel() { return By.xpath("//app-card-body"); }

    public static By referenceNumber() {
        return By.xpath("//input[@data-name='reference']");
    }

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
        return By.xpath("//select[@data-name='request_type']");
    }

    public static By requestTypeOptions() {
        return By.xpath("//select[@data-name='request_type']/option");
    }

    public static By contractNumber() {
        return By.xpath("//span[text()='رقم العقد']/parent::div/h5/a");
    }

    public static By createdDate(){
        return By.xpath("(//span[@class='item-label'])[2]");
    }

    public static By newTenantActivityDescription(){
        return  By.xpath("//app-tenant-organization-activity-form[@id='new-tenant-activity']//input[@formcontrolname='activity_description']");
    }

    public static By submitRequestInChangeTenantCommercialActivity(){
        return By.xpath("//button[text()=' تقديم الطلب ']");
    }

    public static By issuedBy(){
        return By.xpath("//h5[@class='item-value dash-if-empty']");
    }

}
