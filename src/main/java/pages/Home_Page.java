package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
    //vars
    WebDriver driver;
    //constructor
    public Home_Page(WebDriver _driver)
    {
        driver=_driver;
    }
    //elements
    By form_authentication=By.cssSelector("a[href=\"/login\"]");

    //actions
    public void clickonformbutton()
    {
        driver.findElement(form_authentication).click();
    }

}
