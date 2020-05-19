package cucumberframework.steps;

import cucumberframework.utility.Hook;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IncreaseMyPreferenceCount_StepDefinitions {

    private AndroidDriver<AndroidElement> driver;

    public IncreaseMyPreferenceCount_StepDefinitions()
    {
        this.driver = (AndroidDriver<AndroidElement>) Hook.getDriver();
    }
    
    @Given("that I am Advanced preferences option")
    public void that_I_am_Advanced_preferences_option() {

        driver.findElement(By.xpath("//android.widget.TextView[@text='Preferences']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='6. Advanced preferences']")).click();
    }

    @When("I click on the My preference option")
    public void i_click_on_the_My_preference_option() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("the My preference current count should be increased by one")
    public void the_My_preference_current_count_should_be_increased_by_one() {
        // Write code here that turns the phrase above into concrete actions

    }

}
