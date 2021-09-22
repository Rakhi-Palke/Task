
package Thursday;

import javax.swing.*;  
public class InputDailogBox
{  
  JFrame optionPane_f;  
  InputDailogBox()
  {  
    optionPane_f=new JFrame();  
    JOptionPane.showInputDialog(optionPane_f,"Enter Your Name");     
  }  
  public static void main(String[] args) 
  {  
    new InputDailogBox();  
  }  
}
