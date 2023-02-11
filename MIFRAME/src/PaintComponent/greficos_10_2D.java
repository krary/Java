package PaintComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class greficos_10_2D{
public static void main(String[]args) {

pintar pintar1=new pintar();
pintar1.setVisible(true);
pintar1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
class pintar extends JFrame implements Runnable{
	private int ancho=700;
	private int alto=700;
	private Image imagen;
	private Thread hilo;
	private int incremento=0;
	public pintar() {
		setSize(700,700);
		setLocationRelativeTo(null);
		setResizable(false);
	
	
	
	
	

		hilo=new Thread();
		hilo.start();
		Toolkit tool=Toolkit.getDefaultToolkit();
		imagen=tool.getImage(getClass().getResource("ball.png"));
		
	}
	
	
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D gg=(Graphics2D )g;
		int mx=(incremento%6)*137;
		int my=(incremento/6)*164;
		gg.drawImage(imagen,200,200,200+137 ,200+164,mx,my,mx+137,my+164,this);
		repaint();
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		while(true) {
			try {
				hilo.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}incremento++;
			
			if(incremento>24) {
				incremento=0;
			}
		}
	}

	
	}


	