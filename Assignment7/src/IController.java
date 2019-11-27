import java.io.IOException;

/**
 * Controller that handles the running of the code, acting as the intermediary between the view and
 * the models.
 */
public interface IController {

  /**
   * Called in the main method to have the controller control the flow of the program.
   * @throws IOException Thrown when the input file does not exist.
   */
  void runProgram() throws IOException;
}
