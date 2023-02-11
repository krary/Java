package nuevo;

import java.util.Scanner;

public class hkjh {
public static void main(String []args) {
 int s;
 Scanner numero=new Scanner(System.in);
 System.out.println("Escribe el numero de arrays de el Elemento");
 String info=numero.nextLine();
 s=Integer.parseInt(info);
	int elementos[]=new int[s];
	for(int i=0;i<elementos.length;i++) {
		Scanner numeros=new Scanner(System.in);
		System.out.println("Escriba ahora el valor de cada Elemento");
		String info1=numeros.nextLine();
		int info2=Integer.parseInt(info1);
		elementos[i]=info2;
		
				
	}
	for(int i=0;i<elementos.length ;i++) {
		System.out.println(elementos[i]);
	}
}
}
