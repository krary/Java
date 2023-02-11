package Ejercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Procesadro_de_texto {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	frame frame1=new frame();
	frame1.setVisible(true);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

}
class frame extends JFrame{
	private int LARGO=1000, ANCHO=1000;
	public frame() {
		setTitle("Editor Texto");
		setSize(LARGO,ANCHO);
		setLocation(500,300);
		panel1 panele=new panel1();
		add(panele);
		panele.setBackground(Color.BLUE);
	}
}
class panel1 extends JPanel{
	private JPanel panel;
	private JPanel panel1;
	private JMenuBar bar;
	private JMenu fuente,estilo,size;
	private JMenuItem Bauhaus,Arial_Narrow,Ravie;
	private JMenuItem uno,dos,tres,cuatro;
	private JMenuItem cursiva, negritas;
	private JTextPane texto;
	private JScrollPane scroll;
	private Dimension count;
	
	public panel1() {
		count=new Dimension();
		setLayout(new BorderLayout());
		panel=new JPanel();
		panel1=new JPanel();
		scroll=new JScrollPane(texto);
		texto=new JTextPane();
		texto.setFont(new Font("Serif",Font.PLAIN,14));
		
		//texto.setBackground(Color.blue);
	bar=new JMenuBar();
	fuente =new JMenu("Fuente");
	estilo =new JMenu("Estilo");
	size =new JMenu("Tamaño");
	Bauhaus=new JMenuItem("Bauhaus");
    Bauhaus.addActionListener(new metal());
	Arial_Narrow=new JMenuItem("Arial Narrow");
	Ravie=new JMenuItem("Ravie");
	cursiva=new JMenuItem("Cursiva");
	negritas=new JMenuItem("Negritas");
	
	
	interna interna1=new interna();
	
	
	uno=new JMenuItem("14");
	uno.addActionListener(interna1);
	dos=new JMenuItem("18");
	dos.addActionListener(interna1);
	tres=new JMenuItem("26");
	tres.addActionListener(interna1);
	cuatro=new JMenuItem("32");
	cuatro.addActionListener(interna1);
	
	Bauhaus.addActionListener(interna1);
	estilo.add(cursiva);
	estilo.add(negritas);
	
	
	
	fuente.add(Bauhaus);
	fuente.add(Arial_Narrow);
	fuente.add(Ravie);
	
	size.add(uno);
	size.add(dos);
	size.add(tres);
	size.add(cuatro);
	
	bar.add(fuente);
	bar.add(estilo);
	bar.add(size);
	bar.setBackground(Color.orange);
	panel.setBackground(Color.blue);
	panel.add(bar);
	count=panel1.getSize();
	
	
	panel1.add(scroll);
	panel1.add(texto);
	
	panel1.setBackground(Color.blue);
	add(panel,BorderLayout.NORTH);
	add(panel1, BorderLayout.CENTER);
	
	
	}
	private class interna implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int counte=14;
			if(e.getSource()==uno) {
				
				texto.setFont(new Font("Sarif",Font.PLAIN,counte));
				texto.getSize(count);
				}
			
			else if(e.getSource()==tres) {
				texto.setFont(new Font("Sarif",Font.PLAIN,counte+8));
				counte=26;
			}
			else if(e.getSource()==cuatro) {
				texto.setFont(new Font("Sarif",Font.PLAIN,counte+6));
			}
	}
		
	}
	private class metal implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent w) {
			// TODO Auto-generated method stub
	if(w.getSource()==Bauhaus) {
		System.out.println("funciona");
	}
		}

}}