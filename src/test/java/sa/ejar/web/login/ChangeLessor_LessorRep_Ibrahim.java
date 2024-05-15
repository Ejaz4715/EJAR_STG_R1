package sa.ejar.web.login;

import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.ChangeLessor_LessorRepPageObjects;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.objects.precondition.AddResidentialContractPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class ChangeLessor_LessorRep_Ibrahim extends NHCWebTest {

    /**
     * Pre Conditions
     * -Create Contracts
     * -Approve from parties
     */

    /**
     * Lessor Representative Approve/Reject The Added Lessor Representative Request
     * TC_84 to TC_123
     */
    @Test(dataProvider = "testDataProvider")
    public void TC_84_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Verify the (الطلبات) page is displayed");
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_85_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Verify searched request number is appearing");
        CommonMethodsPage.verifySearchedRequestIsDisplayed(data.get("RequestNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_86_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Verify (الموافقة على طلب التغيير)  option displayed");
        CommonMethodsPage.KebabMenuOptions("الموافقة على طلب التغيير");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_87_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Verify the user navigate to (طلب تعديل ممثل المؤجر الحالي) page");
        app.changeLessor_lessorRepPage.checkRequestChangeCurrentLessorRepPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_88_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_89_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify the user navigate to (طلب إضافة ممثل المؤجر الجديد) page");
        app.changeLessor_lessorRepPage.checkAddNewLessorRepPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_90_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 09: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_91_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (عرض) button");
        CommonMethodsPage.ClickOnAttachment("view");
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_92_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_93_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Verify the (رفض طلب التغيير) is enabled");
        app.changeLessor_lessorRepPage.verifyRejectChangeRequestButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_94_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 10: Verify the (رفض طلب التغيير) button is disabled/not clickable");
        app.changeLessor_lessorRepPage.verifyRejectChangeRequestButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_95_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Verify the (رفض طلب التغيير) button is disabled/not clickable");
        app.changeLessor_lessorRepPage.verifyRejectChangeRequestButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_96_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 10: Verify user able to enter text on (اكتب سبب الرفض) textarea ");
        app.sendContractForApprovalPage.verifyRejectionContractReasonHasBeenEntered("Reject_Reason");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_97_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_98_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Verify the user remains in the same (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_99_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify the user navigate back to (معلومات طلب التغيير) section");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_100_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Verify the user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_101_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: The OTP code has been input successfully");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_102_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Click on (إلغاء)  button");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Verify the user navigate back to (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_103_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 13: Verify the user is not able to click the button  (التحقق من الهوية)");
        app.sendContractForApprovalPage.verifyIdentityVerificationButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_104_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Enter wrong OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("Wrong_OTP"));
        logger.info("Step 13: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 14: Verify the error message is displayed under OTP input field, Message:  غير صالح OTP رمز ");
        app.sendContractForApprovalPage.verifyOTPErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_105_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Enter valid OTP");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 13: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 14: Verify the user navigate to (تم تقديم الرفض) page");
        app.changeLessor_lessorRepPage.verifyRejectionSubmittedMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_106_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Verify the user navigate to the (العقود والإتفاقيات) section");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_107_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (السابق) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 10: Verify the  user navigate back to the (معلومات طلب التغيير) section");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_108_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (إلغاء) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_109_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (رفض) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_110_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Verify the user navigate to the (معلومات الآيبان) section");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_111_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (السابق) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 11: Verify the user navigate back to the (العقود والإتفاقيات) section");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_112_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (إلغاء) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_113_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (رفض) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_114_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (تعديل) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        CommonMethodsPage.clickOnEditButton();
        logger.info("Step 11: Verify a (تعديل الحساب الشخصي آيبان) pop up will display");
        app.changeLessor_lessorRepPage.checkEditIBANInfoPopupWindowIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_115_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (إضافة رقم آيبان جديد ) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        app.changeLessor_lessorRepPage.clickOnAddNewIbanButton();
        logger.info("Step 11: Verify a (إضافة رقم آيبان جديد) pop up will display");
        app.changeLessor_lessorRepPage.checkAddNewIBANPopupWindowIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_116_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the user navigate to the (الإقرار وتأكيد الموافقة) section");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_117_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on (السابق) button");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 12: Verify the user navigate back to the (معلومات اللآيبان) section");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_118_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on (إلغاء) button");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_119_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the (تأكيد الموافقة على الطلب) button is disabled/not clickable");
        app.changeLessor_lessorRepPage.checkConfirmApprovalButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_120_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Verify the (تأكيد الموافقة على الطلب) button is enabled/clickable");
        app.changeLessor_lessorRepPage.checkConfirmApprovalButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_121_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on (تأكيد الموافقة على الطلب) button");
        app.changeLessor_lessorRepPage.clickOnConfirmApprovalButton();
        logger.info("Step 13: Verify The user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_122_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on (تأكيد الموافقة على الطلب) button");
        app.changeLessor_lessorRepPage.clickOnConfirmApprovalButton();
        logger.info("Step 13: Click on (إلغاء) button");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Verify the user navigate back to (الإقرار وتأكيد الموافقة) section");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_123_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on (تأكيد الموافقة على الطلب) button");
        app.changeLessor_lessorRepPage.clickOnConfirmApprovalButton();
        logger.info("Step 13: Enter OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify the user navigate to (تم تغيير المؤجر/ممثل المؤجر بنجاح) page");
        app.changeLessor_lessorRepPage.checkLessorLessorRepChangedSuccessfullyMessageIsDisplayed();
    }

    /**
     * Verify new lessor representative has been added from ownership document (Approval required)
     * TC_124 to TC_128
     */


    @Test(dataProvider = "testDataProvider")
    public void TC_124_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify User is able to view (وثائق الملكية) page");
        app.changeLessor_lessorRepPage.verifyOwnerShipDocumentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_125_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Verify the searched ownership document is displayed");
        app.changeLessor_lessorRepPage.verifySearchedOwnershipDocumentIsDisplayed(data.get("Deed_Number"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_126_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on kebab button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \" عرض وثيقة الملكية\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض وثيقة الملكية");
        logger.info("Step 08: Verify the user is navigated to \"إدارة مستند الملكية\" page");
        app.changeLessor_lessorRepPage.checkManageOwnershipDocumentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_127_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on kebab button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \" عرض وثيقة الملكية\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض وثيقة الملكية");
        logger.info("Step 08: Click on kebab button for lessor representative");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        app.changeLessor_lessorRepPage.clickOnLessorRepKebabButton();
        logger.info("Step 09: Click on (تعديل) button");
        app.changeLessor_lessorRepPage.clickOnLessorRepEditButton();
        logger.info("Step 10: Verify User is navigate to \"إضافة مالك فرد\" page ");
        app.changeLessor_lessorRepPage.checkAddAnIndividualPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_128_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on kebab button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \" عرض وثيقة الملكية\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض وثيقة الملكية");
        logger.info("Step 08: Click on kebab button for lessor representative");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        app.changeLessor_lessorRepPage.clickOnLessorRepKebabButton();
        logger.info("Step 09: Click on (تعديل) button");
        app.changeLessor_lessorRepPage.clickOnLessorRepEditButton();
        logger.info("Step 10: Verify the (رقم الهوية الوطنية) is same as it was added ");
        app.changeLessor_lessorRepPage.verifyTheNationalIDSameAsDisplayed(data.get("Lessor_Rep_Id"));
    }

    /**
     * Verify the old invoice has been closed and invoice is opened for any contract registered under the ownership document that went through Add Lessor Representative action (Approval required)
     * TC_129 to TC_132
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_129_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Verify the user is able to view  (الفواتير) page");
        CommonMethodsPage.verifyContractsInvoicesIsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_130_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("Contract_Number_addRep"));
        logger.info("Step 06: Verify user is able to view all the invoices of selected contract");
        CommonMethodsPage.verifySearchedContractIsDisplayedForInvoices(data.get("Contract_Number_addRep"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_131_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("Contract_Number_addRep"));
        logger.info("Step 06: Verify old invoice has a status مغلقة");
        CommonMethodsPage.verifyInvoiceStatus("old", "مغلقة", CommonMethodsPageObjects.OldInvoiceStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_132_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("Contract_Number_addRep"));
        logger.info("Step 06: Click on new invoice");
        CommonMethodsPage.clickOnNewInvoice();
        logger.info("Step 07: Verify new invoice has a status  لم يتم الدفع  ");
        CommonMethodsPage.verifyInvoiceStatus("new", "لم يتم الدفع", CommonMethodsPageObjects.NewInvoiceStatus());
    }

    /**
     * Verify the minor version is changed after Adding Lessor Representative from one of the contract (Approval required)
     * TC_133 to TC_137
     */
    @Test(dataProvider = "testDataProvider")
    public void TC_133_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_134_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_addRep"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("Contract_Number_addRep"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_135_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_addRep"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Verify the User is navigated to contract");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_136_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_addRep"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        logger.info("Step 08: Verify contract file has been downloaded");
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_137_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_addRep"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        CommonMethodsPage.verifyNewTabIsOpened();
        logger.info("Step 08: Verify contract version has been changed");
        app.changeLessor_lessorRepPage.getContractVersionAddRep();
    }

    /**
     * Lessor Representative Approve/Reject The Updated Lessor Representative Request
     * TC_224 to TC_263
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_224_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Verify the (الطلبات) page is displayed");
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_225_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Verify searched request number is appearing");
        CommonMethodsPage.verifySearchedRequestIsDisplayed(data.get("RequestNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_226_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Verify (الموافقة على طلب التغيير)  option displayed");
        CommonMethodsPage.KebabMenuOptions("الموافقة على طلب التغيير");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_227_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Verify the user navigate to (طلب تعديل ممثل المؤجر الحالي) page");
        app.changeLessor_lessorRepPage.checkRequestChangeCurrentLessorRepPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_228_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_229_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify user navigate to (طلب تعديل ممثل المؤجر الحالي) page");
        app.changeLessor_lessorRepPage.checkRequestUpdateCurrentLessorRepPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_230_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 09: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_231_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (عرض) button");
        CommonMethodsPage.ClickOnAttachment("view");
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_232_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_233_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Verify the (رفض طلب التغيير) is enabled");
        app.changeLessor_lessorRepPage.verifyRejectChangeRequestButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_234_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 10: Verify the (رفض طلب التغيير) button is disabled/not clickable");
        app.changeLessor_lessorRepPage.verifyRejectChangeRequestButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_235_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Verify the (رفض طلب التغيير) button is disabled/not clickable");
        app.changeLessor_lessorRepPage.verifyRejectChangeRequestButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_236_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 10: Verify user able to enter text on (اكتب سبب الرفض) textarea ");
        app.sendContractForApprovalPage.verifyRejectionContractReasonHasBeenEntered("Reject_Reason");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_237_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_238_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Verify the user remains in the same (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_239_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify the user navigate back to (معلومات طلب التغيير) section");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_240_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Verify the user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_241_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: The OTP code has been input successfully");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_242_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Click on (إلغاء)  button");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Verify the user navigate back to (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_243_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 13: Verify the user is not able to click the button  (التحقق من الهوية)");
        app.sendContractForApprovalPage.verifyIdentityVerificationButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_244_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Enter wrong OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("Wrong_OTP"));
        logger.info("Step 13: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 14: Verify the error message is displayed under OTP input field, Message:  غير صالح OTP رمز ");
        app.sendContractForApprovalPage.verifyOTPErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_245_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Enter valid OTP");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 13: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 14: Verify the user navigate to (تم تقديم الرفض) page");
        app.changeLessor_lessorRepPage.verifyRejectionSubmittedMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_246_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Verify the user navigate to the (العقود والإتفاقيات) section");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_247_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (السابق) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 10: Verify the  user navigate back to the (معلومات طلب التغيير) section");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_248_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (إلغاء) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_249_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (رفض) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_250_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Verify the user navigate to the (معلومات الآيبان) section");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_251_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (السابق) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 11: Verify the user navigate back to the (العقود والإتفاقيات) section");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_252_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (إلغاء) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_253_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (رفض) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_254_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (تعديل) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        CommonMethodsPage.clickOnEditButton();
        logger.info("Step 11: Verify a (تعديل الحساب الشخصي آيبان) pop up will display");
        app.changeLessor_lessorRepPage.checkEditIBANInfoPopupWindowIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_255_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (إضافة رقم آيبان جديد ) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        app.changeLessor_lessorRepPage.clickOnAddNewIbanButton();
        logger.info("Step 11: Verify a (إضافة رقم آيبان جديد) pop up will display");
        app.changeLessor_lessorRepPage.checkAddNewIBANPopupWindowIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_256_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the user navigate to the (الإقرار وتأكيد الموافقة) section");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_257_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on (السابق) button");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 12: Verify the user navigate back to the (معلومات اللآيبان) section");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_258_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on (إلغاء) button");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_259_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the (تأكيد الموافقة على الطلب) button is disabled/not clickable");
        app.changeLessor_lessorRepPage.checkConfirmApprovalButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_260_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Verify the (تأكيد الموافقة على الطلب) button is enabled/clickable");
        app.changeLessor_lessorRepPage.checkConfirmApprovalButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_261_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on (تأكيد الموافقة على الطلب) button");
        app.changeLessor_lessorRepPage.clickOnConfirmApprovalButton();
        logger.info("Step 13: Verify The user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_262_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on (تأكيد الموافقة على الطلب) button");
        app.changeLessor_lessorRepPage.clickOnConfirmApprovalButton();
        logger.info("Step 13: Click on (إلغاء) button");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Verify the user navigate back to (الإقرار وتأكيد الموافقة) section");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_263_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on (تأكيد الموافقة على الطلب) button");
        app.changeLessor_lessorRepPage.clickOnConfirmApprovalButton();
        logger.info("Step 13: Enter OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify the user navigate to (تم تغيير المؤجر/ممثل المؤجر بنجاح) page");
        app.changeLessor_lessorRepPage.checkLessorLessorRepChangedSuccessfullyMessageIsDisplayed();
    }

    /**
     * Verify lessor representative has been updated from ownership document (Approval is required)
     * TC_264 to TC_268
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_264_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify User is able to view (وثائق الملكية) page");
        app.changeLessor_lessorRepPage.verifyOwnerShipDocumentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_265_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Verify the searched ownership document is displayed");
        app.changeLessor_lessorRepPage.verifySearchedOwnershipDocumentIsDisplayed(data.get("Deed_Number"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_266_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on kebab button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \" عرض وثيقة الملكية\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض وثيقة الملكية");
        logger.info("Step 08: Verify the user is navigated to \"إدارة مستند الملكية\" page");
        app.changeLessor_lessorRepPage.checkManageOwnershipDocumentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_267_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on kebab button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \" عرض وثيقة الملكية\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض وثيقة الملكية");
        logger.info("Step 08: Click on kebab button for lessor representative");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        app.changeLessor_lessorRepPage.clickOnLessorRepKebabButton();
        logger.info("Step 09: Click on (تعديل) button");
        app.changeLessor_lessorRepPage.clickOnLessorRepEditButton();
        logger.info("Step 10: Verify User is navigate to \"إضافة مالك فرد\" page ");
        app.changeLessor_lessorRepPage.checkAddAnIndividualPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_268_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on kebab button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \" عرض وثيقة الملكية\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض وثيقة الملكية");
        logger.info("Step 08: Click on kebab button for lessor representative");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        app.changeLessor_lessorRepPage.clickOnLessorRepKebabButton();
        logger.info("Step 09: Click on (تعديل) button");
        app.changeLessor_lessorRepPage.clickOnLessorRepEditButton();
        logger.info("Step 10: Verify the (رقم الهوية الوطنية) is same as it was added ");
        app.changeLessor_lessorRepPage.verifyTheNationalIDSameAsDisplayed(data.get("Lessor_Rep_Id"));
    }

    /**
     * Verify the old invoice has been closed and new invoice is opened for any contract registered under the ownership document that went through Update Lessor Representative action (Approval is required)
     * TC_269 to TC_272
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_269_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب الوساطة");
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Verify the user is able to view  (الفواتير) page");
        CommonMethodsPage.verifyContractsInvoicesIsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_270_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("Contract_Number_updateRep"));
        logger.info("Step 06: Verify user is able to view all the invoices of selected contract");
        CommonMethodsPage.verifySearchedContractIsDisplayedForInvoices(data.get("Contract_Number_updateRep"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_271_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("Contract_Number_updateRep"));
        logger.info("Step 06: Verify old invoice has a status مغلقة");
        CommonMethodsPage.verifyInvoiceStatus("old", "مغلقة", CommonMethodsPageObjects.OldInvoiceStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_272_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("Contract_Number_updateRep"));
        logger.info("Step 06: Click on new invoice");
        CommonMethodsPage.clickOnNewInvoice();
        logger.info("Step 07: Verify new invoice has a status  لم يتم الدفع  ");
        CommonMethodsPage.verifyInvoiceStatus("new", "لم يتم الدفع", CommonMethodsPageObjects.NewInvoiceStatus());
    }

    /**
     * Verify the minor version is changed after Updating Lessor Representative from one the contract (Approval is required)
     * TC_273 to TC_277
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_273_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_274_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_updateRep"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("Contract_Number_updateRep"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_275_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_updateRep"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Verify the User is navigated to contract");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_276_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_updateRep"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        logger.info("Step 08: Verify contract file has been downloaded");
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_277_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_updateRep"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        CommonMethodsPage.verifyNewTabIsOpened();
        logger.info("Step 08: Verify contract version has been changed");
        app.changeLessor_lessorRepPage.getContractVersionChangeRep();
    }

    /**
     * Lessor Approve/Reject The Removal Of The Lessor Representative
     * TC_304 to TC_343
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_304_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Verify the (الطلبات) page is displayed");
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_305_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Verify searched request number is appearing");
        CommonMethodsPage.verifySearchedRequestIsDisplayed(data.get("RequestNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_306_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Verify (الموافقة على طلب التغيير)  option displayed");
        CommonMethodsPage.KebabMenuOptions("الموافقة على طلب التغيير");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_307_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Verify the user navigate to (طلب تعديل ممثل المؤجر الحالي) page");
        app.changeLessor_lessorRepPage.checkRequestChangeCurrentLessorRepPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_308_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_309_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify the user navigate to (إزالة ممثل المؤجر الحالي) page");
        app.changeLessor_lessorRepPage.checkRemoveCurrentLessorRepPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_310_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 09: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_311_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (عرض) button");
        CommonMethodsPage.ClickOnAttachment("view");
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_312_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_313_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Verify the (رفض طلب التغيير) is enabled");
        app.changeLessor_lessorRepPage.verifyRejectChangeRequestButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_314_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 10: Verify the (رفض طلب التغيير) button is disabled/not clickable");
        app.changeLessor_lessorRepPage.verifyRejectChangeRequestButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_315_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Verify the (رفض طلب التغيير) button is disabled/not clickable");
        app.changeLessor_lessorRepPage.verifyRejectChangeRequestButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_316_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 10: Verify user able to enter text on (اكتب سبب الرفض) textarea ");
        app.sendContractForApprovalPage.verifyRejectionContractReasonHasBeenEntered("Reject_Reason");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_317_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_318_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Verify the user remains in the same (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_319_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify the user navigate back to (معلومات طلب التغيير) section");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_320_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Verify the user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_321_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: The OTP code has been input successfully");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_322_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Click on (إلغاء)  button");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Verify the user navigate back to (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_323_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 13: Verify the user is not able to click the button  (التحقق من الهوية)");
        app.sendContractForApprovalPage.verifyIdentityVerificationButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_324_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Enter wrong OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("Wrong_OTP"));
        logger.info("Step 13: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 14: Verify the error message is displayed under OTP input field, Message:  غير صالح OTP رمز ");
        app.sendContractForApprovalPage.verifyOTPErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_325_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Enter valid OTP");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 13: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 14: Verify the user navigate to (تم تقديم الرفض) page");
        app.changeLessor_lessorRepPage.verifyRejectionSubmittedMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_326_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Verify the user navigate to the (العقود والإتفاقيات) section");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_327_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (السابق) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 10: Verify the  user navigate back to the (معلومات طلب التغيير) section");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_328_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (إلغاء) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_329_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (رفض) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_330_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Verify the user navigate to the (معلومات الآيبان) section");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_331_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (السابق) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 11: Verify the user navigate back to the (العقود والإتفاقيات) section");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_332_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (إلغاء) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_333_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (رفض) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_334_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (تعديل) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        CommonMethodsPage.clickOnEditButton();
        logger.info("Step 11: Verify a (تعديل الحساب الشخصي آيبان) pop up will display");
        app.changeLessor_lessorRepPage.checkEditIBANInfoPopupWindowIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_335_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (إضافة رقم آيبان جديد ) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        app.changeLessor_lessorRepPage.clickOnAddNewIbanButton();
        logger.info("Step 11: Verify a (إضافة رقم آيبان جديد) pop up will display");
        app.changeLessor_lessorRepPage.checkAddNewIBANPopupWindowIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_336_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the user navigate to the (الإقرار وتأكيد الموافقة) section");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_337_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on (السابق) button");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 12: Verify the user navigate back to the (معلومات اللآيبان) section");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_338_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on (إلغاء) button");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_339_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the (تأكيد الموافقة على الطلب) button is disabled/not clickable");
        app.changeLessor_lessorRepPage.checkConfirmApprovalButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_340_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Verify the (تأكيد الموافقة على الطلب) button is enabled/clickable");
        app.changeLessor_lessorRepPage.checkConfirmApprovalButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_341_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on (تأكيد الموافقة على الطلب) button");
        app.changeLessor_lessorRepPage.clickOnConfirmApprovalButton();
        logger.info("Step 13: Verify The user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_342_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on (تأكيد الموافقة على الطلب) button");
        app.changeLessor_lessorRepPage.clickOnConfirmApprovalButton();
        logger.info("Step 13: Click on (إلغاء) button");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Verify the user navigate back to (الإقرار وتأكيد الموافقة) section");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_343_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on (تأكيد الموافقة على الطلب) button");
        app.changeLessor_lessorRepPage.clickOnConfirmApprovalButton();
        logger.info("Step 13: Enter OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify the user navigate to (تم تغيير المؤجر/ممثل المؤجر بنجاح) page");
        app.changeLessor_lessorRepPage.checkLessorLessorRepChangedSuccessfullyMessageIsDisplayed();
    }


    /**
     * Verify lessor representative has been removed from ownership document (Approval is required)
     * TC_344 to TC_347
     */
    @Test(dataProvider = "testDataProvider")
    public void TC_344_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify User is able to view (وثائق الملكية) page");
        app.changeLessor_lessorRepPage.verifyOwnerShipDocumentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_345_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Verify the searched ownership document is displayed");
        app.changeLessor_lessorRepPage.verifySearchedOwnershipDocumentIsDisplayed(data.get("Deed_Number"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_346_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on kebab button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \" عرض وثيقة الملكية\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض وثيقة الملكية");
        logger.info("Step 08: Verify the user is navigated to \"إدارة مستند الملكية\" page");
        app.changeLessor_lessorRepPage.checkManageOwnershipDocumentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_347_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 06: Click on kebab button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \" عرض وثيقة الملكية\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض وثيقة الملكية");
        logger.info("Step 08: Verify the (ممثل المالك) has been removed ");
        app.changeLessor_lessorRepPage.checkLessorRepIsRemoved();
    }

    /**
     * Verify the old invoice has been closed and invoice is opened for any contract registered under the ownership document that went through Remove Lessor Representative action (Approval is required)
     * TC_348 to TC_351
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_348_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Verify the user is able to view  (الفواتير) page");
        CommonMethodsPage.verifyContractsInvoicesIsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_349_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("Contract_Number_removeRep"));
        logger.info("Step 06: Verify user is able to view all the invoices of selected contract");
        CommonMethodsPage.verifySearchedContractIsDisplayedForInvoices(data.get("Contract_Number_removeRep"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_350_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("Contract_Number_removeRep"));
        logger.info("Step 06: Verify old invoice has a status مغلقة");
        CommonMethodsPage.verifyInvoiceStatus("old", "مغلقة", CommonMethodsPageObjects.OldInvoiceStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_351_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("Contract_Number_removeRep"));
        logger.info("Step 06: Click on new invoice");
        CommonMethodsPage.clickOnNewInvoice();
        logger.info("Step 07: Verify new invoice has a status  لم يتم الدفع  ");
        CommonMethodsPage.verifyInvoiceStatus("new", "لم يتم الدفع", CommonMethodsPageObjects.NewInvoiceStatus());
    }

    /**
     * Verify from one the contract the minor version is changed after Removing Lessor Representative (Approval is required)
     * TC_352 to TC_356
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_352_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_353_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_removeRep"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("Contract_Number_removeRep"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_354_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_removeRep"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Verify the User is navigated to contract");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_355_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_removeRep"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        logger.info("Step 08: Verify contract file has been downloaded");
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_356_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_removeRep"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        CommonMethodsPage.verifyNewTabIsOpened();
        logger.info("Step 08: Verify contract version has been changed");
        app.changeLessor_lessorRepPage.getContractVersionRemoveRep();
    }

    /**
     *  Lessor Approve/Reject The Change Lessor
     * TC_436 to TC_475
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_436_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Verify the (الطلبات) page is displayed");
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_437_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        logger.info("Step 06: Verify searched request number is appearing");
        CommonMethodsPage.verifySearchedRequestIsDisplayed(data.get("RequestNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_438_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Verify (الموافقة على طلب التغيير)  option displayed");
        CommonMethodsPage.KebabMenuOptions("الموافقة على طلب التغيير");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_439_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Verify the user navigate to (تغيير المؤجر) page");
        app.changeLessor_lessorRepPage.checkChangeLessorPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_440_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_441_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify the user navigate to (طلب تغيير المؤجر) page");
        app.changeLessor_lessorRepPage.checkRequestChangeLessorPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_442_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 09: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_443_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (عرض) button");
        CommonMethodsPage.ClickOnAttachment("view");
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_444_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_445_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Verify the (رفض طلب التغيير) is enabled");
        app.changeLessor_lessorRepPage.verifyRejectChangeRequestButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_446_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 10: Verify the (رفض طلب التغيير) button is disabled/not clickable");
        app.changeLessor_lessorRepPage.verifyRejectChangeRequestButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_447_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Verify the (رفض طلب التغيير) button is disabled/not clickable");
        app.changeLessor_lessorRepPage.verifyRejectChangeRequestButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_448_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 10: Verify user able to enter text on (اكتب سبب الرفض) textarea ");
        app.sendContractForApprovalPage.verifyRejectionContractReasonHasBeenEntered("Reject_Reason");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_449_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_450_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Verify the user remains in the same (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_451_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on  (إلغاء)  button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify the user navigate back to (معلومات طلب التغيير) section");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_452_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Verify the user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_453_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: The OTP code has been input successfully");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_454_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Click on (إلغاء)  button");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Verify the user navigate back to (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_455_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 13: Verify the user is not able to click the button  (التحقق من الهوية)");
        app.sendContractForApprovalPage.verifyIdentityVerificationButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_456_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Enter wrong OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("Wrong_OTP"));
        logger.info("Step 13: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 14: Verify the error message is displayed under OTP input field, Message:  غير صالح OTP رمز ");
        app.sendContractForApprovalPage.verifyOTPErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_457_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (لماذا ترغب بالرفض) radio buttons");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        logger.info("Step 10: Enter (اكتب سبب الرفض) textarea");
        app.sendContractForApprovalPage.enterRejectionReason("Reject_Reason");
        logger.info("Step 11: Click on (رفض طلب التغيير) button");
        app.changeLessor_lessorRepPage.clickOnRejectChangeRequestButton();
        logger.info("Step 12: Enter valid OTP");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 13: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 14: Verify the user navigate to (تم تقديم الرفض) page");
        app.changeLessor_lessorRepPage.verifyRejectionSubmittedMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_458_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Verify the user navigate to the (العقود والإتفاقيات) section");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_459_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (السابق) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 10: Verify the  user navigate back to the (معلومات طلب التغيير) section");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_460_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (إلغاء) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_461_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (رفض) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 10: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_462_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Verify the user navigate to the (معلومات الآيبان) section");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_463_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (السابق) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 11: Verify the user navigate back to the (العقود والإتفاقيات) section");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_464_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (إلغاء) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_465_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (رفض) button");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 11: Verify the user navigate to the (لماذا ترغب بالرفض) page");
        app.sendContractForApprovalPage.verifyRejectTheContractPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_466_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (تعديل) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        CommonMethodsPage.clickOnEditButton();
        logger.info("Step 11: Verify a (تعديل الحساب الشخصي آيبان) pop up will display");
        app.changeLessor_lessorRepPage.checkEditIBANInfoPopupWindowIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_467_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (إضافة رقم آيبان جديد ) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        app.changeLessor_lessorRepPage.clickOnAddNewIbanButton();
        logger.info("Step 11: Verify a (إضافة رقم آيبان جديد) pop up will display");
        app.changeLessor_lessorRepPage.checkAddNewIBANPopupWindowIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_468_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the user navigate to the (الإقرار وتأكيد الموافقة) section");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_469_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on (السابق) button");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 12: Verify the user navigate back to the (معلومات اللآيبان) section");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_470_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on (إلغاء) button");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Verify the user navigate back to (الطلبات) page");
        CommonMethodsPage.checkRequestsPageIsDisplayed("Requests");
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_471_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Verify the (تأكيد الموافقة على الطلب) button is disabled/not clickable");
        app.changeLessor_lessorRepPage.checkConfirmApprovalButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_472_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Verify the (تأكيد الموافقة على الطلب) button is enabled/clickable");
        app.changeLessor_lessorRepPage.checkConfirmApprovalButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_473_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on (تأكيد الموافقة على الطلب) button");
        app.changeLessor_lessorRepPage.clickOnConfirmApprovalButton();
        logger.info("Step 13: Verify The user navigate to (التحقق من الهوية) page");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_474_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on (تأكيد الموافقة على الطلب) button");
        app.changeLessor_lessorRepPage.clickOnConfirmApprovalButton();
        logger.info("Step 13: Click on (إلغاء) button");
        app.sendContractForApprovalPage.verifyIdentityVerificationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Verify the user navigate back to (الإقرار وتأكيد الموافقة) section");
        app.changeLessor_lessorRepPage.checkDeclarationAndConfirmationSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_475_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Id"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("RequestNumber"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on (الموافقة على طلب التغيير)  option");
        CommonMethodsPage.ClickOnKebabMenuOption("الموافقة على طلب التغيير");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkReviewChangeRequestSectionIsDisplayed();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 09: Click on (تأكيد) button");
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 10: Click on (التالي) button");
        app.changeLessor_lessorRepPage.checkIBANInfoSectionIsDisplayed();
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (أقر بالموافقة على المذكور أعلاه) checkbox");
        app.sendContractForApprovalPage.clickOnAgreeToTheAboveCheckbox();
        logger.info("Step 12: Click on (تأكيد الموافقة على الطلب) button");
        app.changeLessor_lessorRepPage.clickOnConfirmApprovalButton();
        logger.info("Step 13: Enter OTP number");
        app.sendContractForApprovalPage.enterVerificationCode(data.get("OTP"));
        logger.info("Step 14: Click on  (التحقق من الهوية) button");
        app.sendContractForApprovalPage.clickOnIdentityVerificationButton();
        logger.info("Step 15: Verify the user navigate to (تم تغيير المؤجر/ممثل المؤجر بنجاح) page");
        app.changeLessor_lessorRepPage.checkLessorLessorRepChangedSuccessfullyMessageIsDisplayed();
    }


    /**
     * Verify from ownership document lessor has been changed (Approval required)
     * TC_476 to TC_480
     */
    @Test(dataProvider = "testDataProvider")
    public void TC_476_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify User is able to view (وثائق الملكية) page");
        app.changeLessor_lessorRepPage.verifyOwnerShipDocumentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_477_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("New_Deed_Number"));
        logger.info("Step 06: Verify the searched ownership document is displayed");
        app.changeLessor_lessorRepPage.verifySearchedOwnershipDocumentIsDisplayed(data.get("New_Deed_Number"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_478_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("New_Deed_Number"));
        logger.info("Step 06: Click on kebab button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \" عرض وثيقة الملكية\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض وثيقة الملكية");
        logger.info("Step 08: Verify the user is navigated to \"إدارة مستند الملكية\" page");
        app.changeLessor_lessorRepPage.checkManageOwnershipDocumentPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_479_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("New_Deed_Number"));
        logger.info("Step 06: Click on kebab button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \" عرض وثيقة الملكية\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض وثيقة الملكية");
        logger.info("Step 08: Click on kebab button for lessor");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        app.changeLessor_lessorRepPage.clickOnLessorKebabButton();
        logger.info("Step 09: Click on (تعديل) button");
        app.changeLessor_lessorRepPage.clickOnLessorRepEditButton();
        logger.info("Step 10: Verify User is navigate to \"إضافة مالك فرد\" page ");
        app.changeLessor_lessorRepPage.checkAddAnIndividualPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_480_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        app.changeLessor_lessorRepPage.enterOwnerShipDocumentNumberInSearchField(data.get("New_Deed_Number"));
        logger.info("Step 06: Click on kebab button");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Select \" عرض وثيقة الملكية\" option from the menu");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض وثيقة الملكية");
        logger.info("Step 08: Click on kebab button for lessor");
        Browser.waitUntilInvisibilityOfElement(AddResidentialContractPageObjects.LoadingIcon(), 100);
        app.changeLessor_lessorRepPage.clickOnLessorKebabButton();
        logger.info("Step 09: Click on (تعديل) button");
        app.changeLessor_lessorRepPage.clickOnLessorRepEditButton();
        logger.info("Step 10: Verify the (رقم الهوية الوطنية) is same as it was added ");
        app.changeLessor_lessorRepPage.verifyTheNationalIDSameAsDisplayed(data.get("Lessor_Id"));
    }

    /**
     * Verify the old invoice has been closed and invoice is opened for any contract registered under the ownership document that went through Change Lessor action (Approval is required)
     * TC_481 to TC_484
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_481_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Verify the user is able to view  (الفواتير) page");
        CommonMethodsPage.verifyContractsInvoicesIsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_482_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("Contract_Number_changeLessor"));
        logger.info("Step 06: Verify user is able to view all the invoices of selected contract");
        CommonMethodsPage.verifySearchedContractIsDisplayedForInvoices(data.get("Contract_Number_changeLessor"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_483_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("Contract_Number_changeLessor"));
        logger.info("Step 06: Verify old invoice has a status مغلقة");
        CommonMethodsPage.verifyInvoiceStatus("old", "مغلقة", CommonMethodsPageObjects.OldInvoiceStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_484_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number");
        CommonMethodsPage.enterContractNumber(data.get("Contract_Number_changeLessor"));
        logger.info("Step 06: Click on new invoice");
        CommonMethodsPage.clickOnNewInvoice();
        logger.info("Step 07: Verify new invoice has a status  لم يتم الدفع  ");
        CommonMethodsPage.verifyInvoiceStatus("new", "لم يتم الدفع", CommonMethodsPageObjects.NewInvoiceStatus());
    }

    /**
     * Verify from one the contract the minor version is changed after change Lessor  (Approval required)
     * TC_485 to TC_489
     */
    @Test(dataProvider = "testDataProvider")
    public void TC_485_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_486_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_changeLessor"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("Contract_Number_changeLessor"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_487_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_changeLessor"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Verify the User is navigated to contract");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_488_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_changeLessor"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        logger.info("Step 08: Verify contract file has been downloaded");
        CommonMethodsPage.verifyNewTabIsOpened();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_489_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("Contract_Number_changeLessor"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.ClickOnKebabMenuOption("عرض العقد");
        logger.info("Step 07: Click on  (تحميل نسخة العقد) button");
        CommonMethodsPage.clickOnDownloadContractCopy();
        CommonMethodsPage.verifyNewTabIsOpened();
        logger.info("Step 08: Verify contract version has been changed");
        app.changeLessor_lessorRepPage.getContractVersionChangeLessor();
    }
}
