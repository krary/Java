package poo76;
import java.awt.Frame;

import javax.swing.*;
public class ventanas_usuario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
miMarco marco1=new miMarco();
marco1.setVisible(true);
marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class miMarco extends JFrame{
	
	public miMarco() {
		//setSize(500,300);
	    setTitle("Mi ventana");
	    //setLocation(500,300);
	    setBounds(500,300,500,300);
	    //setResizable(false);
	    setExtendedState(Frame.MAXIMIZED_BOTH);
	    }
}