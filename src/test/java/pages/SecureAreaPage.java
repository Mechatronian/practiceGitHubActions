package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://the-internet.herokuapp.com/secure
public class SecureAreaPage {
    WebDriver driver;

    @FindBy(xpath = "//h4")
    public WebElement h4WelcomeTheSecureArea;
    public SecureAreaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getH4WelcomeTheSecureArea() {
        return h4WelcomeTheSecureArea.getText();
    }
}