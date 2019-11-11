import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

/**
 * Driver class for running main method.
 */
public class Driver {
  /**
   * Main method, taking the place of a controller. Runs all methods of the models.
   *
   * @param args No arguments required to run.
   */
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedImage image1 = ImageIO.read(new File("./res/typical.jpg"));
      BufferedImage image2 = ImageIO.read(new File("./res/landscape.jpg"));
      ImageHandling mod1 = new ImageModification(image1);
      ImageHandling mod2 = new ImageModification(image2);
      ImageHandling gen = new ImageGeneration();
      int width;
      int height;

      createImage(mod1, FilterType.BLUR, "./res/typicalBlur.jpg");
      createImage(mod1, FilterType.SHARPEN, "./res/typicalSharpen.jpg");
      createImage(mod1, FilterType.GREYSCALE, "./res/typicalGreyScale.jpg");
      createImage(mod1, FilterType.SEPIA, "./res/typicalSepia.jpg");

      createImage(mod2, FilterType.BLUR, "./res/landscapeBlur.jpg");
      createImage(mod2, FilterType.SHARPEN, "./res/landscapeSharpen.jpg");
      createImage(mod2, FilterType.GREYSCALE, "./res/landscapeGreyScale.jpg");
      createImage(mod2, FilterType.SEPIA, "./res/landscapeSepia.jpg");

      System.out.println("Enter horizontal rainbow width:");
      width = Integer.parseInt(br.readLine());
      System.out.println("Enter horizontal rainbow height:");
      height = Integer.parseInt(br.readLine());
      createImage(gen, GenerationType.HOR_RAINBOW_STRIPES, width, height, "./res/horRainbowStripes.jpg");

      System.out.println("Enter vertical rainbow width:");
      width = Integer.parseInt(br.readLine());
      System.out.println("Enter vertical rainbow height:");
      height = Integer.parseInt(br.readLine());
      createImage(gen, GenerationType.VERT_RAINBOW_STRIPES, width, height, "./res/vertRainbowStripes.jpg");

      System.out.println("Enter checkerboard square size:");
      width = Integer.parseInt(br.readLine());
      createImage(gen, GenerationType.CHECKERBOARD, width, "./res/checkerboard.jpg");

      System.out.println("Enter France's flag width:");
      width = Integer.parseInt(br.readLine());
      createImage(gen, GenerationType.FLAG, FlagType.FRANCE, width, "./res/flagFrance.jpg");

      System.out.println("Enter Greece's flag width:");
      width = Integer.parseInt(br.readLine());
      createImage(gen, GenerationType.FLAG, FlagType.GREECE, width, "./res/flagGreece.jpg");

      System.out.println("Enter Switzerland's flag width:");
      width = Integer.parseInt(br.readLine());
      createImage(gen, GenerationType.FLAG, FlagType.SWITZERLAND, width, "./res/flagSwitzerland.jpg");

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
