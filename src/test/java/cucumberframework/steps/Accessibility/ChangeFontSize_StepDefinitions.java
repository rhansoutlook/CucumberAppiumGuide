package cucumberframework.steps.Accessibility;

import cucumberframework.utility.Hook;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class ChangeFontSize_StepDefinitions {

    private AndroidDriver<AndroidElement> driver;

    public ChangeFontSize_StepDefinitions() {
        this.driver = Hook.getDriver();
    }

    @Given("that I am on Font Size option")
    public void that_I_am_on_Font_Size_option() {
        // access the accessibility option from the opening screen of the app
        driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility']")).click();

        // access the accessibility Service option from Accessibility
        driver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility Service']")).click();

        // Click the button at the bottom of the screen to go further
        driver.findElement(By.xpath("//android.widget.ImageButton[@index=1]")).click();

        driver.findElement(By.xpath("//android.widget.TextView[@text='Font size']")).click();
    }

    @When("I click the default option")
    public void i_click_the_default_option() {
        driver.findElement(By.xpath("//android.widget.RadioButton[@index=1]")).click();
    }

    @Then("The font size should be set to default")
    public void the_font_size_should_be_set_to_default() {

        String getText = driver.findElement(By.id("com.android.settings:id/current_label")).getText();
        //System.out.println("getText "+getText);
        Assert.assertEquals(driver.findElement(By.id("com.android.settings:id/current_label")).getText(),"Default");

    }

    @When("I click the small option")
    public void i_click_the_small_option() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//android.widget.RadioButton[@index=0]")).click();
    }

    @Then("The font size should be set to small")
    public void the_font_size_should_be_set_to_small() {
        String getText = driver.findElement(By.id("com.android.settings:id/current_label")).getText();
        Assert.assertEquals(driver.findElement(By.id("com.android.settings:id/current_label")).getText(),"Small");
    }

}
