package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("Jorge");
		Empleados trabajador2 = new Empleados("Mirta");
		Empleados trabajador3 = new Empleados("Roque");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.cambia_seccion("RRHH");
		//trabajador2.cambia_nombre("Fabian");	
		//Cambiar el nombre de un empleado no debería ser posible. Para eso defino el campo "nombre" 
		//como *final*.
		
		System.out.println(trabajador1.devuelve_datos() + "\n" + trabajador2.devuelve_datos() + "\n"
				+ trabajador3.devuelve_datos() + "\n" + trabajador4.devuelve_datos() + "\n");
		
		System.out.println(Empleados.dameIdSiguiente());
		
	}

}

class Empleados {
	
	private final String nombre;
	
	private String seccion;
	
	private int id;
	
	private static int idSiguiente = 1;
	
	public Empleados (String nombre) {	//constructor
		
		this.nombre = nombre;
		
		seccion = "Administracion";
		
		id = idSiguiente;
		
		idSiguiente++;
		
	}
	

	public void cambia_seccion (String seccion) {	//setter
		
		this.seccion = seccion;
		
	}
	
	public String devuelve_datos ()	{	//getter
		
		return "Nombre: " + nombre + " Seccion: " + seccion + " ID: " + id;
	}
	
	/*public void cambia_nombre(String nombre) {
		this.nombre = nombre;
		//He definido el campo "nombre" como *final* para que no pueda ser modificado.
	}*/
	
	public static String dameIdSiguiente() {
		
		return "El IdSiguiente es: " + idSiguiente;
	}
}