/**
 * Abstract class for image handling, with functionalities that should be common to all forms of
 * image handling.
 */
public abstract class AbstractImageHandling implements ImageHandling {
  /**
   * Clamps the given channel value according to a given min and max.
   *
   * @param value Channel value to clamp
   * @param min   Minimum value in range of channel.
   * @param max   Maximum value in range of channel.
   * @return The clamped channel value. Returns itself if the value is between min and max, returns
   *     min if it is below min, and returns max if it is below max.
   */
  protected int clamp(int value, int min, int max) {
    if (value < min) {
      return min;
    } else if (value > max) {
      return max;
    } else {
      return value;
    }
  }
}
