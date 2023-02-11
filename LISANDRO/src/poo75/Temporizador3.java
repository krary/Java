package poo75;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.lang.*;
import java.awt.event.*;
import javax.swing.Timer;
public class Temporizador3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
miclase hola=new miclase();
hola.enmarchas(3000,true);
JOptionPane.showMessageDialog(null, "press cont ...");
System.exit(0);}

}
class miclase{
	
public void enmarchas(int numero, final boolean sonido) {
	 class enmarcha implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
	      Date tiempo = new Date();
	      System.out.println("Aqui te imprimo la hora" + tiempo);
	      if(sonido) {
	    	  Toolkit.getDefaultToolkit().beep();
	      }
		}
	}

	ActionListener enmarchas=new enmarcha();
	Timer run =new Timer(numero, enmarchas);
	run.start();
}
}