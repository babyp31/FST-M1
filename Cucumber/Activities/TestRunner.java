package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/Features",
            glue={"StepDefinations"},
            tags="@activity2",
            publish=true,
            plugin={"html:src/reports/HTML-reports.html"}

    )
    public class TestRunner {}

