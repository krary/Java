package poo77;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.Toolkit.*;



public class Eventos3_CLASES_ADAPTAPTADORAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
adaptador adaptador3=new adaptador();
adaptador3.setVisible(true);
	}}


class adaptador extends JFrame{
	public adaptador() {
		setBounds(500,300,500,300);
		setTitle("ADAPTADORES");
			setVisible(true);
			adaptador1 adaptador2=new adaptador1();
			//addWindowListener(adaptador2);
			
	addWindowListener(new adaptador1());}
}

class adaptador1 extends WindowAdapter{
	public void windowIconified(WindowEvent e) {
		System.out.println("pues la ventana se ha ocultado");
	}
	
}