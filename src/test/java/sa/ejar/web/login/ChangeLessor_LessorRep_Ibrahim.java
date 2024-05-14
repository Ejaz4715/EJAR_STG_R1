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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        logger.info("Step 07: Verify the user navigate to (طلب إضافة ممثل المؤجر الجديد) page");
        app.changeLessor_lessorRepPage.checkRequestChangeCurrentLessorRepPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_88_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessor"));
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.changeLessor_lessorRepPage.checkContractsAndAgreementsSectionIsDisplayed();
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.loginPage.enterUsername(data.get("Lessor_Rep"));
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
        app.changeLessor_lessorRepPage.clickOnLessorRepKebabButton();
        logger.info("Step 09: Click on (تعديل) button");
        app.changeLessor_lessorRepPage.clickOnLessorRepEditButton();
        logger.info("Step 10: Verify the (رقم الهوية الوطنية) is same as it was added ");
        app.changeLessor_lessorRepPage.verifyTheNationalIDSameAsDisplayed(data.get("Lessor_Rep"));
    }

    /**
     * Verify the old invoice has been closed and invoice is opened for any contract registered under the ownership document that went through Add Lessor Representative action (Approval required)
     * TC_129 to TC_132
     */

    @Test(dataProvider = "testDataProvider")
    public void TC_129_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumber(data.get("ContractNumber"));
        logger.info("Step 06: Verify user is able to view all the invoices of selected contract");
        CommonMethodsPage.verifySearchedContractIsDisplayedForInvoices(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_131_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumber(data.get("ContractNumber"));
        logger.info("Step 06: Verify old invoice has a status مغلقة");
        CommonMethodsPage.verifyInvoiceStatus("old", "مغلقة", CommonMethodsPageObjects.OldInvoiceStatus());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_132_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumber(data.get("ContractNumber"));
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_135_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.KebabMenuOptions("عرض العقد");
        logger.info("Step 07: Verify the User is navigated to contract");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_136_ChangeLessor_LessorRep(Map<String, String> data) throws Exception {
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
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on kebab menu button > Click on view contract button");
        CommonMethodsPage.clickOnKebabMenuButton();
        CommonMethodsPage.KebabMenuOptions("عرض العقد");
        logger.info("Step 07: Verify the User is navigated to contract");
        app.sendContractForApprovalPage.verifyContractStepsPageIsDisplayed();
    }
}
