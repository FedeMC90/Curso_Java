import javax.swing.*;

public class Ejemplo_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pass = "ciociano";
		
		while (pass.equals(JOptionPane.showInputDialog("Contraseņa: ")) == false) {
		
			System.out.println("La contraseņa es incorrecta. ");
		}
		
		System.out.println("Bienvenido. ");
	}

}
