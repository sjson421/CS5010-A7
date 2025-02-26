import java.awt.image.BufferedImage;

/**
 * Class for generating an image, depending on the method called. Does not require an argument image
 * to generate.
 */
public class ImageGeneration extends AbstractImageHandling {
  @Override
  public BufferedImage createImage(Enum creationType, int width, int height,
                                   FlagType flagType, int seedCount) {
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
    return created;
  }

  private BufferedImage horRainbowStripes(int width, int height) {
    BufferedImage img = new BufferedImage(width, height * 7, BufferedImage.TYPE_INT_RGB);
    for (int i = 0; i < height * 7; i++) {
      for (int j = 0; j < width; j++) {
        if (i < height) {
          colorRed(img, j, i);
        } else if (i < 2 * height) {
          colorOrange(img, j, i);
        } else if (i < 3 * height) {
          colorYellow(img, j, i);
        } else if (i < 4 * height) {
          colorGreen(img, j, i);
        } else if (i < 5 * height) {
          colorBlue(img, j, i);
        } else if (i < 6 * height) {
          colorIndigo(img, j, i);
        } else {
          colorViolet(img, j, i);
        }
      }
    }
    return img;
  }

  private BufferedImage vertRainbowStripes(int width, int height) {
    BufferedImage img = new BufferedImage(width * 7, height, BufferedImage.TYPE_INT_RGB);
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width * 7; j++) {
        if (j < width) {
          colorRed(img, j, i);
        } else if (j < 2 * width) {
          colorOrange(img, j, i);
        } else if (j < 3 * width) {
          colorYellow(img, j, i);
        } else if (j < 4 * width) {
          colorGreen(img, j, i);
        } else if (j < 5 * width) {
          colorBlue(img, j, i);
        } else if (j < 6 * width) {
          colorIndigo(img, j, i);
        } else {
          colorViolet(img, j, i);
        }
      }
    }
    return img;
  }

  private void colorRed(BufferedImage img, int j, int i) {
    img.setRGB(j, i, 255 << 16);
  }

  private void colorOrange(BufferedImage img, int j, int i) {
    img.setRGB(j, i, (255 << 16) | (128 << 8));
  }

  private void colorYellow(BufferedImage img, int j, int i) {
    img.setRGB(j, i, (255 << 16) | (255 << 8));
  }

  private void colorGreen(BufferedImage img, int j, int i) {
    img.setRGB(j, i, 255 << 8);
  }

  private void colorBlue(BufferedImage img, int j, int i) {
    img.setRGB(j, i, 255);
  }

  private void colorIndigo(BufferedImage img, int j, int i) {
    img.setRGB(j, i, (75 << 16) | 130);
  }

  private void colorViolet(BufferedImage img, int j, int i) {
    img.setRGB(j, i, (148 << 16) | 211);
  }

  private BufferedImage checkerboard(int squareWidth) {
    BufferedImage img = new BufferedImage(squareWidth * 8, squareWidth * 8,
            BufferedImage.TYPE_INT_RGB);
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
      return getFranceFlag(width);
    } else if (flagType == FlagType.GREECE) {
      return getGreeceFlag(width);
    } else if (flagType == FlagType.SWITZERLAND) {
      return getSwissFlag(width);
    }
    return null;
  }

  private BufferedImage getFranceFlag(int width) {
    int height = (2 * width) / 3;
    BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    int red;
    int green;
    int blue;
    int pixel;
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (j < width / 3) { //color it blue
          red = 0;
          green = 85;
          blue = 164;
        } else if (j < 2 * width / 3) { //color it white
          red = 255;
          green = 255;
          blue = 255;
        } else { //color it red
          red = 239;
          green = 65;
          blue = 53;
        }
        pixel = (red << 16) | (green << 8) | blue;
        img.setRGB(j, i, pixel);
      }
    }

    return img;
  }

  private BufferedImage getSwissFlag(int width) {
    BufferedImage img = new BufferedImage(width, width, BufferedImage.TYPE_INT_RGB);
    int red;
    int green;
    int blue;

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < width; j++) {
        if ((j >= 13 * width / 32 && j <= 19 * width / 32
                && i >= 6 * width / 32 && i <= 26 * width / 32)
                || (i >= 13.0 * width / 32.0 && i <= 19 * width / 32
                && j >= 6 * width / 32 && j <= 26 * width / 32)) {
          red = 255;
          green = 255;
          blue = 255;
        } else {
          red = 255;
          green = 0;
          blue = 0;
        }
        int pixel = (red << 16) | (green << 8) | blue;
        img.setRGB(j, i, pixel);
      }
    }
    return img;
  }

  private BufferedImage getGreeceFlag(int width) {
    int height = (2 * width) / 3;
    BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (j <= 10 * width / 27 && i <= 5 * height / 9) {
          if ((j >= 4 * width / 27 && j <= 6 * width / 27)
                  || (i >= 4 * width / 27 && i <= 6 * width / 27)) {
            setGreeceWhite(img, j, i);
          } else {
            setGreeceBlue(img, j, i);
          }
        } else {
          if (i <= height / 9) {
            setGreeceBlue(img, j, i);
          } else if (i <= 2 * height / 9) {
            setGreeceWhite(img, j, i);
          } else if (i <= 3 * height / 9) {
            setGreeceBlue(img, j, i);
          } else if (i <= 4 * height / 9) {
            setGreeceWhite(img, j, i);
          } else if (i <= 5 * height / 9) {
            setGreeceBlue(img, j, i);
          } else if (i <= 6 * height / 9) {
            setGreeceWhite(img, j, i);
          } else if (i <= 7 * height / 9) {
            setGreeceBlue(img, j, i);
          } else if (i <= 8 * height / 9) {
            setGreeceWhite(img, j, i);
          } else {
            setGreeceBlue(img, j, i);
          }
        }
      }
    }
    return img;
  }

  private void setGreeceWhite(BufferedImage img, int j, int i) {
    int red = 255;
    int green = 255;
    int blue = 255;
    int pixel = (red << 16) | (green << 8) | blue;
    img.setRGB(j, i, pixel);
  }

  private void setGreeceBlue(BufferedImage img, int j, int i) {
    int red = 0;
    int green = 91;
    int blue = 174;
    int pixel = (red << 16) | (green << 8) | blue;
    img.setRGB(j, i, pixel);
  }
}
