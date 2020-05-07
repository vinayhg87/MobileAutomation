package Android_Automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.URL;

public class AppiumCapabilities {

    public AndroidDriver<AndroidElement> capabilities() throws IOException {

        PropertiesReader prop = new PropertiesReader();

        /* Appium capabilities code for android - Emulator name is "Android_Automation_AVD" */
        AndroidDriver<AndroidElement> driver;
        DesiredCapabilities cap = new DesiredCapabilities();
        String device = prop.readProperties("device.type");
        if(device.equals("emulator_device")) {
            /* This is for Emulator */
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android_Automation_AVD");
        }
        else if(device.equals("real_device")) {
            /* This is a real Android device */
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        }
        else {
            System.out.println("Invalid value");
            System.exit(1);
        }

        /* Selecting browser option */
        String appType = prop.readProperties("app.type");
        if(appType.equals("chrome")) {
            cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        }
        else if (appType.equals("apk")){
            /* Loading APK */
            String apkPath = prop.readProperties("apk.path");
            cap.setCapability(MobileCapabilityType.APP, apkPath);
        }
        else {
            System.out.println("Invalid Value");
            System.exit(1);
        }

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        return driver;
    }
}
