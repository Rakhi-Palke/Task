package Thursday;

import javax.swing.*;  
public class Password  
{  
     Password()
  {  
        JFrame passWord_f= new JFrame("Password field Demo");  
       
        JPasswordField passWord_value = new  JPasswordField();
       JLabel passWord_l1 = new  JLabel("Password ");
    		   passWord_l1 .setBounds(20,100, 100,30); 
    		   passWord_value.setBounds(100, 100, 100, 30);
    		   
    		   passWord_f.add( passWord_l1);  
    		   passWord_f.setSize(400,400);  
    		   passWord_f.setLayout(null);  
    		   passWord_f.setVisible(true);  
     }  
public static void main(String args[])  
    {  
  new Password();  
    }
}
