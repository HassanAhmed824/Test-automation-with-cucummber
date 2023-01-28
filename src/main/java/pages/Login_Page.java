package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
    //vars
    WebDriver driver;
    //constructor
    public Login_Page(WebDriver _driver)
    {
        driver=_driver;
    }
    //elements
    By username_field=By.id("username");
    By password_field= By.id("password");
    By login_button=By.className("radius");
    By errormsg=By.id("flash");

    //actions
    public void insertUsername(String username){
        driver.findElement(username_field).sendKeys(username);
    }
    public void insertPassword(String password){
        driver.findElement(password_field).sendKeys(password);
    }
    public void clickOnLoginBtn(){
        driver.findElement(login_button).click();
    }
    public boolean ErorrMsg()
    {
        String msg =driver.findElement(errormsg).getText();
        return msg.contains("your username is invalid");

    }
}
