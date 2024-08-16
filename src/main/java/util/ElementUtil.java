package util;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class ElementUtil {

    WebDriver driver;
    WebDriverWait wait ;
    WebDriverWait wait2 ;
    Actions action;
    TouchAction touchAction;
    public static String randomElementText;
    public static String randomElementIndex;

    public ElementUtil() {
        this.driver = DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, ofSeconds(12));
        this.wait2 = new WebDriverWait(driver, ofSeconds(5));
        this.action = new Actions(driver);
        this.touchAction = new TouchAction((PerformsTouchActions) driver);
    }

    public void goToUrl(String url) {driver.get(url);}

    public void refreshPage() {driver.navigate().refresh();}

    public WebElement presenceElement(By key) {return wait.until(ExpectedConditions.presenceOfElementLocated(key));}

    public List<WebElement> presenceElements(By key) {
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(key));
        return elements;
    }

    public WebElement visibilityElement(WebElement element) {return wait.until(ExpectedConditions.visibilityOf(element));}

    public WebElement visibilityElement(By key) {return wait.until(ExpectedConditions.visibilityOfElementLocated(key));}

    public WebElement findElementClickableShort(By key) {
        try {
            WebElement element = wait2.until(ExpectedConditions.elementToBeClickable(key));
            return element;
        }catch (Exception ignored) {
            return null;
        }
    }
    public WebElement findElementClickableShort(WebElement element) {
        try {
            WebElement returnElement = wait2.until(ExpectedConditions.elementToBeClickable(element));
            return returnElement;
        }catch (Exception ignored) {
            return null;
        }
    }

    public void click(By key) {
        try {
            findElementClickableShort(key).click();
        }catch (Exception e){
            scrollToElement(presenceElement(key));
            wait.until(ExpectedConditions.elementToBeClickable(key)).click();
        }
    }
    public void randomClick() {
        Actions actions = new Actions(driver);
        actions.moveByOffset(200, 200).click().perform();
    }

    public void openNotifications() {((AndroidDriver)driver).openNotifications();}

    public void click(WebElement element) {
        try {
            findElementClickableShort(element).click();
        }catch (Exception e){
            scrollToElement(element);
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        }
    }

    public void longPress(By key) {
        try {
            findElementClickableShort(key);
            action.clickAndHold(presenceElement(key)).pause(ofSeconds(3)) // 3 saniye uzun basma
                    .release()
                    .perform();
        }catch (Exception e){
            scrollToElement(presenceElement(key));
            action.clickAndHold(presenceElement(key)).pause(ofSeconds(3)) // 3 saniye uzun basma
                    .release()
                    .perform();
        }
    }
    public void scrollToElement(WebElement element) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'})", element);
        }catch (Exception ignored){
            Assert.fail("Scroll couldn't be performed");
        }
    }

    public void scrollToText(String text) {
        for(int i = 0 ; i<7 ; i++) {
            WebElement element = presenceElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollTextIntoView(\"" + text + "\")"));
            if (element != null) {
                break;
            } else if (i == 7) {
                Assert.fail("Text bulunamadi");
            }
        }
    }

    public void dragAndDrop(By key) {
        action.clickAndHold(presenceElements(key).get(4))
                .moveByOffset(-450, 0)
                .release()
                .perform();
    }

    public void findAndDragElementByText(By key, String text){
        boolean check = false;
        for(int i = 0; i<12; i++){
            List<WebElement> elements = presenceElements(key);
            for(WebElement element : elements){
                if(element.getText().equals(text)){
                    check = true;
                    break;
                };
            }
            if(check){
                break;
            }
            dragAndDrop(key);
        }
    }

    public void checkElementVisible(By key) {
        presenceElement(key);
        try {
            visibilityElement(key);
        }catch (Exception ignored){
            scrollToElement(presenceElement(key));
            visibilityElement(key);
        }
    }

    public void sendKey(By key, String text) {
        try {
            WebElement element = visibilityElement(key);
            element.clear();
            element.sendKeys(text);
        } catch (Exception ignored) {
            Assert.fail("Element not writing");
        }
    }

    public String elementGetText(By by) {
        String text = null;
        try {
            presenceElement(by);
            text = driver.findElement(by).getText();
            return text;
        } catch (Exception ignored) {
            Assert.fail();
            return null;
        }
    }

    public boolean checkElementVisibleNotError(By key) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(key));
            return true;
        }catch (Exception ignored){
            return false;
        }

    }

    public void checkElementText(By key,String text) {
        presenceElement(key);
        Assert.assertEquals(text, elementGetText(key));
    }

    public String elementGetText(WebElement element) {
        try {
            WebElement returnElement = wait.until(ExpectedConditions.visibilityOf(element));
            return returnElement.getText();
        } catch (Exception ignored) {
            Assert.fail("Element bulunamadı veya texti cekilemedi");
            return null;
        }
    }

    public WebElement elementWithTextFromTheElements(By key, String text) {
        List<WebElement> elements = presenceElements(key);
        boolean check = false;
        WebElement returnElement = null;
        for (WebElement element : elements) {
            if(elementGetText(element).equals(text)){
                check = true;
                returnElement = element;
                break;
            }
        }
        if(!check || returnElement == null){
            Assert.fail("Elementin texti bulunamadi");
        }
        return returnElement;
    }

    public WebElement getChildElementWithTextFromTheElements(By key, String text) {
        presenceElement(key);
        List<WebElement> childElements = presenceElement(key).findElements(By.xpath(".//*"));
        boolean check = false;
        WebElement returnElement = null;
        for (WebElement element : childElements) {
            if(elementGetText(element).equals(text)){
                check = true;
                returnElement = element;
                break;
            }
        }
        if(!check || returnElement == null){
            Assert.fail("Elementin texti bulunamadi");
        }
        return returnElement;
    }

    public WebElement getRandomElementFromElements(By by) {
        Random random = new Random();
        int randomNumber = random.nextInt(presenceElements(by).size()-1);
        randomElementText = getElementIndexFromElements(by,randomNumber).getText();
        randomElementIndex = String.valueOf(randomNumber);
        return getElementIndexFromElements(by,randomNumber);
    }

    public WebElement getElementIndexFromElements(By by, Integer number) {
        return presenceElements(by).get(number);
    }

    public int getElementIntegerIndexFromElements(By by, Integer number) {return Integer.parseInt(presenceElements(by).get(number).getText().replaceAll("[^0-9]", ""));}

    public int getElementSizeFromElements(By by) {
        return presenceElements(by).size();
    }
}
