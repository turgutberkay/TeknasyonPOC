package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class Hooks {

    DriverFactory driverFactory = new DriverFactory();
    public static String capabilities;
    public static AppiumDriver driver;

    @Before
    public void launchBrowser(Scenario scenario) throws MalformedURLException {
        //Son kelimeyi almak
        String scenarioName = scenario.getName();
        String[] words = scenarioName.split(" ");
        String lastWord = words[words.length - 1];
        //
        capabilities = lastWord;
        driver = driverFactory.setDriver(capabilities);
    }

    @After
    public void after() {
        ((AndroidDriver) driver).terminateApp("io.appium.android.apis");
        driver.quit();
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "failed_login.png");
        }
    }
}
