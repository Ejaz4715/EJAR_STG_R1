package sa.ejar.web.pages.pre_condition;

import com.testcrew.base.WebBasePage;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import sa.ejar.web.objects.pre_condition.*;


import java.util.List;

import static com.testcrew.web.Browser.logger;

public class AddResidentialContract2Page extends WebBasePage {

    /*
    * Click date input field
    * */
    public void clickDateInputField() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.clickDateInputField(), 5);
        Browser.click(AddResidentialContract2PageObjects.clickDateInputField());
    }

    /*
     * Click on Contracts Button
     * */
    public void clickContractsBtn() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.contractButton(), 20);
        Browser.click(LoginPageObjects.contractButton());
        logger.addScreenshot("Clicked on Contracts btn");
    }

    public void selectViewAllContractsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.viewAllContractsButton(), 20);
        Browser.click(LoginPageObjects.viewAllContractsButton());
        logger.addScreenshot("Navigate to View All Contracts page");
    }


    /*
     * Select New Residential Contract
     * */
    public void selectNewResidualContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.optionCreateNewContract(), 5);
        Browser.click(LoginPageObjects.optionCreateNewContract());
        logger.addScreenshot("Select New Residential Contract");
    }
    public void clickDistrictDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.DistrictDropDown(), 30);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContract2PageObjects.DistrictDropDown());
        Browser.waitForSeconds(1);
    }
    public void clickIdentifyAddressOnMapBTNToPointToLocation() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.clickidentifyAddressOnMapBTN(), 5);
        Browser.click(AddResidentialContract2PageObjects.clickidentifyAddressOnMapBTN());
        logger.addScreenshot("");
    }


    /*
     * Select Start date of contract
     * */
    public void selectEndDateOfResidualContract(String day, String month, String year) throws Exception{
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.clickContractEndYear(), 5);
        Browser.click(AddResidentialContract2PageObjects.clickContractEndYear());


        //Select year
        List<WebElement> listYear = Browser.driver.findElements(AddResidentialContract2PageObjects.selectContractEndYear());
        for (WebElement y : listYear){
            String getYear = y.getText();
            if (getYear.equalsIgnoreCase(year)){
                y.click();
                break;
            }
        }

         //Select month
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.clickContractEndMonth(), 5);
        Browser.click(AddResidentialContract2PageObjects.clickContractEndMonth());
        List<WebElement> listMonth = Browser.driver.findElements(AddResidentialContract2PageObjects.selectContractEndMonth());
        String [] monthArray = month.split(" ");
        for (WebElement m : listMonth){
            String getMonth = m.getText();
            if (getMonth.equalsIgnoreCase(monthArray[0]) || getMonth.equalsIgnoreCase(monthArray[1])){
                m.click();
                break;
            }
        }

        //Select day
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.selectContractEndDay(), 5);
        List<WebElement> listDay = Browser.driver.findElements(AddResidentialContract2PageObjects.selectContractEndDay());
        for (WebElement d : listDay){
            String getDay = d.getText();
            if (getDay.equalsIgnoreCase(day)){
                d.click();
                break;
            }
        }
    }

    public String getCurrentMonth (String monthNum){
        String month = "";
        monthNum = monthNum.replaceFirst ("^0*", "");
        switch (monthNum){
            case "1": month = "January يناير ";
            break;
            case "2": month = "February فبراير";
            break;
            case "3": month = "March مارس";
            break;
            case "4": month = "April أبريل";
            break;
            case "5": month = "May مايو";
            break;
            case "6": month = "June يونيو";
            break;
            case "7": month = "July يوليو";
            break;
            case "8": month = "August أغسطس";
            break;
            case "9": month = "September سبتمبر";
            break;
            case "10": month = "October أكتوبر";
            break;
            case "11": month = "November نوفمبر";
            break;
            case "12": month = "December  يناير ";
            break;
        }
        return month;
    }

    /*
     * Select End date of contract
     * */
    public void selectStartDateOfResidualContract(String day, String month, String year) throws Exception {

        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.clickContractStartYear(), 5);
        Browser.click(AddResidentialContract2PageObjects.clickContractStartYear());

        //Select year
        List<WebElement> listYear = Browser.driver.findElements(AddResidentialContract2PageObjects.selectContractStartYear());
        for (WebElement y : listYear){
            String getYear = y.getText();
            if (getYear.equalsIgnoreCase(year)){
                y.click();
                break;
            }
        }

        //Select month
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.clickContractStartMonth(), 5);
        Browser.click(AddResidentialContract2PageObjects.clickContractStartMonth());
        String [] monthArray = month.split(" ");
        List<WebElement> listMonth = Browser.driver.findElements(AddResidentialContract2PageObjects.selectContractStartMonth());
        for (WebElement m : listMonth){
            String getMonth = m.getText();
            if (getMonth.equalsIgnoreCase(monthArray[0]) || getMonth.equalsIgnoreCase(monthArray[1])){
                m.click();
                break;
            }
        }

        //Select day
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.selectContractStartDay(), 10);
        List<WebElement> listDay = Browser.driver.findElements(AddResidentialContract2PageObjects.selectContractStartDay());
        for (WebElement d : listDay){
            String getMonth = d.getText();
            if (getMonth.equalsIgnoreCase(day)){
                d.click();
                break;
            }
        }
    }

    public void clickConfirmPeriodBTN() throws Exception {
        Browser.executeJSScroll(500);
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.confirmPeriodBTN(), 20);
        Browser.click(AddResidentialContract2PageObjects.confirmPeriodBTN());
        logger.addScreenshot("Input date and confirm");
        Browser.waitForSeconds(10);
    }

    public void clickAddPropertyBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.coveredPropertyUnitsBTN(), 20);
        Browser.waitForSeconds(10);
        Browser.click(AddResidentialContract2PageObjects.coveredPropertyUnitsBTN());
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.addPropertyBTN(), 10);
        Browser.click(AddResidentialContract2PageObjects.addPropertyBTN());
        Browser.waitForSeconds(2);
        logger.addScreenshot("Navigate to Add Property page");
    }

    public void selectProperty(String propertyName) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.propertyName(), 30);
        List<WebElement> listPropertyNames = Browser.driver.findElements(AddResidentialContract2PageObjects.propertyName());
        for (WebElement property : listPropertyNames){
            String getPropertyName = property.getText();
            if (getPropertyName.contains(propertyName)){
                property.click();
                Browser.waitForSeconds(2);
                break;
            }
        }
        logger.addScreenshot("Property Selected");
    }

    public void clickContinueWithThisPropertyBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.continueWithThisPropertyBTN(), 5);
        Browser.click(AddResidentialContract2PageObjects.continueWithThisPropertyBTN());
    }

    public void clickContinueToSelectUnitsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.continueToSelectUnitsBTN(), 10);
        Browser.waitForSeconds(3);
        Browser.click(AddResidentialContract2PageObjects.continueToSelectUnitsBTN());
    }

    public void clickFilterBtnOnSelectUnitPage() throws Exception {
        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.filterBtnOnSelectUnitsPage(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContract2PageObjects.filterBtnOnSelectUnitsPage());
    }

    public void selectUnitsAvailability() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.selectUnitsAvailability(), 10);
        Browser.waitForSeconds(2);
        Browser.selectDropdownByIndex(AddResidentialContract2PageObjects.selectUnitsAvailability(), 1);
    }

    public void selectUnit(String inputUnit) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.selectUnit(), 10);
        Browser.waitForSeconds(2);
        List<WebElement> listUnits = Browser.driver.findElements(AddResidentialContract2PageObjects.selectUnit());
        for (WebElement unit : listUnits){
            String getUnitNum= unit.getText();
            System.out.println("unit number is " + getUnitNum);
            if (getUnitNum.contains(inputUnit)){
                unit.click();
                Browser.waitForSeconds(2);
                break;
            }
        }
        logger.addScreenshot("");
    }
    public void selectFirstAvailableUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.selectFirstAvailableUnit(), 25);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContract2PageObjects.selectFirstAvailableUnit());
        logger.addScreenshot("Available unit is selected");
    }

    public void clickConfirmPropertyDetailsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.confirmPropertyDetailsBTN(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContract2PageObjects.confirmPropertyDetailsBTN());
        logger.addScreenshot("Clicked Confirm Property Details button");
    }

    public void clickIdentifyAddressOnMapBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.identifyAddressOnMapBTN(), 15);
        Browser.click(AddResidentialContract2PageObjects.identifyAddressOnMapBTN());
    }

    public void clickConfirmBtnOnMap() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.confirmBtnOnMap(), 5);
        Browser.waitForSeconds(6);
        Browser.click(AddResidentialContract2PageObjects.confirmBtnOnMap());
        logger.addScreenshot("Clicked Confirm Button on Map");
    }

    public void clickSaveBtnOnPropertyAddress() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.saveBtnOnPropertyAddress(), 5);
        Browser.click(AddResidentialContract2PageObjects.saveBtnOnPropertyAddress());
    }

    public void clickContractPartiesBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.contractPartiesStepBTN(), 30);
        Browser.click(AddResidentialContract2PageObjects.contractPartiesStepBTN());
    }

    public void clickAddIndividualTenantBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.addIndividualTenantBTN(), 25);
        Browser.click(AddResidentialContract2PageObjects.addIndividualTenantBTN());
        logger.addScreenshot("Navigate to Add Individual Tenant page");
    }

    public void selectTenant(){
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("(//label[@class='form-check-label'])[2]"));
    }

    public void clickTenantRadioBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.tenantRadioBTN(), 5);
        Browser.waitForSeconds(1);
        Browser.click(AddResidentialContract2PageObjects.tenantRadioBTN());
    }

    public void inputTenantNationalId(String nationalId) throws Exception {
//        Browser.click(RegistrationPageObjects.nationalIDRegistrationLabel());
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.tenantNationalIdInput(), 5);
        Browser.setText(AddResidentialContract2PageObjects.tenantNationalIdInput(), nationalId);
    }

    public void inputTenantDOB(String DOB) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.tenantDateOfBirthInput(), 10);
        Browser.setText(AddResidentialContract2PageObjects.tenantDateOfBirthInput(), DOB);
    }

    public void clickContinueButtonOnTenantContractPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.continueBtnOnIndividualContractPage(), 5);
        Browser.click(AddResidentialContract2PageObjects.continueBtnOnIndividualContractPage());
        logger.addScreenshot("Clicked Confirm after providing required data for new Tenant");
    }


    public void inputTenantPhoneNumberAndEmail(String phoneNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.tenantPhoneNumberInput(), 5);
        Browser.setText(AddResidentialContract2PageObjects.tenantPhoneNumberInput(), phoneNumber);
        Browser.setText(AddResidentialContract2PageObjects.emailInput(),"Test@test.com");
    }

    public void selectTenantRegion(int index) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.tenantRegionDropdown(), 5);
        Browser.click(AddResidentialContract2PageObjects.tenantRegionDropdown());
        Browser.selectDropdownByIndex(AddResidentialContract2PageObjects.tenantRegionDropdown(),index );
    }
    public void clickTenantCityDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.tenantCityDropdown(), 25);
        Browser.click(AddResidentialContract2PageObjects.tenantCityDropdown());
    }
    public void selectTenantCity(String city) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.selectTenantCity(), 25);
        List<WebElement> listCity = Browser.driver.findElements(AddResidentialContract2PageObjects.selectTenantCity());
        for (WebElement cityName : listCity){
            String getCityName = cityName.getText();
            if (getCityName.contains(city)){
                cityName.click();
                Browser.waitForSeconds(1);
                break;
            }
        }
        logger.addScreenshot("");
    }

    public void AddAdditionalAdders() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getTextPostalCode(),30);
        Browser.setText(AddPropertyPageObjects.getTextPostalCode(),"13245");
        Browser.setText(AddPropertyPageObjects.TXTStreetName(),"العليا");
        Browser.setText(AddPropertyPageObjects.TXTBuildingNumber(),"1234");
        Browser.setText(AddPropertyPageObjects.TXTAdditionalNumber(),"4356");
        logger.addScreenshot("");

    }

     public void clickConfirmBtnOnTenantAddressPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.confirmBtnOnTenantAddressPage(), 15);
        Browser.click(AddResidentialContract2PageObjects.confirmBtnOnTenantAddressPage());
        logger.addScreenshot("Confirm Tenant Address");

    }

    public void addLessorFacilities() throws Exception {
        Browser.waitForSeconds(10);
        Browser.click(AddResidentialContract2PageObjects.addLessorFacility());
        Browser.waitForSeconds(3);
        Browser.click(AddResidentialContract2PageObjects.lessorFacilityWifeIDLabel());
        Browser.waitForSeconds(2);
//        Browser.click(RegistrationPageObjects.nationalIDRegistrationLabel());
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContract2PageObjects.NationalIDRadioBTN());
        Browser.setText(AddResidentialContract2PageObjects.tenantNationalIdInput(),"1079565430");
        Browser.setText(AddResidentialContract2PageObjects.tenantDateOfBirthInput(),"14130323");
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
        Browser.click(AddPropertyPageObjects.getButtonContinue());
        Browser.waitForSeconds(2);

    }



    public void verifyAddResidentialContractPageIsVisible() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.addResidentialContractDashboard(), 15);
        Assert.assertTrue(Browser.isElementPresent(AddResidentialContract2PageObjects.addResidentialContractDashboard()), "Add Residential Contract dashboard is not visible");
        logger.addScreenshot("");
    }

    public void clickFinancialTermsStepBTN() throws Exception {
        Browser.waitForSeconds(1);
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.financialTermsStepBTN(), 30);
        Browser.click(AddResidentialContract2PageObjects.financialTermsStepBTN());
    }

    public void clickAddRentalContractTermsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.addRentalContractTermsBTN(), 15);
        Browser.click(AddResidentialContract2PageObjects.addRentalContractTermsBTN());
        logger.addScreenshot("Navigate to Financial Terms page");
    }

    public void enterAnnulRent(String rent) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.annualRentInputField(), 15);
        Browser.setText(AddResidentialContract2PageObjects.annualRentInputField(), rent);
        logger.addScreenshot("Entered annual rent");
    }

    public void increaseRentPrice() {
        Browser.executeJSScroll(300);
        Browser.click(By.xpath("(//span[@class='slider enable-transitions'])[1]"));
        Browser.click(By.xpath("//label[contains(text(),'مبلغ ثابت')]"));
        Browser.click(By.xpath("//label//div[contains(text(),' مبلغ الزيادة ')]"));
        Browser.setText(By.xpath("//input[@data-name='fixed_fee']"),"20");
    }


    public void clickAddAdditionalContractTerms() throws Exception {
        Browser.click(By.xpath("(//span[@class='slider enable-transitions'])[2]")); //الخدمات
        Browser.setText(By.xpath("(//div//input[@type='text'])[2]"), "1"); //عداد غاز
        Browser.click(By.xpath("(//div//label[@class='form-check-label'])[6]")); // عداد مشترك
        Browser.setText(By.xpath("//div//input[@formcontrolname='premise_id']"),"1329492499");
        Browser.click(By.xpath("//button[contains(text(),'تحقق')]")); //تحقق
//        Browser.click(By.xpath("//div[@class='close-icon-black cursor-pointer']"));
        Browser.executeJSScroll(200);
        Browser.setText(By.xpath("//div//input[@formcontrolname='electricity_current_reading']"),"876567890098765678");
        Browser.click(By.xpath("(//label[@class='form-check-label'])[9]")); //طريقة الدفع
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[contains(text(),'ثابت سنويًا')]"));  //رسوم الغاز
        Browser.setText(By.xpath("(//div//input[@mask='separator'])[3]"),"20");
        Browser.click(By.xpath("(//div//label[@class='form-check-label'])[13]"));
        Browser.click(By.xpath("(//div//label[@class='form-check-label'])[16]"));
        Browser.setText(By.xpath("//input[@data-name='water_meter_account']"),"8765434567");
        Browser.setText(By.xpath("//input[@data-name='water_meter']"),"6543456787654");
        Browser.setText(By.xpath("//input[@formcontrolname='meter_current_reading']"),"22");
        logger.addScreenshot("Added gas information");
        Browser.click(By.xpath("//div//input[@formcontrolname='number_of_parking_lots']"));//parking
        Browser.setText(By.xpath("//div//input[@formcontrolname='number_of_parking_lots']"), "1");//parking //عدد المواقف
        Browser.click(By.xpath("(//div//input[@mask='separator'])[4]"));//رسوم المواقف
        logger.addScreenshot("");
        Browser.setText(By.xpath("(//div//input[@mask='separator'])[4]"),"20");
        Browser.executeJSScroll(300);
        logger.addScreenshot("Added parking space information");
    }
        public void clickSinglePaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.singlePaymentRadioBTN(), 15);
        Browser.click(AddResidentialContract2PageObjects.singlePaymentRadioBTN());
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void clickMonthlyPaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'دفعات متكررة')]"), 15);
       Browser.click(By.xpath("//label[contains(text(),'دفعات متكررة')]"));
       Browser.click(By.xpath("//label[@class='form-check-label']//div[text()=' شهري ']"));
        logger.addScreenshot("");
    }

    public void clickQuarterlyPaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'دفعات متكررة')]"), 15);
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[contains(text(),'دفعات متكررة')]"));
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[@class='form-check-label']//div[text()=' ربعي ']"));
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void clickSixMonthPaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'دفعات متكررة')]"), 15);
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[contains(text(),'دفعات متكررة')]"));
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[@class='form-check-label']//div[text()=' نصف سنوى ']"));
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }
    public void clickYearlyPaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'دفعات متكررة')]"), 15);
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[contains(text(),'دفعات متكررة')]"));
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[@class='form-check-label']//div[text()=' سنوي ']"));
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void clickFlexiblePaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'الدفعات المرنة')]"), 15);
        Browser.waitForSeconds(2);
        Browser.click(By.xpath("//label[contains(text(),'الدفعات المرنة')]"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }


    public void clickConfirmPaymentScheduleBTN() throws Exception {
        if(Browser.isElementPresent(By.xpath("//button[text()=' إلمتابعة إلى رصيد بدء العقد ']"))){
            Browser.click(By.xpath("//button[text()=' إلمتابعة إلى رصيد بدء العقد ']"));
        }
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.continueToBillingScheduleBTN(), 30);
        Browser.click(AddResidentialContract2PageObjects.continueToBillingScheduleBTN());
    }

    public void clickPayOnlineBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.payOnlineBTN(), 15);
        Browser.click(AddResidentialContract2PageObjects.payOnlineBTN());
        Browser.executeJSScrollIntoView(By.xpath("//label[contains(text(),'رقم حساب الآيبان')]"));
        Browser.waitForSeconds(2);
    }
    public void AddNewBOMangerWallet() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.addNewWalletBtn(), 15);
        Browser.waitForSeconds(10);
        Browser.click(AddResidentialContract2PageObjects.addNewWalletBtn());
        Browser.waitForSeconds(6);
        Browser.click(AddResidentialContract2PageObjects.addNewIbanInWallet());
    }

    public void addNewIbanBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.addNewIbanBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContract2PageObjects.addNewIbanBTN());
        logger.addScreenshot("Add new IBAN button is clicked");
    }

    public void enterIbanNumber(String ibanNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.ibanNumberInputField(), 15);
        Browser.waitForSeconds(2);
        Browser.setText(AddResidentialContract2PageObjects.ibanNumberInputField(), ibanNumber);
    }

    public void enterAccountOwnerName(String ownerName) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.accountOwnerNameInputField(), 15);
        Browser.waitForSeconds(2);
        Browser.setText(AddResidentialContract2PageObjects.accountOwnerNameInputField(), ownerName);
    }

    public void clickSaveBTNOnAddIban() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.saveBTNonAddNewIban(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContract2PageObjects.saveBTNonAddNewIban());
        logger.addScreenshot("Saved new IBAN");
    }

    public void selectIbanFromDropdown() throws Exception {
        Browser.executeJSScroll(100);
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.selectIbanDropdown(), 5);
        Browser.click(AddResidentialContract2PageObjects.selectIbanDropdown());
        Browser.waitForSeconds(1);
        Browser.selectDropdownByIndex(AddResidentialContract2PageObjects.selectIbanDropdown(), 1);
    }

    public void selectLessorRadioBtnForAccountOwner() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.ibanAccountOwnerRadioBTN(), 15);
        Browser.click(AddResidentialContract2PageObjects.ibanAccountOwnerRadioBTN());
    }

    public void selectLessorRepresentativeRadioBtnForAccountOwner() throws Exception {
        Browser.waitUntilVisibilityOfElement(By.xpath("//label[contains(text(),'ممثل')]"), 15);
        Browser.click(By.xpath("//label[contains(text(),'ممثل')]"));
        logger.addScreenshot("Selected payment method and account owner");
        Browser.waitForSeconds(1);
    }

    public void selectOtherRadioBtnForAccountOwner() throws Exception {
        Browser.waitUntilVisibilityOfElement(By.xpath(""), 15);
        Browser.click(By.xpath(""));
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void clickContinueToAdditionalFeeBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.continueToAdditionalFeeBTN(), 15);
        Browser.click(AddResidentialContract2PageObjects.continueToAdditionalFeeBTN());
    }

    public void addAdditionalFee(){
        Browser.waitForSeconds(3);
//        Browser.click(By.xpath("//form[@id='security_deposit_form']//span[@class='slider enable-transitions']"));
//        Browser.setText(By.xpath("(//div//input[@mask='separator'])[1]"),"20");
        Browser.click(By.xpath("//form[@id='late_fees_charged_form']//span[@class='slider enable-transitions']"));
        Browser.setText(By.xpath("(//div//input[@mask='separator'])[1]"),"20");
        Browser.click(By.xpath("//form[@id='retainer_fee_form']//span[@class='slider enable-transitions']"));
        Browser.setText(By.xpath("(//div//input[@mask='separator'])[2]"),"20");
        Browser.click(By.xpath("//form[@id='brokerage_fee_form']//span[@class='slider enable-transitions']"));
        Browser.click(By.xpath("//label[contains(text(),'المؤجر')]"));
        Browser.setText(By.xpath("(//div//input[@mask='separator'])[3]"),"20");
        Browser.setText(By.xpath("//input[@type='text']"),"20250101");
        logger.addScreenshot("");
        Browser.waitForSeconds(1);

    }
    public void clickContinueFinancialTermsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.continueFinancialTermsBTN(), 15);
        Browser.click(AddResidentialContract2PageObjects.continueFinancialTermsBTN());
        logger.addScreenshot("");
    }

    public void clickTermsAndConditionsStepBTN() throws Exception {
        Browser.waitUntilElementToBeClickable(AddResidentialContract2PageObjects.termsAndConditionsStepBTN(), 35);
        Browser.click(AddResidentialContract2PageObjects.termsAndConditionsStepBTN());
    }

    public void clickAddTermsAndConditionsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.addTermsAndConditionsBTN(), 15);
        Browser.click(AddResidentialContract2PageObjects.addTermsAndConditionsBTN());
        logger.addScreenshot("Navigate to Terms And Conditions page");
    }

    public void selectBrokerageOfficeAsEjarFeesPayer() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.ejarFeesPayerRadioBTN(), 15);
        Browser.click(AddResidentialContract2PageObjects.ejarFeesPayerRadioBTN());
    }

    public void selectOtherTerms(){
        Browser.click(By.xpath("//app-term-question[@data-test-id='tenant_can_sublease']//span[@class='slider enable-transitions']"));
        Browser.click(By.xpath("//app-term-question[@data-test-id='residential_followup_with_authorities']//span[@class='slider enable-transitions']"));
        Browser.click(By.xpath("//app-term-question[@data-test-id='renovations_and_improvements_rental_unit']//span[@class='slider enable-transitions']"));
        Browser.click(By.xpath("//app-term-question[@data-test-id='modification_rental_unit']//span[@class='slider enable-transitions']"));
        logger.addScreenshot("");
    }

    public void selectGoverningLaw() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.governingLawRadioBTN(), 15);
        Browser.click(AddResidentialContract2PageObjects.governingLawRadioBTN());
    }

    public void addAdditionalTerms(){
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(1);
        Browser.click(By.xpath("//app-switch-input[@class='float-right ng-untouched ng-pristine ng-valid']//span[@class='slider enable-transitions']"));
        Browser.waitUntilVisibilityOfElement(By.xpath("//a[contains(text(),'إضافة بند آخر')]"),20);
        Browser.click(By.xpath("//a[contains(text(),'إضافة بند آخر')]"));
        Browser.waitUntilVisibilityOfElement(By.xpath("//textarea[@formcontrolname='content']"),20);
        Browser.setText(By.xpath("//textarea[@formcontrolname='content']"),"Test By Automation");
        Browser.click(By.xpath("//button[@type='button'][contains(text(),'تأكيد')]"));
        logger.addScreenshot("Added additional terms");
    }

    public void clickConfirmTermsAndConditionsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.confirmTermsAndConditionsBTN(), 15);
        Browser.click(AddResidentialContract2PageObjects.confirmTermsAndConditionsBTN());
        logger.addScreenshot("Confirm Terms And Conditions");
    }

    public void clickSubmitForApprovalBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.submitForApprovalBTN(), 35);
        Browser.click(AddResidentialContract2PageObjects.submitForApprovalBTN());
        logger.addScreenshot("Navigate to Contract Submission page");
    }

    public void clickContinueBtnOnPreviewContractPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.continueBtnOnPreviewContractPage(), 35);
        Browser.click(AddResidentialContract2PageObjects.continueBtnOnPreviewContractPage());
    }

    public void clickContinuePayBtnOnPreviewBrokerageAgreementPage() throws Exception {
        if(Browser.isElementPresent(AddResidentialContract2PageObjects.continuePayBtnOnPreviewBrokerageAgreementPage())) {
            Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.continuePayBtnOnPreviewBrokerageAgreementPage(), 35);
            Browser.click(AddResidentialContract2PageObjects.continuePayBtnOnPreviewBrokerageAgreementPage());
        }
    }

    public void clickDisclaimerCheckboxOnPayingEjarFeesPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.disclaimerCheckboxOnPayingEjarFeesPage(), 35);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContract2PageObjects.disclaimerCheckboxOnPayingEjarFeesPage());
        logger.addScreenshot("");
    }

    public void navigateToWallet(){

        Browser.waitForSeconds(3);
        Browser.click(By.xpath("//a[contains(text(),'انقر هنا لإضافة محفظة')]"));
        Browser.waitForSeconds(6);

    }
    public void clickConfirmAndSubmitBtnOnPayingEjarFeesPage() throws Exception {
        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.confirmAndSubmitBtnOnPayingEjarFeesPage(), 35);
        Browser.click(AddResidentialContract2PageObjects.confirmAndSubmitBtnOnPayingEjarFeesPage());
        logger.addScreenshot("");
    }

    public void verifyContractStatusIsWaitingForApproval() throws Exception {
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(3);
        String [] expectedStatus = {"بانتظار موافقة الأطراف", "Waiting Parties Approval"};
        boolean status = false;
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.contractStatus(), 35);
        String actualStatus = Browser.getWebElement(AddResidentialContract2PageObjects.contractStatus()).getText();
        logger.addScreenshot("Contract Status :" + actualStatus);
        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])){
            status = true;
        }
        Browser.waitForSeconds(1);
        Assert.assertTrue(status);
    }

    public void clickCloseSurveyPopUpBTN() throws Exception {
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.closeSurveyPopUpBTN(), 35);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContract2PageObjects.closeSurveyPopUpBTN());
    }

    public void clickConfirmBtnOnCloseSurveyPopUp() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.confirmBtnOnCloseSurveyPopUp(), 35);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContract2PageObjects.confirmBtnOnCloseSurveyPopUp());
    }

    public String getContractNumber() throws Exception {
        Browser.waitForSeconds(2);
        String number = Browser.getWebElement(AddResidentialContract2PageObjects.contractNumber()).getText();
        String contractNumber = number.split("#")[1];
//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "AddResidentialContract",
//                "addNewResidentialContractWithDurationMoreThanThreeMonths", "ContractNumber", contractNumber);
        return contractNumber;
    }

    public void clickFilterBtnOnViewAllContractsPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.filterBtnOnViewAllContractsPage(), 20);
        Browser.click(AddResidentialContract2PageObjects.filterBtnOnViewAllContractsPage());
        logger.addScreenshot("Clicked on filter button");
    }

    public void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
        Browser.waitUntilPresenceOfElement(AddResidentialContract2PageObjects.searchContractNumberInputField(),20);
        Browser.setText(AddResidentialContract2PageObjects.searchContractNumberInputField(), contractNumber);
        logger.addScreenshot("Entered Contract Number in search input field");
    }

    public void setContractNumberToContext(ITestContext context) throws Exception{
        String contractNumber= getContractNumber();
        context.setAttribute("Contract number",contractNumber);
    }
    public void clickContractNumberOnContractViewPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.contractNumberTextOnViewContractsPage(), 20);
        Browser.waitForSeconds(5);
        Browser.click(AddResidentialContract2PageObjects.contractNumberTextOnViewContractsPage());
        logger.addScreenshot("Navigate to view the searched contract");
    }

    public void clickApproveContractBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.approveContractBTN(), 20);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContract2PageObjects.approveContractBTN());
        logger.addScreenshot("Click Approve Contract");
    }

//    /*
//    * Contract Approval
//    * */
//    public void clickLetsStartBTN() throws Exception {
//        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.letsStartBTN(), 20);
//        Browser.click(ContractsApprovalPageObjects.letsStartBTN());
//        logger.addScreenshot("");
//    }
//
//    public void clickConfirmBTN() throws Exception {
//        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.confirmBTN(), 20);
//        Browser.waitForSeconds(5);
//        Browser.click(ContractsApprovalPageObjects.confirmBTN());
//
//        //Handle the dynamic requirement of double-click on Confirm BTN
//        if (!Browser.isElementPresent(ContractsApprovalPageObjects.agreementCheckbox())){
//            Browser.waitForSeconds(2);
//            Browser.click(ContractsApprovalPageObjects.confirmBTN());
//        }
//        logger.addScreenshot("Confirm contract details");
//    }
//
//    public void clickOnAgreementCheckbox() throws Exception {
//        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.agreementCheckbox(), 20);
//        Browser.click(ContractsApprovalPageObjects.agreementCheckbox());
//        logger.addScreenshot("");
//    }
//
//    public void clickSubmitContractApprovalBTN() throws Exception {
//        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.submitContractApprovalBTN(), 20);
//        Browser.click(ContractsApprovalPageObjects.submitContractApprovalBTN());
//        logger.addScreenshot("Submit contract for approval");
//    }
//
//    public void enterOTPForApproval(String otp) throws Exception {
//        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.OTPButton(), 20);
//        Browser.setText(ContractsApprovalPageObjects.OTPButton(), otp);
//        logger.addScreenshot("Entered OTP");
//    }
//
//    public void clickVerifyIdentityBTN() throws Exception {
//        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.verifyIdentityBTN(), 20);
//        Browser.click(ContractsApprovalPageObjects.verifyIdentityBTN());
//        logger.addScreenshot("");
//    }
//
//    public void verifyApprovalIsSubmitted() throws Exception {
//        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.approvalSubmittedText(), 20);
//        Assert.assertTrue(Browser.isElementPresent(ContractsApprovalPageObjects.approvalSubmittedText()));
//        logger.addScreenshot("");
//    }
//
//    public void verifyContractStatusIsRegistered() throws Exception {
//        Browser.waitForSeconds(3);
//        Browser.executeJSScroll(450);
//        Browser.waitForSeconds(3);
//        boolean status = false;
//        String [] expectedStatus = {"Registered", "مُسجل"};
//        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.contractStatus(), 35);
//        Browser.waitForSeconds(2);
//        String actualStatus = Browser.getWebElement(AddResidentialContract2PageObjects.contractStatus()).getText();
//        Browser.executeJSScroll(1000);
//        System.out.println("Contract status : " + actualStatus);
//        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])){
//            Assert.assertTrue(true);
//            status = true;
//        }
//        Browser.waitForSeconds(1);
//        Assert.assertTrue(status);
//        logger.addScreenshot("Contract Status : " + actualStatus);
//    }
//
//    public void verifyContractStatusIsActivated() throws Exception {
//        Browser.waitForSeconds(3);
//        Browser.executeJSScroll(450);
//        Browser.waitForSeconds(3);
//        boolean status = false;
//        String [] expectedStatus = {"Active", "نشط"};
//        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.contractStatus(), 35);
//        Browser.waitForSeconds(2);
//        String actualStatus = Browser.getWebElement(AddResidentialContract2PageObjects.contractStatus()).getText();
//        Browser.executeJSScroll(1000);
//        System.out.println("Contract status : " + actualStatus);
//        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])){
//            status = true;
//        }
//        Assert.assertTrue(status);
//        Browser.waitForSeconds(2);
//        logger.addScreenshot("Contract Status : " + actualStatus);
//    }
//
//    public void verifyContractStatusIsRejected() throws Exception {
//        Browser.waitForSeconds(3);
//        Browser.executeJSScroll(450);
//        Browser.waitForSeconds(3);
//        boolean status = false;
//        String [] expectedStatus = {"Rejected", "مرفوض"};
//        Browser.waitUntilVisibilityOfElement(AddResidentialContract2PageObjects.contractStatus(), 35);
//        Browser.waitForSeconds(2);
//        String actualStatus = Browser.getWebElement(AddResidentialContract2PageObjects.contractStatus()).getText();
//        Browser.executeJSScroll(1000);
//        System.out.println("Contract status : " + actualStatus);
//        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])){
//            status = true;
//        }
////        else {
////            Assert.assertFalse(false);
////        }
//        Assert.assertTrue(status);
//        Browser.waitForSeconds(2);
//        logger.addScreenshot("Contract Status : " + actualStatus);
//    }
//
//
//    public void clickCloseBtnOnPopUp() throws Exception {
//        Browser.waitForSeconds(3);
//        if (Browser.isElementPresent(ContractsApprovalPageObjects.closeBtnOnPopUp())){
//            Browser.click(ContractsApprovalPageObjects.closeBtnOnPopUp());
//        }
//    }

}
