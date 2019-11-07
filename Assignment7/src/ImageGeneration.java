import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Class for generating an image, depending on the method called. Does not require an argument image
 * to generate.
 */
public class ImageGeneration extends AbstractImageHandling {


  @Override
  public void createImage(Enum creationType, int width, int height, FlagType flagType) throws IOException {

    if (creationType == GenerationType.HOR_RAINBOW_STRIPES) {
      horRainbowStripes(width, height);
    } else if (creationType == GenerationType.VERT_RAINBOW_STRIPES) {
      vertRainbowStripes(width, height);
    } else if (creationType == GenerationType.CHECKERBOARD) {
      checkerboard(width, height);
    } else if (creationType == GenerationType.FLAG) {
      generateFlag(width, flagType);
    }
  }

  private void horRainbowStripes(int width, int height) throws IOException {
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
    for (int i = (int) height / 7; i < (int) (2 * height) / 7; i++) { //rows
      for (int j = 0; j < (int) width; j++) {//columns
        int alpha = 255;
        int red = 75;
        int green = 0;
        int blue = 130;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(j, i, pixel);
      }
    }
    for (int y = (int) (2 * height) / 7; y < (int) (3 * height) / 7; y++) {
      for (int x = 0; x < (int) width; x++) {
        int alpha = 255;
        int red = 0;
        int green = 0;
        int blue = 255;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(x, y, pixel);
      }
    }
    for (int y = (int) (3 * height) / 7; y < (int) (4 * height) / 7; y++) {
      for (int x = 0; x < (int) width; x++) {
        int alpha = 255;
        int red = 0;
        int green = 255;
        int blue = 0;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(x, y, pixel);
      }
    }
    for (int y = (int) (4 * height) / 7; y < (int) (5 * height) / 7; y++) {
      for (int x = 0; x < (int) width; x++) {
        int alpha = 255;
        int red = 255;
        int green = 255;
        int blue = 0;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(x, y, pixel);
      }
    }

    for (int y = (int) (5 * height) / 7; y < (int) (6 * height) / 7; y++) { //Orange
      for (int x = 0; x < (int) width; x++) {
        int alpha = 255;
        int red = 255;
        int green = 127;
        int blue = 0;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(x, y, pixel);
      }
    }

    for (int y = (int) (6 * height) / 7; y < height; y++) { //Red
      for (int x = 0; x < (int) width; x++) {
        int alpha = 255;
        int red = 255;
        int green = 0;
        int blue = 0;

        int pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;

        img.setRGB(x, y, pixel);
      }
    }
    saveImage(img,"res/horizontal.jpg");
  }


  private void vertRainbowStripes(int width, int height) {

  }

  private void checkerboard(int squareWidth, int squareHeight) {

  }
  private void generateFlag(int width, FlagType flagType) {
    if (flagType == FlagType.FRANCE) {

    } else if (flagType == FlagType.GREECE) {

    } else if (flagType == FlagType.SWITZERLAND) {

    }
  }
}
