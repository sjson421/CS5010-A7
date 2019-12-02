import javax.swing.*;

public class ImageGenerationPanel extends JPanel {
  private JButton checkerboardButton;
  private JButton horizontalRainbowButton;
  private JLabel imageGenerationLabel;
  private JLabel imageHeightLabel;
  private JTextField imageHeightTextField;
  private JLabel imageLabel;
  private JLabel imageWidthLabel;
  private JTextField imageWidthTextField;
  private JPanel jPanel1;
  private JLabel selectImageGenerationTypeLabel;
  private JLabel squareWidthLabel;
  private JTextField squarewidthTextField;
  private JLabel stripeHeightLabel;
  private JTextField stripeHeightTextField;
  private JLabel stripeWidthLabel;
  private JTextField stripeWidthTextField;
  private JButton verticalRainbowButton;


  public ImageGenerationPanel() {
    components();
    stripeWidthLabel.setVisible(false);
    stripeWidthTextField.setVisible(false);
    imageHeightLabel.setVisible(false);
    imageHeightTextField.setVisible(false);
    stripeHeightLabel.setVisible(false);
    stripeHeightTextField.setVisible(false);
    imageWidthLabel.setVisible(false);
    imageWidthTextField.setVisible(false);
    squareWidthLabel.setVisible(false);
    squarewidthTextField.setVisible(false);

  }


  private void components() {

    jPanel1 = new JPanel();
    imageGenerationLabel = new JLabel();
    selectImageGenerationTypeLabel = new JLabel();
    stripeWidthTextField = new JTextField();
    imageHeightTextField = new JTextField();
    horizontalRainbowButton = new JButton();
    verticalRainbowButton = new JButton();
    checkerboardButton = new JButton();
    imageHeightLabel = new JLabel();
    stripeHeightLabel = new JLabel();
    stripeWidthLabel = new JLabel();
    stripeHeightTextField = new JTextField();
    squareWidthLabel = new JLabel();
    squarewidthTextField = new JTextField();
    imageWidthLabel = new JLabel();
    imageWidthTextField = new JTextField();
    imageLabel = new JLabel();

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

    stripeWidthTextField.setForeground(new java.awt.Color(204, 204, 204));
    stripeWidthTextField.setEnabled(false);

    imageHeightTextField.setForeground(new java.awt.Color(204, 204, 204));
    imageHeightTextField.setEnabled(false);

    horizontalRainbowButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    horizontalRainbowButton.setText("Horizontal Rainbow");
    horizontalRainbowButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    horizontalRainbowButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    horizontalRainbowButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        horizontalRainbowButtonActionPerformed(evt);
      }
    });

    verticalRainbowButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    verticalRainbowButton.setText("Vertical Rainbow");
    verticalRainbowButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    verticalRainbowButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    verticalRainbowButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        verticalRainbowButtonActionPerformed(evt);
      }
    });

    checkerboardButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    checkerboardButton.setText("Checkerboard");
    checkerboardButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    checkerboardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    checkerboardButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        checkerboardButtonActionPerformed(evt);
      }
    });

    imageHeightLabel.setFont(new java.awt.Font("SansSerif", 0, 24));
    imageHeightLabel.setForeground(new java.awt.Color(153, 153, 153));
    imageHeightLabel.setText("Enter Image Height:");

    stripeHeightLabel.setFont(new java.awt.Font("SansSerif", 0, 24));
    stripeHeightLabel.setForeground(new java.awt.Color(153, 153, 153));
    stripeHeightLabel.setText("Enter Height of each Stripe:");

    stripeWidthLabel.setFont(new java.awt.Font("SansSerif", 0, 24));
    stripeWidthLabel.setForeground(new java.awt.Color(153, 153, 153));
    stripeWidthLabel.setText("Enter Width of each Stripe:");

    stripeHeightTextField.setForeground(new java.awt.Color(204, 204, 204));
    stripeHeightTextField.setEnabled(false);
    stripeHeightTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        stripeHeightTextFieldActionPerformed(evt);
      }
    });

    squareWidthLabel.setFont(new java.awt.Font("SansSerif", 0, 24));
    squareWidthLabel.setForeground(new java.awt.Color(153, 153, 153));
    squareWidthLabel.setText("Enter Square Width:");

    squarewidthTextField.setForeground(new java.awt.Color(204, 204, 204));
    squarewidthTextField.setEnabled(false);
    squarewidthTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        squarewidthTextFieldActionPerformed(evt);
      }
    });

    imageWidthLabel.setFont(new java.awt.Font("SansSerif", 0, 24));
    imageWidthLabel.setForeground(new java.awt.Color(153, 153, 153));
    imageWidthLabel.setText("Enter Image Width:");

    imageWidthTextField.setForeground(new java.awt.Color(204, 204, 204));
    imageWidthTextField.setEnabled(false);

    imageLabel.setBackground(new java.awt.Color(0, 0, 255));
    imageLabel.setFont(new java.awt.Font("SansSerif", 0, 36));
    imageLabel.setForeground(new java.awt.Color(153, 153, 153));

    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(selectImageGenerationTypeLabel)
                                            .addGap(39, 39, 39)
                                            .addComponent(imageGenerationLabel, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addComponent(stripeHeightLabel)
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(stripeHeightTextField, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                            .addComponent(imageHeightLabel)
                                                                            .addComponent(stripeWidthLabel))
                                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                            .addComponent(imageHeightTextField, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(stripeWidthTextField, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(horizontalRainbowButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                                            .addComponent(verticalRainbowButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(checkerboardButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                    .addComponent(imageWidthLabel, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(squareWidthLabel, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
                                                            .addGap(23, 23, 23)
                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                    .addComponent(imageWidthTextField, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(squarewidthTextField, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))))
                                            .addGap(51, 51, 51)
                                            .addComponent(imageLabel, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(814, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(52, 52, 52)
                                            .addComponent(selectImageGenerationTypeLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(imageGenerationLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(horizontalRainbowButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(verticalRainbowButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(checkerboardButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                            .addGap(58, 58, 58)
                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(40, 40, 40)
                                                            .addComponent(imageHeightLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                    .addComponent(stripeHeightLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(stripeHeightTextField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                    .addComponent(imageWidthLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(imageWidthTextField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                    .addComponent(squareWidthLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(squarewidthTextField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                    .addComponent(stripeWidthLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(stripeWidthTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(imageHeightTextField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(imageLabel, GroupLayout.PREFERRED_SIZE, 554, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(879, Short.MAX_VALUE))
    );

    GroupLayout layout = new GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, 0)
                            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0))
    );
  }

  private void checkerboardButtonActionPerformed(java.awt.event.ActionEvent evt) {

    stripeWidthLabel.setVisible(false);
    stripeWidthTextField.setVisible(false);
    imageHeightLabel.setVisible(false);
    imageHeightTextField.setVisible(false);
    stripeHeightLabel.setVisible(false);
    stripeHeightTextField.setVisible(false);
    imageWidthLabel.setVisible(false);
    imageWidthTextField.setVisible(false);
    squareWidthLabel.setVisible(true);
    squarewidthTextField.setVisible(true);
  }

  private void verticalRainbowButtonActionPerformed(java.awt.event.ActionEvent evt) {

    stripeWidthLabel.setVisible(false);
    stripeWidthTextField.setVisible(false);
    imageHeightLabel.setVisible(false);
    imageHeightTextField.setVisible(false);
    squareWidthLabel.setVisible(false);
    squarewidthTextField.setVisible(false);
    stripeHeightLabel.setVisible(true);
    stripeHeightTextField.setVisible(true);
    imageWidthLabel.setVisible(true);
    imageWidthTextField.setVisible(true);
  }

  private void horizontalRainbowButtonActionPerformed(java.awt.event.ActionEvent evt) {
    stripeWidthLabel.setVisible(true);
    stripeWidthTextField.setVisible(true);
    imageHeightLabel.setVisible(true);
    imageHeightTextField.setVisible(true);
    stripeHeightLabel.setVisible(false);
    stripeHeightTextField.setVisible(false);
    imageWidthLabel.setVisible(false);
    imageWidthTextField.setVisible(false);
    squareWidthLabel.setVisible(false);
    squarewidthTextField.setVisible(false);

  }

  private void squarewidthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {

  }

  private void stripeHeightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {

  }

}
