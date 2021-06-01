package io.github.bhhan.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bhhan.pages.HomePage;
import io.github.bhhan.pages.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import java.util.List;

public class LoginSteps {
    @Autowired
    private HomePage homePage;

    @Autowired
    private LoginPage loginPage;

    @Given("I click login in Home Page")
    public void clickLoginInHomePage(){
        homePage.clickLogin();
    }

    @And("I enter the following for Login")
    public void enterTheFollowingForLogin(DataTable dataTable){
        List<String> data = dataTable.asList();
        loginPage.login(data.get(2), data.get(3));
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        Assert.assertTrue(homePage.isEmployeeDetailsExist());
    }

    @And("I click logout link")
    public void iClickLogoutLink() {
        homePage.clickLogOff();
    }
}
