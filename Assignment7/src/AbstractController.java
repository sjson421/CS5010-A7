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
  public BufferedImage blur() {
    return null;
  }

  @Override
  public BufferedImage sharpen() {
    return null;
  }

  @Override
  public BufferedImage greyscale() {
    return null;
  }

  @Override
  public BufferedImage sepia() {
    return null;
  }

  @Override
  public BufferedImage dither() {
    return null;
  }

  @Override
  public BufferedImage mosaic(int seeds) {
    return null;
  }

  @Override
  public BufferedImage horRainbow(int width, int height) {
    return null;
  }

  @Override
  public BufferedImage vertRainbow(int width, int height) {
    return null;
  }

  @Override
  public BufferedImage checkerboard(int width) {
    return null;
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
