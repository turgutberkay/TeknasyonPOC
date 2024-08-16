package pages;

import io.appium.java_client.AppiumBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import util.ElementUtil;

public class AlertDialogPage {

    ElementUtil elementUtil = new ElementUtil();


    private final By listDialogPanel = AppiumBy.id("android:id/contentPanel");
    private final By listDialogOptions = AppiumBy.id("android:id/text1");
    private final By messageAlert = AppiumBy.id("android:id/message");
    private final By list = AppiumBy.id("io.appium.android.apis:id/screen");


    public void checkListDialogPanel(){elementUtil.checkElementVisible(listDialogPanel);}

    public void clickRandomOptionListDialogPanel(){elementUtil.click(elementUtil.getRandomElementFromElements(listDialogOptions));}

    public void checkSelectedItemAlertMessage(){
        Assert.assertTrue(elementUtil.elementGetText(messageAlert).contains( ElementUtil.randomElementText));
        Assert.assertTrue(elementUtil.elementGetText(messageAlert).contains( ElementUtil.randomElementIndex));
    }

    public void clickMenu(String text){elementUtil.click(elementUtil.getChildElementWithTextFromTheElements(list, text));}












}
