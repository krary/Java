package ENSAYO;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class BUFFERIM {
	public static BufferedImage nuevo(String path) {
		try {
			return ImageIO.read(BUFFERIM.class.getResource(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
