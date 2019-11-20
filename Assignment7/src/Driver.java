import java.io.IOException;

/**
 * Driver class for running main method.
 */
public class Driver {
  /**
   * Main method for running the program. Hands control over to controller.
   *
   * @param args First argument for file with input commands.
   */
  public static void main(String[] args) throws IOException {
    if (args.length > 0) {
      String inputFile = args[0];
      IController c = new Controller(inputFile);
      c.runProgram();
    }
  }
}
