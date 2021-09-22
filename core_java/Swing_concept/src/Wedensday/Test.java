package Wedensday;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Test extends JFrame
{
  public Test()
  {
    JCheckBox jcb = new JCheckBox("yes");   //creating JCheckBox.
    add(jcb);                               //adding JCheckBox to frame.
    jcb = new JCheckBox("no");              //creating JCheckBox.
    add(jcb);                               //adding JCheckBox to frame.
    jcb = new JCheckBox("maybe");           //creating JCheckBox.
    add(jcb);                               //adding JCheckBox to frame.
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to clear entire cache memory
    setSize(500, 500); //to change the window size means size of screen only
    setVisible(true);
  }
  public static void main(String[] args)
  {
    new Test();
  }
}

