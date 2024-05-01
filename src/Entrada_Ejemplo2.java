import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("Nombre: ");
		
		String edad = JOptionPane.showInputDialog("Edad: ");
		
		int edad_int = Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre + ". Tienes " + (edad_int+1) + " años.");
	}

}
