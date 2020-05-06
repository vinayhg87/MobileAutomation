package Android_Automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class UiWebElements extends AppiumCapabilities {

    public void UiElements() throws IOException {

        /* loading the desired capabilities */
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /* Identifying the UI elements using FindElement methods */
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementById("android:id/edit").sendKeys("demoTest");
        driver.findElementsByClassName("android.widget.Button").get(1).click();
    }
}
