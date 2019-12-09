package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="stepDefinitions",
		plugin= {"html:target/cucumber-html-report"}
		)

public class TestRunner {

}
