package poo77;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.Toolkit.*;


public class Evento5_RATON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
neheman neheman1=new neheman();
neheman1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class neheman extends JFrame{
	public neheman() {
		setVisible(true);
		setBounds(500,300,500,300);
		setTitle("mouse");
		addMouseListener(new maus());
	}
}
class maus implements MouseListener{
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("has hecho click");
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("has hecho click");
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	
	
	
	
}
