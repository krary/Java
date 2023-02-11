package poo74;
import java.lang.*;

import java.util.Arrays;

public class ENSAYO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
lisandro[] lisandros=new lisandro [4];
lisandros[0]=new lisandro ("Carlos",23);
lisandros[1]=new lisandro ("Jose",43);
lisandros[2]=new lisandro ("Jose luis",46);
lisandro jefe=new lisandro1("walter",65);
lisandros[3]=jefe;
lisandro1 cast = (lisandro1) lisandros[3];
System.out.println("La prima del jefe es de :" + " "+ cast.establece_bonus(3000));

System.out.println(cast.tomar_decision("dar mas dias de vacaciones"));




    //System.out.println(jefe.)

	for (lisandro e: lisandros) {
		System.out.println(e.dameNombre() + " " + e.dameEdad());}
	}

}
class lisandro implements Comparable,bonus{
	public double establece_bonus(double gratificacion) {
		
		return bonus.bonus_base+gratificacion;
	}
	public int compareTo(Object info) {
		lisandro variable_definitiva=(lisandro) info;
		if (this.age<variable_definitiva.age) {
			return 1;
		}
		if (this.age>variable_definitiva.age) {
			return -1;
		}
		return 0;
	}
	
	private String nombre;
	private int age;
	public lisandro(String nom, int edad) {
		nombre=nom;
		age=edad;
	}
	public String dameNombre() {
		return nombre;
	}
	public int dameEdad() {
		return age;
	}
}
class lisandro1 extends lisandro implements jefes{
	public String tomar_decision(String decision) {
		return "UN MIEMBRO HA TOMADO LA DECISIONE" + decision;
	}
	
	public lisandro1(String nom, int edad) {
		super(nom, edad);
		
	}
	
	
	public double establece_bonus(double gratificacion) {
		double prima=100;
		return bonus.base + gratificacion+prima;
	}
	
	}
	

