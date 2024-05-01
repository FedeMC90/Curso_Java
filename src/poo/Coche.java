package poo;

public class Coche {
	
	private int ruedas;
	
	private int peso_plataforma;
	
	private int motor;
	
	private int largo;
	
	private int ancho;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	
	public Coche() {
		
		ruedas = 4;
		
		largo = 2000;
		
		ancho = 300;
		
		motor = 1600;
		
		peso_plataforma = 500;
	}
	
	public String datos_generales() {		//MÉTODO GETTER (Devuelve un valor)
		
		return "La plataforma tiene " + ruedas + " ruedas. Con un largo de " + largo/1000 + 
				" metros, un ancho de " + ancho + " cm y pesa " + peso_plataforma + " kg.";
	}
	
	public void establece_color(String color_coche) {		//MÉTODO SETTER (Graba un valor)
		
		color = color_coche;
	}
	
	public String dime_color() {
		
		return "El color del coche es " + color;
		
	}
	
	public void configura_asientos(String asientos_cuero) {		//SETTER
		
		if (asientos_cuero.equalsIgnoreCase("si")) 
			this.asientos_cuero = true;
		else
			this.asientos_cuero = false;
	}
	
	public String dime_asientos() {		//GETTER
		
		if (asientos_cuero) 
			return "Los asientos son de cuero.";
		else
			return "Los asientos no son de cuero.";
	}
	
	public void configura_climatizador(String climatizador) {	//SETTER
		
		if (climatizador.equalsIgnoreCase("si")) 
			this.climatizador = true;
		else
			this.climatizador = false;
	}
	
	public String dime_climatizador() {		//GETTER
		
		if (climatizador) 
			return "El coche tiene climatizador climatizador.";
		else
			return "El coche no tiene climatizador.";
	}
	
	public String dime_peso_coche() {	//SETTER Y GETTER
		
		int peso_carroceria = 500;
		
		peso_total = peso_carroceria + peso_plataforma;
		
		if (asientos_cuero) 
			peso_total = peso_total + 50;
		
		if (climatizador)
			peso_total = peso_total + 20;
		
		return "El peso total del coche es " + peso_total;
	}
	
	public int precio_coche() {		//GETTER
		
		int precio_total = 10000;
		
		if (asientos_cuero) 
			precio_total += 2000;
		
		if (climatizador)
			precio_total += 1500;
		
		return precio_total;
	}

}


