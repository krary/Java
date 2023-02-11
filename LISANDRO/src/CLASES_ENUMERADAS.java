import java.util.*;
public class CLASES_ENUMERADAS {
enum Talla{
	MINI("S"),MEDIANA("M");
	private Talla(String letra) {
		this.letra=letra;
		
	}
	public String info() {
		return letra;
	}
	private String letra;
};
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner entrada=new Scanner(System.in);
	System.out.println("elija la talla MINI O MEDIANA");
	String entrada1=entrada.next().toUpperCase();
	Talla talla=Enum.valueOf(Talla.class, entrada1);
	System.out.println("talla = " + talla);
	System.out.println("la letra es " + talla.info());}

}
