package poo76;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;

public class ventana_ussuario_COLOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miclase4 miclase1=new miclase4();
		miclase1.setVisible(true);
		miclase1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		}

}
class miclase4 extends JFrame{
	public miclase4() {
		setSize(600,450);
		setLocation(400,200);
		setTitle("mine window");
		Lamina3 milamina=new Lamina3();
		add(milamina);
		milamina.setBackground(Color.PINK);
	}
}
class Lamina3 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.RED.darker()); 
		g2.fill(rectangulo);
		Ellipse2D elipse=new Ellipse2D.Double();
		g2.setPaint(new Color(140,0,255).brighter().brighter());
		elipse.setFrame(rectangulo);
		g2.fill(elipse);
		
	}
	
}

