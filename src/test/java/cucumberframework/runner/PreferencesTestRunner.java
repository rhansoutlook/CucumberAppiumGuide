package cucumberframework.runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import  io.cucumber.junit.CucumberOptions;

/* added a comment */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Preferences"},
        glue =    {"cucumberframework.steps.Preferences","cucumberframework.utility"},
        tags ={"@MobileNative"}
)

public class PreferencesTestRunner {
}

