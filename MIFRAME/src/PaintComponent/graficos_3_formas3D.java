package PaintComponent;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class graficos_3_formas3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HH HH1=new HH();
HH1.setVisible(true);
HH1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class HH extends JFrame{
	public HH() {
		setSize(700,700);
		setLocationRelativeTo(null);
		setResizable(false);
		aa aa1=new aa();
		add(aa1);
		aa1.setBackground(Color.DARK_GRAY);
	}
}
class aa extends JPanel{
	JLabel label;
	public aa() {
		setLayout(null);
		label=new JLabel("CIRCULO");
		label.setBounds(150,200,80,25);
		add(label);
	}
	
	public void paint(Graphics g) {
		String mensaje="Circulo rojo";
		
		
		super.paint(g);
		g.setColor(new Color(218, 51, 255) );
		g.fillArc(100, 100,300, 340,90,180);
		g.setColor(Color.black);
		g.drawString(mensaje,150,250);
		g.setColor(Color.green);
		g.fillArc(90, 100,300, 340,90,-180);
		g.setColor(new Color(218, 51, 250));
		g.fillRoundRect(500,200,100,100,60,20);
		g.draw3DRect(500,400,100,100,true);
		g.setColor(Color.green);
		g.fill3DRect(350,500,100,100,true);
	}
	
	
	
	
}
