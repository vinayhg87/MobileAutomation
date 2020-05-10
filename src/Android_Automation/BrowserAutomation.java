package Android_Automation;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BrowserAutomation extends AppiumCapabilities{

    public void chromeBrowser() throws IOException {

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElementByClassName("gLFyf").sendKeys("Demotest");
        /* in order to scroll the webpage on browser */
        /* JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,480)", "");*/
        driver.close();

    }
}
