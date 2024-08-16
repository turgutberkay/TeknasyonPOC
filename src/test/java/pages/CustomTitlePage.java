package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import util.ElementUtil;

public class CustomTitlePage {

    ElementUtil elementUtil = new ElementUtil();

    private final By leftTextbox = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
    private final By rightTextbox = AppiumBy.id("io.appium.android.apis:id/right_text_edit");
    private final By leftNavigationBar = AppiumBy.id("io.appium.android.apis:id/left_text");
    private final By rightNavigationBar = AppiumBy.id("io.appium.android.apis:id/right_text");
    private final By changeLeftButton = AppiumBy.id("io.appium.android.apis:id/left_text_button");
    private final By changeRightButton = AppiumBy.id("io.appium.android.apis:id/right_text_button");

    public void checkLeftTextboxText(String text){elementUtil.checkElementText(leftTextbox, text);}
    public void checkRightTextboxText(String text){elementUtil.checkElementText(rightTextbox, text);}
    public void checkLeftNavigationBarText(String text){elementUtil.checkElementText(leftNavigationBar, text);}
    public void checkRightNavigationBarText(String text){elementUtil.checkElementText(rightNavigationBar, text);}
    public void sendKeyLeftTextbox(String text){elementUtil.sendKey(leftTextbox, text);}
    public void clickChangeLeftButton(){elementUtil.click(changeLeftButton);}
    public void sendKeyRightTextbox(String text){elementUtil.sendKey(rightTextbox, text);}
    public void clickChangeRightButton(){elementUtil.click(changeRightButton);}











}
