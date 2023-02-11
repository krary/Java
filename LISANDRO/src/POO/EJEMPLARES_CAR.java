package POO;

public class EJEMPLARES_CAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CAR Renault =new CAR();
Renault.asientos("si");
System.out.println(Renault.info_asientos_cueros());
System.out.println(Renault.info_general());
HERENCIA_CAR furgoneta=new HERENCIA_CAR(1213,5);
System.out.println(furgoneta.info_general());
System.out.println(furgoneta.dime_DatosHerencia());
	}

}
