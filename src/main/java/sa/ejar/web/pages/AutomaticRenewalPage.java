package sa.ejar.web.pages;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.ejar.web.objects.AutomaticRenewalPageObjects;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class AutomaticRenewalPage {
    public LocalDate getContractEndDate() {
        Browser.waitUntilVisibilityOfElement(AutomaticRenewalPageObjects.ContractEndDate(), 40);
        String date = Browser.getText(AutomaticRenewalPageObjects.ContractEndDate());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(date, formatter);
    }

    public void verifyRemainingContractPeriod() {
        LocalDate endDate = getContractEndDate();
        LocalDate currentDate = LocalDate.now();
        long remainingPeriod = ChronoUnit.DAYS.between(currentDate, endDate);
        Assert.assertTrue(remainingPeriod > 30, "Actual period (" +remainingPeriod + ") is not above 30");
    }

    public long getRemainingPeriod() {
        LocalDate endDate = getContractEndDate();
        LocalDate currentDate = LocalDate.now();
        return ChronoUnit.DAYS.between(currentDate, endDate);
    }
    public void getContractVersion() throws IOException {
        String contactVersion = new ChangeLessor_LessorRepPage().getContractVersionFromPDF();
        TestDataManager.addDependantGlobalTestData("AutomaticRenewal", "Contract_Version", contactVersion.strip());
        TestDataManager.writeDependantGlobalTestData("AutomaticRenewal");
    }

    public void verifyTimelineStatus(String statusText) {
        boolean b = false;
        Browser.waitUntilVisibilityOfElement(AutomaticRenewalPageObjects.ContractTimeLine(), 40);
        List<WebElement> statusList = Browser.getWebElements(AutomaticRenewalPageObjects.ContractTimeLine());
        for (WebElement status : statusList){
            String actualStatus = status.getText();
            if (actualStatus.contains(statusText)){
                b = true;
                break;
            }
        }
        Assert.assertTrue(b, "Expected status is not found in timeline");
    }

    public void verifyContractStatus(String status) {
        boolean b = false;
        Browser.waitUntilVisibilityOfElement(AutomaticRenewalPageObjects.ContractStatusList(), 40);
        List <WebElement> statsulist = Browser.getWebElements(AutomaticRenewalPageObjects.ContractStatusList());
        for (WebElement s : statsulist){
            if(s.getText().contains(status)){
                b= true;
                break;
            }
        }
        Assert.assertTrue(b, "Contract status is not as expected");
    }

    public void clickOnFirstPropertiesButton() {
        Browser.waitUntilVisibilityOfElement(AutomaticRenewalPageObjects.PropertiesButton(), 40);
        Browser.click(AutomaticRenewalPageObjects.PropertiesButton());
    }
}
