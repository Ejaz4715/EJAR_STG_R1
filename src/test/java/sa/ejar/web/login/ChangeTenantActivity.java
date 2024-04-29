package sa.ejar.web.login;

import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class ChangeTenantActivity extends NHCWebTest {

    /**
     * Pre Conditions
     * -Create Contracts
     * -Approve from parties
     */



    /**
     * Submit Change Commercial Activity request
     * TC_01 to TC_
     * */
    @Test(dataProvider = "testDataProvider")
    public void TC_01_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        CommonMethodsPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Verify all the available contracts are displayed");
        CommonMethodsPage.assertContractsAreAppearing();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("WGAV74YE");
        app.changeTenantActivityPage.assertRequestDetails("WGAV74YE", "تغيير النشاط التجاري", "20612086537");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("WGAV74YEF");
        app.changeTenantActivityPage.assertInvalidRequest();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("6HTM38FF");
        app.changeTenantActivityPage.assertRequestDetails("6HTM38FF", "تغيير النشاط التجاري", "20254965397");
        logger.info("Step 06: Check request status");
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("6HTM38FF");
        logger.info("Step 06: From Status dropdown list, Select pending status");
        app.changeTenantActivityPage.selectStatus("قيد الانتظار");
        logger.info("Step 07: From Request Type dropdown list,Select Commercial Activity Change");
        app.changeTenantActivityPage.selectRequestType("تغيير النشاط التجاري");
        app.changeTenantActivityPage.assertRequestDetails("6HTM38FF", "تغيير النشاط التجاري", "20254965397");
        app.changeTenantActivityPage.assertCreatedDateAndIssuedByOnRequestDetails("سعود حمد بن حمد الراشد");
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("U6CCHZ8F");
        logger.info("Step 06: Check request status");
        app.changeTenantActivityPage.assertRequestDetails("U6CCHZ8F", "تغيير النشاط التجاري", "20026193644");
        CommonMethodsPage.checkRequestStatus("موافق عليه");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("8UG8HJV6");
        logger.info("Step 06: Check request status");
        app.changeTenantActivityPage.assertRequestDetails("8UG8HJV6", "تغيير النشاط التجاري", "20026193644");
        CommonMethodsPage.checkRequestStatus("مرفوض");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_31_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("WGAV74YEF");
        app.changeTenantActivityPage.assertInvalidRequest();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("6HTM38FF");
        app.changeTenantActivityPage.assertRequestDetails("6HTM38FF", "تغيير النشاط التجاري", "20254965397");
        logger.info("Step 06: Check request status");
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_33_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("6HTM38FF");
        app.changeTenantActivityPage.assertRequestDetails("6HTM38FF", "تغيير النشاط التجاري", "20254965397");
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_34_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("6HTM38FF");
        app.changeTenantActivityPage.assertRequestDetails("6HTM38FF", "تغيير النشاط التجاري", "20254965397");
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_35_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("6HTM38FF");
        app.changeTenantActivityPage.assertRequestDetails("6HTM38FF", "تغيير النشاط التجاري", "20254965397");
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Check Old Tenant Activity ( وصف نشاط المستأجر القديم ) details");
        app.changeTenantActivityPage.clickOnOldTenantActivity();
        app.changeTenantActivityPage.assertOldTenantDescriptionDetails("");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("6HTM38FF");
        app.changeTenantActivityPage.assertRequestDetails("6HTM38FF", "تغيير النشاط التجاري", "20254965397");
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: 9-Check New Tenant Activity ( وصف نشاط المستأجر الجديد ) details");
        app.changeTenantActivityPage.clickOnNewTenantActivity();
        app.changeTenantActivityPage.assertNewTenantDescriptionDetails("test");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_37_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("6HTM38FF");
        app.changeTenantActivityPage.assertRequestDetails("6HTM38FF", "تغيير النشاط التجاري", "20254965397");
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Click on Back ( السابق ) button");
        app.changeTenantActivityPage.clickBackButton();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_38_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("6HTM38FF");
        app.changeTenantActivityPage.assertRequestDetails("6HTM38FF", "تغيير النشاط التجاري", "20254965397");
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Scroll down to New Tenant Activity (وصف نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        app.changeTenantActivityPage.assertApproveTenantActivity();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_39_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("6HTM38FF");
        app.changeTenantActivityPage.assertRequestDetails("6HTM38FF", "تغيير النشاط التجاري", "20254965397");
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Scroll down to New Tenant Activity (وصف نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on Cancel ( إلغاء ) button");
        CommonMethodsPage.clickOnCancelButton();
        app.changeTenantActivityPage.assertReviewChangedTenantActivity();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_40_ChangeTenantActivity(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to ejar system with credentials");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on requests tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: From requests dropdown list Click on view requests");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in request code input field");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField("6HTM38FF");
        app.changeTenantActivityPage.assertRequestDetails("6HTM38FF", "تغيير النشاط التجاري", "20254965397");
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("step 07: Click on view request (عرض الطلب ) option");
        app.changeTenantActivityPage.clickOnViewRequestButton();
        logger.info("Step 08: Click on Start (لنبدأ) button");
        app.changeTenantActivityPage.clickOnLetsStartButton();
        logger.info("Step 09: Scroll down to New Tenant Activity (وصف نشاط المستأجر الجديد ) label");
        app.changeTenantActivityPage.scrollToNewTenantActivity();
        logger.info("Step 10: Click on Confirm ( تأكيد ) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Verify Submit Approval ( إرسال الموافقة ) button is not clickable");
       app.changeTenantActivityPage.verifySubmitApprovalButtonDisabled(true);
    }


}
