package FACEBOOK;

import java.awt.Color;
import java.awt.Font;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class facebookback {
public static void main(String[]args) {

	
	atras atras1=new atras();
	atras1.setVisible(true);
	atras1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
}
}
class atras extends JFrame{
	public atras() {
		setSize(700,700);
		setLocationRelativeTo(null);
		setResizable(false);
		atras2 atras3=new atras2();
		add(atras3);
	}
}

class atras2 extends JPanel implements Runnable{
	private JTextArea area;
	public atras2() {
		
		setLayout(null);
		area=new JTextArea();
		area.setBounds(0,0,700,700);
		area.setBackground(Color.DARK_GRAY);
		area.setForeground(Color.green);
		area.setFont(new Font("Arial Black",Font.PLAIN,16));
		add(area);
		Thread hilo=new Thread(this);
		hilo.start();
	}
	public void run() {
		try {

			ServerSocket misocket=new ServerSocket(9000);
			Socket misocket1;
			while(true) { 
			misocket1=misocket.accept();
			DataInputStream data=new DataInputStream(misocket1.getInputStream());
			String info=data.readUTF();
			area.append("\n"+info);
			misocket1.close();}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}