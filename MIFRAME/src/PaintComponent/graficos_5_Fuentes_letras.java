package PaintComponent;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class graficos_5_Fuentes_letras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
letras letras1=new letras();
letras1.setVisible(true);
letras1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class letras extends JFrame{
	public letras() {
		setSize(700,700);
		setLocationRelativeTo(null);
		setResizable(false);
		hr hr1=new hr();
		add(hr1);
		hr1.setBackground(Color.DARK_GRAY);
	}}
class hr extends JPanel{
	public hr() {
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		Font fuentes=new Font("Bauhaus 93",Font.PLAIN,40);
		g.setFont(fuentes);
		g.drawString("DORIAN",100,100);
		
		g.setColor(Color.green);
		Font fuentes1=new Font("Curlz MT",Font.BOLD,200);
		g.setFont(fuentes1);
		g.drawString("DORIAN",100,200);
		
		g.setColor(Color.ORANGE);
		Font fuentes2=new Font("Lucida Blackletter ",Font.BOLD,40);
		g.setFont(fuentes2);
		g.drawString("DORIAN",100,300);
	}
	
	
	
	
	
}