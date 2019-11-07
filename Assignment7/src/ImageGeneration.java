import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Class for generating an image, depending on the method called. Does not require an argument image
 * to generate.
 */
public class ImageGeneration extends AbstractImageHandling {
  @Override
  public void createImage(Enum creationType, int width, int height,
                          FlagType flagType, String outputPath) throws IOException {
    BufferedImage created = null;
    if (creationType == GenerationType.HOR_RAINBOW_STRIPES) {
      created = horRainbowStripes(width, height);
    } else if (creationType == GenerationType.VERT_RAINBOW_STRIPES) {
      created = vertRainbowStripes(width, height);
    } else if (creationType == GenerationType.CHECKERBOARD) {
      created = checkerboard(width, height);
    } else if (creationType == GenerationType.FLAG) {
      created = generateFlag(width, flagType);
    }
    saveImage(created, outputPath);
  }

  private BufferedImage horRainbowStripes(int width, int height) {
    BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    for (int i = 0; i < height; i++) { //rows
      for (int j = 0; j < width; j++) { //columns
        int alpha = 255;
        int red = 148;
        int green = 0;
        int blue = 211;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(j, i, pixel);
      }
    }
    for (int i = height / 7; i < (2 * height) / 7; i++) { //rows
      for (int j = 0; j < width; j++) {//columns
        int alpha = 255;
        int red = 75;
        int green = 0;
        int blue = 130;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(j, i, pixel);
      }
    }
    for (int y = (2 * height) / 7; y < (3 * height) / 7; y++) {
      for (int x = 0; x < width; x++) {
        int alpha = 255;
        int red = 0;
        int green = 0;
        int blue = 255;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(x, y, pixel);
      }
    }
    for (int y = (3 * height) / 7; y < (4 * height) / 7; y++) {
      for (int x = 0; x < width; x++) {
        int alpha = 255;
        int red = 0;
        int green = 255;
        int blue = 0;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(x, y, pixel);
      }
    }
    for (int y = (4 * height) / 7; y < (5 * height) / 7; y++) {
      for (int x = 0; x < width; x++) {
        int alpha = 255;
        int red = 255;
        int green = 255;
        int blue = 0;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(x, y, pixel);
      }
    }

    for (int y = (5 * height) / 7; y < (6 * height) / 7; y++) { //Orange
      for (int x = 0; x < width; x++) {
        int alpha = 255;
        int red = 255;
        int green = 127;
        int blue = 0;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(x, y, pixel);
      }
    }

    for (int y = (6 * height) / 7; y < height; y++) { //Red
      for (int x = 0; x < width; x++) {
        int alpha = 255;
        int red = 255;
        int green = 0;
        int blue = 0;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(x, y, pixel);
      }
    }
    return img;
  }

  private BufferedImage vertRainbowStripes(int width, int height) {
    return null;
  }

  private BufferedImage checkerboard(int squareWidth, int squareHeight) {
    return null;
  }

  private BufferedImage generateFlag(int width, FlagType flagType) {
    if (flagType == FlagType.FRANCE) {

    } else if (flagType == FlagType.GREECE) {

    } else if (flagType == FlagType.SWITZERLAND) {

    }
    return null;
  }
}
