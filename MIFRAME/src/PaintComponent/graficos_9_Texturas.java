package PaintComponent;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class graficos_9_Texturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
textura textura1=new textura();
textura1.setVisible(true);
textura1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class textura extends JFrame{
	public textura() {
		setSize(700,700);
		setLocationRelativeTo(null);
		setResizable(false);
		texx texx1=new texx();
		add(texx1);
		texx1.setBackground(Color.DARK_GRAY);
	}
}
class texx extends JPanel{
	public texx() {
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D gg=(Graphics2D)g;
		BasicStroke groso=new BasicStroke(20);
		gg.setStroke(groso);
		gg.setColor(Color.green);
		gg.drawRect(250,200,200,200);
		gg.drawRect(315,200,70,70);
		gg.drawRect(315,300,70,70);
	}
	
	
	
	
}
