package poo77;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Evento10_MULTIPLEFuentes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	naruto hidan=new naruto();
	hidan.setVisible(true);
	hidan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

}
class naruto extends JFrame{
	public naruto() {
		setTitle("SASUKE");
		setBounds(1100,100,	300,200);
	add(new sasuke());}
}
class sasuke extends JPanel{
	
	JButton cerrar;
	
	public sasuke() {
		JButton nuevo=new JButton("Nuevo");
		add(nuevo);
		cerrar =new JButton("Cerrar");
		add(cerrar);
		oyente oyente1=new oyente();
		nuevo.addActionListener(oyente1);
		
		
	}
	private class oyente implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			sakura sakura1=new sakura(cerrar);
			sakura1.setVisible(true);
		}
		
	}
}


class sakura extends JFrame{
	private static int contador=0;
	private class cierraTodo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
		}
		
	}
	public sakura(JButton boton_principal) {
		contador++;
		setTitle("ventana " + contador);
		setBounds(40*contador,40*contador,300,150);
		cierraTodo cierratodo=new cierraTodo();
		boton_principal.addActionListener(cierratodo);
		
		
	}
	
}