import java.awt.Image;
import java.io.File;

import javax.swing.*;

public class ImageModificationPanel extends JPanel {
  private JLabel ImageModificationPanel;
  private JLabel SelectImageModTypeLabel;
  private JLabel UploadPicture;
  private JButton Uploadbutton;
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

  public ImageModificationPanel() {
    componenets();
    UploadPicture.setVisible(false);
    Uploadbutton.setVisible(false);
    modifyJButton.setVisible(false);
    enterSeeds.setVisible(false);
    seedTextField.setVisible(false);
  }


  private void componenets() {

    ImageModificationPanel = new JLabel();
    SelectImageModTypeLabel = new JLabel();
    modifyJButton = new JButton();
    Uploadbutton = new JButton();
    UploadPicture = new JLabel();
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

    ImageModificationPanel.setBackground(new java.awt.Color(153, 0, 153));
    ImageModificationPanel.setFont(new java.awt.Font("Calibri", 1, 36));
    ImageModificationPanel.setForeground(new java.awt.Color(153, 153, 153));
    ImageModificationPanel.setText("Image Modification");

    SelectImageModTypeLabel.setFont(new java.awt.Font("Calibri", 1, 28));
    SelectImageModTypeLabel.setForeground(new java.awt.Color(153, 153, 153));
    SelectImageModTypeLabel.setText("Select Image Modification Type:");

    modifyJButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    modifyJButton.setText("Modify");
    modifyJButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    modifyJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    modifyJButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        modifyJButtonActionPerformed(evt);
      }
    });

    Uploadbutton.setFont(new java.awt.Font("SansSerif", 0, 20));
    Uploadbutton.setText("Upload");
    Uploadbutton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Uploadbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    Uploadbutton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        UploadbuttonActionPerformed(evt);
      }
    });

    UploadPicture.setFont(new java.awt.Font("Calibri", 1, 24));
    UploadPicture.setForeground(new java.awt.Color(153, 153, 153));
    UploadPicture.setText("Upload Picture:");

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
    grayScaleButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

    enterSeeds.setFont(new java.awt.Font("Calibri", 1, 24));
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
                            .addComponent(ImageModificationPanel)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addComponent(SelectImageModTypeLabel)
                                            .addGap(194, 852, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                    .addComponent(blurButton, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sepiaButton, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sharpenButton, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(grayScaleButton, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(mosaicButton, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(UploadPicture)
                                                    .addComponent(Uploadbutton, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(enterSeeds)
                                                            .addComponent(modifyJButton, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                                            .addComponent(seedTextField))
                                                    .addComponent(ditherButton, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
                                            .addGap(77, 77, 77)
                                            .addComponent(picSpace, GroupLayout.PREFERRED_SIZE, 743, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(ImageModificationPanel)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SelectImageModTypeLabel)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(blurButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(sepiaButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(sharpenButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(grayScaleButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ditherButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(mosaicButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(UploadPicture)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Uploadbutton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(enterSeeds)
                                            .addGap(8, 8, 8)
                                            .addComponent(seedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(modifyJButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(picSpace, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)))
                            .addContainerGap())
    );
  }

  private void modifyJButtonActionPerformed(java.awt.event.ActionEvent evt) {

    JOptionPane.showMessageDialog(null, "Information Created Successfully");
  }

  private void UploadbuttonActionPerformed(java.awt.event.ActionEvent evt) {
    JFileChooser choose = new JFileChooser();
    choose.showOpenDialog(null);
    File file = choose.getSelectedFile();
    if (file != null) {
      String img_path = file.getAbsolutePath();
      ImageIcon icon = new ImageIcon(img_path);
      Image img = icon.getImage();
      picSpace.setIcon(icon);
      modifyJButton.setVisible(true);
    }
  }

  private void blurButtonActionPerformed(java.awt.event.ActionEvent evt) {
    UploadPicture.setVisible(true);
    Uploadbutton.setVisible(true);
  }

  private void sepiaButtonActionPerformed(java.awt.event.ActionEvent evt) {
    UploadPicture.setVisible(true);
    Uploadbutton.setVisible(true);
  }

  private void sharpenButtonActionPerformed(java.awt.event.ActionEvent evt) {
    UploadPicture.setVisible(true);
    Uploadbutton.setVisible(true);
  }

  private void grayScaleButtonActionPerformed(java.awt.event.ActionEvent evt) {
    UploadPicture.setVisible(true);
    Uploadbutton.setVisible(true);
  }

  private void ditherButtonActionPerformed(java.awt.event.ActionEvent evt) {
    UploadPicture.setVisible(true);
    Uploadbutton.setVisible(true);
  }

  private void mosaicButtonActionPerformed(java.awt.event.ActionEvent evt) {
    UploadPicture.setVisible(true);
    Uploadbutton.setVisible(true);
    modifyJButton.setVisible(true);
    enterSeeds.setVisible(true);
    seedTextField.setVisible(true);
  }
}
