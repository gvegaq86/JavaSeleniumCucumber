package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/firstTest.feature",
        glue = {"StepDefinitions"},
        monochrome = true
)
public class Run extends AbstractTestNGCucumberTests {
}
