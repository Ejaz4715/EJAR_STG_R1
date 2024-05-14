package sa.ejar.web.login;

import com.testcrew.manager.TestDataManager;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.ChangeLessor_LessorRepPageObjects;
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
        app.changeLessor_lessorRepPage.getContractNumber();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
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
        logger.info("Step 05: Enter Contract number in the ownership document reference");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        CommonMethodsPage.verifyNewTabIsOpened();
        app.changeLessor_lessorRepPage.getContractVersionFromPDF();
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
        logger.info("Step 04: Verify \"وثائق الملكية\" page is displayed with all the ownerhsip documents");
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
        logger.info("Step 08: Click on \"إلغاء\" button");
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
        logger.info("Step 08: Click on \"إلغاء\" button");
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
        logger.info("Step 08: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"إلغاء\" button");
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
        logger.info("Step 08: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on \"إلغاء\" button on pop up");
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
        logger.info("Step 08: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \"إلغاء\" button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on \" تأكيد \" button");
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
        logger.info("Step 08: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Verify there is a pop up with title \"رسالة خطأ\"");
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
        logger.info("Step 08: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"إلغاء\" button on pop up");
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
        logger.info("Step 08: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on \"إلغاء\" button on pop up");
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
        logger.info("Step 08: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.verifyValueIsDisplayed("معلومات العقار", ChangeLessor_LessorRepPageObjects.LessorRepIdSectionTitle());
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
        logger.info("Step 08: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on \" التالي \" button");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnNextButton();
        app.contractWaiverPage.clickOnNationalIdRadioButton();
        app.changeLessor_lessorRepPage.clickOnIdTypeRadioButton("هوية وطنية");
        app.changeLessor_lessorRepPage.verifyIdTypeRadioButtonIsSelected("هوية وطنية");
    }
}
