package com.goRest.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import com.goRest.UserAPI;
import net.thucydides.core.annotations.Steps;

import static io.restassured.RestAssured.*;

public class DeleteUserStepDef {

    @Steps
    UserAPI userAPI;

    String id;
    boolean withToken;

    @Given("delete User with valid ID")
    public void deleteUserWithValidID() {
        Response response = given().get(UserAPI.GET_USER);
        JsonPath jsonPathEvaluator = response.jsonPath();
        id = jsonPathEvaluator.get("[0].id").toString();
        withToken = true;
    }

    @When("send request delete user")
    public void sendRequestDeleteUser() {
        userAPI.deleteUsers(id, withToken).when().delete(UserAPI.DELETE_USER);
    }

}
