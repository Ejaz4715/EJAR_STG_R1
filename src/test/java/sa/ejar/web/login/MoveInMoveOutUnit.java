package sa.ejar.web.login;

import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;
import java.util.Map;

public class MoveInMoveOutUnit extends NHCWebTest {

    //----------------------------As-Lessor---------------------------------

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
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
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
        logger.info("Step 10: Upload an attachment valid type (PNG, JPEG, GIF, PDF)");
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
}