
public class final_constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Empleado Empleado1=new Empleado("nabucodonosor");
Empleado1.asign("programador");
Empleado Empleado2=new Empleado("levathian");
Empleado2.asign("tecnico en hardware");
System.out.println(Empleado1.datos());
System.out.println(Empleado2.datos());
	}

}
class Empleado{
	private String name;
	private String Estado;
	private static int id=1;
	private int adds;
	
	
	
	public Empleado(String nombre) {
		name=nombre;
		Estado="Administracion";
		adds=id;
		id++;
		
		
		
		
	}
	public void asign(String Estado) {
		this.Estado=Estado;
	}
	public String datos() {
		return "el trabajador " + name + " pertenece a la seccion " + Estado + "y el id es " + adds;
	}
}
