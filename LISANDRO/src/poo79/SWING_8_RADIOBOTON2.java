package poo79;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SWING_8_RADIOBOTON2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	rectangulo rectangulo1=new rectangulo();
	rectangulo1.setVisible(true);
	rectangulo1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

}
 
class rectangulo extends JFrame{
	public rectangulo() {
		setTitle("Choice it");
		setBounds(500,300,1000,300);
	triangulo triangulo1=new triangulo();
	add(triangulo1);}
}
class triangulo extends JPanel{
private	JRadioButton boton1,boton2,boton3,boton4;
private ButtonGroup migrupo;
private JPanel panel;
private JPanel panel1;
private JLabel texto;
	public triangulo() {
		setLayout(new BorderLayout());


migrupo=new ButtonGroup();
panel=new JPanel();
panel1=new JPanel();
boton1=new JRadioButton("Pequeño",false);
boton2=new JRadioButton("Mediano",true);
boton3=new JRadioButton("Grande",false);
boton4=new JRadioButton("Muy Grande",false);
evento evento1=new evento();

boton1.addActionListener(evento1);
boton2.addActionListener(evento1);
boton3.addActionListener(evento1);
boton4.addActionListener(evento1);


migrupo.add(boton1);
migrupo.add(boton2);
migrupo.add(boton3);
migrupo.add(boton4);


panel.add(boton1);
panel.add(boton2);
panel.add(boton3);
panel.add(boton4);



add(panel1,BorderLayout.NORTH);
texto=new JLabel("En un lugar de la mancha cuyo nom...");
panel1.add(texto);
add(panel, BorderLayout.SOUTH);


	}
	private class evento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		if(e.getSource()==boton1) {
	
			texto.setFont(new Font("Serif", Font.PLAIN,10));
			//System.out.println("its work very well");}
		}
		else if(e.getSource()==boton2) {
			texto.setFont(new Font("Serif", Font.PLAIN,12));

		}
		else if(e.getSource()==boton3) {
			texto.setFont(new Font("Serif", Font.PLAIN,14));

		}
		else if(e.getSource()==boton4) {
			texto.setFont(new Font("Serif", Font.PLAIN,18));

		}

	
	}
}}