package com.goRest.stepDefs;

import com.goRest.utilities.Payload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import com.goRest.UserAPI;
import net.thucydides.core.annotations.Steps;


import static io.restassured.RestAssured.*;

public class CreateUserStepDef {
    @Steps
    UserAPI userAPI;

    Payload payload = new Payload();

    @Given("create user with valid request body")
    public void createUserWithValidRequestBody() {
        userAPI.postUsers(payload.randomBodyRequestPostUser());
    }

    @When("send request post user")
    public void sendRequestPostUser() {
        when().post(UserAPI.POST_USER);
    }

    @Given("create user without request body")
    public void createUserWithoutRequestBody() {
        userAPI.postUsers("");
    }

    @Given("create user without name on request body")
    public void createUserWithoutNameOnRequestBody() {
        String json = "{\n" +
                "  \"gender\": \"male\",\n" +
                "  \"email\": \"tenali.ramakrishnaa1@16ce.com\",\n" +
                "  \"status\": \"active\"\n" +
                "}";
        userAPI.postUsers(json);
    }

}
