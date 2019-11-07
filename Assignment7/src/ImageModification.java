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

  private BufferedImage sharpen() {
    BufferedImage returnImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    double[][] filter = createSharpenFilter();
    return applyFilter(returnImage, filter);
  }

  private BufferedImage greyscale() {
    BufferedImage returnImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    double[][] matrix = createGreyscaleColorMatrix();
    return applyColorMatrix(returnImage, matrix);
  }

  private BufferedImage sepia() {

    BufferedImage returnImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    double[][] matrix = createSepiaColorMatrix();
    return applyColorMatrix(returnImage, matrix);
  }

  private BufferedImage applyFilter(BufferedImage returnImage, double[][] filter) {
    int filterHalfLen = filter.length / 2;

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        int[] filterSum = new int[RBG_LEN];
        for (int k = 0; k < RBG_LEN; k++) {
          for (int l = -filterHalfLen; l < filterHalfLen + 1; l++) {
            for (int m = -filterHalfLen; m < filterHalfLen + 1; m++) {
              int pixelUsedX = j + m;
              int pixelUsedY = i + l;

              if (pixelUsedX >= 0 && pixelUsedY >= 0 && pixelUsedX < width
                      && pixelUsedY < height) {
                int[] rgbProduct = getRGBForPixel(pixelUsedX, pixelUsedY);
                filterSum[k] += rgbProduct[k] * filter[l + filterHalfLen][m + filterHalfLen];
              }
            }
          }
        }
        setRGB(returnImage, filterSum, j, i);
      }
    }
    return returnImage;
  }

  private BufferedImage applyColorMatrix(BufferedImage returnImage, double[][] matrix) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        int[] initialRGB = getRGBForPixel(j, i);
        int[] appliedRGB = new int[RBG_LEN];
        for (int l = 0; l < matrix.length; l++) {
          for (int m = 0; m < matrix[l].length; m++) {
            appliedRGB[l] += (int) Math.round(matrix[l][m] * initialRGB[m]);
          }
        }
        setRGB(returnImage, appliedRGB, j, i);
      }
    }
    return returnImage;
  }

  private void setRGB(BufferedImage returnImage, int[] colorMatrix, int j, int i) {
    int r = clamp(colorMatrix[0], 0, 255);
    int g = clamp(colorMatrix[1], 0, 255);
    int b = clamp(colorMatrix[2], 0, 255);
    int rgb = (r << 16) | (g << 8) | b;
    returnImage.setRGB(j, i, rgb);
  }

  private int[] getRGBForPixel(int x, int y) {
    int[] channels = new int[3];
    int rgb = image.getRGB(x, y);
    channels[0] = (rgb >> 16) & 0x000000FF;
    channels[1] = (rgb >> 8) & 0x000000FF;
    channels[2] = (rgb) & 0x000000FF;
    return channels;
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

  private double[][] createSharpenFilter() {
    double[][] filter = new double[5][5];
    for (int y = 0; y < filter.length; y++) {
      for (int x = 0; x < filter[y].length; x++) {
        if (y == 0 || x == 0 || y == filter.length - 1 || x == filter[y].length - 1) {
          filter[y][x] = -1 / 8.0;
        } else if (y == 1 || x == 1 || y == 3 || x == 3) {
          filter[y][x] = 1 / 4.0;
        } else {
          filter[y][x] = 1;
        }
      }
    }
    return filter;
  }

  private double[][] createGreyscaleColorMatrix() {
    double[][] matrix = new double[3][3];
    for (int y = 0; y < matrix.length; y++) {
      for (int x = 0; x < matrix[y].length; x++) {
        if (x == 0) {
          matrix[y][x] = 0.2126;
        } else if (x == 1) {
          matrix[y][x] = 0.7152;
        } else {
          matrix[y][x] = 0.0722;
        }
      }
    }
    return matrix;
  }

  private double[][] createSepiaColorMatrix() {
    double[][] matrix = new double[3][3];
    matrix[0][0] = 0.393;
    matrix[0][1] = 0.769;
    matrix[0][2] = 0.189;
    matrix[1][0] = 0.349;
    matrix[1][1] = 0.686;
    matrix[1][2] = 0.168;
    matrix[2][0] = 0.272;
    matrix[2][1] = 0.534;
    matrix[2][2] = 0.131;
    return matrix;
  }
}
