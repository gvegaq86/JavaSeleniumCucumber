package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue = {"steps"},
        plugin = {"pretty", "json:json-report/cucumber.json"},
        tags = "@P300"
)
public class Run {
}
