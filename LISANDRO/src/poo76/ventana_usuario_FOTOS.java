package poo76;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
public class ventana_usuario_FOTOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

laclase llaka=new laclase();
llaka.setVisible(true);
llaka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

}
class laclase extends JFrame{
	public laclase() {
		setTitle("FUTURE");
		setSize(500,300);
		setLocation(500,300);
		nevo hola=new nevo();
		add(hola);
		hola.setBackground(Color.pink);
	} 
}
class nevo extends JPanel{
	private Image imagen;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		File mifile=new File("src/poo76/ww.png");
		try {
		imagen=ImageIO.read(mifile);
		}
		catch(IOException e) {
			System.out.println("la imagen no ha podido econtrarse");
		}
		int anchura=imagen.getWidth(this);
		int altura=imagen.getHeight(this);
		g.drawImage(imagen,0,0,null);
		for(int i=0;i<500;i++) {
			for(int j=0;j<300;j++) {
				g.copyArea(0,0,anchura,altura,anchura*i,altura*j);		
			}
		}
		
	}
}

