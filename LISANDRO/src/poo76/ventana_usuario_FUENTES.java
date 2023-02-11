package poo76;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.awt.*;
import java.util.*;


public class ventana_usuario_FUENTES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] misFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	/*for(String f : misFuentes) {
		System.out.println(f);
	}*/
		miclase5 miclase2=new miclase5();
		miclase2.setVisible(true);
		miclase2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

}
class miclase5 extends JFrame{
	public miclase5() { 
		setSize(600,450);
		setLocation(400,200);
		setTitle("mine window");
		Lamina4 milamina=new Lamina4();
		add(milamina);
		milamina.setBackground(Color.pink);
	}
}
class Lamina4 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		Font mifuente=new Font("Arial", Font.BOLD,26);
		g2.setFont(mifuente);
		g.drawString("LISANDRO",100,100);
	}
}
