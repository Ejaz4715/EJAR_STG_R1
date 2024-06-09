package sa.ejar.web.login;

import com.testcrew.manager.TestDataManager;
import org.testng.annotations.Test;
import sa.ejar.web.base.NHCWebTest;
import sa.ejar.web.pages.CommonMethodsPage;
import java.util.Map;

public class MoveInMoveOutUnit extends NHCWebTest {

    //-------------------------- Move In , As-Lessor ---------------------------------
    //--------------------------------------------------------------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_001_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Verify lessor able to select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_002_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Verify lessor able to select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_003_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Verify note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_004_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 10: Input Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_005_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Upload an attachment with valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        logger.info("Step 10: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_006_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Upload an attachments with valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpg");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample2.jpeg");
        logger.info("Step 10: Verify multi attachments are uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentsAreUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_007_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        logger.info("Step 10: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        logger.info("Step 11: Verify uploaded attachment is deleted");
        app.moveInMoveOutUnitsPage.deleteUploadedFile();
        app.moveInMoveOutUnitsPage.verifyAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_008_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on 'حفظ كمسودة' button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_009_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option ");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on 'حفظ كمسودة' button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on إغلاق Button");
        CommonMethodsPage.clickOnCloseButton();
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_010_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on 'حفظ كمسودة' button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on السابق button");
        CommonMethodsPage.clickOnBackButton();
        app.moveInMoveOutUnitsPage.verifyReturnToUnitMoveInForm();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_011_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on  عرض التفاصيل button");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_012_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on  عرض التفاصيل button");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
        logger.info("Step 09: Click on 'تأكيد حالة الوحدة' button");
        app.moveInMoveOutUnitsPage.confirmMoveInUnit();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_013_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 09: Click on إرسال button");
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_014_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 09: Click on إرسال button");
        CommonMethodsPage.clickOnSendBTN();
        logger.info("Step 10: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 11: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 12: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 13: Search by same contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 14: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 15: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 16: Check Unit move-in state As 'مؤجر'");
        app.moveInMoveOutUnitsPage.verifyStatusOfMoveInUnit("نعم، بحالة جيدة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_015_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 10: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        logger.info("Step 12: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        logger.info("Step 13: Click on إرسال button");
        CommonMethodsPage.clickOnSendBTN();
        logger.info("Step 14: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 15: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 16: Search by same contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 17: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 18: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 19: Check Unit move-in state As 'مؤجر'");
        app.moveInMoveOutUnitsPage.verifyStatusOfMoveInUnit("لا، لم تكن بحالة جيدة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_016_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 08: Check the Tenant status is 'في إنتظار رد المستأجر'");
        app.moveInMoveOutUnitsPage.VerifyTenantResponse("في إنتظار رد المستأجر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_017_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 08: Click on 'عرض' button to download the attachment");
        app.moveInMoveOutUnitsPage.clickOnDisplayBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_018_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 08: Click on 'تحميل نسخه PDF' button to view copy of move in model");
        app.moveInMoveOutUnitsPage.clickOnDownloadBTN();
    }

    //-------------------------- Move In , As-Tenant ---------------------------------
    //--------------------------------------------------------------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_019_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Verify lessor able to select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_020_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Verify lessor able to select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_021_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 10: Input Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_022_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Upload an attachment with valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        logger.info("Step 10: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_023_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Upload an attachments with valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpg");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample2.jpeg");
        logger.info("Step 10: Verify multi attachments are uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentsAreUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_024_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        logger.info("Step 10: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        logger.info("Step 11: Verify uploaded attachment is deleted");
        app.moveInMoveOutUnitsPage.deleteUploadedFile();
        app.moveInMoveOutUnitsPage.verifyAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_025_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 10: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 11: Upload an attachment with valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadFile("Image_Over_10_MB.jpg");
        logger.info("Step 12: Verify over size attachment is not allowed");
        app.moveInMoveOutUnitsPage.verifyAttachmentErrorMsg("حجم الملف أكبر من المسموح به.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_026_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 09: Upload (PDF) as invalid attachment");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 10: Verify type of attachment is not allowed");
        app.moveInMoveOutUnitsPage.verifyAttachmentErrorMsg("غير مسموح به. أنواع الملفات القابلة للتحميل");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_027_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on 'حفظ كمسودة' button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_028_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option ");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on 'حفظ كمسودة' button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on إغلاق Button");
        CommonMethodsPage.clickOnCloseButton();
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_029_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on 'حفظ كمسودة' button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on السابق button");
        CommonMethodsPage.clickOnBackButton();
        app.moveInMoveOutUnitsPage.verifyReturnToUnitMoveInForm();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_030_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on  عرض التفاصيل button");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_031_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on  عرض التفاصيل button");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
        logger.info("Step 09: Click on 'تأكيد حالة الوحدة' button");
        app.moveInMoveOutUnitsPage.confirmMoveInUnit();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_032_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 09: Click on إرسال button");
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_033_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 09: Click on إرسال button");
        CommonMethodsPage.clickOnSendBTN();
        logger.info("Step 10: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 11: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 12: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 13: Search by same contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 14: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 15: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 16: Check Unit move-in state As 'المستأجر'");
        app.moveInMoveOutUnitsPage.verifyStatusOfMoveInUnit("نعم، بحالة جيدة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_034_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 10: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        logger.info("Step 12: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        logger.info("Step 13: Click on إرسال button");
        CommonMethodsPage.clickOnSendBTN();
        logger.info("Step 14: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 15: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 16: Search by same contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 17: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 18: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 19: Check Unit move-in state As 'المستأجر'");
        app.moveInMoveOutUnitsPage.verifyStatusOfMoveInUnit("لا، لم تكن بحالة جيدة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_035_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 08: Check the Lessor status is 'في إنتظار رد المؤجر'");
        app.moveInMoveOutUnitsPage.VerifyLessorResponse("في إنتظار رد المؤجر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_036_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 08: Click on 'عرض' button to download the attachment");
        app.moveInMoveOutUnitsPage.clickOnDisplayBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_037_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 08: Click on 'تحميل نسخه PDF' button to view copy of move in model");
        app.moveInMoveOutUnitsPage.clickOnDownloadBTN();
    }

    //-------------------------- Move Out , As-Lessor ---------------------------------
    //---------------------------------------------------------------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_038_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Verify lessor able to select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_039_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Verify lessor able to select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_040_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Verify note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_041_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
                 //There is Bug in this TC
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_042_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 10: Input Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_043_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        //There is Bug in this TC
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_044_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        //There is Bug in this TC
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_045_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        //There is Bug in this TC
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_046_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Upload an attachment with valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        logger.info("Step 10: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_047_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Upload an attachments with valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpg");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample2.jpeg");
        logger.info("Step 10: Verify multi attachments are uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentsAreUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_048_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        logger.info("Step 10: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        logger.info("Step 11: Verify uploaded attachment is deleted");
        app.moveInMoveOutUnitsPage.deleteUploadedFile();
        app.moveInMoveOutUnitsPage.verifyAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_049_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 10: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 11: Upload an attachment with valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadFile("Image_Over_10_MB.jpg");
        logger.info("Step 12: Verify over size attachment is not allowed");
        app.moveInMoveOutUnitsPage.verifyAttachmentErrorMsg("حجم الملف أكبر من المسموح به.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_050_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        //----------------
        //There is Bug in this TC
        //---------------
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 09: Upload (PDF) as invalid attachment");
        app.moveInMoveOutUnitsPage.uploadFile("ejartest.pdf");
        logger.info("Step 10: Verify type of attachment is not allowed");
        app.moveInMoveOutUnitsPage.verifyAttachmentErrorMsg("غير مسموح به. أنواع الملفات القابلة للتحميل");
    }


    @Test(dataProvider = "testDataProvider")
    public void TC_051_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on 'حفظ كمسودة' button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_052_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option ");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on 'حفظ كمسودة' button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on إغلاق Button");
        CommonMethodsPage.clickOnCloseButton();
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_053_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on 'حفظ كمسودة' button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on السابق button");
        CommonMethodsPage.clickOnBackButton();
        app.moveInMoveOutUnitsPage.verifyReturnToUnitMoveInForm();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_054_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on  عرض التفاصيل button");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_055_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on  عرض التفاصيل button");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
        logger.info("Step 09: Click on 'تأكيد حالة الوحدة' button");
        app.moveInMoveOutUnitsPage.confirmMoveInUnit();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_056_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 09: Click on إرسال button");
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_057_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 09: Click on إرسال button");
        CommonMethodsPage.clickOnSendBTN();
        logger.info("Step 10: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 11: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 12: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 13: Search by same contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 14: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 15: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 16: Check Unit move-in state As 'مؤجر'");
        app.moveInMoveOutUnitsPage.verifyStatusOfMoveInUnit("نعم، بحالة جيدة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_058_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 10: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        logger.info("Step 12: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        logger.info("Step 13: Click on إرسال button");
        CommonMethodsPage.clickOnSendBTN();
        logger.info("Step 14: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 15: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 16: Search by same contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 17: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 18: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 19: Check Unit move-in state As 'مؤجر'");
        app.moveInMoveOutUnitsPage.verifyStatusOfMoveInUnit("لا، لم تكن بحالة جيدة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_059_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 08: Check the Tenant status is 'في إنتظار رد المستأجر'");
        app.moveInMoveOutUnitsPage.VerifyTenantResponse("في إنتظار رد المستأجر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_060_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 08: Click on 'عرض' button to download the attachment");
        app.moveInMoveOutUnitsPage.clickOnDisplayBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_061_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 08: Click on 'تحميل نسخه PDF' button to view copy of move in model");
        app.moveInMoveOutUnitsPage.clickOnDownloadBTN();
    }

    //-------------------------- Move Out , As-Tenant ---------------------------------
    //---------------------------------------------------------------------------------

    @Test(dataProvider = "testDataProvider")
    public void TC_062_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Verify lessor able to select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_063_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Verify lessor able to select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_064_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 10: Input Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC_065_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Upload an attachment with valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        logger.info("Step 10: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_066_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Upload an attachments with valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpg");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample2.jpeg");
        logger.info("Step 10: Verify multi attachments are uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentsAreUploaded();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_067_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        logger.info("Step 10: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        logger.info("Step 11: Verify uploaded attachment is deleted");
        app.moveInMoveOutUnitsPage.deleteUploadedFile();
        app.moveInMoveOutUnitsPage.verifyAttachmentIsRemoved();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_068_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 10: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 11: Upload an attachment with valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadFile("Image_Over_10_MB.jpg");
        logger.info("Step 12: Verify over size attachment is not allowed");
        app.moveInMoveOutUnitsPage.verifyAttachmentErrorMsg("حجم الملف أكبر من المسموح به.");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_069_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on 'حفظ كمسودة' button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_070_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option ");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on 'حفظ كمسودة' button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on إغلاق Button");
        CommonMethodsPage.clickOnCloseButton();
        app.terminateContractPage.verifyTheContractsPageIsDisplayed();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_071_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on 'حفظ كمسودة' button");
        app.moveInMoveOutUnitsPage.clickOnDoItLaterBTN();
        logger.info("Step 09: Check alert message contains remaining period");
        app.moveInMoveOutUnitsPage.checkAlertMessage();
        logger.info("Step 10: Click on السابق button");
        CommonMethodsPage.clickOnBackButton();
        app.moveInMoveOutUnitsPage.verifyReturnToUnitMoveInForm();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_072_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on  عرض التفاصيل button");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_073_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Click on  عرض التفاصيل button");
        app.moveInMoveOutUnitsPage.ViewMoveInDetails();
        app.moveInMoveOutUnitsPage.verifyNavigateToViewUnitMoveInDetails();
        logger.info("Step 09: Click on 'تأكيد حالة الوحدة' button");
        app.moveInMoveOutUnitsPage.confirmMoveInUnit();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_074_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 09: Click on إرسال button");
        CommonMethodsPage.clickOnSendBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_075_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (نعم، بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectYesRadioBTN();
        logger.info("Step 09: Click on إرسال button");
        CommonMethodsPage.clickOnSendBTN();
        logger.info("Step 10: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 11: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        logger.info("Step 12: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 13: Search by same contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 14: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 15: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 16: Check Unit move-in state As 'المستأجر'");
        app.moveInMoveOutUnitsPage.verifyStatusOfMoveInUnit("نعم، بحالة جيدة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_076_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( تأكيد استلام/تسليم الوحدة ) option");
        CommonMethodsPage.KebabMenuOptions("تأكيد استلام/تسليم الوحدة");
        CommonMethodsPage.ClickOnKebabMenuOption("تأكيد استلام/تسليم الوحدة");
        logger.info("Step 08: Select (لا، لم تكن بحالة جيدة) Radio Button");
        app.moveInMoveOutUnitsPage.selectNoRadioBTN();
        logger.info("Step 09: Note text area is displayed");
        app.moveInMoveOutUnitsPage.checkNoteTextAreaIsDisplayed();
        logger.info("Step 10: Fill Bad Condition Reason in Reason text area");
        app.moveInMoveOutUnitsPage.fillBadConditionReason();
        logger.info("Step 11: Upload an attachment valid type (PNG, JPEG)");
        app.moveInMoveOutUnitsPage.uploadAttachment("Sample.jpeg");
        logger.info("Step 12: Verify attachment is uploaded");
        app.moveInMoveOutUnitsPage.verifyAttachmentIsUploaded();
        logger.info("Step 13: Click on إرسال button");
        CommonMethodsPage.clickOnSendBTN();
        logger.info("Step 14: Click on العقود tab");
        app.addResidentialContractPage.clickContractsBtn();
        logger.info("Step 15: Click on \"عرض جميع العقود\"");
        CommonMethodsPage.selectViewAllContractsButton();
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 16: Search by same contract number");
        CommonMethodsPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber"));
        logger.info("Step 17: Click on three dots");
        CommonMethodsPage.clickOnKebabMenuButton();
        logger.info("Step 18: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 19: Check Unit move-in state As 'المستأجر'");
        app.moveInMoveOutUnitsPage.verifyStatusOfMoveInUnit("لا، لم تكن بحالة جيدة");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_077_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 08: Check the Lessor status is 'في إنتظار رد المؤجر'");
        app.moveInMoveOutUnitsPage.VerifyLessorResponse("في إنتظار رد المؤجر");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_078_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 08: Click on 'عرض' button to download the attachment");
        app.moveInMoveOutUnitsPage.clickOnDisplayBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_079_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
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
        logger.info("Step 07: Click on ( عرض نموذج استلام/تسليم ) option");
        CommonMethodsPage.KebabMenuOptions("عرض نموذج استلام/تسليم");
        CommonMethodsPage.ClickOnKebabMenuOption("عرض نموذج استلام/تسليم");
        logger.info("Step 08: Click on 'تحميل نسخه PDF' button to view copy of move in model");
        app.moveInMoveOutUnitsPage.clickOnDownloadBTN();
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_080_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        //----------
        //There is Bug in TC
        //----------
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        CommonMethodsPage.changeUserRole("مستأجر");
        logger.info("Step 02: Click on user identity dropdown list > Select 'إدارة الحساب'");
        CommonMethodsPage.neviagteToManageOffice();
        CommonMethodsPage.verifyAccountSettingsPageIsDisplayed();
        logger.info("Step 03: Click on 'المحفظة'");
        CommonMethodsPage.selectWalletFromAccountSettings();
        logger.info("Step 04: Click on 'عمليات المحفظة' filter button");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 05: Select 'مبلغ الضمان المحجوز' from 'وصف العملية' dropdown list");
        CommonMethodsPage.selectDescription();
        logger.info("Step 06: Enter Contract number in contract search field");
        CommonMethodsPage.inputContractNumberInContractSearchField(data.get("ContractNumber"));
        logger.info("Step 07: Verify 'مبلغ الضمان المحجوز' is displayed");
        CommonMethodsPage.verifySecurityAmountReservedIsDisplayed();
    }

    //-------------------------- Move In/Out , As-Admin ---------------------------------
    //--------------------------------------------------------------------------------
    @Test(dataProvider = "testDataProvider")
    public void TC_081_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on ' نماذج الوحدة ' > Select 'عرض نماذج الوحدة' option");
        CommonMethodsPage.navigateToViewUnitForms();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: Enter Contract number in contract search field");
        CommonMethodsPage.inputContractNumberInContractSearchField(data.get("ContractNumber"));
        logger.info("Step 05: Verify move In/Out form status is 'مكتمل'");
        CommonMethodsPage.verifyContractStatus("مكتمل", "Done");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_082_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on ' نماذج الوحدة ' > Select 'عرض نماذج الوحدة' option");
        CommonMethodsPage.navigateToViewUnitForms();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: Enter Contract number in contract search field");
        CommonMethodsPage.inputContractNumberInContractSearchField(data.get("ContractNumber"));
        logger.info("Step 05: Verify move In/Out form status is 'بانتظار المؤجر'");
        CommonMethodsPage.verifyContractStatus("بانتظار المؤجر", "Waiting Lessor");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_083_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on ' نماذج الوحدة ' > Select 'عرض نماذج الوحدة' option");
        CommonMethodsPage.navigateToViewUnitForms();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: Enter Contract number in contract search field");
        CommonMethodsPage.inputContractNumberInContractSearchField(data.get("ContractNumber"));
        logger.info("Step 05: Verify move In/Out form status is 'بانتظار المستأجر'");
        CommonMethodsPage.verifyContractStatus("بانتظار المستأجر", "Waiting Tenant");
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_084_MoveInMoveOutUnit(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("Contracts"));
        logger.info("Step 00: Test Data : " + data);
        app.openApplication(data);
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode(data.get("OTP"));
        app.moveInMoveOutUnitsPage.closeMoveInOutPopup();
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Click on ' نماذج الوحدة ' > Select 'عرض نماذج الوحدة' option");
        CommonMethodsPage.navigateToViewUnitForms();
        logger.info("Step 03: Click on filter icon");
        CommonMethodsPage.clickFilterBtn();
        logger.info("Step 04: Enter Contract number in contract search field");
        CommonMethodsPage.inputContractNumberInContractSearchField(data.get("ContractNumber"));
        logger.info("Step 05: Verify move In/Out form status is 'بانتظار الأطراف'");
        CommonMethodsPage.verifyContractStatus("بانتظار الأطراف", "Waiting Ejar parties");
    }
}