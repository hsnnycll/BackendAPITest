package com.goRest.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import com.goRest.UserAPI;
import net.thucydides.core.annotations.Steps;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetUserStepDef {

    @Steps
    UserAPI userAPI;

    Response response;

    @Given("the user without parameter")
    public void theUserWithoutParameter() {
        given();
    }

    @When("sent request user")
    public void sentRequestUser() {
        when().get(UserAPI.GET_USER);
    }

    @Given("the user with gender {string}")
    public void theUserWithoutTokenWithParameter(String gender) {
        userAPI.getUsers("", "", gender, "");
    }

    @And("validate data user gender should be {string}")
    public void validateFirstDataUserGenderShouldBeGender(String parameter) {
        expect().body("gender", everyItem(hasToString(parameter)));
    }

    @Given("the user with name {string}")
    public void theUserWithName(String name) {
        userAPI.getUsers(name, "", "", "");
    }

    @And("validate data user name should be contain {string}")
    public void validateFirstDataUserNameShouldBeContain(String name) {
        expect().body("name", everyItem(containsStringIgnoringCase(name)));
    }

    @Given("the user with status {string}")
    public void theUserWithStatus(String status) {
        userAPI.getUsers("", "", "", status);
    }

    @And("validate data user status should be {string}")
    public void validateFirstDataUserStatusShouldBe(String status) {
        expect().body("status", everyItem(hasToString(status)));
    }

    @Given("the user with email {string}")
    public void theUserWithEmail(String email) {
        userAPI.getUsers("", email, "", "");
    }

    @And("validate data user email should be contain {string}")
    public void validateFirstDataUserEmailShouldBe(String email) {
        expect().body("email", everyItem(containsStringIgnoringCase(email)));
    }
}
