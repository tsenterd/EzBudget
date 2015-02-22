package src.Views;
import javax.swing.*;
import java.net.URL;
import java.awt.*;

public class StartScreen implements View {
  JPanel pane;
  JLabel logo = new JLabel();
  
  public StartScreen(JPanel pane) {
    this.pane = pane;
  }
  
  public void GUI() {
    URL iconURL = getClass().getResource("/assets/ezbud.png");
    ImageIcon icon = new ImageIcon(iconURL);
    Image iconImage = icon.getImage();
    Image newimg = iconImage.getScaledInstance(210,210,java.awt.Image.SCALE_SMOOTH);  
    icon = new ImageIcon(newimg);  
    
    logo.setIcon(icon);
    pane.add(logo);
  }
  
  public void constants(SpringLayout layout) {
    layout.putConstraint(SpringLayout.WEST, logo, 10, SpringLayout.WEST, pane);
    layout.putConstraint(SpringLayout.NORTH, logo, 10, SpringLayout.NORTH, pane);
  }
}