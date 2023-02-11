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
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;


public class SWING2_JTEXTFIELD_DOCUMENTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
documentos documentos1=new documentos();
documentos1.setVisible(true);
documentos1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class documentos extends JFrame{
	public documentos(){
	setTitle("Documentos");
	setBounds(500,300,1000,300);
	archivos archivos1=new archivos();
	add(archivos1);
	archivos1.setBackground(Color.red);
}}


class archivos extends JPanel{
	
	JTextField espacio;
	JLabel sub;
	
	public archivos () {
	
		sub =new JLabel("Escribe :");
		espacio=new JTextField(20);
		
		espacio.setBackground(Color.blue);
		
		Document file=espacio.getDocument();
		Escucha escucha=new Escucha();
		file.addDocumentListener(escucha);
		add(sub);
		add(espacio);
		
	}
	private class Escucha implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

