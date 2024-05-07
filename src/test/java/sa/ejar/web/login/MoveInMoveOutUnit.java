package sa.ejar.web.login;

import com.testcrew.web.Browser;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;
import java.util.Map;

public class MoveInMoveOutUnit extends NHCWebTest {

    //-------------------------- Move In , As-Lessor ---------------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_01_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on Yes, Good condition (نعم، بحالة جيدة) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_02_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_03_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_04_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_05_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        //logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        //logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        //CommonMethodsPage.changeUserRole("مستأجر");
        //logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        //logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
       // logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
       // logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
       // logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        //logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
//        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
//        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        //logger.info("Step 08: Note Text Area must be Displayed");
//        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        //logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
//        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        //logger.info("Step 10: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpg");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        app.moveInMoveOutUnitsPage.uploadFile("Test.mp4");
        Browser.waitForSeconds(20);
//        logger.info("Step 11: Verify attachment is uploaded");
//        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_06_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachments are uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentsAreUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_07_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        logger.info("Step 12: Delete Uploaded Document");
        app.moveInMoveOutUnitsPage.deleteUploadedFile();
        app.moveInMoveOutUnitsPage.verifyAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_08_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on Do it later button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_09_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on Do it later button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on إغلاق Button");
        CommonMethodsPage.clickOnCloseButton();
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_10_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on Do it later button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on السابق button");
        CommonMethodsPage.clickOnBackButton();
        app.moveInMoveOutUnitsPage.verifyReturnToUnitMoveInForm();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_11_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on التفاصيل button");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_12_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on التفاصيل button > Click on confirm Move In Unit");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
        app.moveInMoveOutUnitsPage.confirmMoveInUnit();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_13_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on نعم radio button > Click on إرسال button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_14_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on نعم radio button > Click on إرسال button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        CommonMethodsPage.clickOnSendBTN();
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 09: Search again with same contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 10: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 11: Click on ( عرض نموذج استلام/تسليم ) option > Check Unit move-in state As 'Lessor'");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        app.moveInMoveOutUnitsPage.verifyStatusOfMoveInUnit("نعم، بحالة جيدة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_15_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        CommonMethodsPage.clickOnSendBTN();
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 09: Search again with same contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 10: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 11: Click on ( عرض نموذج استلام/تسليم ) option > Check Unit move-in state As 'Lessor'");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        app.moveInMoveOutUnitsPage.verifyStatusOfMoveInUnit("لا، لم تكن بحالة جيدة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_16_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option > Check the Lessor waiting for Tenant response");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        app.moveInMoveOutUnitsPage.VerifyTenantResponse("في إنتظار رد المستأجر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_17_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option > Click on Display button to download the attachment");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        app.moveInMoveOutUnitsPage.clickOnDisplayBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_18_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option > Click on Display button to download the attachment");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        app.moveInMoveOutUnitsPage.clickOnDownloadBTN();
    }

    //-------------------------- Move In , As-Tenant ---------------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_19_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on Yes, Good condition (نعم، بحالة جيدة) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_20_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_21_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_22_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_23_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachments are uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentsAreUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_24_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        logger.info("Step 12: Delete Uploaded Document");
        app.moveInMoveOutUnitsPage.deleteUploadedFile();
        app.moveInMoveOutUnitsPage.verifyAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_25_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadFile("Image_Over_10_MB.jpg");
        logger.info("Step 11: Verify over size attachment is not allowed");
        app.moveInMoveOutUnitsPage.verifyAttachmentErrorMsg("حجم الملف أكبر من المسموح به.");
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_26_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload invalid an attachment with type (PDF)");
        app.moveInMoveOutUnitsPage.uploadFile("2024-04-25_09h59_52.mp4");
        logger.info("Step 11: Verify type of attachment is not allowed");
        app.moveInMoveOutUnitsPage.verifyAttachmentErrorMsg("غير مسموح به. أنواع الملفات القابلة للتحميل");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_27_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on Do it later button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_28_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on Do it later button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on إغلاق Button");
        CommonMethodsPage.clickOnCloseButton();
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_29_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on Do it later button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on السابق button");
        CommonMethodsPage.clickOnBackButton();
        app.moveInMoveOutUnitsPage.verifyReturnToUnitMoveInForm();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_30_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on التفاصيل button");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_31_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on التفاصيل button > Click on confirm Move In Unit");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
        app.moveInMoveOutUnitsPage.confirmMoveInUnit();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_32_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on نعم radio button > Click on إرسال button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_33_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on نعم radio button > Click on إرسال button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        CommonMethodsPage.clickOnSendBTN();
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 09: Search again with same contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 10: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 11: Click on ( عرض نموذج استلام/تسليم ) option > Check Unit move-in state As 'Tenant'");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        app.moveInMoveOutUnitsPage.verifyStatusOfMoveInUnit("نعم، بحالة جيدة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_34_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        CommonMethodsPage.clickOnSendBTN();
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 09: Search again with same contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 10: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 11: Click on ( عرض نموذج استلام/تسليم ) option > Check Unit move-in state As 'Tenant'");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        app.moveInMoveOutUnitsPage.verifyStatusOfMoveInUnit("لا، لم تكن بحالة جيدة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_35_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option > Check the Tenant waiting for Lessor response");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        app.moveInMoveOutUnitsPage.VerifyLessorResponse("في إنتظار رد المؤجر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_36_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option > Click on Display button to download the attachment");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        app.moveInMoveOutUnitsPage.clickOnDisplayBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_37_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option > Click on Display button to download the attachment");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        app.moveInMoveOutUnitsPage.clickOnDownloadBTN();
    }

    //-------------------------- Move Out , As-Lessor ---------------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_38_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on Yes, Good condition (نعم، بحالة جيدة) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_39_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_40_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_42_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_46_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_47_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachments are uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentsAreUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_48_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        logger.info("Step 12: Delete Uploaded Document");
        app.moveInMoveOutUnitsPage.deleteUploadedFile();
        app.moveInMoveOutUnitsPage.verifyAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_49_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.moveInMoveOutUnitsPage.uploadFile("Image_Over_10_MB.jpg");
        logger.info("Step 11: Verify over size attachment is not allowed");
        app.moveInMoveOutUnitsPage.verifyAttachmentErrorMsg("حجم الملف أكبر من المسموح به.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_50_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload invalid an attachment with type (PDF)");
        app.moveInMoveOutUnitsPage.uploadFile("2024-04-25_09h59_52.mp4");
        logger.info("Step 11: Verify type of attachment is not allowed");
        app.moveInMoveOutUnitsPage.verifyAttachmentErrorMsg("غير مسموح به. أنواع الملفات القابلة للتحميل");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_51_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on Do it later button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_52_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on Do it later button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on إغلاق Button");
        CommonMethodsPage.clickOnCloseButton();
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_53_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on Do it later button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on السابق button");
        CommonMethodsPage.clickOnBackButton();
        app.moveInMoveOutUnitsPage.verifyReturnToUnitMoveInForm();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_54_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on التفاصيل button");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_55_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مؤجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on التفاصيل button > Click on confirm Move Out Unit");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
        app.moveInMoveOutUnitsPage.confirmMoveInUnit();
    }

    //-------------------------- Move Out , As-Tenant ---------------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_62_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on Yes, Good condition (نعم، بحالة جيدة) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_63_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_64_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_65_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_66_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachments are uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentsAreUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_67_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 11: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        logger.info("Step 12: Delete Uploaded Document");
        app.moveInMoveOutUnitsPage.deleteUploadedFile();
        app.moveInMoveOutUnitsPage.verifyAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_68_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
        app.moveInMoveOutUnitsPage.uploadFile("Image_Over_10_MB.jpg");
        logger.info("Step 11: Verify over size attachment is not allowed");
        app.moveInMoveOutUnitsPage.verifyAttachmentErrorMsg("حجم الملف أكبر من المسموح به.");
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_69_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 08: Note Text Area must be Displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 09: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 10: Upload invalid an attachment with type (PDF)");
        app.moveInMoveOutUnitsPage.uploadFile("2024-04-25_09h59_52.mp4");
        logger.info("Step 11: Verify type of attachment is not allowed");
        app.moveInMoveOutUnitsPage.verifyAttachmentErrorMsg("غير مسموح به. أنواع الملفات القابلة للتحميل");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_70_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on Do it later button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_71_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on Do it later button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on إغلاق Button");
        CommonMethodsPage.clickOnCloseButton();
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_72_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on Do it later button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on السابق button");
        CommonMethodsPage.clickOnBackButton();
        app.moveInMoveOutUnitsPage.verifyReturnToUnitMoveInForm();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_73_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on التفاصيل button");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_74_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 03: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 04: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Enter contract number in the contract search");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 06: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option > Click on  No, Bad condition  ( لا، لم تكن بحالة جيدة ) Radio Button");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on التفاصيل button > Click on confirm Move Out Unit");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
        app.moveInMoveOutUnitsPage.confirmMoveInUnit();
    }
}