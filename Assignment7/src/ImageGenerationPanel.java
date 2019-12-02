import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class ImageGenerationPanel extends JPanel {
  private JButton checkerboardButton;
  private JButton horizontalRainbowButton;
  private JLabel imageWidthLabel;
  private JTextField imageWidthTextField;
  private JLabel picSpace;
  private JLabel imageHeightLabel;
  private JTextField imageHeightTextField;
  private JLabel squareWidthLabel;
  private JTextField squareWidthTextField;
  private JLabel stripeWidthLabel;
  private JTextField stripeWidthTextField;
  private JLabel stripeHeightLabel;
  private JTextField stripeHeightTextField;
  private JButton verticalRainbowButton;
  private IController controller;
  private JButton selectedGen;

  public ImageGenerationPanel(IController c) {
    components();
    controller = c;
    stripeHeightLabel.setVisible(false);
    stripeHeightTextField.setVisible(false);
    imageWidthLabel.setVisible(false);
    imageWidthTextField.setVisible(false);
    stripeWidthLabel.setVisible(false);
    stripeWidthTextField.setVisible(false);
    imageHeightLabel.setVisible(false);
    imageHeightTextField.setVisible(false);
    squareWidthLabel.setVisible(false);
    squareWidthTextField.setVisible(false);
  }


  private void components() {

    JPanel jPanel1 = new JPanel();
    JLabel imageGenerationLabel = new JLabel();
    JLabel selectImageGenerationTypeLabel = new JLabel();
    stripeHeightTextField = new JTextField();
    imageWidthTextField = new JTextField();
    horizontalRainbowButton = new JButton();
    verticalRainbowButton = new JButton();
    checkerboardButton = new JButton();
    imageWidthLabel = new JLabel();
    stripeWidthLabel = new JLabel();
    stripeHeightLabel = new JLabel();
    stripeWidthTextField = new JTextField();
    squareWidthLabel = new JLabel();
    squareWidthTextField = new JTextField();
    imageHeightLabel = new JLabel();
    imageHeightTextField = new JTextField();
    picSpace = new JLabel();
    JButton generateButton = new JButton();

    setBackground(new java.awt.Color(255, 255, 255));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setForeground(new java.awt.Color(153, 153, 153));

    imageGenerationLabel.setBackground(new java.awt.Color(0, 0, 255));
    imageGenerationLabel.setFont(new java.awt.Font("SansSerif", 0, 36));
    imageGenerationLabel.setForeground(new java.awt.Color(153, 153, 153));
    imageGenerationLabel.setText("Image Generation");

    selectImageGenerationTypeLabel.setFont(new java.awt.Font("SansSerif", 0, 28));
    selectImageGenerationTypeLabel.setForeground(new java.awt.Color(153, 153, 153));
    selectImageGenerationTypeLabel.setText("Select Image Generation Type:");

    horizontalRainbowButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    horizontalRainbowButton.setText("Horizontal Rainbow");
    horizontalRainbowButton.setBorder(BorderFactory.createBevelBorder(
            javax.swing.border.BevelBorder.RAISED));
    horizontalRainbowButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    horizontalRainbowButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        horizontalRainbowButtonActionPerformed(evt);
      }
    });

    verticalRainbowButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    verticalRainbowButton.setText("Vertical Rainbow");
    verticalRainbowButton.setBorder(BorderFactory.createBevelBorder(
            javax.swing.border.BevelBorder.RAISED));
    verticalRainbowButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    verticalRainbowButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        verticalRainbowButtonActionPerformed(evt);
      }
    });

    checkerboardButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    checkerboardButton.setText("Checkerboard");
    checkerboardButton.setBorder(BorderFactory.createBevelBorder(
            javax.swing.border.BevelBorder.RAISED));
    checkerboardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    checkerboardButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        checkerboardButtonActionPerformed(evt);
      }
    });

    imageWidthLabel.setFont(new java.awt.Font("SansSerif", 0, 24));
    imageWidthLabel.setForeground(new java.awt.Color(153, 153, 153));
    imageWidthLabel.setText("Enter Image Width:");

    stripeWidthLabel.setFont(new java.awt.Font("SansSerif", 0, 24));
    stripeWidthLabel.setForeground(new java.awt.Color(153, 153, 153));
    stripeWidthLabel.setText("Enter Width of each Stripe:");

    stripeHeightLabel.setFont(new java.awt.Font("SansSerif", 0, 24));
    stripeHeightLabel.setForeground(new java.awt.Color(153, 153, 153));
    stripeHeightLabel.setText("Enter Height of each Stripe:");

    squareWidthLabel.setFont(new java.awt.Font("SansSerif", 0, 24));
    squareWidthLabel.setForeground(new java.awt.Color(153, 153, 153));
    squareWidthLabel.setText("Enter Square Width:");

    imageHeightLabel.setFont(new java.awt.Font("SansSerif", 0, 24));
    imageHeightLabel.setForeground(new java.awt.Color(153, 153, 153));
    imageHeightLabel.setText("Enter Image Height:");

    picSpace.setBackground(new java.awt.Color(0, 0, 255));
    picSpace.setFont(new java.awt.Font("SansSerif", 0, 36));
    picSpace.setForeground(new java.awt.Color(153, 153, 153));

    generateButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    generateButton.setText("Generate");
    generateButton.setBorder(BorderFactory.createBevelBorder(
            javax.swing.border.BevelBorder.RAISED));
    generateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    generateButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        generateJButtonActionPerformed(evt);
      }
    });

    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
            GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(30, 30, 30).addGroup(jPanel1Layout.createParallelGroup(
                    GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(selectImageGenerationTypeLabel)
                    .addGap(39, 39, 39)
                    .addComponent(imageGenerationLabel, GroupLayout.PREFERRED_SIZE, 297,
                            GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(
                                    GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout
                                    .createParallelGroup(
                                            GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(stripeWidthLabel)
                                            .addPreferredGap(
                                                    LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(stripeWidthTextField,
                                                    GroupLayout.PREFERRED_SIZE, 150,
                                                    GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(
                                                    GroupLayout.Alignment.LEADING)
                                                    .addComponent(imageWidthLabel)
                                                    .addComponent(stripeHeightLabel))
                                            .addPreferredGap(
                                                    LayoutStyle.ComponentPlacement.RELATED,
                                                    GroupLayout.DEFAULT_SIZE,
                                                    Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(
                                                    GroupLayout.Alignment.LEADING)
                                                    .addComponent(imageWidthTextField,
                                                            GroupLayout.PREFERRED_SIZE,
                                                            150,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(stripeHeightTextField,
                                                            GroupLayout.PREFERRED_SIZE,
                                                            150,
                                                            GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createParallelGroup(
                                            GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(horizontalRainbowButton,
                                                    GroupLayout.Alignment.LEADING,
                                                    GroupLayout.DEFAULT_SIZE, 211,
                                                    Short.MAX_VALUE)
                                            .addComponent(verticalRainbowButton,
                                                    GroupLayout.Alignment.LEADING,
                                                    GroupLayout.DEFAULT_SIZE,
                                                    GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(checkerboardButton,
                                                    GroupLayout.Alignment.LEADING,
                                                    GroupLayout.DEFAULT_SIZE,
                                                    GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(
                                                    GroupLayout.Alignment.LEADING)
                                                    .addComponent(imageHeightLabel,
                                                            GroupLayout.PREFERRED_SIZE,
                                                            268, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(squareWidthLabel,
                                                            GroupLayout.PREFERRED_SIZE,
                                                            280, GroupLayout.PREFERRED_SIZE))
                                            .addGap(23, 23, 23)
                                            .addGroup(jPanel1Layout.createParallelGroup(
                                                    GroupLayout.Alignment.LEADING)
                                                    .addComponent(imageHeightTextField,
                                                            GroupLayout.PREFERRED_SIZE, 150,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(squareWidthTextField,
                                                            GroupLayout.PREFERRED_SIZE, 150,
                                                            GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(generateButton,
                                                    GroupLayout.PREFERRED_SIZE, 189,
                                                    GroupLayout.PREFERRED_SIZE)))
                            .addGap(51, 51, 51)
                            .addComponent(picSpace, GroupLayout.PREFERRED_SIZE, 700,
                                    GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(814, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup().addGroup(
                    jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(selectImageGenerationTypeLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(imageGenerationLabel,
                                            GroupLayout.PREFERRED_SIZE, 46,
                                            GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(
                            GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(horizontalRainbowButton,
                                            GroupLayout.PREFERRED_SIZE, 35,
                                            GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(verticalRainbowButton,
                                            GroupLayout.PREFERRED_SIZE, 35,
                                            GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(checkerboardButton,
                                            GroupLayout.PREFERRED_SIZE, 35,
                                            GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)
                                    .addGroup(jPanel1Layout.createParallelGroup(
                                            GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(40, 40, 40)
                                                    .addComponent(imageWidthLabel,
                                                            GroupLayout.PREFERRED_SIZE,
                                                            38,
                                                            GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle
                                                            .ComponentPlacement.RELATED)
                                                    .addGroup(jPanel1Layout
                                                            .createParallelGroup(
                                                                    GroupLayout.Alignment.BASELINE)
                                                            .addComponent(stripeWidthLabel,
                                                                    GroupLayout.PREFERRED_SIZE,
                                                                    38,
                                                                    GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(stripeWidthTextField,
                                                                    GroupLayout.PREFERRED_SIZE,
                                                                    GroupLayout.DEFAULT_SIZE,
                                                                    GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(LayoutStyle
                                                            .ComponentPlacement.RELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(
                                                            GroupLayout.Alignment.BASELINE)
                                                            .addComponent(imageHeightLabel,
                                                                    GroupLayout.PREFERRED_SIZE,
                                                                    38,
                                                                    GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(imageHeightTextField,
                                                                    GroupLayout.PREFERRED_SIZE,
                                                                    GroupLayout.DEFAULT_SIZE,
                                                                    GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(LayoutStyle
                                                            .ComponentPlacement.RELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(
                                                            GroupLayout.Alignment.BASELINE)
                                                            .addComponent(squareWidthLabel,
                                                                    GroupLayout.PREFERRED_SIZE,
                                                                    38,
                                                                    GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(squareWidthTextField,
                                                                    GroupLayout.PREFERRED_SIZE,
                                                                    GroupLayout.DEFAULT_SIZE,
                                                                    GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(
                                                            GroupLayout.Alignment.BASELINE)
                                                            .addComponent(stripeHeightLabel,
                                                                    GroupLayout.PREFERRED_SIZE,
                                                                    38,
                                                                    GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(stripeHeightTextField,
                                                                    GroupLayout.PREFERRED_SIZE,
                                                                    GroupLayout.DEFAULT_SIZE,
                                                                    GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(LayoutStyle
                                                            .ComponentPlacement.UNRELATED)
                                                    .addComponent(imageWidthTextField,
                                                            GroupLayout.PREFERRED_SIZE,
                                                            GroupLayout.DEFAULT_SIZE,
                                                            GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(generateButton, GroupLayout.PREFERRED_SIZE,
                                            35, GroupLayout.PREFERRED_SIZE))
                            .addComponent(picSpace, GroupLayout.PREFERRED_SIZE, 500,
                                    GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(879, Short.MAX_VALUE))
    );

    GroupLayout layout = new GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, 0)
                            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE,
                                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE,
                                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0))
    );
  }

  private void checkerboardButtonActionPerformed(java.awt.event.ActionEvent evt) {
    clearButtons();
    stripeHeightLabel.setVisible(false);
    stripeHeightTextField.setVisible(false);
    imageWidthLabel.setVisible(false);
    imageWidthTextField.setVisible(false);
    stripeWidthLabel.setVisible(false);
    stripeWidthTextField.setVisible(false);
    imageHeightLabel.setVisible(false);
    imageHeightTextField.setVisible(false);
    squareWidthLabel.setVisible(true);
    squareWidthTextField.setVisible(true);
    checkerboardButton.setBackground(Color.YELLOW);
    selectedGen = checkerboardButton;
  }

  private void verticalRainbowButtonActionPerformed(java.awt.event.ActionEvent evt) {
    clearButtons();
    stripeHeightLabel.setVisible(false);
    stripeHeightTextField.setVisible(false);
    imageWidthLabel.setVisible(false);
    imageWidthTextField.setVisible(false);
    squareWidthLabel.setVisible(false);
    squareWidthTextField.setVisible(false);
    stripeWidthLabel.setVisible(true);
    stripeWidthTextField.setVisible(true);
    imageHeightLabel.setVisible(true);
    imageHeightTextField.setVisible(true);
    verticalRainbowButton.setBackground(Color.YELLOW);
    selectedGen = verticalRainbowButton;
  }

  private void horizontalRainbowButtonActionPerformed(java.awt.event.ActionEvent evt) {
    clearButtons();
    stripeHeightLabel.setVisible(true);
    stripeHeightTextField.setVisible(true);
    imageWidthLabel.setVisible(true);
    imageWidthTextField.setVisible(true);
    stripeWidthLabel.setVisible(false);
    stripeWidthTextField.setVisible(false);
    imageHeightLabel.setVisible(false);
    imageHeightTextField.setVisible(false);
    squareWidthLabel.setVisible(false);
    squareWidthTextField.setVisible(false);
    horizontalRainbowButton.setBackground(Color.YELLOW);
    selectedGen = horizontalRainbowButton;
  }

  private void generateJButtonActionPerformed(java.awt.event.ActionEvent evt) {
    String genText = selectedGen.getText().toLowerCase();
    BufferedImage img = null;

    try {
      switch (genText) {
        case "horizontal rainbow":
          img = controller.horRainbow(Integer.parseInt(imageWidthTextField.getText()),
                  Integer.parseInt(stripeHeightTextField.getText()));
          break;
        case "vertical rainbow":
          img = controller.vertRainbow(Integer.parseInt(stripeWidthTextField.getText()),
                  Integer.parseInt(imageHeightTextField.getText()));
          break;
        case "checkerboard":
          img = controller.checkerboard(Integer.parseInt(squareWidthTextField.getText()));
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
    }
  }

  private void clearButtons() {
    horizontalRainbowButton.setBackground(Color.LIGHT_GRAY);
    verticalRainbowButton.setBackground(Color.LIGHT_GRAY);
    checkerboardButton.setBackground(Color.LIGHT_GRAY);
  }
}
