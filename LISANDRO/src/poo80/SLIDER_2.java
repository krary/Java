package poo80;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SLIDER_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
jj jl=new jj();
jl.setVisible(true);
jl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class jj extends JFrame{
	public jj() {
		setTitle("Slider2");
		
		setBounds(500,300,500,300);
		lj ll=new lj();
		add(ll);
	}
}
class lj extends JPanel{
	private JSlider slide;
	private JComboBox box;
	private JLabel label;
	private JPanel panel;
	private int contador=0;
	public lj() {
		setLayout(new BorderLayout());
		panel=new JPanel();
		label=new JLabel("THIS IS JUST A REST FOR TU KEEP GOING");
		
	    slide=new JSlider(8,50,12);
	    slide.setMajorTickSpacing(20);
	    slide.setMinorTickSpacing(5);
	    slide.setPaintTicks(true);
	    slide.setPaintLabels(true);
	    slide.setFont(new Font("Srif", Font.ITALIC,10));
	panel.add(slide);
	add(label, BorderLayout.NORTH);
	add(panel, BorderLayout.CENTER);
	slide.addChangeListener(new interna());
	
	}
	private class interna implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
		label.setFont(new Font("Sarif", Font.ITALIC,slide.getValue()));
		}
		
	}
}

