import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ViewFrame extends JFrame implements ActionListener, ItemListener, ListSelectionListener {
  private JPasswordField pfield;
  private JButton pButton;
  private JLabel pDisplay;
  private JPanel mainPanel;
  private JScrollPane mainScrollPane;

  public ViewFrame() {
    super();
    setTitle("Image Processer");
    setSize(1280, 720);

    mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
    mainScrollPane = new JScrollPane(mainPanel);
    add(mainScrollPane);
  }

  @Override
  public void actionPerformed(ActionEvent actionEvent) {
    switch (actionEvent.getActionCommand()) {
      case "Modification":
        break;
      case "Generation":
        break;
      case "":
        break;
    }
  }

  @Override
  public void itemStateChanged(ItemEvent itemEvent) {

  }

  @Override
  public void valueChanged(ListSelectionEvent listSelectionEvent) {

  }
}
