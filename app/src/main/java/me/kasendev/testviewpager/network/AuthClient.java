package me.kasendev.testviewpager.network;

import me.kasendev.testviewpager.model.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by C. Serrano (cserrano@teravisiontech.com)
 * Teravision Technologies
 * Date: 2018/05/14
 */
public interface AuthClient {

    @POST("auth/login")
    Call<ResponseBody> login();

    @GET("auth/token")
    Call<ResponseBody> getAuthToken();

    @GET("auth/user")
    Call<ResponseBody> getAuthUser();

}
