import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Abstract class for image handling, with functionalities that should be common to all forms of
 * image handling.
 */
public abstract class AbstractImageHandling implements ImageHandling {
  /**
   * Clamps the given channel value according to a given min and max.
   *
   * @param value Channel value to clamp
   * @param min   Minimum value in range of channel.
   * @param max   Maximum value in range of channel.
   * @return The clamped channel value. Returns itself if the value is between min and max, returns
   * min if it is below min, and returns max if it is below max.
   */
  protected int clamp(int value, int min, int max) {
    if (value < min) {
      return min;
    } else if (value > max) {
      return max;
    } else {
      return value;
    }
  }

  /**
   * Saves the provided image into the res folder.
   *
   * @param image Image to save
   * @throws IOException Thrown when the output path is not a jpg file
   */
  protected void saveImage(BufferedImage image, String outputPath) throws IOException {
    File outputFile = new File(outputPath);
    ImageIO.write(image, "jpg", outputFile);
  }
}
