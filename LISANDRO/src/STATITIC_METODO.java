import java.util.*;
import javax.swing.*;
public class STATITIC_METODO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
trabajador[] mis_trabajadores=new trabajador[3];
mis_trabajadores[0]=new trabajador("federico","lopez",1973,4,28);
mis_trabajadores[1]=new trabajador("alberto","perez",1998,6,2);
mis_trabajadores[2]=new trabajador("yosdriel","rodriguez",1973,12,2);
System.out.println(mis_trabajadores[0].info_general());
System.out.println(mis_trabajadores[1].info_general());
System.out.println(mis_trabajadores[2].info_general());	
	}}

class trabajador{
	private String nombre;
	private String Apellidos;
	private Date fecha_inicio;
	private int id;
	public static int ID=1;
	public trabajador(String nom,String Ape,int year, int month, int day) {
		nombre=nom;
		Apellidos=Ape;
		GregorianCalendar fechas=new GregorianCalendar(year,month,day);
		fecha_inicio=fechas.getTime();
		id=ID;
		ID++;
		
	}
	
	public String info_general() {
		return "EL TRABAJADOR " + nombre + Apellidos + "COMENZO A TRABAJAR EN LA FECHA DE " + fecha_inicio + "su id es de " + "=" + id;
	}
	
	
	
	
	
	
	
	
}