package poo;

import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
/*		
		Coche Renault = new Coche(); //INSTANCIAR UNA CLASE O EJEMPLARIZAR DE CLASE 
		
		Renault.establece_color(JOptionPane.showInputDialog("Introduce color del coche: "));
		
		Renault.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		
		Renault.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
		
		System.out.println(Renault.datos_generales());
		
		System.out.println(Renault.dime_color());
		
		System.out.println(Renault.dime_asientos());
		
		System.out.println(Renault.dime_climatizador());
		
		System.out.println(Renault.dime_peso_coche());
		
		System.out.println("El precio del coche es " + Renault.precio_coche());
*/		
	
		Coche micoche1 = new Coche();
		
		micoche1.establece_color("rojo");
		
		Furgoneta mifurgoneta1 = new Furgoneta(7, 500);
		
		mifurgoneta1.establece_color("azul");
		mifurgoneta1.configura_asientos("si");
		mifurgoneta1.configura_climatizador("si");
		
		System.out.println(micoche1.datos_generales() + " " + micoche1.dime_color());
		
		System.out.println(mifurgoneta1.datos_generales() + " " + mifurgoneta1.dimeDatosFurgoneta() +
				"\n" + mifurgoneta1.dime_color());
	}

}
