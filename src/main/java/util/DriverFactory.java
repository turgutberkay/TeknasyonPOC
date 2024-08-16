package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    private static ThreadLocal<AppiumDriver> driverThreadLocal = new ThreadLocal<>();

    public static synchronized AppiumDriver getDriver() {
        return driverThreadLocal.get();
    }

    public synchronized AppiumDriver setDriver(String capabilityString) {
        Boolean[] resetFlags = capabilitiesConfig(capabilityString);
        DesiredCapabilities capabilities;
        try {
            capabilities = getAndroidCaps(resetFlags);
            AndroidDriver androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), capabilities);
            driverThreadLocal.set(androidDriver);
        }catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
            return getDriver();
    }

    public DesiredCapabilities getAndroidCaps(Boolean[] resetFlags) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("app", "/Users/berkayturgut/Desktop/ApiDemos.apk");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("autoAcceptAlerts", true);
        capabilities.setCapability("noReset",resetFlags[0]);
        capabilities.setCapability("fullReset",resetFlags[1]);
        return capabilities;
    }

    public Boolean[] capabilitiesConfig(String capabilities){
        Boolean[] resetFlags = new Boolean[2];
        if (capabilities.equals("fullReset=true")) {
            resetFlags[0] = null;
            resetFlags[1] = true;
        } else if (capabilities.equals("fullReset=false")) {
            resetFlags[0] = null;
            resetFlags[1] = false;
        } else if (capabilities.equals("noReset=true")) {
            resetFlags[0] = true;
            resetFlags[1] = null;
        } else if (capabilities.equals("noReset=false")) {
            resetFlags[0] = false;
            resetFlags[1] = null;
        }else{
            resetFlags[0] = null;
            resetFlags[1] = null;
        }
        return resetFlags;
    }

}
