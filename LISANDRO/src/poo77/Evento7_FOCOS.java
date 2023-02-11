package poo77;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.Toolkit.*;
import java.awt.event.FocusListener.*;

public class Evento7_FOCOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	name name1 = new name();
	name1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

}
class name extends JFrame{
	public name() {
		setVisible(true);
		setBounds(500,300,500,300);
		setTitle("<vl");
		name2 jklm=new name2();
		add(jklm);
		jklm.setBackground(Color.pink);
	}   
}
class name2 extends JPanel{
	public void paintComponent(Graphics g) {
	super.paintComponent(g);
	setLayout(null);
	cuadro1=new JTextField();
	cuadro2=new JTextField();
	cuadro1.setBounds(120,10,150,20);
	cuadro2.setBounds(120,50,150,20);
	cuadro1.setBackground(Color.cyan);
	cuadro2.setBackground(Color.orange);
	
	add(cuadro1);
	add(cuadro2);
	mifoco mifoco1=new mifoco();
	cuadro2.addFocusListener(mifoco1);
	
}
	
	private class mifoco implements FocusListener{
		

		@Override
		public void focusGained(FocusEvent e) {
			//System.out.println("has perdido la conexion please wait..");
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
String email =cuadro1.getText();
boolean comprobacion=false;
			// TODO Auto-generated method stub
			for(int i=0;i<email.length(); i++) {
				if(email.charAt(i)=='@') {
					comprobacion=true;
			
				}
				if (comprobacion) {
					System.out.println("gmail confirmado");
				}
				else {
					System.out.println("pues su correo es incorrecto");
				}
			}
		}
		
	}
	JTextField cuadro1;
	JTextField cuadro2;}

