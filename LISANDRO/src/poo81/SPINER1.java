package poo81;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class SPINER1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

hh jl=new hh();
jl.setVisible(true);
jl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
class hh extends JFrame{
	public hh() {
		setTitle("SPINER");
		setBounds(500,300,1000,500);
		rr rr1=new rr();
		add(rr1);
	}
}
class rr extends JPanel{
	String lista[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	private JSpinner spin;
	private Dimension dimension;
	public rr() {
         dimension =new Dimension(100,50);
		//spin=new JSpinner(new SpinnerListModel(lista));
         spin=new JSpinner(new modeloSpinner());
		spin.setPreferredSize(dimension);
		add(spin); 
	}
	private class modeloSpinner extends SpinnerNumberModel{
	 	public modeloSpinner() {
			super(5,0,10,1);}
			public Object getNextValue() {
				return super.getPreviousValue();
			}
			public Object getPreviousValue() {
				return super.getNextValue();
			}
		
	}
}