import java.util.Date;
import java.util.GregorianCalendar;

public class ClasesAbstractas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Persona[] lasPersonas=new Persona[2];
lasPersonas[0]=new Empleados2("luis conde " ,50000,2004,12,18);
lasPersonas[1]=new alumno("Ana Lopez ","Biologicas");
for(Persona p: lasPersonas) {
	System.out.println(p.dameNombre() +"" + p.dameDescripcion());
}
	}

}
abstract class Persona{
	private String nombre;
	public Persona(String nom) {
		nombre=nom;
	}
	public String dameNombre() {
		return nombre;
	}
	public abstract String dameDescripcion();
	
}
class Empleados2 extends Persona{
public Empleados2(String nom,double sue,int agno,int mes, int dia) {
	super(nom);
	
	sueldo=sue;
	GregorianCalendar calendario=new GregorianCalendar(agno,mes,dia);
	fecha=calendario.getTime();
	++IDsiguiente;
	id=IDsiguiente;
}
public String dameDescripcion() {
	return "Este empleado tiene un id : " + id +"y tiene un sueldo de : " + sueldo; 
}
public double dameSueldo() {
	return sueldo;
}
public Date dameFecha() {
	return fecha;
}
public void subeSueldo(double porcentaje) {
	double aumento=sueldo*porcentaje/100;
}

private double sueldo;
private Date fecha;
private static int IDsiguiente;
private int id;

}
class alumno extends Persona{
	private String carrera;
	public alumno(String nom, String car) {
		super(nom);
		carrera=car;
	}
	public String dameDescripcion() {
		return "Este alumno esta estudiando la carrera : " + carrera;
	}
}
	
	
	
	
	
	