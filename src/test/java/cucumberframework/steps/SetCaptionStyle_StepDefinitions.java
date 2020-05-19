package cucumberframework.steps;

import cucumberframework.utility.Hook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class SetCaptionStyle_StepDefinitions {

    private WebDriver driver;

    public SetCaptionStyle_StepDefinitions() {
        this.driver = Hook.getDriver();
    }


    @Given("that I am on the Captions style option")
    public void that_I_am_on_the_Captions_style_option() {


    }

    @When("I click the black on white option")
    public void i_click_the_black_on_white_option() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I should be able to set the caption style to Black on white")
    public void i_should_be_able_to_set_the_caption_style_to_Black_on_white() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I click the white on black option")
    public void i_click_the_white_on_black_option() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I should be able to set the caption style to white on black")
    public void i_should_be_able_to_set_the_caption_style_to_white_on_black() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I click the Yellow on Blue option")
    public void i_click_the_Yellow_on_Blue_option() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I should be able to set the caption style to Yellow on Blue")
    public void i_should_be_able_to_set_the_caption_style_to_Yellow_on_Blue() {
        // Write code here that turns the phrase above into concrete actions

    }




}
