package poo77;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.Toolkit.*;

public class Eventos6_RATON2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
mouse mouse3=new mouse();
mouse3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class mouse extends JFrame{
	public mouse() {
		setVisible(true);
		setBounds(500,300,500,300);
		addMouseListener(new mouse1());
	}
}
class mouse1 extends MouseAdapter{

		//public void mouseClicked(MouseEvent w) {
			//System.out.println("x " + w.getX() +" " + "y " + w.getY());
			//System.out.println(w.getClickCount());
		//}
		public void mousePressed(MouseEvent w) {
			System.out.println(w.getModifiers());
		}
	}

