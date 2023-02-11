package poo76;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.*;
import javax.swing.*;

public class ventana_usuario2_Toolkit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
miclase miclase1=new miclase();
miclase1.setVisible(true);
miclase1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class miclase extends JFrame{
	public miclase() {
Toolkit mitoolkit=Toolkit.getDefaultToolkit();
Dimension midimension=mitoolkit.getScreenSize();
int alturaPantalla=midimension.height;
int anchoPantalla=midimension.width;
setSize(alturaPantalla/2, anchoPantalla/2);
setLocation(alturaPantalla/5, anchoPantalla/5);

	}
}