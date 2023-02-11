package state;

import java.awt.Graphics;

import game_object.Player;
import juegos.Assets;
import mathem.vectores;

public class ESTADO_JUEGO {
	private Player player;
public ESTADO_JUEGO() {
	player=new Player(new vectores(100,500),Assets.player);
	
}
public void update() {
	
}
public void drawing(Graphics g)
{  player.drawing(g);
	}
}
