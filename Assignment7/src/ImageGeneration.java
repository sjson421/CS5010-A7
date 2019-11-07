/**
 * Class for generating an image, depending on the method called. Does not require an argument image
 * to generate.
 */
public class ImageGeneration extends AbstractImageHandling {

  @Override
  public void createImage(Enum creationType, int width, int height,
                          FlagType flagType, String outputPath) {
    if (creationType == GenerationType.HOR_RAINBOW_STRIPES) {
      horRainbowStripes(width, height, outputPath);
    } else if (creationType == GenerationType.VERT_RAINBOW_STRIPES) {
      vertRainbowStripes(width, height, outputPath);
    } else if (creationType == GenerationType.CHECKERBOARD) {
      checkerboard(width, height, outputPath);
    } else if (creationType == GenerationType.FLAG) {
      generateFlag(width, flagType, outputPath);
    }
  }

  private void horRainbowStripes(int width, int height, String outputPath) {

  }

  private void vertRainbowStripes(int width, int height, String outputPath) {

  }

  private void checkerboard(int squareWidth, int squareHeight, String outputPath) {

  }
  private void generateFlag(int width, FlagType flagType, String outputPath) {
    if (flagType == FlagType.FRANCE) {

    } else if (flagType == FlagType.GREECE) {

    } else if (flagType == FlagType.SWITZERLAND) {

    }
  }
}
