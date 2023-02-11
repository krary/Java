import java.lang.*;
public class uso_coche {

	private int placa;
	private boolean asientos_cueros;
	
public uso_coche() {
	placa=2133;
	asientos_cueros=asientos_cueros;
	}
public void info_asientos(String asientos_cueros) {
	if (asientos_cueros=="si") {
		this.asientos_cueros=true;}
	else {
		this.asientos_cueros=false;
	}}
public String info_general(String asientos_cueros) {
	if (this.asientos_cueros) {
		return "EL COCHE TIENE UNA PLACA DE " + placa + "Y SI TIENE ASIENTOS DE CUERO PUES EL COCHE SI TIENE ASIENTOS DE CUERO";
	}
	else {
		return "EL COCHE TIENE UNA PLACA DE " + placa + "Y SI TIENE ASIENTOS DE CUERO EL COCHE NO TIENE ASIENTOS DE CUERO";
	}
}

}
