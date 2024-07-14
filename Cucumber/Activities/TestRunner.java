package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/Features",
            glue={"StepDefinations"},
            tags="@activity1",
            tags="@activity2",
            tags="@activity3",
            tags="@activity4",
            tags="@activity5",
            publish=true,
            plugin={"html:src/reports/HTML-reports.html"}

    )
    public class TestRunner {}

