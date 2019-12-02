import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Implementation of IController. Connects to the view and gets its data to send to the model, and
 * vice versa.
 */

public class FrameController extends AbstractController {
  private ImageModification imageMod;
  private BufferedImage storedImage;
  private ImageGeneration imageGen = new ImageGeneration();
  private IView view;

  public FrameController() {
    View.setDefaultLookAndFeelDecorated(false);
  }

  @Override
  public void setView(IView v) {
    view = v;
    view.addController(this);
  }

  @Override
  public void runProgram() {
    setView(new View());
  }

  @Override
  public void blur() {
    storedImage = imageMod.createImage(ModType.BLUR, 0, 0,null, 0);
    imageMod = new ImageModification(storedImage);
    //TODO: Show storedImage on the image panel
  }

  @Override
  public void sharpen() {
    storedImage = imageMod.createImage(ModType.SHARPEN, 0, 0,null, 0);
    imageMod = new ImageModification(storedImage);
  }

  @Override
  public void greyscale() {
    storedImage = imageMod.createImage(ModType.GREYSCALE, 0, 0,null, 0);
    imageMod = new ImageModification(storedImage);
  }

  @Override
  public void sepia() {
    storedImage = imageMod.createImage(ModType.SEPIA, 0, 0,null, 0);
    imageMod = new ImageModification(storedImage);
  }

  @Override
  public void dither() {
    storedImage = imageMod.createImage(ModType.DITHER, 0, 0,null, 0);
    imageMod = new ImageModification(storedImage);
  }

  @Override
  public void mosaic(int seeds) {
    storedImage = imageMod.createImage(ModType.MOSAIC, 0, 0,null, seeds);
    imageMod = new ImageModification(storedImage);
  }

  @Override
  public void horRainbow(int width, int height) {
    storedImage = imageGen.createImage(GenerationType.HOR_RAINBOW_STRIPES,
            width, height, null, 0);
  }

  @Override
  public void vertRainbow(int width, int height) {
    storedImage = imageGen.createImage(GenerationType.VERT_RAINBOW_STRIPES,
            width, height, null, 0);
  }

  @Override
  public void checkerboard(int width) {
    storedImage = imageGen.createImage(GenerationType.CHECKERBOARD,
            width, 0, null, 0);
  }

  @Override
  public ImageModification load(String inputPath) throws IOException {
    ImageModification mod = super.load(inputPath);
    imageMod = mod;
    return mod;
  }
}
