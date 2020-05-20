package cucumberframework.steps.Accessibility;

import cucumberframework.utility.Hook;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SetCaptionToggle_Steps {

    private AndroidDriver<AndroidElement> driver;
    private static String previousState;
    private static String currentState;

    public  SetCaptionToggle_Steps() {
        this.driver = Hook.getDriver();
    }

    @Given("that I am on the Captions option")
    public void that_I_am_on_the_Captions_option() {

        // access the accessibility option from Opening Screen
        driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility']")).click();
        // access the accessibility Service option
        driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility Service']")).click();
        // Click the button at the bottom of the screen to go further
        driver.findElement(By.xpath("//android.widget.ImageButton[@index=1]")).click();
        // Access the Captions Option
        driver.findElement(By.xpath("//android.widget.TextView[@text='Captions']")).click();
    }

    @When("I click the caption toggle switch")
    public void i_click_the_caption_toggle_switch() {

        //Save the current State of the Switch
        previousState = driver.findElement(By.xpath("//android.widget.Switch[@index=1]")).getText();
       System.out.println("I was " + previousState);
        // Click the switch
        driver.findElement(By.xpath("//android.widget.Switch[@index=1]")).click();
    }

    @Then("I should be able to set the caption toggle to on or off")
    public void i_should_be_able_to_set_the_caption_toggle_to_on_or_off() {

        currentState = driver.findElement(By.xpath("//android.widget.Switch[@index=1]")).getText();
        System.out.println("Now I am  " + currentState);
        if (previousState == "ON")
        {
            Assert.assertEquals(currentState,"OFF");
        }
        else if (previousState == "OFF")
        {
            Assert.assertEquals(currentState,"ON");
        }
    }
}
