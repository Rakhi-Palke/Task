package Wedensday;
import java.awt.*;  
import java.awt.event.*;  
public class paint_Concept extends Frame implements MouseMotionListener{
  paint_Concept(){
    addMouseMotionListener(this);  

    setSize(800,800);  
    setLayout(null);  
    setVisible(true);  
  }  
  @Override
  public void mouseDragged(MouseEvent a) {  
    Graphics mM_g=getGraphics();  
    mM_g.setColor(Color.blue);  
    mM_g.fillOval(a.getX(),a.getY(),3,3);  
  }  
 
  public void mouseMoved(MouseEvent e) {
  	// TODO Auto-generated method stub
  	
  } 
  
  public static void main(String[] args) {  
    new paint_Concept();  
  }
 
}
