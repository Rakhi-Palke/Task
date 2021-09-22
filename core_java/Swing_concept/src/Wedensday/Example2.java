package Wedensday;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Example2 extends JFrame
{
	public Example2()
	{
		setTitle("Edubridge Learning Pvt Ltd"); //setting title of frame as  MyWindow
		JLabel lb = new JLabel("I am Rakhi from edubridge");//Creating a label named Welcome to My Second Window
		add(lb);                        //adding label to frame.
		setLayout(new FlowLayout());    //setting layout using FlowLayout object.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting close operation.
		setSize(400, 400);              //setting size
		setVisible(true);               //setting frame visibility
	}

	public static void main(String[] args)
	{
		new Example2();
	}
}

