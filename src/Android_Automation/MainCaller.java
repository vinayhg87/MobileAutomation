package Android_Automation;

import java.io.IOException;

public class MainCaller {

    public static void main(String[] args) throws IOException {

        PropertiesReader prop = new PropertiesReader();
        /* Executing tests on mobile application  */
        if (prop.readProperties("app.type").equalsIgnoreCase("apk")) {

            System.out.println("Executing tests on mobile application.");
            /* automate using findElement methods */
            try {
                UiWebElements webele = new UiWebElements();
                webele.UiElements();
                System.out.println("Test case Passed");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Test case Failed");
            }

            /* automate using UIAutomator method */
            try {
                UiAutomatorTool automator = new UiAutomatorTool();
                automator.UiAutomator();
                System.out.println("Test case Passed");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Test case Failed");
            }

            /* Automating Gestures */
            try {
                MobileGestures gesture = new MobileGestures();
                gesture.gesturesOp();
                System.out.println("Test case Passed");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Test case Failed");
            }

            /* Automating Swipe Gestures */
            try {
                UiSwipeGestures swipe = new UiSwipeGestures();
                swipe.swipeGestures();
                System.out.println("Test case Passed");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Test case Failed");
            }

            /* Automating Scrolling gestures */
            try {
                ScrollingGestures scroll = new ScrollingGestures();
                scroll.scrollingUI();
                System.out.println("Test case Passed");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Test case Failed");
            }

            /* Automating Drag and Drop gestures */
            try {
                DragDropGestures dragdrop = new DragDropGestures();
                dragdrop.dragDropUI();
                System.out.println("Test case Passed");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Test case Failed");
            }
        }
        /* Executing tests on mobile browser like chrome  */
        else if (prop.readProperties("app.type").equalsIgnoreCase("chrome")) {

            System.out.println("Executing tests on mobile browser.");

        }
        else
        {
            System.out.println("Invalid option. Check the value of app.type in property file androidDevice.properties.");
            System.out.println("app.type can accept 2 values i.e 'chrome' or 'apk'");
            System.exit(1);
        }
    }
}
