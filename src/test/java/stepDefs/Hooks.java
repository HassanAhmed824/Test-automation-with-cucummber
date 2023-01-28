package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Home_Page;
import pages.Login_Page;
import pages.Secure_Area_Page;

import java.time.Duration;

public class Hooks  {
    static  WebDriver  driver;
    static Login_Page login_obj;
   static Secure_Area_Page secureAreaPag;
   static Home_Page homePageobj;
    @Before
    public static void a_user_opens_chrome_browser() {
      //  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

         login_obj= new Login_Page(driver);
         secureAreaPag=new Secure_Area_Page(driver);
         homePageobj=new Home_Page(driver);


    }
    @After
    public static void the_browser_is_closed() {
        driver.quit();
    }
}
