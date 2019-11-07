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
        }
      else if (i < 3 * height / 7) {
          //color it yellow
          red = 255;
          green = 255;
          blue = 0;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);
        }
      else if (i < 4 * height / 7) {
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
        }
      else if (i < 6 * height / 7) {
          //color it indigo
          red = 75;
          green = 0;
          blue = 130;
          pixel = (red << 16) | (green << 8) | blue;
          img.setRGB(j, i, pixel);
        }
      else{
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
