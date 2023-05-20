package com.goRest;

import com.goRest.utilities.Constant;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;

import static io.restassured.RestAssured.*;

public class UserAPI {
    public static String GET_USER = Constant.BASE_URL + "/public/v2/users";
    public static String POST_USER = Constant.BASE_URL + "/public/v2/users";
    public static String PATCH_USER = Constant.BASE_URL + "/public/v2/users/{user_id}";
    public static String DELETE_USER = Constant.BASE_URL + "/public/v2/users/{user_id}";

    @Step("Get user")
    public void getUsers(String name, String email, String gender, String status) {
        given()
                .queryParam("name", name)
                .queryParam("email", email)
                .queryParam("gender", gender)
                .queryParam("status", status);

    }

    @Step("Post user")
    public void postUsers(String json) {
        given()
                .header("Authorization", "Bearer " + Constant.TOKEN)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Patch user")
    public RequestSpecification patchUsers(String json, String id) {
        return given()
                .header("Authorization", "Bearer " + Constant.TOKEN)
                .pathParam("user_id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Delete user")
    public RequestSpecification deleteUsers(String id, boolean withToken) {
        return given()
                .header("Authorization", withToken ? "Bearer " + Constant.TOKEN : "")
                .pathParam("user_id", id);
    }
}
