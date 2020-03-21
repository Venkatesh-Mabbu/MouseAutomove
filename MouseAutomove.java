import java.awt.Robot;
import java.util.Random;

public class MouseAutomove {
    public static final int DELAY = 20000;
    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        while (true) {
            int y = 400;
            for (int x=200; x<500; x++) {
                robot.mouseMove(x, y);
                Thread.sleep(2);
            }
            
            for (int x=500; x>200; x--) {
                robot.mouseMove(x, y);
                Thread.sleep(2);
            }
            
            Thread.sleep(DELAY);
        }
    }
}