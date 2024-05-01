
public class Ejemplo_arrays_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado, interes = 0.10;
		double [][] saldo = new double [6][5];
		int i, k;
		
		for (i=0; i<6; i++) {
			
			saldo[i][0] = 10000;
			acumulado = 10000;
			
			for (k=1; k<5; k++) {
				
				acumulado = acumulado + (acumulado * interes);
				
				saldo[i][k] = acumulado;
				
			}
			
			interes = interes + 0.01;
		}
		
		for (i=0; i<6; i++) {
			 System.out.println();
			 
			 for (k=0; k<5; k++) {
				 
				 System.out.printf("%1.2f ", saldo[i][k]);
				 
			 }
		}
		
	}

}
