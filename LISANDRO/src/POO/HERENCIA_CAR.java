package POO;

public class HERENCIA_CAR extends CAR {
	private int capacidad_extra;
	private int plazas_extra;
public HERENCIA_CAR(int capacidad_extra,int plazas_extra) {
	super();
	this.capacidad_extra=capacidad_extra;
	this.plazas_extra=plazas_extra;
	
}
public String dime_DatosHerencia() {
	return "\n La capacidad extra de la furgo es de " + capacidad_extra + "\n Las plazas extra de la furgo es de " + plazas_extra;
}


}
