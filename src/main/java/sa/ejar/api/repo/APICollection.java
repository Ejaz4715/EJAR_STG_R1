package sa.ejar.api.repo;

import com.testcrew.api.UnirestAPI;
import kong.unirest.*;
import kong.unirest.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class APICollection extends UnirestAPI {

    public HttpResponse<JsonNode> makeContractReadyForRenewal(Map<String, String> data) throws Exception {
            String json = null;
            json = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src", "main", "resources","ApiDetails","TestRenewalContractAPI.json")));
            String url = data.get("API_URL");
            data.put("RequestURL", url);
            System.out.println("Request URL :"+ url);
            json=json.replace("Contract",data.get("ContractNumber")); //10198484923
            data.put("RequestPayload", json);
            // API Call
            HttpResponse<JsonNode> response = getPostResponse(data);
            JSONObject responseJson = response.getBody().getObject();
            System.out.println("Request Body :"+ responseJson);
            UnirestAPI.assertResponseCode(response, "200");
            //Request Body :{"message":"Done"}
            return response;
        }


    public static HttpResponse<JsonNode> getPostResponse(Map<String, String> data) {
        HttpResponse<JsonNode> response = null;
        Unirest.config().verifySsl(true);
        String url = (String)data.get("RequestURL");
        Map<String, String> headers = getHeaderMap(data);
        String reqPayload = (String)data.get("RequestPayload");
        processRequest(data);
        if (((String)data.get("HTTPMethod")).equalsIgnoreCase("post")) {
            response = ((RequestBodyEntity)Unirest.post(url).body(reqPayload).headers(headers)).asJson();
        }
        assert response != null;
        processResponse(response);
        return response;
    }
    public static Map<String, String> getHeaderMap(Map<String, String> data) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Accept", "text/plain");
        data.put("RequestHeaders", headers.toString());
        return headers;
    }

    public HttpResponse<JsonNode> automaticRenewal(Map<String, String> data) throws Exception {
        String json = null;
        json = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src", "main", "resources","ApiDetails","TestRenewalContractAPI.json")));
        String url = data.get("API_URL");
        data.put("RequestURL", url);
        System.out.println("Request URL :"+ url);
        json = json.replace("Contract",data.get("ContractNumber"));
        data.put("RequestPayload", json);
        // API Call
        HttpResponse<JsonNode> response = getPostResponse(data);
        JSONObject responseJson = response.getBody().getObject();
        System.out.println("Request Body :"+ responseJson);
        return response;
    }
}
