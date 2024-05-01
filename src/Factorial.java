import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
		int i, fact = 1;
		
		for (i = num; i > 0; i--) {
			fact = fact * i;
		}
		
		System.out.println("El factorial de " + num + " es " + fact);
	}

}
