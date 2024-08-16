package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import util.ElementUtil;

public class ContextMenuPage {

    ElementUtil elementUtil = new ElementUtil();

    private final By longPressMeButton = AppiumBy.accessibilityId("Long press me");
    private final By menuAButton = AppiumBy.androidUIAutomator("new UiSelector().text(\"Menu A\")");
    private final By menuBButton = AppiumBy.androidUIAutomator("new UiSelector().text(\"Menu B\")");


    public void checkLongPressMeButton(){elementUtil.checkElementVisible(longPressMeButton);}
    public void longPressLongPressMeButton(){elementUtil.longPress(longPressMeButton);}
    public void checkMenuALayout(){elementUtil.checkElementVisible(menuAButton);}
    public void checkMenuBLayout(){elementUtil.checkElementVisible(menuBButton);}












}
