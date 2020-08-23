package Android_Automation;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class MobileGestures extends AppiumCapabilities {

    public void gesturesOp() throws IOException {

        /* loading the desired capabilities */
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /* tap() and click() methods performs same action. tap()
        * is implemented in appium (i.e in touchAction class)
        * where as click() is more of webdriver method. */

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        TouchAction touch = new TouchAction(driver);
        WebElement expandableList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        touch.tap(tapOptions().withElement(element(expandableList))).perform();
        WebElement customAdaptor = driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
        touch.tap(tapOptions().withElement(element(customAdaptor))).perform();
        /* long press action on a app */
        WebElement peopleNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        touch.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();
        System.out.println(driver.findElementByXPath("//android.widget.TextView[@text='Sample menu']").getText());

    }
}
