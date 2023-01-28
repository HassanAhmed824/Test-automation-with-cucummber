package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.Login_Page;
import pages.Secure_Area_Page;
import java.time.Duration;

import static stepDefs.Hooks.*;

public class LoginSteps {

    @When("A user login with a valid username and a valid password")
    public void a_user_login_with_a_valid_username_and_a_valid_password() {
       login_obj.insertUsername("tomsmith");
       login_obj.insertPassword("SuperSecretPassword!");
       login_obj.clickOnLoginBtn();
    }
    @Then("Verify that User is redirected to Secure page")
    public void verify_that_user_is_redirected_to_secure_page() {
        Assert.assertTrue(secureAreaPag.isLogoutBtnDisplayed());

    }
    @When("A user login with invalid username and invalid password")
    public void invalid_login()
    {
        login_obj.insertUsername("invalidusername");
        login_obj.insertPassword("inavalidpassword");
        login_obj.clickOnLoginBtn();
       // driver.findElement(By.id("username")).sendKeys("invalidusername");
       // driver.findElement(By.id("password")).sendKeys("inavalidpassword"+Keys.ENTER);
    }
  //  @Then("The browser is closed")



    @Then("Verify that error message is dispalyed with invalid username")

    public void verifyThatErrorMessageIsDispalyedWithInvalidUsername()
    {
         //Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("Your username is invalid!"));
        Assert.assertTrue(login_obj.ErorrMsg());

    }

    @Given("a user navigates to home page")
    public void aUserNavigatesToHomePage() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @When("a user click on form authentcation")
    public void aUserClickOnFormAuthentcation() {
      homePageobj.clickonformbutton();
        //driver.findElement(By.cssSelector("a[href=\"/login\"]")).click();

    }

    @Then("the user should be directed to home page")
    public void theUserShouldBeDirectedToHomePage() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/login");

    }
}
