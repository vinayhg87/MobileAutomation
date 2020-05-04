package Android_Automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumCapabilities {

    public AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

        /* appium capabilities code for android - Emulator name is "Android_Automation_AVD" */
        AndroidDriver<AndroidElement> driver;
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android_Automation_AVD");
        cap.setCapability(MobileCapabilityType.APP,"/Users/vinaygopinath/Desktop/Code/Mobile_Automation/Android/ApiDemos-debug.apk");
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        return driver;

    }
}
