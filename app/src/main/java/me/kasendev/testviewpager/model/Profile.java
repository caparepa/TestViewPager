package me.kasendev.testviewpager.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by C. Serrano (cserrano@teravisiontech.com)
 * Teravision Technologies
 * Date: 2018/05/11
 */
public class Profile {

    @SerializedName("id")
    private int id;

    @SerializedName("full_name")
    private String fullName;

    @SerializedName("birthdate")
    private String birthdate;

    @SerializedName("user_id")
    private int userId;

    public Profile(int id, String fullName, String birthdate, int userId) {
        this.id = id;
        this.fullName = fullName;
        this.birthdate = birthdate;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
