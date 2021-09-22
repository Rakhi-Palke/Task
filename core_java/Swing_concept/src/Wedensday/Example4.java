package Wedensday;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Example4 extends JFrame
{
  public Example4()
  {
    JTextField jtf = new JTextField(20);  //creating JTextField.
    add(jtf);                             //adding JTextField to frame.
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    setVisible(true);
  }
  public static void main(String[] args)
  {
    new Example4();
  }
}

