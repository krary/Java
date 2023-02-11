package nuevo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class chatGPT {
	public static void main(String[]args) {
		gpt gpt1=new gpt();
		gpt1.setVisible(true);
		gpt1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class gpt extends JFrame{
	public gpt() {
		setSize(700,700);
		setTitle("My Window");
		setLocationRelativeTo(null);
		setResizable(false);
		tpg tpg1= new tpg();
		add(tpg1);
		tpg1.setBackground(Color.DARK_GRAY);
	}
}
class tpg extends JPanel{
	private JLabel label1;
	private JTextField campoN;
	private Insets margin;
	private Border l;
      public tpg() {
    	  setLayout(null);
    	  margin = new Insets(30,30,30,30);
    	  l=BorderFactory.createLineBorder(Color.blue);
    	  label1 = new JLabel("texto");
    	  label1.setForeground(Color.white);
    	  label1.setFont(new Font("Serif",Font.BOLD,23 ));
    	  label1.setBounds(10,10,80,20);
    	  
    	  campoN = new JTextField(20);
    	  campoN.setBounds(70,10,120,20);
    	  
    	  
    	  campoN.setMargin(margin);
    	  campoN.setBorder(l);
    	  campoN.setFont(new Font("Verdana",Font.BOLD,14));
    	  campoN.setForeground(Color.blue);
    	  add(label1);
    	  add(campoN);
      }
}



