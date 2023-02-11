package PaintComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class graficos_7_Imagenes_Fondo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	rr1 ee=new rr1();
	ee.setVisible(true);
	ee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

}
class rr1 extends JFrame{
	public rr1() {
		setSize(700,700);
		setResizable(false);
		setLocationRelativeTo(null);
		ss  ss1=new ss();
		add(ss1);
		ss1.setBackground(Color.DARK_GRAY);
	}
}
class ss extends JPanel{
	JLabel label;
	public ss() {
		label=new JLabel("conciencia");
		add(label);
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D gg=(Graphics2D)g;
		ImageIcon imagen=new ImageIcon(getClass().getResource("call.PNG"));
		
		gg.drawImage(imagen.getImage(),0,0,700,700,this);
		gg.drawString("hola",100, 100);
		gg.setColor(Color.green);
	
		gg.fillRect(100, 100, 100, 100);
		
	
}}