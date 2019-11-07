import java.awt.image.BufferedImage;

/**
 * Class for modifying a given image. Requires an argument image to modify.
 */
public class ImageModification extends AbstractImageHandling {
  BufferedImage image;
  double[][] filter;

  public ImageModification(BufferedImage image) {
    this.image = image;
  }

  @Override
  public void createImage(Enum creationType, int width, int height, FlagType flagType) {
    if (creationType == FilterType.BLUR) {
      blur();
    } else if (creationType == FilterType.SHARPEN) {
      sharpen();
    } else if (creationType == FilterType.GREYSCALE) {
      greyscale();
    } else if (creationType == FilterType.SEPIA) {
      sepia();
    }
  }

  private int[][][] getPixelData() {
    int width = image.getWidth();
    int height = image.getHeight();
    int[][][] imageYXColor = new int[width][height][3];
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        imageYXColor[j][i] = getRGBForPixel(i, j);
      }
    }
    return imageYXColor;
  }

  private void blur() {
    filter = new double[3][3];
    for (int row = 0; row < filter.length; row++) {
      for (int col = 0; col < filter[row].length; col++) {
        if (row == 1 && col == 1) {
          filter[row][col] = 1 / 4.0;
        } else if (row == 1 || col == 1) {
          filter[row][col] = 1 / 8.0;
        } else {
          filter[row][col] = 1 / 16.0;
        }
      }
    }
  }

  private void sharpen() {

  }

  private void greyscale() {

  }

  private void sepia() {

  }

  private int[] getRGBForPixel(int x, int y) {
    int[] channels = new int[3];
    int rgb = image.getRGB(x, y);
    channels[0] = (rgb >> 16) & 0x000000FF;
    channels[1] = (rgb >> 8) & 0x000000FF;
    channels[2] = (rgb) & 0x000000FF;
    return channels;
  }
}
