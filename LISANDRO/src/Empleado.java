import java.util.Date;
import java.util.GregorianCalendar;



public class Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados[] misEmpleados=new Empleados[4];
		misEmpleados[0]=new Empleados("Ana",2000,20000,07,07);
		misEmpleados[1]=new Empleados("Carlos",1995,50000,06,15);
		misEmpleados[2]=new Empleados("Paco",25000,2002,9,25);
		misEmpleados[3]=new Empleados("Antonio",47500,2009,11,9);

			for(Empleados e:misEmpleados) {
				e.subeSueldo(5);
			}
			

	}

}
class Empleados{
	public Empleados(String nom,double sue,int agno,int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno,mes,dia);
		fecha=calendario.getTime();
		++IDsiguiente;
		id=IDsiguiente;
	}
	public String dameNombre() {
		return nombre + "ID : " + id;
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
	private String nombre;
	private double sueldo;
	private Date fecha;
	private static int IDsiguiente;
	private int id;
	
}


