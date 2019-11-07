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
      BufferedImage image1 = ImageIO.read(new File("res/building.jpg"));
      BufferedImage image2 = ImageIO.read(new File("res/landscape.jpg"));
      ImageHandling mod1 = new ImageModificationFactory(image1);
      ImageHandling mod2 = new ImageModificationFactory(image2);
      ImageHandling gen = new ImageGenerationFactory();

      createImage(mod1, FilterType.BLUR);
      createImage(mod1, FilterType.SHARPEN);
      createImage(mod1, FilterType.GREYSCALE);
      createImage(mod1, FilterType.SEPIA);

      createImage(mod2, FilterType.BLUR);
      createImage(mod2, FilterType.SHARPEN);
      createImage(mod2, FilterType.GREYSCALE);
      createImage(mod2, FilterType.SEPIA);

      createImage(gen, GenerationType.HOR_RAINBOW_STRIPES, 1280, 720);
      createImage(gen, GenerationType.VERT_RAINBOW_STRIPES, 1280, 720);
      createImage(gen, GenerationType.CHECKERBOARD, 1280, 720);
      createImage(gen, GenerationType.FLAG, FlagType.FRANCE, 1280);
      createImage(gen, GenerationType.FLAG, FlagType.GREECE, 1280);
      createImage(gen, GenerationType.FLAG, FlagType.SWITZERLAND, 1280);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void createImage(ImageHandling imageHandling, Enum creationType) {
    imageHandling.createImage(creationType);
  }

  private static void createImage(ImageHandling imageHandling, Enum creationType,
                                    int width, int height) {
    imageHandling.createImage(creationType, width, height, null);
  }

  private static void createImage(ImageHandling imageHandling, Enum creationType,
                                  FlagType flagType, int width) {
    imageHandling.createImage(creationType, width, 0, flagType);
  }
}
