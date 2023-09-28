package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class loginpage extends PageObject {
    private By emailField(){
        return By.xpath("//*[@name=\"email\"]");
    }
    private By passField(){
        return By.xpath("//*[@name=\"password\"]");
    }
    private By btnlogin(){
        return By.xpath("//*[@type=\"submit\"]");
    }
    private By btnlupapass(){
        return By.xpath("//*[text() = 'Lupa Password?']");
    }
    private By btnmakeaccount(){
        return By.xpath("//*[text() = 'Daftar untuk mencoba Jubelio (Gratis)']");
    }
    private By erroemailinvalid(){
        return By.xpath("//*[text() = 'Format Email tidak valid.']");
    }
    private By errorpassinvalid(){
        return By.xpath("//*[text() = 'Password atau email anda salah.']");
    }
    private By erroremailempty(){
        return By.xpath("//*[text() = 'Email harus diisi.']");
    }
    private By errorpassempty(){
        return By.xpath("//*[text() = 'Password harus diisi.']");
    }
    private By errorpassmaxmin(){
        return By.xpath("//*[text() = 'Password harus di antara 6 dan 30.']");
    }
    private By validpagedashbord(){
        return By.xpath("//*[text() = 'Dashboard']");
    }

    @Step
    public void openLink() {
    openAt("/login");
    }
    @Step ("fills in the {string} with valid data email")
    public void inputEmailLogin(String emailfield) {
        $(emailField()).sendKeys(emailfield);
    }
    @Step ("fill in the {string} with valid data pass")
    public void inputPassLogin(String passwordfield) {
        $(passField()).sendKeys(passwordfield);
    }
    @Step
    public void clickbtnlogin() {
        $(btnlogin()).click();    }
//    @Step("validate page home")
//    public void validatePageHome()  {
//                $(validpagedashbord()).getTextValue();
//
//    }
    @Step("validate page home or error {string}")
    public void validatePageHomeOrError(String messagefield) throws Exception {
        switch (messagefield){
            case "Format Email tidak valid.":
                $(erroemailinvalid()).getTextValue();
                break;
            case "Password atau email anda salah.":
                $(errorpassinvalid()).getTextValue();
                break;
            case "Email dan Password anda salah.":
                $(erroemailinvalid()).getTextValue();
                $(erroemailinvalid()).getTextValue();
                break;
            case "Email dan Password harus diisi.":
                $(erroremailempty()).getTextValue();
                $(errorpassempty()).getTextValue();
                break;
            case "Email harus diisi.":
                $(erroremailempty()).getTextValue();
                break;
            case "Password harus diisi.":
                $(errorpassempty()).getTextValue();
                break;
            case "Password harus di antara 6 dan 30.":
                $(errorpassmaxmin()).getTextValue();
                break;
            default:
                $(validpagedashbord()).getTextValue();
                break;
        }
    }

}
