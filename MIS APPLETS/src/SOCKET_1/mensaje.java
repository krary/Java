package SOCKET_1;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class mensaje {
public static void main(String[]args) {
	mensajero mensajero1=new mensajero();
	mensajero1.setVisible(true);
	mensajero1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
class mensajero extends JFrame{
	public mensajero() {
		setSize(700,700);
		setLocationRelativeTo(null);
		setResizable(false);
		mensajes mensajes1=new mensajes();
		add(mensajes1);
		
	}
}
class mensajes extends JPanel implements Runnable{
	private JTextArea texto;
	public mensajes() {
		setLayout(null);
		texto=new JTextArea();
	Thread hilo=new Thread(this);
	hilo.start();
	texto.setBounds(0,0,700,700);
	add(texto);
	}
	@Override
	public void run() {
		try (// TODO Auto-generated method stub
		ServerSocket supersocket = new ServerSocket(9999)) {
			
			String mm;
			String nn;
			int ii;
			paqueteEnvio paqueteRec;
			while(true) {
			Socket sucket=supersocket.accept();
			
			DataInputStream entrada=new DataInputStream(sucket.getInputStream());
			String info=entrada.readUTF();
			texto.append("\n"+info);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	}





