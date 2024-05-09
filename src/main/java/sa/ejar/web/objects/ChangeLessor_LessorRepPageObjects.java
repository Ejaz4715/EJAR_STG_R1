package sa.ejar.web.objects;

import org.openqa.selenium.By;

public class ChangeLessor_LessorRepPageObjects {
    public static By FirstContractNumber() {
        return By.xpath("(//h5/child::a[@class=\"btn btn-link text-primary p-0\"])[1]");
    }

    public static By ContractStatusDropdown() {
        return By.xpath("//select[@data-name=\"state\"]");
    }

}
