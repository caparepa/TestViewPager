package me.kasendev.testviewpager.model;

import android.support.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;

/**
 * Created by C. Serrano (cserrano@teravisiontech.com)
 * Teravision Technologies
 * Date: 2018/05/11
 */
public class ResponseBody {

    @SerializedName("data")
    private JSONArray data;

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @Nullable
    @SerializedName("token")
    private String token;

    @Nullable
    @SerializedName("errors")
    private JSONArray errors;

    public JSONArray getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    @Nullable
    public String getToken() {
        return token;
    }

    @Nullable
    public JSONArray getErrors() {
        return errors;
    }
}
