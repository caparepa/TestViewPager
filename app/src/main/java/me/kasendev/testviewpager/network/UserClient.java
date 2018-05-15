package me.kasendev.testviewpager.network;

import me.kasendev.testviewpager.model.Register;
import me.kasendev.testviewpager.model.ResponseBody;
import me.kasendev.testviewpager.model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by C. Serrano (cserrano@teravisiontech.com)
 * Teravision Technologies
 * Date: 2018/05/14
 */
public interface UserClient {

    @POST("register")
    Call<ResponseBody> register(@Body Register register);

    @GET("users/{id}")
    Call<ResponseBody> getUser(@Path("id") int userId);
}
