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
        //MobileGestures gesture = new MobileGestures();
        //gesture.gesturesOp();

        /* Automating Swipe Gestures */
        //UiSwipeGestures swipe = new UiSwipeGestures();
        //swipe.swipeGestures();

        /* Automating Scrolling gestures */
        //ScrollingGestures scroll = new ScrollingGestures();
        //scroll.scrollingUI();

        /* Automating Drag and Drop gestures */
        DragDropGestures dragdrop = new DragDropGestures();
        dragdrop.dragDropUI();
    }
}
