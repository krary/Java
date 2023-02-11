package poo79;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SWING_7_RADIOBOTON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cuadrado cuadrado1=new cuadrado();
cuadrado1.setVisible(true);
cuadrado1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class cuadrado extends JFrame{
	public cuadrado() {
	setTitle("Elije..");
	setBounds(500,300,1000,400);
	setResizable(false);
	cuadrados cuadrados1=new cuadrados();
	add(cuadrados1);
	
}
}
class cuadrados extends JPanel{
	public cuadrados() {
		ButtonGroup migrupo=new ButtonGroup();
		ButtonGroup migrupo1=new ButtonGroup();
		JRadioButton boton1=new JRadioButton("Azul",false);
		JRadioButton boton2=new JRadioButton("Rojo",true);
		JRadioButton boton3=new JRadioButton("Verde",false);
		
		JRadioButton boton4=new JRadioButton("Femenino",false);
		JRadioButton boton5=new JRadioButton("Masculino",true);
		
		migrupo1.add(boton4);
		migrupo1.add(boton5);
		

		migrupo.add(boton1);
		migrupo.add(boton2);
		migrupo.add(boton3);
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
	}
}