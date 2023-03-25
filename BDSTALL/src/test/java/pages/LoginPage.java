package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(name = "Email")
    WebElement txtEmail;
    @FindBy(name = "Password")
    WebElement txtPassword;
    @FindBy(xpath = "//input[@value='Login']")
    WebElement btnLogin;
    public LoginPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    public void doLogin(String username, String password){
        txtEmail.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.click();
    }
}
