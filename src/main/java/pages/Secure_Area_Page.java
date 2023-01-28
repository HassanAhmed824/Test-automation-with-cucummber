package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Secure_Area_Page {
    WebDriver driver;
    public Secure_Area_Page(WebDriver driver)

    {
        this.driver=driver;
    }
    //elements
    By logutbtn= By.className("icon-signout");
    By loginmsg=By.id("flash");
    public boolean isLogoutBtnDisplayed(){
        return driver.findElement(logutbtn).isDisplayed();
    }

    public boolean isSuccessfulLoginMsgDisplayed(){
        String successfulLoginMsg = driver.findElement(loginmsg).getText();
        return successfulLoginMsg.contains("You logged into a secure area!");
    }

}
