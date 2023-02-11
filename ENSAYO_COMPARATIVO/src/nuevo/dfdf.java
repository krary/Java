package nuevo;

import javax.swing.JFrame;

public class dfdf {
public static void main(String []args) {
objetos oo=new objetos(4);
oo.agregarObjeto(new ficha("maria",23));
oo.agregarObjeto(new ficha("jose",45));
oo.agregarObjeto(new ficha("hamel",23));
oo.agregarObjeto(new ficha("daria",46));
ficha ff=(ficha)oo.devuelveObjetos(0);
System.out.println(ff.info());

}
}
//A CONTINUACION VIENE LA CLASE QUE CONTIENE TODOS LOS TIPOS DE OBJETOS
//DICHA CLASE VA A TENER DO METODOS 
//:EL METODO QUE ASIMILA EL OBJETO EN UN ARRAYS DE OBJETO
//:EL METODO QUE DEVUELVE LO QUE HA SUBSIONADO 
class objetos{
	private Object  [] o;
	private int estadoInicial=0;
	public objetos(int cantidadArrays) {
		o=new Object[cantidadArrays];
	}
	public void agregarObjeto(Object objetos) {

		o[estadoInicial]=objetos;
		estadoInicial++;
	}
	public Object devuelveObjetos(int estadoInicial) {
		return o[estadoInicial];
	}
}
class ficha{
	private int edad;
	private String nombre;
	public ficha(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	public String info() {
		return nombre+edad;
	}
}
class frame extends JFrame{
	public frame() {
		setSize(700,700);
		setLocationRelativeTo(null);
	panel panel1=new panel();
	add(panel1);
	}
}