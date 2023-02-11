package poo75;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.lang.*;
import java.awt.Toolkit;
public class Temporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
miReloj RELOJ=new miReloj(3000, true);
RELOJ.enmarcha();
JOptionPane.showMessageDialog(null, "PULS OK ...");
System.exit(0);
	
	}}
class miReloj {
	private int num_pantalla;
	private boolean sonido_window;
	
	private class Dimehora implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Date ahora=new Date();
			   System.out.println("te pongo la hora cada tres seg " + ahora);
			   if (sonido_window) {
				   Toolkit.getDefaultToolkit().beep();
			   }
		   }
		}
		
	
	public miReloj(int num_pantalla,boolean sonido_window) {
		this.sonido_window=sonido_window;
		this.num_pantalla=num_pantalla;
	}
	   public void enmarcha(){
		   ActionListener oyente=new Dimehora();
		   Timer mitiempo=new Timer(num_pantalla, oyente);
		   
	   
	   
	   
	   }
	   




}
