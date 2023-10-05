package starter.pages;

import jdk.internal.access.JavaIOFileDescriptorAccess;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
    @Step("validate page home or error {string}")
    public void validatePageHomeOrError(String messagefield) {
        switch (messagefield){
            case "Format Email tidak valid.":
                Assert.assertEquals($(erroemailinvalid()).getText(), (messagefield));
                break;
            case "Password atau email anda salah.":
                Assert.assertEquals($(errorpassinvalid()).getText(), (messagefield));
                break;
            case "Email dan Password anda salah.":
                Assert.assertEquals($(erroemailinvalid()).getText(), ("Format Email tidak valid."));
                Assert.assertEquals($(errorpassinvalid()).getText(), ("Password atau email anda salah."));
                break;
            case "Email dan Password harus diisi.":
                Assert.assertEquals($(erroremailempty()).getText(), ("Email harus diisi."));
                Assert.assertEquals($(errorpassempty()).getText(), ("Password harus diisi."));
                break;
            case "Email harus diisi.":
                Assert.assertEquals($(erroremailempty()).getText(), (messagefield));
                break;
            case "Password harus diisi.":
                Assert.assertEquals($(errorpassempty()).getText(), (messagefield));
                break;
            case "Password harus di antara 6 dan 30.":
                Assert.assertEquals($(errorpassmaxmin()).getText(), (messagefield));
                break;
            default:
                Assert.assertEquals($(validpagedashbord()).getText(), (messagefield));
                break;
        }
    }

}
