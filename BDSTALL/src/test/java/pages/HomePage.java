package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "//a[text()='Computer']")
    public WebElement elementComputer;
    @FindBy(xpath = "(//a[contains(text(),'PC & Laptop')])[1]")
    public WebElement elementPcLaptop;
    @FindBy(xpath = "//a[normalize-space()='Laptop']")
    public WebElement elementLaptop;
    @FindBy(xpath = "//a[normalize-space()='Server']")
    public WebElement elementServer;
    @FindBy(xpath = "//div[contains(text(),'Home')]")
    public WebElement homeNavbar;
    @FindBy(xpath = "(//div[@class='button-link'])[1]")
    public WebElement serverpc;
    @FindBy(name = "UserFeedback")
    public WebElement txtfeedback;
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitbutton;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void dohomepage(){



    }
}
