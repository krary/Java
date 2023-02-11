package PaintComponent;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class graficos_8_DegradadoLineal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
kk kk1=new kk();
kk1.setVisible(true);
kk1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

}
class kk extends JFrame{
	public kk() {
		setSize(700,700);
		setLocationRelativeTo(null);
		aars aa1=new aars();
		add(aa1);
		aa1.setBackground(Color.DARK_GRAY);
	}
}
class aars extends JPanel{
public aars() {
	
}
public void paint(Graphics g) {
	super.paint(g);
	Graphics2D gg=(Graphics2D) g;
	GradientPaint bb=new GradientPaint(0,0,Color.red,50,50,Color.blue,true);
	gg.setPaint(bb);
	
	gg.fillRect(100,100,100,100);
	gg.fillRect(300,100,100,100);
	gg.setColor(Color.green);
	gg.drawArc(100,292,300, 300, 0,180);
	gg.drawRect(60, 10, 400, 500);
	
	
	Point2D punto=new Point2D.Float(50,50);
	float radio=50;
	Point2D foco=new Point2D.Float(50,50);
	float[] distribucion= {0.f,0.5f,1.0f};
	Color[] colores= {Color.red,Color.white,Color.orange};
	RadialGradientPaint radial=new RadialGradientPaint(punto,radio,foco,distribucion,colores,CycleMethod.REPEAT);
	gg.setPaint(radial);
	gg.fillRect(0,0,getWidth(),getHeight());
	
	
}
}