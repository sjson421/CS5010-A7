import java.awt.image.BufferedImage;

/**
 * Interface for all kinds of image handling, including both modification and generation.
 */
public interface ImageHandling {
  /**
   * Creates an image based on the creation type given.
   *
   * @param creationType The type of operation to perform. For instance, to modify an image, you can
   *                     choose "blur", "sharpen", etc.
   */
  void createImage(Enum creationType);

  /**
   * Creates an image based on the creation type given. Used in image generation to generate an
   * image with given parameters.
   *
   * @param creationType
   * @param width
   * @param height
   * @param flagType
   */
  void createImage(Enum creationType, int width, int height, FlagType flagType);
}
