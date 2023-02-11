package PaintComponent;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class graficos_6_GrosorLinea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
linea linea1=new linea();
linea1.setVisible(true);
linea1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class linea extends JFrame{
	public linea() {
		setSize(700,700);
		setResizable(false);
		setLocationRelativeTo(null);
		lld1  lld2=new lld1();
		add(lld2);
		lld2.setBackground(Color.DARK_GRAY);
	}
}
class lld1 extends JPanel{
	public lld1() {
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D gg=(Graphics2D)g;
		BasicStroke grosor=new BasicStroke(10);
		gg.setStroke(grosor);
		gg.setColor(Color.green);
		gg.drawLine(100,100,200,200);
		gg.setColor(Color.blue);
		gg.drawLine(300,100,400,200);
		gg.setColor(Color.green);
		gg.fillRect(100, 300, 100, 100);
		gg.setColor(Color.blue);
		gg.drawRect(300, 300, 100, 100);
		
		
		
	}
}