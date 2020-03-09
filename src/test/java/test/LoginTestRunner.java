package test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/user-login-digitalbank.feature",
        plugin = {"pretty", "html:out"})

public class LoginTestRunner {

}
