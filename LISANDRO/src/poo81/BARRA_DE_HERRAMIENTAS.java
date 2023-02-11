package poo81;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class BARRA_DE_HERRAMIENTAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
esta esta1=new esta();
esta1.setVisible(true);
esta1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class esta extends JFrame{
	public esta() {
		setTitle("Barra Herramientas");
		setBounds(500,300,1000,380);
		esto estos=new esto();
		add(estos);
	}
}
class esto extends JPanel{
	private JButton azul;
	private JButton verde;
	private JButton rojo;
	private JButton naranja;
	private JButton salida;
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JMenu menu;
	private JMenuItem azules,verdes,naranjas,rojos;
	private JMenuBar var;
	private JToolBar tool;
	private JLabel label;
	public esto() {
		setLayout(new BorderLayout());
		tool=new JToolBar();
		label=new JLabel("Bienvenido a nuestro panel de Colores...");
		label.setFont(new Font("Courier",Font.ITALIC,14));
		var=new JMenuBar();
		menu=new JMenu("Colores");
		azules=new JMenuItem("Blue");
		azules.addActionListener(new interna2());
		verdes=new JMenuItem("Green");
		verdes.addActionListener(new interna2());
        salida=new JButton("Exit",new ImageIcon("src/poo81/EXIT.PNG"));
        salida.setBackground(Color.cyan);
        salida.addActionListener(new interna4());
        salida.setFont(new Font("Courier",Font.BOLD,20));
		naranjas=new JMenuItem("Orange");
		naranjas.addActionListener(new interna2());

		rojos=new JMenuItem("Red");
		rojos.addActionListener(new interna2());

		panel=new JPanel();
		panel1=new JPanel();
		panel2=new JPanel();
		azul=new JButton("Azul",new ImageIcon("src/poo81/Azul.PNG"));
		azul.setFont(new Font("Courier",Font.BOLD,15));
		azul.addActionListener(new interna());
		
		verde=new JButton("Verde",new ImageIcon("src/poo81/verde.PNG"));
		verde.addActionListener(new interna());
		verde.setFont(new Font("Courier",Font.BOLD,15));
		
		rojo=new JButton("Rojo",new ImageIcon("src/poo81/rojo.PNG"));
		rojo.addActionListener(new interna());
		rojo.setFont(new Font("Courier",Font.BOLD,15));
		
		naranja=new JButton("Naranja",new ImageIcon("src/poo81/naranja.PNG"));
		naranja.addActionListener(new interna());
		naranja.setFont(new Font("Courier",Font.BOLD,15));
		
		menu.add(azules);
		menu.add(verdes);
		menu.addSeparator();
		menu.add(naranjas);
		menu.add(rojos);
		
		/*panel.add(azul);
		panel.add(verde);
	   
		panel.add(naranja);
		panel.add(rojo);*/
		tool.add(azul);
		tool.add(verde);
		tool.add(rojo);
		tool.add(naranja);
		tool.addSeparator();
		tool.addSeparator();
		tool.add(salida);
		panel.add(tool);
		
		var.add(menu);
		
		panel1.add(var);
		panel2.add(label);
		add(panel2, BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		add(panel1,BorderLayout.NORTH);
		
		
		
		}
	private class interna implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==azul) {
				panel2.setBackground(Color.BLUE);
			}
			else if(e.getSource()==verde) {
				panel2.setBackground(Color.green);
			}
			else if(e.getSource()==rojo) {
				panel2.setBackground(Color.red);
			}
			else if(e.getSource()==naranja) {
				panel2.setBackground(Color.orange);
			}
		}
		
	}


private class interna2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==azules) {
			setBackground(Color.blue);
		}
		else if(e.getSource()==rojos) {
			setBackground(Color.red);
		}
		else if(e.getSource()==verdes) {
			setBackground(Color.green);
		}
		if(e.getSource()==naranjas) {
			setBackground(Color.orange);
		}
	}
	
}private class interna4 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	
}
}