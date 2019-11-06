import java.awt.image.BufferedImage;

/**
 * Class for modifying a given image. Requires an argument image to modify.
 */
public class ImageModification extends AbstractImageHandling {
  BufferedImage image;

  public ImageModification(BufferedImage image) {
    this.image = image;
  }

  public void blur() {
  }

  public void sharpen() {

  }
//  public void greyscale() {
//
//  }
//  public void sepia() {
//
//  }

  private int[] getRGBForPixel(int x, int y) {
    int[] channels = new int[3];
    int rgb = image.getRGB(x, y);
    channels[0] = (rgb >> 16) & 0x000000FF;
    channels[1] = (rgb >> 8) & 0x000000FF;
    channels[2] = (rgb) & 0x000000FF;
    return channels;
  }
}
