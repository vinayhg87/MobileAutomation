package Android_Automation;

import java.net.MalformedURLException;

public class MainCaller {

    public static void main(String[] args) throws MalformedURLException {

        /* automate using findElement methods */
        //UiWebElements webele = new UiWebElements();
        //webele.UiElements();

        /* automate using UIAutomator method */
        //UiAutomatorTool automator = new UiAutomatorTool();
        //automator.UiAutomator();

        /* Automating Gestures */
        MobileGestures gesture = new MobileGestures();
        gesture.gesturesOp();
    }
}
