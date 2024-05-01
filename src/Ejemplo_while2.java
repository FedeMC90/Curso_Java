import java.util.*;
public class Ejemplo_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int aleatorio = (int)(Math.random()*100);
		int num = 101;
		int intentos=0;
		
		while (aleatorio != num) {
			System.out.println("Adivina el n�mero: ");
			num = entrada.nextInt();
			
			intentos++;
			
			if (num < aleatorio) {
				System.out.println("El n�mero es mayor.");
			} 
			else if (num > aleatorio) {
				System.out.println("El n�mero es menor.");
			}
		}
		
		System.out.println("Correcto! Has necesitado " + intentos + " intentos.");
	}

}
