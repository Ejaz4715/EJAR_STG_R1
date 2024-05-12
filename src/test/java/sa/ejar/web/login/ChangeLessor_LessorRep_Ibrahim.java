package sa.ejar.web.login;

import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.ChangeLessor_LessorRepPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class ChangeLessor_LessorRep_Ibrahim extends NHCWebTest{

    /**
     * Pre Conditions
     * -Create Contracts
     * -Approve from parties
     */

    /**
     * Add lessor representative
     * TC_43 to TC_83
     */
    @Test(dataProvider = "testDataProvider")
    public void TC_43_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on \" العقارات \" tab");
        app.changeLessor_lessorRepPage.clickOnPropertiesTab();
        logger.info("Step 03: Click on \"عرض جميع وثائق الملكية\"");
        app.changeLessor_lessorRepPage.clickOnViewOwnerShipDocumentsOption();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter owner ship document number in \"رقم وثيقة الملكية\" ");
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Deed_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Select \" إضافة ممثل المؤجر الجديد \" radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Enter ID and BOD of new lessor representative");
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_ID"));
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_Rep_BOD"));
        logger.info("Step 13: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
    }
}
