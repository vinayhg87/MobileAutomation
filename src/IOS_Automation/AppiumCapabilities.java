package IOS_Automation;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.URL;

public class AppiumCapabilities {

    public IOSDriver<IOSElement> capabilities() throws IOException {

        IOSPropertiesReader prop = new IOSPropertiesReader();

        /* Appium capabilities code for IOS - Emulator name is "Iphone 11". This can be found on Xcode app */
        IOSDriver<IOSElement> driver;
        DesiredCapabilities cap = new DesiredCapabilities();
        String device = prop.readProperties("device.type");
        if(device.equals("emulator_device")) {
            /* This is for Emulator */
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        }
        else if(device.equals("real_device")) {
            /* This is a real IOS device */
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
        }
        else {
            System.out.println("Invalid value");
            System.exit(1);
        }

        /* Selecting browser option */
        String appType = prop.readProperties("app.type");
        if(appType.equalsIgnoreCase("chrome")) {
            String chromeDriverPath = prop.readProperties("chrome.driver.path");
            cap.setCapability("chromedriverExecutable",chromeDriverPath);
            cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        }
        else if (appType.equalsIgnoreCase("app")){
            /* Loading IOS APP */
            String appPath = prop.readProperties("app.path");
            cap.setCapability(MobileCapabilityType.APP, appPath);
        }
        else {
            System.out.println("Invalid Value");
            System.exit(1);
        }

        driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        return driver;
    }
}
