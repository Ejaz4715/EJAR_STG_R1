package sa.ejar.web.login;


import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.CommonMethodsPageObjects;
import sa.ejar.web.pages.CommonMethodsPage;

import java.util.Map;

import static com.testcrew.base.WebBaseTest.logger;

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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify (إنهاء العقد) option is displayed");
        CommonMethodsPage.TerminateOptions(" إنهاء العقد  ");

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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.errorMessage("أقصى قيمة هي", CommonMethodsPageObjects.maxValueError());
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.errorMessage("أدنى قيمة هي", CommonMethodsPageObjects.minValueError());

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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.errorMessage("أقصى قيمة هي", CommonMethodsPageObjects.maxValueError());
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.errorMessage("أقصى قيمة هي", CommonMethodsPageObjects.maxValueError());
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.verifyHijriDateIsDisplayed();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnCancelButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 14: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 15:Verify the pop up window is displayed with title (تم تقديم طلب الإنهاء)");
        app.terminateContractPage.verifyTheTerminationRequestSuccessfullySend();
        app.terminateContractPage.verifyTheRequestWaitingForApproval("سننتظر موافقة أطراف الإيجار المستأجر والمؤجر لإعلامك بحالة الموافقة.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_45_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 14: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 15: Click on (إغلاق) button");
        CommonMethodsPage.getReqNumBo();
        CommonMethodsPage.clickOnCloseButton();
        logger.info("Step 16:User should be able to see (الطلبات) page after (إغلاق) button is clicked");
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
        app.terminateContractPage.assertRequestsAreAppearing();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify (إنهاء العقد) option is displayed");
        CommonMethodsPage.TerminateOptions(" إنهاء العقد  ");

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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: The User remains in the same page (طلب الإنهاء)");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The (قيمة الدفع) input field generates and error messages: أقصى قيمة هي ");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_Payment_Amount"));
        CommonMethodsPage.errorMessage("أقصى قيمة هي", CommonMethodsPageObjects.maxValueError());
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The تاريخ الاستحقاق input field generates and error messages:  أدنى قيمة هي ");
        String date = CommonMethodsPage.getCurrentDate(-2, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.errorMessage("أدنى قيمة هي", CommonMethodsPageObjects.minValueError());
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The تاريخ الاستحقاق input field generates and error messages:  أقصى قيمة هي ");
        String date = CommonMethodsPage.getCurrentDate(2, 1, 1);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.errorMessage("أقصى قيمة هي", CommonMethodsPageObjects.maxValueError());
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (لدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Enter a Gregorian date in (تاريخ الاستحقاق) more than (التاريخ المطلوب لإنهاء العقد) within limit 1 month");
        String date = CommonMethodsPage.getCurrentDate(0, 1, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 14: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 13: Equivalent Hijri date is displayed");
        CommonMethodsPage.verifyHijriDateIsDisplayed();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Enter Invalid The (قيمة الدفع) and (تاريخ الاستحقاق)");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 13:Verify the (التالي) button is enabled/clickable and the (ملخص الإنهاء) section is displayed");
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
    public void TC_86_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 13: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 13: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 14:Verify the pop up window is displayed with title (تم تقديم طلب الإنهاء)");
        app.terminateContractPage.verifyTheTerminationRequestSuccessfullySend();
        app.terminateContractPage.verifyTheRequestWaitingForApproval("سننتظر موافقة أطراف الإيجار المستأجر والمؤجر لإعلامك بحالة الموافقة.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_90_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 13: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 14: Click on (إغلاق) button");
        CommonMethodsPage.getReqNumLessor();
        CommonMethodsPage.clickOnCloseButton();
        logger.info("Step 15:User should be able to see (الطلبات) page after (إغلاق) button is clicked");
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
        app.terminateContractPage.assertRequestsAreAppearing();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify (إنهاء العقد) option is displayed");
        CommonMethodsPage.TerminateOptions(" إنهاء العقد  ");

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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
    public void TC_102_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        CommonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        CommonMethodsPage.clickOnNextButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 11: The User remains in the same page (طلب الإنهاء)");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The (قيمة الدفع) input field generates and error messages: أقصى قيمة هي ");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_Payment_Amount"));
        CommonMethodsPage.errorMessage("أقصى قيمة هي", CommonMethodsPageObjects.maxValueError());
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The تاريخ الاستحقاق input field generates and error messages:  أدنى قيمة هي ");
        String date = CommonMethodsPage.getCurrentDate(-2, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.errorMessage("أدنى قيمة هي", CommonMethodsPageObjects.minValueError());
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: The تاريخ الاستحقاق input field generates and error messages:  أقصى قيمة هي ");
        String date = CommonMethodsPage.getCurrentDate(2, 1, 1);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.errorMessage("أقصى قيمة هي", CommonMethodsPageObjects.maxValueError());
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (لدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Enter a Gregorian date in (تاريخ الاستحقاق) more than (التاريخ المطلوب لإنهاء العقد) within limit 1 month");
        String date = CommonMethodsPage.getCurrentDate(0, 1, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 13: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 14: Click on  (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: User able to enter valid date same as current date");
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 13: Equivalent Hijri date is displayed");
        CommonMethodsPage.verifyHijriDateIsDisplayed();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 12: Enter Invalid The (قيمة الدفع) and (تاريخ الاستحقاق)");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        String date = CommonMethodsPage.getCurrentDate(0, 0, 0);
        app.terminateContractPage.enterPaymentDueDate(date);
        logger.info("Step 13:Verify the (التالي) button is enabled/clickable and the (ملخص الإنهاء) section is displayed");
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on  (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
        logger.info("Step 13: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        CommonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
    public void TC_131_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 13: Click on (إلغاء) button");
        CommonMethodsPage.clickOnCancelButton();
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
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 13: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 14:Verify the pop up window is displayed with title (تم تقديم طلب الإنهاء)");
        app.terminateContractPage.verifyTheTerminationRequestSuccessfullySend();
        app.terminateContractPage.verifyTheRequestWaitingForApproval("سننتظر موافقة أطراف الإيجار المستأجر والمؤجر لإعلامك بحالة الموافقة.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_135_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
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
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 11: Select The (تسوية جميع المدفوعات) radio button");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
        CommonMethodsPage.clickOnNextButton();
        logger.info("Step 12: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 13: Click on (تأكيد) button");
        CommonMethodsPage.clickOnConfirmButton();
        logger.info("Step 14: Click on (إغلاق) button");
        CommonMethodsPage.getReqNumTenant();
        CommonMethodsPage.clickOnCloseButton();
        logger.info("Step 15:User should be able to see (الطلبات) page after (إغلاق) button is clicked");
        app.terminateContractPage.verifyTheRequestsIsDisplayed();
        app.terminateContractPage.assertRequestsAreAppearing();

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
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Verify the (الطلبات) page is displayed");
        app.terminateContractPage.verifyTheRequestsIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_137_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("Request_Number"));
        logger.info("Step 06: Verify searched request number is appearing");
        CommonMethodsPage.verifySearchedRequestIsDisplayed(data.get("Request_Number"));
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_138_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on الطلبات tab");
        CommonMethodsPage.clickOnTheRequestsTabButton();
        logger.info("Step 03: Click on (عرض جميع الطلبات)");
        CommonMethodsPage.clickOnViewAllRequestsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter request number in the request number search");
        CommonMethodsPage.enterRequestNumberInRequestSearchInputField(data.get("Request_Number"));
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 06: Click on  ( الموافقة على الإنهاء )  option");
        CommonMethodsPage.ClickOnAcceptTerminateOption("الموافقة على الإنهاء");

    }
}