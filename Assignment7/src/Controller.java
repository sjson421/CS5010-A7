import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

public class Controller implements IController {
  private String inputFile;
  private BufferedImage modImage;
  private ImageHandling imageHandling;
  private BufferedImage storedImage;
  private ImageGeneration imageGen = new ImageGeneration();

  public Controller(String inputFile) {
    this.inputFile = inputFile;
  }

  @Override
  public void runProgram() throws IOException {
    BufferedReader buffReader = new BufferedReader
            (new InputStreamReader(new FileInputStream("./" + inputFile)));
    String line;
    while ((line = buffReader.readLine()) != null) {
      String[] terms = line.split(" ");

      if (terms.length == 1) {
        handleOneTerm(line, terms);
      } else if (terms.length > 1) {
        handleMoreTerms(line, terms);
      }
    }
  }

  private void saveImage(BufferedImage image, String outputPath) throws IOException {
    if (image != null) {
      File outputFile = new File(outputPath);
      ImageIO.write(image, outputPath.substring(outputPath.length() - 3), outputFile);
    } else {
      System.err.println("There is an error in your output path or image.");
    }
  }

  private void handleOneTerm(String line, String[] terms) {
    if (imageHandling instanceof ImageModification) {
      switch (terms[0].toLowerCase()) {
        //Modification
        case "blur":
          storedImage = imageHandling.createImage(ModType.BLUR, 0, 0,
                  null, 0);
          imageHandling = new ImageModification(storedImage);
          break;
        case "sharpen":
          storedImage = imageHandling.createImage(ModType.SHARPEN, 0, 0,
                  null, 0);
          imageHandling = new ImageModification(storedImage);
          break;
        case "greyscale":
          storedImage = imageHandling.createImage(ModType.GREYSCALE, 0, 0,
                  null, 0);
          imageHandling = new ImageModification(storedImage);
          break;
        case "sepia":
          storedImage = imageHandling.createImage(ModType.SEPIA, 0, 0,
                  null, 0);
          imageHandling = new ImageModification(storedImage);
          break;
        case "dither":
          storedImage = imageHandling.createImage(ModType.DITHER, 0, 0,
                  null, 0);
          imageHandling = new ImageModification(storedImage);
          break;
      }
    }
  }

  private void handleMoreTerms(String line, String[] terms) throws IOException {
    switch (terms[0].toLowerCase()) {
      case "load":
        modImage = ImageIO.read(new File("./res/" + terms[1]));
        imageHandling = new ImageModification(modImage);
        break;
      case "save":
        saveImage(storedImage, "./res/" + terms[1]);
        break;
      //Modification
      case "mosaic":
        storedImage = imageHandling.createImage(ModType.MOSAIC, 0, 0,
                null, Integer.parseInt(terms[1]));
        imageHandling = new ImageModification(storedImage);
        break;
      //Generation
      case "horizontalrainbow":
        imageHandling = imageGen;
        storedImage = imageHandling.createImage(GenerationType.HOR_RAINBOW_STRIPES,
                Integer.parseInt(terms[1]), Integer.parseInt(terms[2]), null, 0);
        break;
      case "verticalrainbow":
        imageHandling = imageGen;
        storedImage = imageHandling.createImage(GenerationType.VERT_RAINBOW_STRIPES,
                Integer.parseInt(terms[1]), Integer.parseInt(terms[2]), null, 0);
        break;
      case "checkerboard":
        imageHandling = imageGen;
        storedImage = imageHandling.createImage(GenerationType.CHECKERBOARD,
                Integer.parseInt(terms[1]), 0, null, 0);
        break;
      case "flag":
        imageHandling = imageGen;
        switch (terms[1].toLowerCase()) {
          case "france":
            storedImage = imageHandling.createImage(GenerationType.FLAG,
                    Integer.parseInt(terms[2]), 0, FlagType.FRANCE, 0);
            break;
          case "greece":
            storedImage = imageHandling.createImage(GenerationType.FLAG,
                    Integer.parseInt(terms[2]), 0, FlagType.GREECE, 0);
            break;
          case "switzerland":
            storedImage = imageHandling.createImage(GenerationType.FLAG,
                    Integer.parseInt(terms[2]), 0, FlagType.SWITZERLAND, 0);
            break;
        }
        break;
      default:
        System.err.println("Your command of \"" + line + "\" is invalid. "
                + "Check that you do not require a different number of terms.");
        break;
    }
  }
}
