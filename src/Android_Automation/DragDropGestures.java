package Android_Automation;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class DragDropGestures extends AppiumCapabilities {

    public void dragDropUI() throws IOException {

        /* loading the desired capabilities */
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
        TouchAction action = new TouchAction(driver);
        WebElement source = driver.findElementsByClassName("android.view.View").get(0);
        WebElement dest = driver.findElementsByClassName("android.view.View").get(1);
        action.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(2))).moveTo(element(dest)).release().perform();
    }
}
