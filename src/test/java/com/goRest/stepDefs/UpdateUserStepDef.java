package com.goRest.stepDefs;

import com.goRest.UserAPI;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;

import static io.restassured.RestAssured.*;

public class UpdateUserStepDef {

    @Steps
    UserAPI userAPI;

    String json;
    String id;

    @Given("update user with valid ID and request body")
    public void updateUserWithValidIDAndRequestBody() {
        Response response = given().get(UserAPI.GET_USER);
        JsonPath jsonPathEvaluator = response.jsonPath();
        Gson gson = new Gson();
        json = gson.toJson(jsonPathEvaluator.getList("").get(0));
        id = jsonPathEvaluator.get("[0].id").toString();

    }

    @When("send request patch user with valid params")
    public void sendRequestPatchUserWithValidParams() {
        userAPI.patchUsers(json, id)
                .when().patch(UserAPI.PATCH_USER);
    }

}
