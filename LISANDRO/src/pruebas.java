
import javax.swing.*;

import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;


public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dame hola=new dame();
		Timer lisandro=new Timer(5000,hola);
		lisandro.start();
		JOptionPane.showMessageDialog(null,"Pulsa continuar para detener");
		       System.exit(0);       }

		
		}

	
                                                                                  

class dame implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Date ahora= new Date();
		System.out.println("Tengo la hora cada cinco segundos " + ahora);
	   Toolkit.getDefaultToolkit().beep();  
	}
	
}
