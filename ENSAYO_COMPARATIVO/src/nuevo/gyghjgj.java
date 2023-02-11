package nuevo;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class gyghjgj {
public static void main(String[]args) {

	miclase miclase1=new miclase();
	miclase1.setVisible(true);
	miclase1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}}
class miclase extends JFrame{
	public miclase() {
	setSize(700,700);
	setTitle("MIventana");
	setLocationRelativeTo(null);
	setResizable(false);
	
	mipanel mipanel1=new mipanel();
	add(mipanel1);
	mipanel1.setBackground(Color.DARK_GRAY);
	setBackground(Color.DARK_GRAY);
}}

class mipanel extends JPanel{
	private JButton pb;
	public mipanel() {
		setLayout(null);
		pb=new JButton("Aceptar");
		pb.setBounds(300,10,90,25);
		pb.setBackground(Color.BLUE);
	    pb.setForeground(Color.white);
	    pb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showInputDialog("Esto Solo es un mensaje de la maquina");
			
			}
	    	
	    });
		add(pb);
		
	}
		
}