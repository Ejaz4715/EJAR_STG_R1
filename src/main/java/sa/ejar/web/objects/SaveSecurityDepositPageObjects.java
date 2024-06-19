package sa.ejar.web.objects;

import org.openqa.selenium.By;

public class SaveSecurityDepositPageObjects {

    public static By UserProfile() {
        return By.xpath("//span[@class=\"avatar\"]");
    }

    public static By WalletOption() {
        return By.xpath("//span[contains (text(),'المحفظة')]");
    }

    public static By manageOffice(){
        return By.xpath("//span[contains (text(), 'إدارة الحساب')]");
    }

    public static By ListOfDesc() {
        return By.xpath("//table//tbody//tr//td[1]");
    }

    public static By SecurityAmountReservedOption() {
        return By.xpath("//select[@data-name=\"transaction_purpose_code\"]");
    }

    public static By DepositAmount() {
        return By.xpath("//table//tbody//tr//td[6]");
    }

    public static By SecurityAmountInMoveInForm() {
        return By.xpath("//app-card-value[@data-name=\"مبلغ الضمان\"]/descendant::span[contains (text(), 'ر.س')]");
    }

    public static By damageAmountInput() {
        return By.xpath("//input[@data-name=\"damage_amount\"]");
    }
}
