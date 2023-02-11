package poo77;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;


public class Evento9_MULTIPLES_FUENTES extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	numeros numeros1=new numeros();
	numeros1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    numeros1.setVisible(true);}
}
class numeros extends JFrame{
	public numeros() {
		setBounds(52,12,900,800);
		setTitle("mi ventana");
		
		numeros2 numero=new numeros2();
		add(numero);
	}
}
class numeros2 extends JPanel{
	colores Amarillo=new colores("AMARILLO",new ImageIcon("src/poo76/ww.png"),Color.yellow);
	colores CYAN=new colores("CYAN",new ImageIcon("src/poo76/ww.png"),Color.cyan);
	colores AZUL=new colores("AZUL",new ImageIcon("src/poo76/ww.png"),Color.blue);
	
	
	

	public numeros2() {
	add(new JButton(Amarillo));
	add(new JButton(CYAN)); 
	add(new JButton(AZUL));
	InputMap Mapaentrada=getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
	//KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctr A");
	
    Mapaentrada.put(KeyStroke.getKeyStroke("ctr A"), "fondo_amarillo");
    Mapaentrada.put(KeyStroke.getKeyStroke("ctr B"), "AZUL");
    Mapaentrada.put(KeyStroke.getKeyStroke("ctr C"), "fondo_CYAN");
    ActionMap accionmapa=getActionMap();
    accionmapa.put("fondo_amarillo", Amarillo);
    accionmapa.put("fondo_amarillo", AZUL);
    accionmapa.put("fondo_amarillo", CYAN);
    
	}
	private class colores extends AbstractAction{
		public colores(String nombre, Icon icono, Color color_boton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION,  "PONER DE COLOR LA LAMINA " + nombre);
			putValue("color_de_fondo",color_boton);
		}
			
			public void actionPerformed(ActionEvent e) {
				
				Color c=(Color)getValue("color_de_fondo");
				setBackground(c);
			}
			
		}

	}




