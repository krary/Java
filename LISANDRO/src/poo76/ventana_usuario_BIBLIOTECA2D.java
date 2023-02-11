package poo76;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;

public class ventana_usuario_BIBLIOTECA2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miclase3 miclase1=new miclase3();
		miclase1.setVisible(true);
		miclase1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

}
class miclase3 extends JFrame{
	public miclase3() { 
		setSize(600,450);
		setLocation(400,200);
		setTitle("mine window");
		Lamina2 milamina=new Lamina2();
		add(milamina);
	}
}
class Lamina2 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
    Graphics2D g2=(Graphics2D) g; //AQUI REFUNDIMOS LA CLASE GRAPHICS G EN GRAPHICS2D
    Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
    g2.draw(rectangulo);
    
    Ellipse2D elipse=new Ellipse2D.Double();
    elipse.setFrame(rectangulo);
    g2.draw(elipse); 
    g2.draw(new Line2D.Double(100,100,300,250));
    
    double mix=	rectangulo.getCenterX();
    double miy=rectangulo.getCenterY();
    double radio=150;
    Ellipse2D circulo= new Ellipse2D.Double();
    circulo.setFrameFromCenter(mix, miy, mix + radio, miy + radio);
    g2.draw(circulo);
	}
	
}
