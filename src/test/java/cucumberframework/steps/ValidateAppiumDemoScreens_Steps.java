package cucumberframework.steps;

import cucumberframework.utility.Hook;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ValidateAppiumDemoScreens_Steps {

    private AndroidDriver<AndroidElement> driver;

    public ValidateAppiumDemoScreens_Steps() {this.driver = Hook.getDriver();}

    @Given("I open the application")
    public void i_open_the_application() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Accessibility']")).isDisplayed());
    }

    @When("I tap on Accessibility")
    public void i_tap_on_Accessibility() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@text='Accessibility']")).click();
    }

    @Then("I validate Custom View")
    public void i_validate_Custom_View() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Custom View']")).isDisplayed(), "Custom View is not displayed");
    }


}
