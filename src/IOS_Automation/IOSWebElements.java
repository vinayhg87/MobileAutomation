package IOS_Automation;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.io.IOException;

public class IOSWebElements extends AppiumCapabilities {

    public void webElementAutomation() throws IOException {

        IOSDriver<IOSElement> driver = capabilities();
        driver.closeApp();
    }
}
