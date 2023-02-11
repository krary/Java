package PaintComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class graphics_movimiento_clearRect {
	private JButton boton;
	private JPanel hhal;
	
	Runnable t=new rr(hhal,boton);
	Thread destt=new Thread(t);

	
	
	
	public static void main(String[]args) {
fframe fframe1=new fframe();
fframe1.setVisible(true);
}}
class fframe extends JFrame{
	
	public fframe() {
	
		
		
		setSize(700,700);
		setLocationRelativeTo(null);
		setResizable(false);
	hhal hhal2=new hhal();
	add(hhal2);
	
			
	}
	
	
	
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D gg=(Graphics2D) g;
		gg.setColor(Color.yellow);
		int direccion=0;
		int contador=0;
		int k=0;
		boolean f=true;
		for(contador=contador;contador<689;contador++) {
    	
    	gg.fillOval(k, 100, 80, 80);
    	if(direccion==0) {
    		k++;
    	}
    	if(direccion==1) {
    		k--;
    		contador=0;
    	}
    	if(k>580) {
    		direccion=1;
    		contador=0;
    	}
    	if(k<10) {
    		direccion=0;
    	
    	}
  
    	try {
			Thread.sleep(3 );
		} catch (InterruptedException e) {
			System.out.println("Error");
    } 	gg.clearRect(0, 0, 700, 700);
	}
}}

	
class hhal extends JPanel{
	JButton boton;
	public hhal() {
		boton=new JButton("suyenhg");
		setBackground(Color.DARK_GRAY);
		add(boton);
		
}
	
	
}
class rr implements Runnable{
JPanel panel;
JButton bott;
public rr(JPanel ppane,JButton bot) {
	panel=ppane;
	bott=bot;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		panel.add(bott);
	}
	
}


