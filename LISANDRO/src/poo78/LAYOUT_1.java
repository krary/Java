package poo78;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LAYOUT_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
frame Frame=new frame();
Frame.setVisible(true);
Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}}


class frame extends JFrame{
	public frame() {
		setTitle("LAYOUT");
		setBounds(1000,100,500,200);
		panel  paneL=new panel();
		panel2 panel3=new panel2();
		//FlowLayout disposicion=new FlowLayout(FlowLayout.RIGHT);
		//paneL.setLayout(disposicion);
		//paneL.setLayout(new FlowLayout(FlowLayout.CENTER,75,100));
		
		add(paneL,BorderLayout.NORTH);
		
		add(panel3,BorderLayout.SOUTH);
	}
}
class panel extends JPanel{
	
	public panel(){
		setLayout(new FlowLayout(FlowLayout.LEFT)); 
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
		
		
	}
}
class panel2 extends JPanel{
	public panel2(){
		setLayout(new BorderLayout());
		add(new JButton("Cyan"),BorderLayout.WEST);
	add(new JButton("Verde"),BorderLayout.EAST);
		add(new JButton("Negro"),BorderLayout.CENTER);
	}
}