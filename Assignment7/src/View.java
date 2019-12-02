import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.UIManager;
import javax.swing.BorderFactory;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

/**
 * View implementation as JFrame that holds onto all panels as well as all functionalities, held
 * under the other panels.
 */
public class View extends JFrame implements IView {
  private JSplitPane rightPanel;
  private IController controller;

  /**
   * Constructor using the given controller for passing back and forth data.
   *
   * @param c Controller associated with this view.
   */
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
    } catch (ClassNotFoundException | InstantiationException
            | IllegalAccessException | UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(
              View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    setVisible(true);
  }


  private void components() {
    JPanel jPanel3 = new JPanel();
    JPanel viewPanel = new JPanel();
    rightPanel = new JSplitPane();
    JPanel controlPanel = new JPanel();
    JButton modificationButton = new JButton();
    JButton generateButon = new JButton();
    JPanel jPanel1 = new JPanel();

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

    GroupLayout viewPanelLayout = new GroupLayout(viewPanel);
    viewPanel.setLayout(viewPanelLayout);
    viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGap(0, 500, Short.MAX_VALUE)
    );
    viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGap(0, 500, Short.MAX_VALUE)
    );

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setTitle("Image Processor");
    setAutoRequestFocus(false);
    setName("Main Panel");
    setPreferredSize(new java.awt.Dimension(1440, 720));

    rightPanel.setBackground(new java.awt.Color(0, 0, 153));
    rightPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    rightPanel.setFont(new java.awt.Font("Tahoma", 3, 13));

    controlPanel.setBackground(new java.awt.Color(0, 216, 230));
    controlPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    controlPanel.setMaximumSize(new java.awt.Dimension(200, 900));
    controlPanel.setMinimumSize(new java.awt.Dimension(200, 900));
    controlPanel.setPreferredSize(new java.awt.Dimension(200, 900));

    modificationButton.setBackground(new java.awt.Color(204, 204, 204));
    modificationButton.setFont(new java.awt.Font("Calibri", 1, 18));
    modificationButton.setText("Modify");
    modificationButton.setBorder(BorderFactory.createBevelBorder(
            javax.swing.border.BevelBorder.RAISED));
    modificationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    modificationButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        modificationButtonActionPerformed(evt);
      }
    });

    generateButon.setBackground(new java.awt.Color(204, 204, 204));
    generateButon.setFont(new java.awt.Font("Calibri", 1, 18));
    generateButon.setText("Generate");
    generateButon.setBorder(BorderFactory.createBevelBorder(
            javax.swing.border.BevelBorder.RAISED));
    generateButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    generateButon.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        generateButtonActionPerformed(evt);
      }
    });

    GroupLayout controlPanelLayout = new GroupLayout(controlPanel);
    controlPanel.setLayout(controlPanelLayout);
    controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(modificationButton, GroupLayout.DEFAULT_SIZE,
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateButon, GroupLayout.DEFAULT_SIZE,
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(modificationButton)
                            .addGap(70, 70, 70)
                            .addComponent(generateButon)
                            .addGap(659, 659, 659))
    );

    rightPanel.setLeftComponent(controlPanel);

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

    rightPanel.setRightComponent(jPanel1);

    getContentPane().add(rightPanel, java.awt.BorderLayout.PAGE_START);

    pack();
  }

  private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {
    ImageGenerationPanel imageGeneration = new ImageGenerationPanel(controller);
    rightPanel.setRightComponent(imageGeneration);
  }

  private void modificationButtonActionPerformed(java.awt.event.ActionEvent evt) {
    ImageModificationPanel modificationPanel = new ImageModificationPanel(controller);
    rightPanel.setRightComponent(modificationPanel);
  }


  @Override
  public void addController(IController controller) {
    this.controller = controller;
  }
}
