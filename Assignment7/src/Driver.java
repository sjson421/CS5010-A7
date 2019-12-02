import java.io.IOException;

/**
 * Driver class for running main method.
 */
public class Driver {
  /**
   * Main method for running the program. Hands control over to controller.
   *
   * @param args Arguments for the main method. Use "-script path-of-script-file" to use a script
   *             input text file, and "-interactive" to use the view using JFrame.
   */
  public static void main(String[] args) throws IOException {
    IController c;
    if (args.length > 0) {
      if (args[0].equals("-script") && args.length == 2) {
        String inputFile = args[1];
        c = new InputController(inputFile);
        c.runProgram();
      } else if (args[0].equals("-interactive") && args.length == 1) {
        c = new FrameController();
        IView view = new View(c);
        c.setView(view);
        c.runProgram();
      } else {
        throw new IllegalArgumentException("The arguments you have entered are invalid.");
      }
    } else {
      throw new IllegalArgumentException("The program requires arguments using "
              + "either \"-script\" or \"-interactive\" to proceed.");
    }
  }
}
