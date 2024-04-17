package sa.ejar.web.login;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.objects.CommonMethodsPageObjects;

import java.util.Map;

import static com.testcrew.base.WebBaseTest.logger;

public class TerminateContract extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void TC_01_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Verify searched contract is appearing");
        app.commonMethodsPage.verifySearchedContractIsDisplayed(data.get("ContractNumber"));

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Verify (إنهاء العقد) option is displayed");
        app.commonMethodsPage.TerminateOptions(" إنهاء العقد  ");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        logger.info("Step 08: The  (خطوات طلب إنهاء العقد) page is displayed");
        app.terminateContractPage.verifyTerminationStepsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnCancelButton();
        app.commonMethodsPage.checkTheContractsPage();
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectRequestingParty();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Click on (التاريخ المطلوب لإنهاء العقد) icon button");
        app.terminateContractPage.clickOnRequiredTerminationDateIconButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_09_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectTerminationReason();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        app.commonMethodsPage.clickOnBackButton();
        logger.info("Step 08: User moves to previous page (خطوات طلب إنهاء العقد)");
        app.terminateContractPage.verifyTerminationStepsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        app.commonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Pop Up Alert ( سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.) is displayed");
        app.commonMethodsPage.verifyPopUpAlertAfterCancelIsDisplayed(" سيتم فقدان كافة البيانات غير المحفوظة. يرجى التأكيد لتنفيذ هذا الإجراء.");

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        app.commonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Click on  (إلغاء)  of pup up alert window");
        app.commonMethodsPage.clickOnCancelButton();
        logger.info("Step 09: The User remains in the same page (طلب الإنهاء)");
        app.terminateContractPage.verifyTheRequestTerminationPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        app.commonMethodsPage.clickOnCancelButton();
        logger.info("Step 08: Click on  (تأكيد)  of pup up alert window");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 09: The User navigate back to (العقود) page");
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Pop up window is displayed with title (رسالة تأكيد)");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (إلغاء) button");
        app.commonMethodsPage.clickOnCancelButton();
        logger.info("Step 12: The User remains in the same page (طلب الإنهاء)");
        app.terminateContractPage.verifyTheConfirmationMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: User moves to next section of (تسوية مالية)");
        app.terminateContractPage.verifyTheFinancialSettlementSectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: The (تسوية جميع المدفوعات) radio button is clicked and selected");
        app.terminateContractPage.selectAllPaymentsSettledRadioButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_19_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: The (الدفعة النهائية للمستأجر) radio button is clicked and selected");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: Valid amount has been entered successfully in  ( الدفعة النهائية للمستأجر) input field");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_21_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: The (قيمة الدفع) input field generates and error messages: أقصى قيمة هي ");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_Payment_Amount"));
        app.commonMethodsPage.errorMessage("أقصى قيمة هي", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: The (الإجمالي) amount is same as entered by the bo manager");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        app.commonMethodsPage.totalAmount("ر.س", CommonMethodsPageObjects.totalAmount());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: The تاريخ الاستحقاق input field generates and error messages:  أدنى قيمة هي ");
        app.terminateContractPage.enterPaymentDueDate(data.get("Less_Than_Payment_Due_Date"));
        app.commonMethodsPage.errorMessage("أدنى قيمة هي", CommonMethodsPageObjects.minValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: The تاريخ الاستحقاق input field generates and error messages:  أقصى قيمة هي ");
        app.terminateContractPage.enterPaymentDueDate(data.get("More_Than_Payment_Due_Date"));
        app.commonMethodsPage.errorMessage("أقصى قيمة هي", CommonMethodsPageObjects.maxValueError());
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: User able to enter valid date same as current date");
        app.terminateContractPage.enterPaymentDueDate(data.get("Valid_Payment_Due_Date"));
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_26_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (لدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: Enter a Gregorian date in (تاريخ الاستحقاق) more than (التاريخ المطلوب لإنهاء العقد) within limit 1 month");
        app.terminateContractPage.enterPaymentDueDate(data.get("One_Month_Payment_Due_Date"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 14: Click on (تأكيد طلب الإنهاء) button");
        app.terminateContractPage.clickOnConfirmRequestTheTerminationButton();
        logger.info("Step 15: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 16: Verify the error message (يجب أن يكون تاريخ الاستحقاق الدفع قبل تاريخ السريان)");
        app.terminateContractPage.verifyThePaymentDateErrorMessageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_27_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: Verify Calender icon is clickable & displays the Calender pop up after getting clicked");
        app.terminateContractPage.clickOnRequiredTerminationDateIconButton();

    }

    @Test(dataProvider = "testDataProvider")
    public void TC_28_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: User able to enter valid date same as current date");
        app.terminateContractPage.enterPaymentDueDate(data.get("Valid_Payment_Due_Date"));
        logger.info("Step 14: Equivalent Hijri date is displayed");
        app.commonMethodsPage.verifyHijriDateIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: The (التالي) button is not enabled/clickable");
        app.commonMethodsPage.verifyTheNextButtonIsDisabled();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: Enter Invalid The (قيمة الدفع) and (تاريخ الاستحقاق)");
        app.terminateContractPage.enterPaymentAmount(data.get("Invalid_Payment_Amount"));
        app.terminateContractPage.enterPaymentDueDate(data.get("More_Than_Payment_Due_Date"));
        logger.info("Step 14: Verify the (التالي) button is not enabled/clickable");
        app.commonMethodsPage.verifyTheNextButtonIsDisabled();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_31_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Select The (الدفعة النهائية للمستأجر) radio button");
        app.terminateContractPage.selectTenantFinalPaymentRadioButton();
        logger.info("Step 13: Enter Invalid The (قيمة الدفع) and (تاريخ الاستحقاق)");
        app.terminateContractPage.enterPaymentAmount(data.get("Valid_Payment_Amount"));
        app.terminateContractPage.enterPaymentDueDate(data.get("Valid_Payment_Due_Date"));
        logger.info("Step 14:Verify the (التالي) button is enabled/clickable and the (ملخص الإنهاء) section is displayed");
        app.terminateContractPage.verifyTheTerminationSummarySectionIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_Terminate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        app.commonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        logger.info("Step 05: Enter contract number in the contract search");
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        app.commonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on  (إنهاء العقد)  option");
        app.commonMethodsPage.ClickOnTerminateOption("إنهاء العقد");
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 08: Select  (الطرف الطالب للإنهاء) Dropdown List");
        app.terminateContractPage.selectOneRequestingParty(data.get("Requesting_Party"));
        logger.info("Step 09: Select  (سبب الإنهاء) Dropdown List");
        app.terminateContractPage.selectOneTerminationReason(data.get("Termination_Reason"));
        logger.info("Step 10: Enter  (ملاحظات) textarea");
        app.terminateContractPage.enterTerminationReason(data.get("Note"));
        app.commonMethodsPage.clickOnNextButton();
        logger.info("Step 11: Click on  (تأكيد) button");
        app.commonMethodsPage.clickOnConfirmButton();
        logger.info("Step 12: Verify the (التالي) button is not enabled/clickable. User should not be able to continue to next page");
        app.commonMethodsPage.verifyTheNextButtonIsDisabled();
    }
}
