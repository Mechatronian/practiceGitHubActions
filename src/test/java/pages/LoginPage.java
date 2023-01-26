package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://the-internet.herokuapp.com/login
public class LoginPage {

    WebDriver driver;

    @FindBy(id = "username")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button")
    public WebElement buttonLogin;

    public void setInputUsername(String username) {
      inputUsername.sendKeys(username);
    }

    public void setInputPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickButtonLogin() {
        buttonLogin.click();

    }

    public SecureAreaPage LoginApp(String username, String password){
        setInputUsername(username);
        setInputPassword(password);
        clickButtonLogin();
        return new SecureAreaPage(driver);
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}