package test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/user-login-2.feature",
        plugin = {"pretty", "html:out"})

public class LoginTest2Runner {

}