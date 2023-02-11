package PaintComponent;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class graficos_4_Triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
tt tt1=new tt();
tt1.setVisible(true);
tt1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class tt extends JFrame{
	public tt() {
		setSize(700,700);
		setLocationRelativeTo(null);
		setResizable(false);
		occa occa1=new occa();
		add(occa1);
		occa1.setBackground(Color.DARK_GRAY);
	}
	
}
class occa extends JPanel{
	public occa() {
		
	}public void paint(Graphics g) {
		super.paint(g);
		int[] x= {102,20,200};
		int[] y= {22,297,300};
		g.setColor(Color.green);
		g.fillPolygon(x,y,3);
		int[] xx= {300,300,400};
		int[] yy= {19,300,300};
		g.setColor(Color.blue);
		g.fillPolygon(xx,yy,3);
		
		int[] c= {47,100,200,300,400};
		int[]d= {597,400,600,400,600};
		g.setColor(Color.green);
		g.drawPolyline(c,d,5);
		
		int []cc= {500,539,600,465,625,500};
		int []dd= {600,463,600,521,516,600};
		g.fillPolygon(cc,dd,6);
		
	}
	
}
  