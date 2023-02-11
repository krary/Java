package poo76;
import javax.swing.*;
import javax.swing.Toolkit;

import java.awt.Graphics;
import java.util.*;


public class ventana_usuario_JPANEL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
hola miclase=new hola();
miclase.setVisible(true);
miclase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class hola extends JFrame{
	public hola() {
		setSize(500,300);
		setLocation(500,300);
		setTitle("miventana..");
		milamina milamina1=new milamina();
		add(milamina1);
	}
}
class milamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawRect(50,50,200,200);
		//g.drawLine(100,100,100,300);
		g.drawArc(50,100,100,200,120,150);	
	}
}

