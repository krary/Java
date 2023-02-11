package poo77;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.Toolkit.*;


public class Evento4_Controlando_los_estados_ventanas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sventanas sventanas2=new sventanas();
sventanas2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class sventanas extends JFrame {
	public sventanas() {
		setBounds(500,300,500,300);
		setTitle("ventanas");
	    setVisible(true);
	    
	    addWindowStateListener(new sventanas1());
	}
}
class sventanas1 implements WindowStateListener{
	public void windowStateChanged(WindowEvent e) {
		JOptionPane.showMessageDialog(null,"CHANGES HAD HAPPENED");	
	
	//JOptionPane.showMessageDialog(null, e.getNewState());
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			JOptionPane.showMessageDialog(null, "pues la pantalla ha sido modificada ");
			Toolkit.getDefaultToolkit().beep();
		}
		else if(e.getNewState()==Frame.NORMAL) {
			JOptionPane.showMessageDialog(null, "so the screen it is at the size normal");
		}
	}
		

		
	}
	
