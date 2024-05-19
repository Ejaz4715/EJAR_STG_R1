package sa.ejar.api;

import sa.ejar.api.repo.APICollection;
import sa.ejar.api.repo.LoginAPI;

public class NHCAPI {

    public final LoginAPI loginApi;
    public final  APICollection apiCollection;

    public NHCAPI() {
        loginApi = new LoginAPI();
        apiCollection = new APICollection();
    }

}