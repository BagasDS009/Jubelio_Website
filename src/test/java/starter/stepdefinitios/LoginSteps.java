package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.loginpage;
//throw new io.cucumber.java.PendingException();

public class LoginSteps {
    @Steps
    loginpage Loginpage;


    @Given("fills in the {string} with valid data email")
    public void fillsInTheWithValidDataEmail(String email) throws InterruptedException {
        Thread.sleep(500);
        Loginpage.openLink();
        Loginpage.inputEmailLogin(email);
    }

    @And("fill in the {string} with valid data pass")
    public void fillInTheWithValidDataPass(String password) throws InterruptedException {
        Thread.sleep(500);
        Loginpage.inputPassLogin(password);
    }

    @When("click the login button")
    public void clickTheLoginButton() throws InterruptedException {
        Loginpage.clickbtnlogin();
        Thread.sleep(500);
    }

    @Then("validate page home or error {string}")
    public void validatePageHomeOrError(String message) throws Exception {
        Loginpage.validatePageHomeOrError(message);
    }

//    @Then("validate page home")
//    public void validatePageHome() {
//        Loginpage.validatePageHome();
//    }
}
