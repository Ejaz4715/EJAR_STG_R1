package sa.ejar.api.repo;

import com.testcrew.api.UnirestAPI;
import com.testcrew.manager.ReportManager;
import com.testcrew.manager.TestDataManager;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

import java.util.Map;

public class LoginAPI extends UnirestAPI {
    public static final ReportManager logger = new ReportManager(LoginAPI.class);

    // API functions
    public HttpResponse<JsonNode> login(Map<String, String> data) throws Exception {
        Map<String, String> apiData = TestDataManager.getTestDataAsMap("APIDetails", "Login");
//        processRequestURL(apiData);
        // Payload Processing
        String payload = apiData.get("RequestPayload");
        payload = payload.replace("{username}", data.get("Username"));
        payload = payload.replace("{password}", data.get("Password"));
        apiData.put("RequestPayload", payload);
        return getResponse(apiData);
    }

    // Wait functions

    // Verify functions

    // Assert functions
    public void assertLoginResponse(HttpResponse<JsonNode> response) {
        UnirestAPI.assertResponseCode(response, "200");
        UnirestAPI.assertResponseMessage(response, "");
    }
}
