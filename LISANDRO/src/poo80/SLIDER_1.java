package poo80;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSlider;

public class SLIDER_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	slider slider1=new slider();
	slider1.setVisible(true);
	slider1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

}
class slider extends JFrame{
	public slider() {
		setBounds(500,300,1000,500);
		setTitle("Slider 1");
		sliderr sliderrr=new sliderr();
		add(sliderrr);
	}
}
class sliderr extends JPanel{
	JSlider slad;
	JScrollBar bara;
	JPanel panel;
	JLabel label;
	public sliderr() {
		setLayout(new BorderLayout());
		panel =new JPanel();
		label=new JLabel("On the somwhere of the city of England such name i cant");
		bara=new JScrollBar();
		slad=new JSlider(0,60,50);
		//slad.setOrientation(SwingConstants.VERTICAL);
		slad.setMajorTickSpacing(50);
		slad.setMinorTickSpacing(25);
		slad.setPaintTicks(true);
		slad.setPaintLabels(true);
		slad.setFont(new Font("Serif",Font.ITALIC,12));
		slad.setSnapToTicks(true);
		add(slad);
		
	}
}