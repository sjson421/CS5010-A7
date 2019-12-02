import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageModificationPanel extends JPanel {
  private JLabel uploadPicture;
  private JButton uploadButton;
  private JButton blurButton;
  private JButton ditherButton;
  private JLabel enterSeeds;
  private JButton grayScaleButton;
  private JButton modifyJButton;
  private JButton mosaicButton;
  private JLabel picSpace;
  private JTextField seedTextField;
  private JButton sepiaButton;
  private JButton sharpenButton;
  private JButton selectedMod;
  private IController controller;

  public ImageModificationPanel(IController c) {
    components();
    controller = c;
    uploadPicture.setVisible(false);
    uploadButton.setVisible(false);
    modifyJButton.setVisible(false);
    enterSeeds.setVisible(false);
    seedTextField.setVisible(false);
  }


  private void components() {
    JLabel imageModificationPanel = new JLabel();
    JLabel selectImageModTypeLabel = new JLabel();
    modifyJButton = new JButton();
    uploadButton = new JButton();
    uploadPicture = new JLabel();
    blurButton = new JButton();
    sepiaButton = new JButton();
    sharpenButton = new JButton();
    grayScaleButton = new JButton();
    ditherButton = new JButton();
    mosaicButton = new JButton();
    enterSeeds = new JLabel();
    seedTextField = new JTextField();
    picSpace = new JLabel();

    setBackground(new java.awt.Color(255, 255, 255));
    setForeground(new java.awt.Color(240, 240, 240));

    imageModificationPanel.setBackground(new java.awt.Color(153, 0, 153));
    imageModificationPanel.setFont(new java.awt.Font("SansSerif", 0, 36));
    imageModificationPanel.setForeground(new java.awt.Color(153, 153, 153));
    imageModificationPanel.setText("Image Modification");

    selectImageModTypeLabel.setFont(new java.awt.Font("SansSerif", 0, 28));
    selectImageModTypeLabel.setForeground(new java.awt.Color(153, 153, 153));
    selectImageModTypeLabel.setText("Select Image Modification Type:");

    modifyJButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    modifyJButton.setText("Modify");
    modifyJButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    modifyJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    modifyJButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        modifyJButtonActionPerformed(evt);
      }
    });

    uploadButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    uploadButton.setText("Upload");
    uploadButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    uploadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    uploadButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        try {
          uploadButtonActionPerformed(evt);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    });

    uploadPicture.setFont(new java.awt.Font("SansSerif", 0, 24));
    uploadPicture.setForeground(new java.awt.Color(153, 153, 153));
    uploadPicture.setText("Upload Picture:");

    blurButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    blurButton.setText("Blur");
    blurButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    blurButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    blurButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        blurButtonActionPerformed(evt);
      }
    });

    sepiaButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    sepiaButton.setText("Sepia");
    sepiaButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    sepiaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    sepiaButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        sepiaButtonActionPerformed(evt);
      }
    });

    sharpenButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    sharpenButton.setText("Sharpen");
    sharpenButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    sharpenButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    sharpenButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        sharpenButtonActionPerformed(evt);
      }
    });

    grayScaleButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    grayScaleButton.setText("Greyscale");
    grayScaleButton.setBorder(BorderFactory.createBevelBorder(
            javax.swing.border.BevelBorder.RAISED));
    grayScaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    grayScaleButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        grayScaleButtonActionPerformed(evt);
      }
    });

    ditherButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    ditherButton.setText("Dither");
    ditherButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    ditherButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    ditherButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ditherButtonActionPerformed(evt);
      }
    });

    mosaicButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    mosaicButton.setText("Mosaic");
    mosaicButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    mosaicButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    mosaicButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        mosaicButtonActionPerformed(evt);
      }
    });

    enterSeeds.setFont(new java.awt.Font("SansSerif", 0, 24));
    enterSeeds.setForeground(new java.awt.Color(153, 153, 153));
    enterSeeds.setText("Enter Seeds:");

    picSpace.setBackground(new java.awt.Color(255, 255, 255));
    picSpace.setFont(new java.awt.Font("SansSerif", 0, 20));

    GroupLayout layout = new GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addGap(473, 473, 473)
                            .addComponent(imageModificationPanel)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addComponent(selectImageModTypeLabel)
                                            .addGap(194, 852, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(
                                                    GroupLayout.Alignment.LEADING)
                                                    .addComponent(blurButton,
                                                            GroupLayout.PREFERRED_SIZE, 125,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sharpenButton,
                                                            GroupLayout.PREFERRED_SIZE, 125,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sepiaButton,
                                                            GroupLayout.PREFERRED_SIZE, 125,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(grayScaleButton,
                                                            GroupLayout.PREFERRED_SIZE, 125,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(mosaicButton,
                                                            GroupLayout.PREFERRED_SIZE, 125,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(uploadPicture)
                                                    .addComponent(uploadButton,
                                                            GroupLayout.PREFERRED_SIZE, 125,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(
                                                            GroupLayout.Alignment.LEADING,
                                                            false)
                                                            .addComponent(enterSeeds)
                                                            .addComponent(modifyJButton,
                                                                    GroupLayout.DEFAULT_SIZE,
                                                                    125, Short.MAX_VALUE)
                                                            .addComponent(seedTextField))
                                                    .addComponent(ditherButton,
                                                            GroupLayout.PREFERRED_SIZE, 125,
                                                            GroupLayout.PREFERRED_SIZE))
                                            .addGap(77, 77, 77)
                                            .addComponent(picSpace, GroupLayout.PREFERRED_SIZE,
                                                    700, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(imageModificationPanel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selectImageModTypeLabel)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(blurButton, GroupLayout.PREFERRED_SIZE,
                                                    35, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(
                                                    LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(sharpenButton, GroupLayout.PREFERRED_SIZE,
                                                    35, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(
                                                    LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(sepiaButton, GroupLayout.PREFERRED_SIZE,
                                                    35, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(
                                                    LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(grayScaleButton,
                                                    GroupLayout.PREFERRED_SIZE, 35,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(
                                                    LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ditherButton, GroupLayout.PREFERRED_SIZE,
                                                    35, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(
                                                    LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(mosaicButton, GroupLayout.PREFERRED_SIZE,
                                                    35, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(uploadPicture)
                                            .addPreferredGap(
                                                    LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(uploadButton, GroupLayout.PREFERRED_SIZE,
                                                    33, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(
                                                    LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(enterSeeds)
                                            .addGap(8, 8, 8)
                                            .addComponent(seedTextField,
                                                    GroupLayout.PREFERRED_SIZE,
                                                    GroupLayout.DEFAULT_SIZE,
                                                    GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(
                                                    LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(modifyJButton, GroupLayout.PREFERRED_SIZE,
                                                    35, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(picSpace, GroupLayout.PREFERRED_SIZE,
                                                    500, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap())
    );
  }

  private void modifyJButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String modText = selectedMod.getText().toLowerCase();
    BufferedImage img = null;

    try {
      switch (modText) {
        case "blur":
          img = controller.blur();
          break;
        case "sharpen":
          img = controller.sharpen();
          break;
        case "sepia":
          img = controller.sepia();
          break;
        case "greyscale":
          img = controller.greyscale();
          break;
        case "dither":
          img = controller.dither();
          break;
        case "mosaic":
          img = controller.mosaic(Integer.parseInt(seedTextField.getText()));
          break;
        default:
          break;
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,
              "You have entered invalid inputs.");
    }
    if (img != null) {
      try {
        if (img.getWidth() > picSpace.getWidth()) {
          picSpace.setIcon(new ImageIcon(img.getScaledInstance(picSpace.getWidth(),
                  picSpace.getHeight(), Image.SCALE_SMOOTH)));
        } else if (img.getWidth() > picSpace.getWidth()) {
          picSpace.setIcon(new ImageIcon(img.getScaledInstance(picSpace.getWidth(),
                  img.getHeight(), Image.SCALE_SMOOTH)));
        } else if (img.getHeight() > picSpace.getHeight()) {
          picSpace.setIcon(new ImageIcon(img.getScaledInstance(img.getWidth(),
                  picSpace.getHeight(), Image.SCALE_SMOOTH)));
        } else {
          picSpace.setIcon(new ImageIcon(img));
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null,
                "You have entered invalid inputs.");
      }
    } else {
      JOptionPane.showMessageDialog(null,
              "You have not entered an image to modify.");
    }
  }

  private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
    JFileChooser choose = new JFileChooser();
    choose.showOpenDialog(null);
    File file = choose.getSelectedFile();
    if (file != null) {
      String imgPath = file.getAbsolutePath();
      try {
        Image img = ImageIO.read(file).getScaledInstance(picSpace.getWidth(),
                picSpace.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        picSpace.setIcon(icon);
        controller.load(imgPath);
        modifyJButton.setVisible(true);
      } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null,
                "You did not enter an image file.");
      }
    }
  }

  private void blurButtonActionPerformed(java.awt.event.ActionEvent evt) {
    clearButtons();
    blurButton.setBackground(Color.YELLOW);
    selectedMod = blurButton;
    uploadPicture.setVisible(true);
    uploadButton.setVisible(true);
    enterSeeds.setVisible(false);
    seedTextField.setVisible(false);
  }

  private void sharpenButtonActionPerformed(java.awt.event.ActionEvent evt) {
    clearButtons();
    sharpenButton.setBackground(Color.YELLOW);
    selectedMod = sharpenButton;
    uploadPicture.setVisible(true);
    uploadButton.setVisible(true);
    enterSeeds.setVisible(false);
    seedTextField.setVisible(false);
  }

  private void sepiaButtonActionPerformed(java.awt.event.ActionEvent evt) {
    clearButtons();
    sepiaButton.setBackground(Color.YELLOW);
    selectedMod = sepiaButton;
    uploadPicture.setVisible(true);
    uploadButton.setVisible(true);
    enterSeeds.setVisible(false);
    seedTextField.setVisible(false);
  }

  private void grayScaleButtonActionPerformed(java.awt.event.ActionEvent evt) {
    clearButtons();
    grayScaleButton.setBackground(Color.YELLOW);
    selectedMod = grayScaleButton;
    uploadPicture.setVisible(true);
    uploadButton.setVisible(true);
    enterSeeds.setVisible(false);
    seedTextField.setVisible(false);
  }

  private void ditherButtonActionPerformed(java.awt.event.ActionEvent evt) {
    clearButtons();
    ditherButton.setBackground(Color.YELLOW);
    selectedMod = ditherButton;
    uploadPicture.setVisible(true);
    uploadButton.setVisible(true);
    enterSeeds.setVisible(false);
    seedTextField.setVisible(false);
  }

  private void mosaicButtonActionPerformed(java.awt.event.ActionEvent evt) {
    clearButtons();
    mosaicButton.setBackground(Color.YELLOW);
    selectedMod = mosaicButton;
    uploadPicture.setVisible(true);
    uploadButton.setVisible(true);
    enterSeeds.setVisible(true);
    seedTextField.setVisible(true);
  }

  private void clearButtons() {
    blurButton.setBackground(Color.LIGHT_GRAY);
    sharpenButton.setBackground(Color.LIGHT_GRAY);
    sepiaButton.setBackground(Color.LIGHT_GRAY);
    grayScaleButton.setBackground(Color.LIGHT_GRAY);
    ditherButton.setBackground(Color.LIGHT_GRAY);
    mosaicButton.setBackground(Color.LIGHT_GRAY);
  }
}
