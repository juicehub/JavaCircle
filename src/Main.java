import java.awt.*;
import java.awt.event.InputEvent;

public class Main extends Thread {

    static Robot r = null;

    public static void main(String[] args) {
        Robot r = null;
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        try {

            Thread.sleep(3000);

            int radius = 400;
            int cx = 1920/2;
            int cy = 1080/2;

            int accuracy = 1;

            r.mouseMove((int) (cx + radius * Math.cos(Math.toRadians(0 / accuracy))), (int) (cy + radius * Math.sin(Math.toRadians(0 / accuracy))));

            for (int i = 0; i < 360 * accuracy; i++) {
                int x = (int) (cx + radius * Math.cos(Math.toRadians(i / accuracy)));
                int y = (int) (cy + radius * Math.sin(Math.toRadians(i / accuracy)));

                r.mouseMove(x, y);
                r.mousePress(InputEvent.BUTTON1_MASK);
                r.mouseRelease(InputEvent.BUTTON1_MASK);
                Thread.sleep(1);
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
