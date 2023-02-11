import java.util.*;
public class hola {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Jefatura jefe_RRHH=new Jefatura("Juan",55000,2006,9,26);
	jefe_RRHH.estableceIncentivo(2570);
	Empleados[] misEmpleados=new Empleados[6];
	misEmpleados[0]=new Empleados("Ana",2000,20000,07,07);
	misEmpleados[1]=new Empleados("Carlos",1995,50000,06,15);
	misEmpleados[2]=new Empleados("Paco",25000,2002,9,25);
	misEmpleados[3]=new Empleados("Antonio",47500,2009,11,9);
	misEmpleados[4]=jefe_RRHH;
	misEmpleados[5]=new Jefatura("Maria",95000,1999,5,26);
	Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
	jefa_Finanzas.estableceIncentivo(5000);


		for(Empleados e:misEmpleados) {
			e.subeSueldo(5);
		}
		for(Empleados e: misEmpleados) {
			
			System.out.println("Nombre : " + e.dameNombre()
			+ "Sueldo : " + e.dameSueldo()
			+ "Fecha de alta : " + e.dameFecha());
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
public Empleados(String nom) {
	this(nom,3000,2000,01,1);
	
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
class Jefatura extends Empleados{
	public Jefatura(String nom,double sue,int agno,int mes, int dia) {
		super(nom, sue,agno,mes,dia);
	}
	public void estableceIncentivo(double b) {
		 incentivo=b;
	}
	public double dameSueldo() {
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe + incentivo;
	
	}
	private double incentivo;
}

	
	


