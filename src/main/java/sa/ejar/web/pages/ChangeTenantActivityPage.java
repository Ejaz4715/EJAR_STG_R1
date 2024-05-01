package sa.ejar.web.pages;

import com.testcrew.web.Browser;
import sa.ejar.web.objects.ChangeTenantActivityPageObjects;

public class ChangeTenantActivityPage {


    public void clickOnCancelBTN (){
        Browser.waitUntilVisibilityOfElement(ChangeTenantActivityPageObjects.PopUpAlertAfterCancel(), 40);
        Browser.waitForSeconds(2);
        Browser.click(ChangeTenantActivityPageObjects.PopUpAlertAfterCancel());
    }
}
