package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class InventoryStockPage extends PageObject {
    private By validatePersediaan() {
        return By.xpath("//*[text() = 'Persediaan']");
    }
    private By buttonPenyesuaianPersediaan() {
        return By.className("//*[@class=\"ladda-button btn btn-primary m-l-xs\"]");
    }
    private By pilihBarang() {
        return By.className("//*[@class=\"text-muted\"]");
    }
    private By clickBarang() {
        return By.id("//*[@data-item-id=\"289\"]");
    }
    private By qtyFiled() {
        return By.className("//*[@class=\"react-grid-Cell\"][2]/div");
    }
    private By hrgFiled() {
        return By.className("//*[@class=\"react-grid-Cell\"][3]/div");
    }
    private By keteranganFiled() {
        return By.className("//*[@class=\"react-grid-Cell\"][6]/div");
    }
    private By buttonSimpan() {
        return By.xpath("//*[text() = 'Simpan']");
    }
    private By errorTeks() {
        return By.xpath("//*[text() = 'Minimal harus ada 1 barang']");
    }

    @Step
    public void openLinkInventory() {
        openAt("/home/inventory");
    }
    @Step
    public void validatePagePersedian() {
        $(validatePersediaan()).getTextValue();
    }
    @Step
    public void btnPenyesuaianPersedian() {
        $(buttonPenyesuaianPersediaan()).click();
    }
    @Step
    public void btnPilihBarang() {
        $(pilihBarang()).click();
    }
    @Step
    public void btnBarang() {
        $(clickBarang()).click();
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
    public void notifikasiError() {
        $(errorTeks()).getTextValue();
    }
}
