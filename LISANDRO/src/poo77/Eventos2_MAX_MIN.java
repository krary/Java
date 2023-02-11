package poo77;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;
public class Eventos2_MAX_MIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	miventana miventanas=new miventana();
	miventanas.setVisible(true);
	miventanas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	miventana miventanas1=new miventana();
	miventanas1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	miventanas1.setBounds(500,250,300,250);

}}
class miventana extends JFrame{
	public miventana() {
		setTitle("maximazando");
		setSize(500,300);
		setLocation(500,300);
		setVisible(true);	
		ventana ventana1=new ventana();
		addWindowListener(ventana1);}
}
class ventana implements WindowListener{
	public void windowActivated(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {}
	public void windowClosed (WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {
		System.out.println("LA VENTANA ESTA MINIMIZADA");
	}
	public void windowOpened(WindowEvent e) {}
	

}