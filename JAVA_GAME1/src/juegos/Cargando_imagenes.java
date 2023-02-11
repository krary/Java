package juegos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Cargando_imagenes {

	public static BufferedImage cargadorim(String path) {
		try {
			return ImageIO.read(Cargando_imagenes.class.getResource(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	}


