package Android_Automation;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class UiSwipeGestures extends AppiumCapabilities {

    public void swipeGestures() throws MalformedURLException {

        /* loading the desired capabilities */
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        /* Since the class has $ special char, the xpath will not detect the xml tag structure. So we can use '//*'  */
        driver.findElementByXPath("//*[@content-desc='9']").click();
        TouchAction action = new TouchAction(driver);
        WebElement firstEle = driver.findElementByXPath("//*[@content-desc='15']");
        WebElement secondEle = driver.findElementByXPath("//*[@content-desc='45']");
        action.longPress(longPressOptions().withElement(element(firstEle)).withDuration(ofSeconds(2))).moveTo(element(secondEle)).release().perform();

    }
}
