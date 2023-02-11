 package juegos;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import input.KeyBoard;
import state.ESTADO_JUEGO;

public class programando_juego extends JFrame implements Runnable{
//VARIABLES
	public static final int ANCHO=800, ALTO=600;
	private Canvas canvas;
	private Thread hilo;
	private boolean running=false;
	private BufferStrategy bs;        //ESTA VARIABLE ES NUEBA PERO NOS PERMITIRA LEER EL CONTENIDO 
	private Graphics g;              //CREAMOS OTRA VARIABLE DE TIPO GRAFICA
	int x=0;
	private final int fps=60;//ESTO ES LA CANTIDAD DE FOTOGRAMAS QUE QUEREMOS EJECUTAR CADA UN SEGUNDO
	private double tiempoAverage=1000000000/fps;
	private double delta=0;   //DELTA ES UNA VARIABLE TEMPORAL QUE VA ALMACENAR EL TIEMPO TRANSCURRIFO EN LOS FOTOGRAMS
	private int AVERAGE=fps;  //
	private ESTADO_JUEGO game_state;
	private KeyBoard keyboard;
	public programando_juego() {
		
		setTitle("primeros pasos");
		setSize(ANCHO,ALTO);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		canvas=new Canvas();
		keyboard=new KeyBoard();
		
		canvas.setPreferredSize(new Dimension(ANCHO,ALTO));
		canvas.setMaximumSize(new Dimension(ANCHO,ALTO));
		canvas.setMinimumSize(new Dimension(ANCHO,ALTO));
		canvas.setFocusable(true); //ESTO NOS PERMITE TENER ENTRADA DESDE EL TECLADO
		add(canvas);
		canvas.addKeyListener(keyboard);
		
	}	public static void main(String[] args) {
		// TODO Auto-generated method stub
new programando_juego().comenzar();



}
	public void run() {  //AQUI COMIEZA EL CICLO WHILE.................................................................
		// TODO Auto-generated method stub
		long now=0;
		long lastime=System.nanoTime();
		long tiempoTransc=0;
		int frame=0;
		init();
		while(running) {
			now=System.nanoTime();
			delta += (now - lastime )/tiempoAverage;
			tiempoTransc	 += (now - lastime);
			lastime=now;
			
			if(delta>=1) {
				update();
				drawning();
				delta--;
				frame++;
			}
			if(tiempoTransc >=1000000000) {
				AVERAGE=frame;
				frame=0;
				tiempoTransc=0;
			}
		}}
	//AQUI TERMINA EL METODO IMPLEMENTADO POR EL Runnable............................................................
	private void comenzar(){//ESTE METODO PONE A FUNCIONAR Y DEFINE EL THREAD
		
		hilo=new Thread(this);
		hilo.start();
		running=true;
	}
	
	private void detener() {//ESTE METODO DETIENE EL THREAD CON EL VARIABLE.JOIN()
		try {
			hilo.join();
			running=false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	


	
	
	private void update() {
		keyboard.update();
	game_state.update();
	}
	private void drawning() {
		bs=canvas.getBufferStrategy();
		if (bs==null) {
			  canvas.createBufferStrategy(3);
			  return;
			  }
		g=bs.getDrawGraphics();//AQUI COMIENZA NUESTRO DIBUJO
		           g.setColor(Color.black);   
		           g.fillRect(0,0, ANCHO, ALTO);
		           game_state.drawing(g);
		          
		         g.drawString(""+AVERAGE,10,10);
		
		
		g.dispose();//AQUI TERMINA NUESTRO DIBUJO
		bs.show();
		}
	
	
	
	
	
	
	
private void init() {
	Assets.init();
	game_state=new ESTADO_JUEGO();
}


	
	
	}
