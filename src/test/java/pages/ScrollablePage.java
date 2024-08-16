package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import util.ElementUtil;

public class ScrollablePage {

    ElementUtil elementUtil = new ElementUtil();

    private final By tabs = AppiumBy.id("android:id/title");
    private final By tabContent = AppiumBy.id("android:id/tabcontent");

    public void scrollToTab(String text){elementUtil.findAndDragElementByText(tabs, text);}

    public void clickTab(String text){elementUtil.click(elementUtil.elementWithTextFromTheElements(tabs, text));}

    public void checkTab30Text(String text){elementUtil.getChildElementWithTextFromTheElements(tabContent,text);}










}
