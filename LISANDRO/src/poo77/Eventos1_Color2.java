package poo77;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Eventos1_Color2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
frame frame3=new frame();
frame3.setVisible(true);
frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class frame extends JFrame{
	public frame() {
		setTitle("colores");
		setSize(500,300);
		setLocation(500,300);
		frame1 frame2=new frame1();
		add(frame2);
			}
}

class frame1 extends JPanel implements ActionListener{
	JButton boton1=new JButton("boton@1");
	JButton boton2=new JButton("boton#2");
	fondo fondo1=new fondo(Color.cyan);
	fondo fondo2=new fondo(Color.DARK_GRAY);
	public frame1() {
	add(boton1);
	add(boton2);
	boton1.addActionListener(fondo1);
	boton2.addActionListener(fondo2);
	}
	

private class fondo implements ActionListener{
	private Color color_fondo;
	public fondo(Color g) {
		color_fondo=g;
	}
	public void actionPerformed(ActionEvent e) {
		setBackground(color_fondo);
	}
	
}
}

