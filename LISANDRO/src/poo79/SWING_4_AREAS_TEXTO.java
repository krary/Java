package poo79;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class SWING_4_AREAS_TEXTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
areasTEXTO JJ=new areasTEXTO();
JJ.setVisible(true);
JJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class areasTEXTO extends JFrame{
	public areasTEXTO() {
		
		setTitle("areas de texto");
		setBounds(500,300,1000,300);
		areas areas1=new areas();
		
		add(areas1);
	}
}
class areas extends JPanel{
	private JTextArea espacio;
	private JButton boton;
	public areas() {
		boton=new JButton("texto  ");
		espacio=new JTextArea(15,10);
		JScrollPane panels=new JScrollPane(espacio);
		
		espacio.setLineWrap(true);
		add(boton); 
		add(panels);
		boton.addActionListener(new miclase());
	}
	
	private class miclase implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println(espacio.getText());
			
		}
	}
}