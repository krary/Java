package poo74;
import java.util.*;

public class Enumm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Talla s=Talla.MINI;
Talla m=Talla.MEDIANA;
Talla l=Talla.GRANDE;
Talla xl=Talla.MUY_GRANDE;*/
	Scanner Entrada=new Scanner(System.in);
	System.out.println("Escribe una talla : MINI, MEDIANO, GRANDE,MUY GRANDE");
	String Entrada_datos=Entrada.next().toUpperCase();
	Talla mitalla=Enum.valueOf(Talla.class, Entrada_datos);
	System.out.println("LA TALLA ES : " + Entrada_datos);
	System.out.println("LA LETRA PERTENECE A : " + mitalla.dameLetra());
}}

//enum Talla {MINI, MEDIANA,GRANDE,MUY_GRANDE};
enum Talla {MINI("s"), MEDIANA("m"),GRANDE("l"),MUY_GRANDE("xl");
     private Talla(String letra) {
    	 this.letra=letra;
     }
     private String letra;
     public String dameLetra() {
    	 return letra;
     }
}