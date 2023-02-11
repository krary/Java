package juegos;

import java.util.Scanner;

public class Entrada_Correo {
	public static void main(String []args) {
	
		Entrada_Correo jj=new Entrada_Correo();
		jj.metodo();
	
	
	

	}
	public void metodo()  {
		String clave="jj";
		boolean ciclo=false;
		while(!ciclo) {
			Scanner test=new Scanner(System.in);
			System.out.println("Escribe tu clave para entrar en el correo");
			String clave1=test.nextLine();
		
			if(clave1.length()<23) {
				
			
	int g=9,m=8,a=7,i=6,l=5,p=4,c=3,o=2,mm=1;
	if(clave1.charAt(clave1.length()-g)=='g'
	&&clave1.charAt(clave1.length()-m)=='m'
	&&clave1.charAt(clave1.length()-a)=='a'
	&&clave1.charAt(clave1.length()-l)=='l'
	&&clave1.charAt(clave1.length()-p)=='.'
	&&clave1.charAt(clave1.length()-c)=='c'
	&&clave1.charAt(clave1.length()-o)=='o'
	&&clave1.charAt(clave1.length()-mm)=='m'){
	int numero=clave1.length()-9;
	int contador=0;
	for(int w=0;w<numero;w++) {
		contador++;
	if(clave1.charAt(w)=='.') {
		contador--;
		System.out.println("Caracter no soportado");
		
		w=25;
		}
	else if(clave1.charAt(w)=='@') {
		contador--;
		System.out.println("Caracter no soportado");
		w=25;}
	
	}if(contador==numero) {
		System.out.println("Su Clave ha sido Registrada con Exito");
		ciclo=true;
	}
	
		
	}}
	
			if(clave1.length()>23) {
				System.out.println("Demasiados caracteres\n"+"Debe de elejir entere 8 a 23 caracteres");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
