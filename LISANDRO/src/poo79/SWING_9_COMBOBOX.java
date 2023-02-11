package poo79;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SWING_9_COMBOBOX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
imagen imagen1=new imagen();
imagen1.setVisible(true);
imagen1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class imagen extends JFrame{
	public imagen() {
		setTitle("Menu");
		setBounds(500,300,1000,500);
		imagenes imagenes1=new imagenes();
	add(imagenes1);
	}
}

class imagenes extends JPanel{
	private JLabel label;
	private JComboBox combo;
	private JPanel panel;
	public imagenes() {
		setLayout(new BorderLayout());
		label=new JLabel("En un lugar de la mancha cuyo nom...");
		combo=new JComboBox();
		
		combo.addItem("Serif");
		combo.addItem("SansSerif");
		combo.addItem("Monospaced");
		combo.addItem("Dialog");
		combo.setEditable(true);
		editcombo editor=new editcombo();
		panel=new JPanel();
		label.setFont(new Font("Serif",Font.PLAIN,18));
		add(label, BorderLayout.CENTER);
		panel.add(combo);
		combo.addActionListener(editor);
		add(panel, BorderLayout.NORTH);
	}
	private class editcombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setFont(new Font((String)combo.getSelectedItem(),Font.PLAIN,18));
		}
		
	}
}