package steam;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class inicio_sesion {
public static void main(String []args) {
inicio inicio1=new inicio();
inicio1.setVisible(true);
inicio1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
class inicio extends JFrame{
	public inicio() {
		setSize(1600,797);
		setLocationRelativeTo(null);
		setResizable(false);
		comenzar comenzar1=new comenzar();
		add(comenzar1);
		
	}
}
class comenzar extends JPanel{
	private JTextField nombre,password;
	private JCheckBox recordarme;
	private JButton aceptar,instalarsteam;
	private URI uri;
	private JMenuBar caja1;
	private JMenu caja2;
	private JMenuItem articulos;
	public comenzar() {
		setLayout(null);
		nombre=new JTextField();
		nombre.setBounds(450,361,490,40);
		nombre.setBackground(Color.DARK_GRAY);
		nombre.setBorder(BorderFactory.createEmptyBorder());
		nombre.setForeground(Color.white);
		nombre.setFont(new Font("Courier",Font.PLAIN,18));
		
		
		password=new JTextField();
		password.setBounds(450,440,490,40);
		password.setBackground(Color.DARK_GRAY);
		password.setBorder(BorderFactory.createEmptyBorder());
		password.setForeground(Color.white);
		password.setFont(new Font("Courier",Font.PLAIN,18));
		
		recordarme=new JCheckBox();
		recordarme.setBounds(450,497,20,20);
		recordarme.setBorder(BorderFactory.createEmptyBorder());
		recordarme.setBackground(Color.DARK_GRAY);
		recordarme.setForeground(Color.DARK_GRAY);
		
		aceptar=new JButton("Iniciar sesión");
		aceptar.setBounds(552,530,291,60);
		aceptar.setBackground(new Color(100, 149, 237));
		aceptar.setBorder(BorderFactory.createEmptyBorder());
		aceptar.setForeground(Color.white);
		aceptar.setFont(new Font("Arial Black",Font.PLAIN,18));
		aceptar.addActionListener(new interna1());
		
		instalarsteam=new JButton("Instalar Steam");
		instalarsteam.setBounds(1000,5,140,30);
		instalarsteam.setBackground(new Color(29, 131, 72 ));
		instalarsteam.setBorder(BorderFactory.createEmptyBorder());
		instalarsteam.setForeground(Color.white);
		instalarsteam.setFont(new Font("Serif",Font.PLAIN,16));
	//	instalarsteam.addActionListener(new interna3());
		
		caja1=new JMenuBar();
		caja2=new JMenu("Tienda");
		caja2.setForeground(Color.white);
		articulos=new JMenuItem("Comprar");
		caja1.setBackground(Color.DARK_GRAY);
		caja2.setBackground(Color.DARK_GRAY);
		caja2.setBorder(BorderFactory.createEmptyBorder());
		caja2.add(articulos);
		caja1.add(caja2);
		
		caja1.setBounds(0,0,80,80);
		
		add(recordarme);
		add(nombre);
		add(password);
		add(aceptar);
		add(instalarsteam);
		add(caja1);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D gg=(Graphics2D)g;
		ImageIcon imagen=new ImageIcon(getClass().getResource("steam.PNG"));
		gg.drawImage(imagen.getImage(),0,0,1600,797,this);
		
	}
	class interna implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				uri = new URI("https://store.steampowered.com/about/");
			} catch (URISyntaxException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				Desktop.getDesktop().browse(uri);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
	class interna1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
				Runtime r=Runtime.getRuntime();
				try {
					r.exec("notepad");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			
		}
		
	}
	class interna3 implements Runnable{

		@Override
		public void run() {
			try (// TODO Auto-generated method stub
			ServerSocket misocket = new ServerSocket(7777)) {
			Socket socket=misocket.accept();
			socket.getLocalAddress();
				System.out.println(socket);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}








