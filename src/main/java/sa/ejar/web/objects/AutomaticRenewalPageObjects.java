package sa.ejar.web.objects;

import org.openqa.selenium.By;

public class AutomaticRenewalPageObjects {

    public static By ContractEndDate() {
        return By.xpath("//span[text()='تاريخ الانتهاء']/parent::div/descendant::span[@class=\"item-value\"]");
    }

    public static By ContractTimeLine() {
        return By.xpath("//ul[@class=\"timeline\"]/child::li");
    }

    public static By ContractStatusList() {
        return By.xpath("//span[text()=' الحالة']/parent::div/descendant::span[2]");
    }

    public static By PropertiesButton() {
        return By.xpath("(//span[@class=\"round-icon large menu\"])[1]");
    }
}
