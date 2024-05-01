import javax.swing.*;
import java.util.*;
public class Ejemplo_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double area = 0;
		int altura = 0, base = 0;
		String figura="";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("De qu� figura quiere averiguar el �rea: \n 1) Cuadrado \n 2) Rect�ngulo \n 3) Tri�nculo \n 4) C�rculo");
		
		int opcion = entrada.nextInt();
		
		switch (opcion) {
			case 1 :
			
				figura = "cuadrado";
				
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida del lado: "));
				
				area = Math.pow(lado, 2);
			
			break;
			
			case 2 :
				
				figura = "rect�ngulo";
								
				altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida de la altura"));
				base   = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida de la base"));
				
				area = base * altura;
				
			break;
			
			case 3 :
				
				figura = "tri�ngulo";

				altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida de la altura"));
				base   = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida de la base"));

				area = (base * altura)/2;

			break;
			
			case 4 :
				
				figura = "c�rculo";
			
				System.out.println("Ingrese el radio del c�rculo: ");
				int radio = entrada.nextInt();
				
				radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida del radio"));
				
				area = Math.PI * Math.pow(radio, 2);
			
			break;
			
			default: 
				System.out.println("La opci�n no es correcta. ");
		}
		
		System.out.printf("El �rea del " + figura + " es %1.0f", area);
	}

}
