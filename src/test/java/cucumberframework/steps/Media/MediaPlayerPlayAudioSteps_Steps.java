package cucumberframework.steps.Media;

import cucumberframework.utility.Hook;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MediaPlayerPlayAudioSteps_Steps {

    private AndroidDriver<AndroidElement> driver;
    public MediaPlayerPlayAudioSteps_Steps() {
        this.driver = Hook.getDriver();
    }

    @Given("that I have selected the MediaPlayer option")
    public void that_I_have_selected_the_MediaPlayer_option() {
        driver.findElement(By.xpath("//android.widget.TextView[@text='Media']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='MediaPlayer']")).click();
    }

    @When("I click play audio from resources")
    public void i_click_play_audio_from_resources() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//android.widget.Button[@text='PLAY AUDIO FROM RESOURCES']")).click();
    }

    @Then("the system should play audio")
    public void the_system_should_play_audio() {
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='Playing audio...']")).isDisplayed(), "System is not playing audio");    }


}
