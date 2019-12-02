import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Implementation of IController. Reads in the given argument input text and parses it to perform
 * model operations.
 */
public class InputController extends AbstractController {
  private String inputFile;
  private ImageHandling imageHandling;
  private BufferedImage storedImage;
  private ImageGeneration imageGen = new ImageGeneration();

  public InputController(String inputFile) {
    this.inputFile = inputFile;
  }

  @Override
  public void runProgram() throws IOException {
    BufferedReader buffReader = new BufferedReader(new InputStreamReader(
            new FileInputStream(inputFile)));
    String line;
    while ((line = buffReader.readLine()) != null) {
      String[] terms = line.split(" ");

      if (terms.length == 1) {
        handleOneTerm(terms);
      } else if (terms.length > 1) {
        handleMoreTerms(line, terms);
      }
    }
  }

  private void handleOneTerm(String[] terms) {
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
        default:
          break;
      }
    }
  }

  private void handleMoreTerms(String line, String[] terms) throws IOException {
    switch (terms[0].toLowerCase()) {
      case "load":
        imageHandling = load(terms[1]);
        break;
      case "save":
        save(storedImage, terms[1]);
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
          default:
            System.err.println("Invalid flag.");
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
