import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Interface for all kinds of image handling, including both modification and generation.
 */
public interface ImageHandling {
  /**
   * Creates an image based on the creation type given. Not all parameters are necessarily used in
   * all scenarios. This is handled in the controller.
   *
   * @param creationType The type of operation to perform. For instance, to modify an image, you can
   *                     choose "blur", "sharpen", etc.
   * @param width        Width of a checkerbox or the image.
   * @param height       Height of a checkerbox or the image.
   * @param flagType     If creationType is a flag, the flag's country name.
   * @param seedCount        Number of seeds for mosaicing.
   * @return Newly created image.
   */
  BufferedImage createImage(Enum creationType, int width, int height,
                            FlagType flagType, int seedCount);
}
