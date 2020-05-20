package cucumberframework.runner;

        import io.cucumber.junit.Cucumber;
        import org.junit.runner.RunWith;
        import  io.cucumber.junit.CucumberOptions;

/* added a comment */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/System"},
        glue =    {"cucumberframework.steps.System","cucumberframework.utility"},
        tags ={"@MobileNative"}
)

public class SystemTestRunner {
}

