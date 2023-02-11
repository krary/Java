package poo77;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.Toolkit.*;

public class Evento8_FOCUSlITENER_VENTANA extends JFrame implements WindowFocusListener {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Evento8_FOCUSlITENER_VENTANA marcos=new Evento8_FOCUSlITENER_VENTANA();
	marcos.iniciar();
}
public void iniciar() {
	marco1=new Evento8_FOCUSlITENER_VENTANA();
	marco2=new Evento8_FOCUSlITENER_VENTANA();
	marco1.setVisible(true);
	marco2.setVisible(true);
	marco1.setBounds(599,300,500,300);
	marco2.setBounds(200,300,500,300 );
	marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	marco1.addWindowFocusListener(this);
	marco2.addWindowFocusListener(this);
} 
Evento8_FOCUSlITENER_VENTANA marco1;
Evento8_FOCUSlITENER_VENTANA marco2;
@Override
public void windowGainedFocus(WindowEvent e) {
	// TODO Auto-generated method stub
if (e.getSource()==marco1){
	marco1.setTitle("tengo el foco!!!");
	           }
else {
	marco2.setTitle("tengo el foco!!!");
}

}

public void windowLostFocus(WindowEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==marco1){
		marco1.setTitle(" ");
		           }
	else {
		marco2.setTitle("");
	}
	
}}

