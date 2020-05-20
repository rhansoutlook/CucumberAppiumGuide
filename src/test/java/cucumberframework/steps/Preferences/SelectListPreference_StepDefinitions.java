package cucumberframework.steps.Preferences;

import cucumberframework.utility.Hook;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SelectListPreference_StepDefinitions {

    /*Please note that the tests in this feature are designed to fail
    This is to prove a point. That the coding part has got to be cpompleted for a scenario before it passses
    and can be reliably used in production

    in this scenario an attempt has been made to use click method on an android.widget.CheckedTextView.
    That is not the way to do it as per my understanding.

    So I have left this test in a state where it is supposed to fail
    */

    private AndroidDriver<AndroidElement> driver;
    public  SelectListPreference_StepDefinitions() {
        this.driver = Hook.getDriver();
    }


    @Given("that I am in the List Preference option")
    public void that_I_am_in_the_List_Preference_option()
    {
        driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='4. Default values']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='List preference']")).click();
    }

    @When("I select Alpha option {int}")
    public void i_select_Alpha_option(Integer int1) {

        // This coding needs to be completed
        // This is not the right way to select or change the value of a checkedTextView
        driver.findElementByXPath("//android.widget.CheckedTextView[@text='Alpha Option 01']").click();

    }

    @Then("Alpha option {int} should become default option")
    public void alpha_option_should_become_default_option(Integer int1) {

        // Keeping with the spirit of things I am going to make these scenarios fail
        Assert.assertEquals(1,2);


    }

    @When("I select Beta option {int}")
    public void i_select_Beta_option(Integer int1) {

        // This coding needs to be completed
        // This is not the right way to select or change the value of a checkedTextView
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Beta Option 02']")).click();
    }

    @Then("Beta option {int} should become default option")
    public void beta_option_should_become_default_option(Integer int1) {

        // Keeping with the spirit of things I am going to make these scenarios fail
        Assert.assertEquals(1,2);
    }

    @When("I select Charlie option {int}")
    public void i_select_Charlie_option(Integer int1) {

        // This coding needs to be completed
        // This is not the right way to select or change the value of a checkedTextView
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Charlie Option 03']")).click();
    }

    @Then("Charlie option {int} should become default option")
    public void charlie_option_should_become_default_option(Integer int1) {

        // Keeping with the spirit of things I am going to make these scenarios fail
        Assert.assertEquals(1,2);


    }




}
