package poo81;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MENU_CON_IMAGENES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

RR1 RR2=new RR1();
RR2.setVisible(true);
RR2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

}

class RR1 extends JFrame{
	public RR1() {
		setTitle("MENU IMAGEN");
		setBounds(500,300,1000,300);
		LL1 LL=new LL1();
		add(LL);
		LL.setBackground(Color.blue);
	}
}
class LL1 extends JPanel{
	public LL1() {
		JMenuBar var=new JMenuBar();
		JMenu menu=new JMenu("Archivos");
		JMenu menu1=new JMenu("Edicion");
		JMenu menu2=new JMenu("Herramientas");
	
//----------------------menu ITEM------------------------------------------------
		JMenuItem item=new JMenuItem("Cortar",new ImageIcon("src/poo81/powerupBlue_star.png"));
		item.setHorizontalTextPosition(SwingConstants.LEFT);
		JMenuItem item1=new JMenuItem("Copiar",new ImageIcon("src/poo81/lisandro.png"));
		JMenuItem item2=new JMenuItem("Pegar",new ImageIcon("src/poo81/thing_gold.png")) ;
		JCheckBoxMenuItem item3=new JCheckBoxMenuItem("Ir line1",new ImageIcon("src/poo81/LL.gif"));
		item3.setHorizontalTextPosition(SwingConstants.LEFT);
		JCheckBoxMenuItem item4=new JCheckBoxMenuItem("Ir line xx",new ImageIcon("src/poo81/powerupBlue_star.png"));
		item4.setHorizontalTextPosition(SwingConstants.LEFT);
		JMenu item5=new JMenu("Otras Opciones");
		JMenuItem item6=new JMenuItem("Opcione1");
		JMenuItem item7=new JMenuItem("Opcione2");
		
//-----------------------ADD ITEM--------------------------------------
		menu.add(item);
		menu.add(item1);
		menu.add(item2);
		
		menu1.add(item3);
		menu1.add(item4);
		
		menu2.add(item5);
		item5.add(item6);
		item5.addSeparator();
		item5.add(item7);
		
		
		
//----------------------ADD MENU BAR----------------------------------------------		
		
		var.add(menu);
		var.add(menu1);
		var.add(menu2);
		add(var);
	}
	private class interna implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if()
		}
		
	}
}