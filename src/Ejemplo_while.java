import javax.swing.*;

public class Ejemplo_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pass = "ciociano";
		
		while (pass.equals(JOptionPane.showInputDialog("Contrase�a: ")) == false) {
		
			System.out.println("La contrase�a es incorrecta. ");
		}
		
		System.out.println("Bienvenido. ");
	}

}
