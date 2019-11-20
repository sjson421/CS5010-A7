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
      BufferedImage image1 = ImageIO.read(new File("./res/typical.jpg"));
      BufferedImage image2 = ImageIO.read(new File("./res/landscape.jpg"));
      ImageHandling mod1 = new ImageModification(image1);
      ImageHandling mod2 = new ImageModification(image2);
//      ImageHandling gen = new ImageGeneration();
//
//      saveImage(mod1.createImage(ModType.BLUR, 0, 0, null),
//              "./res/typicalBlur.jpg");
//      saveImage(mod1.createImage(ModType.SHARPEN, 0, 0, null),
//              "./res/typicalSharpen.jpg");
//      saveImage(mod1.createImage(ModType.GREYSCALE, 0, 0, null),
//              "./res/typicalGreyScale.jpg");
//      saveImage(mod1.createImage(ModType.SEPIA, 0, 0, null),
//              "./res/typicalSepia.jpg");
//
//      saveImage(mod2.createImage(ModType.BLUR, 0, 0, null),
//              "./res/landscapeBlur.jpg");
//      saveImage(mod2.createImage(ModType.SHARPEN, 0, 0, null),
//              "./res/landscapeSharpen.jpg");
//      saveImage(mod2.createImage(ModType.GREYSCALE, 0, 0, null),
//              "./res/landscapeGreyScale.jpg");
//      saveImage(mod2.createImage(ModType.SEPIA, 0, 0, null),
//              "./res/landscapeSepia.jpg");
//
//      saveImage(gen.createImage(GenerationType.HOR_RAINBOW_STRIPES, 500, 1000, null),
//              "./res/horRainbowStripes.jpg");
//
//      saveImage(gen.createImage(GenerationType.VERT_RAINBOW_STRIPES, 1000, 500, null),
//              "./res/vertRainbowStripes.jpg");
//
//      saveImage(gen.createImage(GenerationType.CHECKERBOARD, 20, 0, null),
//              "./res/checkerboard.jpg");
//
//      saveImage(gen.createImage(GenerationType.FLAG, 500, 0, FlagType.FRANCE),
//              "./res/flagFrance.jpg");
//
//      saveImage(gen.createImage(GenerationType.FLAG, 500, 0, FlagType.GREECE),
//              "./res/flagGreece.jpg");
//
//      saveImage(gen.createImage(GenerationType.FLAG, 300, 0, FlagType.SWITZERLAND),
//              "./res/flagSwitzerland.jpg");

      /*
       * Assignment 2 starts here ----------------------------------------------------------------
       */
      saveImage(mod1.createImage(ModType.DITHER, 0, 0, null),
              "./res/typicalDither.jpg");
      saveImage(mod2.createImage(ModType.DITHER, 0, 0, null),
              "./res/landscapeDither.jpg");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void saveImage(BufferedImage image, String outputPath) throws IOException {
    if (image != null && outputPath.substring(outputPath.length() - 4)
            .equalsIgnoreCase(".jpg")) {
      File outputFile = new File(outputPath);
      ImageIO.write(image, "jpg", outputFile);
    } else {
      System.err.println("There is an error in your output path or image. "
              + "Check that your output path ends in \".jpg\"");
    }
  }
}
