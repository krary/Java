package poo79;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ENSAYO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
prueba prueba1=new prueba();
prueba1.setVisible(true);
prueba1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class prueba extends JFrame{
	public prueba() {
		setTitle("ventana");
		setBounds(500,300,1000,500);
        setResizable(false);
        fram fram1=new fram();
        add(fram1);
}}
class fram extends JPanel{
private JPanel panel;	
private JCheckBox boton;
private JCheckBox boton1;
private JLabel label;
private Font letra;
private JPanel Panel;
private JRadioButton B1,B2,B3,B4;
private ButtonGroup migrupo;
private JPanel panel19;
	public fram() {
		setLayout(new BorderLayout());
		
	panel=new JPanel();
	Panel =new JPanel();
	
	boton=new JCheckBox("A");
	boton1=new JCheckBox("B");
	migrupo=new ButtonGroup();
	B1=new JRadioButton("Blue",false);
	B2=new JRadioButton("Green", false);
	B3=new JRadioButton("RED", false);
	B2=new JRadioButton("DARK_GRAY", false);
	migrupo.add(B1);
	migrupo.add(B2);
	migrupo.add(B3);
	migrupo.add(B4);
	label=new JLabel("Elije la respuesta que desee" +  "A Imprimir en consola"
	+ " B Imprimir en ventana emergente");
	letra=new Font("Bauhaus",Font.BOLD,20);
	label.setFont(letra);
    panel.add(label);
    add(panel,BorderLayout.NORTH);
    Panel.add(boton);
    Panel.add(boton1);
    add(Panel,BorderLayout.SOUTH);
    boton.addActionListener(new funcion());
	boton1.addActionListener(new funcion());
	panel19=new JPanel();
	add(panel19,BorderLayout.EAST);
	panel19.add(B1);
	panel19.add(B2);
	panel19.add(B3);
	panel19.add(B4);
	}
	private class funcion implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(boton.isSelected()) {
				System.out.println("ESTE ES EL MENSAJE");
			}
			else if(boton1.isSelected()) {
				JOptionPane.showMessageDialog(null,"pues este es el otro mensaje");
			}
		}
		
	}
}
	
	
	
	
	
	