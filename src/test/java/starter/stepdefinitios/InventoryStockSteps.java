package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InventoryStockSteps {
    @Given("an inventory adjustment button click")
    public void fillsInTheWithValidDataEmail() throws InterruptedException {
        Thread.sleep(500);
    }

    @And("validate the inventory adjustment page")
    public void validateTheInventoryAdjustmentPage() {

    }

    @When("you select an item")
    public void youSelectAnItem() {

    }

    @And("fill in quality {string} data, fill in cost price {string}")
    public void fillInQualityDataFillInCostPrice(String qty, String price3) {

    }

    @Then("validate the name {string} successfully")
    public void validateTheNameSuccessfully(String name) {

    }

    @And("Login {string}, {string}, click button login")
    public void loginClickButtonLogin(String email, String pass) {
    }
}
