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

}
