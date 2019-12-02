/**
 * The view of the image processor.
 */
public interface IView {
  /**
   * Provides the view with the controller associated with this view, for sending data back into the
   * controller.
   *
   * @param controller The controller associated with this view, and its associated functions
   */
  void addController(IController controller);
}
