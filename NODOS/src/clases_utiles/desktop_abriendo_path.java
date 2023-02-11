package clases_utiles;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class desktop_abriendo_path {
	public static void main(String[]args) {
		archivo archivo1=new archivo();
		archivo1.setVisible(true);
		archivo1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}}
class archivo extends JFrame{
	private JButton boton;
	public archivo() {
		setSize(700,700);
		
		
	panel panel1=new panel();
	add(panel1);}
	
}
class panel extends JPanel{
	private Desktop err;
	private JButton boton;
	public panel() {

	boton=new JButton("boton");
	boton.addActionListener(new interna());
	add(boton);
	}
	private class interna implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			if(e.getSource()==boton) {
			try {
				
			Desktop.getDesktop().open(new File("C:/"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				try {
					err.mail();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		}
		}
		
	}
}
