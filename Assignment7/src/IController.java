import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Controller that handles the running of the code, acting as the intermediary between the view and
 * the models.
 */
public interface IController {

  /**
   * Called in the main method to have the controller control the flow of the program.
   *
   * @throws IOException Thrown when the input file does not exist.
   */
  void runProgram() throws IOException;

  /**
   * Sets a view to be associated with this controller.
   *
   * @param v View to be set with this controller.
   */
  void setView(IView v);

  /**
   * Used for the view to blur an image.
   */
  BufferedImage blur();

  /**
   * Used for the view to sharpen an image.
   */
  BufferedImage sharpen();

  /**
   * Used for the view to greyscale an image.
   */
  BufferedImage greyscale();

  /**
   * Used for the view to set an image to sepia tone.
   */
  BufferedImage sepia();

  /**
   * Used for the view to dither an image.
   */
  BufferedImage dither();

  /**
   * Used for the view to mosaic an image.
   *
   * @param seeds Number of seeds to mosaic the image by.
   */
  BufferedImage mosaic(int seeds);

  /**
   * Used for the view to generate horizontal rainbow stripes.
   * @param width Width of the image.
   * @param height Height of the stripe.
   */
  BufferedImage horRainbow(int width, int height);
  /**
   * Used for the view to generate vertical rainbow stripes.
   * @param width Width of the stripe.
   * @param height Height of the image.
   */
  BufferedImage vertRainbow(int width, int height);

  /**
   * Used for the view to generate a checkerboard.
   * @param width Width of a square of the checkerboard.
   */
  BufferedImage checkerboard(int width);

  /**
   * Loads an image for modification.
   * @param inputPath Path to find image for modifying.
   * @return ImageModification Object holding the image to modify.
   * @throws IOException Thrown when input path not found.
   */
  ImageModification load(String inputPath) throws IOException;

  /**
   * Saves an image that has been modified or generated.
   * @param outputPath Output path of modified image.
   */
  void save(BufferedImage image, String outputPath) throws IOException;
}
