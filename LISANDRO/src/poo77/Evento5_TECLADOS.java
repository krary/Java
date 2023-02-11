package poo77;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.Toolkit.*;


public class Evento5_TECLADOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ich du = new ich();
du.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class ich extends JFrame{
	public ich() {
		setBounds(500,300,200,500);
		setTitle("Eventualy of the Keyboard");
		setVisible(true);
		addKeyListener(new sie());
		
	}
}

class sie implements KeyListener{
	public void keyPressed(KeyEvent e) {
		int codigo=e.getKeyCode();
		//JOptionPane.showMessageDialog(null,codigo);
	}
	public void keyTyped(KeyEvent e) {
	   char codigo=e.getKeyChar();
	    //System.out.println(codigo);
	}
	public void keyReleased(KeyEvent e) {
		char codigo=e.getKeyChar();
	    System.out.print(codigo);
	
	}
}