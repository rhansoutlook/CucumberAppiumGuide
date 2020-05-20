package cucumberframework.runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import  io.cucumber.junit.CucumberOptions;

/* added a comment */

@RunWith(Cucumber.class)
@CucumberOptions(
         features = {"src/test/resources/features/Accessibility"},
         glue =    {"cucumberframework.steps.Accessibility","cucumberframework.utility"},
         tags ={"@MobileNative"}
)

public class AccessibilityTestRunner {

}
