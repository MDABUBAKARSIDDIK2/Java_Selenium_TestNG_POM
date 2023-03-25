package testrunner;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.Signoutpage;
import pages.UpdateProfilePage;
import setup.Setup;

public class TestRunner extends Setup {
    @Test (priority = 0, description = "User can successfully login with valid credentials")
    public void Login() throws InterruptedException {
        LoginPage loginPage= new LoginPage(driver);
        driver.get("https://www.bdstall.com/userLogin/");
        loginPage.doLogin("rudrokhan37@gmail.com","mdabubakarsiddik");
        Thread.sleep(4000);
    }
    @Test(priority = 1, description = "user can comment a product ")
    public void doHomepage() throws InterruptedException {
        HomePage homePage= new HomePage(driver);
        Actions actions = new Actions(driver);
        actions.moveToElement(homePage.elementComputer).perform();
        Thread.sleep(500);
        actions.moveToElement(homePage.elementPcLaptop).perform();
        Thread.sleep(500);
        actions.moveToElement(homePage.elementLaptop).perform();
        Thread.sleep(500);
        homePage.elementServer.click();
        homePage.serverpc.click();
        homePage.txtfeedback.sendKeys("good");
        homePage.submitbutton.click();
    }
   @Test(priority = 2 , description = "user can update profile details")
   public void doUploadProfilePage()  throws InterruptedException {
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(driver);
        updateProfilePage.doupdateprofile();
        Thread.sleep(4000);
        updateProfilePage.choosefile.sendKeys("C:\\Users\\mdabu\\Desktop\\email.png");
        updateProfilePage.submit.click();

    }
    @Test (priority = 3,description = "User can sussessfully signout")
    public void doSignoutpage() throws InterruptedException {
        Signoutpage signoutpage = new Signoutpage(driver);
        signoutpage.dosignout();
    }


}
