import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Class for modifying a given image. Requires an argument image to modify.
 */
public class ImageModification extends AbstractImageHandling {
  private BufferedImage image;
  private int width;
  private int height;
  private static final int RBG_LEN = 3;

  public ImageModification(BufferedImage image) {
    this.image = image;
    this.width = image.getWidth();
    this.height = image.getHeight();
  }

  @Override
  public void createImage(Enum creationType, int width, int height,
                          FlagType flagType, String outputPath) throws IOException {
    BufferedImage created = null;
    if (creationType == FilterType.BLUR) {
      created = blur();
    } else if (creationType == FilterType.SHARPEN) {
      created = sharpen();
    } else if (creationType == FilterType.GREYSCALE) {
      created = greyscale();
    } else if (creationType == FilterType.SEPIA) {
      created = sepia();
    }
    saveImage(created, outputPath);
  }

  private BufferedImage blur() {
    BufferedImage returnImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    double[][] filter = createBlurFilter();
    return applyFilter(returnImage, filter);
  }

  private double[][] createBlurFilter() {
    double[][] filter = new double[3][3];
    for (int y = 0; y < filter.length; y++) {
      for (int x = 0; x < filter[y].length; x++) {
        if (y == 1 && x == 1) {
          filter[y][x] = 1 / 4.0;
        } else if (y == 1 || x == 1) {
          filter[y][x] = 1 / 8.0;
        } else {
          filter[y][x] = 1 / 16.0;
        }
      }
    }
    return filter;
  }

  private BufferedImage sharpen() {
    double[][] filter = createSharpenFilter();
    return null;
  }

  private double[][] createSharpenFilter() {
    double[][] filter = new double[5][5];
    for (int y = 0; y < filter.length; y++) {
      for (int x = 0; x < filter[y].length; x++) {
        if (y == 0 || x == 0) {
          filter[y][x] = -1 / 8.0;
        } else if (y == 1 || x == 1) {
          filter[y][x] = 1 / 4.0;
        } else {
          filter[y][x] = 1;
        }
      }
    }
    return filter;
  }

  private BufferedImage greyscale() {
    return null;
  }

  private BufferedImage sepia() {
    return null;
  }

  private BufferedImage applyFilter(BufferedImage returnImage, double[][] filter) {
    int filterHalfLen = filter.length / 2;

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        int[] filterSum = new int[RBG_LEN];
        for (int k = 0; k < RBG_LEN; k++) {
          for (int l = -filterHalfLen; l < filterHalfLen; l++) {
            for (int m = -filterHalfLen; m < filterHalfLen; m++) {
              int pixelUsedX = j + m;
              int pixelUsedY = i + l;

              if (pixelUsedX >= 0 && pixelUsedY >= 0) {
                int[] rgbProduct = getRGBForPixel(pixelUsedX, pixelUsedY);
                filterSum[k] += rgbProduct[k] * filter[m + filterHalfLen][l + filterHalfLen];
              }
            }
          }
        }
        int r = filterSum[0];
        int g = filterSum[1];
        int b = filterSum[2];
        int rgb = (r << 16) | (g << 8) | b;
        returnImage.setRGB(j, i, clamp(rgb, 0, 255));
      }
    }
    return returnImage;
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
