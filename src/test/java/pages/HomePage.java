package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import util.ElementUtil;

public class HomePage {

    ElementUtil elementUtil = new ElementUtil();
    private final By homePage = AppiumBy.androidUIAutomator("new UiSelector().text(\"API Demos\")");


    public void checkHomePage() {elementUtil.checkElementVisible(homePage);}


}
