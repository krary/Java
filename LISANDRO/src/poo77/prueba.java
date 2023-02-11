package poo77;
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
import javax.swing.JTextPane;
public class prueba {

	public static void main(String[] args) {
		uno dos=new uno();
		dos.setVisible(true);
		dos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}}
class uno extends JFrame{
	public uno() {
		setTitle("prueba");
		setBounds(300,100,1000,500);
		tres cuatro=new tres();
		add(cuatro);
		cuatro.setBackground(Color.DARK_GRAY);
	}
}
class tres extends JPanel{
	private JTextPane pane;

	private JMenuBar var;
    private JMenu fuente,estilo,size;
    private Font font;
	
	
	public tres() {
		setLayout(new BorderLayout());
		pane=new JTextPane();
		pane.setBackground(Color.cyan);
		var=new JMenuBar();
		fuente=new JMenu("Fuente");
		estilo=new JMenu("Estilo");
		size=new JMenu("Tamaño");
		var.add(fuente);
		var.add(estilo);
		var.add(size);
		var.setBackground(Color.orange);
		add(var,BorderLayout.NORTH);
		add(pane, BorderLayout.CENTER);
	metodo("fuente","Courier","Courier",9,10);
	metodo("size","14","",1,14);
	metodo("size","16","",1,16);
	metodo("size","20","",1,20);
	metodo("fuente","Bauhaus","Bauhaus",9,10);
	metodo("fuente","Verdana","Verdana",9,10);
	metodo("estilo","Negritas","Negritas",Font.BOLD,9);
	metodo("estilo","Cursivas","Cursiva",Font.ITALIC,9);}
	public void metodo(String clave, String item,String tipo_letra,int estilo_letra,int tamang){
		JMenuItem menu=new JMenuItem(item);
		if(clave=="fuente") {
			fuente.add(menu);
		}
		else if(clave=="estilo") {      //so this way the problems on the variable`s item has been resolved
			estilo.add(menu);
		}
		else if(clave=="size") {        //the another three variables on the method belong our constructor 
			                              // of font 
			size.add(menu);
		}
		menu.addActionListener(new interna(item,tipo_letra,estilo_letra,tamang));

}private class interna implements ActionListener{
    String menu;
	String tipo_letra2;
	int estilo_letra2;
	int tamang2;
	
	public interna(String elementos,String tipo_letra3,int estilo_letra3,int tamang3) {
		
		menu=elementos;
		tipo_letra2=tipo_letra3;
		estilo_letra2=estilo_letra3;
		tamang2=tamang3;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		font=pane.getFont();
		if(menu=="Courier"||menu=="Bauhaus"||menu=="Verdana") {
			estilo_letra2=font.getStyle();
			tamang2=font.getSize();
		}
		else if(menu=="14"||menu=="16"||menu=="20") {
			estilo_letra2=font.getStyle();
			tipo_letra2=font.getFontName();
		}
		else if(menu=="Negrita"||menu=="Coursiva") {
			tipo_letra2=font.getFontName();
			tamang2=font.getSize();
		}
		
		
		
		pane.setFont(new Font(tipo_letra2,estilo_letra2,tamang2));
	}
	
}
	}







