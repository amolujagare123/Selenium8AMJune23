package ReportsDemo.screenshots;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WindowsScreenshot {

    public  static void windowScreenshot() {
        try {
            Robot robot = new Robot();

            Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
            File file = new File("screen-capture.png");
            boolean status = ImageIO.write(bufferedImage, "png", file);
            System.out.println("Screen Captured ? " + status + " File Path:- " + file.getAbsolutePath());

        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
    }

    public static void main(String[] args) {
        windowScreenshot();
    }
}
