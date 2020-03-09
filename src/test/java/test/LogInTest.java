package test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LogInPage;

public class LogInTest{

    private WebDriver driver;

    @Given("^open website on (.*)$")
    public void openWebsiteOnHttpDbankdemoComLogin(String url) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver2");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("^user enter User's (.*) and user (.*)$")
    public void userEnterUserNameAndUserPassword(String name, String password) {
        LogInPage logIn = new LogInPage(driver);
        logIn.enterUserCredentials(name, password);
    }

    @And("^user click on Sign In button$")
    public void userClickOnSignInButton() {
        LogInPage logIn = new LogInPage(driver);
        logIn.clickOnSubmit();
    }

    @Then("^User is logged$")
    public void userIsLogged() {
        LogInPage logIn = new LogInPage(driver);
        Assert.assertTrue(logIn.getConfirmationText().contains("Welcome"));
        logIn.logOut();
    }
}

