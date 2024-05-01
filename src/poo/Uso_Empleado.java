package poo;

import java.util.*;

import javax.swing.JOptionPane;

//Clase principal
public class Uso_Empleado {
	
		public static void main(String[] args) {
/*			
		String nombre;
		Double sueldo;
		int a�o, mes, dia;
*/
		Jefatura jefe_RRHH = new Jefatura("Sebastian", 104000, 2005, 12, 30);
		
		jefe_RRHH.estableceIncentivo(20000);
			
		Empleado[] misEmpleados = new Empleado[6];
/*
		for (int i=0; i<3; i++) {
			
			nombre 	= JOptionPane.showInputDialog("Nombre: ");
			sueldo 	= Double.parseDouble(JOptionPane.showInputDialog("Sueldo: "));
			a�o		= Integer.parseInt(JOptionPane.showInputDialog("A�o de ingreso: "));
			mes		= Integer.parseInt(JOptionPane.showInputDialog("Mes de ingreso: "));
			dia		= Integer.parseInt(JOptionPane.showInputDialog("Dia de ingreso: "));
						
			MisEmpleados[i] = new Empleado(nombre, sueldo, a�o, mes, dia);
			
			MisEmpleados[i].sube_sueldo(5);
		}
*/
		misEmpleados[0] = new Empleado("Carlos", 50000, 2014, 04, 02);
		misEmpleados[1] = new Empleado("Martin", 45000, 2002, 02, 15);
		misEmpleados[2] = new Empleado("Maria", 62000, 2020, 07, 10);
		misEmpleados[3] = new Empleado("Martin");
		misEmpleados[4] = jefe_RRHH;	//polimorfismo
		misEmpleados[5] = new Jefatura("Gabriela", 95000, 1999, 10, 5);
		
		/******* PRINCIPIO DE SUSTITUCION PARA INSTANCIAR INTERFACES *******/
		
		Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 06, 05);

		Comparable ejemplo = new Empleado("Fabian", 75000, 2010, 12, 30);
		
		if (director_comercial instanceof Empleado)
			System.out.println("Es de tipo Jefatura");
		
		if (ejemplo instanceof Comparable)
			System.out.println("Implementa la interfaz comparable");
		
		/*******************************************************************/
		
		Jefatura jefa_finanzas = (Jefatura)misEmpleados[5];
		jefa_finanzas.estableceIncentivo(20000);
		
		//ordena el array de manera ascendente 
		Arrays.sort(misEmpleados);
		
		System.out.println(jefa_finanzas.tomar_decisiones("Dar mas dias de vacaciones"));
		
		/**** PRUEBA DE METODOS DEFINIDOS EN LA INTERFAZ ****/
		System.out.println("El jefe " + jefa_finanzas.dame_nombre() + " tiene un bonus de " +
				jefa_finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dame_nombre() + " recibe un bonus de " + 
				misEmpleados[3].establece_bonus(200));
		/****************************************************/
		
		//aumento de sueldo e impresion
		for (Empleado e: misEmpleados) {	//FOR EACH o FOR MEJORADO (OBJETO + VARIABLE + ARRAY)
			
			e.sube_sueldo(5);
			
			System.out.println("Nombre: " + e.dame_nombre() + " Sueldo: " 
					+ e.dame_sueldo() + " Fecha de alta: " + e.dame_fecha_alta());
		}
	}
	
}

class Empleado implements Comparable, Trabajadores {
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	//constructor
	public Empleado(String nom, double sue, int ano, int mes, int dia) {
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
	}
	
	public Empleado(String nom) {
		
		this(nom, 30000, 2000, 01, 01);
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base + gratificacion;
		
	}
	
	public String dame_nombre() {
		
		return nombre;
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
	
	//metodo abstracto obligatorio para utilizar la instruccion sort de la clase Arrays
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if (this.sueldo < otroEmpleado.sueldo)
			return -1;
		else
			if (this.sueldo == otroEmpleado.sueldo)
				return 0;
			else
				return 1;
			
	}
}

class Jefatura extends Empleado implements Jefes {
	
	private double incentivo;
	
	//constructor
	public Jefatura (String nom, double sue, int ano, int mes, int dia) {
		
		super(nom, sue, ano, mes, dia);
	}
	
	//metodo abstracto heredado de la interfaz Jefes
	public String tomar_decisiones(String decision) {
		
		return "La direccion ha tomado la decision de: " + decision;
		
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima = 2000;
		
		return Trabajadores.bonus_base + gratificacion + prima;
		
	}
	
	//seter
	public void estableceIncentivo(double b) {
		
		incentivo = b;
	}
	
	//geter
	public double dame_sueldo() {
		
		double SueldoJefe = super.dame_sueldo();
		
		return SueldoJefe + incentivo;
		
	}
}
