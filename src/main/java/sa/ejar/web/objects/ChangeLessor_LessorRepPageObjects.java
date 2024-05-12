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
}
