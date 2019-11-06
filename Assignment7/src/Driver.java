import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Driver class for running main method.
 */
public class Driver {
  public static void main(String[] args) {
    try {
      BufferedImage image = ImageIO.read(new File(""));
      ImageHandling mod = new ImageModification(image);
      ImageHandling gen = new ImageGeneration();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
