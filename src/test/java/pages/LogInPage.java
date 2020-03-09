package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LogInPage extends PageObject{

    public LogInPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id="username")
    private WebElement userName;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="submit")
    private WebElement submitButton;

    @FindBy(xpath = "//div/ol/li[@class='active']")
    private WebElement confirmationText;

    @FindBy(xpath="//div/a/img[@class='user-avatar rounded-circle']")
    private WebElement icon;

    @FindBy(css = ".nav-link")
    private List<WebElement> userNav;

    public void enterUserCredentials(String name, String passwd){
        userName.sendKeys(name);
        password.sendKeys(passwd);
    }

    public void clickOnSubmit(){
        submitButton.click();
    }

    public String getConfirmationText(){
        return confirmationText.getText();
    }

    public void logOut(){
        icon.click();
        userNav.get(2).click();
        driver.quit();
    }
}

