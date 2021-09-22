package Thursday;

import javax.swing.*;  
class SMenuDemo1  
{  
  JMenu m_menu, m_submenu,m_submenu2;  
  JMenuItem menu_i1, menu_i2, menu_i3, menu_i4, menu_i5;  
  SMenuDemo1()
  {  
    JFrame menu_f= new JFrame("Menu and MenuItem Example");  
    JMenuBar menu_mb=new JMenuBar();  
    m_menu=new JMenu("States");  
    m_submenu=new JMenu("Maharashtra");  
    m_submenu2=new JMenu("Pune");
    menu_i1=new JMenuItem("Goa");  
    menu_i2=new JMenuItem("Kerala");  
    menu_i3=new JMenuItem("Nashik");  
    menu_i4=new JMenuItem("Katraj");  
     
    m_menu.add(menu_i1); 
    m_menu.add(m_submenu);
    m_menu.add(menu_i2);
    m_submenu.add(menu_i3); 
    m_submenu.add(m_submenu2);  
    m_submenu2.add(menu_i4);
    m_submenu.add(m_submenu2);
    m_menu.add(m_submenu);
    menu_mb.add(m_menu);  
    menu_f.setJMenuBar(menu_mb);  
    menu_f.setSize(500,500);  
    menu_f.setLayout(null);  
    menu_f.setVisible(true);  
  }  
  public static void main(String args[])  
  {  
    new SMenuDemo1();  
  }
}

