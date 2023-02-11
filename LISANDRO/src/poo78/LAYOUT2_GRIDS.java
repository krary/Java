package poo78;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LAYOUT2_GRIDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

calculadora calculo=new calculadora();
calculo.setVisible(true);
calculo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

}
class calculadora extends JFrame{
	public calculadora() {
	setTitle("calculador");
	setBounds(500,300,450,300);
	//pack();//CON ESTO OBLIGAMOS AL FRAME A ADAPTAR SU TAMAÑO AL DE LOS BOTONES
	calculadora1 calculadora2=new calculadora1();
	add(calculadora2);


	}
}


class calculadora1 extends JPanel{


	public calculadora1() {
		
		setLayout(new BorderLayout());
		JButton pantalla=new JButton("0");
		add(segundoPanel, BorderLayout.NORTH);
		pantalla.setEnabled(false);
		
	//PUES AQUI CONSTRUIREMOS UN SEGUNDO PANEL DENTRO DE EL MISMO CONSTRUCTOR
		//Y LO PODEMOS HACER DE LA SIGUIENTE MANERA
		segundoPanel=new JPanel();
		//AHORA PODEMOS AGREGAR COSAS EN ESTA LAMINA Y LO PODEMOS HACER CON:
		segundoPanel.setLayout(new GridLayout(4,4));
		//AHORA COMO PODEMOS SEGUIR TRABAJANDO SOBRE ESTA LAMINA:
		//BUENO LA METODOLOGIA SERIA LA SIGUIENTE PARA AGREGAR BOTONES SI QUEREMOS:
		//JButton boton1=new JButton("1");
		
		
		//Y YA HEMOS UTILIZADO LA VARIABLE DE TIPO PANEL 
		
//		//LOS BOTONES NO VAN A SALIR PORQUE LO QUE TENEMOS QUE HACER ES UNIFICAR LAS DOS LAMINAS PORQUE TODAVIA NO LO HEMOS HECHO:
		add(segundoPanel, BorderLayout.CENTER);
		//PODEMOS AUTOMATIZAR LA CONSTRUCCION DE BOTONES
		
		
//ENTONCES YA ESTAMOS LISTOS PARA CREAR LOS BOTONES UNA VEZ QUE HEMOS CREADO EL METODO PARA HACERLO
	ActionListener inserta=new insertaNumeros();//AQUI CREAMOS UN OBJETO DE TIPO OYENTE PARA PODER INSTANCIAR NUESTRA CLASE INTERNA
		                     autom("7",inserta);
		                     autom("8",inserta);
		                     autom("9",inserta);
		                    // autom("/");
		                     autom("4",inserta);
		                     autom("5",inserta);
		                     autom("6",inserta);
		                     //autom("*");
		                     autom("1",inserta);
		                     autom("2",inserta);
		                     autom("3",inserta);
		                     //autom("-");
		                     //autom("+");
		                     
		                     
		                     
		                     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//EL PRIMER PASO SERIA CREAR UN METODO PARA QUE DICHO PROCESO SEA PUES AUTOMATIZADO DE MANERA QUE SEA LLAMAR A DICHO PARAMETRO
	}
		public void autom(String rotulo, ActionListener oyente){//ESTE ES UNA VALOR QUE DESPUES TENDREMOS QUE DAR CADA VEZ QUE LLAMEMOS A ESTE METODO
		                     JButton boton=new JButton(rotulo);  //ASI LIGMAOS LA VARIABLE DEL METODO CON LA DEL BOTON
		                     //LA VARIABLE DEL METODO ES DE TIPO STING PORQUE LA DEL BOTON ES DE TIPO STRING}
		                     //LO QUE NOS FALTA ES AGREGARLO AL SEGUNDO PANEL QUE HEMOS CREADO PARA QUE ESO TAMBIEN SEA AUTOMATICO
		                    boton.addActionListener(oyente);//CON ESTO CONSEGUIMOS QUE TODOS NUESTROS BOTONES ESTEN A LA ESCUCHA
		                    segundoPanel.add(boton);//LO UNICO QUE NOS FALTA ES QUE ESTE SEGUNDO PANEL QUE HEMOS CREADO SEA VISIBLE PARA TODA LA CLAS LIN69	
		}
		
	private JPanel segundoPanel;
	private JButton pantalla;
	
	//DEBEMOS DE CREAR UNA CLASE INTERNA DONDE PODAMOS CONSEGUIR QUE LOS NUMERO NOS APAREZCAN EN LA PANTALLA LUEGO:
	
	private class insertaNumeros implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			String info =e.getActionCommand();// CON SOLO ESTA LINEA EN NUESRTO CONSTRUCTOR PODEMOS RECUPERAR EL TEXTO QUE QUERAMOS
			pantalla.setText(info);// CON ESTA LINEA PODEMOS RECREAR EL TEXTO QUE CREAMOS ARRIBA Y EN DONDE? PUES EN EL BOTON PANTALLA QUE CREAMOS ARRIBA		}
		
	}
		
	
}

}




