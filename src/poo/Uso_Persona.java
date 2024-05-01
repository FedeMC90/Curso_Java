package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] misPersonas = new Persona[2];
		
		misPersonas[0] = new Empleado2("Marcos", 50000, 2000, 5, 15);
		misPersonas[1] = new Alumno("Federico", "psicolog�a");
		
		for (Persona e:misPersonas) {
			
			System.out.println(e.dameNombre() + " " + e.dameDescripcion());
			
		}

	}

}

abstract class Persona {
	
	private String nombre;
	
	public Persona(String nom) {
		
		nombre = nom;
		
	}
	
	public String dameNombre() {
		
		return nombre;
		
	}
	
	public abstract String dameDescripcion();
}

class Empleado2 extends Persona {
	
	private double sueldo;
	
	private Date altaContrato;
	
	private int Id;
	
	private static int IdSiguiente;
	
	public Empleado2(String nom, double sue, int ano, int mes, int dia) {
		
		super(nom);
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		++IdSiguiente;
		
		Id = IdSiguiente;
		
	}
	
	public double dame_sueldo() {
		
		return sueldo;
	}
	
	public Date dame_fecha_alta() {
		
		return altaContrato;
	}
	
	public void sube_sueldo(double porcentaje) {
		
		double aumento = sueldo * porcentaje/100;
		
		sueldo += aumento;
	}
	
	public String dameDescripcion() {
		
		return "Este empleado tiene un Id = " + Id + " con un sueldo = " + sueldo;
		
	}
}

class Alumno extends Persona {
	
	private String carrera;
	
	public Alumno(String nom, String car) {
		
		super(nom);
		
		carrera = car;
		
	}
	
	public String dameDescripcion() {
		
		return "Este alumno est� en la carrera de: " + carrera;
		
	}
	
}