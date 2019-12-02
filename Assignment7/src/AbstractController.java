import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Abstract class for handling common methods to the controllers. Also handles default methods that
 * are repeated in subclasses.
 */
public abstract class AbstractController implements IController {
  /**
   * Set by default to not have an associated view.
   *
   * @param v View to be set with this controller.
   */
  @Override
  public void setView(IView v) {
  }

  @Override
  public void blur() {

  }

  @Override
  public void sharpen() {

  }

  @Override
  public void greyscale() {

  }

  @Override
  public void sepia() {

  }

  @Override
  public void dither() {

  }

  @Override
  public void mosaic(int seeds) {

  }

  @Override
  public void horRainbow(int width, int height) {

  }

  @Override
  public void vertRainbow(int width, int height) {

  }

  @Override
  public void checkerboard(int width) {

  }

  @Override
  public ImageModification load(String inputPath) throws IOException {
    BufferedImage modImage = ImageIO.read(new File(inputPath));
    return new ImageModification(modImage);
  }

  @Override
  public void save(BufferedImage image, String outputPath) throws IOException {
    if (image != null) {
      File outputFile = new File(outputPath);
      ImageIO.write(image, outputPath.substring(outputPath.length() - 3), outputFile);
    } else {
      System.err.println("There is an error in your output path or image.");
    }
  }
}
