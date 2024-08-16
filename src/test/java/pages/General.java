package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import util.ElementUtil;

public class General {
    ElementUtil elementUtil = new ElementUtil();

    public static String notificationMessageText;
    private final By listHomePage = AppiumBy.id("android:id/list");
    private final By notificationTitle = AppiumBy.id("android:id/title");
    private final By notificationText = AppiumBy.id("android:id/text");


    public void cacheIsCleared(String text) {}

    public void clickMenu(String text) {
        elementUtil.scrollToText(text);
        elementUtil.click(elementUtil.getChildElementWithTextFromTheElements(listHomePage, text));}


    public void openNotificationPanel() {elementUtil.openNotifications();}

    public void checkAppNotificationTitleText(String text) {
        elementUtil.checkElementText(notificationTitle, text);
        notificationMessageText = elementUtil.elementGetText(notificationText);
    }

    public void clickAppNotification() {elementUtil.click(notificationTitle);}




}
