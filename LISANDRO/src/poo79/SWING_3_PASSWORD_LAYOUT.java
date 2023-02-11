package poo79;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;



public class SWING_3_PASSWORD_LAYOUT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
j21 j22=new j21();
j22.setVisible(true);
j22.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class j21 extends JFrame{
	
	public j21() {
		
		
		setTitle("contraseña");
		setBounds(500,300,1000,300);
		l21 l22=new l21();
		add(l22);
		l22.setBackground(Color.MAGENTA);
	}
}

class l21 extends JPanel{
	JPasswordField pass;
		public l21() {
		setLayout(new BorderLayout());
		JPanel lamina=new JPanel();
		lamina.setLayout(new GridLayout(2,2));
		add(lamina, BorderLayout.NORTH);
		JLabel etiqueta =new JLabel("Usuario :");
		JLabel etiqueta1=new JLabel("Contraseña :");
		JTextField usuario=new JTextField();
		test test1=new test();
		pass=new JPasswordField(15);
		lamina.add(etiqueta);
		lamina.add(usuario);
		lamina.add(etiqueta1);
		lamina.add(pass);
		JButton boton=new JButton("Enviar..");
		boton.setBackground(Color.cyan);
		add(boton,BorderLayout.SOUTH);
		pass.getDocument().addDocumentListener(test1);
		
	}
		private class test implements DocumentListener{

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				char[] clave=pass.getPassword();
				if (clave.length<8||clave.length>12) {
					pass.setBackground(Color.red);
				}
				else {
					pass.setBackground(Color.white);
				}
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				char[] clave=pass.getPassword();
				if (clave.length<8||clave.length>12) {
					pass.setBackground(Color.red);
				}
				else {
					pass.setBackground(Color.white);
				}
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}
}


