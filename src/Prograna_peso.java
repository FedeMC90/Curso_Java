import javax.swing.*;
public class Prograna_peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero = "";
		double peso=0;
		
		do {
			genero = JOptionPane.showInputDialog("Ingrese género: ");
		} while (!genero.equalsIgnoreCase("mujer") && !genero.equalsIgnoreCase("hombre"));
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en cm: "));
		
		if (genero.equalsIgnoreCase("hombre"))
			peso = altura - 110;
		else
			peso = altura - 120;
		
		System.out.println("Tu peso ideal es " + peso);
	}

}
