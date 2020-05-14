package cucumberframework.runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

/* added a comment */

@RunWith(Cucumber.class)
@CucumberOptions(
         features = {"src/test/resources/features"},
         glue =    {"cucumberframework.steps"}
)

public class AppiumAPKTestRunner {

}
