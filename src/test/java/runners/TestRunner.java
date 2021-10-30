package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"step_definitions"},
        plugin = {"pretty", "html:target/cucumber-reports/index.html"},
        monochrome = true,
        tags = "@smoke"
)
public class TestRunner {
}