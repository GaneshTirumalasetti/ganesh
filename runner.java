
package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
glue= {"stepDefinitions"},
plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
monochrome = true
		)
public class runner {

}
