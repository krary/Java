package poo76;
import javax.swing.*;

import java.awt.GraphicsEnvironment.*;
import java.util.*;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
public class Repaso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//CODING EVERY DAY AND EVERY TIME DONT GET IT AWAY HOLD ON YOUR MIND AND YOUR HEART PLEASE STAND UP AND FOCUS
		
		nombre nombre3=new nombre();
		nombre3.setVisible(true);
		nombre3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	
	
	}}

class nombre extends JFrame{
	public nombre() {
		setTitle("otra ventana");
		setSize(500,300);
		setLocation(500,300);
		nombre1 nombre2=new nombre1();
		add(nombre2);
		nombre2.setBackground(Color.red);
			}
}
class nombre1 extends JPanel implements ActionListener{
	JButton boton1=new JButton("#1");
	JButton boton2=new JButton("#2");
	JButton boton3=new JButton("#3");
public nombre1() {
	add(boton1);
	add(boton2);
	add(boton3);
boton1.addActionListener(this);
boton2.addActionListener(this);
boton3.addActionListener(this);

}

public void actionPerformed(ActionEvent w) {
	Object miobjeto=w.getSource();
    if(miobjeto==boton1) {
    	setBackground(Color.BLACK);
    }
    else if(miobjeto==boton2) {
    	setBackground(Color.cyan);
    }
    else {
    	setBackground(Color.DARK_GRAY);
    }
}
}
	










