import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JButton;

public class MainJFrame extends javax.swing.JFrame {
  private JPanel ControlPanel;
  private JSplitPane RightPanel;
  private JPanel ViewPanel;
  private JButton generateButon;
  private JPanel jPanel1;
  private JPanel jPanel3;
  private JButton modificationButton;

  public MainJFrame() {
    components();
    setResizable(false);
  }


  private void components() {

    jPanel3 = new javax.swing.JPanel();
    ViewPanel = new javax.swing.JPanel();
    RightPanel = new javax.swing.JSplitPane();
    ControlPanel = new javax.swing.JPanel();
    modificationButton = new javax.swing.JButton();
    generateButon = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 100, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 100, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout ViewPanelLayout = new javax.swing.GroupLayout(ViewPanel);
    ViewPanel.setLayout(ViewPanelLayout);
    ViewPanelLayout.setHorizontalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 537, Short.MAX_VALUE)
    );
    ViewPanelLayout.setVerticalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 488, Short.MAX_VALUE)
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Image Processor");
    setAutoRequestFocus(false);
    setName("Main Panel"); // NOI18N

    RightPanel.setBackground(new java.awt.Color(0, 0, 153));
    RightPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    RightPanel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N

    ControlPanel.setBackground(new java.awt.Color(0, 216, 230));
    ControlPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    ControlPanel.setMaximumSize(new java.awt.Dimension(200, 900));
    ControlPanel.setMinimumSize(new java.awt.Dimension(200, 900));
    ControlPanel.setPreferredSize(new java.awt.Dimension(200, 900));

    modificationButton.setBackground(new java.awt.Color(204, 204, 204));
    modificationButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
    modificationButton.setText("Modify");
    modificationButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    modificationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    modificationButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        modificationButtonActionPerformed(evt);
      }
    });

    generateButon.setBackground(new java.awt.Color(204, 204, 204));
    generateButon.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
    generateButon.setText("Generate");
    generateButon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    generateButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    generateButon.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        generateButonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
    ControlPanel.setLayout(ControlPanelLayout);
    ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(modificationButton)
                            .addGap(70, 70, 70)
                            .addComponent(generateButon)
                            .addGap(659, 659, 659))
    );

    RightPanel.setLeftComponent(ControlPanel);

    jPanel1.setName("Window"); // NOI18N
    jPanel1.setPreferredSize(new java.awt.Dimension(1600, 900));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 1600, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 900, Short.MAX_VALUE)
    );

    RightPanel.setRightComponent(jPanel1);

    getContentPane().add(RightPanel, java.awt.BorderLayout.PAGE_START);

    pack();
  }// </editor-fold>

  private void generateButonActionPerformed(java.awt.event.ActionEvent evt) {
    ImageGenerationPanel imageGeneration = new ImageGenerationPanel();
    RightPanel.setRightComponent(imageGeneration);
  }

  private void modificationButtonActionPerformed(java.awt.event.ActionEvent evt) {

    ImageModificationPanel modificationPanel = new ImageModificationPanel();
    RightPanel.setRightComponent(modificationPanel);
  }

  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainJFrame().setVisible(true);
      }
    });
  }


}
