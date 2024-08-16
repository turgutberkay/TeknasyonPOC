package pages;


import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import util.ElementUtil;

public class IncomingMessagePage {

    ElementUtil elementUtil = new ElementUtil();
    public static String notificationMessage;

    private final By showNotificationButton = AppiumBy.accessibilityId("Show App Notification");
    private final By message = AppiumBy.id("io.appium.android.apis:id/message");

    public void clickShowNotificationButton(){elementUtil.click(showNotificationButton);}

    public void checkCorrectNotificationMessage(){
        notificationMessage = General.notificationMessageText;
        Assert.assertEquals(notificationMessage, elementUtil.elementGetText(message));}













}
