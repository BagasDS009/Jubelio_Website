package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class InventoryStockPage extends PageObject {
    private By teksPersediaan() {
        return By.xpath("//*[text() = 'Persediaan']");
    }
    private By teksPenyesuaianPersediaan() {
        return By.xpath("//*[text() = 'Penyesuaian Persediaan']");
    }
    private By buttonPenyesuaianPersediaan() {
        return By.xpath("//*[@class=\"ladda-button btn btn-primary m-l-xs\"]");
    }
    private By pilihBarang() {
        return By.xpath("//*[text() = 'Harap pilih']");
    }
    private By clickBarang() {
        return By.xpath("//*[@data-item-id=\"289\"]");
    }
    private By qtyFiled() {
        return By.xpath("//*[@class=\"react-grid-Canvas\"]/div[2]/div/div/div[2]");
    }
    private By hrgFiled() {
        return By.xpath("//*[@class=\"react-grid-Canvas\"]/div[2]/div/div/div[6]");
    }
    private By keteranganFiled() {
        return By.xpath("//*[@class=\"react-grid-Canvas\"]/div[2]/div/div/div[9]");
    }
    private By buttonSimpan() {
        return By.xpath("//*[text() = 'Simpan']");
    }
    private By search() {
        return By.xpath("//*[@class=\"form-control\"]");
    }
    private By teksBarang() {
        return By.xpath("//*[text() = 'Naruto']");
    }
    private By errorTeks() {
        return By.xpath("//*[text() = 'Minimal harus ada 1 barang']");
    }

    @Step
    public void openUrlInventory() {
        openAt("/home/inventory");
    }
    @Step
    public void validatePagePersedian() {
        $(teksPersediaan()).getTextValue();
    }
    @Step
    public void validatePenyesuaianPersediaa() {
        $(teksPenyesuaianPersediaan()).getTextValue();
    }
    @Step
    public void btnPenyesuaianPersedian() {
        $(buttonPenyesuaianPersediaan()).click();
    }


    @Step
    public void btnPilihBarang() {
        WebElement pilihBarang = $(pilihBarang()).waitUntilVisible();
        Actions actions = new Actions(getDriver());
        actions.doubleClick(pilihBarang).perform();
    }

    @Step
    public void btnBarang() {
        WebElement barang = $(clickBarang()).waitUntilVisible();
        Actions actions = new Actions(getDriver());
        actions.doubleClick(barang).perform();
    }
    @Step
    public void filedQtyPersedian(String qty) {
        $(qtyFiled()).sendKeys(qty);
    }
    @Step
    public void filedHrgPersedian(String hrg) {
        $(hrgFiled()).sendKeys(hrg);
    }
    @Step
    public void filedKeteranganPersedian(String Ket) {
        $(keteranganFiled()).sendKeys(Ket);
    }
    @Step
    public void btnSimpan() {
        $(buttonSimpan()).click();
    }
    @Step
    public void btnQty() {
        $(qtyFiled()).click();
    }
    @Step
    public void btnHrg() {
        $(hrgFiled()).click();
    }
    @Step
    public void fieldSearch(String pencarian) {
        $(search()).sendKeys(pencarian);
    }
    @Step
    public void btnSearch() {
        $(search()).click();
    }
    @Step
    public void validateTeksBarang() {
        $(teksBarang()).getTextValue();
    }
    @Step
    public void notifikasiError() {
        $(errorTeks()).getTextValue();
    }
}
