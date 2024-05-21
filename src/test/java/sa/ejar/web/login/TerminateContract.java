package sa.ejar.web.login;


import com.testcrew.manager.TestDataManager;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

public class TerminateContract extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void TC_01_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مدير مكتب وساطة");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify (إنهاء العقد) option is displayed");
        CommonMethodsPage.TerminateOptions("إنهاء العقد");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        logger.info("Step 08: The  (خطوات طلب إنهاء العقد) page is displayed");
        app.terminateContractPage.verifyTerminationStepsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkTheContractsPage();
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectRequestingParty();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التاريخ المطلوب لإنهاء العقد) icon button");
        app.terminateContractPage.clickOnRequiredTerminationDateIconButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectTerminationReason();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 08: User moves to previous page (خطوات طلب إنهاء العقد)");
        app.terminateContractPage.verifyTerminationStepsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 09: The User remains in the same page (طلب الإنهاء)");
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 09: The User navigate back to (العقود) page");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Pop up window is displayed with title (رسالة تأكيد)");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: The User remains in the same page (طلب الإنهاء)");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: User moves to next section of (تسوية مالية)");
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: The (تسوية جميع المدفوعات) radio button is clicked and selected");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: The (الدفعة النهائية للمستأجر) radio button is clicked and selected");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: Valid amount has been entered successfully in  ( الدفعة النهائية للمستأجر) input field");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: The (قيمة الدفع) input field generates and error messages: أقصى قيمة هي ");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_Payment_Amount"));
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: The (الإجمالي) amount is same as entered by the bo manager");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        CommonMethodsPage.totalAmount(data.get("Valid_Payment_Amount"), CommonMethodsPageObjects.totalAmount());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: The تاريخ الاستحقاق input field generates and error messages:  أدنى قيمة هي ");
        String date = CommonMethodsPage.getCurrentDate(-2, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.errorMessage("أدنى", CommonMethodsPageObjects.minValueError());

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: The تاريخ الاستحقاق input field generates and error messages:  أقصى قيمة هي ");
        String date = CommonMethodsPage.getCurrentDate(2, 1, 1);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (لدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: The (قيمة الدفع) input field generates and error messages: أقصى قيمة هي ");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_Payment_Amount"));
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_27_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: Verify Calender icon is clickable & displays the Calender pop up after getting clicked");
        app.terminateContractPage.clickOnRequiredTerminationDateIconButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 14: Equivalent Hijri date is displayed");
        CommonMethodsPage.verifyEquivalentDateIsDisplayed("hijri");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: The (التالي) button is not enabled/clickable");
        CommonMethodsPage.verifyTheNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: Enter Invalid The (قيمة الدفع) and (تاريخ الاستحقاق)");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_Payment_Amount"));
        String date = CommonMethodsPage.getCurrentDate(2, 1, 1);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 14: Verify the (التالي) button is not enabled/clickable");
        CommonMethodsPage.verifyTheNextButtonIsDisabled();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_31_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: Enter Invalid The (قيمة الدفع) and (تاريخ الاستحقاق)");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 14:Verify the (التالي) button is enabled/clickable and the (ملخص الإنهاء) section is displayed");
        CommonMethodsPage.verifyNextButtonIsEnabled();
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Verify the (التالي) button is not enabled/clickable. User should not be able to continue to next page");
        CommonMethodsPage.verifyTheNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_33_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Click on  (السابق) button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 13: Verify the user moves to previous section (تفاصيل الإنهاء)");
        app.terminateContractPage.verifyTheTerminationDetailsSectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_34_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_35_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: The User remains in the same section (تسوية مالية)");
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 14: The User navigate back to (العقود) page");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_37_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Verify The (ملخص الإنهاء) is displayed");
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_38_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  (السابق) button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 14: User moves to previous section (تسوية مالية)");
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_39_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_40_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 15: The User remains in the same section (ملخص الإنهاء)");
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_41_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 15: The User navigate back to (العقود) page");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_42_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 14: Pop up window is displayed with title (رسالة تأكيد)");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_43_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 14: Click on (إلغاء) button");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
        CommonMethodsPage.clickOnCancelPopUpButton();
        logger.info("Step 15: The User remains in the same section (ملخص الإنهاء)");
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_44_Terminate(Map<String, String> data) throws Exception {
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
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 14: Click on (تأكيد) button");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 15:Verify the pop up window is displayed with title (تم تقديم طلب الإنهاء)");
        app.terminateContractPage.verifyTheTerminationRequestSuccessfullySend();
        app.terminateContractPage.verifyTheRequestWaitingForApproval("سننتظر موافقة أطراف الإيجار المستأجر والمؤجر لإعلامك بحالة الموافقة.");
        logger.info("Step 16: Click on (إغلاق) button");
        CommonMethodsPage.getReqNumBo();
        CommonMethodsPage.clickOnCloseButton();
        logger.info("Step 17:User should be able to see (الطلبات) page after (إغلاق) button is clicked");
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_45_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مشرف إيجار");
        logger.info("Step 02: Click on \"  الطلبات  \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter the request number in request search field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_46_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_47_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_48_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify (إنهاء العقد) option is displayed");
        CommonMethodsPage.TerminateOptions("إنهاء العقد");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_49_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        logger.info("Step 08: The  (خطوات طلب إنهاء العقد) page is displayed");
        app.terminateContractPage.verifyTerminationStepsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_50_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_51_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkTheContractsPage();
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_52_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify the user not able to select (الطرف الطالب للإنهاء)");
        app.terminateContractPage.verifyTheRequestingPartyIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_53_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التاريخ المطلوب لإنهاء العقد) icon button");
        app.terminateContractPage.clickOnRequiredTerminationDateIconButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_54_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectTerminationReason();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_55_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_56_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 08: User moves to previous page (خطوات طلب إنهاء العقد)");
        app.terminateContractPage.verifyTerminationStepsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_57_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_58_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 09: The User remains in the same page (طلب الإنهاء)");
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_59_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 09: The User navigate back to (العقود) page");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_60_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Pop up window is displayed with title (رسالة تأكيد)");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_61_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إلغاء) button");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
        CommonMethodsPage.clickOnCancelPopUpButton();
        logger.info("Step 11: The User remains in the same page (طلب الإنهاء)");
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_62_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: User moves to next section of (تسوية مالية)");
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_63_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: The (تسوية جميع المدفوعات) radio button is clicked and selected");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_64_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: The (الدفعة النهائية للمستأجر) radio button is clicked and selected");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_65_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Valid amount has been entered successfully in  ( الدفعة النهائية للمستأجر) input field");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_66_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The (قيمة الدفع) input field generates and error messages: أقصى قيمة هي ");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_Payment_Amount"));
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_67_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The (الإجمالي) amount is same as entered by the bo manager");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        CommonMethodsPage.totalAmount(data.get("Valid_Payment_Amount"), CommonMethodsPageObjects.totalAmount());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_68_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The تاريخ الاستحقاق input field generates and error messages:  أدنى قيمة هي ");
        String date = CommonMethodsPage.getCurrentDate(-2, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.errorMessage("أدنى", CommonMethodsPageObjects.minValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_69_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The تاريخ الاستحقاق input field generates and error messages:  أقصى قيمة هي ");
        String date = CommonMethodsPage.getCurrentDate(2, 1, 1);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_70_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_71_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (لدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Enter a Gregorian date in (تاريخ الاستحقاق) more than (التاريخ المطلوب لإنهاء العقد) within limit 1 month");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        String date = CommonMethodsPage.getCurrentDate(0, 1, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 14: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 15: Verify the error message (يجب أن يكون تاريخ الاستحقاق الدفع قبل تاريخ السريان)");
        app.terminateContractPage.verifyThePaymentDateErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_72_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Verify Calender icon is clickable & displays the Calender pop up after getting clicked");
        app.terminateContractPage.clickOnRequiredTerminationDateIconButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_73_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 13: Equivalent Hijri date is displayed");
        CommonMethodsPage.verifyEquivalentDateIsDisplayed("hijri");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_74_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The (التالي) button is not enabled/clickable");
        CommonMethodsPage.verifyTheNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_75_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Enter Invalid The (قيمة الدفع) and (تاريخ الاستحقاق)");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_Payment_Amount"));
        String date = CommonMethodsPage.getCurrentDate(2, 1, 1);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 13: Verify the (التالي) button is not enabled/clickable");
        CommonMethodsPage.verifyTheNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_76_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Enter Invalid The (قيمة الدفع) and (تاريخ الاستحقاق)");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 13:Verify the (التالي) button is enabled/clickable and the (ملخص الإنهاء) section is displayed");
        CommonMethodsPage.verifyNextButtonIsEnabled();
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_77_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Verify the (التالي) button is not enabled/clickable. User should not be able to continue to next page");
        CommonMethodsPage.verifyTheNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_78_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Click on  (السابق) button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 12: Verify the user moves to previous section (تفاصيل الإنهاء)");
        app.terminateContractPage.verifyTheTerminationDetailsSectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_79_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_80_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: The User remains in the same section (تسوية مالية)");
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_81_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: The User navigate back to (العقود) page");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_82_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify The (ملخص الإنهاء) is displayed");
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_83_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on  (السابق) button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 13: User moves to previous section (تسوية مالية)");
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_84_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_85_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 12: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 15: The User remains in the same section (ملخص الإنهاء)");
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_86_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 14: The User navigate back to (العقود) page");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_87_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 13: Pop up window is displayed with title (رسالة تأكيد)");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_88_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 13: Click on (إلغاء) button");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
        CommonMethodsPage.clickOnCancelPopUpButton();
        logger.info("Step 14: The User remains in the same section (ملخص الإنهاء)");
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_89_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 13: Click on (تأكيد) button");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 14:Verify the pop up window is displayed with title (تم تقديم طلب الإنهاء)");
        app.terminateContractPage.verifyTheTerminationRequestSuccessfullySend();
        app.terminateContractPage.verifyTheRequestWaitingForApproval("سننتظر موافقة أطراف الإيجار المستأجر والمؤجر لإعلامك بحالة الموافقة.");
        logger.info("Step 15: Click on (إغلاق) button");
        CommonMethodsPage.getReqNumLessor();
        CommonMethodsPage.clickOnCloseButton();
        logger.info("Step 16:User should be able to see (الطلبات) page after (إغلاق) button is clicked");
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_90_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on \"  الطلبات  \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter the request number in request search field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumLessor"));
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_91_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_92_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify searched contract is appearing");
        CommonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_93_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify (إنهاء العقد) option is displayed");
        CommonMethodsPage.TerminateOptions("إنهاء العقد");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_94_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        logger.info("Step 08: The  (خطوات طلب إنهاء العقد) page is displayed");
        app.terminateContractPage.verifyTerminationStepsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_95_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_96_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnCancelButton();
        CommonMethodsPage.checkTheContractsPage();
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_97_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify the user not able to select (الطرف الطالب للإنهاء)");
        app.terminateContractPage.verifyTheRequestingPartyIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_98_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التاريخ المطلوب لإنهاء العقد) icon button");
        app.terminateContractPage.clickOnRequiredTerminationDateIconButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_99_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectTerminationReason();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_100_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_101_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 08: User moves to previous page (خطوات طلب إنهاء العقد)");
        app.terminateContractPage.verifyTerminationStepsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_102_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_103_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 09: The User remains in the same page (طلب الإنهاء)");
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_104_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 09: The User navigate back to (العقود) page");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_105_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Pop up window is displayed with title (رسالة تأكيد)");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_106_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelPopUpButton();
        logger.info("Step 11: The User remains in the same page (طلب الإنهاء)");
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_107_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: User moves to next section of (تسوية مالية)");
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_108_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: The (تسوية جميع المدفوعات) radio button is clicked and selected");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_109_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: The (الدفعة النهائية للمستأجر) radio button is clicked and selected");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_110_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Valid amount has been entered successfully in  ( الدفعة النهائية للمستأجر) input field");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_111_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The (قيمة الدفع) input field generates and error messages: أقصى قيمة هي ");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_Payment_Amount"));
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_112_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The (الإجمالي) amount is same as entered by the bo manager");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        CommonMethodsPage.totalAmount(data.get("Valid_Payment_Amount"), CommonMethodsPageObjects.totalAmount());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_113_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The تاريخ الاستحقاق input field generates and error messages:  أدنى قيمة هي ");
        String date = CommonMethodsPage.getCurrentDate(-2, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.errorMessage("أدنى", CommonMethodsPageObjects.minValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_114_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The تاريخ الاستحقاق input field generates and error messages:  أقصى قيمة هي ");
        String date = CommonMethodsPage.getCurrentDate(2, 1, 1);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.errorMessage("أقصى", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_115_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_116_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (لدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Enter a Gregorian date in (تاريخ الاستحقاق) more than (التاريخ المطلوب لإنهاء العقد) within limit 1 month");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        String date = CommonMethodsPage.getCurrentDate(0, 1, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 14: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 15: Verify the error message (يجب أن يكون تاريخ الاستحقاق الدفع قبل تاريخ السريان)");
        app.terminateContractPage.verifyThePaymentDateErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_117_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Verify Calender icon is clickable & displays the Calender pop up after getting clicked");
        app.terminateContractPage.clickOnRequiredTerminationDateIconButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_118_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 13: Equivalent Hijri date is displayed");
        CommonMethodsPage.verifyEquivalentDateIsDisplayed("hijri");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_119_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The (التالي) button is not enabled/clickable");
        CommonMethodsPage.verifyTheNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_120_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Enter Invalid The (قيمة الدفع) and (تاريخ الاستحقاق)");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_Payment_Amount"));
        String date = CommonMethodsPage.getCurrentDate(2, 1, 1);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 13: Verify the (التالي) button is not enabled/clickable");
        CommonMethodsPage.verifyTheNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_121_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Enter Invalid The (قيمة الدفع) and (تاريخ الاستحقاق)");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 13:Verify the (التالي) button is enabled/clickable and the (ملخص الإنهاء) section is displayed");
        CommonMethodsPage.verifyNextButtonIsEnabled();
        CommonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_122_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Verify the (التالي) button is not enabled/clickable. User should not be able to continue to next page");
        CommonMethodsPage.verifyTheNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_123_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Click on  (السابق) button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 12: Verify the user moves to previous section (تفاصيل الإنهاء)");
        app.terminateContractPage.verifyTheTerminationDetailsSectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_124_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_125_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: The User remains in the same section (تسوية مالية)");
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_126_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 13: The User navigate back to (العقود) page");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_127_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Verify The (ملخص الإنهاء) is displayed");
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_128_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on  (السابق) button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 13: User moves to previous section (تسوية مالية)");
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_129_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_130_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 12: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 14: Click on  (إلغاء)  of pup up alert window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 15: The User remains in the same section (ملخص الإنهاء)");
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_131_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Click on  (تأكيد)  of pup up alert window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 14: The User navigate back to (العقود) page");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_132_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 13: Pop up window is displayed with title (رسالة تأكيد)");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_133_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 13: Click on (إلغاء) button");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
        CommonMethodsPage.clickOnCancelPopUpButton();
        logger.info("Step 14: The User remains in the same section (ملخص الإنهاء)");
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_134_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 09: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 10: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 13: Click on (تأكيد) button");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
        CommonMethodsPage.clickOnConfirmPopUpButton();
        logger.info("Step 14:Verify the pop up window is displayed with title (تم تقديم طلب الإنهاء)");
        app.terminateContractPage.verifyTheTerminationRequestSuccessfullySend();
        app.terminateContractPage.verifyTheRequestWaitingForApproval("سننتظر موافقة أطراف الإيجار المستأجر والمؤجر لإعلامك بحالة الموافقة.");
        logger.info("Step 15: Click on (إغلاق) button");
        CommonMethodsPage.getReqNumTenant();
        CommonMethodsPage.clickOnCloseButton();
        logger.info("Step 16:User should be able to see (الطلبات) page after (إغلاق) button is clicked");
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_135_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on \"  الطلبات  \" tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on \"عرض الطلبات\"");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter the request number in request search field ");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumTenant"));
        CommonMethodsPage.checkRequestStatus("قيد الانتظار");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_136_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
    public void TC_137_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        logger.info("Step 06: Verify searched request number is appearing");
        CommonMethodsPage.verifySearchedRequestIsDisplayed(data.get("ReqNumBo"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_138_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Verify ( خطوات الموافقة على إنهاء العقد )  page");
        app.terminateContractPage.verifyTerminationApprovalStepsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_139_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Verify the user navigate to the (العقود) page");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_140_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify the user navigate to the (مراجعة العقد) page");
        CommonMethodsPage.verifyReviewTheContractPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_141_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (السابق) button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 09: Verify the user navigate to previous the (خطوات الموافقة على إنهاء العقد) page");
        app.terminateContractPage.verifyTerminationApprovalStepsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_142_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 09: Verify the user navigate to the (الموافقة على إخلاء المسؤولية) page");
        app.terminateContractPage.verifyApproveDisclaimerPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_143_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 09: Click on (إرسال الموافقة على الإنهاء) button");
        app.terminateContractPage.clickOnSubmitTerminationApprovalButton();
        logger.info("Step 10: Verify the user navigate to the (تم إرسال الموافقة) page");
        app.terminateContractPage.verifyApprovalSubmittedMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_144_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumTenant"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Verify the user navigate to the (لماذا تريد الرفض؟) page");
        CommonMethodsPage.verifyRejectReasonPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_145_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumTenant"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Verify the (لماذا تريد الرفض؟) radio buttons are selected and the (رفض الإنهاء) is enabled");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        app.terminateContractPage.verifyRejectTerminationButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_146_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumTenant"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Verify the (رفض الإنهاء) button is disabled/not clickable");
        app.terminateContractPage.verifyRejectTerminationButtonIsDisabled();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_147_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumTenant"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Verify the user able to enter text on (السبب) textarea ");
        CommonMethodsPage.enterRejectionReasonNote(data.get("Rejection_Reason"));
        CommonMethodsPage.verifyRejectionReasonNoteHasBeenEntered(data.get("Rejection_Reason"));

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_148_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumTenant"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Verify pop up window is displayed with message \"سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.\"");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_149_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumTenant"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on (إلغاء) button of pop up window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11:Verify the user remains in the (لماذا تريد الرفض؟) page ");
        CommonMethodsPage.verifyRejectReasonPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_150_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumTenant"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on (تأكيد) button of pop up window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11:Verify the user should be able to see Contracts page after (تأكيد) button is clicked");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_151_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
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
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumTenant"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Select and Enter any reason");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        CommonMethodsPage.enterRejectionReasonNote(data.get("Rejection_Reason"));
        logger.info("Step 10: Click on (رفض الإنهاء) button");
        app.terminateContractPage.clickOnRejectTerminationButton();
        logger.info("Step 11: Verify the user navigate to the (تم تقديم الرفض) page");
        CommonMethodsPage.verifyRejectionSubmittedPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_152_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Verify the (الطلبات) page is displayed");
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_153_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        logger.info("Step 06: Verify searched request number is appearing");
        CommonMethodsPage.verifySearchedRequestIsDisplayed(data.get("ReqNumBo"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_154_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Verify ( خطوات الموافقة على إنهاء العقد )  page");
        app.terminateContractPage.verifyTerminationApprovalStepsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_155_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Verify the user navigate to the (العقود) page");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_156_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Verify the user navigate to the (مراجعة العقد) page");
        CommonMethodsPage.verifyReviewTheContractPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_157_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (السابق) button");
        CommonMethodsPage.clickOnBackButton();
        logger.info("Step 09: Verify the user navigate to previous the (خطوات الموافقة على إنهاء العقد) page");
        app.terminateContractPage.verifyTerminationApprovalStepsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_158_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 09: Verify the user navigate to the (الموافقة على إخلاء المسؤولية) page");
        app.terminateContractPage.verifyApproveDisclaimerPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_159_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumBo"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 09: Click on (إرسال الموافقة على الإنهاء) button");
        app.terminateContractPage.clickOnSubmitTerminationApprovalButton();
        logger.info("Step 10: Verify the user navigate to the (تم إرسال الموافقة) page");
        app.terminateContractPage.verifyApprovalSubmittedMessageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_160_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumLessor"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Verify the user navigate to the (لماذا تريد الرفض؟) page");
        CommonMethodsPage.verifyRejectReasonPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_161_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumLessor"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Verify the (لماذا تريد الرفض؟) radio buttons are selected and the (رفض الإنهاء) is enabled");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        app.terminateContractPage.verifyRejectTerminationButtonIsEnabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_162_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumLessor"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Verify the (رفض الإنهاء) button is disabled/not clickable");
        app.terminateContractPage.verifyRejectTerminationButtonIsDisabled();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_163_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumLessor"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Verify the user able to enter text on (السبب) textarea ");
        CommonMethodsPage.enterRejectionReasonNote(data.get("Rejection_Reason"));
        CommonMethodsPage.verifyRejectionReasonNoteHasBeenEntered(data.get("Rejection_Reason"));

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_164_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumLessor"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Verify pop up window is displayed with message \"سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.\"");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed("سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_165_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumLessor"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on (إلغاء) button of pop up window");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11:Verify the user remains in the (لماذا تريد الرفض؟) page ");
        CommonMethodsPage.verifyRejectReasonPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_166_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumLessor"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 10: Click on (تأكيد) button of pop up window");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11:Verify the user should be able to see Contracts page after (تأكيد) button is clicked");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_167_Terminate(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Terminate"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("ReqNumLessor"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");
        logger.info("Step 07: Click on (التالي) button");
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (رفض) button");
        CommonMethodsPage.clickOnRejectButton();
        logger.info("Step 09: Select and Enter any reason");
        CommonMethodsPage.clickRejectReasonRadioButtons();
        CommonMethodsPage.enterRejectionReasonNote(data.get("Rejection_Reason"));
        logger.info("Step 10: Click on (رفض الإنهاء) button");
        app.terminateContractPage.clickOnRejectTerminationButton();
        logger.info("Step 11: Verify the user navigate to the (تم تقديم الرفض) page");
        CommonMethodsPage.verifyRejectionSubmittedPageIsDisplayed();

    }


    @Test(dataProvider = "testDataProvider")
    public void TC_168_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on (المالية) tab");
        CommonMethodsPage.clickOnTheFinancialTabButton();
        logger.info("Step 03: Click on (عرض الفواتير) button");
        CommonMethodsPage.clickOnViewAllInvoicesButton();
        logger.info("Step 04: Verify the user is able to view  (الفواتير) page");
        CommonMethodsPage.verifyContractsInvoicesIsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_169_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
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
    public void TC_170_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
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
        logger.info("Step 07: Verify a new invoice having same amount");
        CommonMethodsPage.newAmountForContractInvoice(data.get("Valid_Payment_Amount"));
        
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_171_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
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
        logger.info("Step 07: Verify new invoice has same date as entered by lessor");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        CommonMethodsPage.verifyNewInvoiceDateIsSameAsEnteredInRequest(date);
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_172_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
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
    public void TC_173_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
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
}