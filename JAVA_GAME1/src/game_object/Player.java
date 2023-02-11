package game_object;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import input.KeyBoard;
import mathem.vectores;

public class Player extends game_object {

	public Player(vectores position, BufferedImage textura) {
		super(position, textura);
		// TODO Auto-generated constructor stub
	}

	
	public void update() {
	if(KeyBoard.LEFT) {
		position.setX(position.getX() + 1);	
	}
		
		
	}

	
	public void drawing(Graphics g) {
	
		g.drawImage(textura,(int)position.getX(),(int)position.getY(),null);
	}

}
