package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {
    public WebDriver driver;
    @BeforeClass
    public void Initialize(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @AfterClass
    public void Terminate(){
        driver.quit();
    }

    @Test
    public void SuccessLoginTest(){
        LoginPage herukuApp = new LoginPage(driver);
        String ActualLoginMessage =  herukuApp.LoginApp("tomsmith","SuperSecretPassword!").
                  getH4WelcomeTheSecureArea();
        Assert.assertEquals(ActualLoginMessage,"Welcome to the Secure Area. When you are done click logout below.");
    }

}
