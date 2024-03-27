package sa.ejar.api;

import sa.ejar.api.repo.LoginAPI;

public class NHCAPI {

    public final LoginAPI loginApi;

    public NHCAPI() {
        loginApi = new LoginAPI();
    }
}