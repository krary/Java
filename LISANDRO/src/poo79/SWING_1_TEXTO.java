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


public class SWING_1_TEXTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
texto texto1=new texto();
texto1.setVisible(true);
texto1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class texto extends JFrame{
	public texto() {
		setTitle("texto");
		setBounds(500,100,1000,300);
		letra LETRA=new letra();
		add(LETRA);
		LETRA.setBackground(Color.blue);
	
	}
}
class letra extends JPanel{
	private JPanel panel;
	private JButton boton;
    private JButton boton1;
	private JTextField campo1;
	private JLabel label;
	private JTextField label1;
	public letra() {
		setLayout(new BorderLayout());
		panel=new JPanel();
		label1=new JTextField();
		boton=new JButton("Loading...");
		boton1=new JButton("Delete..");
		boton.setBackground(Color.cyan);
		 label=new JLabel("Email : ");
		 label.setBackground(Color.cyan);
		campo1 =new JTextField(20);
		campo1.setBackground(Color.yellow);
		interna interna1=new interna();
		erases erase1=new erases();
setLayout(new FlowLayout(FlowLayout.LEFT));
		add(label);
		add(campo1);
		
		add(boton);
		add(panel,BorderLayout.SOUTH);
setLayout(new FlowLayout(FlowLayout.CENTER));
         add(boton1);

		boton.addActionListener(interna1);
        boton1.addActionListener(erase1);
		
		//JOptionPane.showInputDialog(campo1.getText().trim());
	}
private class interna implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
int correcto=0;
String email=campo1.getText().trim();
for(int i=0;i<email.length();i++) {
	if(email.charAt(i)=='@') {
		correcto++; 
	}}
	if(correcto!=1) {
		panel.add(label1,BorderLayout.SOUTH);
		label1.setText("WRONG");
	}
	else {
		panel.add(label1,BorderLayout.SOUTH);
		label1.setText("OKAY");
	}

		
		}}
private class erases implements ActionListener{
			public void actionPerformed(ActionEvent w) {
				campo1.setText("");}
			}

	}
	