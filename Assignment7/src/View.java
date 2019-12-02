import javax.swing.*;

public class View extends JFrame implements IView {
  private JPanel ControlPanel;
  private JSplitPane RightPanel;
  private JPanel ViewPanel;
  private JButton generateButon;
  private JPanel jPanel1;
  private JPanel jPanel3;
  private JButton modificationButton;
  private IController controller;

  public View(IController c) {
    addController(c);
    components();
    setResizable(false);

    try {
      for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        setVisible(true);
      }
    });
  }


  private void components() {
    jPanel3 = new JPanel();
    ViewPanel = new JPanel();
    RightPanel = new JSplitPane();
    ControlPanel = new JPanel();
    modificationButton = new JButton();
    generateButon = new JButton();
    jPanel1 = new JPanel();

    GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGap(0, 100, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGap(0, 100, Short.MAX_VALUE)
    );

    GroupLayout ViewPanelLayout = new GroupLayout(ViewPanel);
    ViewPanel.setLayout(ViewPanelLayout);
    ViewPanelLayout.setHorizontalGroup(
            ViewPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGap(0, 500, Short.MAX_VALUE)
    );
    ViewPanelLayout.setVerticalGroup(
            ViewPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGap(0, 500, Short.MAX_VALUE)
    );

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setTitle("Image Processor");
    setAutoRequestFocus(false);
    setName("Main Panel");

    RightPanel.setBackground(new java.awt.Color(0, 0, 153));
    RightPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    RightPanel.setFont(new java.awt.Font("Tahoma", 3, 13));

    ControlPanel.setBackground(new java.awt.Color(0, 216, 230));
    ControlPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    ControlPanel.setMaximumSize(new java.awt.Dimension(200, 900));
    ControlPanel.setMinimumSize(new java.awt.Dimension(200, 900));
    ControlPanel.setPreferredSize(new java.awt.Dimension(200, 900));

    modificationButton.setBackground(new java.awt.Color(204, 204, 204));
    modificationButton.setFont(new java.awt.Font("Calibri", 1, 18));
    modificationButton.setText("Modify");
    modificationButton.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    modificationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    modificationButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        modificationButtonActionPerformed(evt);
      }
    });

    generateButon.setBackground(new java.awt.Color(204, 204, 204));
    generateButon.setFont(new java.awt.Font("Calibri", 1, 18));
    generateButon.setText("Generate");
    generateButon.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    generateButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    generateButon.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        generateButtonActionPerformed(evt);
      }
    });

    GroupLayout ControlPanelLayout = new GroupLayout(ControlPanel);
    ControlPanel.setLayout(ControlPanelLayout);
    ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(modificationButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateButon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(modificationButton)
                            .addGap(70, 70, 70)
                            .addComponent(generateButon)
                            .addGap(659, 659, 659))
    );

    RightPanel.setLeftComponent(ControlPanel);

    jPanel1.setName("Window");
    jPanel1.setPreferredSize(new java.awt.Dimension(1600, 900));

    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGap(0, 1600, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGap(0, 900, Short.MAX_VALUE)
    );

    RightPanel.setRightComponent(jPanel1);

    getContentPane().add(RightPanel, java.awt.BorderLayout.PAGE_START);

    pack();
  }

  private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {
    ImageGenerationPanel imageGeneration = new ImageGenerationPanel(controller);
    RightPanel.setRightComponent(imageGeneration);
  }

  private void modificationButtonActionPerformed(java.awt.event.ActionEvent evt) {
    ImageModificationPanel modificationPanel = new ImageModificationPanel(controller);
    RightPanel.setRightComponent(modificationPanel);
  }


  @Override
  public void addController(IController controller) {
    this.controller = controller;
  }
}
