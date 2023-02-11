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



public class SWING_5_AREAS_TEXTO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JAL JAL1=new JAL();
JAL1.setVisible(true);
JAL1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class JAL extends JFrame{
	private JPanel laminaboton;
	private JButton botonE;
	private JButton botonInsertar;
	private JTextArea areatexto;
	private JScrollPane barra;
	public JAL() {
		setTitle("AREAS DE TEXTO");
		setBounds(500,300,1000,300);
		setLayout(new BorderLayout());
		areatexto=new JTextArea(8,20);
		barra=new JScrollPane(areatexto);
		add(barra,BorderLayout.CENTER);
		laminaboton=new JPanel();
		botonInsertar=new JButton("INSERTAR");
		botonE=new JButton("SaltoLinea");
		laminaboton.add(botonE);
		laminaboton.add(botonE);
		laminaboton.add(botonInsertar);
		add(laminaboton,BorderLayout.SOUTH);
		botonE.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				areatexto.append("hi it is time tu wake up");
				
			}});
		botonInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent w) {
				// TODO Auto-generated method stub
				boolean variable22=!areatexto.getLineWrap();
				areatexto.setLineWrap(variable22);
			}
			
		});
	}
}
