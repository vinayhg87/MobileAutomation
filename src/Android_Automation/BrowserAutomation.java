package Android_Automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BrowserAutomation extends AppiumCapabilities{

    public void chromeBrowser() throws IOException, InterruptedException {

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElementByClassName("gLFyf").sendKeys("Demo test");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        /* in order to scroll the webpage on browser */
        /* JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,480)", ""); */
        Thread.sleep(4000);
        driver.close();

    }
}
