package game_object;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import mathem.vectores;

public abstract class game_object {
protected BufferedImage textura;
protected vectores position;
public game_object(vectores position,BufferedImage textura) {
	this.position=position;
	this.textura=textura;
}
public abstract void update();
public abstract void drawing(Graphics g);
public vectores getPosition() {
	return position;
}
public void setPosition(vectores position) {
	this.position = position;
}

}
