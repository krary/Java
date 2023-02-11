package POO;
import java.lang.*;
import java.util.*;


public class CAR {
	private double ancho;
	private int puertas;
	private boolean asientos_cueros;
	
	
public CAR() {
	ancho=34;
	puertas=4;
	asientos_cueros=asientos_cueros;
	
	
	
}
public void asientos(String asientos_cueros) {
	if (asientos_cueros=="si") {
		this.asientos_cueros=true;
	}
	else {
		this.asientos_cueros=false;
	}
}
public String info_asientos_cueros() {
	if(asientos_cueros==true) {
		return "El coche tiene asientos de cuero";
	}
	else {
		return "El coche no tiene asientos de cuero";
	}
}
public String info_general() {
	
		return "\n EL COCHE POSEE UN ANCHO DE : " + ancho + "\n PUERTAS " + puertas ;  
	
}

}
