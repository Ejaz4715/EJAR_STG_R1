package sa.ejar.web.objects.precondition;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map;

public class AddPropertyPageObjects {
    static Map<String, Map<String, String>> objects = new HashMap<>() {{
        // Add Property Button
        put("button-add-property", new HashMap<>() {{
            put("en", "//a[contains(text(),'Properties')]");
            put("ar", "//a[contains(text(),'العقارات')]");
        }});
        // Create New Property Button
        put("button-create-new-property", new HashMap<>() {{
            put("en", "//span[contains(text(),'Create new property')]/parent::div");
            put("ar", "//span[contains(text(),'إضافة عقار جديد')]/parent::div");
        }});
        // Add Ownership Document Button
        put("button-add-ownership-document", new HashMap<>() {{
            put("en", "//a[contains(text(),' Add Ownership document ')]");
            put("ar", "//a[contains(text(),'إضافة وثيقة ملكية')]");
        }});

        // DDL Select Ownership Document Type
        put("dropdown-ownership-document-type", new HashMap<>() {{
            put("en", "//select[@data-name=\"ownership_document_type\"]");
            put("ar", "//select[@data-name=\"ownership_document_type\"]");
        }});
        // Issued Date Text
        put("text-issued-date", new HashMap<>() {{
            put("en", "//input[@data-name=\"issued_date\"]");
            put("ar", "//input[@data-name=\"issued_date\"]");
        }});
        // Document Number Text
        put("text-document-number", new HashMap<>() {{
            put("en", "//input[@data-name=\"document_number\"]");
            put("ar", "//input[@data-name=\"document_number\"]");
        }});

        // Create New Button
        put("button-create-new", new HashMap<>() {{
            put("en", "//button[contains(text(),' Create new ')]");
            put("ar", "//button[contains(text(),'أنشئ جديد')]");
        }});
        //Upload File
        put("input-file", new HashMap<>() {{
            put("en", "//input[@type=\"file\"]");
            put("ar", "//input[@type=\"file\"]");
        }});

        //Button Confirm Ownership Document
        put("button-confirm-ownership-document", new HashMap<>() {{
            put("en", "//button[contains(text(),'Confirm ownership document')]");
            put("ar", "//button[contains(text(),' تأكيد وثيقة الملكية ')]");
        }});
        // Add An Individual Button
        put("button-add-an-individual", new HashMap<>() {{
            put("en", "//a[contains(text(),'Add an individual')]");
            put("ar", "//a[contains(text(),' إضافة مالك فرد ')]");
        }});

        // Property Owner Radio Button
        put("radio-button-property-owner", new HashMap<>() {{
            put("en", "//label[text()=' Property Owner ']");
            put("ar", "//label[text()=' مالك العقار ']");
        }});
        // National ID Radio Button
        put("radio-button-national-id", new HashMap<>() {{
            put("en", "//input[@value=\"national_id\"]");
            put("ar", "//input[@value=\"national_id\"]");
        }});
        // National ID Number Text
        put("text-national-id-number", new HashMap<>() {{
            put("en", "//label[contains(text(),'National ID number')]/following-sibling::div/descendant::input ");
            put("ar", "//label[contains(text(),'رقم الهوية الوطنية')]/following-sibling::div/descendant::input");
        }});
        //Date Of Birth Text
        put("text-date-of-birth", new HashMap<>() {{
            put("en", "//label[contains(text(),'Date of birth')]/following-sibling::div/descendant::input");
            put("ar", "//label[contains(text(),'تاريخ الميلاد')]/following-sibling::div/descendant::input");
        }});
        // Continue Button
        put("button-continue", new HashMap<>() {{
            put("en", "//button[contains(text(),'Continue')]");
            put("ar", "//button[contains(text(),' التالي ')]");
        }});
        // Phone Number Text
        put("text-phone-number", new HashMap<>() {{
            put("en", "//input[@formcontrolname=\"nationalNumber\"]");
            put("ar", "//input[@formcontrolname=\"nationalNumber\"]");
        }});
        // Dropdown Region
        put("dropdown-region", new HashMap<>() {{
            put("en", "//select[@data-name=\"region\"]");
            put("ar", "//select[@data-name=\"region\"]");
        }});
        ///////////////////////////////////////
        // Dropdown City
        put("dropdown-city", new HashMap<>() {{
            put("en", "//app-custom-select[@formcontrolname=\"city\"]");
            put("ar", "//app-custom-select[@formcontrolname=\"city\"]");
        }});

        // Search Text
        put("text-search", new HashMap<>() {{
            put("en", "//app-custom-select[@formcontrolname=\"city\"]//input[@placeholder=\"Search\"]");
            put("ar", "//app-custom-select[@formcontrolname=\"city\"]//input[@placeholder=\"Search\"]");
        }});
        // Select City
        put("select-city", new HashMap<>() {{
            put("en", "//app-custom-option[1]");
            put("ar", "//app-custom-option[1]");
        }});

/////////////////////////////////////////////////////
        // Confirm Button
        put("button-confirm", new HashMap<>() {{
            put("en", "//button[contains(text(),'Confirm')]");
            put("ar", "//button[contains(text(),' تأكيد ')]");
        }});
        // Add New Property Button
        put("button-add-new-property", new HashMap<>() {{
            put("en", "//a[contains(text(),' Add new property ')]");
            put("ar", "//a[contains(text(),'إضافة عقار جديد')]");
        }});
        // Dropdown Property Type
        put("dropdown-property-type", new HashMap<>() {{
            put("en", "//select[@data-name=\"property_type\"]");
            put("ar", "//select[@data-name=\"property_type\"]");
        }});
        // Dropdown Property Usage
        put("dropdown-property-usage", new HashMap<>() {{
            put("en", "//select[@data-name=\"property_usage\"]");
            put("ar", "//select[@data-name=\"property_usage\"]");
        }});
        // Property Number Text
        put("text-property-number", new HashMap<>() {{
            put("en", "//input[@formcontrolname=\"property_number\"]");
            put("ar", "//input[@formcontrolname=\"property_number\"]");
        }});
        //Total Floors Text
        put("text-total-floors", new HashMap<>() {{
            put("en", "//input[@formcontrolname=\"total_floors\"]");
            put("ar", "//input[@formcontrolname=\"total_floors\"]");
        }});
        //Units Per Floor Text
        put("text-units-per-floor", new HashMap<>() {{
            put("en", "//input[@formcontrolname=\"units_per_floor\"]");
            put("ar", "//input[@formcontrolname=\"units_per_floor\"]");
        }});
        //Property Name Text
        put("text-property-name", new HashMap<>() {{
            put("en", "//input[@formcontrolname=\"property_name\"]");
            put("ar", "//input[@formcontrolname=\"property_name\"]");
        }});
        //Postal Code Text
        put("text-postal-code", new HashMap<>() {{
            put("en", "//input[@formcontrolname=\"postal_code\"]");
            put("ar", "//input[@formcontrolname=\"postal_code\"]");
        }});
        //Building Number Text
        put("text-building-number", new HashMap<>() {{
            put("en", "//input[@formcontrolname=\"building_number\"]");
            put("ar", "//input[@formcontrolname=\"building_number\"]");
        }});
        //Additional Number Text
        put("text-additional-number", new HashMap<>() {{
            put("en", "//input[@formcontrolname=\"additional_number\"]");
            put("ar", "//input[@formcontrolname=\"additional_number\"]");
        }});
        //Confirm Property Details Button
        put("button-confirm-property-details", new HashMap<>() {{
            put("en", "//button[contains(text(),' Confirm property details ')]");
            put("ar", "//button[contains(text(),'لتأكيد')]");
        }});
        //Add New Unit Button
        put("button-add-new-unit", new HashMap<>() {{
            put("en", "//a[contains(text(),' Add new unit')]");
            put("ar", "//a[contains(text(),' إضافة وحدة جديدة ')]");
        }});
        //Unit Number Text
        put("button-unit-number", new HashMap<>() {{
            put("en", "//input[@formcontrolname=\"unit_number\"]");
            put("ar", "//input[@formcontrolname=\"unit_number\"]");
        }});
        //Dropdown Unit Type
        put("dropdown-unit-type", new HashMap<>() {{
            put("en", "//select[@data-name=\"unit_type\"]");
            put("ar", "//select[@data-name=\"unit_type\"]");
        }});
        //Floor Number Text
        put("text-floor-number", new HashMap<>() {{
            put("en", "//input[@formcontrolname=\"floor_number\"]");
            put("ar", "//input[@formcontrolname=\"floor_number\"]");
        }});
        //Area Text
        put("text-area", new HashMap<>() {{
            put("en", "//input[@formcontrolname=\"area\"]");
            put("ar", "//input[@formcontrolname=\"area\"]");
        }});
        //Number Of Rooms Text
        put("text-number-of-rooms", new HashMap<>() {{
            put("en", "//input[@formcontrolname=\"rooms\"]");
            put("ar", "//input[@formcontrolname=\"rooms\"]");
        }});
        //Confirm Property Units Button
        put("button-confirm-property-units", new HashMap<>() {{
            put("en", "//span[contains(text(),'Confirm property units')] /parent::button ");
            put("ar", "//span[contains(text(),'تأكيد')] /parent::button ");
        }});
        //Save And Continue Later Button
        put("button-save-and-continue-later", new HashMap<>() {{
            put("en", "//button[contains(text(),'Save and continue later')]");
            put("ar", "//button[contains(text(),' الحفظ والمتابعة لاحقًا ')]");
        }});
        //Filter Button
        put("button-filter", new HashMap<>() {{
            put("en", "//button[contains(@class,'btn-filter')]/span");
            put("ar", "//button[contains(@class,'btn-filter')]/span");
        }});
        //Property Added Assert
        put("assert-property-name", new HashMap<>() {{
            put("en", "//app-single-property");
            put("ar", "//app-single-property");
        }});
        put("button-view-all-properties", new HashMap<>() {{
            put("en", "//span[contains(text(),'View all properties')]/parent::div");
            put("ar", "//span[contains(text(),'عرض جميع العقارات')]/parent::div");
        }});

        put("button-upload-property-attachment", new HashMap<>() {{
            put("en", "//a[contains(text(),' Add new attachment ')]");
            put("ar", "//a[contains(text(),' إضافة مرفق جديد ')]");
        }});
        put("text-error-message", new HashMap<>() {{
            put("en", "//p[@class=\"error\"]");
            put("ar", "//p[@class=\"error\"]");
        }});

        //////////////////////////////////////////////////////////////////more fields//////
        put("TXT_Issued_By", new HashMap<>() {{
            put("ar", "//input[@formcontrolname=\"issued_by\"]");
        }});
        put("TXT_Issued_Place", new HashMap<>() {{
            put("ar", "//input[@formcontrolname=\"issue_place\"]");
        }});
        put("TXT_Established_Date", new HashMap<>() {{
            put("ar", "//input[@data-name=\"established_date\"]");
        }});

        put("TXT_Email", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"email\"]");
        }});
        put("TXT_Postal_Code", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"postal_code\"]");
        }});
        put("TXT_Street_Name", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"street_name\"]");
        }});
        put("TXT_Building_Number", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"building_number\"]");
        }});
        put("TXT_Additional_Number", new HashMap<>(){{
            put ("ar", "//input[@formcontrolname=\"additional_number\"]");
        }});

        put("Switch_BTN_Facilities_Available", new HashMap<>() {{
            put("ar", "//app-switch-input[@formcontrolname='facilities_available']//span[@class='slider enable-transitions']");
        }});
        put("TXT_Parking_Cars", new HashMap<>() {{
            put("ar", "//label[text()='مواقف السيارات']/following-sibling::div/input");
        }});
        put("TXT_Elevators", new HashMap<>() {{
            put("ar", "//label[text()='مصاعد']/following-sibling::div/input");
        }});
        put("TXT_Security_Entrances", new HashMap<>() {{
            put("ar", "//label[text()='مداخل الأمن']/following-sibling::div/input");
        }});
        put("TXT_The_Gym", new HashMap<>() {{
            put("ar", "//label[text()='مراكز اللياقة البدنية']/following-sibling::div/input");
        }});

        put("TXT_Guard_Service", new HashMap<>() {{
            put("ar", "//label[text()='خدمة حراسة']/following-sibling::div/input");
        }});
        put("TXT_Transfer_Service", new HashMap<>() {{
            put("ar", "//label[text()='خدمة نقل']/following-sibling::div/input");
        }});
        put("TXT_Laundry", new HashMap<>() {{
            put("ar", "//label[text()='مغسل ملابس']/following-sibling::div/input");
        }});
        put("TXT_Cafeteria", new HashMap<>() {{
            put("ar", "//label[text()='مطعم وجبات خفيفة']/following-sibling::div/input");
        }});
        put("TXT_Grocery_Store", new HashMap<>() {{
            put("ar", "//label[text()='دكان بقالة']/following-sibling::div/input");
        }});
        put("TXT_Baby_Nursery", new HashMap<>() {{
            put("ar", "//label[text()='حضانة أطفال']/following-sibling::div/input");
        }});
        put("TXT_Children_Playground", new HashMap<>() {{
            put("ar", "//label[text()='ملعب أطفال']/following-sibling::div/input");
        }});
        put("TXT_Games_Room", new HashMap<>() {{
            put("ar", "//label[text()='صالة ألعاب (بلياردو، كرة الطاولة، إلخ)']/following-sibling::div/input");
        }});
        put("TXT_Swimming_Pool", new HashMap<>() {{
            put("ar", "//label[text()='حوض سباحة']/following-sibling::div/input");
        }});
        put("TXT_Football_Yard", new HashMap<>() {{
            put("ar", "//label[text()='ملعب كرة القدم']/following-sibling::div/input");
        }});
        put("TXT_Basketball_Court", new HashMap<>() {{
            put("ar", "//label[text()='ملعب كرة السلة']/following-sibling::div/input");
        }});
        put("TXT_Volleyball_Court", new HashMap<>() {{
            put("ar", "//label[text()='ملعب الكرة الطائرة']/following-sibling::div/input");
        }});
        put("TXT_Tennis_Court", new HashMap<>() {{
            put("ar", "//label[text()='ملعب كرة المضرب']/following-sibling::div/input");
        }});
        put("TXT_Banquet_Hall", new HashMap<>() {{
            put("ar", "//label[text()='قاعة مناسبات']/following-sibling::div/input");
        }});
        put("Switch_BTN_Property_Is_Part_Of_Compound", new HashMap<>() {{
            put("ar", "//app-switch-input[@formcontrolname='is_compound_property_part']//span[@class='slider enable-transitions']");
        }});
        put("TXT_Compound_Name", new HashMap<>() {{
            put("ar", "//input[@formcontrolname=\"compound_name\"]");
        }});
        put("DDL_Unit_Direction", new HashMap<>() {{
            put("ar", "//select[@data-name=\"unit_direction\"]");
        }});
        put("DDL_Unit_Finishing", new HashMap<>() {{
            put("ar", "//select[@data-name=\"unit_finishing\"]");
        }});
        put("TXT_Unit_Front_Length", new HashMap<>() {{
            put("ar", "//input[@formcontrolname=\"unit_front_length\"]");
        }});
        put("TXT_Unit_Length", new HashMap<>() {{
            put("ar", "//input[@formcontrolname=\"length\"]");
        }});
        put("TXT_Unit_Width", new HashMap<>() {{
            put("ar", "//input[@formcontrolname=\"width\"]");
        }});
        put("TXT_Unit_Height", new HashMap<>() {{
            put("ar", "//input[@formcontrolname=\"height\"]");
        }});
        put("Checkbox_Mezzanine", new HashMap<>() {{
            put("ar", "//input[@data-name=\"include_mezzanine\"]/following-sibling::label");
        }});
        put("Checkbox_Is_Furnished", new HashMap<>() {{
            put("ar", "//input[@data-name=\"is_furnished\"]/following-sibling::label");
        }});
        put("DDL_Furnish_Type", new HashMap<>() {{
            put("ar", "//select[@data-name=\"furnish_type\"]");
        }});
        put("Switch_BTN_Amenities_Available", new HashMap<>() {{
            put("ar", "//app-switch-input[@formcontrolname='amenities_available']//span[@class='slider enable-transitions']");
        }});


        put("TXT_Bedrooms", new HashMap<>() {{
            put("ar", "//label[text()='غرف نوم']/following-sibling::div/input");
        }});
        put("TXT_Bathroom_Full", new HashMap<>() {{
            put("ar", "//label[text()='دورة مياه']/following-sibling::div/input");
        }});
        put("TXT_Halls", new HashMap<>() {{
            put("ar", "//label[text()='صالات']/following-sibling::div/input");
        }});
        put("TXT_Maid_Room", new HashMap<>() {{
            put("ar", "//label[text()='غرفة الخادمة']/following-sibling::div/input");
        }});
        put("TXT_Kitchen", new HashMap<>() {{
            put("ar", "//label[text()='مطبخ']/following-sibling::div/input");
        }});
        put("TXT_Storeroom", new HashMap<>() {{
            put("ar", "//label[text()='مخزن']/following-sibling::div/input");
        }});
        put("TXT_Backyard", new HashMap<>() {{
            put("ar", "//label[text()='الفناء الخلفي']/following-sibling::div/input");
        }});
        put("TXT_Majles", new HashMap<>() {{
            put("ar", "//label[text()='مجلس']/following-sibling::div/input");
        }});
        put("TXT_Central_AC", new HashMap<>() {{
            put("ar", "//label[text()='مكيف مركزي']/following-sibling::div/input");
        }});
        put("TXT_Split_Unit", new HashMap<>() {{
            put("ar", "//label[text()='مكيف سبليت']/following-sibling::div/input");
        }});
        put("TXT_Desert_Cooler", new HashMap<>() {{
            put("ar", "//label[text()='مكيف صحراوي']/following-sibling::div/input");
        }});
        put("TXT_Window_AC", new HashMap<>() {{
            put("ar", "//label[text()='مكيف نافذة']/following-sibling::div/input");
        }});
        put("Checkbox_Is_Kitchen_Sink_Installed", new HashMap<>() {{
            put("ar", "//div[contains(text(),'حوض مطبخ راكب')]");
        }});
        put("Checkbox_Is_Cabinet_Installed", new HashMap<>() {{
            put("ar", "//label[text()=' نعم ']");
        }});
        put("Switch_BTN_Utilities", new HashMap<>() {{
            put("ar", "//app-switch-input[@formcontrolname='utilities_available']//span[@class='slider enable-transitions']");
        }});

        put("TXT_Electricity", new HashMap<>() {{
            put("ar", "//label[text()='عداد كهرباء']/following-sibling::div/input");
        }});
        put("TXT_Gas", new HashMap<>() {{
            put("ar", "//label[text()='عداد غاز']/following-sibling::div/input");
        }});
        put("TXT_Water", new HashMap<>() {{
            put("ar", "//label[text()='عداد مياه']/following-sibling::div/input");
        }});
        put("TXT_Parking_Lots", new HashMap<>() {{
            put("ar", "//input[@formcontrolname=\"number_of_parking_lots\"]");
        }});
        put("TXT_Units_Clone", new HashMap<>() {{
            put("ar", "//input[@formcontrolname=\"number_of_units_required_to_clone\"]");
        }});
        put("City_Search_Input", new HashMap<>() {{
            put("ar", "//label[text() = 'المدينة']/ancestor::app-form-field/descendant::input[@placeholder=\"البحث\"]");
        }});



    }};


    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }



    //Add Property Button

    public static By getButtonAddProperty() throws Exception {
        return By.xpath(get("button-add-property"));
    }
    //Create New Property Button

    public static By getButtonCreateNewProperty() throws Exception {
        return By.xpath(get("button-create-new-property"));
    }

    //Add Ownership Document Button
    public static By getButtonAddOwnershipDocument() throws Exception {
        return By.xpath(get("button-add-ownership-document"));
    }

    // DDL Select Ownership Document Type
    public static By getDropdownOwnershipDocumentType() throws Exception {
        return By.xpath(get("dropdown-ownership-document-type"));
    }


    // Issued Date Text
    public static By getTextIssuedDate() throws Exception {
        return By.xpath(get("text-issued-date"));
    }

    // Document Number Text
    public static By getTextDocumentNumber() throws Exception {
        return By.xpath(get("text-document-number"));
    }


    // Create New Button
    public static By getButtonCreateNew() throws Exception {
        return By.xpath(get("button-create-new"));
    }
    // Create New Button
    public static By getUploadFile() throws Exception {
        return By.xpath(get("input-file"));
    }

    //Button Confirm Ownership Document
    public static By getButtonConfirmOwnershipDocument() throws Exception {
        return By.xpath(get("button-confirm-ownership-document"));
    }
    // Add An Individual Button
    public static By getButtonAddAnIndividual() throws Exception {
        return By.xpath(get("button-add-an-individual"));
    }
    // Property Owner Radio Button
    public static By getRadioButtonPropertyOwner() throws Exception {
        return By.xpath(get("radio-button-property-owner"));
    }
    // National ID Radio Button
    public static By getRadioButtonNationalId() throws Exception {
        return By.xpath(get("radio-button-national-id"));
    }
    // National ID Number Text
    public static By getTextNationalIdNumber() throws Exception {
        return By.xpath(get("text-national-id-number"));
    }
    // National ID Number Text
    public static By getTextDateOfBirth() throws Exception {
        return By.xpath(get("text-date-of-birth"));
    }
    // Continue Button
    public static By getButtonContinue() throws Exception {
        return By.xpath(get("button-continue"));
    }
    // Phone Number Text
    public static By getTextPhoneNumber() throws Exception {
        return By.xpath(get("text-phone-number"));
    }
    // Phone Number Text
    public static By getDropdownRegion() throws Exception {
        return By.xpath(get("dropdown-region"));
    }
    //Dropdown City

    public static By getDropdownCity() throws Exception {
        return By.xpath(get("dropdown-city"));
    }
    //Select City
    public static By getSelectCity() throws Exception {
        return By.xpath(get("select-city"));
    }
    //
    // Confirm Button
    public static By getButtonConfirm() throws Exception {
        return By.xpath(get("button-confirm"));
    }
    // Add New Property Button
    public static By getButtonAddNewProperty() throws Exception {
        return By.xpath(get("button-add-new-property"));
    }
    // DDL Property Type
    public static By getDropdownPropertyType() throws Exception {
        return By.xpath(get("dropdown-property-type"));
    }
    // DDL Property Usage
    public static By getDropdownPropertyUsage() throws Exception {
        return By.xpath(get("dropdown-property-usage"));
    }
    //Property Number Text
    public static By getTextPropertyNumber() throws Exception {
        return By.xpath(get("text-property-number"));
    }
    //Total Floors Text
    public static By getTextTotalFloors() throws Exception {
        return By.xpath(get("text-total-floors"));
    }
    //Units Per Floor Text
    public static By getTextUnitsPerFloor() throws Exception {
        return By.xpath(get("text-units-per-floor"));
    }
    //Property Name Text
    public static By getTextPropertyName() throws Exception {
        return By.xpath(get("text-property-name"));
    }

    //Postal Code Text
    public static By getTextPostalCode() throws Exception {
        return By.xpath(get("text-postal-code"));
    }
    //Building Number Text
    public static By getTextBuildingNumber() throws Exception {
        return By.xpath(get("text-building-number"));
    }
    //Additional Number Text
    public static By getTextAdditionalNumber() throws Exception {
        return By.xpath(get("text-additional-number"));
    }
    //Confirm Property Details Button
    public static By getButtonConfirmPropertyDetails() throws Exception {
        return By.xpath(get("button-confirm-property-details"));
    }
    //Add New Unit Button
    public static By getButtonAddNewUnit() throws Exception {
        return By.xpath(get("button-add-new-unit"));
    }
    //Unit Number Text
    public static By getTextUnitNumber() throws Exception {
        return By.xpath(get("button-unit-number"));
    }
    // DDL Unit Type
    public static By getDropdownUnitType() throws Exception {
        return By.xpath(get("dropdown-unit-type"));
    }
    //Floor Number Text
    public static By getTextFloorNumber() throws Exception {
        return By.xpath(get("text-floor-number"));
    }
    //Area Text
    public static By getTextArea() throws Exception {
        return By.xpath(get("text-area"));
    }
    //Number Of Rooms Text
    public static By getTextNumberOfRooms() throws Exception {
        return By.xpath(get("text-number-of-rooms"));
    }
    //Confirm Property Units Button
    public static By getButtonConfirmPropertyUnits() throws Exception {
        return By.xpath(get("button-confirm-property-units"));
    }
    //Save And Continue Later Button
    public static By getButtonSaveAndContinueLater() throws Exception {
        return By.xpath(get("button-save-and-continue-later"));
    }
    //Filter Button
    public static By getButtonFilter() throws Exception {
        return By.xpath(get("button-filter"));
    }
    //Property Name Number Assert
    public static By getAssertProperty() throws Exception {
        return By.xpath(get("assert-property-name"));
    }
    //Ownership Number Assert
    public static By getButtonViewAllProperties() throws Exception {
        return By.xpath(get("button-view-all-properties"));
    }

    public static By getButtonUploadPropertyAttachment() throws Exception {
        return By.xpath(get("button-upload-property-attachment"));
    }

    public static By getTextErrorMessage() throws Exception {
        return By.xpath(get("text-error-message"));
    }

    public static By TXTIssuedBy() throws Exception {
        return By.xpath(get("TXT_Issued_By"));
    }
    public static By TXTIssuedPlace() throws Exception {
        return By.xpath(get("TXT_Issued_Place"));
    }
    public static By TXTEstablishedDate() throws Exception {
        return By.xpath(get("TXT_Established_Date"));
    }


    public static By TXTEmail() throws Exception{
        return By.xpath(get("TXT_Email"));
    }
    public static By TXTPostalCode() throws Exception{
        return By.xpath(get("TXT_Postal_Code"));
    }
    public static By TXTStreetName() throws Exception{
        return By.xpath(get("TXT_Street_Name"));
    }
    public static By TXTBuildingNumber() throws Exception{
        return By.xpath(get("TXT_Building_Number"));
    }
    public static By TXTAdditionalNumber() throws Exception{
        return By.xpath(get("TXT_Additional_Number"));
    }

    public static By SwitchBTNFacilitiesAvailable() throws Exception {
        return By.xpath(get("Switch_BTN_Facilities_Available"));
    }
    public static By TXTParkingCars() throws Exception {
        return By.xpath(get("TXT_Parking_Cars"));
    }

    public static By TXTElevators() throws Exception {
        return By.xpath(get("TXT_Elevators"));
    }
    public static By TXTSecurityEntrances() throws Exception {
        return By.xpath(get("TXT_Security_Entrances"));
    }
    public static By TXTTheGym() throws Exception {
        return By.xpath(get("TXT_The_Gym"));
    }
    public static By TXTGuardService() throws Exception {
        return By.xpath(get("TXT_Guard_Service"));
    }

    public static By TXTTransferService() throws Exception {
        return By.xpath(get("TXT_Transfer_Service"));
    }
    public static By TXTLaundry() throws Exception {
        return By.xpath(get("TXT_Laundry"));
    }
    public static By TXTCafeteria() throws Exception {
        return By.xpath(get("TXT_Cafeteria"));
    }
    public static By TXTGroceryStore() throws Exception {
        return By.xpath(get("TXT_Grocery_Store"));
    }
    public static By TXTBabyNursery() throws Exception {
        return By.xpath(get("TXT_Baby_Nursery"));
    }
    public static By TXTChildrenPlayground() throws Exception {
        return By.xpath(get("TXT_Children_Playground"));
    }
    public static By TXTGamesRoom() throws Exception {
        return By.xpath(get("TXT_Games_Room"));
    }
    public static By TXTSwimmingPool() throws Exception {
        return By.xpath(get("TXT_Swimming_Pool"));
    }
    public static By TXTFootballYard() throws Exception {
        return By.xpath(get("TXT_Football_Yard"));
    }
    public static By TXTBasketballCourt() throws Exception {
        return By.xpath(get("TXT_Basketball_Court"));
    }
    public static By TXTVolleyballCourt() throws Exception {
        return By.xpath(get("TXT_Volleyball_Court"));
    }
    public static By TXTTennisCourt() throws Exception {
        return By.xpath(get("TXT_Tennis_Court"));
    }
    public static By TXTBanquetHall() throws Exception {
        return By.xpath(get("TXT_Banquet_Hall"));
    }
    public static By SwitchBTNPropertyIsPartOfCompound() throws Exception {
        return By.xpath(get("Switch_BTN_Property_Is_Part_Of_Compound"));
    }
    public static By TXTCompoundName() throws Exception {
        return By.xpath(get("TXT_Compound_Name"));
    }
    public static By DDLUnitDirection() throws Exception {
        return By.xpath(get("DDL_Unit_Direction"));
    }
    public static By DDLUnitFinishing() throws Exception {
        return By.xpath(get("DDL_Unit_Finishing"));
    }
    public static By TXTUnitFrontLength() throws Exception {
        return By.xpath(get("TXT_Unit_Front_Length"));
    }
    public static By TXTUnitLength() throws Exception {
        return By.xpath(get("TXT_Unit_Length"));
    }
    public static By TXTUnitWidth() throws Exception {
        return By.xpath(get("TXT_Unit_Width"));
    }
    public static By TXTUnitHeight() throws Exception {
        return By.xpath(get("TXT_Unit_Height"));
    }
    public static By CheckboxMezzanine() throws Exception {
        return By.xpath(get("Checkbox_Mezzanine"));
    }
    public static By CheckboxIsFurnished() throws Exception {
        return By.xpath(get("Checkbox_Is_Furnished"));
    }
    public static By DDLFurnishType() throws Exception {
        return By.xpath(get("DDL_Furnish_Type"));
    }
    public static By SwitchBTNAmenitiesAvailable() throws Exception {
        return By.xpath(get("Switch_BTN_Amenities_Available"));
    }


    public static By TXTBedrooms() throws Exception {
        return By.xpath(get("TXT_Bedrooms"));
    }
    public static By TXTBathroomFull() throws Exception {
        return By.xpath(get("TXT_Bathroom_Full"));
    }
    public static By TXTHalls() throws Exception {
        return By.xpath(get("TXT_Halls"));
    }
    public static By TXTMaidRoom() throws Exception {
        return By.xpath(get("TXT_Maid_Room"));
    }
    public static By TXTKitchen() throws Exception {
        return By.xpath(get("TXT_Kitchen"));
    }
    public static By TXTStoreroom() throws Exception {
        return By.xpath(get("TXT_Storeroom"));
    }
    public static By TXTBackyard() throws Exception {
        return By.xpath(get("TXT_Backyard"));
    }
    public static By TXTMajles() throws Exception {
        return By.xpath(get("TXT_Majles"));
    }
    public static By TXTCentralAC() throws Exception {
        return By.xpath(get("TXT_Central_AC"));
    }
    public static By TXTSplitUnit() throws Exception {
        return By.xpath(get("TXT_Split_Unit"));
    }
    public static By TXTDesertCooler() throws Exception {
        return By.xpath(get("TXT_Desert_Cooler"));
    }
    public static By TXTWindowAC() throws Exception {
        return By.xpath(get("TXT_Window_AC"));
    }
    public static By CheckboxIsKitchenSinkInstalled() throws Exception {
        return By.xpath(get("Checkbox_Is_Kitchen_Sink_Installed"));
    }
    public static By CheckboxIsCabinetInstalled() throws Exception {
        return By.xpath(get("Checkbox_Is_Cabinet_Installed"));
    }

    public static By SwitchBTNUtilities() throws Exception {
        return By.xpath(get("Switch_BTN_Utilities"));
    }
    public static By TXTElectricity() throws Exception {
        return By.xpath(get("TXT_Electricity"));
    }
    public static By TXTGas() throws Exception {
        return By.xpath(get("TXT_Gas"));
    }
    public static By TXTWater() throws Exception {
        return By.xpath(get("TXT_Water"));
    }
    public static By TXTParkingLots() throws Exception {
        return By.xpath(get("TXT_Parking_Lots"));
    }
    public static By TXTUnitsClone() throws Exception {
        return By.xpath(get("TXT_Units_Clone"));
    }

    public static By CitySearchInput() throws Exception {
        return By.xpath(get("City_Search_Input"));
    }
}
