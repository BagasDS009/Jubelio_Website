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
    @Given("Login {string}, {string}, click button login")
    public void loginClickButtonLogin(String email, String pass) throws InterruptedException {
        Thread.sleep(150);
        Loginpage.openLink();
        Loginpage.inputEmailLogin(email);
        Loginpage.inputPassLogin(pass);
        Loginpage.clickbtnlogin();
        Thread.sleep(3000);
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
        Thread.sleep(500);
        inventoryStockPage.btnBarang();
        Thread.sleep(500);
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
        inventoryStockPage.validateTeksBarang(name);

    }

    @And("click {string}")
    public void click(String lokasi) throws InterruptedException {
      Thread.sleep(150);
      inventoryStockPage.btnLokasi();
      Thread.sleep(150);
      inventoryStockPage.btnVarisi(lokasi);
    }

    @And("you detele item {string}")
    public void youDeteleItem(String delete) throws InterruptedException {
        inventoryStockPage.btnPilihBarang();
        Thread.sleep(150);
        inventoryStockPage.btnBarang();
        Thread.sleep(150);
        inventoryStockPage.btnCheckbox();
        Thread.sleep(150);
        inventoryStockPage.btnDelete(delete);

    }

    @Then("validate the name empty")
    public void validateTheNameEmpty() {
        inventoryStockPage.validatePilihBarang();
    }
}
