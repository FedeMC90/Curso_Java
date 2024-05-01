import java.util.*;
public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Edad: ");
		
		int edad = entrada.nextInt();
		
		if (edad >= 18) {
			System.out.println("Sos mayor de edad.");
		} else {
			System.out.println("Sos menor de edad.");
		}
	}

}
