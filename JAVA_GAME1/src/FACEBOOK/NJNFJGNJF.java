package FACEBOOK;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NJNFJGNJF {
	

public static void main(String[]args) {
	miclase mm=new miclase();
	mm.setVisible(true);
	mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}}
class miclase extends JFrame {
	private correr c;
public miclase() {
	setSize(700,700);
	setLocationRelativeTo(null);
	setResizable(false);
	
	
	panel panel1=new panel();
	add(panel1);
	panel1.setBackground(Color.yellow);
	c=new correr(panel1);
}
}

class panel extends JPanel{
	private String mensaje;
	private JLabel label;
    private int numero1=0;
    private String hola;
	public panel() {

		

//add(new JLabel,hola);



		 

	}
	public void lab(JLabel l,String s) {
		s="hola";
		l=new JLabel(s);
	}
	}
	
	
class correr extends Thread{
	panel p;
	public correr(panel p) {
		this.p=p;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}p.repaint();
	}
}


