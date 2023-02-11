package poo74;
import java.util.*;
import java.lang.*;

public class Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmpleadosAumentos aumentos=new EmpleadosAumentos("Marcos",1300,2000,4,9);
aumentos.dameAumento(300);
Empleados[]misEmpleados=new Empleados[5];
misEmpleados[0]=new Empleados("Maria",3000,2000,03,15);
misEmpleados[1]=new Empleados("Alberto",1000,2001,03,15);
misEmpleados[2]=new Empleados("Jessica",15000,2000,05,15);
misEmpleados[3]=new Empleados("Claudio",20000,2010,12,15);
misEmpleados[4]=aumentos;


       Arrays.sort(misEmpleados);
	for(Empleados e: misEmpleados) {
		System.out.println(e.dameNombre() +  "Salario : " + e.dameSueldo()
		+ " " + "Fecha alt : " + " " + e.dameFecha());
	}
	}

}
class Empleados implements Comparable{
    public int sueldo;
	private String nombre;	
	private Date fecha;
	private static int idsiguiente;
	private int ID;
	
	public int compareTo(Object miObjeto) {
    	Empleados otroEmpleado=(Empleados) miObjeto;
    	if (this.sueldo<otroEmpleado.sueldo) {
    		return -1;
    	}
    	if(this.sueldo>otroEmpleado.sueldo) {
    		return 1;
    	}
   return 0;
    }
	
	
public Empleados(String nom, int sue, int agno ,int mes , int dia) {
	nombre=nom;
	sueldo=sue;
	GregorianCalendar calendario=new GregorianCalendar(agno,mes,dia);
	fecha=calendario.getTime();
	++ID;
	idsiguiente=ID;}

public String dameNombre() {
	return nombre +  "ID: " + ID + " "; 
}
public int dameSueldo() {
	return sueldo;
}
public Date dameFecha() {
	return fecha;
}
}
class EmpleadosAumentos extends Empleados{
	private int aumento;

	public EmpleadosAumentos(String nom,int sue,int agno,int mes, int dia) {
		
		super(nom, 1000,2000,4,15);
		
	}
	
public void dameAumento (int b) {
	aumento=b;
}
public int dameaumento() {
	int sueldo=super.dameSueldo();
	return sueldo + aumento/100;
}
	
	
	
}
	
	
	