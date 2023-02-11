package juegos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PingPong extends JFrame{
	private panel panel1;
	private hilo hilo1;
	public PingPong() {
		setSize(800,500);
		setLocationRelativeTo(null);
		setResizable(false);
		panel1=new panel();
		add(panel1);
		setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		panel1.setBackground(Color.black);
	hilo1=new hilo(panel1);
		hilo1.start();
		
	}
	
public static void main(String[]args ) {
	PingPong pp=new PingPong();
    

}}
//panel
class panel extends JPanel{
	pelota p=new pelota(0,0);
	public panel() {
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D gg=(Graphics2D)g;
		gg.setColor(Color.green);
		dibujar(gg);
		actualizar();
	}
	public void dibujar(Graphics2D g) {
		g.fill(p.getpelota());
	}
	public void actualizar() {
		
		p.mover(getBounds());
	}
	public void iterarjuego(){
		while(true) {
			repaint();
			try {
				Thread.sleep(6);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
//pelota
class pelota{
	private int x;
	private int y;
	private final int ancho=15,alto=15;
    private  int dx=1,dy=1;
	public pelota(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public Rectangle2D getpelota() {
		return new Rectangle2D.Double(x,y,ancho,alto);
	}
	public void mover(Rectangle limite) {
		x+=dx;
		y+=dy;
		if(x>limite.getMaxX()) {
			dx=-dx;
		}
		if(y>limite.getMaxY()) {
			dy=-dy;
		}
		if(x<0) {
			dx=-dx;
		}
		if(y<0) {
			dy=-dy	;
		}

	}
}
class hilo extends Thread{
	private panel pin;
	public hilo(panel pin) {
		this.pin=pin;
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pin.repaint();
		}
	}
}