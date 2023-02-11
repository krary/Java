package PaintComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class graficos_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ff ff1=new ff();
ff1.setVisible(true);
ff1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

}
class ff extends JFrame{
	public ff() {
	setSize(700,700);
	setLocationRelativeTo(null);
	setResizable(false);
	ll ll1=new ll();
	add(ll1);
	ll1.setBackground(Color.DARK_GRAY);
	}
}
class ll extends JPanel{
	private JButton boton;
	Object objeto;
	public ll() {
		boton=new JButton("boton");
		add(boton);
	}
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.green);
		g.drawLine(0,100,100,200);
		g.setColor(new Color(218, 51, 255 ));
		g.drawRect(200,100,100,100);
		g.drawOval(390,100,100,100);
		
		g.fillRect(200,400,100,100);
		g.setColor(Color.green);
		g.fillOval(390,400,100,100);
	}
	private class interna implements ActionListener{
private panel panel3;
public interna() {
	panel3=new panel();
	
}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			
			
		}
		
	}
}

