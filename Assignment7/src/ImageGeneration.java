/**
 * Class for generating an image, depending on the method called. Does not require an argument image
 * to generate.
 */
public class ImageGeneration extends AbstractImageHandling {

  @Override
  public void createImage(Enum creationType, int width, int height, FlagType flagType) {
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

  private void horRainbowStripes(int width, int height) {

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
