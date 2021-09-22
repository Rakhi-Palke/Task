package Thursday;

import javax.swing.*;  
public class warning_message
{  
  JFrame optionPane_f;  
  warning_message()
  {  
    optionPane_f=new JFrame();  
    JOptionPane.showMessageDialog(optionPane_f,"Successfully Updated.","edubridgeindia",JOptionPane.WARNING_MESSAGE);     
  }  
  public static void main(String[] args) 
  {  
    new warning_message();  
  }  
}
