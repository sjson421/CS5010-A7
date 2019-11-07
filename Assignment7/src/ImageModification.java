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
  private static final int ALPHA = 255;

  public ImageModification(BufferedImage image) {
    this.image = image;
    this.width = image.getWidth();
    this.height = image.getHeight();
  }

  @Override
  public void createImage(Enum creationType, int width, int height,
                          FlagType flagType, String outputPath) throws IOException {
    if (creationType == FilterType.BLUR) {
      blur(outputPath);
    } else if (creationType == FilterType.SHARPEN) {
      sharpen(outputPath);
    } else if (creationType == FilterType.GREYSCALE) {
      greyscale(outputPath);
    } else if (creationType == FilterType.SEPIA) {
      sepia(outputPath);
    }
  }

  private void blur(String outputPath) throws IOException {
    BufferedImage returnImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    double[][] filter = createBlurFilter();
    saveImage(applyFilter(returnImage, filter), outputPath);
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

  private void sharpen(String outputPath) {
    double[][] filter = createSharpenFilter();
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

  private void greyscale(String outputPath) {
    //int grey = (data[x][y][0]<<24) + (avg<<16) + (avg<<8) + avg;
  }

  private void sepia(String outputPath) {

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
