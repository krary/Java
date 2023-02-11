package poo76;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.*;
import java.util.*;

public class ventana_usuario_JPANEL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
miclase2 miclase1=new miclase2();
miclase1.setVisible(true);
miclase1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	}

}
class miclase2 extends JFrame{
	public miclase2() {
		setSize(600,450);
		setLocation(400,200);
		setTitle("mine window");
		Lamina milamina=new Lamina();
		add(milamina);
	}
}
class Lamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("HOLA ESTO ES EL PRIMER TEXTO" , 100,100);
	}
	
}
