package cucumberframework.utility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.BeforeClass;

public class Hook {

    private static AndroidDriver<AndroidElement> driver;
    private static DesiredCapabilities desiredCapabilities;
    private static String AppName = null;
    private static String DeviceName = null;

    @Before("@MobileNative")
    //@BeforeClass()
    public void setUp() throws IOException {

      //  System.out.println("I am in SetUp()");
        if (AppName == null) {
            AppName = PropertyContainer.getProperties().getProperty("AppName");
        }

        if (DeviceName == null) {
            DeviceName = PropertyContainer.getProperties().getProperty("DeviceName");
        }

        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AVDNougat");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");

        File applicationDir = new File("src//test//resources//App//" );
        File application = new File(applicationDir, AppName);
        desiredCapabilities.setCapability(MobileCapabilityType.APP,   application.getAbsolutePath());

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown()
    {
        driver.quit();
        //System.out.println("I am in tearDown()");
    }

    public static AndroidDriver<AndroidElement> getDriver()
    {
        return driver;
    }
}


