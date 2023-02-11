package poo78;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LAYOUT3_CALCULADORA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
puerta ventana=new puerta();
ventana.setVisible(true);
ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class puerta extends JFrame{
	JPanel screen;
	public puerta() {
		setTitle("mi calculadora");
		setBounds(500,300,500,300);
		escalera escalera1=new escalera();
		add(escalera1);
        escalera1.setBackground(Color.black);	}
}
	class escalera extends JPanel{
	private JPanel screen;
	private JButton pantalla;
	private boolean principio;
	private double resultado;
	private String ultimaOrden;
		public escalera() {
			principio=true;
			screen =new JPanel();
			setLayout(new BorderLayout());
			pantalla=new JButton("0");
			pantalla.setBackground(Color.blue);
			add(pantalla,BorderLayout.NORTH);
			pantalla.setEnabled(false);
			add(screen,BorderLayout.CENTER);
			pantalla.setEnabled(false);
		
		screen.setLayout(new GridLayout(4,4));
		ActionListener insertar=new insertaNumeros();
		ActionListener orden=new AccionOrden();
		//AQUI VIENE LOS BOTONES
		ponNumero("7",insertar,Color.green);
		ponNumero("8",insertar,Color.green);
		ponNumero("9",insertar,Color.green);
		ponNumero("*",orden,Color.cyan);
		ponNumero("4",insertar,Color.green);
		ponNumero("5",insertar,Color.green);
		ponNumero("6",insertar,Color.green);
		ponNumero("-",orden,Color.cyan);
		ponNumero("1",insertar,Color.green);
		ponNumero("2",insertar,Color.green);
		ponNumero("3",insertar,Color.green);
		ponNumero("-",orden,Color.cyan);
		ponNumero("0",insertar,Color.green);
		ponNumero(".",orden,Color.cyan);
		ponNumero("=",orden,Color.cyan);
		ponNumero("+",orden,Color.cyan);
	ultimaOrden = "=";
		}
		
	//metodo
		public void ponNumero(String rotulador, ActionListener oyente, Color color) {
			JButton boton=new JButton(rotulador);
			boton.addActionListener(oyente);
		    screen.add(boton);
		    boton.setBackground(color);
		}
		private class insertaNumeros implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String entrada=e.getActionCommand();
				if (principio) {
					pantalla.setText("");
					principio=false;
				}
				pantalla.setText(pantalla.getText() + entrada);
			}
			
		}
		private class AccionOrden implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String operacion=e.getActionCommand();

				calcular(Double.parseDouble(pantalla.getText()));
						ultimaOrden=operacion;
				
				principio=true;	
			}
			public void calcular(Double x) {
				if(ultimaOrden.equals("+")) {
					resultado+=x;
					
				}
				else if(ultimaOrden.equals("*")) {
					resultado*=x;
				}
				else if(ultimaOrden.equals("-")) {
					resultado-=x;
				}
				else if(ultimaOrden.equals("/")) {
					resultado/=x;
				}
				else if (ultimaOrden.equals("=")) {
					resultado=x;
				}
				
		      pantalla.setText("" + resultado);
			}
	}
	}