package poo81;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class CREACION_MENUS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ll l2=new ll();
		l2.setVisible(true);
		l2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class ll extends JFrame{
	public ll() {
		setTitle("Menus");
		setBounds(500,300,1000,380);
		jj j2=new jj();
		add(j2);
	}
}
class jj extends JPanel{
	private JMenuBar menu;
	private JMenu encabezado,edicion,herramientas;
	private JMenuItem guardar,guarda_como;
	private JMenuItem cortar,copiar,pegar;
	private JMenuItem generales;
	private JMenu opciones;
	private JMenuItem opcion1,opcion2;
public jj() {
	menu=new JMenuBar();
	encabezado=new JMenu("Activo");
	edicion=new JMenu("Edicion");
	herramientas=new JMenu("Herramientas");
	guardar=new JMenuItem("Guardar");
	guarda_como=new JMenuItem("Guardar Como");
	cortar=new JMenuItem("Cortar");
	copiar=new JMenuItem("Copiar");
	pegar=new JMenuItem("Pegar");
	generales=new JMenuItem("Generales");
	opciones=new JMenu("Opciones");
	opcion1=new JMenuItem("Opcion1");
	opcion2=new JMenuItem("Opcion2");
	
	
	
	encabezado.add(guardar);
	encabezado.add(guarda_como);
	 

	
	opciones.add(opcion1);
	opciones.add(opcion2);
	edicion.add(cortar);
	edicion.add(copiar);
	edicion.add(pegar);
	edicion.addSeparator();
	edicion.add(opciones);
	herramientas.add(generales);
	
	
	
	
	menu.add(encabezado);
	menu.add(edicion);
	menu.add(herramientas);
	add(menu);
}
	private class interna implements ActionListener{
	
			

		@Override
		public void actionPerformed(ActionEvent e) {
}
		
		}
	}
		




