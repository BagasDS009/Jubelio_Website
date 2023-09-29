package starter.stepdefinitios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.loginpage;
import starter.pages.InventoryStockPage;

public class InventoryStockSteps {
    @Steps
    loginpage  Loginpage;
    @Steps
    InventoryStockPage inventoryStockPage;
    @And("Login {string}, {string}, click button login")
    public void loginClickButtonLogin(String email, String pass) throws InterruptedException {
        Thread.sleep(150);
        Loginpage.openLink();
        Thread.sleep(150);
        Loginpage.inputEmailLogin(email);
        Loginpage.inputPassLogin(pass);
        Thread.sleep(150);
        Loginpage.clickbtnlogin();
        Thread.sleep(1500);
        inventoryStockPage.openUrlInventory();
        Thread.sleep(150);
    }
    @And("an inventory adjustment button click")
    public void fillsInTheWithValidDataEmail() throws InterruptedException {
        Thread.sleep(500);
        inventoryStockPage.validatePagePersedian();
        Thread.sleep(150);
        inventoryStockPage.btnPenyesuaianPersedian();
    }

    @And("validate the inventory adjustment page")
    public void validateTheInventoryAdjustmentPage() throws InterruptedException {
        Thread.sleep(500);
        inventoryStockPage.validatePenyesuaianPersediaa();
    }

    @When("you select an item")
    public void youSelectAnItem() throws InterruptedException {
        inventoryStockPage.btnPilihBarang();
        Thread.sleep(150);
        inventoryStockPage.btnBarang();
    }

    @And("fill in quality {string} data, fill in cost price {string}")
    public void fillInQualityDataFillInCostPrice(String qty, String price) throws InterruptedException {
        Thread.sleep(150);
        inventoryStockPage.filedQtyPersedian(qty);
        Thread.sleep(150);
        inventoryStockPage.filedHrgPersedian(price);
        inventoryStockPage.btnSimpan();
    }

    @Then("validate the name {string} successfully")
    public void validateTheNameSuccessfully(String name) throws InterruptedException {
        Thread.sleep(150);
        inventoryStockPage.validatePagePersedian();
        Thread.sleep(150);
        inventoryStockPage.fieldSearch(name);
        inventoryStockPage.btnSearch();
        Thread.sleep(150);
        inventoryStockPage.validateTeksBarang();

    }
}
