package NS_1;

public class implementandoNodo {
public static void main(String[]args) {
	String persona1="Ariel";
	String persona2="Pedro";
	String persona3="Kifa";
	String persona4="Juan";
	String persona5="Pablo";
	 
	
	Nodo n1=new Nodo(persona1);
	Nodo n2=new Nodo(persona2);
	Nodo n3=new Nodo(persona3);
	Nodo n4=new Nodo(persona4);
	Nodo n5=new Nodo(persona5);
	
	n1.setSiguiente(n2);
	n2.setSiguiente(n3);
	n3.setSiguiente(n4);
	n4.setSiguiente(n5);
	
	Nodo aux=n1;
	
	for(int i=0;i<5;i++) {
		String aux2=(String)aux.getContiene();
		System.out.println(aux2);
		aux=aux.getSiguiente();
	}
}
}
