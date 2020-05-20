package cucumberframework.steps.Views;

import cucumberframework.utility.Hook;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class ToggleViewButtons_Steps {

    private AndroidDriver<AndroidElement> driver;
    public  ToggleViewButtons_Steps() {
        this.driver = Hook.getDriver();
    }


    @Given("that I am in the Views \\/ Buttons option")
    public void that_I_am_in_the_Views_Buttons_option() {

        // access the accessibility option from Opening Screen
        driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
/*
        // access the accessibility Service option
        driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility Service']")).click();
        // Click the button at the bottom of the screen to go further
        driver.findElement(By.xpath("//android.widget.ImageButton[@index=1]")).click();
*/
    }



    @When("I click the on \\/ off toggle button")
    public void i_click_the_on_off_toggle_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("the views should toggle on and off")
    public void the_views_should_toggle_on_and_off() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }



}
