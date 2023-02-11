package poo77;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Eventos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
evento evento2=new evento();
evento2.setVisible(true);
evento2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class evento extends JFrame{
    public evento() {
    	setTitle("EVENTOS");
    	setSize(300,200);
    	setLocation(500,300);
    	evento1 evento3=new evento1();
    	add(evento3);
  //evento3.setBackground(Color.red);
    
    }
}
class evento1 extends JPanel implements ActionListener{
	public void actionPerformed(ActionEvent w) {
		Object miobjeto=w.getSource();
		if (miobjeto==miBoton) {
		setBackground(Color.blue);}
		else if(miobjeto==amarillo){
			setBackground(Color.yellow);
			
		}
		else {
			setBackground(Color.red);
		}
		
	}
	JButton miBoton=new JButton("INC..");
	JButton amarillo=new JButton("Amarillo");
	JButton rojo=new JButton("Rojo");
	   public evento1() {
		   add(miBoton);
		   add(amarillo);
		   add(rojo);
		   miBoton.addActionListener(this);
		   amarillo.addActionListener(this);
		   rojo.addActionListener(this);
	   }
}