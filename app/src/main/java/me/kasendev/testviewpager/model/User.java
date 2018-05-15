package me.kasendev.testviewpager.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by C. Serrano (cserrano@teravisiontech.com)
 * Teravision Technologies
 * Date: 2018/05/11
 */
public class User {

    @SerializedName("id")
    private int id;

    @SerializedName("username")
    private String username;

    @SerializedName("email")
    private String email;

    @SerializedName("status")
    private String status;

    @SerializedName("profile")
    private Profile profile;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("deleted_at")
    private String deletedAt;

    public User(String username, String email, String status) {
        this.username = username;
        this.email = email;
        this.status = status;
    }
}
