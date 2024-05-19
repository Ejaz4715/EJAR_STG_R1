package sa.ejar.web.login;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.*;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class ChangeLessor_LessorRep_Ejaz extends NHCWebTest {

    /**
     * Pre Conditions
     * -Create Contracts
     * -Approve from parties
     */


    /**
     * Add lessor representative
     * TC_01 to TC_83
     */
    @Test(dataProvider = "testDataProvider")
    public void TC_01_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter ownership document number in the ownership document reference");
        CommonMethodsPage.enterOwnershipReferenceInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Get the contract number of any of the contract that are being displayed as a search result ");
        app.changeLessor_lessorRepPage.selectActiveContractFromStatusDropdown("نشط");
        app.changeLessor_lessorRepPage.getContractNumAddRep();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter Contract number in the ownership document reference");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        CommonMethodsPage.verifyNewTabIsOpened();
        app.changeLessor_lessorRepPage.getContractVersionAddRep();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify \"وثائق الملكية\" page is displayed with all the ownership documents");
        app.changeLessor_lessorRepPage.verifyOwnerShipDocumentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        app.changeLessor_lessorRepPage.verifySearchedOwnershipDocumentIsDisplayed(data.get("Ownership_Number"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        CommonMethodsPage.verifyValueIsDisplayed("تغيير ممثل المؤجر", ChangeLessor_LessorRepPageObjects.ChangeLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        app.changeLessor_lessorRepPage.verifyTheRadioButtonIsSelected("إضافة ممثل المؤجر الجديد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        app.changeLessor_lessorRepPage.verifyTheRadioButtonIsSelected("تعديل ممثل المؤجر الحالي");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إزالة ممثل المؤجر الحالي");
        app.changeLessor_lessorRepPage.verifyTheRadioButtonIsSelected("إزالة ممثل المؤجر الحالي");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إزالة ممثل المؤجر الحالي");
        logger.info("Step 09: Verify a new section is displayed with the same title as selected radio button");
        app.changeLessor_lessorRepPage.verifyNewSectionIsAppearingWithSameTitleAsSelectedRadioOption("إزالة ممثل المؤجر الحالي");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: verify there is no section underneath available radio buttons action");
        CommonMethodsPage.verifyCloseButtonIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Verify \" إلغاء \" and \" التالي \"  buttons are visible");
        app.changeLessor_lessorRepPage.verifyCloseButtonIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Verify \" إلغاء \" and \" التالي \"  buttons are not visible");
        CommonMethodsPage.verifyCloseButtonIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        app.changeLessor_lessorRepPage.verifyOwnerShipDocumentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \"التالي\" button");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.verifyValueIsDisplayed("إضافة ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.AddNewLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \"التالي\" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \"التالي\" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Click on \"إلغاء\" button on pop up");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("إضافة ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.AddNewLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \"التالي\" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Click on \" تأكيد \" button");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("تغيير ممثل المؤجر", ChangeLessor_LessorRepPageObjects.ChangeLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify there is a pop up with title \"رسالة خطأ\"");
        CommonMethodsPage.verifyValueIsDisplayed("سالة خطأ", ChangeLessor_LessorRepPageObjects.WarningPopupTitle());
        app.changeLessor_lessorRepPage.verifyPopupMessage("لا يمكن إضافة ممثل المؤجر بسبب وجود ممثل آخر في نفس وثيقة الملكية! نأمل التوجه لخدمة تغيير ممثل المؤجر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \"إلغاء\" button on pop up");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyValueIsDisplayed("إضافة ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.AddNewLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \"الذهاب للخدمة\" button on pop up");
        app.changeLessor_lessorRepPage.clickOnGotoServiceButton();
        CommonMethodsPage.verifyValueIsDisplayed("تغيير ممثل المؤجر", ChangeLessor_LessorRepPageObjects.ChangeLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.verifyValueIsDisplayed("تحديد هوية ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.LessorRepIdSectionTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("هوية وطنية");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' إقامة مميزة ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("إقامة مميزة");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("إقامة مميزة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية مقيم ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية مقيم");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("هوية مقيم");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية مواطني دول مجلس التعاون الخليجي ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية مواطني دول مجلس التعاون الخليجي");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("هوية مواطني دول مجلس التعاون الخليجي");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' جواز سفر ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("جواز سفر");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("جواز سفر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_27_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' أخرى ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("أخرى");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("أخرى");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 11: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Lessor_Rep_Id"), AddResidentialContractPageObjects.tenantNationalIdInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter a national id having less than 10 digits");
        app.addResidentialContractPage.inputTenantNationalId(data.get("LessorId_LessThanTenDigits"));
        CommonMethodsPage.errorMessage("الحد", ContractWaiverPageObjects.ErrorMessageUnderNatinalId());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Input national id including a letter");
        app.addResidentialContractPage.inputTenantNationalId(data.get("LessorId_WithLetters"));
        CommonMethodsPage.errorMessage("يرجى", ContractWaiverPageObjects.ErrorMessageUnderNatinalId());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_31_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Verify user is able to Input valid DOB in Hijri format");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Lessor_DOB"), AddResidentialContractPageObjects.tenantDateOfBirthInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Input a date starting in Gregorian format above year (1500)");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB_WrongFormat"));
        CommonMethodsPage.verifyValueIsNotEntered(data.get("Lessor_DOB_WrongFormat"), AddResidentialContractPageObjects.tenantDateOfBirthInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_33_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB_Future"));
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_34_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Verify user is able to click on calender Icon");
        app.revokeContractPage.clickOnCalenderIcon();
        logger.info("Step 13: Verify Calendar pop up is displayed");
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_35_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        logger.info("Step 13: Verify equivalent Gregorian date is displayed under تاريخ الميلاد input field");
        CommonMethodsPage.verifyEquivalentDateIsDisplayed("gregorian");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        CommonMethodsPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_37_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_38_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.verifyValueIsDisplayed("ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.NewLessorRepInfoPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_39_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on back button");
        CommonMethodsPage.clickOnBackButton();
        CommonMethodsPage.verifyValueIsDisplayed("وثائق الملكية", ChangeLessor_LessorRepPageObjects.OwnerShipDocumentSectionTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_40_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Input a phone number which does not begin with digit 5");
        CommonMethodsPage.enterPhoneNumber(data.get("LessorPhoneNum_NotBeginWith5"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.PhoneNumberInputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_41_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Input a phone number which having length < 9");
        CommonMethodsPage.enterPhoneNumber(data.get("LessorPhoneNum_LessThan9"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.PhoneNumberInputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_42_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Input a phone number which having length < 9");
        CommonMethodsPage.enterPhoneNumber(data.get("LessorPhoneNum"));
        CommonMethodsPage.verifyValueIsEntered(data.get("LessorPhoneNum"), CommonMethodsPageObjects.PhoneNumberInputField());
    }

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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Input a valid email address");
        CommonMethodsPage.enterEmail(data.get("Lessor_Email"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Lessor_Email"), CommonMethodsPageObjects.EmailInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_44_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Input an invalid email address");
        CommonMethodsPage.enterEmail(data.get("Lessor_Email_Invalid"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.EmailErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_45_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on المنطقة dropdown");
        CommonMethodsPage.clickOnRegionDropdownMenu();
        logger.info("Step 15: Select any option from dropdown");
        CommonMethodsPage.selectFromList(data.get("LessorRegion"), CommonMethodsPageObjects.RegionDropdownOptions());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_46_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on المدينة  dropdown");
        CommonMethodsPage.clickOnCityDropdown();
        logger.info("Step 15: Select an option from available cities");
        CommonMethodsPage.SelectCity(data.get("LessorCity"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_47_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Input a numerical value with with letters in Postal code input");
        CommonMethodsPage.enterPostalCode(data.get("LessorPostalCode_Invalid"));
        CommonMethodsPage.errorMessage("يجب", CommonMethodsPageObjects.PostalCodeError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_48_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Enter a valid postal code including on numerical values");
        CommonMethodsPage.enterPostalCode(data.get("LessorPostalCode_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("LessorPostalCode_Valid"), CommonMethodsPageObjects.PostalCodeInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_49_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Input a value including any special character in اسم الشارع input field");
        CommonMethodsPage.enterStreetName(data.get("LessorStreetName_Invalid"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.StreetNameError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_50_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Input a valid value in (اسم الشارع ) input field");
        CommonMethodsPage.enterStreetName(data.get("LessorStreetName_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("LessorStreetName_Valid"), CommonMethodsPageObjects.StreetNameInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_51_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Input a numerical value with (length < 5) in  رقم المبنى field");
        CommonMethodsPage.enterBuildingNumber(data.get("LessorBuildingNum_Invalid"));
        CommonMethodsPage.errorMessage("يجب", CommonMethodsPageObjects.BuildingNumberError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_52_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Input numerical value رقم المبنى field of length = 4");
        CommonMethodsPage.enterBuildingNumber(data.get("LessorBuildingNum_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("LessorBuildingNum_Valid"), CommonMethodsPageObjects.BuildingNumberInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_53_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Input a numerical value with (length < 4) in  الرقم الإضافي  field");
        CommonMethodsPage.enterAdditionalNumber(data.get("LessorBuildingNum_Invalid"));
        CommonMethodsPage.errorMessage("يجب", CommonMethodsPageObjects.AdditionalNumberError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_54_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Input numerical value الرقم الإضافي  field of length = 4");
        CommonMethodsPage.enterAdditionalNumber(data.get("LessorBuildingNum_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("LessorBuildingNum_Valid"), CommonMethodsPageObjects.AdditionalNumberInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_55_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on  السابق  Button");
        CommonMethodsPage.clickOnBackButton();
        CommonMethodsPage.verifyValueIsDisplayed("تحديد هوية ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.LessorRepIdSectionTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_56_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Verify \" تأكيد التغيير \" button is not enabled or not clickable");
        CommonMethodsPage.verifyConfirmButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_57_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        CommonMethodsPage.verifyValueIsDisplayed("إضافة وثيقة قانونية جديدة", ChangeLessor_LessorRepPageObjects.AddNewRepresentationDocumentPopupTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_58_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Click on يرجى اختيار button under نوع الوثيقة label ");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        logger.info("Step 16: Select document type from dropdown  ");
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        app.changeLessor_lessorRepPage.verifyDocumentTypeIsSelected(data.get("Document_Type"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_59_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Enter a value in رقم الوثيقة  input field");
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Document_Number"), CommonMethodsPageObjects.ownershipDocumentNumberTXT());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_60_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Enter issue date ");
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Document_Issue_Date"), ChangeLessor_LessorRepPageObjects.IssueDateInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_61_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Click on calender icon");
        app.revokeContractPage.clickOnCalenderIcon();
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_62_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Enter incomplete  date in تاريخ الإصدار in Gregorian format");
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Incomplete_Date"));
        CommonMethodsPage.errorMessage("يرجى", RentalIncidentsPageObjects.InputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_63_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Enter date in 'تاريخ انتهاء الصلاحية'  in Gregorian format");
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Document_Expiry_Date"), ChangeLessor_LessorRepPageObjects.ExpiryDateInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_64_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Click on calender icon");
        app.revokeContractPage.clickOnCalenderIcon();
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_65_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Enter incomplete  date in  تاريخ انتهاء الصلاحية in Gregorian format");
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Incomplete_Date"));
        CommonMethodsPage.errorMessage("يرجى", RentalIncidentsPageObjects.InputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_66_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Click on the calender icon inside  تاريخ الإصدار input field");
        app.revokeContractPage.clickOnCalenderIcon();
        logger.info("Step 16: -Select \"تاريخ الإصدار \" and  \" تاريخ انتهاء الصلاحية \" from the calender ");
        String date = data.get("Document_Issue_Date");
        String[] arrDate = date.split("-");
        app.addResidentialContractPage.selectStartDateOfResidualContract(arrDate[2].substring(1), app.addResidentialContractPage.getCurrentMonth(arrDate[1]), arrDate[0]);
        app.addResidentialContractPage.selectEndDateOfResidualContract(arrDate[2].substring(1), app.addResidentialContractPage.getCurrentMonth(arrDate[1]), String.valueOf(Integer.parseInt(arrDate[0]) + 1));
        CommonMethodsPage.verifyValueIsEntered(data.get("Document_Issue_Date"), ChangeLessor_LessorRepPageObjects.IssueDateInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_67_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Enter text in تم الإصدار بواسطة");
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Issue_By_Name"), ChangeLessor_LessorRepPageObjects.IssueByInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_68_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Enter text in تم الإصدار بواسطة");
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Document_Name"), ChangeLessor_LessorRepPageObjects.LegalDocumentNameInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_69_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Enter text in تم الإصدار في text box");
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Document_IssuePlace"), ChangeLessor_LessorRepPageObjects.DocumentIssuePlaceInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_70_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Upload attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_71_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Upload attachment of valid type (PNG, JPEG, GIF, PDF) having large size");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment_Large_Size"));
        app.revokeContractPage.verifyErrorMessageIsDisplayedForLargeFile();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_72_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Upload attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 16: Click on delete icon button");
        CommonMethodsPage.clickOnDeleteIconButton();
        CommonMethodsPage.verifyTheAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_73_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15:  Click on \" إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.verifyValueIsDisplayed("ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.NewLessorRepInfoPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_74_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 16:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        app.revokeContractPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_75_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 16:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 17:  Click on  عرض   button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_76_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 16:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 17: Click on delete icon button");
        CommonMethodsPage.clickOnDeleteIconButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("يرجى تأكيد أنك تريد حذف مستند الوكيل");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_77_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 16:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 17: Click on delete icon button");
        CommonMethodsPage.clickOnDeleteIconButton();
        logger.info("Step 18: Click on  إلغاء  button");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.NewLessorRepInfoPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_78_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 16:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 17: Click on delete icon button");
        CommonMethodsPage.clickOnDeleteIconButton();
        logger.info("Step 18: Click on  تأكيد    button");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        CommonMethodsPage.verifyTheAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_79_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 16:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 17: Click on delete icon button");
        CommonMethodsPage.clickOnDeleteIconButton();
        logger.info("Step 18: Click on  تأكيد    button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 19: Verify \" تأكيد التغيير \" button is not enabled or not clickable");
        CommonMethodsPage.verifyConfirmButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_80_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 16:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 17: Click on  تأكيد التغيير  button");
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.verifyValueIsDisplayed("رسالة تنبيه", RentalIncidentsPageObjects.WarningPopUpTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_81_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 16:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 17: Click on  تأكيد التغيير  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 18: Click on إلغاء button on pop up");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.NewLessorRepInfoPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_82_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 12: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 16:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 17: Click on  تأكيد التغيير  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 18: Click on تأكيد button on pop up");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("إضافة ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.LessorAddedPopupTitle());
        app.changeLessor_lessorRepPage.getRequestNumberFromPopup(ChangeLessor_LessorRepPageObjects.RequestNumber());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_83_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on \"  الطلبات  \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter the request number in request search field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    /**
     * Add lessor representative
     * TC_138 to TC_223
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_138_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter ownership document number in the ownership document reference");
        CommonMethodsPage.enterOwnershipReferenceInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Get the contract number of any of the contract that are being displayed as a search result ");
        app.changeLessor_lessorRepPage.selectActiveContractFromStatusDropdown("نشط");
        app.changeLessor_lessorRepPage.getContractNumChangeRep();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_139_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter Contract number in the ownership document reference");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_updateRep"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        CommonMethodsPage.verifyNewTabIsOpened();
        app.changeLessor_lessorRepPage.getContractVersionChangeRep();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_140_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify \"وثائق الملكية\" page is displayed with all the ownership documents");
        app.changeLessor_lessorRepPage.verifyOwnerShipDocumentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_141_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        app.changeLessor_lessorRepPage.verifySearchedOwnershipDocumentIsDisplayed(data.get("Ownership_Number"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_142_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        CommonMethodsPage.verifyValueIsDisplayed("تغيير ممثل المؤجر", ChangeLessor_LessorRepPageObjects.ChangeLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_143_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إضافة ممثل المؤجر الجديد");
        app.changeLessor_lessorRepPage.verifyTheRadioButtonIsSelected("إضافة ممثل المؤجر الجديد");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_144_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        app.changeLessor_lessorRepPage.verifyTheRadioButtonIsSelected("تعديل ممثل المؤجر الحالي");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_145_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إزالة ممثل المؤجر الحالي");
        app.changeLessor_lessorRepPage.verifyTheRadioButtonIsSelected("إزالة ممثل المؤجر الحالي");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_146_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("إزالة ممثل المؤجر الحالي");
        logger.info("Step 09: Verify a new section is displayed with the same title as selected radio button");
        app.changeLessor_lessorRepPage.verifyNewSectionIsAppearingWithSameTitleAsSelectedRadioOption("إزالة ممثل المؤجر الحالي");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_147_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: verify there is no section underneath available radio buttons action");
        CommonMethodsPage.verifyCloseButtonIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_148_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Verify \" إلغاء \" and \" التالي \"  buttons are visible");
        app.changeLessor_lessorRepPage.verifyCloseButtonIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_149_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Verify \" إلغاء \" and \" التالي \"  buttons are not visible");
        CommonMethodsPage.verifyCloseButtonIsNotDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_150_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \"إلغاء\" button");
        app.changeLessor_lessorRepPage.clickOnCloseButton(ChangeLessor_LessorRepPageObjects.closeBTN2());
        app.changeLessor_lessorRepPage.verifyOwnerShipDocumentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_151_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \"التالي\" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        CommonMethodsPage.verifyValueIsDisplayed("تعديل ممثل المؤجر الحالي", ChangeLessor_LessorRepPageObjects.UpdateLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_152_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \"التالي\" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_153_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \"التالي\" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Click on \"إلغاء\" button on pop up");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("تعديل ممثل المؤجر الحالي", ChangeLessor_LessorRepPageObjects.UpdateLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_154_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \"التالي\" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Click on \" تأكيد \" button");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("تغيير ممثل المؤجر", ChangeLessor_LessorRepPageObjects.ChangeLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_155_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify there is a pop up with title \"رسالة خطأ\"");
        CommonMethodsPage.verifyValueIsDisplayed("سالة خطأ", ChangeLessor_LessorRepPageObjects.WarningPopupTitle());
        app.changeLessor_lessorRepPage.verifyPopupMessage("نأسف لا يوجد ممثل للمؤجر مسجل على وثيقة الملكية لتتمكن من تغييره");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_156_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \"إلغاء\" button on pop up");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyValueIsDisplayed("تغيير ممثل المؤجر", ChangeLessor_LessorRepPageObjects.ChangeLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_157_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on \"الذهاب للخدمة\" button on pop up");
        app.changeLessor_lessorRepPage.clickOnGotoServiceButton();
        CommonMethodsPage.verifyValueIsDisplayed("تغيير ممثل المؤجر", ChangeLessor_LessorRepPageObjects.ChangeLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_158_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.verifyValueIsDisplayed("ممثل المؤجر السابق", ChangeLessor_LessorRepPageObjects.OldLessorRepInfoSectionTitle());
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_159_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on (عرض) button ");
        CommonMethodsPage.ClickOnAttachment("view");
        CommonMethodsPage.verifyNewTabIsOpened();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_160_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on (السابق) button ");
        CommonMethodsPage.clickOnBackButton();
        CommonMethodsPage.verifyValueIsDisplayed("وثائق الملكية", ChangeLessor_LessorRepPageObjects.OwnerShipDocumentSectionTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_161_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on (السابق) button ");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyValueIsDisplayed("تغيير ممثل المؤجر", ChangeLessor_LessorRepPageObjects.ChangeLessorRepPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_162_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        CommonMethodsPage.verifyValueIsDisplayed("تحديد هوية ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.LessorRepIdSectionTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_163_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("هوية وطنية");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_164_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' إقامة مميزة ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("إقامة مميزة");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("إقامة مميزة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_165_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية مقيم ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية مقيم");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("هوية مقيم");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_166_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية مواطني دول مجلس التعاون الخليجي ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية مواطني دول مجلس التعاون الخليجي");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("هوية مواطني دول مجلس التعاون الخليجي");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_167_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' جواز سفر ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("جواز سفر");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("جواز سفر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_168_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' أخرى ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("أخرى");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("أخرى");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_169_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Lessor_Rep_Id"), AddResidentialContractPageObjects.tenantNationalIdInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_170_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter a national id having less than 10 digits");
        app.addResidentialContractPage.inputTenantNationalId(data.get("LessorId_LessThanTenDigits"));
        CommonMethodsPage.errorMessage("الحد", ContractWaiverPageObjects.ErrorMessageUnderNatinalId());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_171_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Input national id including a letter");
        app.addResidentialContractPage.inputTenantNationalId(data.get("LessorId_WithLetters"));
        CommonMethodsPage.errorMessage("يرجى", ContractWaiverPageObjects.ErrorMessageUnderNatinalId());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_172_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Verify user is able to Input valid DOB in Hijri format");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Lessor_DOB"), AddResidentialContractPageObjects.tenantDateOfBirthInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_173_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Input a date starting in Gregorian format above year (1500)");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB_WrongFormat"));
        CommonMethodsPage.verifyValueIsNotEntered(data.get("Lessor_DOB_WrongFormat"), AddResidentialContractPageObjects.tenantDateOfBirthInput());
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_174_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB_Future"));
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_175_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Verify user is able to click on calender Icon");
        app.revokeContractPage.clickOnCalenderIcon();
        logger.info("Step 14: Verify Calendar pop up is displayed");
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_176_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        logger.info("Step 14: Verify equivalent Gregorian date is displayed under تاريخ الميلاد input field");
        CommonMethodsPage.verifyEquivalentDateIsDisplayed("gregorian");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_177_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        CommonMethodsPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_178_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_179_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.verifyValueIsDisplayed("ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.NewLessorRepInfoPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_180_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on \" السابق \" button");
        CommonMethodsPage.clickOnBackButton();
        CommonMethodsPage.verifyValueIsDisplayed("ممثل المؤجر السابق", ChangeLessor_LessorRepPageObjects.OldLessorRepInfoSectionTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_181_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a phone number which does not begin with digit 5");
        CommonMethodsPage.enterPhoneNumber(data.get("LessorPhoneNum_NotBeginWith5"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.PhoneNumberInputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_182_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a phone number which having length < 9");
        CommonMethodsPage.enterPhoneNumber(data.get("LessorPhoneNum_LessThan9"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.PhoneNumberInputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_183_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a phone number which having length < 9");
        CommonMethodsPage.enterPhoneNumber(data.get("LessorPhoneNum"));
        CommonMethodsPage.verifyValueIsEntered(data.get("LessorPhoneNum"), CommonMethodsPageObjects.PhoneNumberInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_184_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a valid email address");
        CommonMethodsPage.enterEmail(data.get("Lessor_Email"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Lessor_Email"), CommonMethodsPageObjects.EmailInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_185_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input an invalid email address");
        CommonMethodsPage.enterEmail(data.get("Lessor_Email_Invalid"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.EmailErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_186_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on المنطقة dropdown");
        CommonMethodsPage.clickOnRegionDropdownMenu();
        logger.info("Step 16: Select any option from dropdown");
        CommonMethodsPage.selectFromList(data.get("LessorRegion"), CommonMethodsPageObjects.RegionDropdownOptions());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_187_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on المدينة  dropdown");
        CommonMethodsPage.clickOnCityDropdown();
        logger.info("Step 16: Select an option from available cities");
        CommonMethodsPage.SelectCity(data.get("LessorCity"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_188_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a numerical value with with letters in Postal code input");
        CommonMethodsPage.enterPostalCode(data.get("LessorPostalCode_Invalid"));
        CommonMethodsPage.errorMessage("يجب", CommonMethodsPageObjects.PostalCodeError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_189_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Enter a valid postal code including on numerical values");
        CommonMethodsPage.enterPostalCode(data.get("LessorPostalCode_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("LessorPostalCode_Valid"), CommonMethodsPageObjects.PostalCodeInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_190_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a value including any special character in اسم الشارع input field");
        CommonMethodsPage.enterStreetName(data.get("LessorStreetName_Invalid"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.StreetNameError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_191_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a valid value in (اسم الشارع ) input field");
        CommonMethodsPage.enterStreetName(data.get("LessorStreetName_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("LessorStreetName_Valid"), CommonMethodsPageObjects.StreetNameInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_192_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a numerical value with (length < 5) in  رقم المبنى field");
        CommonMethodsPage.enterBuildingNumber(data.get("LessorBuildingNum_Invalid"));
        CommonMethodsPage.errorMessage("يجب", CommonMethodsPageObjects.BuildingNumberError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_193_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input numerical value رقم المبنى field of length = 4");
        CommonMethodsPage.enterBuildingNumber(data.get("LessorBuildingNum_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("LessorBuildingNum_Valid"), CommonMethodsPageObjects.BuildingNumberInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_194_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input a numerical value with (length < 4) in  الرقم الإضافي  field");
        CommonMethodsPage.enterAdditionalNumber(data.get("LessorBuildingNum_Invalid"));
        CommonMethodsPage.errorMessage("يجب", CommonMethodsPageObjects.AdditionalNumberError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_195_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Input numerical value الرقم الإضافي  field of length = 4");
        CommonMethodsPage.enterAdditionalNumber(data.get("LessorBuildingNum_Valid"));
        CommonMethodsPage.verifyValueIsEntered(data.get("LessorBuildingNum_Valid"), CommonMethodsPageObjects.AdditionalNumberInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_196_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on  السابق  Button");
        CommonMethodsPage.clickOnBackButton();
        CommonMethodsPage.verifyValueIsDisplayed("تحديد هوية ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.LessorRepIdSectionTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_197_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Verify \" تأكيد التغيير \" button is not enabled or not clickable");
        CommonMethodsPage.verifyConfirmButtonIsDisabled();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_198_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        CommonMethodsPage.verifyValueIsDisplayed("إضافة وثيقة قانونية جديدة", ChangeLessor_LessorRepPageObjects.AddNewRepresentationDocumentPopupTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_199_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Click on يرجى اختيار button under نوع الوثيقة label ");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        logger.info("Step 17: Select document type from dropdown  ");
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        app.changeLessor_lessorRepPage.verifyDocumentTypeIsSelected(data.get("Document_Type"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_200_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Enter a value in رقم الوثيقة  input field");
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Document_Number"), CommonMethodsPageObjects.ownershipDocumentNumberTXT());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_201_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Enter issue date ");
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Document_Issue_Date"), ChangeLessor_LessorRepPageObjects.IssueDateInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_202_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Click on calender icon");
        app.revokeContractPage.clickOnCalenderIcon();
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_203_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Enter incomplete  date in تاريخ الإصدار in Gregorian format");
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Incomplete_Date"));
        CommonMethodsPage.errorMessage("يرجى", RentalIncidentsPageObjects.InputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_204_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Enter date in 'تاريخ انتهاء الصلاحية'  in Gregorian format");
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Document_Expiry_Date"), ChangeLessor_LessorRepPageObjects.ExpiryDateInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_205_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15: Click on calender icon");
        app.revokeContractPage.clickOnCalenderIcon();
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_206_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Enter incomplete  date in  تاريخ انتهاء الصلاحية in Gregorian format");
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Incomplete_Date"));
        CommonMethodsPage.errorMessage("يرجى", RentalIncidentsPageObjects.InputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_207_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Click on the calender icon inside  تاريخ الإصدار input field");
        app.revokeContractPage.clickOnCalenderIcon();
        logger.info("Step 17: -Select \"تاريخ الإصدار \" and  \" تاريخ انتهاء الصلاحية \" from the calender ");
        String date = data.get("Document_Issue_Date");
        String[] arrDate = date.split("-");
        app.addResidentialContractPage.selectStartDateOfResidualContract(arrDate[2].substring(1), app.addResidentialContractPage.getCurrentMonth(arrDate[1]), arrDate[0]);
        app.addResidentialContractPage.selectEndDateOfResidualContract(arrDate[2].substring(1), app.addResidentialContractPage.getCurrentMonth(arrDate[1]), String.valueOf(Integer.parseInt(arrDate[0]) + 1));
        CommonMethodsPage.verifyValueIsEntered(data.get("Document_Issue_Date"), ChangeLessor_LessorRepPageObjects.IssueDateInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_208_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Enter text in تم الإصدار بواسطة");
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Issue_By_Name"), ChangeLessor_LessorRepPageObjects.IssueByInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_209_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Enter text in تم الإصدار بواسطة");
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Document_Name"), ChangeLessor_LessorRepPageObjects.LegalDocumentNameInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_210_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Enter text in تم الإصدار في text box");
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Document_IssuePlace"), ChangeLessor_LessorRepPageObjects.DocumentIssuePlaceInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_211_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Upload attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_212_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Upload attachment of valid type (PNG, JPEG, GIF, PDF) having large size");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment_Large_Size"));
        app.revokeContractPage.verifyErrorMessageIsDisplayedForLargeFile();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_213_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16: Upload attachment of valid type (PNG, JPEG, GIF, PDF)");
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 17: Click on delete icon button");
        CommonMethodsPage.clickOnDeleteIconButton();
        CommonMethodsPage.verifyTheAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_214_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 15:  Click on \" إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.verifyValueIsDisplayed("ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.NewLessorRepInfoPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_215_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 17:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        app.revokeContractPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_216_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 17:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 18:  Click on  عرض   button");
        app.revokeContractPage.clickOnViewButtonOnRequest();
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_217_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 17:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 18: Click on delete icon button");
        CommonMethodsPage.clickOnDeleteIconButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("يرجى تأكيد أنك تريد حذف مستند الوكيل");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_218_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 17:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 18: Click on delete icon button");
        CommonMethodsPage.clickOnDeleteIconButton();
        logger.info("Step 19: Click on  إلغاء  button");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.NewLessorRepInfoPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_219_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 17:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 17: Click on delete icon button");
        CommonMethodsPage.clickOnDeleteIconButton();
        logger.info("Step 18: Click on  تأكيد    button");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        CommonMethodsPage.verifyTheAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_220_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 17:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 18: Click on  تأكيد التغيير  button");
        CommonMethodsPage.clickOnConfirmButton();
        CommonMethodsPage.verifyValueIsDisplayed("رسالة تنبيه", RentalIncidentsPageObjects.WarningPopUpTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_221_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 17:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 18: Click on  تأكيد التغيير  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 19: Click on إلغاء button on pop up");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("ممثل المؤجر الجديد", ChangeLessor_LessorRepPageObjects.NewLessorRepInfoPageTitle());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_222_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغيير ممثل المؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير ممثل المؤجر");
        logger.info("Step 08: Click on any radio button");
        app.changeLessor_lessorRepPage.selectChangeLessorRepRadioButtons("تعديل ممثل المؤجر الحالي");
        logger.info("Step 09: Click on \" التالي \" button");
        app.changeLessor_lessorRepPage.clickOnNextButton(ChangeLessor_LessorRepPageObjects.NextBTN2());
        logger.info("Step 10: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        Browser.waitUntilVisibilityOfElement(ChangeLessor_LessorRepPageObjects.PropertyInformationSectionTitle(), 40);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on Continue Adding New Lessor button");
        app.changeLessor_lessorRepPage.clickOnContinueAddNewLessorRepButton();
        logger.info("Step 12: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        logger.info("Step 13: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("Lessor_Rep_Id"));
        logger.info("Step 14: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 15: Click on ' إضافة وثيقة قانونية جديدة '  link ");
        app.changeLessor_lessorRepPage.clickOnAddNewRepresentationDocumentLink();
        logger.info("Step 16:  Fill ownership document details");
        app.changeLessor_lessorRepPage.clickOnDocumentTypeDropdown();
        CommonMethodsPage.selectFromList(data.get("Document_Type"), ChangeLessor_LessorRepPageObjects.DocumentTypeDropdownList());
        CommonMethodsPage.enterOwnershipDocumentNumberInputField(data.get("Document_Number"));
        app.changeLessor_lessorRepPage.enterNameInIssueByField(data.get("Issue_By_Name"));
        app.changeLessor_lessorRepPage.enterDocumentName(data.get("Document_Name"));
        app.changeLessor_lessorRepPage.enterDocumentIssuePlace(data.get("Document_IssuePlace"));
        app.changeLessor_lessorRepPage.enterIssueDate(data.get("Document_Issue_Date"));
        app.changeLessor_lessorRepPage.enterExpiryDate(data.get("Document_Expiry_Date"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        app.revokeContractPage.uploadRequiredDocuments(data.get("PDF_Attachment"));
        logger.info("Step 17:  Click on Add button");
        app.changeLessor_lessorRepPage.clickOnAddButton();
        logger.info("Step 18: Click on  تأكيد التغيير  button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 19: Click on تأكيد button on pop up");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("تعديل ممثل المؤجر الحالي", ChangeLessor_LessorRepPageObjects.LessorUpdatePopupTitle());
        app.changeLessor_lessorRepPage.getRequestNumberFromPopup(ChangeLessor_LessorRepPageObjects.RequestNumber());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_223_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on \"  الطلبات  \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter the request number in request search field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }


    /**
     * Change lessor
     * TC_391 to TC_415
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_391_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        app.changeLessor_lessorRepPage.checkAddIndividualOwnerIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_392_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        app.changeLessor_lessorRepPage.verifyPropertyOwnerRadioButtonIsClicked();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_393_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button");
        app.changeLessor_lessorRepPage.clickOnRepresentativeOwnerRadioButton();
        app.changeLessor_lessorRepPage.verifyRepresentativeOwnerRadioButtonIsClicked();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_394_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Click on ' إقامة مميزة ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("إقامة مميزة");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("إقامة مميزة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_395_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Click on ' هوية مقيم ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية مقيم");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("هوية مقيم");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_396_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Click on ' هوية مواطني دول مجلس التعاون الخليجي ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية مواطني دول مجلس التعاون الخليجي");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("هوية مواطني دول مجلس التعاون الخليجي");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_397_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Click on ' جواز سفر ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("جواز سفر");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("جواز سفر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_398_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Click on ' أخرى ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("أخرى");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("أخرى");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_399_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Click on ' هوية وطنية ' radio button");
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("هوية وطنية");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_400_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Verify (رقم الهوية الوطنية) field is enabled");
        app.changeLessor_lessorRepPage.verifyNationalIdFieldIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_401_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        CommonMethodsPage.verifyValueIsEntered(data.get("New_Lessor_Id"), AddResidentialContractPageObjects.tenantNationalIdInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_402_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);;
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter a national id having less than 10 digits");
        app.addResidentialContractPage.inputTenantNationalId(data.get("LessorId_LessThanTenDigits"));
        CommonMethodsPage.errorMessage("الحد", ContractWaiverPageObjects.ErrorMessageUnderNatinalId());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_403_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Input national id including a letter");
        app.addResidentialContractPage.inputTenantNationalId(data.get("LessorId_WithLetters"));
        CommonMethodsPage.errorMessage("يرجى", ContractWaiverPageObjects.ErrorMessageUnderNatinalId());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_404_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Input national id including a letter");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_DOB"));
        CommonMethodsPage.errorMessage("يرجى", ContractWaiverPageObjects.ErrorMessageUnderNatinalId());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_405_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Input a date starting in Gregorian format above year (1500)");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB_WrongFormat"));
        CommonMethodsPage.verifyValueIsNotEntered(data.get("Lessor_DOB_WrongFormat"), AddResidentialContractPageObjects.tenantDateOfBirthInput());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_406_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Input a date greater than current date");
        app.contractWaiverPage.enterValidTenantDOB(data.get("Lessor_DOB_Future"));
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_407_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        app.changeLessor_lessorRepPage.clickOnConfirmOwnershipDocumentButton();
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Verify user is able to click on calender Icon");
        app.revokeContractPage.clickOnCalenderIcon();
        logger.info("Step 11: Verify Calendar pop up is displayed");
        app.revokeContractPage.verifyCalenderIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_408_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 11: Verify equivalent Gregorian date is displayed under تاريخ الميلاد input field");
        CommonMethodsPage.verifyEquivalentDateIsDisplayed("gregorian");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_409_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (إلغاء) button  ");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_410_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (إلغاء) button  ");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on (إلغاء) button on the pop up");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        app.changeLessor_lessorRepPage.checkAddIndividualOwnerIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_411_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (إلغاء) button  ");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on (تأكيد) button on the pop up");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("طلب تغيير ملكية وثيقة الملكية", ChangeLessor_LessorRepPageObjects.ownershipChangeRequestOfTitleDeedPage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_412_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Verify (التالي) button is disabled/not clickable");
        CommonMethodsPage.verifyNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_413_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.verifyValueIsDisplayed("معلومات طرف العقد", ChangeLessor_LessorRepPageObjects.ContractPartyInfoPage() );
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_414_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  (إلغاء) button ");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_415_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  (إلغاء) button ");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Click on  (إلغاء) button on pop up");
        app.contractWaiverPage.clickOnCancelButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("معلومات طرف العقد", ChangeLessor_LessorRepPageObjects.ContractPartyInfoPage() );
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_416_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  (إلغاء) button ");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Click on  (إلغاء) button on pop up");
        app.contractWaiverPage.clickOnConfirmButtonOnPopUp();
        CommonMethodsPage.verifyValueIsDisplayed("طلب تغيير ملكية وثيقة الملكية", ChangeLessor_LessorRepPageObjects.ownershipChangeRequestOfTitleDeedPage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_417_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (السابق) button ");
        CommonMethodsPage.clickOnBackButton();
        CommonMethodsPage.verifyValueIsDisplayed("هوية الطرف", ChangeLessor_LessorRepPageObjects.PartyIdSection());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_418_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Input a phone number which does not begin with digit 5");
        CommonMethodsPage.enterPhoneNumber(data.get("LessorPhoneNum_NotBeginWith5"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.PhoneNumberInputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_419_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Input a phone number which having length < 9");
        CommonMethodsPage.enterPhoneNumber(data.get("LessorPhoneNum_LessThan9"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.PhoneNumberInputFieldErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_420_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Input a phone number which having length < 9");
        CommonMethodsPage.enterPhoneNumber(data.get("LessorPhoneNum"));
        CommonMethodsPage.verifyValueIsEntered(data.get("LessorPhoneNum"), CommonMethodsPageObjects.PhoneNumberInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_421_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Input a valid email address");
        CommonMethodsPage.enterEmail(data.get("Lessor_Email"));
        CommonMethodsPage.verifyValueIsEntered(data.get("Lessor_Email"), CommonMethodsPageObjects.EmailInputField());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_422_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Input an invalid email address");
        CommonMethodsPage.enterEmail(data.get("Lessor_Email_Invalid"));
        CommonMethodsPage.errorMessage("يرجى", CommonMethodsPageObjects.EmailErrorMessage());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_423_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on المنطقة dropdown");
        CommonMethodsPage.clickOnRegionDropdownMenu();
        logger.info("Step 14: Select any option from dropdown");
        CommonMethodsPage.selectFromList(data.get("LessorRegion"), CommonMethodsPageObjects.RegionDropdownOptions());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_424_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on المدينة  dropdown");
        CommonMethodsPage.clickOnCityDropdown();
        logger.info("Step 14: Select an option from available cities");
        CommonMethodsPage.SelectCity(data.get("LessorCity"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_425_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("Ownership_Number"));
        logger.info("Step 06: Click on filter icon");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \"تغييرالمؤجر\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("تغيير المؤجر");
        Browser.waitForSeconds(5);
        logger.info("Step 08: Verify (إضافة مالك فرد) button is clickable");
        app.changeLessor_lessorRepPage.clickOnAddIndividualOwnerLinkButton();
        logger.info("Step 09: Click on (ممثل المالك) radio button ");
        app.changeLessor_lessorRepPage.clickOnPropertyOwnerRadioButton();
        logger.info("Step 10: Enter valid national id ");
        app.addResidentialContractPage.inputTenantNationalId(data.get("New_Lessor_Id"));
        logger.info("Step 11: Input valid DOB");
        app.contractWaiverPage.enterValidTenantDOB(data.get("New_Lessor_DOB"));
        logger.info("Step 12: Click on (التالي) button ");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Input a numerical value with with letters in Postal code input");
        CommonMethodsPage.enterPostalCode(data.get("LessorPostalCode_Invalid"));
        CommonMethodsPage.errorMessage("يجب", CommonMethodsPageObjects.PostalCodeError());
    }

}
