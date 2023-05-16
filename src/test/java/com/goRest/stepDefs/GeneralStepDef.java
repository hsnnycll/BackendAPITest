package com.goRest.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class GeneralStepDef {

    @Then("should return status code {int}")
    public void shouldReturnStatusCode(int statusCode) {
        expect().statusCode(statusCode);
    }

    @And("response body message should be {string}")
    public void responseBodyPageShouldBe(String message) {
        given().then().body("message", equalTo(message));
    }

}
