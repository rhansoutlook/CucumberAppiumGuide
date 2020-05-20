package cucumberframework.steps;

import cucumberframework.utility.Hook;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;


public class SetTextDisplaySize_StepDefinitions {

    private AndroidDriver<AndroidElement> driver;

    public SetTextDisplaySize_StepDefinitions() {
        this.driver = Hook.getDriver();
    }


    @Given("^that user is on the Display Size option$")
    public void that_user_is_on_the_display_size_option() throws Throwable {

        // access the accessibility option from the opening screen of the app
        driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility']")).click();
        // access the accessibility Service option from Accessibility
        driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility Service']")).click();
        // Click the button at the bottom of the screen to go further
        driver.findElement(By.xpath("//android.widget.ImageButton[@index=1]")).click();
        //(To resume from here)
        driver.findElement(By.xpath("(//android.widget.LinearLayout)[2]")).click();
    }

    @When("^user clicks the plus icon$")
    public void user_clicks_the_plus_icon() throws Throwable {

    }

    @When("^user clicks the minus icon$")
    public void user_clicks_the_minus_icon() throws Throwable {

    }

    @Then("^user should be able to set the size to default$")
    public void user_should_be_able_to_set_the_size_to_default() throws Throwable {

    }

    @Then("^user should be able to set the Dispay size to small$")
    public void user_should_be_able_to_set_the_dispay_size_to_small() throws Throwable {

    }

    @And("^the size is not set to Default$")
    public void the_size_is_not_set_to_default() throws Throwable {

    }

    @And("^the size is not set to Small$")
    public void the_size_is_not_set_to_small() throws Throwable {

    }

}



