import java.util.*;
import java.util.GregorianCalendar;

class coches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
neumatica[]mis_neumatica=new neumatica[3];
mis_neumatica[0]=new neumatica("saryer",234,1973,4,6);
mis_neumatica[1]=new neumatica("saryer", 234 ,1993,3,9);
mis_neumatica[2]=new neumatica("saryer");
for (int i=0;i<2;i++) {
	System.out.println(mis_neumatica[0].info_marca());
}
	}}
class neumatica{
	private String marca;
	private int Numero_serial;
	private Date fecha;
	public neumatica(String markt, int serial, int year , int month, int day) {
		Numero_serial=serial;
		marca=markt;
		GregorianCalendar calendario=new GregorianCalendar(year,month,day);
		fecha=calendario.getTime();}
	/*AQUI VENDRIA LA SOBRECARGA DE LOS CONSTRUCTORES AL CREAR UN SEGUNDO CONSTRUCTOR 
	 */
	public neumatica(String markt) {
		marca=markt;
	}
	
	
	public int info_numero_serial() {
		return Numero_serial;
	}
	public String info_marca() {
		return Numero_serial + marca + fecha;
	}
	public Date fecha() {
		return fecha;
	}
	

}
	


