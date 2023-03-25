package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signoutpage {
    @FindBy(xpath = "//div[@class='main-header-login-link']")
    WebElement homebutton;
    @FindBy(xpath = "//a[normalize-space()='Sign Out']")
    WebElement signoutbutton;

    public Signoutpage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    public void dosignout(){
        homebutton.click();
        signoutbutton.click();


    }
}
