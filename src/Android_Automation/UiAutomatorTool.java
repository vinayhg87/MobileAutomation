package Android_Automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UiAutomatorTool extends AppiumCapabilities {

    public void UiAutomator() throws MalformedURLException {

        /* loading the desired capabilities */
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /* Syntax : driver.findElementByAndroidUIAutomator("attribute(value)"); */
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        /* driver.findElementByAndroidUIAutomator("text(\"Animation\")").click(); */

        /* validate clickable features for all the options */
        /* Syntax : driver.findElementsByAndroidUIAutomator("new UiSelector.attribute(value)"); */
        List<AndroidElement> clickable = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)");
        System.out.println("The size of clickable fields in entire app page is "+clickable.size());



    }
}
