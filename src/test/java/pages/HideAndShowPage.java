package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import util.ElementUtil;

public class HideAndShowPage {

    ElementUtil elementUtil = new ElementUtil();

    private final By firstHideButton = AppiumBy.id("io.appium.android.apis:id/frag1hide");
    private final By secondHideButton = AppiumBy.id("io.appium.android.apis:id/frag2hide");
    private final By firstTextbox = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"io.appium.android.apis:id/saved\").instance(0)");
    private final By secondTextbox = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"io.appium.android.apis:id/saved\").instance(1)");

    public void checkFirstHideButton(){elementUtil.checkElementVisible(firstHideButton);}

    public void checkSecondHideButton(){elementUtil.checkElementVisible(secondHideButton);}

    public void checkFirstTextbox(){elementUtil.checkElementVisible(firstTextbox);}

    public void checkSecondTextbox(){elementUtil.checkElementVisible(secondTextbox);}

    public void clickFirstHideButton(){elementUtil.click(firstHideButton);}

    public void checkFirstTextboxIsHidden(){elementUtil.checkElementVisible(firstTextbox);}

    public void checkFirstHideButtonText(String text){elementUtil.checkElementText(firstHideButton, text);}












}
