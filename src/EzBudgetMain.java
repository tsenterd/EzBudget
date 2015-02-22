package src;
import javax.swing.*;
import java.net.URL;
public class EzBudgetMain extends JFrame {
  public EzBudgetMain() {
    super("EzBudget");
    URL iconURL = getClass().getResource("/assets/ezbudsmall.png");
    ImageIcon icon = new ImageIcon(iconURL);
    setIconImage(icon.getImage());
    setSize(800,270);
    ProjectBook p = new ProjectBook();
    add(p);
    setLocationRelativeTo(null);
    setVisible(true);
  }
  public static void main(String[]args) {
    EzBudgetMain e = new EzBudgetMain();
  }
}