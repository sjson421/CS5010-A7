import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Class for modifying a given image. Requires an argument image to modify.
 */
public class ImageModification extends AbstractImageHandling {
  private BufferedImage image;
  private int width;
  private int height;
  private static final int RBG_LEN = 3;

  /**
   * Takes in the image to modify and sets according variables according to it.
   *
   * @param image Image to modify.
   */
  public ImageModification(BufferedImage image) {
    this.image = image;
    this.width = image.getWidth();
    this.height = image.getHeight();
  }

  @Override
  public BufferedImage createImage(Enum creationType, int width, int height,
                                   FlagType flagType, int seedCount) {
    BufferedImage created = null;
    if (creationType == ModType.BLUR) {
      created = blur();
    } else if (creationType == ModType.SHARPEN) {
      created = sharpen();
    } else if (creationType == ModType.GREYSCALE) {
      created = greyscale();
    } else if (creationType == ModType.SEPIA) {
      created = sepia();
    } else if (creationType == ModType.DITHER) {
      created = dither();
    } else if (creationType == ModType.MOSAIC) {
      created = mosaic(seedCount);
    }
    return created;
  }

  private class Coordinate {
    private int x;
    private int y;

    private Coordinate(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  private BufferedImage blur() {
    BufferedImage returnImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    double[][] filter = createBlurKernel();
    return applyFilter(returnImage, filter);
  }

  private BufferedImage sharpen() {
    BufferedImage returnImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    double[][] filter = createSharpenKernel();
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
                int[] rgbProduct = getRGBForPixel(image, pixelUsedX, pixelUsedY);
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
        int[] initialRGB = getRGBForPixel(image, j, i);
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
    returnImage.setRGB(j, i, (r << 16) | (g << 8) | b);
  }

  private int[] getRGBForPixel(BufferedImage img, int x, int y) {
    int[] channels = new int[3];
    int rgb = img.getRGB(x, y);
    channels[0] = (rgb >> 16) & 0x000000FF;
    channels[1] = (rgb >> 8) & 0x000000FF;
    channels[2] = (rgb) & 0x000000FF;
    return channels;
  }

  private double[][] createBlurKernel() {
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

  private double[][] createSharpenKernel() {
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

  private BufferedImage dither() {
    BufferedImage returnImage = greyscale();

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        int oldColor = getRGBForPixel(returnImage, j, i)[0];
        int newColor = getCloserColor(oldColor);

        int[] color = new int[3];
        color[0] = newColor;
        color[1] = newColor;
        color[2] = newColor;
        setRGB(returnImage, color, j, i);

        int error = oldColor - newColor;

        if (j + 1 < width) {
          modifyLaterPixels(returnImage, error, 7. / 16, j + 1, i);
        }
        if (i + 1 < height) {
          if (j - 1 >= 0) {
            modifyLaterPixels(returnImage, error, 3. / 16, j - 1, i + 1);
          }

          modifyLaterPixels(returnImage, error, 5. / 16, j, i + 1);

          if (j + 1 < width) {
            modifyLaterPixels(returnImage, error, 1. / 16, j + 1, i + 1);
          }
        }
      }
    }
    return returnImage;
  }

  private void modifyLaterPixels(BufferedImage returnImage, int error, double multiplier,
                                 int j, int i) {
    int[] pixelRGB = getRGBForPixel(returnImage, j, i);
    pixelRGB[0] += multiplier * error;
    setRGB(returnImage, pixelRGB, j, i);
  }

  private int getCloserColor(int oldColor) {
    int newColor;
    if (oldColor < 255 - oldColor) {
      newColor = 0;
    } else {
      newColor = 255;
    }
    return newColor;
  }

  private BufferedImage mosaic(int seedCount) {
    System.out.println("Mosaic operation in progress with " + seedCount + " seeds. Sit tight.");
    BufferedImage returnImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    Map<Coordinate, ArrayList<Coordinate>> closestSeedPixels = new HashMap<>(seedCount);
    for (int i = 0; i < seedCount; i++) {
      int x = (int) (Math.random() * width);
      int y = (int) (Math.random() * height);
      closestSeedPixels.put(
              new Coordinate(x, y), new ArrayList<>(height * width / seedCount));
    }
    setMosaicImage(returnImage, closestSeedPixels);
    return returnImage;
  }

  private double getDistance(int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
  }

  private void setMosaicImage(BufferedImage returnImage,
                                Map<Coordinate, ArrayList<Coordinate>> closestSeedPixels) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        double minDistance = Double.POSITIVE_INFINITY;
        Coordinate closestSeed = null;
        for (Coordinate seed : closestSeedPixels.keySet()) {
          double seedDistance = getDistance(j, i, seed.x, seed.y);
          if (seedDistance < minDistance) {
            minDistance = seedDistance;
            closestSeed = seed;
          }
        }
        if (closestSeed != null) {
          closestSeedPixels.get(closestSeed).add(new Coordinate(j, i));
        }
      }
    }

    for (ArrayList<Coordinate> closestPixels : closestSeedPixels.values()) {
      int redSum = 0;
      int greenSum = 0;
      int blueSum = 0;

      for (Coordinate pixel : closestPixels) {
        int[] rgb = getRGBForPixel(image, pixel.x, pixel.y);
        redSum += rgb[0];
        greenSum += rgb[1];
        blueSum += rgb[2];
      }
      int[] newRGB = new int[3];
      int size = closestPixels.size();
      if (size > 0) {
        newRGB[0] = redSum / size;
        newRGB[1] = greenSum / size;
        newRGB[2] = blueSum / size;

        for (Coordinate pixel : closestPixels) {
          setRGB(returnImage, newRGB, pixel.x, pixel.y);
        }
      }
    }
  }
}
