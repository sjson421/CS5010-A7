import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class ImageGenerationPanel extends javax.swing.JPanel {
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

    jPanel1 = new javax.swing.JPanel();
    imageGenerationLabel = new javax.swing.JLabel();
    selectImageGenerationTypeLabel = new javax.swing.JLabel();
    stripeWidthTextField = new javax.swing.JTextField();
    imageHeightTextField = new javax.swing.JTextField();
    horizontalRainbowButton = new javax.swing.JButton();
    verticalRainbowButton = new javax.swing.JButton();
    checkerboardButton = new javax.swing.JButton();
    imageHeightLabel = new javax.swing.JLabel();
    stripeHeightLabel = new javax.swing.JLabel();
    stripeWidthLabel = new javax.swing.JLabel();
    stripeHeightTextField = new javax.swing.JTextField();
    squareWidthLabel = new javax.swing.JLabel();
    squarewidthTextField = new javax.swing.JTextField();
    imageWidthLabel = new javax.swing.JLabel();
    imageWidthTextField = new javax.swing.JTextField();
    imageLabel = new javax.swing.JLabel();

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
    horizontalRainbowButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    horizontalRainbowButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    horizontalRainbowButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        horizontalRainbowButtonActionPerformed(evt);
      }
    });

    verticalRainbowButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    verticalRainbowButton.setText("Vertical Rainbow");
    verticalRainbowButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    verticalRainbowButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    verticalRainbowButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        verticalRainbowButtonActionPerformed(evt);
      }
    });

    checkerboardButton.setFont(new java.awt.Font("SansSerif", 0, 20));
    checkerboardButton.setText("Checkerboard");
    checkerboardButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(selectImageGenerationTypeLabel)
                                            .addGap(39, 39, 39)
                                            .addComponent(imageGenerationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addComponent(stripeHeightLabel)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(stripeHeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(imageHeightLabel)
                                                                            .addComponent(stripeWidthLabel))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(imageHeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(stripeWidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(horizontalRainbowButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                                            .addComponent(verticalRainbowButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(checkerboardButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(imageWidthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(squareWidthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(23, 23, 23)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(imageWidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(squarewidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGap(51, 51, 51)
                                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(814, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(52, 52, 52)
                                            .addComponent(selectImageGenerationTypeLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(imageGenerationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(horizontalRainbowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(verticalRainbowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(checkerboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(58, 58, 58)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(40, 40, 40)
                                                            .addComponent(imageHeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                    .addComponent(stripeHeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(stripeHeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                    .addComponent(imageWidthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(imageWidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                    .addComponent(squareWidthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(squarewidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                    .addComponent(stripeWidthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(stripeWidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(imageHeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(879, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, 0)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
