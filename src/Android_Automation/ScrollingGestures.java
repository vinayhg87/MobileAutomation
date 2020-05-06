package Android_Automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScrollingGestures extends AppiumCapabilities {

    public void scrollingUI() throws IOException {

        /* loading the desired capabilities */
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));").click();

    }
}