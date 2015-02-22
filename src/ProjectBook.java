package src;
import javax.swing.*;
import java.awt.*;
import src.Views.*;

public class ProjectBook extends JPanel{
  private SpringLayout spring = new SpringLayout();
  private View start = new StartScreen(this); 
  
  public ProjectBook() {
    setBackground(Color.WHITE);
    this.setLayout(spring);
    start.GUI();
    start.constants(spring);
  }
  
  public void changeView() {
  
  }
}
