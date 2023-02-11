package poo75;
import javax.swing.*;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class Temporizad0r {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
miclaseEscucha hola=new miclaseEscucha();
		Timer escucha=new Timer(5000,hola);
		escucha.start();
		JOptionPane.showMessageDialog(null, "PULSA CONT..");
		System.exit(0);
	}}

class miclaseEscucha implements ActionListener{
	public void actionPerformed(ActionEvent w) {
		Date ahora=new Date();
		System.out.println("este es el mensaje" + ahora);
	Toolkit.getDefaultToolkit().beep();
	
	}
	
}