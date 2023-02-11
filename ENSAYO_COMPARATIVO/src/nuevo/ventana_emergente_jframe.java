package nuevo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventana_emergente_jframe{
	private static JPanel pane;
	public static void main(String[]args) {
numero numero1=new numero();

numero1.setVisible(true);
numero1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
try {
	Thread.sleep(4333);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
numero1.dispose();
//panel1.setBackground(Color.DARK_GRAY);
numeroz numeroz1=new numeroz();

numeroz1.setVisible(true);
numeroz1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




	}
		}

class numero extends JFrame{
	private int x,y;
	public numero() {
		this.x=x;
		this.y=y;
		setSize(400,100);
		setResizable(false);
		//setLocationRelativeTo(null);
		setLocationRelativeTo(null);
	panel panel1=new panel();
	add(panel1);
	panel1.setBackground(Color.DARK_GRAY);
	
	}
}
class panel extends JPanel{
	private JLabel label;
	public panel() {
		label=new JLabel("Cargando systema...");
		label.setForeground(Color.green);
		label.setFont(new Font("Courier",Font.PLAIN,14));
		add(label);
	}
}

class numeroz extends JFrame{
	private int x,y;
	public numeroz() {
		this.x=x;
		this.y=y;
		setSize(700,700);
		setResizable(false);
		//setLocationRelativeTo(null);
		setLocationRelativeTo(null);
	panels panels1=new panels();
	add(panels1);
	panels1.setBackground(Color.yellow);
	
	}
}




     	
	
class panels extends JPanel{
	public panels() {
		
	}
}
