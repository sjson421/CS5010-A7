import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Driver class for running main method.
 */
public class Driver {
  public static void main(String[] args) {
    try {
//      BufferedImage image1 = ImageIO.read(new File("res/typical.jpg"));
//      BufferedImage image2 = ImageIO.read(new File("res/landscape.jpg"));
//      ImageHandling mod1 = new ImageModification(image1);
//      ImageHandling mod2 = new ImageModification(image2);
      ImageHandling gen = new ImageGeneration();
//
//      createImage(mod1, FilterType.BLUR, "res/typicalBlur.jpg");
//      createImage(mod1, FilterType.SHARPEN, "res/typicalSharpen.jpg");
//      createImage(mod1, FilterType.GREYSCALE, "res/typicalGreyScale.jpg");
//      createImage(mod1, FilterType.SEPIA, "res/typicalSepia.jpg");
//
//      createImage(mod2, FilterType.BLUR, "res/landscapeBlur.jpg");
//      createImage(mod2, FilterType.SHARPEN, "res/landscapeSharpen.jpg");
//      createImage(mod2, FilterType.GREYSCALE, "res/landscapeGreyScale.jpg");
//      createImage(mod2, FilterType.SEPIA, "res/landscapeSepia.jpg");

      createImage(gen, GenerationType.HOR_RAINBOW_STRIPES, 1280, 720, "res/horRainbowStripes.jpg");
      createImage(gen, GenerationType.VERT_RAINBOW_STRIPES, 1280, 720, "res/vertRainbowStripes.jpg");
      createImage(gen, GenerationType.CHECKERBOARD, 100, "res/checkerboard.jpg");
      createImage(gen, GenerationType.FLAG, FlagType.FRANCE, 1280, "res/flagFrance.jpg");
      createImage(gen, GenerationType.FLAG, FlagType.GREECE, 1280, "res/flagGreece.jpg");
      createImage(gen, GenerationType.FLAG, FlagType.SWITZERLAND, 1280, "res/flagSwitzerland.jpg");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void createImage(ImageHandling imageHandling, Enum creationType, String outputPath) throws IOException {
    imageHandling.createImage(creationType, 0, 0, null, outputPath);
  }

  private static void createImage(ImageHandling imageHandling, Enum creationType,
                                  int width, int height, String outputPath) throws IOException {
    imageHandling.createImage(creationType, width, height, null, outputPath);
  }

  private static void createImage(ImageHandling imageHandling, Enum creationType,
                                  int width, String outputPath) throws IOException {
    imageHandling.createImage(creationType, width, width, null, outputPath);
  }

  private static void createImage(ImageHandling imageHandling, Enum creationType,
                                  FlagType flagType, int width, String outputPath) throws IOException {
    imageHandling.createImage(creationType, width, 0, flagType, outputPath);
  }
}
