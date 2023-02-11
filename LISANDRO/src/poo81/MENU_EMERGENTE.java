package poo81;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

public class MENU_EMERGENTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

emergente emergente1=new emergente();
emergente1.setVisible(true);
emergente1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}


}
class emergente extends JFrame{
	public emergente() {
		setTitle("ventenas Emergentes");
		setBounds(500,300,1000,300);
		EMERGENTE1 EMERGENTE=new EMERGENTE1();
		add(EMERGENTE);
}
}
class EMERGENTE1 extends JPanel{
	private JMenuBar var;
	private JPopupMenu xx;
    private JMenu formato,edicion,almacen;
	private JPopupMenu variableM;
    private JMenuItem copiar;
    private JMenuItem pegar;
	private JTextPane escrips;
	Font font;
	public EMERGENTE1() {
		setLayout(new BorderLayout());
		var=new JMenuBar();
copiar=new JMenuItem("Negrita ");
pegar=new JMenuItem("Cursiva");
copiar.addActionListener(new StyledEditorKit.BoldAction());
pegar.addActionListener(new StyledEditorKit.BoldAction());
copiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_DOWN_MASK));
		formato=new JMenu("Format");
		formato.addActionListener(new StyledEditorKit.BoldAction());
		edicion=new JMenu("Edit");
		almacen=new JMenu("Size long");
		xx=new JPopupMenu();
xx.add(copiar);
xx.add(pegar);
		escrips=new JTextPane();
         escrips.setComponentPopupMenu(xx);
		
//------------CALLING METHOD-----------------------
         items("Courier","formato","Courier",1,9);
         
         items("Bauhaus","formato","Bauhaus 92",1,12);
         items("Verdana","formato","Verdana",1,9);
         items("Negrita","edicion","",Font.BOLD,12);
         items("Cursiva","edicion","",Font.ITALIC,12);
         items("16","almacen","",1,16);
         items("24","almacen","",1,24);
         
         
         
         
         
         
         
         
         var.add(formato);
		var.add(edicion);
		var.add(almacen);
		var.setBackground(Color.orange);
		
		
		
		
		
		
		
		
		
		add(var, BorderLayout.NORTH);
		add(escrips, BorderLayout.CENTER);
		
	}
	public void items (String nombre_item, String familia,String menu,int formetra,int tipletra) {

	
	JMenuItem item=new JMenuItem(nombre_item);
	item.addActionListener(new StyledEditorKit.BoldAction());
	if(familia=="formato") {
		formato.add(item);
	}
	else if(familia=="edicion") {
		edicion.add(item);
	}
	else if(familia=="almacen") {
		almacen.add(item);
	}
	item.addActionListener(new interna(nombre_item,menu,formetra,tipletra));
	
	}
private class interna implements ActionListener{
String menus;
String menu1;
int formetra1;
int tipletra1;
public interna(String menus1,String menu2, int formetra2,int tipletra2) {
	menus=menus1;
	menu1=menu2;
	formetra1=formetra2;
	tipletra1=tipletra2;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		font=escrips.getFont();
		
		if(menus=="Courier"||menus=="Bauhaus"||menus=="Verdana") {
			formetra1=font.getStyle();
			tipletra1=font.getSize();
		}
		else if(menus=="Negrita"||menus=="Courier") {
			menu1=font.getFontName();
			tipletra1=font.getSize();
		}
		else if(menus=="16"||menus=="24") {
			formetra1=font.getStyle();
			menu1=font.getFontName();
		}
		
		
		escrips.setFont(new Font(menu1,formetra1,tipletra1));
		
	}
	
}


}