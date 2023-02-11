package PaintComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class graficos_11_pintando_for {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
traslacion traslacion1=new traslacion();
traslacion1.setVisible(true);
traslacion1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

}


class traslacion extends JFrame{
	public traslacion() {
		setTitle("Objeto Moviminto");
		setSize(700,700);
		setLocationRelativeTo(null);
		setResizable(false);
		trasladar trasladar1=new trasladar();
		add(trasladar1);
		trasladar1.setBackground(Color.DARK_GRAY);
	}
}
class trasladar extends JPanel{
	JButton boton ;
	JPanel panel;
	
	private int x=80;
	private int y=0;
	private int alto=32;
	private int ancho=32;
	
	
	
	
	public trasladar() {
		setLayout(new BorderLayout());
		boton=new JButton("Animar");
		boton.setBackground(Color.green);
	
		panel=new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.add(boton);
		add(panel,BorderLayout.SOUTH);
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D gg=(Graphics2D)g;
		gg.setColor(Color.red);
		int contador=0;
		int c=0;
		
		while(y<700) {
			y=y+x;
			c++;
			contador=c%2;
		for(contador=contador;contador<21;contador=contador+2) {
			
			
			
			gg.fillRect(contador*x,y, 80, 80);}
System.out.println(c%2);
		
		
		
		}
		System.out.println();

	}
}