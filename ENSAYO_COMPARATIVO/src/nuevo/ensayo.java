package nuevo;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ensayo {
public static void main(String[]args) {
	f f1=new f();
	f1.setVisible(true);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
class f extends JFrame{
	public f() {
		setSize(700,700);
		setTitle("Window");
		setLocationRelativeTo(null);
		setResizable(false);
		s s1=new s();
		add(s1);
	}
}
class s extends JPanel{
	private JButton boton1;
	public s() {
		boton1=new JButton("Accept");
		boton1.setForeground(Color.WHITE);
		boton1.setBackground(Color.blue);
		interna interna1=new interna();
		boton1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		JOptionPane.showInputDialog("hola esto es uno de los mensajes");		
			Toolkit.getDefaultToolkit().beep();}
		});
		boton1.addActionListener(interna1);
		
		
		
		
		add(boton1);
	}
class interna implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hola que tal a todos ");
		Toolkit.getDefaultToolkit().beep();
	}
	}
}