package Android_Automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class AppiumCapabilities {

    public AndroidDriver<AndroidElement> capabilities() throws IOException {

        /* Getting device and browser details from properties file */
        String currentDirectory = System.getProperty("user.dir");
        String androidDevices_prop = currentDirectory + File.separator + "androidDevice.properties";
        Properties prop = new Properties();
        prop.load(new FileInputStream(androidDevices_prop));
        String device = prop.getProperty("device.type");
        String appType = prop.getProperty("app.type");

        /* Appium capabilities code for android - Emulator name is "Android_Automation_AVD" */
        AndroidDriver<AndroidElement> driver;
        DesiredCapabilities cap = new DesiredCapabilities();
        if(device.equals("emulator_device")) {
            /* This is for Emulator */
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android_Automation_AVD");
        }
        else if(device.equals("real_device")) {
            /* This is a real Android device */
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        }
        else
        {
            System.out.println("Invalid value");
            System.exit(1);
        }

        /* Selecting browser option */
        if(appType.equals("Chrome")) {
            cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        }
        else if (appType.equals("apk")){
            /* Loading APK */
            String apkPath=prop.getProperty("apk.path");
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
