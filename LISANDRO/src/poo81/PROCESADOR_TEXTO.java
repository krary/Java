package poo81;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class PROCESADOR_TEXTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
lisandro lisandro1=new lisandro();
lisandro1.setVisible(true);
lisandro1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class lisandro extends JFrame{
	public lisandro() {
	setTitle("Procesador de Texto");
	setBounds(500,300,500,300);
	formula cuadro1=new formula();
	add(cuadro1);
}}
class formula extends JPanel{


	private JMenuBar var;
	private JMenu fuente,estilo,size;
	private JTextPane texto;
	private JScrollPane pane;
	private Font letras;
	public formula() {
		setLayout(new BorderLayout());
//--------inicializando variables-----------------
pane=new JScrollPane(texto);		
texto=new JTextPane();
var=new JMenuBar();
fuente=new JMenu("Fuente");
estilo=new JMenu("Edicion");
size=new JMenu("Tamaño");

//---------COLORES DE FONDO-------------------------------
texto.setBackground(Color.cyan);
var.setBackground(Color.orange);
//---------ADDING VARIABLES-------------------------------------
var.add(fuente);
var.add(estilo);
var.add(size);
//-----------------EJECUTANDO METODO FUENTE-------------------------
configura_menu("Arial","fuente","Arial",9,10);
configura_menu("Courier","fuente","Courier",9,10);
configura_menu("Verdana","fuente","Verdana",9,10);

//----------------EJECUTANDO METODO ESTILO-----------------------
configura_menu("Negrita","estilo","Negrita",Font.BOLD,1);
configura_menu("Cursiva","estilo","",Font.ITALIC,1);
//--------------- EJECUTANDO METODO SIZE------------------------
configura_menu("12","size","",9,12);
configura_menu("16","size","",9,16);
configura_menu("20","size","",9,20);
configura_menu("24","fuente","",9,24);
//-----------add-------------------------------------------------
add(var,BorderLayout.NORTH);
add(texto,BorderLayout.CENTER);		
}
//----------metodo-------------------------------------------
	public void configura_menu(String rotulo,String menu,String tipo_letra,int estilos,int tam) {
		JMenuItem elem_menu=new JMenuItem(rotulo);
		if(menu=="fuente") {
			fuente.add(elem_menu);
		}
		else if(menu=="estilo") {
			estilo.add(elem_menu);
		}
		else if(menu=="size") {
			size.add(elem_menu);
		}elem_menu.addActionListener(new escucha(rotulo,tipo_letra,estilos,tam));
	}
	private class escucha implements ActionListener{
             String tipo_texto,menu;
             int estilo_letra, tamagno_letra;
             
             escucha(String elemento, String texto2,int estilo2,int tam_letra){
            	 tipo_texto=texto2;
            	 estilo_letra= estilo2;
            	 tamagno_letra=tam_letra;
            	 menu=elemento;
             }
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			letras=pane.getFont();
			if(menu=="Arial"||menu=="Courier"||menu=="Verdana") {
				estilo_letra=letras.getStyle();
				tamagno_letra=letras.getSize();
				
			}
			else if(menu=="Cursiva"||menu=="Negrita") {
				tipo_texto=letras.getFontName();
				tamagno_letra=letras.getSize();
			}
			else if(menu=="12"||menu=="16"||menu=="20"||menu=="24") {
				tipo_texto=letras.getFontName();
				estilo_letra=letras.getStyle();
				
			}
			
		pane.setFont(new Font(tipo_texto,estilo_letra,tamagno_letra));	
		}
		
	}
}







