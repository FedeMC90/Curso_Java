import java.util.*;
public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre ");
		
		String nombre_usuario = entrada.nextLine();
		
		System.out.println("Introduce edad: ");
		
		int edad_usuario = entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (edad_usuario+1) + 
				" a�os.");
	}

}
