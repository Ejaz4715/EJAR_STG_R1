package sa.ejar.api.login;

import java.util.Map;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import org.testng.Assert;
import org.testng.annotations.Test;
import sa.ejar.api.base.NHCAPITest;

public class TC01_LoginValid extends NHCAPITest {

    @Test(dataProvider = "testDataProvider")
    public void loginValid(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        logger.info("Step 01: Login to Application Enter Username, Enter Password, click Login");
        HttpResponse<JsonNode> response = api.loginApi.login(data);
        api.loginApi.assertResponse(response, "200");
        logger.info("Step 02: Validate Response");
        String token = String.valueOf(response.getBody().getObject().getString("token"));
        Assert.assertNotEquals(token, "", "Response body token.");
        logger.pass("Response body token is " + token);
    }

    @Test(dataProvider = "testDataProvider")
    public void TC_RenewalContractAPI(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        api.apiCollection.makeContractReadyForRenewal(data);
    }
}
