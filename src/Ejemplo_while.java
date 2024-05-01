import javax.swing.*;

public class Ejemplo_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pass = "ciociano";
		
		while (pass.equals(JOptionPane.showInputDialog("Contraseña: ")) == false) {
		
			System.out.println("La contraseña es incorrecta. ");
		}
		
		System.out.println("Bienvenido. ");
	}

}
