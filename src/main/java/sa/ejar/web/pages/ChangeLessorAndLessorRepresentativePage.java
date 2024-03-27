package sa.ejar.web.pages;


import com.testcrew.web.Browser;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;

import static com.testcrew.api.UnirestAPI.logger;

public class ChangeLessorAndLessorRepresentativePage {

    public void searchForOwnershipDocument(String DN)
    {
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//button[@class='btn btn-filter btn-outline-primary align-end ms-2']")); //document number filter
        Browser.waitForSeconds(2);
        Browser.setText(By.xpath("//div//input[@formcontrolname='document_number']"), DN); //document number input
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void neviagteToOwnerShipDocumentPage()
    {
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//a[contains(text(),'العقارات')]")); //click on property
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//span[contains(text(),'عرض جميع وثائق الملكية')]")); //show all documents
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
        Browser.waitForSeconds(6);
    }

    public void AddNewLessorRepresentativeToOwnerShipDocument(){
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//span[@class='round-icon large menu']")); //Click on list action
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("//a[contains(text(),'تغيير ممثل المؤجر')]")); //option change rep representative
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("//label[contains(text(),'إضافة ممثل المؤجر الجديد')]"));//add rep representative
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//button[contains(text(),'التالي')]")); //next step
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        if(!Browser.isElementPresent(By.xpath("//h5[normalize-space()='#1-0002']"))){ //OwnerShip Document
            Browser.waitForSeconds(2);
            Browser.selectDropdownByVisibleText(By.xpath("//select[@data-name='ownership_document_type']"),"صك ملكية ورقي");  //DN type
            Browser.waitForSeconds(2);
            Browser.setText(By.xpath("//div//input[@type='text']"),"20200101"); //DN date
            Browser.waitForSeconds(2);
            Browser.setText(By.xpath("//div//input[@formcontrolname='document_number']"),"1-0002");  //DN name
            Browser.waitForSeconds(2);
            Browser.click(By.xpath("//app-form-radio//input[@type='radio']")); //select DN
            Browser.waitForSeconds(2);
        }
        Browser.click(By.xpath("//button[contains(text(),'التالي')]")); //next step
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        String AlertMsg = Browser.getWebElement(By.xpath("//p[@class='info-label mt-4']")).getText();
        AlertMsg.contains("لا يمكن إضافة ممثل المؤجر بسبب وجود ممثل آخر في نفس وثيقة الملكية!");
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }
    public void updateCurrentLessorRepresentativeDFromOwnerShipDocument(){
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//span[@class='round-icon large menu']")); //Click on list action
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("//a[contains(text(),'تغيير ممثل المؤجر')]")); //change rep representative
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("//label[contains(text(),'تعديل ممثل المؤجر الحالي')]")); //update rep representative
        Browser.waitForSeconds(2);
        if(!Browser.isElementPresent(By.xpath("//h5[normalize-space()='#1-0002']"))){ //OwnerShip Document
            Browser.waitForSeconds(2);
            Browser.selectDropdownByVisibleText(By.xpath("//select[@data-name='ownership_document_type']"),"صك ملكية ورقي");  //DN type
            Browser.waitForSeconds(2);
            Browser.setText(By.xpath("//div//input[@type='text']"),"20200101"); //DN date
            Browser.waitForSeconds(2);
            Browser.setText(By.xpath("//div//input[@formcontrolname='document_number']"),"1-0002");  //DN name
            Browser.waitForSeconds(2);
            Browser.click(By.xpath("//app-form-radio//input[@type='radio']")); //select DN
            Browser.waitForSeconds(2);
        }
        Browser.click(By.xpath("//button[contains(text(),'التالي')]")); //next step
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("//button[contains(text(),'تأكيد التغيير')]")); //confirm update lessor rep
        Browser.waitForSeconds(3);
    }

    public void addNewLessorRepresentative() {
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[contains(text(),'هوية وطنية')]")); //select type of id
        Browser.waitForSeconds(2);
        Browser.setText(By.xpath("//div//input[@formcontrolname='id_number']"),"1000100011"); //input national id
        Browser.waitForSeconds(2);
        Browser.setText(By.xpath("(//div//input[@type='text'])[2]"),"14000101");//Enter DOBs
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("//button[contains(text(),'التالي')]")); //next step
        Browser.waitForSeconds(2);
    }

    public void addLessorRepresentativeLegalDocument() {
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//a[contains(text(),'إضافة وثيقة قانونية جديدة')]")); //add legal document
        Browser.waitForSeconds(2);
        Browser.selectDropdownByVisibleText(By.xpath("//select[@name='document_type']"),"أخرى");// select other option
        Browser.waitForSeconds(2);
        Browser.setText(By.xpath("//div//input[@formcontrolname='document_number']"),"Test");  // legal document name
        Browser.waitForSeconds(2);
        Browser.setText(By.xpath("(//div//input[@type='text'])[4]"),"20230101"); //IssueDate
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//app-form-field[@data-name='issued_date']//div[@class='date-picker-button']")); //IssueDateButton
        Browser.waitForSeconds(2);
        Browser.setText(By.xpath("(//div//input[@type='text'])[5]"),"20250101");  //ExpireDate
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//app-form-field[@data-name='expiry_date']//div[@class='date-picker-button']")); //ExpireDateButton
        Browser.waitForSeconds(2);
        Browser.setText(By.xpath("(//div//input[@type='text'])[6]"),"Test"); //IssuePlace
        Browser.waitForSeconds(2);
        Browser.setText(By.xpath("(//div//input[@type='text'])[7]"),"Test By Automation"); //NameOfLegalDocument
        Browser.waitForSeconds(2);
        Browser.setText(By.xpath("(//div//input[@type='text'])[8]"),"Test"); //IssuePlace
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }


    public void uploadAttachment() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//p[contains(text(),'تحميل الملف')]"));
        Browser.waitForSeconds(2);
        robotFiles("Test.png");
    }

    public void ConfirmChangeLessorRepresentative(){
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//button[contains(text(),'تأكيد التغيير')]"));
        Browser.waitForSeconds(2);
    }

    public void robotFiles(String File) throws Exception {
        Robot robot = new Robot();
        robot.delay(2000);
        String CURRENT_DIR = System.getProperty("user.dir");
        String filepath1 = Paths.get(CURRENT_DIR, "src", "test", "resources") + "\\" + File;
        StringSelection select1 = new StringSelection(filepath1);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
    public void deleteLessorRepresentativeToOwnerShipDocument(){
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//span[@class='round-icon large menu']")); //Click on list action
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("//a[contains(text(),'تغيير ممثل المؤجر')]")); //change rep representative
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("//label[contains(text(),'إزالة ممثل المؤجر الحالي')]")); //delete rep representative
        Browser.waitForSeconds(2);
        Browser.executeJSScrollIntoView(By.xpath("//button[contains(text(),'إزالة الممثل')]"));  //delete lessor rep button
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("//button[contains(text(),'إزالة الممثل')]"));  //delete lessor rep button
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("//button[contains(text(),'تأكيد')]")); //confirm delete
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        String AlertMsg = Browser.getWebElement(By.xpath("//p[contains(text(),'تمت إزالة ممثل المؤجر الحالي في وثيقة الملكية بنجا')]")).getText();
        //Confirm Delete lessor rep
        AlertMsg.contains("تمت إزالة ممثل المؤجر الحالي");
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("//button[contains(text(),'إغلاق')]")); //closeButton
    }

    public void assertLessorRepresentativeDeleted(){
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//span[@class='round-icon large menu']")); //Click on list action
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//a[contains(text(),'عرض وثيقة الملكية')]"));  //view ownerShip
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.executeJSScrollIntoView(By.xpath("//a[contains(text(),'إضافة مالك فرد')]"));
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }
}
