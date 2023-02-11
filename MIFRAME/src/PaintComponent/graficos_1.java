package PaintComponent;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class graficos_1 {
public static void main(String[] args) {
	Frame frame1=new Frame();
	frame1.setVisible(true);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
class Frame extends JFrame{
	public Frame() {
		setTitle("Graficos");
		setSize(700,700);
		setPreferredSize(null);
		setLocationRelativeTo(null);
panel panel1=new panel();
add(panel1);
panel1.setBackground(Color.DARK_GRAY);
	
	}
	
}
class panel extends JPanel{
	public panel() {
		
	}
public void paint(Graphics g) {
  super.paint(g);     //CON ESTA LINEA HEREDAMOS TODO DE LA CLASE PADERE
 g.setColor(Color.green);
  
 g.drawLine(398,124,400,700);
 g.drawLine(200,125,600,700);
 g.setColor(new Color(218, 51, 255 ));
 g.drawLine(593,116,199,685);
 g.drawLine(200,400,600,400);
	}








}