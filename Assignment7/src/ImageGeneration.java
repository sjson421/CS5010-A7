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
      created = checkerboard(width);
    } else if (creationType == GenerationType.FLAG) {
      created = generateFlag(width, flagType);
    }
    saveImage(created, outputPath);
  }

  private BufferedImage horRainbowStripes(int width, int height) {
    BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    int red;
    int green;
    int blue;
    int pixel;

    for (int i = 0; i < height; i++) { //rows
      for (int j = 0; j < width; j++)  //columns

        if (i < height / 7) { //color it red
          red = 255;
          green = 0;
          blue = 0;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);

        } else if (i < 2 * height / 7) {
          //color it orange
          red = 255;
          green = 127;
          blue = 0;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);
        } else if (i < 3 * height / 7) {
          //color it yellow
          red = 255;
          green = 255;
          blue = 0;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);
        } else if (i < 4 * height / 7) {
          //color it green
          red = 0;
          green = 255;
          blue = 0;
          pixel = (red << 16) | (green << 8) | blue;

          img.setRGB(j, i, pixel);
        } else if (i < 5 * height / 7) {
          //color it blue
          red = 0;
          green = 0;
          blue = 255;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);
        } else if (i < 6 * height / 7) {
          //color it indigo
          red = 75;
          green = 0;
          blue = 130;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);
        } else {
          //color it violet
          red = 143;
          green = 0;
          blue = 255;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);
        }
    }
    return img;
  }

  private BufferedImage vertRainbowStripes(int width, int height) {
    BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    int red;
    int green;
    int blue;
    int pixel;

    for (int i = 0; i < height; i++) { //rows
      for (int j = 0; j < width; j++)  //columns

        if (j < width / 7) { //color it red
          red = 255;
          green = 0;
          blue = 0;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);

        } else if (j < 2 * width / 7) {
          //color it orange
          red = 255;
          green = 127;
          blue = 0;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);
        } else if (j < 3 * width / 7) {
          //color it yellow
          red = 255;
          green = 255;
          blue = 0;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);
        } else if (j < 4 * width / 7) {
          //color it green
          red = 0;
          green = 255;
          blue = 0;
          pixel = (red << 16) | (green << 8) | blue;

          img.setRGB(j, i, pixel);
        } else if (j < 5 * width / 7) {
          //color it blue
          red = 0;
          green = 0;
          blue = 255;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);
        } else if (j < 6 * width / 7) {
          //color it indigo
          red = 75;
          green = 0;
          blue = 130;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);
        } else {
          //color it violet
          red = 143;
          green = 0;
          blue = 255;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);
        }
    }
    return img;
  }

  private BufferedImage checkerboard(int squareWidth) {
    BufferedImage img = new BufferedImage(squareWidth * 8, squareWidth * 8, BufferedImage.TYPE_INT_RGB);
    int red;
    int green;
    int blue;
    int pixel;

    for (int i = 0; i < squareWidth * 8; i++) {
      for (int j = 0; j < squareWidth * 8; j++) {
        if (i < squareWidth) {
          colorColumnOne(img, squareWidth, j, i);
        } else if (i < 2 * squareWidth) {
          colorColumnTwo(img, squareWidth, j, i);
        } else if (i < 3 * squareWidth) {
          colorColumnOne(img, squareWidth, j, i);
        } else if (i < 4 * squareWidth) {
          colorColumnTwo(img, squareWidth, j, i);
        } else if (i < 5 * squareWidth) {
          colorColumnOne(img, squareWidth, j, i);
        } else if (i < 6 * squareWidth) {
          colorColumnTwo(img, squareWidth, j, i);
        } else if (i < 7 * squareWidth) {
          colorColumnOne(img, squareWidth, j, i);
        } else {
          colorColumnTwo(img, squareWidth, j, i);
        }
      }
    }
    return img;
  }

  private void colorBlack(BufferedImage img, int j, int i) {
    int red = 0;
    int green = 0;
    int blue = 0;
    img.setRGB(j, i, (red << 16) | (green << 8) | blue);
  }

  private void colorWhite(BufferedImage img, int j, int i) {
    int red = 255;
    int green = 255;
    int blue = 255;
    img.setRGB(j, i, (red << 16) | (green << 8) | blue);
  }

  private void colorColumnOne(BufferedImage img, int squareWidth, int j, int i) {
    if (j < squareWidth) {
      colorWhite(img, j, i);
    } else if (j < 2 * squareWidth) {
      colorBlack(img, j, i);
    } else if (j < 3 * squareWidth) {
      colorWhite(img, j, i);
    } else if (j < 4 * squareWidth) {
      colorBlack(img, j, i);
    } else if (j < 5 * squareWidth) {
      colorWhite(img, j, i);
    } else if (j < 6 * squareWidth) {
      colorBlack(img, j, i);
    } else if (j < 7 * squareWidth) {
      colorWhite(img, j, i);
    } else {
      colorBlack(img, j, i);
    }
  }

  private void colorColumnTwo(BufferedImage img, int squareWidth, int j, int i) {
    if (j < squareWidth) {
      colorBlack(img, j, i);
    } else if (j < 2 * squareWidth) {
      colorWhite(img, j, i);
    } else if (j < 3 * squareWidth) {
      colorBlack(img, j, i);
    } else if (j < 4 * squareWidth) {
      colorWhite(img, j, i);
    } else if (j < 5 * squareWidth) {
      colorBlack(img, j, i);
    } else if (j < 6 * squareWidth) {
      colorWhite(img, j, i);
    } else if (j < 7 * squareWidth) {
      colorBlack(img, j, i);
    } else {
      colorWhite(img, j, i);
    }
  }

  private BufferedImage generateFlag(int width, FlagType flagType) {
    if (flagType == FlagType.FRANCE) {

    } else if (flagType == FlagType.GREECE) {

    } else if (flagType == FlagType.SWITZERLAND) {

    }
    return null;
  }
}
