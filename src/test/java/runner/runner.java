package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features", glue = "stepDefinitions", dryRun = false,
        tags = "@getBalance", monochrome = true, publish = true, plugin = {"pretty", "html:target/cucumber-reports/report.html", "rerun:target/failed_scenarios.txt"}
)
public class runner {
}
