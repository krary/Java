package poo79;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SWING_6_CHECKBOX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
caja caja1=new caja();
caja1.setVisible(true);
caja1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class caja extends JFrame{
	public caja() {
		setTitle("CHECK BOX");
		setBounds(500,300,1000,300);
cajja cajja1=new cajja();
add(cajja1);
//cajja1.setBackground(Color.pink);
	}
	
	
	
}
class cajja extends JPanel{
	private JLabel texto;
	private JCheckBox check1, check2;
	
	public cajja() {
	setLayout(new BorderLayout());
		Font miletra=new Font("Bauhaus 93",Font.PLAIN,24);
		texto=new JLabel("En un lugar de la mancha cuyo nombre no quiero acordarme");
		texto.setFont(miletra); 
    JPanel panel=new JPanel();
    JPanel panel1=new JPanel();
    panel.add(texto);
    add(panel,BorderLayout.CENTER);
    check1=new JCheckBox("Negrita");
    check2=new JCheckBox("Cursiva");
    
    check1.addActionListener(new revisa_caja());
    check2.addActionListener(new revisa_caja());
    panel1.add(check1);
    panel1.add(check2);
    add(panel1, BorderLayout.SOUTH);
	}

	private class revisa_caja implements ActionListener{
int tipo=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(check1.isSelected()) tipo+=Font.BOLD;
			if(check2.isSelected()) tipo+=Font.ITALIC;
			 
		texto.setFont(new Font("Serif", tipo,24));}
		
	}
}


