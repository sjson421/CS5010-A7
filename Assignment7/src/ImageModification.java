import java.awt.image.BufferedImage;

/**
 * Class for modifying a given image. Requires an argument image to modify.
 */
public class ImageModification extends AbstractImageHandling {
  BufferedImage image;
  public ImageModification(BufferedImage image) {
    this.image = image;
  }
}
