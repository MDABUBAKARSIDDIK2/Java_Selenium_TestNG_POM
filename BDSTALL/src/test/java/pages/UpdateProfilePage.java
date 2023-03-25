package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfilePage {
    WebDriver driver;
    @FindBy(xpath = "//div[@class='main-header-login-link']")

    public WebElement btnhome;
    @FindBy(xpath = "//a[normalize-space()='Update Profile']")
    public WebElement btnupdateprofile;
    public @FindBy(name = "Gender")
    WebElement clkgender;
    @FindBy(xpath = "//option[normalize-space()='Male']")
    public WebElement selectmale;
    @FindBy(name = "CountryID")
    public WebElement country;
    @FindBy(xpath = "//option[normalize-space()='Bangladesh']")
    public WebElement selectcountry;
    @FindBy(name = "CityID")
    public WebElement city;
    @FindBy(xpath = "//option[@value='5']")
    public WebElement selectcity;
    @FindBy(name = "User_Photo")
    public WebElement choosefile;
    @FindBy(name = "btnSubmit")
    public WebElement submit;
    public UpdateProfilePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void doupdateprofile(){
        btnhome.click();
        btnupdateprofile.click();
        clkgender.click();
        selectmale.click();
        country.click();
        selectcountry.click();
        city.click();
        selectcity.click();

    }
}
